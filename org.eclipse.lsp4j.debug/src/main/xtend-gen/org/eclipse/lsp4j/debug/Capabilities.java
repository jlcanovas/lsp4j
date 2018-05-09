/**
 * Copyright (c) 2017 Kichwa Coders Ltd. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.lsp4j.debug;

import org.eclipse.lsp4j.debug.ChecksumAlgorithm;
import org.eclipse.lsp4j.debug.ColumnDescriptor;
import org.eclipse.lsp4j.debug.ExceptionBreakpointsFilter;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

/**
 * Information about the capabilities of a debug adapter.
 */
@SuppressWarnings("all")
public class Capabilities {
  /**
   * The debug adapter supports the configurationDoneRequest.
   * <p>
   * This is an optional property.
   */
  private Boolean supportsConfigurationDoneRequest;
  
  /**
   * The debug adapter supports function breakpoints.
   * <p>
   * This is an optional property.
   */
  private Boolean supportsFunctionBreakpoints;
  
  /**
   * The debug adapter supports conditional breakpoints.
   * <p>
   * This is an optional property.
   */
  private Boolean supportsConditionalBreakpoints;
  
  /**
   * The debug adapter supports breakpoints that break execution after a specified number of hits.
   * <p>
   * This is an optional property.
   */
  private Boolean supportsHitConditionalBreakpoints;
  
  /**
   * The debug adapter supports a (side effect free) evaluate request for data hovers.
   * <p>
   * This is an optional property.
   */
  private Boolean supportsEvaluateForHovers;
  
  /**
   * Available filters or options for the setExceptionBreakpoints request.
   * <p>
   * This is an optional property.
   */
  private ExceptionBreakpointsFilter[] exceptionBreakpointFilters;
  
  /**
   * The debug adapter supports stepping back via the stepBack and reverseContinue requests.
   * <p>
   * This is an optional property.
   */
  private Boolean supportsStepBack;
  
  /**
   * The debug adapter supports setting a variable to a value.
   * <p>
   * This is an optional property.
   */
  private Boolean supportsSetVariable;
  
  /**
   * The debug adapter supports restarting a frame.
   * <p>
   * This is an optional property.
   */
  private Boolean supportsRestartFrame;
  
  /**
   * The debug adapter supports the gotoTargetsRequest.
   * <p>
   * This is an optional property.
   */
  private Boolean supportsGotoTargetsRequest;
  
  /**
   * The debug adapter supports the stepInTargetsRequest.
   * <p>
   * This is an optional property.
   */
  private Boolean supportsStepInTargetsRequest;
  
  /**
   * The debug adapter supports the completionsRequest.
   * <p>
   * This is an optional property.
   */
  private Boolean supportsCompletionsRequest;
  
  /**
   * The debug adapter supports the modules request.
   * <p>
   * This is an optional property.
   */
  private Boolean supportsModulesRequest;
  
  /**
   * The set of additional module information exposed by the debug adapter.
   * <p>
   * This is an optional property.
   */
  private ColumnDescriptor[] additionalModuleColumns;
  
  /**
   * Checksum algorithms supported by the debug adapter.
   * <p>
   * This is an optional property.
   */
  private ChecksumAlgorithm[] supportedChecksumAlgorithms;
  
  /**
   * The debug adapter supports the RestartRequest. In this case a client should not implement 'restart' by
   * terminating and relaunching the adapter but by calling the RestartRequest.
   * <p>
   * This is an optional property.
   */
  private Boolean supportsRestartRequest;
  
  /**
   * The debug adapter supports 'exceptionOptions' on the setExceptionBreakpoints request.
   * <p>
   * This is an optional property.
   */
  private Boolean supportsExceptionOptions;
  
  /**
   * The debug adapter supports a 'format' attribute on the stackTraceRequest, variablesRequest, and
   * evaluateRequest.
   * <p>
   * This is an optional property.
   */
  private Boolean supportsValueFormattingOptions;
  
