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
import org.eclipse.lsp4j.Registration;
import org.eclipse.lsp4j.generator.JsonRpcData;
import org.eclipse.lsp4j.jsonrpc.validation.NonNull;

/**
 * The client/registerCapability request is sent from the server to the client to register
 * for a new capability on the client side. Not all clients need to support dynamic
 * capability registration. A client opts in via the dynamicRegistration property on the
 * specific client capabilities. A client can even provide dynamic registration for
 * capability A but not for capability B (see TextDocumentClientCapabilities as an example).
 */
/* @JsonRpcData */@SuppressWarnings("all")
public class RegistrationParams {
  @NonNull
  private List<Registration> registrations;
  
  public RegistrationParams() {
    this(new ArrayList<Registration>());
  }
  
  public RegistrationParams(@NonNull final List<Registration> registrations) {
    this.registrations = registrations;
  }
}
