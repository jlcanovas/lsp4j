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
 * A notification sent from the client to the server to signal the change of configuration settings.
 */
/* @JsonRpcData */@SuppressWarnings("all")
public class DidChangeConfigurationParams {
  /**
   * The actual changed settings.
   */
  @NonNull
  @JsonAdapter(JsonElementTypeAdapter.Factory.class)
  private Object settings;
  
  public DidChangeConfigurationParams() {
  }
  
  public DidChangeConfigurationParams(@NonNull final Object settings) {
    this.settings = settings;
  }
}
