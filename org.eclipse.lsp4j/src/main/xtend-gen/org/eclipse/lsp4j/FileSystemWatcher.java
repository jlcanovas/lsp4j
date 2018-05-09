/**
 * Copyright (c) 2016 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.lsp4j;

import org.eclipse.lsp4j.generator.JsonRpcData;
import org.eclipse.lsp4j.jsonrpc.validation.NonNull;

/* @JsonRpcData */@SuppressWarnings("all")
public class FileSystemWatcher {
  /**
   * The  glob pattern to watch
   */
  @NonNull
  private String globPattern;
  
  /**
   * The kind of events of interest. If omitted it defaults
   * to WatchKind.Create | WatchKind.Change | WatchKind.Delete
   * which is 7.
   */
  private Integer kind;
  
  public FileSystemWatcher() {
  }
  
  public FileSystemWatcher(@NonNull final String globPattern) {
    this.globPattern = globPattern;
  }
  
  public FileSystemWatcher(@NonNull final String globPattern, final Integer kind) {
    this.globPattern = globPattern;
    this.kind = kind;
  }
}
