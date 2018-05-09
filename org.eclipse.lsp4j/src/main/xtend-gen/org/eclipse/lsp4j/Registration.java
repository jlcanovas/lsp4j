/**
 * Copyright (c) 2016 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.lsp4j;

import com.google.gson.annotations.JsonAdapter;
import org.eclipse.lsp4j.generator.JsonRpcData;
import org.eclipse.lsp4j.jsonrpc.json.adapters.JsonElementTypeAdapter;
import org.eclipse.lsp4j.jsonrpc.validation.NonNull;

/**
 * General parameters to register for a capability.
 */
/* @JsonRpcData */@SuppressWarnings("all")
public class Registration {
  /**
   * The id used to register the request. The id can be used to deregister
   * the request again.
   */
  @NonNull
  private String id;
  
  /**
   * The method / capability to register for.
   */
  @NonNull
  private String method;
  
  /**
   * Options necessary for the registration.
   */
  @JsonAdapter(JsonElementTypeAdapter.Factory.class)
  private Object registerOptions;
  
  public Registration() {
  }
  
  public Registration(@NonNull final String id, @NonNull final String method) {
    this.id = id;
    this.method = method;
  }
  
  public Registration(@NonNull final String id, @NonNull final String method, final Object registerOptions) {
    this.id = id;
    this.method = method;
    this.registerOptions = registerOptions;
  }
}
