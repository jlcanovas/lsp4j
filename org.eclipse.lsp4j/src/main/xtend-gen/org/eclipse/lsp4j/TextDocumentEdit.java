/**
 * Copyright (c) 2016 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.lsp4j;

import java.util.List;
import org.eclipse.lsp4j.TextEdit;
import org.eclipse.lsp4j.VersionedTextDocumentIdentifier;
import org.eclipse.lsp4j.generator.JsonRpcData;
import org.eclipse.lsp4j.jsonrpc.validation.NonNull;

/**
 * Describes textual changes on a single text document.
 * The text document is referred to as a `VersionedTextDocumentIdentifier`
 * to allow clients to check the text document version before an edit is applied.
 */
/* @JsonRpcData */@SuppressWarnings("all")
public class TextDocumentEdit {
  /**
   * The text document to change.
   */
  @NonNull
  private VersionedTextDocumentIdentifier textDocument;
  
  /**
   * The edits to be applied
   */
  @NonNull
  private List<TextEdit> edits;
  
  public TextDocumentEdit() {
  }
  
  public TextDocumentEdit(@NonNull final VersionedTextDocumentIdentifier textDocument, @NonNull final List<TextEdit> edits) {
    this.textDocument = textDocument;
    this.edits = edits;
  }
}
