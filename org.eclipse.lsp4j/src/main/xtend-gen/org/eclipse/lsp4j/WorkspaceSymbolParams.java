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
 * The parameters of a Workspace Symbol Request.
 */
/* @JsonRpcData */@SuppressWarnings("all")
public class WorkspaceSymbolParams {
  /**
   * A non-empty query string
   */
  @NonNull
  private String query;
  
  public WorkspaceSymbolParams() {
  }
  
  public WorkspaceSymbolParams(@NonNull final String query) {
    this.query = query;
  }
}
