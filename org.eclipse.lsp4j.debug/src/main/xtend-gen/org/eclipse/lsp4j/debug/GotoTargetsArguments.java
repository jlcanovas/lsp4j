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
 * Arguments for 'gotoTargets' request.
 */
@SuppressWarnings("all")
public class GotoTargetsArguments {
  /**
   * The source location for which the goto targets are determined.
   */
  @NonNull
  private Source source;
  
  /**
   * The line location for which the goto targets are determined.
   */
  @NonNull
  private Long line;
  
  /**
   * An optional column location for which the goto targets are determined.
   * <p>
   * This is an optional property.
   */
  private Long column;
  
  /**
   * The source location for which the goto targets are determined.
   */
  @Pure
  @NonNull
  public Source getSource() {
    return this.source;
  }
  
  /**
   * The source location for which the goto targets are determined.
   */
  public void setSource(@NonNull final Source source) {
    this.source = source;
  }
  
  /**
   * The line location for which the goto targets are determined.
   */
  @Pure
  @NonNull
  public Long getLine() {
    return this.line;
  }
  
  /**
   * The line location for which the goto targets are determined.
   */
  public void setLine(@NonNull final Long line) {
    this.line = line;
  }
  
  /**
   * An optional column location for which the goto targets are determined.
   * <p>
   * This is an optional property.
   */
  @Pure
  public Long getColumn() {
    return this.column;
  }
  
  /**
   * An optional column location for which the goto targets are determined.
   * <p>
   * This is an optional property.
   */
  public void setColumn(final Long column) {
    this.column = column;
  }
  
  @Override
  @Pure
  public String toString() {
    ToStringBuilder b = new ToStringBuilder(this);
    b.add("source", this.source);
    b.add("line", this.line);
    b.add("column", this.column);
    return b.toString();
  }
  
  @Override
  @Pure
  public boolean equals(final Object obj) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe type GotoTargetsArguments is already defined in GotoTargetsArguments.java.");
  }
  
  @Override
  @Pure
  public int hashCode() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe type GotoTargetsArguments is already defined in GotoTargetsArguments.java.");
  }
}
