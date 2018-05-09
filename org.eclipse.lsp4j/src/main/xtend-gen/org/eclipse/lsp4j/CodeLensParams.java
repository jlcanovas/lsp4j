/**
 * Copyright (c) 2016 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.lsp4j;

import org.eclipse.lsp4j.TextDocumentIdentifier;
import org.eclipse.lsp4j.jsonrpc.validation.NonNull;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

/**
 * The code lens request is sent from the client to the server to compute code lenses for a given text document.
 */
@SuppressWarnings("all")
public class CodeLensParams {
  /**
   * The document to request code lens for.
   */
  @NonNull
  private TextDocumentIdentifier textDocument;
  
  public CodeLensParams() {
  }
  
  public CodeLensParams(@NonNull final TextDocumentIdentifier textDocument) {
    this.textDocument = textDocument;
  }
  
  /**
   * The document to request code lens for.
   */
  @Pure
  @NonNull
  public TextDocumentIdentifier getTextDocument() {
    return this.textDocument;
  }
  
  /**
   * The document to request code lens for.
   */
  public void setTextDocument(@NonNull final TextDocumentIdentifier textDocument) {
    this.textDocument = textDocument;
  }
  
  @Override
  @Pure
  public String toString() {
    ToStringBuilder b = new ToStringBuilder(this);
    b.add("textDocument", this.textDocument);
    return b.toString();
  }
  
  @Override
  @Pure
  public boolean equals(final Object obj) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe type CodeLensParams is already defined in CodeLensParams.java.");
  }
  
  @Override
  @Pure
  public int hashCode() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe type CodeLensParams is already defined in CodeLensParams.java.");
  }
}
