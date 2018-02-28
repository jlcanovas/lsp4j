package org.eclipse.lsp4j.jsonrpc.messages;

/**
 * Basic class to support CORS and represent its messages
 * 
 */
public class CORSMessage extends IdentifiableMessage {
	/**  
	 * Host that should be allowed for CORS operations
	 */
	public static String HOST = "*";
}
