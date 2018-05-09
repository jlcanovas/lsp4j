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
 * MarkedString can be used to render human readable text. It is either a markdown string
 * or a code-block that provides a language and a code snippet. The language identifier
 * is sematically equal to the optional language identifier in fenced code blocks in GitHub
 * issues. See https://help.github.com/articles/creating-and-highlighting-code-blocks/#syntax-highlighting
 * 
 * The pair of a language and a value is an equivalent to markdown:
 * ```${language}
 * ${value}
 * ```
 * 
 * Note that markdown strings will be sanitized - that means html will be escaped.
 */
/* @JsonRpcData */@SuppressWarnings("all")
public class MarkedString {
  @NonNull
  private String language;
  
  @NonNull
  private String value;
  
  public MarkedString() {
  }
  
  public MarkedString(@NonNull final String language, @NonNull final String value) {
    this.language = language;
    this.value = value;
  }
}
