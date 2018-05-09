/**
 * Copyright (c) 2016 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.lsp4j;

import org.eclipse.lsp4j.TextDocumentRegistrationOptions;
import org.eclipse.lsp4j.generator.JsonRpcData;

/* @JsonRpcData */@SuppressWarnings("all")
public class TextDocumentSaveRegistrationOptions extends TextDocumentRegistrationOptions {
  /**
   * The client is supposed to include the content on save.
   */
  private Boolean includeText;
  
  public TextDocumentSaveRegistrationOptions() {
  }
  
  public TextDocumentSaveRegistrationOptions(final Boolean includeText) {
    this.includeText = includeText;
  }
}
