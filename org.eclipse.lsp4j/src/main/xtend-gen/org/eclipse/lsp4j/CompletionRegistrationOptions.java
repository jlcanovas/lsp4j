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
public class CompletionRegistrationOptions extends TextDocumentRegistrationOptions {
  /**
   * Most tools trigger completion request automatically without explicitly requesting
   * it using a keyboard shortcut (e.g. Ctrl+Space). Typically they do so when the user
   * starts to type an identifier. For example if the user types `c` in a JavaScript file
   * code complete will automatically pop up present `console` besides others as a
   * completion item. Characters that make up identifiers don't need to be listed here.
   * 
   * If code complete should automatically be trigger on characters not being valid inside
   * an identifier (for example `.` in JavaScript) list them in `triggerCharacters`.
   */
  private List<String> triggerCharacters;
  
  /**
   * The server provides support to resolve additional information for a completion item.
   */
  private Boolean resolveProvider;
  
  public CompletionRegistrationOptions() {
  }
  
  public CompletionRegistrationOptions(final List<String> triggerCharacters, final Boolean resolveProvider) {
    this.triggerCharacters = triggerCharacters;
    this.resolveProvider = resolveProvider;
  }
}
