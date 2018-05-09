/**
 * Copyright (c) 2016 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.lsp4j;

import com.google.gson.annotations.JsonAdapter;
import java.util.List;
import org.eclipse.lsp4j.ClientCapabilities;
import org.eclipse.lsp4j.WorkspaceFolder;
import org.eclipse.lsp4j.adapters.InitializeParamsTypeAdapter;
import org.eclipse.lsp4j.generator.JsonRpcData;
import org.eclipse.lsp4j.jsonrpc.json.adapters.JsonElementTypeAdapter;

/**
 * The initialize request is sent as the first request from the client to the server.
 */
/* @JsonRpcData */@JsonAdapter(InitializeParamsTypeAdapter.Factory.class)
@SuppressWarnings("all")
public class InitializeParams {
  /**
   * The process Id of the parent process that started the server.
   */
  private Integer processId;
  
  /**
   * The rootPath of the workspace. Is null if no folder is open.
   * 
   * @deprecated in favour of rootUri.
   */
  @Deprecated
  private String rootPath;
  
  /**
   * The rootUri of the workspace. Is null if no folder is open.
   * If both `rootPath` and `rootUri` are set, `rootUri` wins.
   */
  private String rootUri;
  
  /**
   * User provided initialization options.
   */
  @JsonAdapter(JsonElementTypeAdapter.Factory.class)
  private Object initializationOptions;
  
  /**
   * The capabilities provided by the client (editor)
   */
  private ClientCapabilities capabilities;
  
  /**
   * An optional extension to the protocol.
   * To tell the server what client (editor) is talking to it.
   */
  @Deprecated
  private String clientName;
  
  /**
   * The initial trace setting. If omitted trace is disabled ('off').
   * 
   * Legal values: 'off' | 'messages' | 'verbose'
   */
  private String trace;
  
  /**
   * The workspace folders configured in the client when the server starts.
   * This property is only available if the client supports workspace folders.
   * It can be `null` if the client supports workspace folders but none are
   * configured.
   * 
   * Since 3.6.0
   */
  private List<WorkspaceFolder> workspaceFolders;
}
