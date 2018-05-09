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
 * Event message for 'breakpoint' event type.
 * <p>
 * The event indicates that some information about a breakpoint has changed.
 */
@SuppressWarnings("all")
public class BreakpointEventArguments {
  /**
   * The reason for the event.
   * <p>
   * Possible values include - but not limited to those defined in {@link BreakpointEventArgumentsReason}
   */
  @NonNull
  private String reason;
  
  /**
   * The breakpoint.
   */
  @NonNull
  private Breakpoint breakpoint;
  
  /**
   * The reason for the event.
   * <p>
   * Possible values include - but not limited to those defined in {@link BreakpointEventArgumentsReason}
   */
  @Pure
  @NonNull
  public String getReason() {
    return this.reason;
  }
  
  /**
   * The reason for the event.
   * <p>
   * Possible values include - but not limited to those defined in {@link BreakpointEventArgumentsReason}
   */
  public void setReason(@NonNull final String reason) {
    this.reason = reason;
  }
  
  /**
   * The breakpoint.
   */
  @Pure
  @NonNull
  public Breakpoint getBreakpoint() {
    return this.breakpoint;
  }
  
  /**
   * The breakpoint.
   */
  public void setBreakpoint(@NonNull final Breakpoint breakpoint) {
    this.breakpoint = breakpoint;
  }
  
  @Override
  @Pure
  public String toString() {
    ToStringBuilder b = new ToStringBuilder(this);
    b.add("reason", this.reason);
    b.add("breakpoint", this.breakpoint);
    return b.toString();
  }
  
  @Override
  @Pure
  public boolean equals(final Object obj) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe type BreakpointEventArguments is already defined in BreakpointEventArguments.java.");
  }
  
  @Override
  @Pure
  public int hashCode() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe type BreakpointEventArguments is already defined in BreakpointEventArguments.java.");
  }
}
