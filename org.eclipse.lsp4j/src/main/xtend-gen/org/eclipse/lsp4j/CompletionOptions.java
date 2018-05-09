/**
 * Copyright (c) 2016 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.lsp4j;

import java.util.List;
import org.eclipse.lsp4j.generator.JsonRpcData;

/**
 * Completion options.
 */
/* @JsonRpcData */@SuppressWarnings("all")
public class CompletionOptions {
  /**
   * The server provides support to resolve additional information for a completion item.
   */
  private Boolean resolveProvider;
  
  /**
   * The characters that trigger completion automatically.
   */
  private List<String> triggerCharacters;
  
  public CompletionOptions() {
  }
  
  public CompletionOptions(final Boolean resolveProvider, final List<String> triggerCharacters) {
    this.resolveProvider = resolveProvider;
    this.triggerCharacters = triggerCharacters;
  }
}
