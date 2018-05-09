/**
 * Copyright (c) 2017 Kichwa Coders Ltd. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.lsp4j.debug;

import org.eclipse.lsp4j.debug.Source;
import org.eclipse.lsp4j.jsonrpc.validation.NonNull;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

/**
 * Arguments for 'source' request.
 */
@SuppressWarnings("all")
public class SourceArguments {
  /**
   * Specifies the source content to load. Either source.path or source.sourceReference must be specified.
   * <p>
   * This is an optional property.
   */
  private Source source;
  
  /**
   * The reference to the source. This is the same as source.sourceReference. This is provided for backward
   * compatibility since old backends do not understand the 'source' attribute.
   */
  @NonNull
  private Long sourceReference;
  
  /**
   * Specifies the source content to load. Either source.path or source.sourceReference must be specified.
   * <p>
   * This is an optional property.
   */
  @Pure
  public Source getSource() {
    return this.source;
  }
  
  /**
   * Specifies the source content to load. Either source.path or source.sourceReference must be specified.
   * <p>
   * This is an optional property.
   */
  public void setSource(final Source source) {
    this.source = source;
  }
  
  /**
   * The reference to the source. This is the same as source.sourceReference. This is provided for backward
   * compatibility since old backends do not understand the 'source' attribute.
   */
  @Pure
  @NonNull
  public Long getSourceReference() {
    return this.sourceReference;
  }
  
  /**
   * The reference to the source. This is the same as source.sourceReference. This is provided for backward
   * compatibility since old backends do not understand the 'source' attribute.
   */
  public void setSourceReference(@NonNull final Long sourceReference) {
    this.sourceReference = sourceReference;
  }
  
  @Override
  @Pure
  public String toString() {
    ToStringBuilder b = new ToStringBuilder(this);
    b.add("source", this.source);
    b.add("sourceReference", this.sourceReference);
    return b.toString();
  }
  
  @Override
  @Pure
  public boolean equals(final Object obj) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe type SourceArguments is already defined in SourceArguments.java.");
  }
  
  @Override
  @Pure
  public int hashCode() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe type SourceArguments is already defined in SourceArguments.java.");
  }
}