  /**
   * The debug adapter supports the exceptionInfo request.
   * <p>
   * This is an optional property.
   */
  private Boolean supportsExceptionInfoRequest;
  
  /**
   * The debug adapter supports the 'terminateDebuggee' attribute on the 'disconnect' request.
   * <p>
   * This is an optional property.
   */
  private Boolean supportTerminateDebuggee;
  
  /**
   * The debug adapter supports the delayed loading of parts of the stack, which requires that both the 'startFrame'
   * and 'levels' arguments and the 'totalFrames' result of the 'StackTrace' request are supported.
   * <p>
   * This is an optional property.
   */
  private Boolean supportsDelayedStackTraceLoading;
  
  /**
   * The debug adapter supports the 'loadedSources' request.
   * <p>
   * This is an optional property.
   */
  private Boolean supportsLoadedSourcesRequest;
  
  /**
   * The debug adapter supports the configurationDoneRequest.
   * <p>
   * This is an optional property.
   */
  @Pure
  public Boolean getSupportsConfigurationDoneRequest() {
    return this.supportsConfigurationDoneRequest;
  }
  
  /**
   * The debug adapter supports the configurationDoneRequest.
   * <p>
   * This is an optional property.
   */
  public void setSupportsConfigurationDoneRequest(final Boolean supportsConfigurationDoneRequest) {
    this.supportsConfigurationDoneRequest = supportsConfigurationDoneRequest;
  }
  
  /**
   * The debug adapter supports function breakpoints.
   * <p>
   * This is an optional property.
   */
  @Pure
  public Boolean getSupportsFunctionBreakpoints() {
    return this.supportsFunctionBreakpoints;
  }
  
  /**
   * The debug adapter supports function breakpoints.
   * <p>
   * This is an optional property.
   */
  public void setSupportsFunctionBreakpoints(final Boolean supportsFunctionBreakpoints) {
    this.supportsFunctionBreakpoints = supportsFunctionBreakpoints;
  }
  
  /**
   * The debug adapter supports conditional breakpoints.
   * <p>
   * This is an optional property.
   */
  @Pure
  public Boolean getSupportsConditionalBreakpoints() {
    return this.supportsConditionalBreakpoints;
  }
  
  /**
   * The debug adapter supports conditional breakpoints.
   * <p>
   * This is an optional property.
   */
  public void setSupportsConditionalBreakpoints(final Boolean supportsConditionalBreakpoints) {
    this.supportsConditionalBreakpoints = supportsConditionalBreakpoints;
  }
  
  /**
   * The debug adapter supports breakpoints that break execution after a specified number of hits.
   * <p>
   * This is an optional property.
   */
  @Pure
  public Boolean getSupportsHitConditionalBreakpoints() {
    return this.supportsHitConditionalBreakpoints;
  }
  
  /**
   * The debug adapter supports breakpoints that break execution after a specified number of hits.
   * <p>
   * This is an optional property.
   */
  public void setSupportsHitConditionalBreakpoints(final Boolean supportsHitConditionalBreakpoints) {
    this.supportsHitConditionalBreakpoints = supportsHitConditionalBreakpoints;
  }
  
  /**
   * The debug adapter supports a (side effect free) evaluate request for data hovers.
   * <p>
   * This is an optional property.
   */
  @Pure
  public Boolean getSupportsEvaluateForHovers() {
    return this.supportsEvaluateForHovers;
  }
  
  /**
   * The debug adapter supports a (side effect free) evaluate request for data hovers.
   * <p>
   * This is an optional property.
   */
  public void setSupportsEvaluateForHovers(final Boolean supportsEvaluateForHovers) {
    this.supportsEvaluateForHovers = supportsEvaluateForHovers;
  }
  
  /**
   * Available filters or options for the setExceptionBreakpoints request.
   * <p>
   * This is an optional property.
   */
  @Pure
  public ExceptionBreakpointsFilter[] getExceptionBreakpointFilters() {
    return this.exceptionBreakpointFilters;
  }
  
