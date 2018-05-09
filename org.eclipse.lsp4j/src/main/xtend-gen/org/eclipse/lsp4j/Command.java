/**
 * Copyright (c) 2016 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.lsp4j;

import java.util.List;
import org.eclipse.lsp4j.jsonrpc.validation.NonNull;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

/**
 * Represents a reference to a command. Provides a title which will be used to represent a command in the UI and,
 * optionally, an array of arguments which will be passed to the command handler function when invoked.
 */
@SuppressWarnings("all")
public class Command {
  /**
   * Title of the command, like `save`.
   */
  @NonNull
  private String title;
  
  /**
   * The identifier of the actual command handler.
   */
  @NonNull
  private String command;
  
  /**
   * Arguments that the command handler should be invoked with.
   */
  private List<Object> arguments;
  
  public Command() {
  }
  
  public Command(@NonNull final String title, @NonNull final String command) {
    this.title = title;
    this.command = command;
  }
  
  public Command(@NonNull final String title, @NonNull final String command, final List<Object> arguments) {
    this(title, command);
    this.arguments = arguments;
  }
  
  /**
   * Title of the command, like `save`.
   */
  @Pure
  @NonNull
  public String getTitle() {
    return this.title;
  }
  
  /**
   * Title of the command, like `save`.
   */
  public void setTitle(@NonNull final String title) {
    this.title = title;
  }
  
  /**
   * The identifier of the actual command handler.
   */
  @Pure
  @NonNull
  public String getCommand() {
    return this.command;
  }
  
  /**
   * The identifier of the actual command handler.
   */
  public void setCommand(@NonNull final String command) {
    this.command = command;
  }
  
  /**
   * Arguments that the command handler should be invoked with.
   */
  @Pure
  public List<Object> getArguments() {
    return this.arguments;
  }
  
  /**
   * Arguments that the command handler should be invoked with.
   */
  public void setArguments(final List<Object> arguments) {
    this.arguments = arguments;
  }
  
  @Override
  @Pure
  public String toString() {
    ToStringBuilder b = new ToStringBuilder(this);
    b.add("title", this.title);
    b.add("command", this.command);
    b.add("arguments", this.arguments);
    return b.toString();
  }
  
  @Override
  @Pure
  public boolean equals(final Object obj) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe type Command is already defined in Command.java.");
  }
  
  @Override
  @Pure
  public int hashCode() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe type Command is already defined in Command.java.");
  }
}
