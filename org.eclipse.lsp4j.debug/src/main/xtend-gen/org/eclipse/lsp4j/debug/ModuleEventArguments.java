/**
 * Copyright (c) 2017 Kichwa Coders Ltd. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.lsp4j.debug;

import org.eclipse.lsp4j.debug.Module;
import org.eclipse.lsp4j.debug.ModuleEventArgumentsReason;
import org.eclipse.lsp4j.jsonrpc.validation.NonNull;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

/**
 * Event message for 'module' event type.
 * <p>
 * The event indicates that some information about a module has changed.
 */
@SuppressWarnings("all")
public class ModuleEventArguments {
  /**
   * The reason for the event.
   */
  @NonNull
  private ModuleEventArgumentsReason reason;
  
  /**
   * The new, changed, or removed module. In case of 'removed' only the module id is used.
   */
  @NonNull
  private Module module;
  
  /**
   * The reason for the event.
   */
  @Pure
  @NonNull
  public ModuleEventArgumentsReason getReason() {
    return this.reason;
  }
  
  /**
   * The reason for the event.
   */
  public void setReason(@NonNull final ModuleEventArgumentsReason reason) {
    this.reason = reason;
  }
  
  /**
   * The new, changed, or removed module. In case of 'removed' only the module id is used.
   */
  @Pure
  @NonNull
  public Module getModule() {
    return this.module;
  }
  
  /**
   * The new, changed, or removed module. In case of 'removed' only the module id is used.
   */
  public void setModule(@NonNull final Module module) {
    this.module = module;
  }
  
  @Override
  @Pure
  public String toString() {
    ToStringBuilder b = new ToStringBuilder(this);
    b.add("reason", this.reason);
    b.add("module", this.module);
    return b.toString();
  }
  
  @Override
  @Pure
  public boolean equals(final Object obj) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe type ModuleEventArguments is already defined in ModuleEventArguments.java.");
  }
  
  @Override
  @Pure
  public int hashCode() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe type ModuleEventArguments is already defined in ModuleEventArguments.java.");
  }
}
