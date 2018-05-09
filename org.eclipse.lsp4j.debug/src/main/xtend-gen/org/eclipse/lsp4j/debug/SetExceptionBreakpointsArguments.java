/**
 * Copyright (c) 2017 Kichwa Coders Ltd. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.lsp4j.debug;

import org.eclipse.lsp4j.debug.ExceptionOptions;
import org.eclipse.lsp4j.jsonrpc.validation.NonNull;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

/**
 * Arguments for 'setExceptionBreakpoints' request.
 */
@SuppressWarnings("all")
public class SetExceptionBreakpointsArguments {
  /**
   * IDs of checked exception options. The set of IDs is returned via the 'exceptionBreakpointFilters' capability.
   */
  @NonNull
  private String[] filters;
  
  /**
   * Configuration options for selected exceptions.
   * <p>
   * This is an optional property.
   */
  private ExceptionOptions[] exceptionOptions;
  
  /**
   * IDs of checked exception options. The set of IDs is returned via the 'exceptionBreakpointFilters' capability.
   */
  @Pure
  @NonNull
  public String[] getFilters() {
    return this.filters;
  }
  
  /**
   * IDs of checked exception options. The set of IDs is returned via the 'exceptionBreakpointFilters' capability.
   */
  public void setFilters(@NonNull final String[] filters) {
    this.filters = filters;
  }
  
  /**
   * Configuration options for selected exceptions.
   * <p>
   * This is an optional property.
   */
  @Pure
  public ExceptionOptions[] getExceptionOptions() {
    return this.exceptionOptions;
  }
  
  /**
   * Configuration options for selected exceptions.
   * <p>
   * This is an optional property.
   */
  public void setExceptionOptions(final ExceptionOptions[] exceptionOptions) {
    this.exceptionOptions = exceptionOptions;
  }
  
  @Override
  @Pure
  public String toString() {
    ToStringBuilder b = new ToStringBuilder(this);
    b.add("filters", this.filters);
    b.add("exceptionOptions", this.exceptionOptions);
    return b.toString();
  }
  
  @Override
  @Pure
  public boolean equals(final Object obj) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe type SetExceptionBreakpointsArguments is already defined in SetExceptionBreakpointsArguments.java.");
  }
  
  @Override
  @Pure
  public int hashCode() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe type SetExceptionBreakpointsArguments is already defined in SetExceptionBreakpointsArguments.java.");
  }
}
