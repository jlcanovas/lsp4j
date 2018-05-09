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
 * The document color request is sent from the client to the server to list all color refereces
 * found in a given text document. Along with the range, a color value in RGB is returned.
 * 
 * Since 3.6.0
 */
/* @JsonRpcData */@SuppressWarnings("all")
public class DocumentColorParams {
  /**
   * The text document.
   */
  @NonNull
  private TextDocumentIdentifier textDocument;
  
  public DocumentColorParams() {
  }
  
  public DocumentColorParams(@NonNull final TextDocumentIdentifier textDocument) {
    this.textDocument = textDocument;
  }
}
