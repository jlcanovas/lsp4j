/**
 * Copyright (c) 2017 Kichwa Coders Ltd. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.lsp4j.debug;

import org.eclipse.lsp4j.debug.Source;
import org.eclipse.lsp4j.generator.JsonRpcData;
import org.eclipse.lsp4j.jsonrpc.validation.NonNull;

/**
 * A Scope is a named container for variables. Optionally a scope can map to a source or a range within a source.
 */
/* @JsonRpcData */@SuppressWarnings("all")
public class Scope {
  /**
   * Name of the scope such as 'Arguments', 'Locals'.
   */
  @NonNull
  private String name;
  
  /**
   * The variables of this scope can be retrieved by passing the value of variablesReference to the
   * VariablesRequest.
   */
  @NonNull
  private Long variablesReference;
  
  /**
   * The number of named variables in this scope.
   * <p>
   * The client can use this optional information to present the variables in a paged UI and fetch them in chunks.
   * <p>
   * This is an optional property.
   */
  private Long namedVariables;
  
  /**
   * The number of indexed variables in this scope.
   * <p>
   * The client can use this optional information to present the variables in a paged UI and fetch them in chunks.
   * <p>
   * This is an optional property.
   */
  private Long indexedVariables;
  
  /**
   * If true, the number of variables in this scope is large or expensive to retrieve.
   */
  @NonNull
  private Boolean expensive;
  
  /**
   * Optional source for this scope.
   * <p>
   * This is an optional property.
   */
  private Source source;
  
  /**
   * Optional start line of the range covered by this scope.
   * <p>
   * This is an optional property.
   */
  private Long line;
  
  /**
   * Optional start column of the range covered by this scope.
   * <p>
   * This is an optional property.
   */
  private Long column;
  
  /**
   * Optional end line of the range covered by this scope.
   * <p>
   * This is an optional property.
   */
  private Long endLine;
  
  /**
   * Optional end column of the range covered by this scope.
   * <p>
   * This is an optional property.
   */
  private Long endColumn;
}
