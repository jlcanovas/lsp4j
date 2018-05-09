/**
 * Copyright (c) 2016 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.lsp4j;

import java.util.List;
import org.eclipse.lsp4j.FileSystemWatcher;
import org.eclipse.lsp4j.generator.JsonRpcData;
import org.eclipse.lsp4j.jsonrpc.validation.NonNull;

/* @JsonRpcData */@SuppressWarnings("all")
public class DidChangeWatchedFilesRegistrationOptions {
  /**
   * The watchers to register.
   */
  @NonNull
  private List<FileSystemWatcher> watchers;
  
  public DidChangeWatchedFilesRegistrationOptions() {
  }
  
  public DidChangeWatchedFilesRegistrationOptions(@NonNull final List<FileSystemWatcher> watchers) {
    this.watchers = watchers;
  }
}
