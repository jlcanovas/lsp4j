/**
 * Copyright (c) 2016 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.lsp4j;

import java.util.List;
import org.eclipse.lsp4j.SymbolKind;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

/**
 * Specific capabilities for the `SymbolKind`.
 */
@SuppressWarnings("all")
public class SymbolKindCapabilities {
  /**
   * The symbol kind values the client supports. When this
   * property exists the client also guarantees that it will
   * handle values outside its set gracefully and falls back
   * to a default value when unknown.
   * 
   * If this property is not present the client only supports
   * the symbol kinds from `File` to `Array` as defined in
   * the initial version of the protocol.
   */
  private List<SymbolKind> valueSet;
  
  public SymbolKindCapabilities() {
  }
  
  public SymbolKindCapabilities(final List<SymbolKind> valueSet) {
    this.valueSet = valueSet;
  }
  
  /**
   * The symbol kind values the client supports. When this
   * property exists the client also guarantees that it will
   * handle values outside its set gracefully and falls back
   * to a default value when unknown.
   * 
   * If this property is not present the client only supports
   * the symbol kinds from `File` to `Array` as defined in
   * the initial version of the protocol.
   */
  @Pure
  public List<SymbolKind> getValueSet() {
    return this.valueSet;
  }
  
  /**
   * The symbol kind values the client supports. When this
   * property exists the client also guarantees that it will
   * handle values outside its set gracefully and falls back
   * to a default value when unknown.
   * 
   * If this property is not present the client only supports
   * the symbol kinds from `File` to `Array` as defined in
   * the initial version of the protocol.
   */
  public void setValueSet(final List<SymbolKind> valueSet) {
    this.valueSet = valueSet;
  }
  
  @Override
  @Pure
  public String toString() {
    ToStringBuilder b = new ToStringBuilder(this);
    b.add("valueSet", this.valueSet);
    return b.toString();
  }
  
  @Override
  @Pure
  public boolean equals(final Object obj) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe type SymbolKindCapabilities is already defined in SymbolKindCapabilities.java.");
  }
  
  @Override
  @Pure
  public int hashCode() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe type SymbolKindCapabilities is already defined in SymbolKindCapabilities.java.");
  }
}
