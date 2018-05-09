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
 * A MarkupContent literal represents a string value which content is interpreted based on its
 * kind flag. Currently the protocol supports `plaintext` and `markdown` as markup kinds.
 * 
 * If the kind is `markdown` then the value can contain fenced code blocks like in GitHub issues.
 * See https://help.github.com/articles/creating-and-highlighting-code-blocks/#syntax-highlighting
 * 
 * Please Note that clients might sanitize the return markdown. A client could decide to
 * remove HTML from the markdown to avoid script execution.
 */
/* @JsonRpcData */@SuppressWarnings("all")
public class MarkupContent {
  /**
   * The type of the Markup.
   */
  @NonNull
  private String kind;
  
  /**
   * The content itself.
   */
  @NonNull
  private String value;
}
