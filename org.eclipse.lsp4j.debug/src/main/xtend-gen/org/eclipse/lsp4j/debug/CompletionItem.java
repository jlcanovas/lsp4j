/**
 * Copyright (c) 2017 Kichwa Coders Ltd. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.lsp4j.debug;

import org.eclipse.lsp4j.debug.CompletionItemType;
import org.eclipse.lsp4j.generator.JsonRpcData;
import org.eclipse.lsp4j.jsonrpc.validation.NonNull;

/**
 * CompletionItems are the suggestions returned from the CompletionsRequest.
 */
/* @JsonRpcData */@SuppressWarnings("all")
public class CompletionItem {
  /**
   * The label of this completion item. By default this is also the text that is inserted when selecting this
   * completion.
   */
  @NonNull
  private String label;
  
  /**
   * If text is not falsy then it is inserted instead of the label.
   * <p>
   * This is an optional property.
   */
  private String text;
  
  /**
   * The item's type. Typically the client uses this information to render the item in the UI with an icon.
   * <p>
   * This is an optional property.
   */
  private CompletionItemType type;
  
  /**
   * This value determines the location (in the CompletionsRequest's 'text' attribute) where the completion text is
   * added.
   * <p>
   * If missing the text is added at the location specified by the CompletionsRequest's 'column' attribute.
   * <p>
   * This is an optional property.
   */
  private Long start;
  
  /**
   * This value determines how many characters are overwritten by the completion text.
   * <p>
   * If missing the value 0 is assumed which results in the completion text being inserted.
   * <p>
   * This is an optional property.
   */
  private Long length;
}
