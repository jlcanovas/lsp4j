/**
 * Copyright (c) 2017 Kichwa Coders Ltd. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.lsp4j.debug;

import org.eclipse.lsp4j.debug.GotoTarget;
import org.eclipse.lsp4j.jsonrpc.validation.NonNull;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

/**
 * Response to 'gotoTargets' request.
 */
@SuppressWarnings("all")
public class GotoTargetsResponse {
  /**
   * The possible goto targets of the specified location.
   */
  @NonNull
  private GotoTarget[] targets;
  
  /**
   * The possible goto targets of the specified location.
   */
  @Pure
  @NonNull
  public GotoTarget[] getTargets() {
    return this.targets;
  }
  
  /**
   * The possible goto targets of the specified location.
   */
  public void setTargets(@NonNull final GotoTarget[] targets) {
    this.targets = targets;
  }
  
  @Override
  @Pure
  public String toString() {
    ToStringBuilder b = new ToStringBuilder(this);
    b.add("targets", this.targets);
    return b.toString();
  }
  
  @Override
  @Pure
  public boolean equals(final Object obj) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe type GotoTargetsResponse is already defined in GotoTargetsResponse.java.");
  }
  
  @Override
  @Pure
  public int hashCode() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe type GotoTargetsResponse is already defined in GotoTargetsResponse.java.");
  }
}
