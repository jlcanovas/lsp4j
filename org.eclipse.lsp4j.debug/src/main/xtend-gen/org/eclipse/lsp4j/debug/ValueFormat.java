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
 * Provides formatting information for a value.
 */
/* @JsonRpcData */@SuppressWarnings("all")
public class ValueFormat {
  /**
   * Display the value in hex.
   * <p>
   * This is an optional property.
   */
  private Boolean hex;
}
