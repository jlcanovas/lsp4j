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
 * A GotoTarget describes a code location that can be used as a target in the 'goto' request.
 * <p>
 * The possible goto targets can be determined via the 'gotoTargets' request.
 */
/* @JsonRpcData */@SuppressWarnings("all")
public class GotoTarget {
  /**
   * Unique identifier for a goto target. This is used in the goto request.
   */
  @NonNull
  private Long id;
  
  /**
   * The name of the goto target (shown in the UI).
   */
  @NonNull
  private String label;
  
  /**
   * The line of the goto target.
   */
  @NonNull
  private Long line;
  
  /**
   * An optional column of the goto target.
   * <p>
   * This is an optional property.
   */
  private Long column;
  
  /**
   * An optional end line of the range covered by the goto target.
   * <p>
   * This is an optional property.
   */
  private Long endLine;
  
  /**
   * An optional end column of the range covered by the goto target.
   * <p>
   * This is an optional property.
   */
  private Long endColumn;
}
