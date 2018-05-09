/**
 * Copyright (c) 2017 Kichwa Coders Ltd. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.lsp4j.debug;

import java.util.Map;
import org.eclipse.lsp4j.debug.RunInTerminalRequestArgumentsKind;
import org.eclipse.lsp4j.jsonrpc.validation.NonNull;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

/**
 * Arguments for 'runInTerminal' request.
 */
@SuppressWarnings("all")
public class RunInTerminalRequestArguments {
  /**
   * What kind of terminal to launch.
   * <p>
   * This is an optional property.
   */
  private RunInTerminalRequestArgumentsKind kind;
  
  /**
   * Optional title of the terminal.
   * <p>
   * This is an optional property.
   */
  private String title;
  
  /**
   * Working directory of the command.
   */
  @NonNull
  private String cwd;
  
  /**
   * List of arguments. The first argument is the command to run.
   */
  @NonNull
  private String[] args;
  
  /**
   * Environment key-value pairs that are added to or removed from the default environment.
   * <p>
   * This is an optional property.
   */
  private Map<String, String> env;
  
  /**
   * What kind of terminal to launch.
   * <p>
   * This is an optional property.
   */
  @Pure
  public RunInTerminalRequestArgumentsKind getKind() {
    return this.kind;
  }
  
  /**
   * What kind of terminal to launch.
   * <p>
   * This is an optional property.
   */
  public void setKind(final RunInTerminalRequestArgumentsKind kind) {
    this.kind = kind;
  }
  
  /**
   * Optional title of the terminal.
   * <p>
   * This is an optional property.
   */
  @Pure
  public String getTitle() {
    return this.title;
  }
  
  /**
   * Optional title of the terminal.
   * <p>
   * This is an optional property.
   */
  public void setTitle(final String title) {
    this.title = title;
  }
  
  /**
   * Working directory of the command.
   */
  @Pure
  @NonNull
  public String getCwd() {
    return this.cwd;
  }
  
  /**
   * Working directory of the command.
   */
  public void setCwd(@NonNull final String cwd) {
    this.cwd = cwd;
  }
  
  /**
   * List of arguments. The first argument is the command to run.
   */
  @Pure
  @NonNull
  public String[] getArgs() {
    return this.args;
  }
  
  /**
   * List of arguments. The first argument is the command to run.
   */
  public void setArgs(@NonNull final String[] args) {
    this.args = args;
  }
  
  /**
   * Environment key-value pairs that are added to or removed from the default environment.
   * <p>
   * This is an optional property.
   */
  @Pure
  public Map<String, String> getEnv() {
    return this.env;
  }
  
  /**
   * Environment key-value pairs that are added to or removed from the default environment.
   * <p>
   * This is an optional property.
   */
  public void setEnv(final Map<String, String> env) {
    this.env = env;
  }
  
  @Override
  @Pure
  public String toString() {
    ToStringBuilder b = new ToStringBuilder(this);
    b.add("kind", this.kind);
    b.add("title", this.title);
    b.add("cwd", this.cwd);
    b.add("args", this.args);
    b.add("env", this.env);
    return b.toString();
  }
  
  @Override
  @Pure
  public boolean equals(final Object obj) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe type RunInTerminalRequestArguments is already defined in RunInTerminalRequestArguments.java.");
  }
  
  @Override
  @Pure
  public int hashCode() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe type RunInTerminalRequestArguments is already defined in RunInTerminalRequestArguments.java.");
  }
}
