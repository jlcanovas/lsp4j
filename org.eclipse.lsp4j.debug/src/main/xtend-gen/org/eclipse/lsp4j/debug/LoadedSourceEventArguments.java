/**
 * Copyright (c) 2017 Kichwa Coders Ltd. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.lsp4j.debug;

import org.eclipse.lsp4j.debug.LoadedSourceEventArgumentsReason;
import org.eclipse.lsp4j.debug.Source;
import org.eclipse.lsp4j.jsonrpc.validation.NonNull;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

/**
 * Event message for 'loadedSource' event type.
 * <p>
 * The event indicates that some source has been added, changed, or removed from the set of all loaded sources.
 */
@SuppressWarnings("all")
public class LoadedSourceEventArguments {
  /**
   * The reason for the event.
   */
  @NonNull
  private LoadedSourceEventArgumentsReason reason;
  
  /**
   * The new, changed, or removed source.
   */
  @NonNull
  private Source source;
  
  /**
   * The reason for the event.
   */
  @Pure
  @NonNull
  public LoadedSourceEventArgumentsReason getReason() {
    return this.reason;
  }
  
  /**
   * The reason for the event.
   */
  public void setReason(@NonNull final LoadedSourceEventArgumentsReason reason) {
    this.reason = reason;
  }
  
  /**
   * The new, changed, or removed source.
   */
  @Pure
  @NonNull
  public Source getSource() {
    return this.source;
  }
  
  /**
   * The new, changed, or removed source.
   */
  public void setSource(@NonNull final Source source) {
    this.source = source;
  }
  
  @Override
  @Pure
  public String toString() {
    ToStringBuilder b = new ToStringBuilder(this);
    b.add("reason", this.reason);
    b.add("source", this.source);
    return b.toString();
  }
  
  @Override
  @Pure
  public boolean equals(final Object obj) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe type LoadedSourceEventArguments is already defined in LoadedSourceEventArguments.java.");
  }
  
  @Override
  @Pure
  public int hashCode() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe type LoadedSourceEventArguments is already defined in LoadedSourceEventArguments.java.");
  }
}
