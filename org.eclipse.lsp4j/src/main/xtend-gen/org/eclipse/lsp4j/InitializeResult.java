/**
 * Copyright (c) 2016 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.lsp4j;

import org.eclipse.lsp4j.ServerCapabilities;
import org.eclipse.lsp4j.generator.JsonRpcData;
import org.eclipse.lsp4j.jsonrpc.validation.NonNull;

/* @JsonRpcData */@SuppressWarnings("all")
public class InitializeResult {
  /**
   * The capabilities the language server provides.
   */
  @NonNull
  private ServerCapabilities capabilities;
  
  public InitializeResult() {
  }
  
  public InitializeResult(@NonNull final ServerCapabilities capabilities) {
    this.capabilities = capabilities;
  }
}
