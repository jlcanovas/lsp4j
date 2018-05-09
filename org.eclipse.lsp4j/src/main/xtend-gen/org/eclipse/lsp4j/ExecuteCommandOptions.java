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
import org.eclipse.lsp4j.generator.JsonRpcData;
import org.eclipse.lsp4j.jsonrpc.validation.NonNull;

/**
 * Execute command options.
 */
/* @JsonRpcData */@SuppressWarnings("all")
public class ExecuteCommandOptions {
  /**
   * The commands to be executed on the server
   */
  @NonNull
  private List<String> commands;
  
  public ExecuteCommandOptions() {
    this(new ArrayList<String>());
  }
  
  public ExecuteCommandOptions(@NonNull final List<String> commands) {
    this.commands = commands;
  }
}
