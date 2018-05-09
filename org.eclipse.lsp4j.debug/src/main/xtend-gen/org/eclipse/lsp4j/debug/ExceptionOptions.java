/**
 * Copyright (c) 2017 Kichwa Coders Ltd. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.lsp4j.debug;

import org.eclipse.lsp4j.debug.ExceptionBreakMode;
import org.eclipse.lsp4j.debug.ExceptionPathSegment;
import org.eclipse.lsp4j.generator.JsonRpcData;
import org.eclipse.lsp4j.jsonrpc.validation.NonNull;

/**
 * An ExceptionOptions assigns configuration options to a set of exceptions.
 */
/* @JsonRpcData */@SuppressWarnings("all")
public class ExceptionOptions {
  /**
   * A path that selects a single or multiple exceptions in a tree. If 'path' is missing, the whole tree is
   * selected. By convention the first segment of the path is a category that is used to group exceptions in the UI.
   * <p>
   * This is an optional property.
   */
  private ExceptionPathSegment[] path;
  
  /**
   * Condition when a thrown exception should result in a break.
   */
  @NonNull
  private ExceptionBreakMode breakMode;
}
