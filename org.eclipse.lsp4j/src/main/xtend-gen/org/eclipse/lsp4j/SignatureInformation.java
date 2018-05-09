/**
 * Copyright (c) 2016 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.lsp4j;

import java.util.List;
import org.eclipse.lsp4j.MarkupContent;
import org.eclipse.lsp4j.ParameterInformation;
import org.eclipse.lsp4j.generator.JsonRpcData;
import org.eclipse.lsp4j.jsonrpc.messages.Either;
import org.eclipse.lsp4j.jsonrpc.validation.NonNull;

/**
 * Represents the signature of something callable. A signature can have a label, like a function-name, a doc-comment, and
 * a set of parameters.
 */
/* @JsonRpcData */@SuppressWarnings("all")
public class SignatureInformation {
  /**
   * The label of this signature. Will be shown in the UI.
   */
  @NonNull
  private String label;
  
  /**
   * The human-readable doc-comment of this signature. Will be shown in the UI but can be omitted.
   */
  private Either<String, MarkupContent> documentation;
  
  /**
   * The parameters of this signature.
   */
  private List<ParameterInformation> parameters;
  
  public SignatureInformation() {
  }
  
  public SignatureInformation(@NonNull final String label) {
    this.label = label;
  }
  
  public SignatureInformation(@NonNull final String label, final String documentation, final List<ParameterInformation> parameters) {
    throw new Error("Unresolved compilation problems:"
      + "\nType mismatch: cannot convert from String to Either<String, MarkupContent>");
  }
  
  public SignatureInformation(@NonNull final String label, final MarkupContent documentation, final List<ParameterInformation> parameters) {
    throw new Error("Unresolved compilation problems:"
      + "\nType mismatch: cannot convert from MarkupContent to Either<String, MarkupContent>");
  }
}
