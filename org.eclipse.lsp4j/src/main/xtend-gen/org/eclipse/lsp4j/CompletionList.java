/**
 * Copyright (c) 2016 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.lsp4j;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.lsp4j.CompletionItem;
import org.eclipse.lsp4j.generator.JsonRpcData;
import org.eclipse.lsp4j.jsonrpc.validation.NonNull;

/**
 * Represents a collection of completion items to be presented in the editor.
 */
/* @JsonRpcData */@SuppressWarnings("all")
public class CompletionList {
  /**
   * This list it not complete. Further typing should result in recomputing this list.
   */
  private boolean isIncomplete;
  
  /**
   * The completion items.
   */
  @NonNull
  private List<CompletionItem> items;
  
  public CompletionList() {
    this(new ArrayList<CompletionItem>());
  }
  
  public CompletionList(@NonNull final List<CompletionItem> items) {
    this.items = items;
  }
  
  public CompletionList(final boolean isIncomplete, @NonNull final List<CompletionItem> items) {
    this(items);
    this.isIncomplete = isIncomplete;
  }
}
