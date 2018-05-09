/**
 * Copyright (c) 2016 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.lsp4j;

import org.eclipse.lsp4j.CompletionContext;
import org.eclipse.lsp4j.Position;
import org.eclipse.lsp4j.TextDocumentIdentifier;
import org.eclipse.lsp4j.TextDocumentPositionParams;
import org.eclipse.lsp4j.generator.JsonRpcData;
import org.eclipse.lsp4j.jsonrpc.validation.NonNull;

/* @JsonRpcData */@SuppressWarnings("all")
public class CompletionParams extends TextDocumentPositionParams {
  /**
   * The completion context. This is only available it the client specifies
   * to send this using `ClientCapabilities.textDocument.completion.contextSupport === true`
   */
  private CompletionContext context;
  
  public CompletionParams() {
  }
  
  public CompletionParams(@NonNull final TextDocumentIdentifier textDocument, @NonNull final Position position) {
    super(textDocument, position);
  }
  
  public CompletionParams(@NonNull final TextDocumentIdentifier textDocument, @NonNull final Position position, final CompletionContext context) {
    super(textDocument, position);
    this.context = context;
  }
}
