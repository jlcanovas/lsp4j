/**
 * Copyright (c) 2017 Kichwa Coders Ltd. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.lsp4j.debug;

import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

/**
 * Response to Initialize request.
 */
@SuppressWarnings("all")
public class RunInTerminalResponse {
  /**
   * The process ID.
   * <p>
   * This is an optional property.
   */
  private Long processId;
  
  /**
   * The process ID.
   * <p>
   * This is an optional property.
   */
  @Pure
  public Long getProcessId() {
    return this.processId;
  }
  
  /**
   * The process ID.
   * <p>
   * This is an optional property.
   */
  public void setProcessId(final Long processId) {
    this.processId = processId;
  }
  
  @Override
  @Pure
  public String toString() {
    ToStringBuilder b = new ToStringBuilder(this);
    b.add("processId", this.processId);
    return b.toString();
  }
  
  @Override
  @Pure
  public boolean equals(final Object obj) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe type RunInTerminalResponse is already defined in RunInTerminalResponse.java.");
  }
  
  @Override
  @Pure
  public int hashCode() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe type RunInTerminalResponse is already defined in RunInTerminalResponse.java.");
  }
}
