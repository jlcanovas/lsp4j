/**
 * Copyright (c) 2017 Kichwa Coders Ltd. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.lsp4j.debug;

import org.eclipse.lsp4j.debug.Source;
import org.eclipse.lsp4j.debug.StackFramePresentationHint;
import org.eclipse.lsp4j.generator.JsonRpcData;
import org.eclipse.lsp4j.jsonrpc.messages.Either;
import org.eclipse.lsp4j.jsonrpc.validation.NonNull;

/**
 * A Stackframe contains the source location.
 */
/* @JsonRpcData */@SuppressWarnings("all")
public class StackFrame {
  /**
   * An identifier for the stack frame. It must be unique across all threads. This id can be used to retrieve the
   * scopes of the frame with the 'scopesRequest' or to restart the execution of a stackframe.
   */
  @NonNull
  private Long id;
  
  /**
   * The name of the stack frame, typically a method name.
   */
  @NonNull
  private String name;
  
  /**
   * The optional source of the frame.
   * <p>
   * This is an optional property.
   */
  private Source source;
  
  /**
   * The line within the file of the frame. If source is null or doesn't exist, line is 0 and must be ignored.
   */
  @NonNull
  private Long line;
  
  /**
   * The column within the line. If source is null or doesn't exist, column is 0 and must be ignored.
   */
  @NonNull
  private Long column;
  
  /**
   * An optional end line of the range covered by the stack frame.
   * <p>
   * This is an optional property.
   */
  private Long endLine;
  
  /**
   * An optional end column of the range covered by the stack frame.
   * <p>
   * This is an optional property.
   */
  private Long endColumn;
  
  /**
   * The module associated with this frame, if any.
   * <p>
   * This is an optional property.
   */
  private Either<Long, String> moduleId;
  
  /**
   * An optional hint for how to present this frame in the UI. A value of 'label' can be used to indicate that the
   * frame is an artificial frame that is used as a visual label or separator. A value of 'subtle' can be used to
   * change the appearance of a frame in a 'subtle' way.
   * <p>
   * This is an optional property.
   */
  private StackFramePresentationHint presentationHint;
}
