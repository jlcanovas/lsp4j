/**
 * Copyright (c) 2016 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.lsp4j;

import com.google.common.annotations.Beta;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

/**
 * Capabilities specific to `WorkspaceEdit`s
 */
@SuppressWarnings("all")
public class WorkspaceEditCapabilities {
  /**
   * The client supports versioned document changes in `WorkspaceEdit`s
   */
  private Boolean documentChanges;
  
  /**
   * The client supports resource changes
   * in `WorkspaceEdit`s.
   */
  @Beta
  private Boolean resourceChanges;
  
  public WorkspaceEditCapabilities() {
  }
  
  public WorkspaceEditCapabilities(final Boolean documentChanges) {
    this.documentChanges = documentChanges;
  }
  
  /**
   * The client supports versioned document changes in `WorkspaceEdit`s
   */
  @Pure
  public Boolean getDocumentChanges() {
    return this.documentChanges;
  }
  
  /**
   * The client supports versioned document changes in `WorkspaceEdit`s
   */
  public void setDocumentChanges(final Boolean documentChanges) {
    this.documentChanges = documentChanges;
  }
  
  /**
   * The client supports resource changes
   * in `WorkspaceEdit`s.
   */
  @Pure
  public Boolean getResourceChanges() {
    return this.resourceChanges;
  }
  
  /**
   * The client supports resource changes
   * in `WorkspaceEdit`s.
   */
  public void setResourceChanges(final Boolean resourceChanges) {
    this.resourceChanges = resourceChanges;
  }
  
  @Override
  @Pure
  public String toString() {
    ToStringBuilder b = new ToStringBuilder(this);
    b.add("documentChanges", this.documentChanges);
    b.add("resourceChanges", this.resourceChanges);
    return b.toString();
  }
  
  @Override
  @Pure
  public boolean equals(final Object obj) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe type WorkspaceEditCapabilities is already defined in WorkspaceEditCapabilities.java.");
  }
  
  @Override
  @Pure
  public int hashCode() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe type WorkspaceEditCapabilities is already defined in WorkspaceEditCapabilities.java.");
  }
}
