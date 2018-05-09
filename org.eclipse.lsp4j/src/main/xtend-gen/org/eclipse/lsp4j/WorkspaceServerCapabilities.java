/**
 * Copyright (c) 2016 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.lsp4j;

import org.eclipse.lsp4j.WorkspaceFoldersOptions;
import org.eclipse.lsp4j.generator.JsonRpcData;

/**
 * Workspace specific server capabilities
 */
/* @JsonRpcData */@SuppressWarnings("all")
public class WorkspaceServerCapabilities {
  /**
   * The server supports workspace folder.
   * 
   * Since 3.6.0
   */
  private WorkspaceFoldersOptions workspaceFolders;
  
  public WorkspaceServerCapabilities() {
  }
  
  public WorkspaceServerCapabilities(final WorkspaceFoldersOptions workspaceFolders) {
    this.workspaceFolders = workspaceFolders;
  }
}
