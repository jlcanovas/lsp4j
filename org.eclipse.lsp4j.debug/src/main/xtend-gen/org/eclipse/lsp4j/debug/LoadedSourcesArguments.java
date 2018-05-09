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
 * Arguments for 'loadedSources' request.
 * <p>
 * The 'loadedSources' request has no standardized arguments.
 */
@SuppressWarnings("all")
public class LoadedSourcesArguments {
  @Override
  @Pure
  public String toString() {
    ToStringBuilder b = new ToStringBuilder(this);
    return b.toString();
  }
  
  @Override
  @Pure
  public boolean equals(final Object obj) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe type LoadedSourcesArguments is already defined in LoadedSourcesArguments.java.");
  }
  
  @Override
  @Pure
  public int hashCode() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe type LoadedSourcesArguments is already defined in LoadedSourcesArguments.java.");
  }
}
