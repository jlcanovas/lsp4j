/**
 * Copyright (c) 2016 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.lsp4j.test.services;

import com.google.gson.GsonBuilder;
import java.util.Map;
import java.util.function.Consumer;
import org.eclipse.lsp4j.jsonrpc.json.JsonRpcMethod;
import org.eclipse.lsp4j.jsonrpc.json.MessageJsonHandler;
import org.eclipse.lsp4j.jsonrpc.messages.Message;
import org.eclipse.lsp4j.jsonrpc.messages.NotificationMessage;
import org.eclipse.lsp4j.jsonrpc.messages.ResponseError;
import org.eclipse.lsp4j.jsonrpc.messages.ResponseErrorCode;
import org.eclipse.lsp4j.jsonrpc.messages.ResponseMessage;
import org.eclipse.lsp4j.jsonrpc.services.ServiceEndpoints;
import org.eclipse.lsp4j.services.LanguageServer;
import org.eclipse.lsp4j.test.services.LineEndings;
import org.eclipse.lsp4j.test.services.MessageMethods;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

@SuppressWarnings("all")
public class JsonSerializeTest {
  private static class TestObject {
    double foo = 12.3;
    
    String bar = "qwertz";
  }
  
  private MessageJsonHandler jsonHandler;
  
  @Before
  public void setup() {
    final Map<String, JsonRpcMethod> methods = ServiceEndpoints.getSupportedMethods(LanguageServer.class);
    final Consumer<GsonBuilder> _function = (GsonBuilder it) -> {
      it.setPrettyPrinting();
    };
    MessageJsonHandler _messageJsonHandler = new MessageJsonHandler(methods, _function);
    this.jsonHandler = _messageJsonHandler;
  }
  
  private void assertSerialize(final Message message, final CharSequence expected) {
    Assert.assertEquals(expected.toString().trim(), LineEndings.toSystemLineEndings(this.jsonHandler.serialize(message)));
  }
  
  @Test
  public void testCompletion() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field textDocument is not visible"
      + "\nThe field position is not visible");
  }
  
  @Test
  public void testInit() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field rootUri is not visible");
  }
  
  @Test
  public void testInitClientCapabilities() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field rootUri is not visible"
      + "\nThe field capabilities is not visible");
  }
  
  @Test
  public void testInitResponse() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field capabilities is not visible");
  }
  
  @Test
  public void testDidChange() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field textDocument is not visible"
      + "\nThe field uri is not visible"
      + "\nThe field contentChanges is not visible"
      + "\nThe field range is not visible"
      + "\nThe field start is not visible"
      + "\nThe field end is not visible"
      + "\nThe field rangeLength is not visible"
      + "\nThe field text is not visible");
  }
  
  @Test
  public void testPublishDiagnostics() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field uri is not visible"
      + "\nThe field diagnostics is not visible"
      + "\nThe field range is not visible"
      + "\nThe field start is not visible"
      + "\nThe field end is not visible"
      + "\nThe field severity is not visible"
      + "\nThe field message is not visible");
  }
  
  @Test
  public void testRenameResponse() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field changes is not visible"
      + "\nThe field range is not visible"
      + "\nThe field start is not visible"
      + "\nThe field end is not visible"
      + "\nThe field newText is not visible"
      + "\nThe field range is not visible"
      + "\nThe field start is not visible"
      + "\nThe field end is not visible"
      + "\nThe field newText is not visible");
  }
  
  @Test
  public void testHoverResponse1() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field range is not visible"
      + "\nThe field start is not visible"
      + "\nThe field end is not visible"
      + "\nThe field contents is not visible"
      + "\nType mismatch: cannot convert from ArrayList<Either<String, Object>> to Either<List<Either<String, MarkedString>>, MarkupContent>");
  }
  
  @Test
  public void testHoverResponse2() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field contents is not visible"
      + "\nThe field kind is not visible"
      + "\nThe field value is not visible"
      + "\nType mismatch: cannot convert from MarkupContent to Either<List<Either<String, MarkedString>>, MarkupContent>");
  }
  
  @Test
  public void testCodeLensResponse() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field start is not visible"
      + "\nThe field end is not visible");
  }
  
  @Test
  public void testResponseError() {
    ResponseMessage _responseMessage = new ResponseMessage();
    final Procedure1<ResponseMessage> _function = (ResponseMessage it) -> {
      it.setJsonrpc("2.0");
      it.setId("12");
      ResponseError _responseError = new ResponseError();
      final Procedure1<ResponseError> _function_1 = (ResponseError it_1) -> {
        it_1.setCode(ResponseErrorCode.InvalidRequest);
        it_1.setMessage("Could not parse request.");
      };
      ResponseError _doubleArrow = ObjectExtensions.<ResponseError>operator_doubleArrow(_responseError, _function_1);
      it.setError(_doubleArrow);
    };
    final ResponseMessage message = ObjectExtensions.<ResponseMessage>operator_doubleArrow(_responseMessage, _function);
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("{");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("\"jsonrpc\": \"2.0\",");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("\"id\": \"12\",");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("\"error\": {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("\"code\": -32600,");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("\"message\": \"Could not parse request.\"");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    this.assertSerialize(message, _builder);
  }
  
  @Test
  public void testCompletionResponse() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field isIncomplete is not visible"
      + "\nThe field items is not visible");
  }
  
  @Test
  public void testDocumentFormatting() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field textDocument is not visible"
      + "\nThe field options is not visible"
      + "\nThe field options is not visible");
  }
  
  @Test
  public void testTelemetry() {
    NotificationMessage _notificationMessage = new NotificationMessage();
    final Procedure1<NotificationMessage> _function = (NotificationMessage it) -> {
      it.setJsonrpc("2.0");
      it.setMethod(MessageMethods.TELEMETRY_EVENT);
      JsonSerializeTest.TestObject _testObject = new JsonSerializeTest.TestObject();
      it.setParams(_testObject);
    };
    final NotificationMessage message = ObjectExtensions.<NotificationMessage>operator_doubleArrow(_notificationMessage, _function);
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("{");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("\"jsonrpc\": \"2.0\",");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("\"method\": \"telemetry/event\",");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("\"params\": {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("\"foo\": 12.3,");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("\"bar\": \"qwertz\"");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    this.assertSerialize(message, _builder);
  }
  
  @Test
  public void testNullResponse() {
    ResponseMessage _responseMessage = new ResponseMessage();
    final Procedure1<ResponseMessage> _function = (ResponseMessage it) -> {
      it.setJsonrpc("2.0");
      it.setId("12");
    };
    final ResponseMessage message = ObjectExtensions.<ResponseMessage>operator_doubleArrow(_responseMessage, _function);
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("{");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("\"jsonrpc\": \"2.0\",");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("\"id\": \"12\",");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("\"result\": null");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    this.assertSerialize(message, _builder);
  }
}
