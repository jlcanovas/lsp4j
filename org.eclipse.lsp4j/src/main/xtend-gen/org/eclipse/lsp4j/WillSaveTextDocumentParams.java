/**
 * Copyright (c) 2016 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.lsp4j;

import org.eclipse.lsp4j.TextDocumentIdentifier;
import org.eclipse.lsp4j.TextDocumentSaveReason;
import org.eclipse.lsp4j.generator.JsonRpcData;
import org.eclipse.lsp4j.jsonrpc.validation.NonNull;

/* @JsonRpcData */@SuppressWarnings("all")
public class WillSaveTextDocumentParams {
  /**
   * The document that will be saved.
   */
  @NonNull
  private TextDocumentIdentifier textDocument;
  
  /**
   * A reason why a text document is saved.
   */
  @NonNull
  private TextDocumentSaveReason reason;
  
  public WillSaveTextDocumentParams() {
  }
  
  public WillSaveTextDocumentParams(@NonNull final TextDocumentIdentifier textDocument, @NonNull final TextDocumentSaveReason reason) {
    this.textDocument = textDocument;
    this.reason = reason;
  }
}
