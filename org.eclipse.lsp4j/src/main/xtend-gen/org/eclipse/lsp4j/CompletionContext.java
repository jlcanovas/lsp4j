/**
 * Copyright (c) 2016 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.lsp4j;

import org.eclipse.lsp4j.CompletionTriggerKind;
import org.eclipse.lsp4j.generator.JsonRpcData;
import org.eclipse.lsp4j.jsonrpc.validation.NonNull;

/* @JsonRpcData */@SuppressWarnings("all")
public class CompletionContext {
  /**
   * How the completion was triggered.
   */
  @NonNull
  private CompletionTriggerKind triggerKind;
  
  /**
   * The trigger character (a single character) that has trigger code complete.
   * Is undefined if `triggerKind !== CompletionTriggerKind.TriggerCharacter`
   */
  private String triggerCharacter;
  
  public CompletionContext() {
  }
  
  public CompletionContext(@NonNull final CompletionTriggerKind triggerKind) {
    this.triggerKind = triggerKind;
  }
  
  public CompletionContext(@NonNull final CompletionTriggerKind triggerKind, final String triggerCharacter) {
    this.triggerKind = triggerKind;
    this.triggerCharacter = triggerCharacter;
  }
}
