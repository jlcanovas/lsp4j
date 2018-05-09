/**
 * Copyright (c) 2017 Kichwa Coders Ltd. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.lsp4j.debug;

import org.eclipse.lsp4j.jsonrpc.messages.Either;
import org.eclipse.lsp4j.jsonrpc.validation.NonNull;
import org.eclipse.xtext.xbase.lib.Pure;

/**
 * A Module object represents a row in the modules view.
 * <p>
 * Two attributes are mandatory: an id identifies a module in the modules view and is used in a ModuleEvent for
 * identifying a module for adding, updating or deleting.
 * <p>
 * The name is used to minimally render the module in the UI.
 * <p>
 * 
 * <p>
 * Additional attributes can be added to the module. They will show up in the module View if they have a
 * corresponding ColumnDescriptor.
 * <p>
 * 
 * <p>
 * To avoid an unnecessary proliferation of additional attributes with similar semantics but different names
 * <p>
 * we recommend to re-use attributes from the 'recommended' list below first, and only introduce new attributes if
 * nothing appropriate could be found.
 */
@SuppressWarnings("all")
public class Module {
  /**
   * Unique identifier for the module.
   */
  @NonNull
  private Either<Long, String> id;
  
  /**
   * A name of the module.
   */
  @NonNull
  private String name;
  
  /**
   * optional but recommended attributes.
   * <p>
   * always try to use these first before introducing additional attributes.
   * <p>
   * 
   * <p>
   * Logical full path to the module. The exact definition is implementation defined, but usually this would be a
   * full path to the on-disk file for the module.
   * <p>
   * This is an optional property.
   */
  private String path;
  
  /**
   * True if the module is optimized.
   * <p>
   * This is an optional property.
   */
  private Boolean isOptimized;
  
  /**
   * True if the module is considered 'user code' by a debugger that supports 'Just My Code'.
   * <p>
   * This is an optional property.
   */
  private Boolean isUserCode;
  
  /**
   * Version of Module.
   * <p>
   * This is an optional property.
   */
  private String version;
  
  /**
   * User understandable description of if symbols were found for the module (ex: 'Symbols Loaded', 'Symbols not
   * found', etc.
   * <p>
   * This is an optional property.
   */
  private String symbolStatus;
  
  /**
   * Logical full path to the symbol file. The exact definition is implementation defined.
   * <p>
   * This is an optional property.
   */
  private String symbolFilePath;
  
  /**
   * Module created or modified.
   * <p>
   * This is an optional property.
   */
  private String dateTimeStamp;
  
  /**
   * Address range covered by this module.
   * <p>
   * This is an optional property.
   */
  private String addressRange;
  
  /**
   * Unique identifier for the module.
   */
  @Pure
  @NonNull
  public Either<Long, String> getId() {
    return this.id;
  }
  
  /**
   * Unique identifier for the module.
   */
  public void setId(@NonNull final Either<Long, String> id) {
    this.id = id;
  }
}
