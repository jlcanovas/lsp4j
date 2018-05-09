/**
 * Copyright (c) 2016 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.lsp4j;

import com.google.gson.annotations.JsonAdapter;
import org.eclipse.lsp4j.CodeLensOptions;
import org.eclipse.lsp4j.ColorProviderOptions;
import org.eclipse.lsp4j.CompletionOptions;
import org.eclipse.lsp4j.DocumentLinkOptions;
import org.eclipse.lsp4j.DocumentOnTypeFormattingOptions;
import org.eclipse.lsp4j.ExecuteCommandOptions;
import org.eclipse.lsp4j.SignatureHelpOptions;
import org.eclipse.lsp4j.StaticRegistrationOptions;
import org.eclipse.lsp4j.TextDocumentSyncKind;
import org.eclipse.lsp4j.TextDocumentSyncOptions;
import org.eclipse.lsp4j.WorkspaceServerCapabilities;
import org.eclipse.lsp4j.generator.JsonRpcData;
import org.eclipse.lsp4j.jsonrpc.json.adapters.JsonElementTypeAdapter;
import org.eclipse.lsp4j.jsonrpc.messages.Either;

/* @JsonRpcData */@SuppressWarnings("all")
public class ServerCapabilities {
  /**
   * Defines how text documents are synced. Is either a detailed structure defining each notification or
   * for backwards compatibility the TextDocumentSyncKind number.
   */
  private Either<TextDocumentSyncKind, TextDocumentSyncOptions> textDocumentSync;
  
  /**
   * The server provides hover support.
   */
  private Boolean hoverProvider;
  
  /**
   * The server provides completion support.
   */
  private CompletionOptions completionProvider;
  
  /**
   * The server provides signature help support.
   */
  private SignatureHelpOptions signatureHelpProvider;
  
  /**
   * The server provides goto definition support.
   */
  private Boolean definitionProvider;
  
  /**
   * The server provides Goto Type Definition support.
   * 
   * Since 3.6.0
   */
  private Either<Boolean, StaticRegistrationOptions> typeDefinitionProvider;
  
  /**
   * The server provides Goto Implementation support.
   * 
   * Since 3.6.0
   */
  private Either<Boolean, StaticRegistrationOptions> implementationProvider;
  
  /**
   * The server provides find references support.
   */
  private Boolean referencesProvider;
  
  /**
   * The server provides document highlight support.
   */
  private Boolean documentHighlightProvider;
  
  /**
   * The server provides document symbol support.
   */
  private Boolean documentSymbolProvider;
  
  /**
   * The server provides workspace symbol support.
   */
  private Boolean workspaceSymbolProvider;
  
  /**
   * The server provides code actions.
   */
  private Boolean codeActionProvider;
  
  /**
   * The server provides code lens.
   */
  private CodeLensOptions codeLensProvider;
  
  /**
   * The server provides document formatting.
   */
  private Boolean documentFormattingProvider;
  
  /**
   * The server provides document range formatting.
   */
  private Boolean documentRangeFormattingProvider;
  
  /**
   * The server provides document formatting on typing.
   */
  private DocumentOnTypeFormattingOptions documentOnTypeFormattingProvider;
  
  /**
   * The server provides rename support.
   */
  private Boolean renameProvider;
  
  /**
   * The server provides document link support.
   */
  private DocumentLinkOptions documentLinkProvider;
  
  /**
   * The server provides color provider support.
   * 
   * Since 3.6.0
   */
  private ColorProviderOptions colorProvider;
  
  /**
   * The server provides execute command support.
   */
  private ExecuteCommandOptions executeCommandProvider;
  
  /**
   * Workspace specific server capabilities
   */
  private WorkspaceServerCapabilities workspace;
  
  /**
   * Experimental server capabilities.
   */
  @JsonAdapter(JsonElementTypeAdapter.Factory.class)
  private Object experimental;
}
