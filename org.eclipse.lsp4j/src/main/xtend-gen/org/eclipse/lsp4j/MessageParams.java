/**
 * Copyright (c) 2016 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.lsp4j;

import org.eclipse.lsp4j.MessageType;
import org.eclipse.lsp4j.generator.JsonRpcData;
import org.eclipse.lsp4j.jsonrpc.validation.NonNull;

/**
 * The show message notification is sent from a server to a client to ask the client to display a particular message
 * in the user class.
 * 
 * The log message notification is send from the server to the client to ask the client to log a particular message.
 */
/* @JsonRpcData */@SuppressWarnings("all")
public class MessageParams {
  /**
   * The message type.
   */
  @NonNull
  private MessageType type;
  
  /**
   * The actual message.
   */
  @NonNull
  private String message;
  
  public MessageParams() {
  }
  
  public MessageParams(@NonNull final MessageType type, @NonNull final String message) {
    this.type = type;
    this.message = message;
  }
}
