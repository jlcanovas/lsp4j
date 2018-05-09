/**
 * Copyright (c) 2016 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.lsp4j;

import org.eclipse.lsp4j.generator.JsonRpcData;

/**
 * Save options.
 */
/* @JsonRpcData */@SuppressWarnings("all")
public class SaveOptions {
  /**
   * The client is supposed to include the content on save.
   */
  private Boolean includeText;
  
  public SaveOptions() {
  }
  
  public SaveOptions(final Boolean includeText) {
    this.includeText = includeText;
  }
}
