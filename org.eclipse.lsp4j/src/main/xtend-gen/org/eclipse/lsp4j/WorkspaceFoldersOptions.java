/**
 * Copyright (c) 2016 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.lsp4j;

import org.eclipse.lsp4j.generator.JsonRpcData;
import org.eclipse.lsp4j.jsonrpc.messages.Either;

/**
 * The server supports workspace folder.
 * 
 * Since 3.6.0
 */
/* @JsonRpcData */@SuppressWarnings("all")
public class WorkspaceFoldersOptions {
  /**
   * The server has support for workspace folders
   */
  private Boolean supported;
  
  /**
   * Whether the server wants to receive workspace folder
   * change notifications.
   * 
   * If a string is provided, the string is treated as an ID
   * under which the notification is registed on the client
   * side. The ID can be used to unregister for these events
   * using the `client/unregisterCapability` request.
   */
  private Either<String, Boolean> changeNotifications;
}
