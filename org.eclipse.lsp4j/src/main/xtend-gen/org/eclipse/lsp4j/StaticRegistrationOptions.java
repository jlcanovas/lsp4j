/**
 * Copyright (c) 2016 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.lsp4j;

import org.eclipse.lsp4j.TextDocumentRegistrationOptions;
import org.eclipse.lsp4j.generator.JsonRpcData;

/**
 * Static registration options to be returned in the initialize request.
 */
/* @JsonRpcData */@SuppressWarnings("all")
public class StaticRegistrationOptions extends TextDocumentRegistrationOptions {
  /**
   * The id used to register the request. The id can be used to deregister
   * the request again. See also Registration#id.
   */
  private String id;
  
  public StaticRegistrationOptions() {
  }
  
  public StaticRegistrationOptions(final String id) {
    this.id = id;
  }
}
