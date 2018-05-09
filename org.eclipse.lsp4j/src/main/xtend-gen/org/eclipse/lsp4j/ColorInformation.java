/**
 * Copyright (c) 2016 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.lsp4j;

import org.eclipse.lsp4j.Color;
import org.eclipse.lsp4j.Range;
import org.eclipse.lsp4j.generator.JsonRpcData;
import org.eclipse.lsp4j.jsonrpc.validation.NonNull;

/* @JsonRpcData */@SuppressWarnings("all")
public class ColorInformation {
  /**
   * The range in the document where this color appers.
   */
  @NonNull
  private Range range;
  
  /**
   * The actual color value for this color range.
   */
  @NonNull
  private Color color;
  
  public ColorInformation() {
  }
  
  public ColorInformation(@NonNull final Range range, @NonNull final Color color) {
    this.range = range;
    this.color = color;
  }
}
