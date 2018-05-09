/**
 * Copyright (c) 2017 Kichwa Coders Ltd. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.lsp4j.debug;

import org.eclipse.lsp4j.jsonrpc.validation.NonNull;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

/**
 * Arguments for 'completions' request.
 */
@SuppressWarnings("all")
public class CompletionsArguments {
  /**
   * Returns completions in the scope of this stack frame. If not specified, the completions are returned for the
   * global scope.
   * <p>
   * This is an optional property.
   */
  private Long frameId;
  
  /**
   * One or more source lines. Typically this is the text a user has typed into the debug console before he asked
   * for completion.
   */
  @NonNull
  private String text;
  
  /**
   * The character position for which to determine the completion proposals.
   */
  @NonNull
  private Long column;
  
  /**
   * An optional line for which to determine the completion proposals. If missing the first line of the text is
   * assumed.
   * <p>
   * This is an optional property.
   */
  private Long line;
  
  /**
   * Returns completions in the scope of this stack frame. If not specified, the completions are returned for the
   * global scope.
   * <p>
   * This is an optional property.
   */
  @Pure
  public Long getFrameId() {
    return this.frameId;
  }
  
  /**
   * Returns completions in the scope of this stack frame. If not specified, the completions are returned for the
   * global scope.
   * <p>
   * This is an optional property.
   */
  public void setFrameId(final Long frameId) {
    this.frameId = frameId;
  }
  
  /**
   * One or more source lines. Typically this is the text a user has typed into the debug console before he asked
   * for completion.
   */
  @Pure
  @NonNull
  public String getText() {
    return this.text;
  }
  
  /**
   * One or more source lines. Typically this is the text a user has typed into the debug console before he asked
   * for completion.
   */
  public void setText(@NonNull final String text) {
    this.text = text;
  }
  
  /**
   * The character position for which to determine the completion proposals.
   */
  @Pure
  @NonNull
  public Long getColumn() {
    return this.column;
  }
  
  /**
   * The character position for which to determine the completion proposals.
   */
  public void setColumn(@NonNull final Long column) {
    this.column = column;
  }
  
  /**
   * An optional line for which to determine the completion proposals. If missing the first line of the text is
   * assumed.
   * <p>
   * This is an optional property.
   */
  @Pure
  public Long getLine() {
    return this.line;
  }
  
  /**
   * An optional line for which to determine the completion proposals. If missing the first line of the text is
   * assumed.
   * <p>
   * This is an optional property.
   */
  public void setLine(final Long line) {
    this.line = line;
  }
  
  @Override
  @Pure
  public String toString() {
    ToStringBuilder b = new ToStringBuilder(this);
    b.add("frameId", this.frameId);
    b.add("text", this.text);
    b.add("column", this.column);
    b.add("line", this.line);
    return b.toString();
  }
  
  @Override
  @Pure
  public boolean equals(final Object obj) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe type CompletionsArguments is already defined in CompletionsArguments.java.");
  }
  
  @Override
  @Pure
  public int hashCode() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe type CompletionsArguments is already defined in CompletionsArguments.java.");
  }
}
