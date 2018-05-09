/**
 * Copyright (c) 2016 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.lsp4j;

import java.util.List;
import org.eclipse.lsp4j.generator.JsonRpcData;
import org.eclipse.lsp4j.jsonrpc.validation.NonNull;

/**
 * The workspace/executeCommand request is sent from the client to the server to trigger command
 * execution on the server. In most cases the server creates a WorkspaceEdit structure and applies
 * the changes to the workspace using the request workspace/applyEdit which is sent from the server
 * to the client.
 */
/* @JsonRpcData */@SuppressWarnings("all")
public class ExecuteCommandParams {
  /**
   * The identifier of the actual command handler.
   */
  @NonNull
  private String command;
  
  /**
   * Arguments that the command should be invoked with.
   * The arguments are typically specified when a command is returned from the server to the client.
   * Example requests that return a command are textDocument/codeAction or textDocument/codeLens.
   */
  private List<Object> arguments;
  
  public ExecuteCommandParams() {
  }
  
  public ExecuteCommandParams(@NonNull final String command, final List<Object> arguments) {
    this.command = command;
    this.arguments = arguments;
  }
}
