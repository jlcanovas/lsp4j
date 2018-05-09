/**
 * Copyright (c) 2016 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.lsp4j;

import org.eclipse.lsp4j.DidChangeConfigurationCapabilities;
import org.eclipse.lsp4j.DidChangeWatchedFilesCapabilities;
import org.eclipse.lsp4j.ExecuteCommandCapabilities;
import org.eclipse.lsp4j.SymbolCapabilities;
import org.eclipse.lsp4j.WorkspaceEditCapabilities;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

/**
 * Workspace specific client capabilities.
 */
@SuppressWarnings("all")
public class WorkspaceClientCapabilities {
  /**
   * The client supports applying batch edits to the workspace by supporting
   * the request 'workspace/applyEdit'.
   */
  private Boolean applyEdit;
  
  /**
   * Capabilities specific to `WorkspaceEdit`s
   */
  private WorkspaceEditCapabilities workspaceEdit;
  
  /**
   * Capabilities specific to the `workspace/didChangeConfiguration` notification.
   */
  private DidChangeConfigurationCapabilities didChangeConfiguration;
  
  /**
   * Capabilities specific to the `workspace/didChangeConfiguration` notification.
   */
  private DidChangeWatchedFilesCapabilities didChangeWatchedFiles;
  
  /**
   * Capabilities specific to the `workspace/symbol` request.
   */
  private SymbolCapabilities symbol;
  
  /**
   * Capabilities specific to the `workspace/executeCommand` request.
   */
  private ExecuteCommandCapabilities executeCommand;
  
  /**
   * The client has support for workspace folders.
   * 
   * Since 3.6.0
   */
  private Boolean workspaceFolders;
  
  /**
   * The client supports `workspace/configuration` requests.
   * 
   * Since 3.6.0
   */
  private Boolean configuration;
  
  /**
   * The client supports applying batch edits to the workspace by supporting
   * the request 'workspace/applyEdit'.
   */
  @Pure
  public Boolean getApplyEdit() {
    return this.applyEdit;
  }
  
  /**
   * The client supports applying batch edits to the workspace by supporting
   * the request 'workspace/applyEdit'.
   */
  public void setApplyEdit(final Boolean applyEdit) {
    this.applyEdit = applyEdit;
  }
  
  /**
   * Capabilities specific to `WorkspaceEdit`s
   */
  @Pure
  public WorkspaceEditCapabilities getWorkspaceEdit() {
    return this.workspaceEdit;
  }
  
  /**
   * Capabilities specific to `WorkspaceEdit`s
   */
  public void setWorkspaceEdit(final WorkspaceEditCapabilities workspaceEdit) {
    this.workspaceEdit = workspaceEdit;
  }
  
  /**
   * Capabilities specific to the `workspace/didChangeConfiguration` notification.
   */
  @Pure
  public DidChangeConfigurationCapabilities getDidChangeConfiguration() {
    return this.didChangeConfiguration;
  }
  
  /**
   * Capabilities specific to the `workspace/didChangeConfiguration` notification.
   */
  public void setDidChangeConfiguration(final DidChangeConfigurationCapabilities didChangeConfiguration) {
    this.didChangeConfiguration = didChangeConfiguration;
  }
  
  /**
   * Capabilities specific to the `workspace/didChangeConfiguration` notification.
   */
  @Pure
  public DidChangeWatchedFilesCapabilities getDidChangeWatchedFiles() {
    return this.didChangeWatchedFiles;
  }
  
  /**
   * Capabilities specific to the `workspace/didChangeConfiguration` notification.
   */
  public void setDidChangeWatchedFiles(final DidChangeWatchedFilesCapabilities didChangeWatchedFiles) {
    this.didChangeWatchedFiles = didChangeWatchedFiles;
  }
  
  /**
   * Capabilities specific to the `workspace/symbol` request.
   */
  @Pure
  public SymbolCapabilities getSymbol() {
    return this.symbol;
  }
  
  /**
   * Capabilities specific to the `workspace/symbol` request.
   */
  public void setSymbol(final SymbolCapabilities symbol) {
    this.symbol = symbol;
  }
  
  /**
   * Capabilities specific to the `workspace/executeCommand` request.
   */
  @Pure
  public ExecuteCommandCapabilities getExecuteCommand() {
    return this.executeCommand;
  }
  
  /**
   * Capabilities specific to the `workspace/executeCommand` request.
   */
  public void setExecuteCommand(final ExecuteCommandCapabilities executeCommand) {
    this.executeCommand = executeCommand;
  }
  
  /**
   * The client has support for workspace folders.
   * 
   * Since 3.6.0
   */
  @Pure
  public Boolean getWorkspaceFolders() {
    return this.workspaceFolders;
  }
  
  /**
   * The client has support for workspace folders.
   * 
   * Since 3.6.0
   */
  public void setWorkspaceFolders(final Boolean workspaceFolders) {
    this.workspaceFolders = workspaceFolders;
  }
  
  /**
   * The client supports `workspace/configuration` requests.
   * 
   * Since 3.6.0
   */
  @Pure
  public Boolean getConfiguration() {
    return this.configuration;
  }
  
  /**
   * The client supports `workspace/configuration` requests.
   * 
   * Since 3.6.0
   */
  public void setConfiguration(final Boolean configuration) {
    this.configuration = configuration;
  }
  
  @Override
  @Pure
  public String toString() {
    ToStringBuilder b = new ToStringBuilder(this);
    b.add("applyEdit", this.applyEdit);
    b.add("workspaceEdit", this.workspaceEdit);
    b.add("didChangeConfiguration", this.didChangeConfiguration);
    b.add("didChangeWatchedFiles", this.didChangeWatchedFiles);
    b.add("symbol", this.symbol);
    b.add("executeCommand", this.executeCommand);
    b.add("workspaceFolders", this.workspaceFolders);
    b.add("configuration", this.configuration);
    return b.toString();
  }
  
  @Override
  @Pure
  public boolean equals(final Object obj) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe type WorkspaceClientCapabilities is already defined in WorkspaceClientCapabilities.java.");
  }
  
  @Override
  @Pure
  public int hashCode() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe type WorkspaceClientCapabilities is already defined in WorkspaceClientCapabilities.java.");
  }
}