  /**
   * Available filters or options for the setExceptionBreakpoints request.
   * <p>
   * This is an optional property.
   */
  public void setExceptionBreakpointFilters(final ExceptionBreakpointsFilter[] exceptionBreakpointFilters) {
    this.exceptionBreakpointFilters = exceptionBreakpointFilters;
  }
  
  /**
   * The debug adapter supports stepping back via the stepBack and reverseContinue requests.
   * <p>
   * This is an optional property.
   */
  @Pure
  public Boolean getSupportsStepBack() {
    return this.supportsStepBack;
  }
  
  /**
   * The debug adapter supports stepping back via the stepBack and reverseContinue requests.
   * <p>
   * This is an optional property.
   */
  public void setSupportsStepBack(final Boolean supportsStepBack) {
    this.supportsStepBack = supportsStepBack;
  }
  
  /**
   * The debug adapter supports setting a variable to a value.
   * <p>
   * This is an optional property.
   */
  @Pure
  public Boolean getSupportsSetVariable() {
    return this.supportsSetVariable;
  }
  
  /**
   * The debug adapter supports setting a variable to a value.
   * <p>
   * This is an optional property.
   */
  public void setSupportsSetVariable(final Boolean supportsSetVariable) {
    this.supportsSetVariable = supportsSetVariable;
  }
  
  /**
   * The debug adapter supports restarting a frame.
   * <p>
   * This is an optional property.
   */
  @Pure
  public Boolean getSupportsRestartFrame() {
    return this.supportsRestartFrame;
  }
  
  /**
   * The debug adapter supports restarting a frame.
   * <p>
   * This is an optional property.
   */
  public void setSupportsRestartFrame(final Boolean supportsRestartFrame) {
    this.supportsRestartFrame = supportsRestartFrame;
  }
  
  /**
   * The debug adapter supports the gotoTargetsRequest.
   * <p>
   * This is an optional property.
   */
  @Pure
  public Boolean getSupportsGotoTargetsRequest() {
    return this.supportsGotoTargetsRequest;
  }
  
  /**
   * The debug adapter supports the gotoTargetsRequest.
   * <p>
   * This is an optional property.
   */
  public void setSupportsGotoTargetsRequest(final Boolean supportsGotoTargetsRequest) {
    this.supportsGotoTargetsRequest = supportsGotoTargetsRequest;
  }
  
  /**
   * The debug adapter supports the stepInTargetsRequest.
   * <p>
   * This is an optional property.
   */
  @Pure
  public Boolean getSupportsStepInTargetsRequest() {
    return this.supportsStepInTargetsRequest;
  }
  
  /**
   * The debug adapter supports the stepInTargetsRequest.
   * <p>
   * This is an optional property.
   */
  public void setSupportsStepInTargetsRequest(final Boolean supportsStepInTargetsRequest) {
    this.supportsStepInTargetsRequest = supportsStepInTargetsRequest;
  }
  
  /**
   * The debug adapter supports the completionsRequest.
   * <p>
   * This is an optional property.
   */
  @Pure
  public Boolean getSupportsCompletionsRequest() {
    return this.supportsCompletionsRequest;
  }
  
  /**
   * The debug adapter supports the completionsRequest.
   * <p>
   * This is an optional property.
   */
  public void setSupportsCompletionsRequest(final Boolean supportsCompletionsRequest) {
    this.supportsCompletionsRequest = supportsCompletionsRequest;
  }
  
  /**
   * The debug adapter supports the modules request.
   * <p>
   * This is an optional property.
   */
  @Pure
  public Boolean getSupportsModulesRequest() {
    return this.supportsModulesRequest;
  }
  
  /**
   * The debug adapter supports the modules request.
   * <p>
   * This is an optional property.
   */
  public void setSupportsModulesRequest(final Boolean supportsModulesRequest) {
    this.supportsModulesRequest = supportsModulesRequest;
  }
  
