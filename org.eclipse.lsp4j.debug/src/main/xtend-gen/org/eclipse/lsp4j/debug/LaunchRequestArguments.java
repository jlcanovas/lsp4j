/**
 * Copyright (c) 2017 Kichwa Coders Ltd. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.lsp4j.debug;

import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

/**
 * Arguments for 'launch' request.
 */
@SuppressWarnings("all")
public class LaunchRequestArguments {
  /**
   * If noDebug is true the launch request should launch the program without enabling debugging.
   * <p>
   * This is an optional property.
   */
  private Boolean noDebug;
  
  /**
   * If noDebug is true the launch request should launch the program without enabling debugging.
   * <p>
   * This is an optional property.
   */
  @Pure
  public Boolean getNoDebug() {
    return this.noDebug;
  }
  
  /**
   * If noDebug is true the launch request should launch the program without enabling debugging.
   * <p>
   * This is an optional property.
   */
  public void setNoDebug(final Boolean noDebug) {
    this.noDebug = noDebug;
  }
  
  @Override
  @Pure
  public String toString() {
    ToStringBuilder b = new ToStringBuilder(this);
    b.add("noDebug", this.noDebug);
    return b.toString();
  }
  
  @Override
  @Pure
  public boolean equals(final Object obj) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe type LaunchRequestArguments is already defined in LaunchRequestArguments.java.");
  }
  
  @Override
  @Pure
  public int hashCode() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe type LaunchRequestArguments is already defined in LaunchRequestArguments.java.");
  }
}
