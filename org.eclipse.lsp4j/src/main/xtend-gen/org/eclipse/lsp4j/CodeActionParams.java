/**
 * Copyright (c) 2016 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.lsp4j;

import org.eclipse.lsp4j.CodeActionContext;
import org.eclipse.lsp4j.Range;
import org.eclipse.lsp4j.TextDocumentIdentifier;
import org.eclipse.lsp4j.jsonrpc.validation.NonNull;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

/**
 * The code action request is sent from the client to the server to compute commands for a given text document and range.
 * The request is triggered when the user moves the cursor into an problem marker in the editor or presses the lightbulb
 * associated with a marker.
 */
@SuppressWarnings("all")
public class CodeActionParams {
  /**
   * The document in which the command was invoked.
   */
  @NonNull
  private TextDocumentIdentifier textDocument;
  
  /**
   * The range for which the command was invoked.
   */
  @NonNull
  private Range range;
  
  /**
   * Context carrying additional information.
   */
  @NonNull
  private CodeActionContext context;
  
  public CodeActionParams() {
  }
  
  public CodeActionParams(@NonNull final TextDocumentIdentifier textDocument, @NonNull final Range range, @NonNull final CodeActionContext context) {
    this.textDocument = textDocument;
    this.range = range;
    this.context = context;
  }
  
  /**
   * The document in which the command was invoked.
   */
  @Pure
  @NonNull
  public TextDocumentIdentifier getTextDocument() {
    return this.textDocument;
  }
  
  /**
   * The document in which the command was invoked.
   */
  public void setTextDocument(@NonNull final TextDocumentIdentifier textDocument) {
    this.textDocument = textDocument;
  }
  
  /**
   * The range for which the command was invoked.
   */
  @Pure
  @NonNull
  public Range getRange() {
    return this.range;
  }
  
  /**
   * The range for which the command was invoked.
   */
  public void setRange(@NonNull final Range range) {
    this.range = range;
  }
  
  /**
   * Context carrying additional information.
   */
  @Pure
  @NonNull
  public CodeActionContext getContext() {
    return this.context;
  }
  
  /**
   * Context carrying additional information.
   */
  public void setContext(@NonNull final CodeActionContext context) {
    this.context = context;
  }
  
  @Override
  @Pure
  public String toString() {
    ToStringBuilder b = new ToStringBuilder(this);
    b.add("textDocument", this.textDocument);
    b.add("range", this.range);
    b.add("context", this.context);
    return b.toString();
  }
  
  @Override
  @Pure
  public boolean equals(final Object obj) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe type CodeActionParams is already defined in CodeActionParams.java.");
  }
  
  @Override
  @Pure
  public int hashCode() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe type CodeActionParams is already defined in CodeActionParams.java.");
  }
}
