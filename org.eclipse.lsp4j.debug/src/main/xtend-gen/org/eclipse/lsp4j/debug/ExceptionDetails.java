/**
 * Copyright (c) 2017 Kichwa Coders Ltd. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.lsp4j.debug;

import org.eclipse.lsp4j.generator.JsonRpcData;

/**
 * Detailed information about an exception that has occurred.
 */
/* @JsonRpcData */@SuppressWarnings("all")
public class ExceptionDetails {
  /**
   * Message contained in the exception.
   * <p>
   * This is an optional property.
   */
  private String message;
  
  /**
   * Short type name of the exception object.
   * <p>
   * This is an optional property.
   */
  private String typeName;
  
  /**
   * Fully-qualified type name of the exception object.
   * <p>
   * This is an optional property.
   */
  private String fullTypeName;
  
  /**
   * Optional expression that can be evaluated in the current scope to obtain the exception object.
   * <p>
   * This is an optional property.
   */
  private String evaluateName;
  
  /**
   * Stack trace at the time the exception was thrown.
   * <p>
   * This is an optional property.
   */
  private String stackTrace;
  
  /**
   * Details of the exception contained by this exception, if any.
   * <p>
   * This is an optional property.
   */
  private ExceptionDetails[] innerException;
}
