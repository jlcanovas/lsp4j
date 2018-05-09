/**
 * Copyright (c) 2016 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.lsp4j;

import java.util.List;
import org.eclipse.lsp4j.CompletionItemKind;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

@SuppressWarnings("all")
public class CompletionItemKindCapabilities {
  /**
   * The completion item kind values the client supports. When this
   * property exists the client also guarantees that it will
   * handle values outside its set gracefully and falls back
   * to a default value when unknown.
   * 
   * If this property is not present the client only supports
   * the completion items kinds from `Text` to `Reference` as defined in
   * the initial version of the protocol.
   */
  private List<CompletionItemKind> valueSet;
  
  public CompletionItemKindCapabilities() {
  }
  
  public CompletionItemKindCapabilities(final List<CompletionItemKind> valueSet) {
    this.valueSet = valueSet;
  }
  
  /**
   * The completion item kind values the client supports. When this
   * property exists the client also guarantees that it will
   * handle values outside its set gracefully and falls back
   * to a default value when unknown.
   * 
   * If this property is not present the client only supports
   * the completion items kinds from `Text` to `Reference` as defined in
   * the initial version of the protocol.
   */
  @Pure
  public List<CompletionItemKind> getValueSet() {
    return this.valueSet;
  }
  
  /**
   * The completion item kind values the client supports. When this
   * property exists the client also guarantees that it will
   * handle values outside its set gracefully and falls back
   * to a default value when unknown.
   * 
   * If this property is not present the client only supports
   * the completion items kinds from `Text` to `Reference` as defined in
   * the initial version of the protocol.
   */
  public void setValueSet(final List<CompletionItemKind> valueSet) {
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
      + "\nThe type CompletionItemKindCapabilities is already defined in CompletionItemKindCapabilities.java.");
  }
  
  @Override
  @Pure
  public int hashCode() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe type CompletionItemKindCapabilities is already defined in CompletionItemKindCapabilities.java.");
  }
}
