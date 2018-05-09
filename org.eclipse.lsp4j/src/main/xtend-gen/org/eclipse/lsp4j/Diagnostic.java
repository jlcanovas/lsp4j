/**
 * Copyright (c) 2016 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.lsp4j;

import java.util.List;
import org.eclipse.lsp4j.DiagnosticRelatedInformation;
import org.eclipse.lsp4j.DiagnosticSeverity;
import org.eclipse.lsp4j.Range;
import org.eclipse.lsp4j.generator.JsonRpcData;
import org.eclipse.lsp4j.jsonrpc.validation.NonNull;

/**
 * Represents a diagnostic, such as a compiler error or warning. Diagnostic objects are only valid in the scope of a resource.
 */
/* @JsonRpcData */@SuppressWarnings("all")
public class Diagnostic {
  /**
   * The range at which the message applies
   */
  @NonNull
  private Range range;
  
  /**
   * The diagnostic's severity. Can be omitted. If omitted it is up to the client to interpret diagnostics as error,
   * warning, info or hint.
   */
  private DiagnosticSeverity severity;
  
  /**
   * The diagnostic's code. Can be omitted.
   */
  private String code;
  
  /**
   * A human-readable string describing the source of this diagnostic, e.g. 'typescript' or 'super lint'.
   */
  private String source;
  
  /**
   * The diagnostic's message.
   */
  @NonNull
  private String message;
  
  /**
   * An array of related diagnostic information, e.g. when symbol-names within a scope collide
   * all definitions can be marked via this property.
   * 
   * Since 3.7.0
   */
  private List<DiagnosticRelatedInformation> relatedInformation;
  
  public Diagnostic() {
  }
  
  public Diagnostic(@NonNull final Range range, @NonNull final String message) {
    this.range = range;
    this.message = message;
  }
  
  public Diagnostic(@NonNull final Range range, @NonNull final String message, final DiagnosticSeverity severity, final String source) {
    this(range, message);
    this.severity = severity;
    this.source = source;
  }
  
  public Diagnostic(@NonNull final Range range, @NonNull final String message, final DiagnosticSeverity severity, final String source, final String code) {
    this(range, message, severity, source);
    this.code = code;
  }
}
