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
import org.eclipse.lsp4j.jsonrpc.validation.NonNull;

/* @JsonRpcData */@SuppressWarnings("all")
public class DocumentOnTypeFormattingRegistrationOptions extends TextDocumentRegistrationOptions {
  /**
   * A character on which formatting should be triggered, like `}`.
   */
  @NonNull
  private String firstTriggerCharacter;
  
  /**
   * More trigger characters.
   */
  private List<String> moreTriggerCharacter;
  
  public DocumentOnTypeFormattingRegistrationOptions() {
  }
  
  public DocumentOnTypeFormattingRegistrationOptions(@NonNull final String firstTriggerCharacter) {
    this.firstTriggerCharacter = firstTriggerCharacter;
  }
  
  public DocumentOnTypeFormattingRegistrationOptions(@NonNull final String firstTriggerCharacter, final List<String> moreTriggerCharacter) {
    this.firstTriggerCharacter = firstTriggerCharacter;
    this.moreTriggerCharacter = moreTriggerCharacter;
  }
}
