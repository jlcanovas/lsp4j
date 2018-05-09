/**
 * Copyright (c) 2017 Kichwa Coders Ltd. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.lsp4j.debug;

import org.eclipse.lsp4j.debug.Module;
import org.eclipse.lsp4j.jsonrpc.validation.NonNull;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

/**
 * Response to 'modules' request.
 */
@SuppressWarnings("all")
public class ModulesResponse {
  /**
   * All modules or range of modules.
   */
  @NonNull
  private Module[] modules;
  
  /**
   * The total number of modules available.
   * <p>
   * This is an optional property.
   */
  private Long totalModules;
  
  /**
   * All modules or range of modules.
   */
  @Pure
  @NonNull
  public Module[] getModules() {
    return this.modules;
  }
  
  /**
   * All modules or range of modules.
   */
  public void setModules(@NonNull final Module[] modules) {
    this.modules = modules;
  }
  
  /**
   * The total number of modules available.
   * <p>
   * This is an optional property.
   */
  @Pure
  public Long getTotalModules() {
    return this.totalModules;
  }
  
  /**
   * The total number of modules available.
   * <p>
   * This is an optional property.
   */
  public void setTotalModules(final Long totalModules) {
    this.totalModules = totalModules;
  }
  
  @Override
  @Pure
  public String toString() {
    ToStringBuilder b = new ToStringBuilder(this);
    b.add("modules", this.modules);
    b.add("totalModules", this.totalModules);
    return b.toString();
  }
  
  @Override
  @Pure
  public boolean equals(final Object obj) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe type ModulesResponse is already defined in ModulesResponse.java.");
  }
  
  @Override
  @Pure
  public int hashCode() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe type ModulesResponse is already defined in ModulesResponse.java.");
  }
}
