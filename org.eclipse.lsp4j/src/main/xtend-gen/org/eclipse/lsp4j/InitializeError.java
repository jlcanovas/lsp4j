/**
 * Copyright (c) 2016 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.lsp4j;

import org.eclipse.lsp4j.generator.JsonRpcData;

/* @JsonRpcData */@SuppressWarnings("all")
public class InitializeError {
  /**
   * Indicates whether the client executes the following retry logic:
   * (1) show the message provided by the ResponseError to the user
   * (2) user selects retry or cancel
   * (3) if user selected retry the initialize method is sent again.
   */
  private boolean retry;
  
  public InitializeError() {
  }
  
  public InitializeError(final boolean retry) {
    this.retry = retry;
  }
}
