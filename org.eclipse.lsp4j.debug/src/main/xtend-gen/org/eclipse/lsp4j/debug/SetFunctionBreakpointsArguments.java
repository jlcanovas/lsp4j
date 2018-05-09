/**
 * Copyright (c) 2017 Kichwa Coders Ltd. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.lsp4j.debug;

import org.eclipse.lsp4j.debug.FunctionBreakpoint;
import org.eclipse.lsp4j.jsonrpc.validation.NonNull;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

/**
 * Arguments for 'setFunctionBreakpoints' request.
 */
@SuppressWarnings("all")
public class SetFunctionBreakpointsArguments {
  /**
   * The function names of the breakpoints.
   */
  @NonNull
  private FunctionBreakpoint[] breakpoints;
  
  /**
   * The function names of the breakpoints.
   */
  @Pure
  @NonNull
  public FunctionBreakpoint[] getBreakpoints() {
    return this.breakpoints;
  }
  
  /**
   * The function names of the breakpoints.
   */
  public void setBreakpoints(@NonNull final FunctionBreakpoint[] breakpoints) {
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
      + "\nThe type SetFunctionBreakpointsArguments is already defined in SetFunctionBreakpointsArguments.java.");
  }
  
  @Override
  @Pure
  public int hashCode() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe type SetFunctionBreakpointsArguments is already defined in SetFunctionBreakpointsArguments.java.");
  }
}
