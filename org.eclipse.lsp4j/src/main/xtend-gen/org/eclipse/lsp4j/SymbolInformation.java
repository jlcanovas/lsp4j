/**
 * Copyright (c) 2016 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.lsp4j;

import org.eclipse.lsp4j.Location;
import org.eclipse.lsp4j.SymbolKind;
import org.eclipse.lsp4j.generator.JsonRpcData;
import org.eclipse.lsp4j.jsonrpc.validation.NonNull;

/**
 * Represents information about programming constructs like variables, classes, interfaces etc.
 */
/* @JsonRpcData */@SuppressWarnings("all")
public class SymbolInformation {
  /**
   * The name of this symbol.
   */
  @NonNull
  private String name;
  
  /**
   * The kind of this symbol.
   */
  @NonNull
  private SymbolKind kind;
  
  /**
   * The location of this symbol. The location's range is used by a tool
   * to reveal the location in the editor. If the symbol is selected in the
   * tool the range's start information is used to position the cursor. So
   * the range usually spans more then the actual symbol's name and does
   * normally include things like visibility modifiers.
   * 
   * The range doesn't have to denote a node range in the sense of a abstract
   * syntax tree. It can therefore not be used to re-construct a hierarchy of
   * the symbols.
   */
  @NonNull
  private Location location;
  
  /**
   * The name of the symbol containing this symbol. This information is for
   * user interface purposes (e.g. to render a qualifier in the user interface
   * if necessary). It can't be used to re-infer a hierarchy for the document
   * symbols.
   */
  private String containerName;
  
  public SymbolInformation() {
  }
  
  public SymbolInformation(@NonNull final String name, @NonNull final SymbolKind kind, @NonNull final Location location) {
    this.name = name;
    this.kind = kind;
    this.location = location;
  }
  
  public SymbolInformation(@NonNull final String name, @NonNull final SymbolKind kind, @NonNull final Location location, final String containerName) {
    this.name = name;
    this.kind = kind;
    this.location = location;
    this.containerName = containerName;
  }
}
