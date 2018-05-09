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
 * Event message for 'output' event type.
 * <p>
 * The event indicates that the target has produced some output.
 */
@SuppressWarnings("all")
public class OutputEventArguments {
  /**
   * The output category. If not specified, 'console' is assumed.
   * <p>
   * This is an optional property.
   * <p>
   * Possible values include - but not limited to those defined in {@link OutputEventArgumentsCategory}
   */
  private String category;
  
  /**
   * The output to report.
   */
  @NonNull
  private String output;
  
  /**
   * If an attribute 'variablesReference' exists and its value is > 0, the output contains objects which can be
   * retrieved by passing variablesReference to the VariablesRequest.
   * <p>
   * This is an optional property.
   */
  private Long variablesReference;
  
  /**
   * An optional source location where the output was produced.
   * <p>
   * This is an optional property.
   */
  private Source source;
  
  /**
   * An optional source location line where the output was produced.
   * <p>
   * This is an optional property.
   */
  private Long line;
  
  /**
   * An optional source location column where the output was produced.
   * <p>
   * This is an optional property.
   */
  private Long column;
  
  /**
   * Optional data to report. For the 'telemetry' category the data will be sent to telemetry, for the other
   * categories the data is shown in JSON format.
   * <p>
   * This is an optional property.
   */
  private Object data;
  
  /**
   * The output category. If not specified, 'console' is assumed.
   * <p>
   * This is an optional property.
   * <p>
   * Possible values include - but not limited to those defined in {@link OutputEventArgumentsCategory}
   */
  @Pure
  public String getCategory() {
    return this.category;
  }
  
  /**
   * The output category. If not specified, 'console' is assumed.
   * <p>
   * This is an optional property.
   * <p>
   * Possible values include - but not limited to those defined in {@link OutputEventArgumentsCategory}
   */
  public void setCategory(final String category) {
    this.category = category;
  }
  
  /**
   * The output to report.
   */
  @Pure
  @NonNull
  public String getOutput() {
    return this.output;
  }
  
  /**
   * The output to report.
   */
  public void setOutput(@NonNull final String output) {
    this.output = output;
  }
  
  /**
   * If an attribute 'variablesReference' exists and its value is > 0, the output contains objects which can be
   * retrieved by passing variablesReference to the VariablesRequest.
   * <p>
   * This is an optional property.
   */
  @Pure
  public Long getVariablesReference() {
    return this.variablesReference;
  }
  
  /**
   * If an attribute 'variablesReference' exists and its value is > 0, the output contains objects which can be
   * retrieved by passing variablesReference to the VariablesRequest.
   * <p>
   * This is an optional property.
   */
  public void setVariablesReference(final Long variablesReference) {
    this.variablesReference = variablesReference;
  }
  
  /**
   * An optional source location where the output was produced.
   * <p>
   * This is an optional property.
   */
  @Pure
  public Source getSource() {
    return this.source;
  }
  
  /**
   * An optional source location where the output was produced.
   * <p>
   * This is an optional property.
   */
  public void setSource(final Source source) {
    this.source = source;
  }
  
  /**
   * An optional source location line where the output was produced.
   * <p>
   * This is an optional property.
   */
  @Pure
  public Long getLine() {
    return this.line;
  }
  
  /**
   * An optional source location line where the output was produced.
   * <p>
   * This is an optional property.
   */
  public void setLine(final Long line) {
    this.line = line;
  }
  
  /**
   * An optional source location column where the output was produced.
   * <p>
   * This is an optional property.
   */
  @Pure
  public Long getColumn() {
    return this.column;
  }
  
  /**
   * An optional source location column where the output was produced.
   * <p>
   * This is an optional property.
   */
  public void setColumn(final Long column) {
    this.column = column;
  }
  
  /**
   * Optional data to report. For the 'telemetry' category the data will be sent to telemetry, for the other
   * categories the data is shown in JSON format.
   * <p>
   * This is an optional property.
   */
  @Pure
  public Object getData() {
    return this.data;
  }
  
  /**
   * Optional data to report. For the 'telemetry' category the data will be sent to telemetry, for the other
   * categories the data is shown in JSON format.
   * <p>
   * This is an optional property.
   */
  public void setData(final Object data) {
    this.data = data;
  }
  
  @Override
  @Pure
  public String toString() {
    ToStringBuilder b = new ToStringBuilder(this);
    b.add("category", this.category);
    b.add("output", this.output);
    b.add("variablesReference", this.variablesReference);
    b.add("source", this.source);
    b.add("line", this.line);
    b.add("column", this.column);
    b.add("data", this.data);
    return b.toString();
  }
  
  @Override
  @Pure
  public boolean equals(final Object obj) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe type OutputEventArguments is already defined in OutputEventArguments.java.");
  }
  
  @Override
  @Pure
  public int hashCode() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe type OutputEventArguments is already defined in OutputEventArguments.java.");
  }
}
