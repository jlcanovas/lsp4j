/**
 * Copyright (c) 2016 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.lsp4j;

import org.eclipse.lsp4j.Position;
import org.eclipse.lsp4j.TextDocumentIdentifier;
import org.eclipse.lsp4j.generator.JsonRpcData;
import org.eclipse.lsp4j.jsonrpc.validation.NonNull;

/**
 * A parameter literal used in requests to pass a text document and a position inside that document.
 */
/* @JsonRpcData */@SuppressWarnings("all")
public class TextDocumentPositionParams {
  /**
   * The text document.
   */
  @NonNull
  private TextDocumentIdentifier textDocument;
  
  /**
   * Legacy property to support protocol version 1.0 requests.
   */
  @Deprecated
  private String uri;
  
  /**
   * The position inside the text document.
   */
  @NonNull
  private Position position;
  
  public TextDocumentPositionParams() {
  }
  
  public TextDocumentPositionParams(@NonNull final TextDocumentIdentifier textDocument, @NonNull final Position position) {
    this.textDocument = textDocument;
    this.position = position;
  }
  
  @Deprecated
  public TextDocumentPositionParams(@NonNull final TextDocumentIdentifier textDocument, final String uri, @NonNull final Position position) {
    this.textDocument = textDocument;
    this.uri = uri;
    this.position = position;
  }
}
