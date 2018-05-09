/**
 * Copyright (c) 2016 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.lsp4j;

import org.eclipse.lsp4j.DocumentHighlightKind;
import org.eclipse.lsp4j.Range;
import org.eclipse.lsp4j.generator.JsonRpcData;
import org.eclipse.lsp4j.jsonrpc.validation.NonNull;

/**
 * A document highlight is a range inside a text document which deserves special attention. Usually a document highlight
 * is visualized by changing the background color of its range.
 */
/* @JsonRpcData */@SuppressWarnings("all")
public class DocumentHighlight {
  /**
   * The range this highlight applies to.
   */
  @NonNull
  private Range range;
  
  /**
   * The highlight kind, default is {@link DocumentHighlightKind#Text}.
   */
  private DocumentHighlightKind kind;
  
  public DocumentHighlight() {
  }
  
  public DocumentHighlight(@NonNull final Range range) {
    this.range = range;
  }
  
  public DocumentHighlight(@NonNull final Range range, final DocumentHighlightKind kind) {
    this(range);
    this.kind = kind;
  }
}
