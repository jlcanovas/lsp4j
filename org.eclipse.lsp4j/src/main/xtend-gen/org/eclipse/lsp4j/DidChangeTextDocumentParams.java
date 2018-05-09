/**
 * Copyright (c) 2016 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.lsp4j;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.lsp4j.TextDocumentContentChangeEvent;
import org.eclipse.lsp4j.VersionedTextDocumentIdentifier;
import org.eclipse.lsp4j.generator.JsonRpcData;
import org.eclipse.lsp4j.jsonrpc.validation.NonNull;

/**
 * The document change notification is sent from the client to the server to signal changes to a text document.
 */
/* @JsonRpcData */@SuppressWarnings("all")
public class DidChangeTextDocumentParams {
  /**
   * The document that did change. The version number points to the version after all provided content changes have
   * been applied.
   */
  @NonNull
  private VersionedTextDocumentIdentifier textDocument;
  
  /**
   * Legacy property to support protocol version 1.0 requests.
   */
  @Deprecated
  private String uri;
  
  /**
   * The actual content changes.
   */
  @NonNull
  private List<TextDocumentContentChangeEvent> contentChanges = new ArrayList<TextDocumentContentChangeEvent>();
  
  public DidChangeTextDocumentParams() {
  }
  
  public DidChangeTextDocumentParams(@NonNull final VersionedTextDocumentIdentifier textDocument, @NonNull final List<TextDocumentContentChangeEvent> contentChanges) {
    this.textDocument = textDocument;
    this.contentChanges = contentChanges;
  }
  
  @Deprecated
  public DidChangeTextDocumentParams(@NonNull final VersionedTextDocumentIdentifier textDocument, final String uri, @NonNull final List<TextDocumentContentChangeEvent> contentChanges) {
    this(textDocument, contentChanges);
    this.uri = uri;
  }
}
