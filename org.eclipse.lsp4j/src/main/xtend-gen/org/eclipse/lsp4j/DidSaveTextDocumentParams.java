/**
 * Copyright (c) 2016 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.lsp4j;

import org.eclipse.lsp4j.TextDocumentIdentifier;
import org.eclipse.lsp4j.generator.JsonRpcData;
import org.eclipse.lsp4j.jsonrpc.validation.NonNull;

/**
 * The document save notification is sent from the client to the server when the document for saved in the clinet.
 */
/* @JsonRpcData */@SuppressWarnings("all")
public class DidSaveTextDocumentParams {
  /**
   * The document that was closed.
   */
  @NonNull
  private TextDocumentIdentifier textDocument;
  
  /**
   * Optional the content when saved. Depends on the includeText value
   * when the save notification was requested.
   */
  private String text;
  
  public DidSaveTextDocumentParams() {
  }
  
  public DidSaveTextDocumentParams(@NonNull final TextDocumentIdentifier textDocument) {
    this.textDocument = textDocument;
  }
  
  public DidSaveTextDocumentParams(@NonNull final TextDocumentIdentifier textDocument, final String text) {
    this(textDocument);
    this.text = text;
  }
}
