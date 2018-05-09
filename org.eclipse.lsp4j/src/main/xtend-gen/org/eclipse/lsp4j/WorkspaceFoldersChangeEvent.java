/**
 * Copyright (c) 2016 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.lsp4j;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.lsp4j.WorkspaceFolder;
import org.eclipse.lsp4j.generator.JsonRpcData;
import org.eclipse.lsp4j.jsonrpc.validation.NonNull;

/**
 * The workspace folder change event.
 */
/* @JsonRpcData */@SuppressWarnings("all")
public class WorkspaceFoldersChangeEvent {
  /**
   * The array of added workspace folders
   */
  @NonNull
  private List<WorkspaceFolder> added = new ArrayList<WorkspaceFolder>();
  
  /**
   * The array of the removed workspace folders
   */
  @NonNull
  private List<WorkspaceFolder> removed = new ArrayList<WorkspaceFolder>();
  
  public WorkspaceFoldersChangeEvent() {
  }
  
  public WorkspaceFoldersChangeEvent(@NonNull final List<WorkspaceFolder> added, @NonNull final List<WorkspaceFolder> removed) {
    this.added = added;
    this.removed = removed;
  }
}
