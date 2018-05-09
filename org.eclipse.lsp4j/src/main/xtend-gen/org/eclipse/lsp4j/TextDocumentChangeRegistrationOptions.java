/**
 * Copyright (c) 2016 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.lsp4j;

import org.eclipse.lsp4j.TextDocumentRegistrationOptions;
import org.eclipse.lsp4j.TextDocumentSyncKind;
import org.eclipse.lsp4j.generator.JsonRpcData;
import org.eclipse.lsp4j.jsonrpc.validation.NonNull;

/**
 * Describe options to be used when registered for text document change events.
 */
/* @JsonRpcData */@SuppressWarnings("all")
public class TextDocumentChangeRegistrationOptions extends TextDocumentRegistrationOptions {
  /**
   * How documents are synced to the server. See TextDocumentSyncKind.Full
   * and TextDocumentSyncKind.Incremental.
   */
  @NonNull
  private TextDocumentSyncKind syncKind;
  
  public TextDocumentChangeRegistrationOptions() {
  }
  
  public TextDocumentChangeRegistrationOptions(@NonNull final TextDocumentSyncKind syncKind) {
    this.syncKind = syncKind;
  }
}
