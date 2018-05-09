/**
 * Copyright (c) 2016 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.lsp4j;

import java.util.List;
import org.eclipse.lsp4j.DynamicRegistrationCapabilities;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

/**
 * Capabilities specific to the `textDocument/hover`
 */
@SuppressWarnings("all")
public class HoverCapabilities extends DynamicRegistrationCapabilities {
  /**
   * Client supports the following content formats for the content
   * property. The order describes the preferred format of the client.
   * 
   * See {@link MarkupKind} for allowed values.
   */
  private List<String> contentFormat;
  
  public HoverCapabilities() {
  }
  
  public HoverCapabilities(final Boolean dynamicRegistration) {
    super(dynamicRegistration);
  }
  
  public HoverCapabilities(final List<String> contentFormat, final Boolean dynamicRegistration) {
    super(dynamicRegistration);
    this.contentFormat = contentFormat;
  }
  
  /**
   * Client supports the following content formats for the content
   * property. The order describes the preferred format of the client.
   * 
   * See {@link MarkupKind} for allowed values.
   */
  @Pure
  public List<String> getContentFormat() {
    return this.contentFormat;
  }
  
  /**
   * Client supports the following content formats for the content
   * property. The order describes the preferred format of the client.
   * 
   * See {@link MarkupKind} for allowed values.
   */
  public void setContentFormat(final List<String> contentFormat) {
    this.contentFormat = contentFormat;
  }
  
  @Override
  @Pure
  public String toString() {
    ToStringBuilder b = new ToStringBuilder(this);
    b.add("contentFormat", this.contentFormat);
    b.add("dynamicRegistration", getDynamicRegistration());
    return b.toString();
  }
  
  @Override
  @Pure
  public boolean equals(final Object obj) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe type HoverCapabilities is already defined in HoverCapabilities.java.");
  }
  
  @Override
  @Pure
  public int hashCode() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe type HoverCapabilities is already defined in HoverCapabilities.java.");
  }
}
