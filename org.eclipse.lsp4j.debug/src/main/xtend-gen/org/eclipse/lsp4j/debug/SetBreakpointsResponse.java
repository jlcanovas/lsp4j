/**
 * Copyright (c) 2017 Kichwa Coders Ltd. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.lsp4j.debug;

import org.eclipse.lsp4j.debug.Breakpoint;
import org.eclipse.lsp4j.jsonrpc.validation.NonNull;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

/**
 * Response to 'setBreakpoints' request.
 * <p>
 * Returned is information about each breakpoint created by this request.
 * <p>
 * This includes the actual code location and whether the breakpoint could be verified.
 * <p>
 * The breakpoints returned are in the same order as the elements of the 'breakpoints'
 * <p>
 * (or the deprecated 'lines') in the SetBreakpointsArguments.
 */
@SuppressWarnings("all")
public class SetBreakpointsResponse {
  /**
   * Information about the breakpoints. The array elements are in the same order as the elements of the
   * 'breakpoints' (or the deprecated 'lines') in the SetBreakpointsArguments.
   */
  @NonNull
  private Breakpoint[] breakpoints;
  
  /**
   * Information about the breakpoints. The array elements are in the same order as the elements of the
   * 'breakpoints' (or the deprecated 'lines') in the SetBreakpointsArguments.
   */
  @Pure
  @NonNull
  public Breakpoint[] getBreakpoints() {
    return this.breakpoints;
  }
  
  /**
   * Information about the breakpoints. The array elements are in the same order as the elements of the
   * 'breakpoints' (or the deprecated 'lines') in the SetBreakpointsArguments.
   */
  public void setBreakpoints(@NonNull final Breakpoint[] breakpoints) {
    this.breakpoints = breakpoints;
  }
  
  @Override
  @Pure
  public String toString() {
    ToStringBuilder b = new ToStringBuilder(this);
    b.add("breakpoints", this.breakpoints);
    return b.toString();
  }
  
  @Override
  @Pure
  public boolean equals(final Object obj) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe type SetBreakpointsResponse is already defined in SetBreakpointsResponse.java.");
  }
  
  @Override
  @Pure
  public int hashCode() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe type SetBreakpointsResponse is already defined in SetBreakpointsResponse.java.");
  }
}
