/**
 * Copyright (c) 2016 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.lsp4j;

import org.eclipse.lsp4j.DocumentFormattingParams;
import org.eclipse.lsp4j.Range;
import org.eclipse.lsp4j.generator.JsonRpcData;
import org.eclipse.lsp4j.jsonrpc.validation.NonNull;

/**
 * The document range formatting request is sent from the client to the server to format a given range in a document.
 */
/* @JsonRpcData */@SuppressWarnings("all")
public class DocumentRangeFormattingParams extends DocumentFormattingParams {
  /**
   * The range to format
   */
  @NonNull
  private Range range;
  
  public DocumentRangeFormattingParams() {
  }
  
  public DocumentRangeFormattingParams(@NonNull final Range range) {
    this.range = range;
  }
}
