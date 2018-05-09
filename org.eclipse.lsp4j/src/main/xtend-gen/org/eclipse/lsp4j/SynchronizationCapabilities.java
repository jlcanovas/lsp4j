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

@SuppressWarnings("all")
public class SynchronizationCapabilities extends DynamicRegistrationCapabilities {
  /**
   * The client supports sending will save notifications.
   */
  private Boolean willSave;
  
  /**
   * The client supports sending a will save request and
   * waits for a response providing text edits which will
   * be applied to the document before it is saved.
   */
  private Boolean willSaveWaitUntil;
  
  /**
   * The client supports did save notifications.
   */
  private Boolean didSave;
  
  public SynchronizationCapabilities() {
  }
  
  public SynchronizationCapabilities(final Boolean willSave, final Boolean willSaveWaitUntil, final Boolean didSave) {
    this.willSave = willSave;
    this.willSaveWaitUntil = willSaveWaitUntil;
    this.didSave = didSave;
  }
  
  public SynchronizationCapabilities(final Boolean willSave, final Boolean willSaveWaitUntil, final Boolean didSave, final Boolean dynamicRegistration) {
    super(dynamicRegistration);
    this.willSave = willSave;
    this.willSaveWaitUntil = willSaveWaitUntil;
    this.didSave = didSave;
  }
  
  /**
   * The client supports sending will save notifications.
   */
  @Pure
  public Boolean getWillSave() {
    return this.willSave;
  }
  
  /**
   * The client supports sending will save notifications.
   */
  public void setWillSave(final Boolean willSave) {
    this.willSave = willSave;
  }
  
  /**
   * The client supports sending a will save request and
   * waits for a response providing text edits which will
   * be applied to the document before it is saved.
   */
  @Pure
  public Boolean getWillSaveWaitUntil() {
    return this.willSaveWaitUntil;
  }
  
  /**
   * The client supports sending a will save request and
   * waits for a response providing text edits which will
   * be applied to the document before it is saved.
   */
  public void setWillSaveWaitUntil(final Boolean willSaveWaitUntil) {
    this.willSaveWaitUntil = willSaveWaitUntil;
  }
  
  /**
   * The client supports did save notifications.
   */
  @Pure
  public Boolean getDidSave() {
    return this.didSave;
  }
  
  /**
   * The client supports did save notifications.
   */
  public void setDidSave(final Boolean didSave) {
    this.didSave = didSave;
  }
  
  @Override
  @Pure
  public String toString() {
    ToStringBuilder b = new ToStringBuilder(this);
    b.add("willSave", this.willSave);
    b.add("willSaveWaitUntil", this.willSaveWaitUntil);
    b.add("didSave", this.didSave);
    b.add("dynamicRegistration", getDynamicRegistration());
    return b.toString();
  }
  
  @Override
  @Pure
  public boolean equals(final Object obj) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe type SynchronizationCapabilities is already defined in SynchronizationCapabilities.java.");
  }
  
  @Override
  @Pure
  public int hashCode() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe type SynchronizationCapabilities is already defined in SynchronizationCapabilities.java.");
  }
}
