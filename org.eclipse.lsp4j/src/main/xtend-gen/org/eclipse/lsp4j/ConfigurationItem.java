/**
 * Copyright (c) 2016 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.lsp4j;

import org.eclipse.lsp4j.generator.JsonRpcData;

/**
 * A ConfigurationItem consist of the configuration section to ask for and an additional scope URI.
 * The configuration section ask for is defined by the server and doesn’t necessarily need to
 * correspond to the configuration store used be the client. So a server might ask for a configuration
 * cpp.formatterOptions but the client stores the configuration in a XML store layout differently.
 * It is up to the client to do the necessary conversion. If a scope URI is provided the client
 * should return the setting scoped to the provided resource. If the client for example uses
 * EditorConfig to manage its settings the configuration should be returned for the passed resource
 * URI. If the client can’t provide a configuration setting for a given scope then null need to be
 * present in the returned array.
 * 
 * Since 3.6.0
 */
/* @JsonRpcData */@SuppressWarnings("all")
public class ConfigurationItem {
  /**
   * The scope to get the configuration section for.
   */
  private String scopeUri;
  
  /**
   * The configuration section asked for.
   */
  private String section;
}
