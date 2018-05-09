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
 * Event message for 'stopped' event type.
 * <p>
 * The event indicates that the execution of the debuggee has stopped due to some condition.
 * <p>
 * This can be caused by a break point previously set, a stepping action has completed, by executing a debugger
 * statement etc.
 */
@SuppressWarnings("all")
public class StoppedEventArguments {
  /**
   * The reason for the event.
   * <p>
   * For backward compatibility this string is shown in the UI if the 'description' attribute is missing (but it
   * must not be translated).
   * <p>
   * Possible values include - but not limited to those defined in {@link StoppedEventArgumentsReason}
   */
  @NonNull
  private String reason;
  
  /**
   * The full reason for the event, e.g. 'Paused on exception'. This string is shown in the UI as is.
   * <p>
   * This is an optional property.
   */
  private String description;
  
  /**
   * The thread which was stopped.
   * <p>
   * This is an optional property.
   */
  private Long threadId;
  
  /**
   * Additional information. E.g. if reason is 'exception', text contains the exception name. This string is shown
   * in the UI.
   * <p>
   * This is an optional property.
   */
  private String text;
  
  /**
   * If allThreadsStopped is true, a debug adapter can announce that all threads have stopped.
   * <p>
   *  The client should use this information to enable that all threads can be expanded to access their
   * stacktraces.
   * <p>
   *  If the attribute is missing or false, only the thread with the given threadId can be expanded.
   * <p>
   * This is an optional property.
   */
  private Boolean allThreadsStopped;
  
  /**
   * The reason for the event.
   * <p>
   * For backward compatibility this string is shown in the UI if the 'description' attribute is missing (but it
   * must not be translated).
   * <p>
   * Possible values include - but not limited to those defined in {@link StoppedEventArgumentsReason}
   */
  @Pure
  @NonNull
  public String getReason() {
    return this.reason;
  }
  
  /**
   * The reason for the event.
   * <p>
   * For backward compatibility this string is shown in the UI if the 'description' attribute is missing (but it
   * must not be translated).
   * <p>
   * Possible values include - but not limited to those defined in {@link StoppedEventArgumentsReason}
   */
  public void setReason(@NonNull final String reason) {
    this.reason = reason;
  }
  
  /**
   * The full reason for the event, e.g. 'Paused on exception'. This string is shown in the UI as is.
   * <p>
   * This is an optional property.
   */
  @Pure
  public String getDescription() {
    return this.description;
  }
  
  /**
   * The full reason for the event, e.g. 'Paused on exception'. This string is shown in the UI as is.
   * <p>
   * This is an optional property.
   */
  public void setDescription(final String description) {
    this.description = description;
  }
  
  /**
   * The thread which was stopped.
   * <p>
   * This is an optional property.
   */
  @Pure
  public Long getThreadId() {
    return this.threadId;
  }
  
  /**
   * The thread which was stopped.
   * <p>
   * This is an optional property.
   */
  public void setThreadId(final Long threadId) {
    this.threadId = threadId;
  }
  
  /**
   * Additional information. E.g. if reason is 'exception', text contains the exception name. This string is shown
   * in the UI.
   * <p>
   * This is an optional property.
   */
  @Pure
  public String getText() {
    return this.text;
  }
  
  /**
   * Additional information. E.g. if reason is 'exception', text contains the exception name. This string is shown
   * in the UI.
   * <p>
   * This is an optional property.
   */
  public void setText(final String text) {
    this.text = text;
  }
  
  /**
   * If allThreadsStopped is true, a debug adapter can announce that all threads have stopped.
   * <p>
   *  The client should use this information to enable that all threads can be expanded to access their
   * stacktraces.
   * <p>
   *  If the attribute is missing or false, only the thread with the given threadId can be expanded.
   * <p>
   * This is an optional property.
   */
  @Pure
  public Boolean getAllThreadsStopped() {
    return this.allThreadsStopped;
  }
  
  /**
   * If allThreadsStopped is true, a debug adapter can announce that all threads have stopped.
   * <p>
   *  The client should use this information to enable that all threads can be expanded to access their
   * stacktraces.
   * <p>
   *  If the attribute is missing or false, only the thread with the given threadId can be expanded.
   * <p>
   * This is an optional property.
   */
  public void setAllThreadsStopped(final Boolean allThreadsStopped) {
    this.allThreadsStopped = allThreadsStopped;
  }
  
  @Override
  @Pure
  public String toString() {
    ToStringBuilder b = new ToStringBuilder(this);
    b.add("reason", this.reason);
    b.add("description", this.description);
    b.add("threadId", this.threadId);
    b.add("text", this.text);
    b.add("allThreadsStopped", this.allThreadsStopped);
    return b.toString();
  }
  
  @Override
  @Pure
  public boolean equals(final Object obj) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe type StoppedEventArguments is already defined in StoppedEventArguments.java.");
  }
  
  @Override
  @Pure
  public int hashCode() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe type StoppedEventArguments is already defined in StoppedEventArguments.java.");
  }
}
