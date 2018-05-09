/**
 * Copyright (c) 2016 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.lsp4j;

import org.eclipse.lsp4j.generator.JsonRpcData;
import org.eclipse.lsp4j.jsonrpc.validation.NonNull;

/**
 * General parameters to unregister a capability.
 */
/* @JsonRpcData */@SuppressWarnings("all")
public class Unregistration {
  /**
   * The id used to unregister the request or notification. Usually an id
   * provided during the register request.
   */
  @NonNull
  private String id;
  
  /**
   * The method / capability to unregister for.
   */
  @NonNull
  private String method;
  
  public Unregistration() {
  }
  
  public Unregistration(@NonNull final String id, @NonNull final String method) {
    this.id = id;
    this.method = method;
  }
}
