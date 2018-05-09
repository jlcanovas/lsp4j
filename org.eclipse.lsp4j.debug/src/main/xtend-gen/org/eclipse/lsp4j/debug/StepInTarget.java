/**
 * Copyright (c) 2017 Kichwa Coders Ltd. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.lsp4j.debug;

import org.eclipse.lsp4j.generator.JsonRpcData;
import org.eclipse.lsp4j.jsonrpc.validation.NonNull;

/**
 * A StepInTarget can be used in the 'stepIn' request and determines into which single target the stepIn request
 * should step.
 */
/* @JsonRpcData */@SuppressWarnings("all")
public class StepInTarget {
  /**
   * Unique identifier for a stepIn target.
   */
  @NonNull
  private Long id;
  
  /**
   * The name of the stepIn target (shown in the UI).
   */
  @NonNull
  private String label;
}
