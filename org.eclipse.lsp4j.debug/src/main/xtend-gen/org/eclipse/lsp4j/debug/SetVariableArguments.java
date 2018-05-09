/**
 * Copyright (c) 2017 Kichwa Coders Ltd. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.lsp4j.debug;

import org.eclipse.lsp4j.debug.ValueFormat;
import org.eclipse.lsp4j.jsonrpc.validation.NonNull;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

/**
 * Arguments for 'setVariable' request.
 */
@SuppressWarnings("all")
public class SetVariableArguments {
  /**
   * The reference of the variable container.
   */
  @NonNull
  private Long variablesReference;
  
  /**
   * The name of the variable.
   */
  @NonNull
  private String name;
  
  /**
   * The value of the variable.
   */
  @NonNull
  private String value;
  
  /**
   * Specifies details on how to format the response value.
   * <p>
   * This is an optional property.
   */
  private ValueFormat format;
  
  /**
   * The reference of the variable container.
   */
  @Pure
  @NonNull
  public Long getVariablesReference() {
    return this.variablesReference;
  }
  
  /**
   * The reference of the variable container.
   */
  public void setVariablesReference(@NonNull final Long variablesReference) {
    this.variablesReference = variablesReference;
  }
  
  /**
   * The name of the variable.
   */
  @Pure
  @NonNull
  public String getName() {
    return this.name;
  }
  
  /**
   * The name of the variable.
   */
  public void setName(@NonNull final String name) {
    this.name = name;
  }
  
  /**
   * The value of the variable.
   */
  @Pure
  @NonNull
  public String getValue() {
    return this.value;
  }
  
  /**
   * The value of the variable.
   */
  public void setValue(@NonNull final String value) {
    this.value = value;
  }
  
  /**
   * Specifies details on how to format the response value.
   * <p>
   * This is an optional property.
   */
  @Pure
  public ValueFormat getFormat() {
    return this.format;
  }
  
  /**
   * Specifies details on how to format the response value.
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
    b.add("name", this.name);
    b.add("value", this.value);
    b.add("format", this.format);
    return b.toString();
  }
  
  @Override
  @Pure
  public boolean equals(final Object obj) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe type SetVariableArguments is already defined in SetVariableArguments.java.");
  }
  
  @Override
  @Pure
  public int hashCode() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe type SetVariableArguments is already defined in SetVariableArguments.java.");
  }
}
