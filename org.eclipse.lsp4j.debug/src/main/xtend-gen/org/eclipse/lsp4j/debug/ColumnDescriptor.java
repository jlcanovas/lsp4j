/**
 * Copyright (c) 2017 Kichwa Coders Ltd. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.lsp4j.debug;

import org.eclipse.lsp4j.debug.ColumnDescriptorType;
import org.eclipse.lsp4j.generator.JsonRpcData;
import org.eclipse.lsp4j.jsonrpc.validation.NonNull;

/**
 * A ColumnDescriptor specifies what module attribute to show in a column of the ModulesView, how to format it,
 * and what the column's label should be.
 * <p>
 * It is only used if the underlying UI actually supports this level of customization.
 */
/* @JsonRpcData */@SuppressWarnings("all")
public class ColumnDescriptor {
  /**
   * Name of the attribute rendered in this column.
   */
  @NonNull
  private String attributeName;
  
  /**
   * Header UI label of column.
   */
  @NonNull
  private String label;
  
  /**
   * Format to use for the rendered values in this column. TBD how the format strings looks like.
   * <p>
   * This is an optional property.
   */
  private String format;
  
  /**
   * Datatype of values in this column.  Defaults to 'string' if not specified.
   * <p>
   * This is an optional property.
   */
  private ColumnDescriptorType type;
  
  /**
   * Width of this column in characters (hint only).
   * <p>
   * This is an optional property.
   */
  private Long width;
}
