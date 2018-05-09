/**
 * Copyright (c) 2016 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.lsp4j.test.services;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.lsp4j.CodeLens;
import org.eclipse.lsp4j.jsonrpc.json.JsonRpcMethod;
import org.eclipse.lsp4j.jsonrpc.json.MessageJsonHandler;
import org.eclipse.lsp4j.jsonrpc.json.MethodProvider;
import org.eclipse.lsp4j.jsonrpc.messages.Message;
import org.eclipse.lsp4j.jsonrpc.messages.MessageIssue;
import org.eclipse.lsp4j.jsonrpc.messages.NotificationMessage;
import org.eclipse.lsp4j.jsonrpc.messages.ResponseError;
import org.eclipse.lsp4j.jsonrpc.messages.ResponseErrorCode;
import org.eclipse.lsp4j.jsonrpc.messages.ResponseMessage;
import org.eclipse.lsp4j.jsonrpc.services.ServiceEndpoints;
import org.eclipse.lsp4j.services.LanguageClient;
import org.eclipse.lsp4j.services.LanguageServer;
import org.eclipse.lsp4j.test.services.MessageMethods;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Pair;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

@SuppressWarnings("all")
public class JsonParseTest {
  private MessageJsonHandler jsonHandler;
  
  @Before
  public void setup() {
    final Map<String, JsonRpcMethod> methods = ServiceEndpoints.getSupportedMethods(LanguageServer.class);
    final Map<String, JsonRpcMethod> clientMethods = ServiceEndpoints.getSupportedMethods(LanguageClient.class);
    final HashMap<String, JsonRpcMethod> all = new HashMap<String, JsonRpcMethod>();
    all.putAll(methods);
    all.putAll(clientMethods);
    MessageJsonHandler _messageJsonHandler = new MessageJsonHandler(all);
    this.jsonHandler = _messageJsonHandler;
  }
  
  private void assertParse(final CharSequence json, final Message expected) {
    Assert.assertEquals(expected.toString(), this.jsonHandler.parseMessage(json).toString());
  }
  
  @Test
  public void testCompletion() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field textDocument is not visible"
      + "\nThe field uri is not visible"
      + "\nThe field position is not visible"
      + "\nThe field line is not visible"
      + "\nThe field character is not visible");
  }
  
  @Test
  public void testDidChange() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field textDocument is not visible"
      + "\nThe field uri is not visible"
      + "\nThe field version is not visible"
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
  public void testResponseError() {
    final MethodProvider _function = (String id) -> {
      String _switchResult = null;
      if (id != null) {
        switch (id) {
          case "12":
            _switchResult = "textDocument/rename";
            break;
        }
      }
      return _switchResult;
    };
    this.jsonHandler.setMethodProvider(_function);
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\"jsonrpc\": \"2.0\",");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\"id\": \"12\",");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\"error\": {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\"code\": -32600,");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\"message\": \"Could not parse request.\"");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    ResponseMessage _responseMessage = new ResponseMessage();
    final Procedure1<ResponseMessage> _function_1 = (ResponseMessage it) -> {
      it.setJsonrpc("2.0");
      it.setId("12");
      ResponseError _responseError = new ResponseError();
      final Procedure1<ResponseError> _function_2 = (ResponseError it_1) -> {
        it_1.setCode(ResponseErrorCode.InvalidRequest);
        it_1.setMessage("Could not parse request.");
      };
      ResponseError _doubleArrow = ObjectExtensions.<ResponseError>operator_doubleArrow(_responseError, _function_2);
      it.setError(_doubleArrow);
    };
    ResponseMessage _doubleArrow = ObjectExtensions.<ResponseMessage>operator_doubleArrow(_responseMessage, _function_1);
    this.assertParse(_builder, _doubleArrow);
  }
  
  @Test
  public void testTelemetry() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\"jsonrpc\": \"2.0\",");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\"method\": \"telemetry/event\",");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\"params\": {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\"foo\": 12.3,");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\"bar\": \"qwertz\"");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    NotificationMessage _notificationMessage = new NotificationMessage();
    final Procedure1<NotificationMessage> _function = (NotificationMessage it) -> {
      it.setJsonrpc("2.0");
      it.setMethod(MessageMethods.TELEMETRY_EVENT);
      Pair<String, Double> _mappedTo = Pair.<String, Double>of("foo", Double.valueOf(12.3));
      Pair<String, String> _mappedTo_1 = Pair.<String, String>of("bar", "qwertz");
      it.setParams(CollectionLiterals.<String, Object>newLinkedHashMap(_mappedTo, _mappedTo_1));
    };
    NotificationMessage _doubleArrow = ObjectExtensions.<NotificationMessage>operator_doubleArrow(_notificationMessage, _function);
    this.assertParse(_builder, _doubleArrow);
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
  public void testHoverResponse3() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field contents is not visible"
      + "\nType mismatch: cannot convert from ArrayList<Either<String, Object>> to Either<List<Either<String, MarkedString>>, MarkupContent>");
  }
  
  @Test
  public void testHoverResponse4() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field contents is not visible"
      + "\nThe field language is not visible"
      + "\nThe field value is not visible"
      + "\nType mismatch: cannot convert from ArrayList<Either<Object, MarkedString>> to Either<List<Either<String, MarkedString>>, MarkupContent>");
  }
  
  @Test
  public void testCodeLensResponse() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\"jsonrpc\": \"2.0\",");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\"id\": \"12\",");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\"result\": {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\"range\": {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("\"start\": {");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("\"character\": 32,");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("\"line\": 3");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("},");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("\"end\": {");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("\"character\": 35,");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("\"line\": 3");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("},");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\"command\": {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("\"title\": \"save\",");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("\"command\": \"saveCommand\",");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("\"arguments\": [");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("\"uri\": \"file:/foo\",");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("\"version\": 5");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("]");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("},");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\"data\": [");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("42,");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("\"qwert\",");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("\"key\": \"value\"");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("]");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    final String json = _builder.toString();
    final MethodProvider _function = (String id) -> {
      String _switchResult = null;
      if (id != null) {
        switch (id) {
          case "12":
            _switchResult = MessageMethods.DOC_CODE_LENS;
            break;
        }
      }
      return _switchResult;
    };
    this.jsonHandler.setMethodProvider(_function);
    final Message message = this.jsonHandler.parseMessage(json);
    Assert.assertTrue("Expected a ResponseMessage", (message instanceof ResponseMessage));
    final ResponseMessage response = ((ResponseMessage) message);
    Object _result = response.getResult();
    Assert.assertTrue("Expected a Collection in result", (_result instanceof Collection<?>));
    Object _result_1 = response.getResult();
    final Collection<?> result = ((Collection<?>) _result_1);
    Object _head = IterableExtensions.head(result);
    Assert.assertTrue("Expected a CodeLens in result[0]", (_head instanceof CodeLens));
    Object _head_1 = IterableExtensions.head(result);
    final CodeLens codeLens = ((CodeLens) _head_1);
    Assert.assertNotNull(codeLens.getCommand());
    final Object argument = IterableExtensions.<Object>head(codeLens.getCommand().getArguments());
    Assert.assertTrue("Expected a JsonObject in command.arguments[0]", (argument instanceof JsonObject));
    Assert.assertEquals("file:/foo", ((JsonObject) argument).get("uri").getAsString());
    Assert.assertEquals(5, ((JsonObject) argument).get("version").getAsInt());
    Object _data = codeLens.getData();
    Assert.assertTrue("Expected a JsonArray in data", (_data instanceof JsonArray));
    Object _data_1 = codeLens.getData();
    final JsonArray data = ((JsonArray) _data_1);
    Assert.assertEquals(42, data.get(0).getAsInt());
    Assert.assertEquals("qwert", data.get(1).getAsString());
    JsonElement _get = data.get(2);
    Assert.assertTrue("Expected a JsonObject in data[2]", (_get instanceof JsonObject));
    JsonElement _get_1 = data.get(2);
    Assert.assertEquals("value", ((JsonObject) _get_1).get("key").getAsString());
  }
  
  @Test
  public void testDocumentFormatting() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field textDocument is not visible"
      + "\nThe field options is not visible"
      + "\nThe field options is not visible");
  }
  
  @Test
  public void testMessageIssue() {
    Gson _gson = this.jsonHandler.getGson();
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\"text\": \"Howdy!\",");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\"code\": 1234,");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\"cause\": {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\"message\": \"Foo\",");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\"cause\": {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("\"message\": \"Bar\"");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    final MessageIssue issue = _gson.<MessageIssue>fromJson(_builder.toString(), MessageIssue.class);
    Assert.assertEquals("Howdy!", issue.getText());
    Assert.assertEquals(1234, issue.getIssueCode());
    Assert.assertEquals("Foo", issue.getCause().getMessage());
    Assert.assertEquals("Bar", issue.getCause().getCause().getMessage());
  }
  
  @Test
  public void testInitialize() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field rootUri is not visible");
  }
  
  @Test
  public void testInitializeClientCapabilities() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field rootUri is not visible"
      + "\nThe field capabilities is not visible");
  }
}
