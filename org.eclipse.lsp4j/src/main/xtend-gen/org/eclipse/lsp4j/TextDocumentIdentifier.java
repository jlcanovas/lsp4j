/**
 * Copyright (c) 2016 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.lsp4j;

import org.eclipse.lsp4j.generator.JsonRpcData;
import org.eclipse.lsp4j.jsonrpc.validation.NonNull;

/**
 * Text documents are identified using an URI. On the protocol level URI's are passed as strings.
 */
/* @JsonRpcData */@SuppressWarnings("all")
public class TextDocumentIdentifier {
  /**
   * The text document's uri.
   */
  @NonNull
  private String uri;
  
  public TextDocumentIdentifier() {
  }
  
  public TextDocumentIdentifier(@NonNull final String uri) {
    this.uri = uri;
  }
}
