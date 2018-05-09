/**
 * Copyright (c) 2016 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.lsp4j;

import org.eclipse.lsp4j.WorkspaceEdit;
import org.eclipse.lsp4j.generator.JsonRpcData;
import org.eclipse.lsp4j.jsonrpc.validation.NonNull;

/**
 * The workspace/applyEdit request is sent from the server to the client to modify resource on the client side.
 */
/* @JsonRpcData */@SuppressWarnings("all")
public class ApplyWorkspaceEditParams {
  /**
   * The edits to apply.
   */
  @NonNull
  private WorkspaceEdit edit;
  
  /**
   * An optional label of the workspace edit. This label is
   * presented in the user interface for example on an undo
   * stack to undo the workspace edit.
   */
  private String label;
  
  public ApplyWorkspaceEditParams() {
  }
  
  public ApplyWorkspaceEditParams(@NonNull final WorkspaceEdit edit) {
    this.edit = edit;
  }
  
  public ApplyWorkspaceEditParams(@NonNull final WorkspaceEdit edit, final String label) {
    this.edit = edit;
    this.label = label;
  }
}
