/**
 * Copyright (c) 2017 Kichwa Coders Ltd. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.lsp4j.debug;

import org.eclipse.lsp4j.debug.ValueFormat;
import org.eclipse.lsp4j.jsonrpc.validation.NonNull;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

/**
 * Arguments for 'evaluate' request.
 */
@SuppressWarnings("all")
public class EvaluateArguments {
  /**
   * The expression to evaluate.
   */
  @NonNull
  private String expression;
  
  /**
   * Evaluate the expression in the scope of this stack frame. If not specified, the expression is evaluated in the
   * global scope.
   * <p>
   * This is an optional property.
   */
  private Long frameId;
  
  /**
   * The context in which the evaluate request is run.
   * <p>
   * This is an optional property.
   * <p>
   * Possible values include - but not limited to those defined in {@link EvaluateArgumentsContext}
   */
  private String context;
  
  /**
   * Specifies details on how to format the Evaluate result.
   * <p>
   * This is an optional property.
   */
  private ValueFormat format;
  
  /**
   * The expression to evaluate.
   */
  @Pure
  @NonNull
  public String getExpression() {
    return this.expression;
  }
  
  /**
   * The expression to evaluate.
   */
  public void setExpression(@NonNull final String expression) {
    this.expression = expression;
  }
  
  /**
   * Evaluate the expression in the scope of this stack frame. If not specified, the expression is evaluated in the
   * global scope.
   * <p>
   * This is an optional property.
   */
  @Pure
  public Long getFrameId() {
    return this.frameId;
  }
  
  /**
   * Evaluate the expression in the scope of this stack frame. If not specified, the expression is evaluated in the
   * global scope.
   * <p>
   * This is an optional property.
   */
  public void setFrameId(final Long frameId) {
    this.frameId = frameId;
  }
  
  /**
   * The context in which the evaluate request is run.
   * <p>
   * This is an optional property.
   * <p>
   * Possible values include - but not limited to those defined in {@link EvaluateArgumentsContext}
   */
  @Pure
  public String getContext() {
    return this.context;
  }
  
  /**
   * The context in which the evaluate request is run.
   * <p>
   * This is an optional property.
   * <p>
   * Possible values include - but not limited to those defined in {@link EvaluateArgumentsContext}
   */
  public void setContext(final String context) {
    this.context = context;
  }
  
  /**
   * Specifies details on how to format the Evaluate result.
   * <p>
   * This is an optional property.
   */
  @Pure
  public ValueFormat getFormat() {
    return this.format;
  }
  
  /**
   * Specifies details on how to format the Evaluate result.
   * <p>
   * This is an optional property.
   */
  public void setFormat(final ValueFormat format) {
    this.format = format;
  }
  
  @Override
  @Pure
  public String toString() {
    ToStringBuilder b = new ToStringBuilder(this);
    b.add("expression", this.expression);
    b.add("frameId", this.frameId);
    b.add("context", this.context);
    b.add("format", this.format);
    return b.toString();
  }
  
  @Override
  @Pure
  public boolean equals(final Object obj) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe type EvaluateArguments is already defined in EvaluateArguments.java.");
  }
  
  @Override
  @Pure
  public int hashCode() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe type EvaluateArguments is already defined in EvaluateArguments.java.");
  }
}
