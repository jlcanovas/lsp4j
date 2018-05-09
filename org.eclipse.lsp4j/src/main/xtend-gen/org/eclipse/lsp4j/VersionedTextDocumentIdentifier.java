/**
 * Copyright (c) 2016 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.lsp4j;

import com.google.gson.annotations.JsonAdapter;
import org.eclipse.lsp4j.TextDocumentIdentifier;
import org.eclipse.lsp4j.adapters.VersionedTextDocumentIdentifierTypeAdapter;
import org.eclipse.lsp4j.generator.JsonRpcData;

/**
 * An identifier to denote a specific version of a text document.
 */
/* @JsonRpcData */@JsonAdapter(VersionedTextDocumentIdentifierTypeAdapter.Factory.class)
@SuppressWarnings("all")
public class VersionedTextDocumentIdentifier extends TextDocumentIdentifier {
  /**
   * The version number of this document. If a versioned text document identifier
   * is sent from the server to the client and the file is not open in the editor
   * (the server has not received an open notification before) the server can send
   * `null` to indicate that the version is known and the content on disk is the
   * truth (as specified with document content ownership).
   */
  private Integer version;
  
  public VersionedTextDocumentIdentifier() {
  }
  
  public VersionedTextDocumentIdentifier(final Integer version) {
    this.version = version;
  }
}