  /**
   * The set of additional module information exposed by the debug adapter.
   * <p>
   * This is an optional property.
   */
  @Pure
  public ColumnDescriptor[] getAdditionalModuleColumns() {
    return this.additionalModuleColumns;
  }
  
  /**
   * The set of additional module information exposed by the debug adapter.
   * <p>
   * This is an optional property.
   */
  public void setAdditionalModuleColumns(final ColumnDescriptor[] additionalModuleColumns) {
    this.additionalModuleColumns = additionalModuleColumns;
  }
  
  /**
   * Checksum algorithms supported by the debug adapter.
   * <p>
   * This is an optional property.
   */
  @Pure
  public ChecksumAlgorithm[] getSupportedChecksumAlgorithms() {
    return this.supportedChecksumAlgorithms;
  }
  
  /**
   * Checksum algorithms supported by the debug adapter.
   * <p>
   * This is an optional property.
   */
  public void setSupportedChecksumAlgorithms(final ChecksumAlgorithm[] supportedChecksumAlgorithms) {
    this.supportedChecksumAlgorithms = supportedChecksumAlgorithms;
  }
  
  /**
   * The debug adapter supports the RestartRequest. In this case a client should not implement 'restart' by
   * terminating and relaunching the adapter but by calling the RestartRequest.
   * <p>
   * This is an optional property.
   */
  @Pure
  public Boolean getSupportsRestartRequest() {
    return this.supportsRestartRequest;
  }
  
  /**
   * The debug adapter supports the RestartRequest. In this case a client should not implement 'restart' by
   * terminating and relaunching the adapter but by calling the RestartRequest.
   * <p>
   * This is an optional property.
   */
  public void setSupportsRestartRequest(final Boolean supportsRestartRequest) {
    this.supportsRestartRequest = supportsRestartRequest;
  }
  
  /**
   * The debug adapter supports 'exceptionOptions' on the setExceptionBreakpoints request.
   * <p>
   * This is an optional property.
   */
  @Pure
  public Boolean getSupportsExceptionOptions() {
    return this.supportsExceptionOptions;
  }
  
  /**
   * The debug adapter supports 'exceptionOptions' on the setExceptionBreakpoints request.
   * <p>
   * This is an optional property.
   */
  public void setSupportsExceptionOptions(final Boolean supportsExceptionOptions) {
    this.supportsExceptionOptions = supportsExceptionOptions;
  }
  
  /**
   * The debug adapter supports a 'format' attribute on the stackTraceRequest, variablesRequest, and
   * evaluateRequest.
   * <p>
   * This is an optional property.
   */
  @Pure
  public Boolean getSupportsValueFormattingOptions() {
    return this.supportsValueFormattingOptions;
  }
  
  /**
   * The debug adapter supports a 'format' attribute on the stackTraceRequest, variablesRequest, and
   * evaluateRequest.
   * <p>
   * This is an optional property.
   */
  public void setSupportsValueFormattingOptions(final Boolean supportsValueFormattingOptions) {
    this.supportsValueFormattingOptions = supportsValueFormattingOptions;
  }
  
  /**
   * The debug adapter supports the exceptionInfo request.
   * <p>
   * This is an optional property.
   */
  @Pure
  public Boolean getSupportsExceptionInfoRequest() {
    return this.supportsExceptionInfoRequest;
  }
  
  /**
   * The debug adapter supports the exceptionInfo request.
   * <p>
   * This is an optional property.
   */
  public void setSupportsExceptionInfoRequest(final Boolean supportsExceptionInfoRequest) {
    this.supportsExceptionInfoRequest = supportsExceptionInfoRequest;
  }
  
  /**
   * The debug adapter supports the 'terminateDebuggee' attribute on the 'disconnect' request.
   * <p>
   * This is an optional property.
   */
  @Pure
  public Boolean getSupportTerminateDebuggee() {
    return this.supportTerminateDebuggee;
  }
  
