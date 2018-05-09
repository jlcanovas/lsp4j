/**
 * Copyright (c) 2016 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.lsp4j;

import java.util.List;
import org.eclipse.lsp4j.TextDocumentRegistrationOptions;
import org.eclipse.lsp4j.generator.JsonRpcData;

/* @JsonRpcData */@SuppressWarnings("all")
public class SignatureHelpRegistrationOptions extends TextDocumentRegistrationOptions {
  /**
   * The characters that trigger signature help automatically.
   */
  private List<String> triggerCharacters;
  
  public SignatureHelpRegistrationOptions() {
  }
  
  public SignatureHelpRegistrationOptions(final List<String> triggerCharacters) {
    this.triggerCharacters = triggerCharacters;
  }
}
