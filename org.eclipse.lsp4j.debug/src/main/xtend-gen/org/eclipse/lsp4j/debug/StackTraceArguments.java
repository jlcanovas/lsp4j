/**
 * Copyright (c) 2017 Kichwa Coders Ltd. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.lsp4j.debug;

import org.eclipse.lsp4j.debug.StackFrameFormat;
import org.eclipse.lsp4j.jsonrpc.validation.NonNull;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

/**
 * Arguments for 'stackTrace' request.
 */
@SuppressWarnings("all")
public class StackTraceArguments {
  /**
   * Retrieve the stacktrace for this thread.
   */
  @NonNull
  private Long threadId;
  
  /**
   * The index of the first frame to return; if omitted frames start at 0.
   * <p>
   * This is an optional property.
   */
  private Long startFrame;
  
  /**
   * The maximum number of frames to return. If levels is not specified or 0, all frames are returned.
   * <p>
   * This is an optional property.
   */
  private Long levels;
  
  /**
   * Specifies details on how to format the stack frames.
   * <p>
   * This is an optional property.
   */
  private StackFrameFormat format;
  
  /**
   * Retrieve the stacktrace for this thread.
   */
  @Pure
  @NonNull
  public Long getThreadId() {
    return this.threadId;
  }
  
  /**
   * Retrieve the stacktrace for this thread.
   */
  public void setThreadId(@NonNull final Long threadId) {
    this.threadId = threadId;
  }
  
  /**
   * The index of the first frame to return; if omitted frames start at 0.
   * <p>
   * This is an optional property.
   */
  @Pure
  public Long getStartFrame() {
    return this.startFrame;
  }
  
  /**
   * The index of the first frame to return; if omitted frames start at 0.
   * <p>
   * This is an optional property.
   */
  public void setStartFrame(final Long startFrame) {
    this.startFrame = startFrame;
  }
  
  /**
   * The maximum number of frames to return. If levels is not specified or 0, all frames are returned.
   * <p>
   * This is an optional property.
   */
  @Pure
  public Long getLevels() {
    return this.levels;
  }
  
  /**
   * The maximum number of frames to return. If levels is not specified or 0, all frames are returned.
   * <p>
   * This is an optional property.
   */
  public void setLevels(final Long levels) {
    this.levels = levels;
  }
  
  /**
   * Specifies details on how to format the stack frames.
   * <p>
   * This is an optional property.
   */
  @Pure
  public StackFrameFormat getFormat() {
    return this.format;
  }
  
  /**
   * Specifies details on how to format the stack frames.
   * <p>
   * This is an optional property.
   */
  public void setFormat(final StackFrameFormat format) {
    this.format = format;
  }
  
  @Override
  @Pure
  public String toString() {
    ToStringBuilder b = new ToStringBuilder(this);
    b.add("threadId", this.threadId);
    b.add("startFrame", this.startFrame);
    b.add("levels", this.levels);
    b.add("format", this.format);
    return b.toString();
  }
  
  @Override
  @Pure
  public boolean equals(final Object obj) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe type StackTraceArguments is already defined in StackTraceArguments.java.");
  }
  
  @Override
  @Pure
  public int hashCode() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe type StackTraceArguments is already defined in StackTraceArguments.java.");
  }
}
