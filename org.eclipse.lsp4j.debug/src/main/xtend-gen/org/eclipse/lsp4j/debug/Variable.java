/**
 * Copyright (c) 2017 Kichwa Coders Ltd. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.lsp4j.debug;

import org.eclipse.lsp4j.debug.VariablePresentationHint;
import org.eclipse.lsp4j.generator.JsonRpcData;
import org.eclipse.lsp4j.jsonrpc.validation.NonNull;

/**
 * A Variable is a name/value pair.
 * <p>
 * Optionally a variable can have a 'type' that is shown if space permits or when hovering over the variable's
 * name.
 * <p>
 * An optional 'kind' is used to render additional properties of the variable, e.g. different icons can be used to
 * indicate that a variable is public or private.
 * <p>
 * If the value is structured (has children), a handle is provided to retrieve the children with the
 * VariablesRequest.
 * <p>
 * If the number of named or indexed children is large, the numbers should be returned via the optional
 * 'namedVariables' and 'indexedVariables' attributes.
 * <p>
 * The client can use this optional information to present the children in a paged UI and fetch them in chunks.
 */
/* @JsonRpcData */@SuppressWarnings("all")
public class Variable {
  /**
   * The variable's name.
   */
  @NonNull
  private String name;
  
  /**
   * The variable's value. This can be a multi-line text, e.g. for a function the body of a function.
   */
  @NonNull
  private String value;
  
  /**
   * The type of the variable's value. Typically shown in the UI when hovering over the value.
   * <p>
   * This is an optional property.
   */
  private String type;
  
  /**
   * Properties of a variable that can be used to determine how to render the variable in the UI.
   * <p>
   * This is an optional property.
   */
  private VariablePresentationHint presentationHint;
  
  /**
   * Optional evaluatable name of this variable which can be passed to the 'EvaluateRequest' to fetch the variable's
   * value.
   * <p>
   * This is an optional property.
   */
  private String evaluateName;
  
  /**
   * If variablesReference is > 0, the variable is structured and its children can be retrieved by passing
   * variablesReference to the VariablesRequest.
   */
  @NonNull
  private Long variablesReference;
  
  /**
   * The number of named child variables.
   * <p>
   * The client can use this optional information to present the children in a paged UI and fetch them in chunks.
   * <p>
   * This is an optional property.
   */
  private Long namedVariables;
  
  /**
   * The number of indexed child variables.
   * <p>
   * The client can use this optional information to present the children in a paged UI and fetch them in chunks.
   * <p>
   * This is an optional property.
   */
  private Long indexedVariables;
}
