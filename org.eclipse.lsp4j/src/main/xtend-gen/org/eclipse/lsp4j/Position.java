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
 * Position in a text document expressed as zero-based line and character offset.
 */
/* @JsonRpcData */@SuppressWarnings("all")
public class Position {
  /**
   * Line position in a document (zero-based).
   */
  private int line;
  
  /**
   * Character offset on a line in a document (zero-based).
   */
  private int character;
  
  public Position() {
  }
  
  public Position(final int line, final int character) {
    this.line = line;
    this.character = character;
  }
}
