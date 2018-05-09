/**
 * Copyright (c) 2016 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.lsp4j;

import org.eclipse.lsp4j.DocumentFormattingParams;
import org.eclipse.lsp4j.Position;
import org.eclipse.lsp4j.generator.JsonRpcData;
import org.eclipse.lsp4j.jsonrpc.validation.NonNull;

/**
 * The document on type formatting request is sent from the client to the server to format parts of the document during typing.
 */
/* @JsonRpcData */@SuppressWarnings("all")
public class DocumentOnTypeFormattingParams extends DocumentFormattingParams {
  /**
   * The position at which this request was send.
   */
  @NonNull
  private Position position;
  
  /**
   * The character that has been typed.
   */
  @NonNull
  private String ch;
  
  public DocumentOnTypeFormattingParams() {
  }
  
  public DocumentOnTypeFormattingParams(@NonNull final Position position, @NonNull final String ch) {
    this.position = position;
    this.ch = ch;
  }
}
