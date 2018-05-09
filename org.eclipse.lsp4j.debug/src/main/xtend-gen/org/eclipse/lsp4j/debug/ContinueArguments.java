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
 * Arguments for 'continue' request.
 */
@SuppressWarnings("all")
public class ContinueArguments {
  /**
   * Continue execution for the specified thread (if possible). If the backend cannot continue on a single thread
   * but will continue on all threads, it should set the allThreadsContinued attribute in the response to true.
   */
  @NonNull
  private Long threadId;
  
  /**
   * Continue execution for the specified thread (if possible). If the backend cannot continue on a single thread
   * but will continue on all threads, it should set the allThreadsContinued attribute in the response to true.
   */
  @Pure
  @NonNull
  public Long getThreadId() {
    return this.threadId;
  }
  
  /**
   * Continue execution for the specified thread (if possible). If the backend cannot continue on a single thread
   * but will continue on all threads, it should set the allThreadsContinued attribute in the response to true.
   */
  public void setThreadId(@NonNull final Long threadId) {
    this.threadId = threadId;
  }
  
  @Override
  @Pure
  public String toString() {
    ToStringBuilder b = new ToStringBuilder(this);
    b.add("threadId", this.threadId);
    return b.toString();
  }
  
  @Override
  @Pure
  public boolean equals(final Object obj) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe type ContinueArguments is already defined in ContinueArguments.java.");
  }
  
  @Override
  @Pure
  public int hashCode() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe type ContinueArguments is already defined in ContinueArguments.java.");
  }
}
