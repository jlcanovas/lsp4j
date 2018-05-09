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
 * The workspace/workspaceFolders request is sent from the server to the client to fetch
 * the current open list of workspace folders. Returns null in the response if only a single
 * file is open in the tool. Returns an empty array if a workspace is open but no folders
 * are configured.
 */
/* @JsonRpcData */@SuppressWarnings("all")
public class WorkspaceFolder {
  /**
   * The associated URI for this workspace folder.
   */
  @NonNull
  private String uri;
  
  /**
   * The name of the workspace folder. Defaults to the uri's basename.
   */
  private String name;
  
  public WorkspaceFolder() {
  }
  
  public WorkspaceFolder(@NonNull final String uri) {
    this.uri = uri;
  }
  
  public WorkspaceFolder(@NonNull final String uri, final String name) {
    this.uri = uri;
    this.name = name;
  }
}
