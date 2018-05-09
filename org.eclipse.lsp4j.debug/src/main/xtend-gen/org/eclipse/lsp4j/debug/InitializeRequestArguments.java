/**
 * Copyright (c) 2017 Kichwa Coders Ltd. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.lsp4j.debug;

import org.eclipse.lsp4j.jsonrpc.validation.NonNull;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

/**
 * Arguments for 'initialize' request.
 */
@SuppressWarnings("all")
public class InitializeRequestArguments {
  /**
   * The ID of the (frontend) client using this adapter.
   * <p>
   * This is an optional property.
   */
  private String clientID;
  
  /**
   * The ID of the debug adapter.
   */
  @NonNull
  private String adapterID;
  
  /**
   * The ISO-639 locale of the (frontend) client using this adapter, e.g. en-US or de-CH.
   * <p>
   * This is an optional property.
   */
  private String locale;
  
  /**
   * If true all line numbers are 1-based (default).
   * <p>
   * This is an optional property.
   */
  private Boolean linesStartAt1;
  
  /**
   * If true all column numbers are 1-based (default).
   * <p>
   * This is an optional property.
   */
  private Boolean columnsStartAt1;
  
  /**
   * Determines in what format paths are specified. The default is 'path', which is the native format.
   * <p>
   * This is an optional property.
   * <p>
   * Possible values include - but not limited to those defined in {@link InitializeRequestArgumentsPathFormat}
   */
  private String pathFormat;
  
  /**
   * Client supports the optional type attribute for variables.
   * <p>
   * This is an optional property.
   */
  private Boolean supportsVariableType;
  
  /**
   * Client supports the paging of variables.
   * <p>
   * This is an optional property.
   */
  private Boolean supportsVariablePaging;
  
  /**
   * Client supports the runInTerminal request.
   * <p>
   * This is an optional property.
   */
  private Boolean supportsRunInTerminalRequest;
  
  /**
   * The ID of the (frontend) client using this adapter.
   * <p>
   * This is an optional property.
   */
  @Pure
  public String getClientID() {
    return this.clientID;
  }
  
  /**
   * The ID of the (frontend) client using this adapter.
   * <p>
   * This is an optional property.
   */
  public void setClientID(final String clientID) {
    this.clientID = clientID;
  }
  
  /**
   * The ID of the debug adapter.
   */
  @Pure
  @NonNull
  public String getAdapterID() {
    return this.adapterID;
  }
  
  /**
   * The ID of the debug adapter.
   */
  public void setAdapterID(@NonNull final String adapterID) {
    this.adapterID = adapterID;
  }
  
  /**
   * The ISO-639 locale of the (frontend) client using this adapter, e.g. en-US or de-CH.
   * <p>
   * This is an optional property.
   */
  @Pure
  public String getLocale() {
    return this.locale;
  }
  
  /**
   * The ISO-639 locale of the (frontend) client using this adapter, e.g. en-US or de-CH.
   * <p>
   * This is an optional property.
   */
  public void setLocale(final String locale) {
    this.locale = locale;
  }
  
  /**
   * If true all line numbers are 1-based (default).
   * <p>
   * This is an optional property.
   */
  @Pure
  public Boolean getLinesStartAt1() {
    return this.linesStartAt1;
  }
  
  /**
   * If true all line numbers are 1-based (default).
   * <p>
   * This is an optional property.
   */
  public void setLinesStartAt1(final Boolean linesStartAt1) {
    this.linesStartAt1 = linesStartAt1;
  }
  
  /**
   * If true all column numbers are 1-based (default).
   * <p>
   * This is an optional property.
   */
  @Pure
  public Boolean getColumnsStartAt1() {
    return this.columnsStartAt1;
  }
  
  /**
   * If true all column numbers are 1-based (default).
   * <p>
   * This is an optional property.
   */
  public void setColumnsStartAt1(final Boolean columnsStartAt1) {
    this.columnsStartAt1 = columnsStartAt1;
  }
  
  /**
   * Determines in what format paths are specified. The default is 'path', which is the native format.
   * <p>
   * This is an optional property.
   * <p>
   * Possible values include - but not limited to those defined in {@link InitializeRequestArgumentsPathFormat}
   */
  @Pure
  public String getPathFormat() {
    return this.pathFormat;
  }
  
  /**
   * Determines in what format paths are specified. The default is 'path', which is the native format.
   * <p>
   * This is an optional property.
   * <p>
   * Possible values include - but not limited to those defined in {@link InitializeRequestArgumentsPathFormat}
   */
  public void setPathFormat(final String pathFormat) {
    this.pathFormat = pathFormat;
  }
  
  /**
   * Client supports the optional type attribute for variables.
   * <p>
   * This is an optional property.
   */
  @Pure
  public Boolean getSupportsVariableType() {
    return this.supportsVariableType;
  }
  
  /**
   * Client supports the optional type attribute for variables.
   * <p>
   * This is an optional property.
   */
  public void setSupportsVariableType(final Boolean supportsVariableType) {
    this.supportsVariableType = supportsVariableType;
  }
  
  /**
   * Client supports the paging of variables.
   * <p>
   * This is an optional property.
   */
  @Pure
  public Boolean getSupportsVariablePaging() {
    return this.supportsVariablePaging;
  }
  
  /**
   * Client supports the paging of variables.
   * <p>
   * This is an optional property.
   */
  public void setSupportsVariablePaging(final Boolean supportsVariablePaging) {
    this.supportsVariablePaging = supportsVariablePaging;
  }
  
  /**
   * Client supports the runInTerminal request.
   * <p>
   * This is an optional property.
   */
  @Pure
  public Boolean getSupportsRunInTerminalRequest() {
    return this.supportsRunInTerminalRequest;
  }
  
  /**
   * Client supports the runInTerminal request.
   * <p>
   * This is an optional property.
   */
  public void setSupportsRunInTerminalRequest(final Boolean supportsRunInTerminalRequest) {
    this.supportsRunInTerminalRequest = supportsRunInTerminalRequest;
  }
  
  @Override
  @Pure
  public String toString() {
    ToStringBuilder b = new ToStringBuilder(this);
    b.add("clientID", this.clientID);
    b.add("adapterID", this.adapterID);
    b.add("locale", this.locale);
    b.add("linesStartAt1", this.linesStartAt1);
    b.add("columnsStartAt1", this.columnsStartAt1);
    b.add("pathFormat", this.pathFormat);
    b.add("supportsVariableType", this.supportsVariableType);
    b.add("supportsVariablePaging", this.supportsVariablePaging);
    b.add("supportsRunInTerminalRequest", this.supportsRunInTerminalRequest);
    return b.toString();
  }
  
  @Override
  @Pure
  public boolean equals(final Object obj) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe type InitializeRequestArguments is already defined in InitializeRequestArguments.java.");
  }
  
  @Override
  @Pure
  public int hashCode() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe type InitializeRequestArguments is already defined in InitializeRequestArguments.java.");
  }
}
