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
 * An event describing a change to a text document. If range and rangeLength are omitted the new text is considered
 * to be the full content of the document.
 */
/* @JsonRpcData */@SuppressWarnings("all")
public class TextDocumentContentChangeEvent {
  /**
   * The range of the document that changed.
   */
  private Range range;
  
  /**
   * The length of the range that got replaced.
   */
  private Integer rangeLength;
  
  /**
   * The new text of the range/document.
   */
  @NonNull
  private String text;
  
  public TextDocumentContentChangeEvent() {
  }
  
  public TextDocumentContentChangeEvent(@NonNull final String text) {
    this.text = text;
  }
  
  public TextDocumentContentChangeEvent(final Range range, final Integer rangeLength, @NonNull final String text) {
    this.range = range;
    this.rangeLength = rangeLength;
    this.text = text;
  }
}
