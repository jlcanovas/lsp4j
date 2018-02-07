/*******************************************************************************
 * Copyright (c) 2016 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.lsp4j.jsonrpc.test;

import static org.eclipse.lsp4j.jsonrpc.json.MessageConstants.CONTENT_LENGTH_HEADER;
import static org.eclipse.lsp4j.jsonrpc.json.MessageConstants.CRLF;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.lsp4j.jsonrpc.CompletableFutures;
import org.eclipse.lsp4j.jsonrpc.Launcher;
import org.eclipse.lsp4j.jsonrpc.RemoteEndpoint;
import org.eclipse.lsp4j.jsonrpc.ResponseErrorException;
import org.eclipse.lsp4j.jsonrpc.json.StreamMessageProducer;
import org.eclipse.lsp4j.jsonrpc.services.GenericEndpoint;
import org.eclipse.lsp4j.jsonrpc.services.JsonNotification;
import org.eclipse.lsp4j.jsonrpc.services.JsonRequest;
import org.eclipse.lsp4j.jsonrpc.validation.NonNull;
import org.junit.Assert;
import org.junit.Test;

public class IntegrationTest {
	
	private static final long TIMEOUT = 2000;

	public static class MyParam {
		public MyParam() {}
		
		public MyParam(@NonNull String string) {
			this.value = string;
		}

		@NonNull
		private String value;
		
		@NonNull
		public String getValue() {
			return value;
		}
		
		public void setValue(@NonNull String value) {
			this.value = value;
		}
	}

	public static interface MyServer {
		@JsonRequest
		CompletableFuture<MyParam> askServer(MyParam param);
	}
	
	public static class MyServerImpl implements MyServer {
		@Override
		public CompletableFuture<MyParam> askServer(MyParam param) {
			return CompletableFuture.completedFuture(param);
		}
	};

	public static interface MyClient {
		@JsonRequest
		CompletableFuture<MyParam> askClient(MyParam param);
	}
	
	public static class MyClientImpl implements MyClient {
		@Override
		public CompletableFuture<MyParam> askClient(MyParam param) {
			return CompletableFuture.completedFuture(param);
		}
	};

	@Test
	public void testBothDirectionRequests() throws Exception {
		// create client side
		PipedInputStream in = new PipedInputStream();
		PipedOutputStream out = new PipedOutputStream();
		PipedInputStream in2 = new PipedInputStream();
		PipedOutputStream out2 = new PipedOutputStream();
		
		in.connect(out2);
		out.connect(in2);
		
		MyClient client = new MyClientImpl();
		Launcher<MyServer> clientSideLauncher = Launcher.createLauncher(client, MyServer.class, in, out);
		
		// create server side
		MyServer server = new MyServerImpl();
		Launcher<MyClient> serverSideLauncher = Launcher.createLauncher(server, MyClient.class, in2, out2);
		
		clientSideLauncher.startListening();
		serverSideLauncher.startListening();
		
		CompletableFuture<MyParam> fooFuture = clientSideLauncher.getRemoteProxy().askServer(new MyParam("FOO"));
		CompletableFuture<MyParam> barFuture = serverSideLauncher.getRemoteProxy().askClient(new MyParam("BAR"));
		
		Assert.assertEquals("FOO", fooFuture.get(TIMEOUT, TimeUnit.MILLISECONDS).value);
		Assert.assertEquals("BAR", barFuture.get(TIMEOUT, TimeUnit.MILLISECONDS).value);
	}

	@Test
	public void testResponse1() throws Exception {
		// create client message
		String requestMessage = "{\"jsonrpc\":\"2.0\","
				+ "\"id\":\"42\",\n" 
				+ "\"method\":\"askServer\",\n" 
				+ "\"params\": { value: \"bar\" }\n"
				+ "}";
		String clientMessage = getHeader(requestMessage.getBytes().length) + requestMessage;
		
		// create server side
		ByteArrayInputStream in = new ByteArrayInputStream(clientMessage.getBytes());
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		MyServer server = new MyServerImpl();
		Launcher<MyClient> serverSideLauncher = Launcher.createLauncher(server, MyClient.class, in, out);
		serverSideLauncher.startListening().get(TIMEOUT, TimeUnit.MILLISECONDS);
		
		Assert.assertEquals("Content-Length: 52" + CRLF + CRLF
				+ "{\"jsonrpc\":\"2.0\",\"id\":\"42\",\"result\":{\"value\":\"bar\"}}",
				out.toString());
	}
	
	@Test
	public void testResponse2() throws Exception {
		// create client message
		String requestMessage = "{\"jsonrpc\":\"2.0\","
				+ "\"id\":42,\n" 
				+ "\"method\":\"askServer\",\n" 
				+ "\"params\": { value: \"bar\" }\n"
				+ "}";
		String clientMessage = getHeader(requestMessage.getBytes().length) + requestMessage;
		
		// create server side
		ByteArrayInputStream in = new ByteArrayInputStream(clientMessage.getBytes());
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		MyServer server = new MyServerImpl();
		Launcher<MyClient> serverSideLauncher = Launcher.createLauncher(server, MyClient.class, in, out);
		serverSideLauncher.startListening().get(TIMEOUT, TimeUnit.MILLISECONDS);
		
		Assert.assertEquals("Content-Length: 50" + CRLF + CRLF
				+ "{\"jsonrpc\":\"2.0\",\"id\":42,\"result\":{\"value\":\"bar\"}}",
				out.toString());
	}

	@Test
	public void testCancellation() throws Exception {
		// create client side
		PipedInputStream in = new PipedInputStream();
		PipedOutputStream out = new PipedOutputStream();
		PipedInputStream in2 = new PipedInputStream();
		PipedOutputStream out2 = new PipedOutputStream();
		
		in.connect(out2);
		out.connect(in2);

		boolean[] inComputeAsync = new boolean[1];
		boolean[] cancellationHappened = new boolean[1];
		
		MyClient client = new MyClient() {
			@Override
			public CompletableFuture<MyParam> askClient(MyParam param) {
				return CompletableFutures.computeAsync(cancelToken -> {
					try {
						long startTime = System.currentTimeMillis();
						inComputeAsync[0] = true;
						do {
							cancelToken.checkCanceled();
							Thread.sleep(50);
						} while (System.currentTimeMillis() - startTime < TIMEOUT);
					} catch (CancellationException e) {
						cancellationHappened[0] = true;
					} catch (InterruptedException e) {
						Assert.fail("Thread was interrupted unexpectedly.");
					}
					return param;
				});
			}
		};
		Launcher<MyServer> clientSideLauncher = Launcher.createLauncher(client, MyServer.class, in, out);
		
		// create server side
		MyServer server = new MyServerImpl();
		Launcher<MyClient> serverSideLauncher = Launcher.createLauncher(server, MyClient.class, in2, out2);
		
		clientSideLauncher.startListening();
		serverSideLauncher.startListening();
		
		CompletableFuture<MyParam> future = serverSideLauncher.getRemoteProxy().askClient(new MyParam("FOO"));

		long startTime = System.currentTimeMillis();
		while (!inComputeAsync[0]) {
			Thread.sleep(50);
			if (System.currentTimeMillis() - startTime > TIMEOUT)
				Assert.fail("Timeout waiting for client to start computing.");
		}
		future.cancel(true);

		startTime = System.currentTimeMillis();
		while (!cancellationHappened[0]) {
			Thread.sleep(50);
			if (System.currentTimeMillis() - startTime > TIMEOUT)
				Assert.fail("Timeout waiting for confirmation of cancellation.");
		}
		try {
			future.get(TIMEOUT, TimeUnit.MILLISECONDS);
			Assert.fail("Expected cancellation.");
		} catch (CancellationException e) {
		}
	}
	
	@Test
	public void testCancellationResponse() throws Exception {
		// create client messages
		String requestMessage = "{\"jsonrpc\":\"2.0\","
				+ "\"id\":\"1\",\n" 
				+ "\"method\":\"askServer\",\n" 
				+ "\"params\": { value: \"bar\" }\n"
				+ "}";
		String cancellationMessage = "{\"jsonrpc\":\"2.0\","
				+ "\"method\":\"$/cancelRequest\",\n" 
				+ "\"params\": { id: 1 }\n"
				+ "}";
		String clientMessages = getHeader(requestMessage.getBytes().length) + requestMessage
				+ getHeader(cancellationMessage.getBytes().length) + cancellationMessage;
		
		// create server side
		ByteArrayInputStream in = new ByteArrayInputStream(clientMessages.getBytes());
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		MyServer server = new MyServer() {
			@Override
			public CompletableFuture<MyParam> askServer(MyParam param) {
				return CompletableFutures.computeAsync(cancelToken -> {
					try {
						long startTime = System.currentTimeMillis();
						do {
							cancelToken.checkCanceled();
							Thread.sleep(50);
						} while (System.currentTimeMillis() - startTime < TIMEOUT);
					} catch (InterruptedException e) {
						Assert.fail("Thread was interrupted unexpectedly.");
					}
					return param;
				});
			}
		};
		Launcher<MyClient> serverSideLauncher = Launcher.createLauncher(server, MyClient.class, in, out);
		serverSideLauncher.startListening().get(TIMEOUT, TimeUnit.MILLISECONDS);
		
		Assert.assertEquals("Content-Length: 132" + CRLF + CRLF
				+ "{\"jsonrpc\":\"2.0\",\"id\":\"1\",\"error\":{\"code\":-32800,\"message\":\"The request (id: 1, method: \\u0027askServer\\u0027) has been cancelled\"}}",
				out.toString());
	}
	
	
	@Test
	public void testVersatility() throws Exception {
		Logger.getLogger(RemoteEndpoint.class.getName()).setLevel(Level.OFF);
		// create client side
		PipedInputStream in = new PipedInputStream();
		PipedOutputStream out = new PipedOutputStream();
		PipedInputStream in2 = new PipedInputStream();
		PipedOutputStream out2 = new PipedOutputStream();
		
		in.connect(out2);
		out.connect(in2);
		
		MyClient client = new MyClient() {
			private int tries = 0;
			
			@Override
			public CompletableFuture<MyParam> askClient(MyParam param) {
				if (tries == 0) {
					tries++;
					throw new UnsupportedOperationException();
				}
				return CompletableFutures.computeAsync(cancelToken -> {
					if (tries++ == 1)
						throw new UnsupportedOperationException();
					return param;
				});
			}
		};
		Launcher<MyServer> clientSideLauncher = Launcher.createLauncher(client, MyServer.class, in, out);
		
		// create server side
		MyServer server = new MyServerImpl();
		Launcher<MyClient> serverSideLauncher = Launcher.createLauncher(server, MyClient.class, in2, out2);
		
		clientSideLauncher.startListening();
		serverSideLauncher.startListening();
		
		CompletableFuture<MyParam> errorFuture1 = serverSideLauncher.getRemoteProxy().askClient(new MyParam("FOO"));
		try {
			System.out.println(errorFuture1.get());
			Assert.fail();
		} catch (ExecutionException e) {
			Assert.assertNotNull(((ResponseErrorException)e.getCause()).getResponseError().getMessage());
		}
		CompletableFuture<MyParam> errorFuture2 = serverSideLauncher.getRemoteProxy().askClient(new MyParam("FOO"));
		try {
			errorFuture2.get();
			Assert.fail();
		} catch (ExecutionException e) {
			Assert.assertNotNull(((ResponseErrorException)e.getCause()).getResponseError().getMessage());
		}
		CompletableFuture<MyParam> goodFuture = serverSideLauncher.getRemoteProxy().askClient(new MyParam("FOO"));
		Assert.assertEquals("FOO", goodFuture.get().value);
	}

	@Test
	public void testUnknownMessages() throws Exception {
		// intercept log messages
		LogMessageAccumulator logMessages = new LogMessageAccumulator();
		try {
			logMessages.registerTo(GenericEndpoint.class);
			
			// create client messages
			String clientMessage1 = "{\"jsonrpc\":\"2.0\","
					+ "\"method\":\"foo1\",\n" 
					+ " \"params\":\"bar\"\n"
					+ "}";
			String clientMessage2 = "{\"jsonrpc\":\"2.0\","
					+ "\"id\":\"1\",\n" 
					+ "\"method\":\"foo2\",\n" 
					+ " \"params\":\"bar\"\n"
					+ "}";
			String clientMessages = getHeader(clientMessage1.getBytes().length) + clientMessage1
					+ getHeader(clientMessage2.getBytes().length) + clientMessage2;
			
			// create server side
			ByteArrayInputStream in = new ByteArrayInputStream(clientMessages.getBytes());
			ByteArrayOutputStream out = new ByteArrayOutputStream();
			MyServer server = new MyServerImpl();
			Launcher<MyClient> serverSideLauncher = Launcher.createLauncher(server, MyClient.class, in, out);
			serverSideLauncher.startListening();
			
			logMessages.await(Level.WARNING, "Unsupported notification method: foo1");
			logMessages.await(Level.WARNING, "Unsupported request method: foo2");
			
			Assert.assertEquals("Content-Length: 95" + CRLF + CRLF
					+ "{\"jsonrpc\":\"2.0\",\"id\":\"1\",\"error\":{\"code\":-32601,\"message\":\"Unsupported request method: foo2\"}}",
					out.toString());
		} finally {
			logMessages.unregister();
		}
	}
	
	@Test
	public void testUnknownOptionalMessages() throws Exception {
		// intercept log messages
		LogMessageAccumulator logMessages = new LogMessageAccumulator();
		try {
			logMessages.registerTo(GenericEndpoint.class);
			
			// create client messages
			String clientMessage1 = "{\"jsonrpc\":\"2.0\","
					+ "\"method\":\"$/foo1\",\n" 
					+ " \"params\":\"bar\"\n"
					+ "}";
			String clientMessage2 = "{\"jsonrpc\":\"2.0\","
					+ "\"id\":\"1\",\n" 
					+ "\"method\":\"$/foo2\",\n" 
					+ " \"params\":\"bar\"\n"
					+ "}";
			String clientMessages = getHeader(clientMessage1.getBytes().length) + clientMessage1
					+ getHeader(clientMessage2.getBytes().length) + clientMessage2;
			
			// create server side
			ByteArrayInputStream in = new ByteArrayInputStream(clientMessages.getBytes());
			ByteArrayOutputStream out = new ByteArrayOutputStream();
			MyServer server = new MyServerImpl();
			Launcher<MyClient> serverSideLauncher = Launcher.createLauncher(server, MyClient.class, in, out);
			serverSideLauncher.startListening();
			
			logMessages.await(Level.INFO, "Unsupported notification method: $/foo1");
			logMessages.await(Level.INFO, "Unsupported request method: $/foo2");
			
			Assert.assertEquals("Content-Length: 40" + CRLF + CRLF
					+ "{\"jsonrpc\":\"2.0\",\"id\":\"1\",\"result\":null}",
					out.toString());
		} finally {
			logMessages.unregister();
		}
	}
	
	public static interface UnexpectedParamsTestServer {
		@JsonNotification
		void myNotification();
	}
	
	@Test
	public void testUnexpectedParams() throws Exception {
		// intercept log messages
		LogMessageAccumulator logMessages = new LogMessageAccumulator();
		try {
			logMessages.registerTo(GenericEndpoint.class);
			
			// create client messages
			String notificationMessage = "{\"jsonrpc\":\"2.0\","
					+ "\"method\":\"myNotification\",\n" 
					+ "\"params\": { \"value\": \"foo\" }\n"
					+ "}";
			String clientMessages = getHeader(notificationMessage.getBytes().length) + notificationMessage;
			
			// create server side
			ByteArrayInputStream in = new ByteArrayInputStream(clientMessages.getBytes());
			ByteArrayOutputStream out = new ByteArrayOutputStream();
			UnexpectedParamsTestServer server = new UnexpectedParamsTestServer() {
				public void myNotification() {
				}
			};
			Launcher<MyClient> serverSideLauncher = Launcher.createLauncher(server, MyClient.class, in, out);
			serverSideLauncher.startListening();
			
			logMessages.await(Level.WARNING, "Unexpected params '{\"value\":\"foo\"}' for "
					+ "'public abstract void org.eclipse.lsp4j.jsonrpc.test.IntegrationTest$UnexpectedParamsTestServer.myNotification()' is ignored");
		} finally {
			logMessages.unregister();
		}
	}
	
	@Test
	public void testMalformedJson1() throws Exception {
		String requestMessage1 = "{\"jsonrpc\":\"2.0\","
				+ "\"id\":\"1\",\n" 
				+ "\"method\":\"askServer\",\n" 
				+ "\"params\": { value: }\n"
				+ "}";
		String requestMessage2 = "{\"jsonrpc\":\"2.0\","
				+ "\"id\":\"2\",\n" 
				+ "\"method\":\"askServer\",\n" 
				+ "\"params\": { value: \"bar\" }\n"
				+ "}";
		String clientMessages = getHeader(requestMessage1.getBytes().length) + requestMessage1
				+ getHeader(requestMessage2.getBytes().length) + requestMessage2;
		
		ByteArrayInputStream in = new ByteArrayInputStream(clientMessages.getBytes());
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		MyServer server = new MyServerImpl();
		Launcher<MyClient> serverSideLauncher = Launcher.createLauncher(server, MyClient.class, in, out);
		serverSideLauncher.startListening().get(TIMEOUT, TimeUnit.MILLISECONDS);
		
		Assert.assertEquals("Content-Length: 202" + CRLF + CRLF
				+ "{\"jsonrpc\":\"2.0\",\"id\":\"1\",\"error\":{\"code\":-32700,\"message\":\"Message could not be parsed.\","
				+    "\"data\":\"com.google.gson.stream.MalformedJsonException: Expected value at line 3 column 20 path $.params.value\"}}"
				+ "Content-Length: 51" + CRLF + CRLF
				+ "{\"jsonrpc\":\"2.0\",\"id\":\"2\",\"result\":{\"value\":\"bar\"}}",
				out.toString());
	}
	
	@Test
	public void testMalformedJson2() throws Exception {
		// intercept log messages
		LogMessageAccumulator logMessages = new LogMessageAccumulator();
		try {
			logMessages.registerTo(StreamMessageProducer.class);
			
			String requestMessage1 = "{\"jsonrpc\":\"2.0\","
					+ "\"id\":\"1\",\n" 
					+ "\"params\": { value: }\n"
					+ "\"method\":\"askServer\",\n" 
					+ "}";
			String requestMessage2 = "{\"jsonrpc\":\"2.0\","
					+ "\"id\":\"2\",\n" 
					+ "\"method\":\"askServer\",\n" 
					+ "\"params\": { value: \"bar\" }\n"
					+ "}";
			String clientMessages = getHeader(requestMessage1.getBytes().length) + requestMessage1
					+ getHeader(requestMessage2.getBytes().length) + requestMessage2;
			
			ByteArrayInputStream in = new ByteArrayInputStream(clientMessages.getBytes());
			ByteArrayOutputStream out = new ByteArrayOutputStream();
			MyServer server = new MyServerImpl();
			Launcher<MyClient> serverSideLauncher = Launcher.createLauncher(server, MyClient.class, in, out);
			serverSideLauncher.startListening();
			
			logMessages.await(Level.SEVERE, "com.google.gson.stream.MalformedJsonException: Expected value at line 2 column 20 path $.params.value");
			Assert.assertEquals("Content-Length: 51" + CRLF + CRLF
					+ "{\"jsonrpc\":\"2.0\",\"id\":\"2\",\"result\":{\"value\":\"bar\"}}",
					out.toString());
		} finally {
			logMessages.unregister();
		}
	}
	
	@Test
	public void testMalformedJson3() throws Exception {
		String requestMessage1 = "{\"jsonrpc\":\"2.0\","
				+ "\"id\":\"1\",\n" 
				+ "\"method\":\"askServer\",\n" 
				+ "\"params\": { value: \"bar\" }\n"
				+ "]";
		String requestMessage2 = "{\"jsonrpc\":\"2.0\","
				+ "\"id\":\"2\",\n" 
				+ "\"method\":\"askServer\",\n" 
				+ "\"params\": { value: \"bar\" }\n"
				+ "}";
		String clientMessages = getHeader(requestMessage1.getBytes().length) + requestMessage1
				+ getHeader(requestMessage2.getBytes().length) + requestMessage2;
		
		ByteArrayInputStream in = new ByteArrayInputStream(clientMessages.getBytes());
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		MyServer server = new MyServerImpl();
		Launcher<MyClient> serverSideLauncher = Launcher.createLauncher(server, MyClient.class, in, out);
		serverSideLauncher.startListening().get(TIMEOUT, TimeUnit.MILLISECONDS);
		
		Assert.assertEquals("Content-Length: 153" + CRLF + CRLF
				+ "{\"jsonrpc\":\"2.0\",\"id\":\"1\",\"error\":{\"code\":-32700,"
				+    "\"message\":\"Message could not be parsed.\",\"data\":\"Unterminated object at line 4 column 2 path $.params\"}}"
				+ "Content-Length: 51" + CRLF + CRLF
				+ "{\"jsonrpc\":\"2.0\",\"id\":\"2\",\"result\":{\"value\":\"bar\"}}",
				out.toString());
	}
	
	@Test
	public void testMalformedJson4() throws Exception {
		String requestMessage1 = "{\"jsonrpc\":\"2.0\","
				+ "\"id\":\"1\",\n" 
				+ "\"method\":\"askServer\",\n" 
				+ "\"params\": { value: \"bar\" }\n"
				+ "}}";
		String requestMessage2 = "{\"jsonrpc\":\"2.0\","
				+ "\"id\":\"2\",\n" 
				+ "\"method\":\"askServer\",\n" 
				+ "\"params\": { value: \"bar\" }\n"
				+ "}";
		String clientMessages = getHeader(requestMessage1.getBytes().length) + requestMessage1
				+ getHeader(requestMessage2.getBytes().length) + requestMessage2;
		
		ByteArrayInputStream in = new ByteArrayInputStream(clientMessages.getBytes());
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		MyServer server = new MyServerImpl();
		Launcher<MyClient> serverSideLauncher = Launcher.createLauncher(server, MyClient.class, in, out);
		serverSideLauncher.startListening().get(TIMEOUT, TimeUnit.MILLISECONDS);
		
		Assert.assertEquals("Content-Length: 183" + CRLF + CRLF
				+ "{\"jsonrpc\":\"2.0\",\"id\":\"1\",\"error\":{\"code\":-32700,"
				+    "\"message\":\"Message could not be parsed.\",\"data\":\"Use JsonReader.setLenient(true) to accept malformed JSON at line 4 column 3 path $\"}}"
				+ "Content-Length: 51" + CRLF + CRLF
				+ "{\"jsonrpc\":\"2.0\",\"id\":\"2\",\"result\":{\"value\":\"bar\"}}",
				out.toString());
	}
	
	@Test
	public void testValidationIssue() throws Exception {
		String requestMessage1 = "{\"jsonrpc\":\"2.0\","
				+ "\"id\":\"1\",\n" 
				+ "\"method\":\"askServer\",\n" 
				+ "\"params\": { value: null }\n"
				+ "}";
		String requestMessage2 = "{\"jsonrpc\":\"2.0\","
				+ "\"id\":\"2\",\n" 
				+ "\"method\":\"askServer\",\n" 
				+ "\"params\": { value: \"bar\" }\n"
				+ "}";
		String clientMessages = getHeader(requestMessage1.getBytes().length) + requestMessage1
				+ getHeader(requestMessage2.getBytes().length) + requestMessage2;
		
		ByteArrayInputStream in = new ByteArrayInputStream(clientMessages.getBytes());
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		MyServer server = new MyServerImpl();
		Launcher<MyClient> serverSideLauncher = Launcher.createLauncher(server, MyClient.class, in, out, true, null);
		serverSideLauncher.startListening().get(TIMEOUT, TimeUnit.MILLISECONDS);
		
		Assert.assertEquals("Content-Length: 136" + CRLF + CRLF
				+ "{\"jsonrpc\":\"2.0\",\"id\":\"1\",\"error\":{\"code\":-32602,\"message\":\"The accessor \\u0027MyParam.getValue()\\u0027 must return a non-null value.\"}}"
				+ "Content-Length: 51" + CRLF + CRLF
				+ "{\"jsonrpc\":\"2.0\",\"id\":\"2\",\"result\":{\"value\":\"bar\"}}",
				out.toString());
	}

	protected String getHeader(int contentLength) {
		StringBuilder headerBuilder = new StringBuilder();
		headerBuilder.append(CONTENT_LENGTH_HEADER).append(": ").append(contentLength).append(CRLF);
		headerBuilder.append(CRLF);
		return headerBuilder.toString();
	}

}
