/**
 * Copyright (c) 2017 Kichwa Coders Ltd. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.lsp4j.debug;

import org.eclipse.lsp4j.debug.Source;
import org.eclipse.lsp4j.debug.SourceBreakpoint;
import org.eclipse.lsp4j.jsonrpc.validation.NonNull;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

/**
 * Arguments for 'setBreakpoints' request.
 */
@SuppressWarnings("all")
public class SetBreakpointsArguments {
  /**
   * The source location of the breakpoints; either source.path or source.reference must be specified.
   */
  @NonNull
  private Source source;
  
  /**
   * The code locations of the breakpoints.
   * <p>
   * This is an optional property.
   */
  private SourceBreakpoint[] breakpoints;
  
  /**
   * Deprecated: The code locations of the breakpoints.
   * <p>
   * This is an optional property.
   */
  private Long[] lines;
  
  /**
   * A value of true indicates that the underlying source has been modified which results in new breakpoint
   * locations.
   * <p>
   * This is an optional property.
   */
  private Boolean sourceModified;
  
  /**
   * The source location of the breakpoints; either source.path or source.reference must be specified.
   */
  @Pure
  @NonNull
  public Source getSource() {
    return this.source;
  }
  
  /**
   * The source location of the breakpoints; either source.path or source.reference must be specified.
   */
  public void setSource(@NonNull final Source source) {
    this.source = source;
  }
  
  /**
   * The code locations of the breakpoints.
   * <p>
   * This is an optional property.
   */
  @Pure
  public SourceBreakpoint[] getBreakpoints() {
    return this.breakpoints;
  }
  
  /**
   * The code locations of the breakpoints.
   * <p>
   * This is an optional property.
   */
  public void setBreakpoints(final SourceBreakpoint[] breakpoints) {
    this.breakpoints = breakpoints;
  }
  
  /**
   * Deprecated: The code locations of the breakpoints.
   * <p>
   * This is an optional property.
   */
  @Pure
  public Long[] getLines() {
    return this.lines;
  }
  
  /**
   * Deprecated: The code locations of the breakpoints.
   * <p>
   * This is an optional property.
   */
  public void setLines(final Long[] lines) {
    this.lines = lines;
  }
  
  /**
   * A value of true indicates that the underlying source has been modified which results in new breakpoint
   * locations.
   * <p>
   * This is an optional property.
   */
  @Pure
  public Boolean getSourceModified() {
    return this.sourceModified;
  }
  
  /**
   * A value of true indicates that the underlying source has been modified which results in new breakpoint
   * locations.
   * <p>
   * This is an optional property.
   */
  public void setSourceModified(final Boolean sourceModified) {
    this.sourceModified = sourceModified;
  }
  
  @Override
  @Pure
  public String toString() {
    ToStringBuilder b = new ToStringBuilder(this);
    b.add("source", this.source);
    b.add("breakpoints", this.breakpoints);
    b.add("lines", this.lines);
    b.add("sourceModified", this.sourceModified);
    return b.toString();
  }
  
  @Override
  @Pure
  public boolean equals(final Object obj) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe type SetBreakpointsArguments is already defined in SetBreakpointsArguments.java.");
  }
  
  @Override
  @Pure
  public int hashCode() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe type SetBreakpointsArguments is already defined in SetBreakpointsArguments.java.");
  }
}
