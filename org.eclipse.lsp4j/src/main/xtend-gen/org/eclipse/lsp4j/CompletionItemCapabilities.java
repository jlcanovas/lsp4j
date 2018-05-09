/**
 * Copyright (c) 2016 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.lsp4j;

import java.util.List;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

/**
 * The client supports the following `CompletionItem` specific capabilities.
 */
@SuppressWarnings("all")
public class CompletionItemCapabilities {
  /**
   * Client supports snippets as insert text.
   * 
   * A snippet can define tab stops and placeholders with `$1`, `$2`
   * and `${3:foo}`. `$0` defines the final tab stop, it defaults to
   * the end of the snippet. Placeholders with equal identifiers are linked,
   * that is typing in one will update others too.
   */
  private Boolean snippetSupport;
  
  /**
   * Client supports commit characters on a completion item.
   */
  private Boolean commitCharactersSupport;
  
  /**
   * Client supports the following content formats for the documentation
   * property. The order describes the preferred format of the client.
   */
  private List<String> documentationFormat;
  
  public CompletionItemCapabilities() {
  }
  
  public CompletionItemCapabilities(final Boolean snippetSupport) {
    this.snippetSupport = snippetSupport;
  }
  
  /**
   * Client supports snippets as insert text.
   * 
   * A snippet can define tab stops and placeholders with `$1`, `$2`
   * and `${3:foo}`. `$0` defines the final tab stop, it defaults to
   * the end of the snippet. Placeholders with equal identifiers are linked,
   * that is typing in one will update others too.
   */
  @Pure
  public Boolean getSnippetSupport() {
    return this.snippetSupport;
  }
  
  /**
   * Client supports snippets as insert text.
   * 
   * A snippet can define tab stops and placeholders with `$1`, `$2`
   * and `${3:foo}`. `$0` defines the final tab stop, it defaults to
   * the end of the snippet. Placeholders with equal identifiers are linked,
   * that is typing in one will update others too.
   */
  public void setSnippetSupport(final Boolean snippetSupport) {
    this.snippetSupport = snippetSupport;
  }
  
  /**
   * Client supports commit characters on a completion item.
   */
  @Pure
  public Boolean getCommitCharactersSupport() {
    return this.commitCharactersSupport;
  }
  
  /**
   * Client supports commit characters on a completion item.
   */
  public void setCommitCharactersSupport(final Boolean commitCharactersSupport) {
    this.commitCharactersSupport = commitCharactersSupport;
  }
  
  /**
   * Client supports the following content formats for the documentation
   * property. The order describes the preferred format of the client.
   */
  @Pure
  public List<String> getDocumentationFormat() {
    return this.documentationFormat;
  }
  
  /**
   * Client supports the following content formats for the documentation
   * property. The order describes the preferred format of the client.
   */
  public void setDocumentationFormat(final List<String> documentationFormat) {
    this.documentationFormat = documentationFormat;
  }
  
  @Override
  @Pure
  public String toString() {
    ToStringBuilder b = new ToStringBuilder(this);
    b.add("snippetSupport", this.snippetSupport);
    b.add("commitCharactersSupport", this.commitCharactersSupport);
    b.add("documentationFormat", this.documentationFormat);
    return b.toString();
  }
  
  @Override
  @Pure
  public boolean equals(final Object obj) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe type CompletionItemCapabilities is already defined in CompletionItemCapabilities.java.");
  }
  
  @Override
  @Pure
  public int hashCode() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe type CompletionItemCapabilities is already defined in CompletionItemCapabilities.java.");
  }
}
