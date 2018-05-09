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

/**
 * The show message request is sent from a server to a client to ask the client to display a particular message in the
 * user class. In addition to the show message notification the request allows to pass actions and to wait for an
 * answer from the client.
 */
/* @JsonRpcData */@SuppressWarnings("all")
public class MessageActionItem {
  /**
   * A short title like 'Retry', 'Open Log' etc.
   */
  @NonNull
  private String title;
  
  public MessageActionItem() {
  }
  
  public MessageActionItem(@NonNull final String title) {
    this.title = title;
  }
}
