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
 * Event message for 'continued' event type.
 * <p>
 * The event indicates that the execution of the debuggee has continued.
 * <p>
 * Please note: a debug adapter is not expected to send this event in response to a request that implies that
 * execution continues, e.g. 'launch' or 'continue'.
 * <p>
 * It is only necessary to send a ContinuedEvent if there was no previous request that implied this.
 */
@SuppressWarnings("all")
public class ContinuedEventArguments {
  /**
   * The thread which was continued.
   */
  @NonNull
  private Long threadId;
  
  /**
   * If allThreadsContinued is true, a debug adapter can announce that all threads have continued.
   * <p>
   * This is an optional property.
   */
  private Boolean allThreadsContinued;
  
  /**
   * The thread which was continued.
   */
  @Pure
  @NonNull
  public Long getThreadId() {
    return this.threadId;
  }
  
  /**
   * The thread which was continued.
   */
  public void setThreadId(@NonNull final Long threadId) {
    this.threadId = threadId;
  }
  
  /**
   * If allThreadsContinued is true, a debug adapter can announce that all threads have continued.
   * <p>
   * This is an optional property.
   */
  @Pure
  public Boolean getAllThreadsContinued() {
    return this.allThreadsContinued;
  }
  
  /**
   * If allThreadsContinued is true, a debug adapter can announce that all threads have continued.
   * <p>
   * This is an optional property.
   */
  public void setAllThreadsContinued(final Boolean allThreadsContinued) {
    this.allThreadsContinued = allThreadsContinued;
  }
  
  @Override
  @Pure
  public String toString() {
    ToStringBuilder b = new ToStringBuilder(this);
    b.add("threadId", this.threadId);
    b.add("allThreadsContinued", this.allThreadsContinued);
    return b.toString();
  }
  
  @Override
  @Pure
  public boolean equals(final Object obj) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe type ContinuedEventArguments is already defined in ContinuedEventArguments.java.");
  }
  
  @Override
  @Pure
  public int hashCode() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe type ContinuedEventArguments is already defined in ContinuedEventArguments.java.");
  }
}
