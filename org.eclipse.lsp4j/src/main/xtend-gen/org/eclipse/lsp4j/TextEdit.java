/**
 * Copyright (c) 2016 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.lsp4j;

import org.eclipse.lsp4j.Range;
import org.eclipse.lsp4j.generator.JsonRpcData;
import org.eclipse.lsp4j.jsonrpc.validation.NonNull;

/**
 * A textual edit applicable to a text document.
 */
/* @JsonRpcData */@SuppressWarnings("all")
public class TextEdit {
  /**
   * The range of the text document to be manipulated. To insert text into a document create a range where start === end.
   */
  @NonNull
  private Range range;
  
  /**
   * The string to be inserted. For delete operations use an empty string.
   */
  @NonNull
  private String newText;
  
  public TextEdit() {
  }
  
  public TextEdit(@NonNull final Range range, @NonNull final String newText) {
    this.range = range;
    this.newText = newText;
  }
}
