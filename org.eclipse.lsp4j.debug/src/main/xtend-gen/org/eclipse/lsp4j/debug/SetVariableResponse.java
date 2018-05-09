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
 * Response to 'setVariable' request.
 */
@SuppressWarnings("all")
public class SetVariableResponse {
  /**
   * The new value of the variable.
   */
  @NonNull
  private String value;
  
  /**
   * The type of the new value. Typically shown in the UI when hovering over the value.
   * <p>
   * This is an optional property.
   */
  private String type;
  
  /**
   * If variablesReference is > 0, the new value is structured and its children can be retrieved by passing
   * variablesReference to the VariablesRequest.
   * <p>
   * This is an optional property.
   */
  private Long variablesReference;
  
  /**
   * The number of named child variables.
   * <p>
   * The client can use this optional information to present the variables in a paged UI and fetch them in chunks.
   * <p>
   * This is an optional property.
   */
  private Long namedVariables;
  
  /**
   * The number of indexed child variables.
   * <p>
   * The client can use this optional information to present the variables in a paged UI and fetch them in chunks.
   * <p>
   * This is an optional property.
   */
  private Long indexedVariables;
  
  /**
   * The new value of the variable.
   */
  @Pure
  @NonNull
  public String getValue() {
    return this.value;
  }
  
  /**
   * The new value of the variable.
   */
  public void setValue(@NonNull final String value) {
    this.value = value;
  }
  
  /**
   * The type of the new value. Typically shown in the UI when hovering over the value.
   * <p>
   * This is an optional property.
   */
  @Pure
  public String getType() {
    return this.type;
  }
  
  /**
   * The type of the new value. Typically shown in the UI when hovering over the value.
   * <p>
   * This is an optional property.
   */
  public void setType(final String type) {
    this.type = type;
  }
  
  /**
   * If variablesReference is > 0, the new value is structured and its children can be retrieved by passing
   * variablesReference to the VariablesRequest.
   * <p>
   * This is an optional property.
   */
  @Pure
  public Long getVariablesReference() {
    return this.variablesReference;
  }
  
  /**
   * If variablesReference is > 0, the new value is structured and its children can be retrieved by passing
   * variablesReference to the VariablesRequest.
   * <p>
   * This is an optional property.
   */
  public void setVariablesReference(final Long variablesReference) {
    this.variablesReference = variablesReference;
  }
  
  /**
   * The number of named child variables.
   * <p>
   * The client can use this optional information to present the variables in a paged UI and fetch them in chunks.
   * <p>
   * This is an optional property.
   */
  @Pure
  public Long getNamedVariables() {
    return this.namedVariables;
  }
  
  /**
   * The number of named child variables.
   * <p>
   * The client can use this optional information to present the variables in a paged UI and fetch them in chunks.
   * <p>
   * This is an optional property.
   */
  public void setNamedVariables(final Long namedVariables) {
    this.namedVariables = namedVariables;
  }
  
  /**
   * The number of indexed child variables.
   * <p>
   * The client can use this optional information to present the variables in a paged UI and fetch them in chunks.
   * <p>
   * This is an optional property.
   */
  @Pure
  public Long getIndexedVariables() {
    return this.indexedVariables;
  }
  
  /**
   * The number of indexed child variables.
   * <p>
   * The client can use this optional information to present the variables in a paged UI and fetch them in chunks.
   * <p>
   * This is an optional property.
   */
  public void setIndexedVariables(final Long indexedVariables) {
    this.indexedVariables = indexedVariables;
  }
  
  @Override
  @Pure
  public String toString() {
    ToStringBuilder b = new ToStringBuilder(this);
    b.add("value", this.value);
    b.add("type", this.type);
    b.add("variablesReference", this.variablesReference);
    b.add("namedVariables", this.namedVariables);
    b.add("indexedVariables", this.indexedVariables);
    return b.toString();
  }
  
  @Override
  @Pure
  public boolean equals(final Object obj) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe type SetVariableResponse is already defined in SetVariableResponse.java.");
  }
  
  @Override
  @Pure
  public int hashCode() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe type SetVariableResponse is already defined in SetVariableResponse.java.");
  }
}
