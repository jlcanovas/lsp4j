/**
 * Copyright (c) 2016 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.lsp4j;

import org.eclipse.lsp4j.FileChangeType;
import org.eclipse.lsp4j.generator.JsonRpcData;
import org.eclipse.lsp4j.jsonrpc.validation.NonNull;

/**
 * An event describing a file change.
 */
/* @JsonRpcData */@SuppressWarnings("all")
public class FileEvent {
  /**
   * The file's uri.
   */
  @NonNull
  private String uri;
  
  /**
   * The change type.
   */
  @NonNull
  private FileChangeType type;
  
  public FileEvent() {
  }
  
  public FileEvent(@NonNull final String uri, @NonNull final FileChangeType type) {
    this.uri = uri;
    this.type = type;
  }
}
