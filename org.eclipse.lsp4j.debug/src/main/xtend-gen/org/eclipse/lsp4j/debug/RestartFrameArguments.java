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
 * Arguments for 'restartFrame' request.
 */
@SuppressWarnings("all")
public class RestartFrameArguments {
  /**
   * Restart this stackframe.
   */
  @NonNull
  private Long frameId;
  
  /**
   * Restart this stackframe.
   */
  @Pure
  @NonNull
  public Long getFrameId() {
    return this.frameId;
  }
  
  /**
   * Restart this stackframe.
   */
  public void setFrameId(@NonNull final Long frameId) {
    this.frameId = frameId;
  }
  
  @Override
  @Pure
  public String toString() {
    ToStringBuilder b = new ToStringBuilder(this);
    b.add("frameId", this.frameId);
    return b.toString();
  }
  
  @Override
  @Pure
  public boolean equals(final Object obj) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe type RestartFrameArguments is already defined in RestartFrameArguments.java.");
  }
  
  @Override
  @Pure
  public int hashCode() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe type RestartFrameArguments is already defined in RestartFrameArguments.java.");
  }
}
