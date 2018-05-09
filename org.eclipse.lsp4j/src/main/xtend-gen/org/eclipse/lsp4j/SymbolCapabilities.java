/**
 * Copyright (c) 2016 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.lsp4j;

import org.eclipse.lsp4j.DynamicRegistrationCapabilities;
import org.eclipse.lsp4j.SymbolKindCapabilities;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

/**
 * Capabilities specific to the `workspace/symbol` request.
 */
@SuppressWarnings("all")
public class SymbolCapabilities extends DynamicRegistrationCapabilities {
  /**
   * Specific capabilities for the `SymbolKind` in the `workspace/symbol` request.
   */
  private SymbolKindCapabilities symbolKind;
  
  public SymbolCapabilities() {
  }
  
  public SymbolCapabilities(final Boolean dynamicRegistration) {
    super(dynamicRegistration);
  }
  
  public SymbolCapabilities(final SymbolKindCapabilities symbolKind) {
    this.symbolKind = symbolKind;
  }
  
  public SymbolCapabilities(final SymbolKindCapabilities symbolKind, final Boolean dynamicRegistration) {
    super(dynamicRegistration);
    this.symbolKind = symbolKind;
  }
  
  /**
   * Specific capabilities for the `SymbolKind` in the `workspace/symbol` request.
   */
  @Pure
  public SymbolKindCapabilities getSymbolKind() {
    return this.symbolKind;
  }
  
  /**
   * Specific capabilities for the `SymbolKind` in the `workspace/symbol` request.
   */
  public void setSymbolKind(final SymbolKindCapabilities symbolKind) {
    this.symbolKind = symbolKind;
  }
  
  @Override
  @Pure
  public String toString() {
    ToStringBuilder b = new ToStringBuilder(this);
    b.add("symbolKind", this.symbolKind);
    b.add("dynamicRegistration", getDynamicRegistration());
    return b.toString();
  }
  
  @Override
  @Pure
  public boolean equals(final Object obj) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe type SymbolCapabilities is already defined in SymbolCapabilities.java.");
  }
  
  @Override
  @Pure
  public int hashCode() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe type SymbolCapabilities is already defined in SymbolCapabilities.java.");
  }
}
