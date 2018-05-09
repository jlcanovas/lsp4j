/**
 * Copyright (c) 2017 Kichwa Coders Ltd. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.lsp4j.debug;

import org.eclipse.lsp4j.debug.VariablePresentationHint;
import org.eclipse.lsp4j.jsonrpc.validation.NonNull;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

/**
 * Response to 'evaluate' request.
 */
@SuppressWarnings("all")
public class EvaluateResponse {
  /**
   * The result of the evaluate request.
   */
  @NonNull
  private String result;
  
  /**
   * The optional type of the evaluate result.
   * <p>
   * This is an optional property.
   */
  private String type;
  
  /**
   * Properties of a evaluate result that can be used to determine how to render the result in the UI.
   * <p>
   * This is an optional property.
   */
  private VariablePresentationHint presentationHint;
  
  /**
   * If variablesReference is > 0, the evaluate result is structured and its children can be retrieved by passing
   * variablesReference to the VariablesRequest.
   */
  @NonNull
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
   * The result of the evaluate request.
   */
  @Pure
  @NonNull
  public String getResult() {
    return this.result;
  }
  
  /**
   * The result of the evaluate request.
   */
  public void setResult(@NonNull final String result) {
    this.result = result;
  }
  
  /**
   * The optional type of the evaluate result.
   * <p>
   * This is an optional property.
   */
  @Pure
  public String getType() {
    return this.type;
  }
  
  /**
   * The optional type of the evaluate result.
   * <p>
   * This is an optional property.
   */
  public void setType(final String type) {
    this.type = type;
  }
  
  /**
   * Properties of a evaluate result that can be used to determine how to render the result in the UI.
   * <p>
   * This is an optional property.
   */
  @Pure
  public VariablePresentationHint getPresentationHint() {
    return this.presentationHint;
  }
  
  /**
   * Properties of a evaluate result that can be used to determine how to render the result in the UI.
   * <p>
   * This is an optional property.
   */
  public void setPresentationHint(final VariablePresentationHint presentationHint) {
    this.presentationHint = presentationHint;
  }
  
  /**
   * If variablesReference is > 0, the evaluate result is structured and its children can be retrieved by passing
   * variablesReference to the VariablesRequest.
   */
  @Pure
  @NonNull
  public Long getVariablesReference() {
    return this.variablesReference;
  }
  
  /**
   * If variablesReference is > 0, the evaluate result is structured and its children can be retrieved by passing
   * variablesReference to the VariablesRequest.
   */
  public void setVariablesReference(@NonNull final Long variablesReference) {
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
    b.add("result", this.result);
    b.add("type", this.type);
    b.add("presentationHint", this.presentationHint);
    b.add("variablesReference", this.variablesReference);
    b.add("namedVariables", this.namedVariables);
    b.add("indexedVariables", this.indexedVariables);
    return b.toString();
  }
  
  @Override
  @Pure
  public boolean equals(final Object obj) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe type EvaluateResponse is already defined in EvaluateResponse.java.");
  }
  
  @Override
  @Pure
  public int hashCode() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe type EvaluateResponse is already defined in EvaluateResponse.java.");
  }
}
