/*******************************************************************************
 * Copyright (c) 2016 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.lsp4j.jsonrpc.json;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

import org.eclipse.lsp4j.jsonrpc.JsonRpcException;
import org.eclipse.lsp4j.jsonrpc.MessageConsumer;
import org.eclipse.lsp4j.jsonrpc.messages.CORSMessage;
import org.eclipse.lsp4j.jsonrpc.messages.Message;

/**
 * A message consumer that serializes messages to JSON and sends them to an output stream.
 */
public class StreamMessageConsumer implements MessageConsumer, MessageConstants {

	private final String encoding;
	private final MessageJsonHandler jsonHandler;

	private final Object outputLock = new Object();

	private OutputStream output;

	public StreamMessageConsumer(MessageJsonHandler jsonHandler) {
		this(null, StandardCharsets.UTF_8.name(), jsonHandler);
	}

	public StreamMessageConsumer(OutputStream output, MessageJsonHandler jsonHandler) {
		this(output, StandardCharsets.UTF_8.name(), jsonHandler);
	}

	public StreamMessageConsumer(OutputStream output, String encoding, MessageJsonHandler jsonHandler) {
		this.output = output;
		this.encoding = encoding;
		this.jsonHandler = jsonHandler;
	}

	public OutputStream getOutput() {
		return output;
	}

	public void setOutput(OutputStream output) {
		this.output = output;
	}

	@Override
	public void consume(Message message) {
		// Adding support for CORS. 
		if(message instanceof CORSMessage) {
			System.out.println("From StreamMessageConsumer");
			String CORS = "HTTP/1.1 200 OK" + CRLF + 
					"Content-Length: 0" + CRLF + 
					"Connection: keep-alive" + CRLF + 
					"Access-Control-Allow-Origin: " + CORSMessage.HOST + CRLF + 
					"Access-Control-Allow-Methods: POST, GET, OPTIONS, DELETE" + CRLF + 
					"Access-Control-Allow-Headers: Origin, X-Requested-With, Content-Type, Accept" + CRLF + CRLF ;
			byte[] headerBytes = CORS.getBytes(StandardCharsets.US_ASCII);
			try {
				synchronized (outputLock) {
					output.write(headerBytes);
					output.flush();
				}
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		// DONE
		} else {
			try {
				String content = jsonHandler.serialize(message);
				byte[] contentBytes = content.getBytes(encoding);
				int contentLength = contentBytes.length;

				String header = getHeader(contentLength);
				byte[] headerBytes = header.getBytes(StandardCharsets.US_ASCII);

				synchronized (outputLock) {
					output.write(headerBytes);
					output.write(contentBytes);
					output.flush();
				}
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		} 
	}

	/**
	 * Construct a header to be prepended to the actual content. This implementation writes
	 * {@code Content-Length} and {@code Content-Type} attributes according to the LSP specification.
	 */
	protected String getHeader(int contentLength) {
		StringBuilder headerBuilder = new StringBuilder();
		// Adding support for HTTP 
		headerBuilder.append("HTTP/1.1 200 OK").append(CRLF);
		appendHeader(headerBuilder, "Access-Control-Allow-Origin", CORSMessage.HOST).append(CRLF);
		appendHeader(headerBuilder, "Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE").append(CRLF);
		appendHeader(headerBuilder, "Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept").append(CRLF);
		// DONE 
		appendHeader(headerBuilder, CONTENT_LENGTH_HEADER, contentLength).append(CRLF);
		if (!StandardCharsets.UTF_8.name().equals(encoding)) {
			appendHeader(headerBuilder, CONTENT_TYPE_HEADER, JSON_MIME_TYPE);
			headerBuilder.append("; charset=").append(encoding).append(CRLF);
		}
		headerBuilder.append(CRLF);
		return headerBuilder.toString();
	}

	/**
	 * Append a header attribute to the given builder.
	 */
	protected StringBuilder appendHeader(StringBuilder builder, String name, Object value) {
		return builder.append(name).append(": ").append(value);
	}

}
