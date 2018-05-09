/**
 * Copyright (c) 2017 Kichwa Coders Ltd. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.lsp4j.debug;

import org.eclipse.lsp4j.debug.Checksum;
import org.eclipse.lsp4j.debug.SourcePresentationHint;
import org.eclipse.lsp4j.generator.JsonRpcData;

/**
 * A Source is a descriptor for source code. It is returned from the debug adapter as part of a StackFrame and it
 * is used by clients when specifying breakpoints.
 */
/* @JsonRpcData */@SuppressWarnings("all")
public class Source {
  /**
   * The short name of the source. Every source returned from the debug adapter has a name. When sending a source to
   * the debug adapter this name is optional.
   * <p>
   * This is an optional property.
   */
  private String name;
  
  /**
   * The path of the source to be shown in the UI. It is only used to locate and load the content of the source if
   * no sourceReference is specified (or its vaule is 0).
   * <p>
   * This is an optional property.
   */
  private String path;
  
  /**
   * If sourceReference > 0 the contents of the source must be retrieved through the SourceRequest (even if a path
   * is specified). A sourceReference is only valid for a session, so it must not be used to persist a source.
   * <p>
   * This is an optional property.
   */
  private Long sourceReference;
  
  /**
   * An optional hint for how to present the source in the UI. A value of 'deemphasize' can be used to indicate that
   * the source is not available or that it is skipped on stepping.
   * <p>
   * This is an optional property.
   */
  private SourcePresentationHint presentationHint;
  
  /**
   * The (optional) origin of this source: possible values 'internal module', 'inlined content from source map',
   * etc.
   * <p>
   * This is an optional property.
   */
  private String origin;
  
  /**
   * An optional list of sources that are related to this source. These may be the source that generated this
   * source.
   * <p>
   * This is an optional property.
   */
  private Source[] sources;
  
  /**
   * Optional data that a debug adapter might want to loop through the client. The client should leave the data
   * intact and persist it across sessions. The client should not interpret the data.
   * <p>
   * This is an optional property.
   */
  private Object adapterData;
  
  /**
   * The checksums associated with this file.
   * <p>
   * This is an optional property.
   */
  private Checksum[] checksums;
}
