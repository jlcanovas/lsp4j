/**
 * Copyright (c) 2016 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.lsp4j;

import org.eclipse.lsp4j.Position;
import org.eclipse.lsp4j.generator.JsonRpcData;
import org.eclipse.lsp4j.jsonrpc.validation.NonNull;

/**
 * A range in a text document expressed as (zero-based) start and end positions.
 */
/* @JsonRpcData */@SuppressWarnings("all")
public class Range {
  /**
   * The range's start position
   */
  @NonNull
  private Position start;
  
  /**
   * The range's end position
   */
  @NonNull
  private Position end;
  
  public Range() {
  }
  
  public Range(@NonNull final Position start, @NonNull final Position end) {
    this.start = start;
    this.end = end;
  }
}
