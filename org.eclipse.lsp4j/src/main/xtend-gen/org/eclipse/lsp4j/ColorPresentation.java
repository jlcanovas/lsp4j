/**
 * Copyright (c) 2016 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.lsp4j;

import java.util.List;
import org.eclipse.lsp4j.TextEdit;
import org.eclipse.lsp4j.generator.JsonRpcData;
import org.eclipse.lsp4j.jsonrpc.validation.NonNull;

/* @JsonRpcData */@SuppressWarnings("all")
public class ColorPresentation {
  /**
   * The label of this color presentation. It will be shown on the color
   * picker header. By default this is also the text that is inserted when selecting
   * this color presentation.
   */
  @NonNull
  private String label;
  
  /**
   * An edit which is applied to a document when selecting
   * this presentation for the color.  When `null` the label is used.
   */
  private TextEdit textEdit;
  
  /**
   * An optional array of additional text edits that are applied when
   * selecting this color presentation. Edits must not overlap with the main edit nor with themselves.
   */
  private List<TextEdit> additionalTextEdits;
  
  public ColorPresentation() {
  }
  
  public ColorPresentation(@NonNull final String label) {
    this.label = label;
  }
  
  public ColorPresentation(@NonNull final String label, final TextEdit textEdit) {
    this.label = label;
    this.textEdit = textEdit;
  }
  
  public ColorPresentation(@NonNull final String label, final TextEdit textEdit, final List<TextEdit> additionalTextEdits) {
    this.label = label;
    this.textEdit = textEdit;
    this.additionalTextEdits = additionalTextEdits;
  }
}
