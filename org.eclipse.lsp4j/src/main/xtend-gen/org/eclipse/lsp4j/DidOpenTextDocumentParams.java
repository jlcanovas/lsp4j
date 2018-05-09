/**
 * Copyright (c) 2016 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.lsp4j;

import org.eclipse.lsp4j.TextDocumentItem;
import org.eclipse.lsp4j.generator.JsonRpcData;
import org.eclipse.lsp4j.jsonrpc.validation.NonNull;

/**
 * The document open notification is sent from the client to the server to signal newly opened text documents.
 * The document's truth is now managed by the client and the server must not try to read the document's truth using
 * the document's uri.
 */
/* @JsonRpcData */@SuppressWarnings("all")
public class DidOpenTextDocumentParams {
  /**
   * The document that was opened.
   */
  @NonNull
  private TextDocumentItem textDocument;
  
  /**
   * Legacy property to support protocol version 1.0 requests.
   */
  @Deprecated
  private String text;
  
  public DidOpenTextDocumentParams() {
  }
  
  public DidOpenTextDocumentParams(@NonNull final TextDocumentItem textDocument) {
    this.textDocument = textDocument;
  }
  
  @Deprecated
  public DidOpenTextDocumentParams(@NonNull final TextDocumentItem textDocument, final String text) {
    this(textDocument);
    this.text = text;
  }
}
