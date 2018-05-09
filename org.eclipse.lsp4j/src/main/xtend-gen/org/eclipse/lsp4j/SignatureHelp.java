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
import org.eclipse.lsp4j.SignatureInformation;
import org.eclipse.lsp4j.generator.JsonRpcData;
import org.eclipse.lsp4j.jsonrpc.validation.NonNull;

/**
 * Signature help represents the signature of something callable. There can be multiple signature but only one
 * active and only one active parameter.
 */
/* @JsonRpcData */@SuppressWarnings("all")
public class SignatureHelp {
  /**
   * One or more signatures.
   */
  @NonNull
  private List<SignatureInformation> signatures;
  
  /**
   * The active signature. If omitted or the value lies outside the
   * range of `signatures` the value defaults to zero or is ignored if
   * `signatures.length === 0`. Whenever possible implementors should
   * make an active decision about the active signature and shouldn't
   * rely on a default value.
   * In future version of the protocol this property might become
   * mandantory to better express this.
   */
  private Integer activeSignature;
  
  /**
   * The active parameter of the active signature. If omitted or the value
   * lies outside the range of `signatures[activeSignature].parameters`
   * defaults to 0 if the active signature has parameters. If
   * the active signature has no parameters it is ignored.
   * In future version of the protocol this property might become
   * mandantory to better express the active parameter if the
   * active signature does have any.
   */
  private Integer activeParameter;
  
  public SignatureHelp() {
    ArrayList<SignatureInformation> _arrayList = new ArrayList<SignatureInformation>();
    this.signatures = _arrayList;
  }
  
  public SignatureHelp(@NonNull final List<SignatureInformation> signatures, final Integer activeSignature, final Integer activeParameter) {
    this.signatures = signatures;
    this.activeSignature = activeSignature;
    this.activeParameter = activeParameter;
  }
}
