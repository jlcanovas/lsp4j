/**
 * Copyright (c) 2016 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.lsp4j;

import org.eclipse.lsp4j.DynamicRegistrationCapabilities;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

/**
 * Capabilities specific to the `textDocument/onTypeFormatting`
 */
@SuppressWarnings("all")
public class OnTypeFormattingCapabilities extends DynamicRegistrationCapabilities {
  public OnTypeFormattingCapabilities() {
  }
  
  public OnTypeFormattingCapabilities(final Boolean dynamicRegistration) {
    super(dynamicRegistration);
  }
  
  @Override
  @Pure
  public String toString() {
    ToStringBuilder b = new ToStringBuilder(this);
    b.add("dynamicRegistration", getDynamicRegistration());
    return b.toString();
  }
  
  @Override
  @Pure
  public boolean equals(final Object obj) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe type OnTypeFormattingCapabilities is already defined in OnTypeFormattingCapabilities.java.");
  }
  
  @Override
  @Pure
  public int hashCode() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe type OnTypeFormattingCapabilities is already defined in OnTypeFormattingCapabilities.java.");
  }
}
