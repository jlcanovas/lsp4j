/**
 * Copyright (c) 2016 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.lsp4j;

import org.eclipse.lsp4j.Color;
import org.eclipse.lsp4j.Range;
import org.eclipse.lsp4j.TextDocumentIdentifier;
import org.eclipse.lsp4j.generator.JsonRpcData;
import org.eclipse.lsp4j.jsonrpc.validation.NonNull;

/**
 * The color presentation request is sent from the client to the server to obtain a list of presentations
 * for a color value at a given location.
 * 
 * Since 3.6.0
 */
/* @JsonRpcData */@SuppressWarnings("all")
public class ColorPresentationParams {
  /**
   * The text document.
   */
  @NonNull
  private TextDocumentIdentifier textDocument;
  
  /**
   * The color information to request presentations for.
   */
  @NonNull
  private Color colorInfo;
  
  /**
   * The range where the color would be inserted. Serves as a context.
   */
  @NonNull
  private Range range;
  
  public ColorPresentationParams() {
  }
  
  public ColorPresentationParams(@NonNull final TextDocumentIdentifier textDocument, @NonNull final Color colorInfo, @NonNull final Range range) {
    this.textDocument = textDocument;
    this.colorInfo = colorInfo;
    this.range = range;
  }
}
