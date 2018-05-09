/**
 * Copyright (c) 2016 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.lsp4j;

import org.eclipse.lsp4j.DynamicRegistrationCapabilities;
import org.eclipse.lsp4j.SignatureInformationCapabilities;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

/**
 * Capabilities specific to the `textDocument/signatureHelp`
 */
@SuppressWarnings("all")
public class SignatureHelpCapabilities extends DynamicRegistrationCapabilities {
  /**
   * The client supports the following `SignatureInformation`
   * specific properties.
   */
  private SignatureInformationCapabilities signatureInformation;
  
  public SignatureHelpCapabilities() {
  }
  
  public SignatureHelpCapabilities(final Boolean dynamicRegistration) {
    super(dynamicRegistration);
  }
  
  public SignatureHelpCapabilities(final SignatureInformationCapabilities signatureInformation, final Boolean dynamicRegistration) {
    super(dynamicRegistration);
    this.signatureInformation = signatureInformation;
  }
  
  /**
   * The client supports the following `SignatureInformation`
   * specific properties.
   */
  @Pure
  public SignatureInformationCapabilities getSignatureInformation() {
    return this.signatureInformation;
  }
  
  /**
   * The client supports the following `SignatureInformation`
   * specific properties.
   */
  public void setSignatureInformation(final SignatureInformationCapabilities signatureInformation) {
    this.signatureInformation = signatureInformation;
  }
  
  @Override
  @Pure
  public String toString() {
    ToStringBuilder b = new ToStringBuilder(this);
    b.add("signatureInformation", this.signatureInformation);
    b.add("dynamicRegistration", getDynamicRegistration());
    return b.toString();
  }
  
  @Override
  @Pure
  public boolean equals(final Object obj) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe type SignatureHelpCapabilities is already defined in SignatureHelpCapabilities.java.");
  }
  
  @Override
  @Pure
  public int hashCode() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe type SignatureHelpCapabilities is already defined in SignatureHelpCapabilities.java.");
  }
}
