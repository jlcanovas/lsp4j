/**
 * Copyright (c) 2016 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.lsp4j;

import org.eclipse.lsp4j.WorkspaceFoldersChangeEvent;
import org.eclipse.lsp4j.generator.JsonRpcData;
import org.eclipse.lsp4j.jsonrpc.validation.NonNull;

/**
 * The workspace/didChangeWorkspaceFolders notification is sent from the client to the server to
 * inform the server about workspace folder configuration changes. The notification is sent by
 * default if both ServerCapabilities/workspace/workspaceFolders and
 * ClientCapabilities/workspace/workspaceFolders are true; or if the server has registered to
 * receive this notification it first.
 */
/* @JsonRpcData */@SuppressWarnings("all")
public class DidChangeWorkspaceFoldersParams {
  /**
   * The actual workspace folder change event.
   */
  @NonNull
  private WorkspaceFoldersChangeEvent event;
  
  public DidChangeWorkspaceFoldersParams() {
  }
  
  public DidChangeWorkspaceFoldersParams(@NonNull final WorkspaceFoldersChangeEvent event) {
    this.event = event;
  }
}
