/**
 * Copyright (c) 2017 Kichwa Coders Ltd. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.lsp4j.debug;

import org.eclipse.lsp4j.generator.JsonRpcData;

/**
 * Optional properties of a variable that can be used to determine how to render the variable in the UI.
 */
/* @JsonRpcData */@SuppressWarnings("all")
public class VariablePresentationHint {
  /**
   * The kind of variable. Before introducing additional values, try to use the listed values.
   * <p>
   * This is an optional property.
   * <p>
   * Possible values include - but not limited to those defined in {@link VariablePresentationHintKind}
   */
  private String kind;
  
  /**
   * Set of attributes represented as an array of strings. Before introducing additional values, try to use the
   * listed values.
   * <p>
   * This is an optional property.
   * <p>
   * Possible values include - but not limited to those defined in {@link VariablePresentationHintAttributes}
   */
  private String[] attributes;
  
  /**
   * Visibility of variable. Before introducing additional values, try to use the listed values.
   * <p>
   * This is an optional property.
   * <p>
   * Possible values include - but not limited to those defined in {@link VariablePresentationHintVisibility}
   */
  private String visibility;
}
