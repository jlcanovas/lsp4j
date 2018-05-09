/**
 * Copyright (c) 2016 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.lsp4j;

import java.util.List;
import org.eclipse.lsp4j.ConfigurationItem;
import org.eclipse.lsp4j.generator.JsonRpcData;
import org.eclipse.lsp4j.jsonrpc.validation.NonNull;

/**
 * The workspace/configuration request is sent from the server to the client to fetch configuration
 * settings from the client. The request can fetch n configuration settings in one roundtrip.
 * The order of the returned configuration settings correspond to the order of the passed
 * ConfigurationItems (e.g. the first item in the response is the result for the first
 * configuration item in the params).
 * 
 * Since 3.6.0
 */
/* @JsonRpcData */@SuppressWarnings("all")
public class ConfigurationParams {
  @NonNull
  private List<ConfigurationItem> items;
  
  public ConfigurationParams() {
  }
  
  public ConfigurationParams(@NonNull final List<ConfigurationItem> items) {
    this.items = items;
  }
}
