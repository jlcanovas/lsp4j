/**
 * Copyright (c) 2016 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.lsp4j;

import org.eclipse.lsp4j.CompletionItemCapabilities;
import org.eclipse.lsp4j.CompletionItemKindCapabilities;
import org.eclipse.lsp4j.DynamicRegistrationCapabilities;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

/**
 * Capabilities specific to the `textDocument/completion`
 */
@SuppressWarnings("all")
public class CompletionCapabilities extends DynamicRegistrationCapabilities {
  /**
   * The client supports the following `CompletionItem` specific
   * capabilities.
   */
  private CompletionItemCapabilities completionItem;
  
  /**
   * The client supports the following `CompletionItemKind` specific
   * capabilities.
   */
  private CompletionItemKindCapabilities completionItemKind;
  
  /**
   * The client supports sending additional context information for a
   * `textDocument/completion` request.
   */
  private Boolean contextSupport;
  
  public CompletionCapabilities() {
  }
  
  public CompletionCapabilities(final CompletionItemCapabilities completionItem) {
    this.completionItem = completionItem;
  }
  
  public CompletionCapabilities(final CompletionItemKindCapabilities completionItemKind) {
    this.completionItemKind = completionItemKind;
  }
  
  public CompletionCapabilities(final Boolean contextSupport) {
    this.contextSupport = contextSupport;
  }
  
  /**
   * The client supports the following `CompletionItem` specific
   * capabilities.
   */
  @Pure
  public CompletionItemCapabilities getCompletionItem() {
    return this.completionItem;
  }
  
  /**
   * The client supports the following `CompletionItem` specific
   * capabilities.
   */
  public void setCompletionItem(final CompletionItemCapabilities completionItem) {
    this.completionItem = completionItem;
  }
  
  /**
   * The client supports the following `CompletionItemKind` specific
   * capabilities.
   */
  @Pure
  public CompletionItemKindCapabilities getCompletionItemKind() {
    return this.completionItemKind;
  }
  
  /**
   * The client supports the following `CompletionItemKind` specific
   * capabilities.
   */
  public void setCompletionItemKind(final CompletionItemKindCapabilities completionItemKind) {
    this.completionItemKind = completionItemKind;
  }
  
  /**
   * The client supports sending additional context information for a
   * `textDocument/completion` request.
   */
  @Pure
  public Boolean getContextSupport() {
    return this.contextSupport;
  }
  
  /**
   * The client supports sending additional context information for a
   * `textDocument/completion` request.
   */
  public void setContextSupport(final Boolean contextSupport) {
    this.contextSupport = contextSupport;
  }
  
  @Override
  @Pure
  public String toString() {
    ToStringBuilder b = new ToStringBuilder(this);
    b.add("completionItem", this.completionItem);
    b.add("completionItemKind", this.completionItemKind);
    b.add("contextSupport", this.contextSupport);
    b.add("dynamicRegistration", getDynamicRegistration());
    return b.toString();
  }
  
  @Override
  @Pure
  public boolean equals(final Object obj) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe type CompletionCapabilities is already defined in CompletionCapabilities.java.");
  }
  
  @Override
  @Pure
  public int hashCode() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe type CompletionCapabilities is already defined in CompletionCapabilities.java.");
  }
}
