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
 * Represents a color in RGBA space.
 */
/* @JsonRpcData */@SuppressWarnings("all")
public class Color {
  /**
   * The red component of this color in the range [0-1].
   */
  private double red;
  
  /**
   * The green component of this color in the range [0-1].
   */
  private double green;
  
  /**
   * The blue component of this color in the range [0-1].
   */
  private double blue;
  
  /**
   * The alpha component of this color in the range [0-1].
   */
  private double alpha;
  
  public Color() {
  }
  
  public Color(final double red, final double green, final double blue, final double alpha) {
    this.red = red;
    this.green = green;
    this.blue = blue;
    this.alpha = alpha;
  }
}
