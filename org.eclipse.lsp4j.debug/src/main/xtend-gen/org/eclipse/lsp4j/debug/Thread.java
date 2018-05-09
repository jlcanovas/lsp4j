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
 * A Thread
 */
/* @JsonRpcData */@SuppressWarnings("all")
public class Thread {
  /**
   * Unique identifier for the thread.
   */
  @NonNull
  private Long id;
  
  /**
   * A name of the thread.
   */
  @NonNull
  private String name;
}
