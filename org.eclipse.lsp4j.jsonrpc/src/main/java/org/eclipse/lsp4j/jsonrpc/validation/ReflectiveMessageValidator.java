/**
 * Copyright (c) 2016 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.lsp4j.jsonrpc.validation;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.lsp4j.jsonrpc.JsonRpcException;
import org.eclipse.lsp4j.jsonrpc.MessageConsumer;
import org.eclipse.lsp4j.jsonrpc.MessageIssueException;
import org.eclipse.lsp4j.jsonrpc.messages.Message;
import org.eclipse.lsp4j.jsonrpc.messages.MessageIssue;
import org.eclipse.lsp4j.jsonrpc.messages.ResponseErrorCode;

import com.google.gson.JsonElement;

/**
 * Validates messages and forwards them to other message consumers. In case an issue is found,
 * a {@link MessageIssueException} is thrown.
 */
public class ReflectiveMessageValidator implements MessageConsumer {

	private static final Logger LOG = Logger.getLogger(ReflectiveMessageValidator.class.getName());

	private final MessageConsumer delegate;
	
	/**
	 * When created with this constructor, the validator acts as a message sink.
	 */
	public ReflectiveMessageValidator() {
		this.delegate = null;
	}

	/**
	 * Forward messages to the given consumer unless an issue is found.
	 */
	public ReflectiveMessageValidator(MessageConsumer delegate) {
		this.delegate = delegate;
	}

	@Override
	public void consume(Message message) throws MessageIssueException, JsonRpcException {
		List<MessageIssue> result = new ArrayList<>();
		try {
			validate(message, result, new LinkedList<>(), new LinkedList<>());
		} catch (Exception e) {
			LOG.log(Level.SEVERE, "Error during message validation: " + e.getMessage(), e);
			result.add(new MessageIssue("Message validation failed, please check the logs of the remote endpoint.",
					ResponseErrorCode.InvalidParams.getValue()));
		}
		
		if (!result.isEmpty()) {
			// Sort the messages in order to get a stable order (otherwise it depends on the JVM's reflection implementation)
			Collections.sort(result, (issue1, issue2) -> issue1.getText().compareTo(issue2.getText()));
			throw new MessageIssueException(message, result);
		} else if (delegate != null) {
			delegate.consume(message);
		}
	}
	
	/**
	 * Validate all fields of the given object.
	 */
	protected void validate(Object object, List<MessageIssue> issues, Deque<Object> objectStack, Deque<Object> accessorStack) throws Exception {
		if (object == null 
				|| object instanceof Enum<?> 
				|| object instanceof String 
				|| object instanceof Number
				|| object instanceof Boolean
				|| object instanceof JsonElement
				|| object instanceof Throwable) {
			return;
		}
		if (objectStack.contains(object)) {
			issues.add(new MessageIssue("An element of the message has a direct or indirect reference to itself."
					+ " Path: " + createPathString(accessorStack),
					ResponseErrorCode.InvalidParams.getValue()));
			return;
		}
		objectStack.push(object);
		if (object instanceof List<?>) {
			ListIterator<?> iter = ((List<?>) object).listIterator();
			while (iter.hasNext()) {
				accessorStack.push(iter.nextIndex());
				Object element = iter.next();
				if (element == null) {
					issues.add(new MessageIssue("Lists must not contain null references."
							+ " Path: " + createPathString(accessorStack),
							ResponseErrorCode.InvalidParams.getValue()));
				}
				validate(element, issues, objectStack, accessorStack);
				accessorStack.pop();
			}
		} else {
			for (Method method : object.getClass().getMethods()) {
				if (isGetter(method)) {
					accessorStack.push(method);
					Object value = method.invoke(object);
					if (value == null && method.getAnnotation(NonNull.class) != null) {
						issues.add(new MessageIssue("The accessor '" + method.getDeclaringClass().getSimpleName()
								 + "." + method.getName() + "()' must return a non-null value."
								 + " Path: " + createPathString(accessorStack),
								ResponseErrorCode.InvalidParams.getValue()));
					}
					validate(value, issues, objectStack, accessorStack);
					accessorStack.pop();
				}
			}
		}
		objectStack.pop();
	}
	
	protected String createPathString(Deque<Object> accessorStack) {
		StringBuilder result = new StringBuilder("$");
		Iterator<Object> resultIter = accessorStack.descendingIterator();
		while(resultIter.hasNext()) {
			Object accessor = resultIter.next();
			if (accessor instanceof Method)
				result.append('.').append(getPropertyName((Method) accessor));
			else if (accessor instanceof Integer)
				result.append('[').append(accessor).append(']');
			else
				result.append(accessor);
		}
		return result.toString();
	}

	protected boolean isGetter(Method method) {
		return method.getParameterCount() == 0 && method.getName().startsWith("get")
				&& method.getDeclaringClass() != Object.class
				&& Modifier.isPublic(method.getModifiers())
				&& !Modifier.isStatic(method.getModifiers());
	}
	
	protected String getPropertyName(Method method) {
		String methodName = method.getName();
		if (methodName.startsWith("get") && methodName.length() > 3)
			return methodName.substring(3, 4).toLowerCase() + methodName.substring(4);
		else
			return methodName;
	}
	
}
