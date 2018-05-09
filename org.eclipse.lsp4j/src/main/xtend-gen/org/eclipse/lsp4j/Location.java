/**
 * Copyright (c) 2016 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.lsp4j;

import org.eclipse.lsp4j.Range;
import org.eclipse.lsp4j.generator.JsonRpcData;
import org.eclipse.lsp4j.jsonrpc.validation.NonNull;

/**
 * Represents a location inside a resource, such as a line inside a text file.
 */
/* @JsonRpcData */@SuppressWarnings("all")
public class Location {
  @NonNull
  private String uri;
  
  @NonNull
  private Range range;
  
  public Location() {
  }
  
  public Location(@NonNull final String uri, @NonNull final Range range) {
    this.uri = uri;
    this.range = range;
  }
}
