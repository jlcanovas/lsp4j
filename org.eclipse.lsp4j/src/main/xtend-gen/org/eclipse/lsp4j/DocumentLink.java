/**
 * Copyright (c) 2016 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.lsp4j;

import org.eclipse.lsp4j.Range;
import org.eclipse.lsp4j.generator.JsonRpcData;
import org.eclipse.lsp4j.jsonrpc.validation.NonNull;

/**
 * A document link is a range in a text document that links to an internal or external resource, like another
 * text document or a web site.
 */
/* @JsonRpcData */@SuppressWarnings("all")
public class DocumentLink {
  /**
   * The range this link applies to.
   */
  @NonNull
  private Range range;
  
  /**
   * The uri this link points to. If missing a resolve request is sent later.
   */
  private String target;
  
  public DocumentLink() {
  }
  
  public DocumentLink(@NonNull final Range range) {
    this.range = range;
  }
  
  public DocumentLink(@NonNull final Range range, final String target) {
    this(range);
    this.target = target;
  }
}
