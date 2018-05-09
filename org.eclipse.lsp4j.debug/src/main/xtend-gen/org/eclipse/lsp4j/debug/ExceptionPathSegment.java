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
 * An ExceptionPathSegment represents a segment in a path that is used to match leafs or nodes in a tree of
 * exceptions. If a segment consists of more than one name, it matches the names provided if 'negate' is false or
 * missing or it matches anything except the names provided if 'negate' is true.
 */
/* @JsonRpcData */@SuppressWarnings("all")
public class ExceptionPathSegment {
  /**
   * If false or missing this segment matches the names provided, otherwise it matches anything except the names
   * provided.
   * <p>
   * This is an optional property.
   */
  private Boolean negate;
  
  /**
   * Depending on the value of 'negate' the names that should match or not match.
   */
  @NonNull
  private String[] names;
}
