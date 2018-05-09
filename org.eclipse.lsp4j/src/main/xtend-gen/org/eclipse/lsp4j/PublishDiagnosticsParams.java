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
import org.eclipse.lsp4j.Diagnostic;
import org.eclipse.lsp4j.generator.JsonRpcData;
import org.eclipse.lsp4j.jsonrpc.validation.NonNull;

/**
 * Diagnostics notification are sent from the server to the client to signal results of validation runs.
 */
/* @JsonRpcData */@SuppressWarnings("all")
public class PublishDiagnosticsParams {
  /**
   * The URI for which diagnostic information is reported.
   */
  @NonNull
  private String uri;
  
  /**
   * An array of diagnostic information items.
   */
  @NonNull
  private List<Diagnostic> diagnostics;
  
  public PublishDiagnosticsParams() {
    ArrayList<Diagnostic> _arrayList = new ArrayList<Diagnostic>();
    this.diagnostics = _arrayList;
  }
  
  public PublishDiagnosticsParams(@NonNull final String uri, @NonNull final List<Diagnostic> diagnostics) {
    this.uri = uri;
    this.diagnostics = diagnostics;
  }
}
