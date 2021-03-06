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
 * The references request is sent from the client to the server to resolve project-wide references for the symbol
 * denoted by the given text document position.
 */
/* @JsonRpcData */@SuppressWarnings("all")
public class ReferenceContext {
  /**
   * Include the declaration of the current symbol.
   */
  private boolean includeDeclaration;
  
  public ReferenceContext() {
  }
  
  public ReferenceContext(final boolean includeDeclaration) {
    this.includeDeclaration = includeDeclaration;
  }
}
