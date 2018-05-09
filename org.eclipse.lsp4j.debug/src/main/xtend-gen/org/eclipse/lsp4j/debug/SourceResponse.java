/**
 * Copyright (c) 2017 Kichwa Coders Ltd. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.lsp4j.debug;

import org.eclipse.lsp4j.jsonrpc.validation.NonNull;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

/**
 * Response to 'source' request.
 */
@SuppressWarnings("all")
public class SourceResponse {
  /**
   * Content of the source reference.
   */
  @NonNull
  private String content;
  
  /**
   * Optional content type (mime type) of the source.
   * <p>
   * This is an optional property.
   */
  private String mimeType;
  
  /**
   * Content of the source reference.
   */
  @Pure
  @NonNull
  public String getContent() {
    return this.content;
  }
  
  /**
   * Content of the source reference.
   */
  public void setContent(@NonNull final String content) {
    this.content = content;
  }
  
  /**
   * Optional content type (mime type) of the source.
   * <p>
   * This is an optional property.
   */
  @Pure
  public String getMimeType() {
    return this.mimeType;
  }
  
  /**
   * Optional content type (mime type) of the source.
   * <p>
   * This is an optional property.
   */
  public void setMimeType(final String mimeType) {
    this.mimeType = mimeType;
  }
  
  @Override
  @Pure
  public String toString() {
    ToStringBuilder b = new ToStringBuilder(this);
    b.add("content", this.content);
    b.add("mimeType", this.mimeType);
    return b.toString();
  }
  
  @Override
  @Pure
  public boolean equals(final Object obj) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe type SourceResponse is already defined in SourceResponse.java.");
  }
  
  @Override
  @Pure
  public int hashCode() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe type SourceResponse is already defined in SourceResponse.java.");
  }
}
