/**
 * Copyright (c) 2016 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.lsp4j;

import org.eclipse.lsp4j.FormattingOptions;
import org.eclipse.lsp4j.TextDocumentIdentifier;
import org.eclipse.lsp4j.generator.JsonRpcData;
import org.eclipse.lsp4j.jsonrpc.validation.NonNull;

/**
 * The document formatting request is sent from the server to the client to format a whole document.
 */
/* @JsonRpcData */@SuppressWarnings("all")
public class DocumentFormattingParams {
  /**
   * The document to format.
   */
  @NonNull
  private TextDocumentIdentifier textDocument;
  
  /**
   * The format options
   */
  @NonNull
  private FormattingOptions options;
  
  public DocumentFormattingParams() {
  }
  
  public DocumentFormattingParams(@NonNull final TextDocumentIdentifier textDocument, @NonNull final FormattingOptions options) {
    this.textDocument = textDocument;
    this.options = options;
  }
}
