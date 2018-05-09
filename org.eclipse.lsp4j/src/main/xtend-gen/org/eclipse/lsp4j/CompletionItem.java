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
import org.eclipse.lsp4j.Command;
import org.eclipse.lsp4j.CompletionItemKind;
import org.eclipse.lsp4j.InsertTextFormat;
import org.eclipse.lsp4j.MarkupContent;
import org.eclipse.lsp4j.TextEdit;
import org.eclipse.lsp4j.jsonrpc.json.adapters.JsonElementTypeAdapter;
import org.eclipse.lsp4j.jsonrpc.messages.Either;
import org.eclipse.lsp4j.jsonrpc.validation.NonNull;
import org.eclipse.xtext.xbase.lib.Pure;

/**
 * The Completion request is sent from the client to the server to compute completion items at a given cursor position.
 * Completion items are presented in the IntelliSense user class. If computing complete completion items is expensive
 * servers can additional provide a handler for the resolve completion item request. This request is send when a
 * completion item is selected in the user class.
 */
@SuppressWarnings("all")
public class CompletionItem {
  /**
   * The label of this completion item. By default also the text that is inserted when selecting this completion.
   */
  @NonNull
  private String label;
  
  /**
   * The kind of this completion item. Based of the kind an icon is chosen by the editor.
   */
  private CompletionItemKind kind;
  
  /**
   * A human-readable string with additional information about this item, like type or symbol information.
   */
  private String detail;
  
  /**
   * A human-readable string that represents a doc-comment.
   */
  private Either<String, MarkupContent> documentation;
  
  /**
   * A string that shoud be used when comparing this item with other items. When `falsy` the label is used.
   */
  private String sortText;
  
  /**
   * A string that should be used when filtering a set of completion items. When `falsy` the label is used.
   */
  private String filterText;
  
  /**
   * A string that should be inserted a document when selecting this completion. When `falsy` the label is used.
   */
  private String insertText;
  
  /**
   * The format of the insert text. The format applies to both the `insertText` property
   * and the `newText` property of a provided `textEdit`.
   */
  private InsertTextFormat insertTextFormat;
  
  /**
   * An edit which is applied to a document when selecting this completion. When an edit is provided the value of
   * `insertText` is ignored.
   * 
   * *Note:* The range of the edit must be a single line range and it must contain the position at which completion
   * has been requested.
   */
  private TextEdit textEdit;
  
  /**
   * An optional array of additional text edits that are applied when
   * selecting this completion. Edits must not overlap with the main edit
   * nor with themselves.
   */
  private List<TextEdit> additionalTextEdits;
  
  /**
   * An optional set of characters that when pressed while this completion is active will accept it first and
   * then type that character. *Note* that all commit characters should have `length=1` and that superfluous
   * characters will be ignored.
   */
  private List<String> commitCharacters;
  
  /**
   * An optional command that is executed *after* inserting this completion. *Note* that
   * additional modifications to the current document should be described with the
   * additionalTextEdits-property.
   */
  private Command command;
  
  /**
   * An data entry field that is preserved on a completion item between a completion and a completion resolve request.
   */
  @JsonAdapter(JsonElementTypeAdapter.Factory.class)
  private Object data;
  
  public CompletionItem() {
  }
  
  public CompletionItem(@NonNull final String label) {
    this.label = label;
  }
  
  /**
   * The label of this completion item. By default also the text that is inserted when selecting this completion.
   */
  @Pure
  @NonNull
  public String getLabel() {
    return this.label;
  }
  
  /**
   * The label of this completion item. By default also the text that is inserted when selecting this completion.
   */
  public void setLabel(@NonNull final String label) {
    this.label = label;
  }
  
  /**
   * The kind of this completion item. Based of the kind an icon is chosen by the editor.
   */
  @Pure
  public CompletionItemKind getKind() {
    return this.kind;
  }
  
  /**
   * The kind of this completion item. Based of the kind an icon is chosen by the editor.
   */
  public void setKind(final CompletionItemKind kind) {
    this.kind = kind;
  }
  
  /**
   * A human-readable string with additional information about this item, like type or symbol information.
   */
  @Pure
  public String getDetail() {
    return this.detail;
  }
  
  /**
   * A human-readable string with additional information about this item, like type or symbol information.
   */
  public void setDetail(final String detail) {
    this.detail = detail;
  }
  
  /**
   * A human-readable string that represents a doc-comment.
   */
  @Pure
  public Either<String, MarkupContent> getDocumentation() {
    return this.documentation;
  }
  
  /**
   * A human-readable string that represents a doc-comment.
   */
  public void setDocumentation(final Either<String, MarkupContent> documentation) {
    this.documentation = documentation;
  }
}
