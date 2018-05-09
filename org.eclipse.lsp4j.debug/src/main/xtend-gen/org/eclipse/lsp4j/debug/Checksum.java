/**
 * Copyright (c) 2017 Kichwa Coders Ltd. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.lsp4j.debug;

import org.eclipse.lsp4j.debug.ChecksumAlgorithm;
import org.eclipse.lsp4j.generator.JsonRpcData;
import org.eclipse.lsp4j.jsonrpc.validation.NonNull;

/**
 * The checksum of an item calculated by the specified algorithm.
 */
/* @JsonRpcData */@SuppressWarnings("all")
public class Checksum {
  /**
   * The algorithm used to calculate this checksum.
   */
  @NonNull
  private ChecksumAlgorithm algorithm;
  
  /**
   * Value of the checksum.
   */
  @NonNull
  private String checksum;
}
