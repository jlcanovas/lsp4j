/**
 * Copyright (c) 2016 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.lsp4j;

import java.util.List;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

/**
 * The client supports the following `SignatureInformation` specific properties.
 */
@SuppressWarnings("all")
public class SignatureInformationCapabilities {
  /**
   * Client supports the following content formats for the documentation
   * property. The order describes the preferred format of the client.
   * 
   * See {@link MarkupKind} for allowed values.
   */
  private List<String> documentationFormat;
  
  public SignatureInformationCapabilities() {
  }
  
  public SignatureInformationCapabilities(final List<String> documentationFormat) {
    this.documentationFormat = documentationFormat;
  }
  
  /**
   * Client supports the following content formats for the documentation
   * property. The order describes the preferred format of the client.
   * 
   * See {@link MarkupKind} for allowed values.
   */
  @Pure
  public List<String> getDocumentationFormat() {
    return this.documentationFormat;
  }
  
  /**
   * Client supports the following content formats for the documentation
   * property. The order describes the preferred format of the client.
   * 
   * See {@link MarkupKind} for allowed values.
   */
  public void setDocumentationFormat(final List<String> documentationFormat) {
    this.documentationFormat = documentationFormat;
  }
  
  @Override
  @Pure
  public String toString() {
    ToStringBuilder b = new ToStringBuilder(this);
    b.add("documentationFormat", this.documentationFormat);
    return b.toString();
  }
  
  @Override
  @Pure
  public boolean equals(final Object obj) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe type SignatureInformationCapabilities is already defined in SignatureInformationCapabilities.java.");
  }
  
  @Override
  @Pure
  public int hashCode() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe type SignatureInformationCapabilities is already defined in SignatureInformationCapabilities.java.");
  }
}
