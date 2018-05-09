/**
 * Copyright (c) 2017 Kichwa Coders Ltd. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.lsp4j.debug;

import org.eclipse.lsp4j.debug.StackFrame;
import org.eclipse.lsp4j.jsonrpc.validation.NonNull;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

/**
 * Response to 'stackTrace' request.
 */
@SuppressWarnings("all")
public class StackTraceResponse {
  /**
   * The frames of the stackframe. If the array has length zero, there are no stackframes available.
   * <p>
   * This means that there is no location information available.
   */
  @NonNull
  private StackFrame[] stackFrames;
  
  /**
   * The total number of frames available.
   * <p>
   * This is an optional property.
   */
  private Long totalFrames;
  
  /**
   * The frames of the stackframe. If the array has length zero, there are no stackframes available.
   * <p>
   * This means that there is no location information available.
   */
  @Pure
  @NonNull
  public StackFrame[] getStackFrames() {
    return this.stackFrames;
  }
  
  /**
   * The frames of the stackframe. If the array has length zero, there are no stackframes available.
   * <p>
   * This means that there is no location information available.
   */
  public void setStackFrames(@NonNull final StackFrame[] stackFrames) {
    this.stackFrames = stackFrames;
  }
  
  /**
   * The total number of frames available.
   * <p>
   * This is an optional property.
   */
  @Pure
  public Long getTotalFrames() {
    return this.totalFrames;
  }
  
  /**
   * The total number of frames available.
   * <p>
   * This is an optional property.
   */
  public void setTotalFrames(final Long totalFrames) {
    this.totalFrames = totalFrames;
  }
  
  @Override
  @Pure
  public String toString() {
    ToStringBuilder b = new ToStringBuilder(this);
    b.add("stackFrames", this.stackFrames);
    b.add("totalFrames", this.totalFrames);
    return b.toString();
  }
  
  @Override
  @Pure
  public boolean equals(final Object obj) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe type StackTraceResponse is already defined in StackTraceResponse.java.");
  }
  
  @Override
  @Pure
  public int hashCode() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe type StackTraceResponse is already defined in StackTraceResponse.java.");
  }
}
