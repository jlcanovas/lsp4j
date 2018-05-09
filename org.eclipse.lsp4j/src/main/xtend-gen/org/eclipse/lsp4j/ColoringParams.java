/**
 * Copyright (c) 2016 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.lsp4j;

import com.google.common.annotations.Beta;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.lsp4j.ColoringInformation;
import org.eclipse.lsp4j.jsonrpc.validation.NonNull;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

/**
 * Representation of a computed mapping from ranges to the appropriate
 * highlighting style.
 */
@Beta
@SuppressWarnings("all")
public class ColoringParams {
  /**
   * The URI for which coloring information is reported.
   */
  @NonNull
  private String uri;
  
  /**
   * A list of coloring information instances.
   */
  @NonNull
  private List<? extends ColoringInformation> infos;
  
  public ColoringParams() {
    ArrayList<ColoringInformation> _arrayList = new ArrayList<ColoringInformation>();
    this.infos = _arrayList;
  }
  
  public ColoringParams(final String uri, final List<? extends ColoringInformation> infos) {
    this.uri = uri;
    this.infos = infos;
  }
  
  /**
   * The URI for which coloring information is reported.
   */
  @Pure
  @NonNull
  public String getUri() {
    return this.uri;
  }
  
  /**
   * The URI for which coloring information is reported.
   */
  public void setUri(@NonNull final String uri) {
    this.uri = uri;
  }
  
  /**
   * A list of coloring information instances.
   */
  @Pure
  @NonNull
  public List<? extends ColoringInformation> getInfos() {
    return this.infos;
  }
  
  /**
   * A list of coloring information instances.
   */
  public void setInfos(@NonNull final List<? extends ColoringInformation> infos) {
    this.infos = infos;
  }
  
  @Override
  @Pure
  public String toString() {
    ToStringBuilder b = new ToStringBuilder(this);
    b.add("uri", this.uri);
    b.add("infos", this.infos);
    return b.toString();
  }
  
  @Override
  @Pure
  public boolean equals(final Object obj) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe type ColoringParams is already defined in ColoringParams.java.");
  }
  
  @Override
  @Pure
  public int hashCode() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe type ColoringParams is already defined in ColoringParams.java.");
  }
}