  /**
   * The debug adapter supports the 'terminateDebuggee' attribute on the 'disconnect' request.
   * <p>
   * This is an optional property.
   */
  public void setSupportTerminateDebuggee(final Boolean supportTerminateDebuggee) {
    this.supportTerminateDebuggee = supportTerminateDebuggee;
  }
  
  /**
   * The debug adapter supports the delayed loading of parts of the stack, which requires that both the 'startFrame'
   * and 'levels' arguments and the 'totalFrames' result of the 'StackTrace' request are supported.
   * <p>
   * This is an optional property.
   */
  @Pure
  public Boolean getSupportsDelayedStackTraceLoading() {
    return this.supportsDelayedStackTraceLoading;
  }
  
  /**
   * The debug adapter supports the delayed loading of parts of the stack, which requires that both the 'startFrame'
   * and 'levels' arguments and the 'totalFrames' result of the 'StackTrace' request are supported.
   * <p>
   * This is an optional property.
   */
  public void setSupportsDelayedStackTraceLoading(final Boolean supportsDelayedStackTraceLoading) {
    this.supportsDelayedStackTraceLoading = supportsDelayedStackTraceLoading;
  }
  
  /**
   * The debug adapter supports the 'loadedSources' request.
   * <p>
   * This is an optional property.
   */
  @Pure
  public Boolean getSupportsLoadedSourcesRequest() {
    return this.supportsLoadedSourcesRequest;
  }
  
  /**
   * The debug adapter supports the 'loadedSources' request.
   * <p>
   * This is an optional property.
   */
  public void setSupportsLoadedSourcesRequest(final Boolean supportsLoadedSourcesRequest) {
    this.supportsLoadedSourcesRequest = supportsLoadedSourcesRequest;
  }
  
  @Override
  @Pure
  public String toString() {
    ToStringBuilder b = new ToStringBuilder(this);
    b.add("supportsConfigurationDoneRequest", this.supportsConfigurationDoneRequest);
    b.add("supportsFunctionBreakpoints", this.supportsFunctionBreakpoints);
    b.add("supportsConditionalBreakpoints", this.supportsConditionalBreakpoints);
    b.add("supportsHitConditionalBreakpoints", this.supportsHitConditionalBreakpoints);
    b.add("supportsEvaluateForHovers", this.supportsEvaluateForHovers);
    b.add("exceptionBreakpointFilters", this.exceptionBreakpointFilters);
    b.add("supportsStepBack", this.supportsStepBack);
    b.add("supportsSetVariable", this.supportsSetVariable);
    b.add("supportsRestartFrame", this.supportsRestartFrame);
    b.add("supportsGotoTargetsRequest", this.supportsGotoTargetsRequest);
    b.add("supportsStepInTargetsRequest", this.supportsStepInTargetsRequest);
    b.add("supportsCompletionsRequest", this.supportsCompletionsRequest);
    b.add("supportsModulesRequest", this.supportsModulesRequest);
    b.add("additionalModuleColumns", this.additionalModuleColumns);
    b.add("supportedChecksumAlgorithms", this.supportedChecksumAlgorithms);
    b.add("supportsRestartRequest", this.supportsRestartRequest);
    b.add("supportsExceptionOptions", this.supportsExceptionOptions);
    b.add("supportsValueFormattingOptions", this.supportsValueFormattingOptions);
    b.add("supportsExceptionInfoRequest", this.supportsExceptionInfoRequest);
    b.add("supportTerminateDebuggee", this.supportTerminateDebuggee);
    b.add("supportsDelayedStackTraceLoading", this.supportsDelayedStackTraceLoading);
    b.add("supportsLoadedSourcesRequest", this.supportsLoadedSourcesRequest);
    return b.toString();
  }
  
  @Override
  @Pure
  public boolean equals(final Object obj) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe type Capabilities is already defined in Capabilities.java.");
  }
  
  @Override
  @Pure
  public int hashCode() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe type Capabilities is already defined in Capabilities.java.");
  }
}
