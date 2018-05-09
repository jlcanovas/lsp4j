/**
 * Copyright (c) 2016 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.lsp4j;

import com.google.common.annotations.Beta;
import org.eclipse.lsp4j.generator.JsonRpcData;

/**
 * A resource change.
 * 
 * If both current and newUri has valid values this is considered to be a move operation.
 * If current has a valid value while newUri is null it is treated as a delete operation.
 * If current is null and newUri has a valid value a create operation is executed.
 */
/* @JsonRpcData */@Beta
@SuppressWarnings("all")
public class ResourceChange {
  /**
   * The Uri for current resource. Required for delete and move operations
   * otherwise it is null.
   */
  private String current;
  
  /**
   * The new uri for the resource. Required for create and move operations.
   * otherwise null.
   * 
   * Must be compatible with the current uri ie. must be a file
   * uri if current is not null and is a file uri.
   */
  private String newUri;
}
