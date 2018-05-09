/**
 * Copyright (c) 2017 Kichwa Coders Ltd. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.lsp4j.debug;

import org.eclipse.lsp4j.debug.ValueFormat;
import org.eclipse.lsp4j.debug.VariablesArgumentsFilter;
import org.eclipse.lsp4j.jsonrpc.validation.NonNull;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

/**
 * Arguments for 'variables' request.
 */
@SuppressWarnings("all")
public class VariablesArguments {
  /**
   * The Variable reference.
   */
  @NonNull
  private Long variablesReference;
  
  /**
   * Optional filter to limit the child variables to either named or indexed. If ommited, both types are fetched.
   * <p>
   * This is an optional property.
   */
  private VariablesArgumentsFilter filter;
  
  /**
   * The index of the first variable to return; if omitted children start at 0.
   * <p>
   * This is an optional property.
   */
  private Long start;
  
  /**
   * The number of variables to return. If count is missing or 0, all variables are returned.
   * <p>
   * This is an optional property.
   */
  private Long count;
  
  /**
   * Specifies details on how to format the Variable values.
   * <p>
   * This is an optional property.
   */
  private ValueFormat format;
  
  /**
   * The Variable reference.
   */
  @Pure
  @NonNull
  public Long getVariablesReference() {
    return this.variablesReference;
  }
  
  /**
   * The Variable reference.
   */
  public void setVariablesReference(@NonNull final Long variablesReference) {
    this.variablesReference = variablesReference;
  }
  
  /**
   * Optional filter to limit the child variables to either named or indexed. If ommited, both types are fetched.
   * <p>
   * This is an optional property.
   */
  @Pure
  public VariablesArgumentsFilter getFilter() {
    return this.filter;
  }
  
  /**
   * Optional filter to limit the child variables to either named or indexed. If ommited, both types are fetched.
   * <p>
   * This is an optional property.
   */
  public void setFilter(final VariablesArgumentsFilter filter) {
    this.filter = filter;
  }
  
  /**
   * The index of the first variable to return; if omitted children start at 0.
   * <p>
   * This is an optional property.
   */
  @Pure
  public Long getStart() {
    return this.start;
  }
  
  /**
   * The index of the first variable to return; if omitted children start at 0.
   * <p>
   * This is an optional property.
   */
  public void setStart(final Long start) {
    this.start = start;
  }
  
  /**
   * The number of variables to return. If count is missing or 0, all variables are returned.
   * <p>
   * This is an optional property.
   */
  @Pure
  public Long getCount() {
    return this.count;
  }
  
  /**
   * The number of variables to return. If count is missing or 0, all variables are returned.
   * <p>
   * This is an optional property.
   */
  public void setCount(final Long count) {
    this.count = count;
  }
  
  /**
   * Specifies details on how to format the Variable values.
   * <p>
   * This is an optional property.
   */
  @Pure
  public ValueFormat getFormat() {
    return this.format;
  }
  
  /**
   * Specifies details on how to format the Variable values.
   * <p>
   * This is an optional property.
   */
  public void setFormat(final ValueFormat format) {
    this.format = format;
  }
  
  @Override
  @Pure
  public String toString() {
    ToStringBuilder b = new ToStringBuilder(this);
    b.add("variablesReference", this.variablesReference);
    b.add("filter", this.filter);
    b.add("start", this.start);
    b.add("count", this.count);
    b.add("format", this.format);
    return b.toString();
  }
  
  @Override
  @Pure
  public boolean equals(final Object obj) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe type VariablesArguments is already defined in VariablesArguments.java.");
  }
  
  @Override
  @Pure
  public int hashCode() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe type VariablesArguments is already defined in VariablesArguments.java.");
  }
}
