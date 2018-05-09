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
import org.eclipse.lsp4j.Unregistration;
import org.eclipse.lsp4j.generator.JsonRpcData;
import org.eclipse.lsp4j.jsonrpc.validation.NonNull;

/**
 * The client/unregisterCapability request is sent from the server to the client to unregister
 * a previously registered capability.
 */
/* @JsonRpcData */@SuppressWarnings("all")
public class UnregistrationParams {
  @NonNull
  private List<Unregistration> unregisterations;
  
  public UnregistrationParams() {
    this(new ArrayList<Unregistration>());
  }
  
  public UnregistrationParams(@NonNull final List<Unregistration> unregisterations) {
    this.unregisterations = unregisterations;
  }
}
