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
 * Arguments for 'modules' request.
 */
@SuppressWarnings("all")
public class ModulesArguments {
  /**
   * The index of the first module to return; if omitted modules start at 0.
   * <p>
   * This is an optional property.
   */
  private Long startModule;
  
  /**
   * The number of modules to return. If moduleCount is not specified or 0, all modules are returned.
   * <p>
   * This is an optional property.
   */
  private Long moduleCount;
  
  /**
   * The index of the first module to return; if omitted modules start at 0.
   * <p>
   * This is an optional property.
   */
  @Pure
  public Long getStartModule() {
    return this.startModule;
  }
  
  /**
   * The index of the first module to return; if omitted modules start at 0.
   * <p>
   * This is an optional property.
   */
  public void setStartModule(final Long startModule) {
    this.startModule = startModule;
  }
  
  /**
   * The number of modules to return. If moduleCount is not specified or 0, all modules are returned.
   * <p>
   * This is an optional property.
   */
  @Pure
  public Long getModuleCount() {
    return this.moduleCount;
  }
  
  /**
   * The number of modules to return. If moduleCount is not specified or 0, all modules are returned.
   * <p>
   * This is an optional property.
   */
  public void setModuleCount(final Long moduleCount) {
    this.moduleCount = moduleCount;
  }
  
  @Override
  @Pure
  public String toString() {
    ToStringBuilder b = new ToStringBuilder(this);
    b.add("startModule", this.startModule);
    b.add("moduleCount", this.moduleCount);
    return b.toString();
  }
  
  @Override
  @Pure
  public boolean equals(final Object obj) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe type ModulesArguments is already defined in ModulesArguments.java.");
  }
  
  @Override
  @Pure
  public int hashCode() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe type ModulesArguments is already defined in ModulesArguments.java.");
  }
}
