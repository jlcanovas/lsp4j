/**
 * Copyright (c) 2016 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.lsp4j;

import java.util.List;
import org.eclipse.lsp4j.DocumentFilter;
import org.eclipse.lsp4j.generator.JsonRpcData;

/**
 * Since most of the registration options require to specify a document selector there is
 * a base interface that can be used.
 */
/* @JsonRpcData */@SuppressWarnings("all")
public class TextDocumentRegistrationOptions {
  /**
   * A document selector to identify the scope of the registration. If set to null
   * the document selector provided on the client side will be used.
   */
  private List<DocumentFilter> documentSelector;
  
  public TextDocumentRegistrationOptions() {
  }
  
  public TextDocumentRegistrationOptions(final List<DocumentFilter> documentSelector) {
    this.documentSelector = documentSelector;
  }
}
