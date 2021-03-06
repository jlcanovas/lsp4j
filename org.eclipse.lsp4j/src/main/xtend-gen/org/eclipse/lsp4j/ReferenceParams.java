/**
 * Copyright (c) 2016 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.lsp4j;

import org.eclipse.lsp4j.ReferenceContext;
import org.eclipse.lsp4j.TextDocumentPositionParams;
import org.eclipse.lsp4j.generator.JsonRpcData;
import org.eclipse.lsp4j.jsonrpc.validation.NonNull;

/**
 * The references request is sent from the client to the server to resolve project-wide references for the symbol
 * denoted by the given text document position.
 */
/* @JsonRpcData */@SuppressWarnings("all")
public class ReferenceParams extends TextDocumentPositionParams {
  @NonNull
  private ReferenceContext context;
  
  public ReferenceParams() {
  }
  
  public ReferenceParams(@NonNull final ReferenceContext context) {
    this.context = context;
  }
}
