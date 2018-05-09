/**
 * Copyright (c) 2017 Kichwa Coders Ltd. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.lsp4j.debug;

import org.eclipse.lsp4j.debug.ValueFormat;
import org.eclipse.lsp4j.generator.JsonRpcData;

/**
 * Provides formatting information for a stack frame.
 */
/* @JsonRpcData */@SuppressWarnings("all")
public class StackFrameFormat extends ValueFormat {
  /**
   * Displays parameters for the stack frame.
   * <p>
   * This is an optional property.
   */
  private Boolean parameters;
  
  /**
   * Displays the types of parameters for the stack frame.
   * <p>
   * This is an optional property.
   */
  private Boolean parameterTypes;
  
  /**
   * Displays the names of parameters for the stack frame.
   * <p>
   * This is an optional property.
   */
  private Boolean parameterNames;
  
  /**
   * Displays the values of parameters for the stack frame.
   * <p>
   * This is an optional property.
   */
  private Boolean parameterValues;
  
  /**
   * Displays the line number of the stack frame.
   * <p>
   * This is an optional property.
   */
  private Boolean line;
  
  /**
   * Displays the module of the stack frame.
   * <p>
   * This is an optional property.
   */
  private Boolean module;
  
  /**
   * Includes all stack frames, including those the debug adapter might otherwise hide.
   * <p>
   * This is an optional property.
   */
  private Boolean includeAll;
}
