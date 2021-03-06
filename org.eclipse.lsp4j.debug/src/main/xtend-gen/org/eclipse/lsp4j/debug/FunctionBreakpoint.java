/**
 * Copyright (c) 2017 Kichwa Coders Ltd. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.lsp4j.debug;

import org.eclipse.lsp4j.generator.JsonRpcData;
import org.eclipse.lsp4j.jsonrpc.validation.NonNull;

/**
 * Properties of a breakpoint passed to the setFunctionBreakpoints request.
 */
/* @JsonRpcData */@SuppressWarnings("all")
public class FunctionBreakpoint {
  /**
   * The name of the function.
   */
  @NonNull
  private String name;
  
  /**
   * An optional expression for conditional breakpoints.
   * <p>
   * This is an optional property.
   */
  private String condition;
  
  /**
   * An optional expression that controls how many hits of the breakpoint are ignored. The backend is expected to
   * interpret the expression as needed.
   * <p>
   * This is an optional property.
   */
  private String hitCondition;
}
