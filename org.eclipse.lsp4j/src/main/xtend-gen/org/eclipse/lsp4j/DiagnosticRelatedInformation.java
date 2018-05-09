/**
 * Copyright (c) 2016 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.lsp4j;

import org.eclipse.lsp4j.Location;
import org.eclipse.lsp4j.generator.JsonRpcData;
import org.eclipse.lsp4j.jsonrpc.validation.NonNull;

/**
 * Represents a related message and source code location for a diagnostic. This should be
 * used to point to code locations that cause or related to a diagnostics, e.g when duplicating
 * a symbol in a scope.
 * 
 * Since 3.7.0
 */
/* @JsonRpcData */@SuppressWarnings("all")
public class DiagnosticRelatedInformation {
  /**
   * The location of this related diagnostic information.
   */
  @NonNull
  private Location location;
  
  /**
   * The message of this related diagnostic information.
   */
  @NonNull
  private String message;
  
  public DiagnosticRelatedInformation() {
  }
  
  public DiagnosticRelatedInformation(@NonNull final Location location, @NonNull final String message) {
    this.location = location;
    this.message = message;
  }
}
