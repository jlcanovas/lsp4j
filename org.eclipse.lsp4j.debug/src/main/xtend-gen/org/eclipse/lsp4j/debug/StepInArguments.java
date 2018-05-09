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
 * Arguments for 'stepIn' request.
 */
@SuppressWarnings("all")
public class StepInArguments {
  /**
   * Execute 'stepIn' for this thread.
   */
  @NonNull
  private Long threadId;
  
  /**
   * Optional id of the target to step into.
   * <p>
   * This is an optional property.
   */
  private Long targetId;
  
  /**
   * Execute 'stepIn' for this thread.
   */
  @Pure
  @NonNull
  public Long getThreadId() {
    return this.threadId;
  }
  
  /**
   * Execute 'stepIn' for this thread.
   */
  public void setThreadId(@NonNull final Long threadId) {
    this.threadId = threadId;
  }
  
  /**
   * Optional id of the target to step into.
   * <p>
   * This is an optional property.
   */
  @Pure
  public Long getTargetId() {
    return this.targetId;
  }
  
  /**
   * Optional id of the target to step into.
   * <p>
   * This is an optional property.
   */
  public void setTargetId(final Long targetId) {
    this.targetId = targetId;
  }
  
  @Override
  @Pure
  public String toString() {
    ToStringBuilder b = new ToStringBuilder(this);
    b.add("threadId", this.threadId);
    b.add("targetId", this.targetId);
    return b.toString();
  }
  
  @Override
  @Pure
  public boolean equals(final Object obj) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe type StepInArguments is already defined in StepInArguments.java.");
  }
  
  @Override
  @Pure
  public int hashCode() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe type StepInArguments is already defined in StepInArguments.java.");
  }
}
