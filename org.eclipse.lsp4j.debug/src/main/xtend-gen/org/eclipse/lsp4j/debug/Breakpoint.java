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
 * Information about a Breakpoint created in setBreakpoints or setFunctionBreakpoints.
 */
/* @JsonRpcData */@SuppressWarnings("all")
public class Breakpoint {
  /**
   * An optional unique identifier for the breakpoint.
   * <p>
   * This is an optional property.
   */
  private Long id;
  
  /**
   * If true breakpoint could be set (but not necessarily at the desired location).
   */
  @NonNull
  private Boolean verified;
  
  /**
   * An optional message about the state of the breakpoint. This is shown to the user and can be used to explain why
   * a breakpoint could not be verified.
   * <p>
   * This is an optional property.
   */
  private String message;
  
  /**
   * The source where the breakpoint is located.
   * <p>
   * This is an optional property.
   */
  private Source source;
  
  /**
   * The start line of the actual range covered by the breakpoint.
   * <p>
   * This is an optional property.
   */
  private Long line;
  
  /**
   * An optional start column of the actual range covered by the breakpoint.
   * <p>
   * This is an optional property.
   */
  private Long column;
  
  /**
   * An optional end line of the actual range covered by the breakpoint.
   * <p>
   * This is an optional property.
   */
  private Long endLine;
  
  /**
   * An optional end column of the actual range covered by the breakpoint. If no end line is given, then the end
   * column is assumed to be in the start line.
   * <p>
   * This is an optional property.
   */
  private Long endColumn;
}
