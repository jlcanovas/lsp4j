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
import org.eclipse.lsp4j.MarkedString;
import org.eclipse.lsp4j.MarkupContent;
import org.eclipse.lsp4j.Range;
import org.eclipse.lsp4j.adapters.HoverTypeAdapter;
import org.eclipse.lsp4j.generator.JsonRpcData;
import org.eclipse.lsp4j.jsonrpc.messages.Either;
import org.eclipse.lsp4j.jsonrpc.validation.NonNull;

/**
 * The result of a hover request.
 */
/* @JsonRpcData */@JsonAdapter(HoverTypeAdapter.Factory.class)
@SuppressWarnings("all")
public class Hover {
  /**
   * The hover's content as markdown
   */
  @NonNull
  private Either<List<Either<String, MarkedString>>, MarkupContent> contents;
  
  /**
   * An optional range
   */
  private Range range;
  
  public Hover() {
  }
  
  public Hover(@NonNull final List<Either<String, MarkedString>> contents) {
    throw new Error("Unresolved compilation problems:"
      + "\nType mismatch: cannot convert from List<Either<String, MarkedString>> to Either<List<Either<String, MarkedString>>, MarkupContent>");
  }
  
  public Hover(@NonNull final List<Either<String, MarkedString>> contents, final Range range) {
    throw new Error("Unresolved compilation problems:"
      + "\nType mismatch: cannot convert from List<Either<String, MarkedString>> to Either<List<Either<String, MarkedString>>, MarkupContent>");
  }
  
  public Hover(@NonNull final MarkupContent contents) {
    throw new Error("Unresolved compilation problems:"
      + "\nType mismatch: cannot convert from MarkupContent to Either<List<Either<String, MarkedString>>, MarkupContent>");
  }
  
  public Hover(@NonNull final MarkupContent contents, final Range range) {
    throw new Error("Unresolved compilation problems:"
      + "\nType mismatch: cannot convert from MarkupContent to Either<List<Either<String, MarkedString>>, MarkupContent>");
  }
}
