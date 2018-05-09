/**
 * Copyright (c) 2016 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.lsp4j;

import org.eclipse.lsp4j.SaveOptions;
import org.eclipse.lsp4j.TextDocumentSyncKind;
import org.eclipse.lsp4j.generator.JsonRpcData;

/* @JsonRpcData */@SuppressWarnings("all")
public class TextDocumentSyncOptions {
  /**
   * Open and close notifications are sent to the server.
   */
  private Boolean openClose;
  
  /**
   * Change notifications are sent to the server. See TextDocumentSyncKind.None, TextDocumentSyncKind.Full
   * and TextDocumentSyncKind.Incremental.
   */
  private TextDocumentSyncKind change;
  
  /**
   * Will save notifications are sent to the server.
   */
  private Boolean willSave;
  
  /**
   * Will save wait until requests are sent to the server.
   */
  private Boolean willSaveWaitUntil;
  
  /**
   * Save notifications are sent to the server.
   */
  private SaveOptions save;
}
