/**
 * Copyright (c) 2017 Kichwa Coders Ltd. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.lsp4j.debug;

import org.eclipse.lsp4j.jsonrpc.validation.NonNull;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

/**
 * Event message for 'exited' event type.
 * <p>
 * The event indicates that the debuggee has exited.
 */
@SuppressWarnings("all")
public class ExitedEventArguments {
  /**
   * The exit code returned from the debuggee.
   */
  @NonNull
  private Long exitCode;
  
  /**
   * The exit code returned from the debuggee.
   */
  @Pure
  @NonNull
  public Long getExitCode() {
    return this.exitCode;
  }
  
  /**
   * The exit code returned from the debuggee.
   */
  public void setExitCode(@NonNull final Long exitCode) {
    this.exitCode = exitCode;
  }
  
  @Override
  @Pure
  public String toString() {
    ToStringBuilder b = new ToStringBuilder(this);
    b.add("exitCode", this.exitCode);
    return b.toString();
  }
  
  @Override
  @Pure
  public boolean equals(final Object obj) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe type ExitedEventArguments is already defined in ExitedEventArguments.java.");
  }
  
  @Override
  @Pure
  public int hashCode() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe type ExitedEventArguments is already defined in ExitedEventArguments.java.");
  }
}
