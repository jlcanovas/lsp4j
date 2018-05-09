/**
 * Copyright (c) 2017 Kichwa Coders Ltd. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.lsp4j.debug;

import com.google.gson.annotations.SerializedName;
import org.eclipse.lsp4j.jsonrpc.validation.NonNull;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

/**
 * An ExceptionBreakpointsFilter is shown in the UI as an option for configuring how exceptions are dealt with.
 */
@SuppressWarnings("all")
public class ExceptionBreakpointsFilter {
  /**
   * The internal ID of the filter. This value is passed to the setExceptionBreakpoints request.
   */
  @NonNull
  private String filter;
  
  /**
   * The name of the filter. This will be shown in the UI.
   */
  @NonNull
  private String label;
  
  /**
   * Initial value of the filter. If not specified a value 'false' is assumed.
   * <p>
   * This is an optional property.
   */
  @SerializedName(value = "default")
  private Boolean default_;
  
  /**
   * The internal ID of the filter. This value is passed to the setExceptionBreakpoints request.
   */
  @Pure
  @NonNull
  public String getFilter() {
    return this.filter;
  }
  
  /**
   * The internal ID of the filter. This value is passed to the setExceptionBreakpoints request.
   */
  public void setFilter(@NonNull final String filter) {
    this.filter = filter;
  }
  
  /**
   * The name of the filter. This will be shown in the UI.
   */
  @Pure
  @NonNull
  public String getLabel() {
    return this.label;
  }
  
  /**
   * The name of the filter. This will be shown in the UI.
   */
  public void setLabel(@NonNull final String label) {
    this.label = label;
  }
  
  /**
   * Initial value of the filter. If not specified a value 'false' is assumed.
   * <p>
   * This is an optional property.
   */
  @Pure
  public Boolean getDefault_() {
    return this.default_;
  }
  
  /**
   * Initial value of the filter. If not specified a value 'false' is assumed.
   * <p>
   * This is an optional property.
   */
  public void setDefault_(final Boolean default_) {
    this.default_ = default_;
  }
  
  @Override
  @Pure
  public String toString() {
    ToStringBuilder b = new ToStringBuilder(this);
    b.add("filter", this.filter);
    b.add("label", this.label);
    b.add("default_", this.default_);
    return b.toString();
  }
  
  @Override
  @Pure
  public boolean equals(final Object obj) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe type ExceptionBreakpointsFilter is already defined in ExceptionBreakpointsFilter.java.");
  }
  
  @Override
  @Pure
  public int hashCode() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe type ExceptionBreakpointsFilter is already defined in ExceptionBreakpointsFilter.java.");
  }
}
