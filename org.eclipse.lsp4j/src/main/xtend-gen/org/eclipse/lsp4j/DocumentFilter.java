/**
 * Copyright (c) 2016 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.lsp4j;

import org.eclipse.lsp4j.generator.JsonRpcData;

/**
 * A document filter denotes a document through properties like language, schema or pattern.
 */
/* @JsonRpcData */@SuppressWarnings("all")
public class DocumentFilter {
  /**
   * A language id, like `typescript`.
   */
  private String language;
  
  /**
   * A uri scheme, like `file` or `untitled`.
   */
  private String scheme;
  
  /**
   * A glob pattern, like `*.{ts,js}`.
   */
  private String pattern;
  
  public DocumentFilter() {
  }
  
  public DocumentFilter(final String language, final String scheme, final String pattern) {
    this.language = language;
    this.scheme = scheme;
    this.pattern = pattern;
  }
}
