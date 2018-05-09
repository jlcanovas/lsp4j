/**
 * Copyright (c) 2016 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.lsp4j;

import org.eclipse.lsp4j.CodeActionCapabilities;
import org.eclipse.lsp4j.CodeLensCapabilities;
import org.eclipse.lsp4j.ColorProviderCapabilities;
import org.eclipse.lsp4j.CompletionCapabilities;
import org.eclipse.lsp4j.DefinitionCapabilities;
import org.eclipse.lsp4j.DocumentHighlightCapabilities;
import org.eclipse.lsp4j.DocumentLinkCapabilities;
import org.eclipse.lsp4j.DocumentSymbolCapabilities;
import org.eclipse.lsp4j.FormattingCapabilities;
import org.eclipse.lsp4j.HoverCapabilities;
import org.eclipse.lsp4j.ImplementationCapabilities;
import org.eclipse.lsp4j.OnTypeFormattingCapabilities;
import org.eclipse.lsp4j.PublishDiagnosticsCapabilities;
import org.eclipse.lsp4j.RangeFormattingCapabilities;
import org.eclipse.lsp4j.ReferencesCapabilities;
import org.eclipse.lsp4j.RenameCapabilities;
import org.eclipse.lsp4j.SignatureHelpCapabilities;
import org.eclipse.lsp4j.SynchronizationCapabilities;
import org.eclipse.lsp4j.TypeDefinitionCapabilities;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

/**
 * Text document specific client capabilities.
 */
@SuppressWarnings("all")
public class TextDocumentClientCapabilities {
  private SynchronizationCapabilities synchronization;
  
  /**
   * Capabilities specific to the `textDocument/completion`
   */
  private CompletionCapabilities completion;
  
  /**
   * Capabilities specific to the `textDocument/hover`
   */
  private HoverCapabilities hover;
  
  /**
   * Capabilities specific to the `textDocument/signatureHelp`
   */
  private SignatureHelpCapabilities signatureHelp;
  
  /**
   * Capabilities specific to the `textDocument/references`
   */
  private ReferencesCapabilities references;
  
  /**
   * Capabilities specific to the `textDocument/documentHighlight`
   */
  private DocumentHighlightCapabilities documentHighlight;
  
  /**
   * Capabilities specific to the `textDocument/documentSymbol`
   */
  private DocumentSymbolCapabilities documentSymbol;
  
  /**
   * Capabilities specific to the `textDocument/formatting`
   */
  private FormattingCapabilities formatting;
  
  /**
   * Capabilities specific to the `textDocument/rangeFormatting`
   */
  private RangeFormattingCapabilities rangeFormatting;
  
  /**
   * Capabilities specific to the `textDocument/onTypeFormatting`
   */
  private OnTypeFormattingCapabilities onTypeFormatting;
  
  /**
   * Capabilities specific to the `textDocument/definition`
   */
  private DefinitionCapabilities definition;
  
  /**
   * Capabilities specific to the `textDocument/typeDefinition`
   * 
   * Since 3.6.0
   */
  private TypeDefinitionCapabilities typeDefinition;
  
  /**
   * Capabilities specific to the `textDocument/implementation`
   * 
   * Since 3.6.0
   */
  private ImplementationCapabilities implementation;
  
  /**
   * Capabilities specific to the `textDocument/codeAction`
   */
  private CodeActionCapabilities codeAction;
  
  /**
   * Capabilities specific to the `textDocument/codeLens`
   */
  private CodeLensCapabilities codeLens;
  
  /**
   * Capabilities specific to the `textDocument/documentLink`
   */
  private DocumentLinkCapabilities documentLink;
  
  /**
   * Capabilities specific to the `textDocument/documentColor` and the
   * `textDocument/colorPresentation` request.
   * 
   * Since 3.6.0
   */
  private ColorProviderCapabilities colorProvider;
  
  /**
   * Capabilities specific to the `textDocument/rename`
   */
  private RenameCapabilities rename;
  
  /**
   * Capabilities specific to `textDocument/publishDiagnostics`.
   */
  private PublishDiagnosticsCapabilities publishDiagnostics;
  
  @Pure
  public SynchronizationCapabilities getSynchronization() {
    return this.synchronization;
  }
  
  public void setSynchronization(final SynchronizationCapabilities synchronization) {
    this.synchronization = synchronization;
  }
  
  /**
   * Capabilities specific to the `textDocument/completion`
   */
  @Pure
  public CompletionCapabilities getCompletion() {
    return this.completion;
  }
  
  /**
   * Capabilities specific to the `textDocument/completion`
   */
  public void setCompletion(final CompletionCapabilities completion) {
    this.completion = completion;
  }
  
  /**
   * Capabilities specific to the `textDocument/hover`
   */
  @Pure
  public HoverCapabilities getHover() {
    return this.hover;
  }
  
  /**
   * Capabilities specific to the `textDocument/hover`
   */
  public void setHover(final HoverCapabilities hover) {
    this.hover = hover;
  }
  
  /**
   * Capabilities specific to the `textDocument/signatureHelp`
   */
  @Pure
  public SignatureHelpCapabilities getSignatureHelp() {
    return this.signatureHelp;
  }
  
  /**
   * Capabilities specific to the `textDocument/signatureHelp`
   */
  public void setSignatureHelp(final SignatureHelpCapabilities signatureHelp) {
    this.signatureHelp = signatureHelp;
  }
  
  /**
   * Capabilities specific to the `textDocument/references`
   */
  @Pure
  public ReferencesCapabilities getReferences() {
    return this.references;
  }
  
  /**
   * Capabilities specific to the `textDocument/references`
   */
  public void setReferences(final ReferencesCapabilities references) {
    this.references = references;
  }
  
  /**
   * Capabilities specific to the `textDocument/documentHighlight`
   */
  @Pure
  public DocumentHighlightCapabilities getDocumentHighlight() {
    return this.documentHighlight;
  }
  
  /**
   * Capabilities specific to the `textDocument/documentHighlight`
   */
  public void setDocumentHighlight(final DocumentHighlightCapabilities documentHighlight) {
    this.documentHighlight = documentHighlight;
  }
  
  /**
   * Capabilities specific to the `textDocument/documentSymbol`
   */
  @Pure
  public DocumentSymbolCapabilities getDocumentSymbol() {
    return this.documentSymbol;
  }
  
  /**
   * Capabilities specific to the `textDocument/documentSymbol`
   */
  public void setDocumentSymbol(final DocumentSymbolCapabilities documentSymbol) {
    this.documentSymbol = documentSymbol;
  }
  
  /**
   * Capabilities specific to the `textDocument/formatting`
   */
  @Pure
  public FormattingCapabilities getFormatting() {
    return this.formatting;
  }
  
  /**
   * Capabilities specific to the `textDocument/formatting`
   */
  public void setFormatting(final FormattingCapabilities formatting) {
    this.formatting = formatting;
  }
  
  /**
   * Capabilities specific to the `textDocument/rangeFormatting`
   */
  @Pure
  public RangeFormattingCapabilities getRangeFormatting() {
    return this.rangeFormatting;
  }
  
  /**
   * Capabilities specific to the `textDocument/rangeFormatting`
   */
  public void setRangeFormatting(final RangeFormattingCapabilities rangeFormatting) {
    this.rangeFormatting = rangeFormatting;
  }
  
  /**
   * Capabilities specific to the `textDocument/onTypeFormatting`
   */
  @Pure
  public OnTypeFormattingCapabilities getOnTypeFormatting() {
    return this.onTypeFormatting;
  }
  
  /**
   * Capabilities specific to the `textDocument/onTypeFormatting`
   */
  public void setOnTypeFormatting(final OnTypeFormattingCapabilities onTypeFormatting) {
    this.onTypeFormatting = onTypeFormatting;
  }
  
  /**
   * Capabilities specific to the `textDocument/definition`
   */
  @Pure
  public DefinitionCapabilities getDefinition() {
    return this.definition;
  }
  
  /**
   * Capabilities specific to the `textDocument/definition`
   */
  public void setDefinition(final DefinitionCapabilities definition) {
    this.definition = definition;
  }
  
  /**
   * Capabilities specific to the `textDocument/typeDefinition`
   * 
   * Since 3.6.0
   */
  @Pure
  public TypeDefinitionCapabilities getTypeDefinition() {
    return this.typeDefinition;
  }
  
  /**
   * Capabilities specific to the `textDocument/typeDefinition`
   * 
   * Since 3.6.0
   */
  public void setTypeDefinition(final TypeDefinitionCapabilities typeDefinition) {
    this.typeDefinition = typeDefinition;
  }
  
  /**
   * Capabilities specific to the `textDocument/implementation`
   * 
   * Since 3.6.0
   */
  @Pure
  public ImplementationCapabilities getImplementation() {
    return this.implementation;
  }
  
  /**
   * Capabilities specific to the `textDocument/implementation`
   * 
   * Since 3.6.0
   */
  public void setImplementation(final ImplementationCapabilities implementation) {
    this.implementation = implementation;
  }
  
  /**
   * Capabilities specific to the `textDocument/codeAction`
   */
  @Pure
  public CodeActionCapabilities getCodeAction() {
    return this.codeAction;
  }
  
  /**
   * Capabilities specific to the `textDocument/codeAction`
   */
  public void setCodeAction(final CodeActionCapabilities codeAction) {
    this.codeAction = codeAction;
  }
  
  /**
   * Capabilities specific to the `textDocument/codeLens`
   */
  @Pure
  public CodeLensCapabilities getCodeLens() {
    return this.codeLens;
  }
  
  /**
   * Capabilities specific to the `textDocument/codeLens`
   */
  public void setCodeLens(final CodeLensCapabilities codeLens) {
    this.codeLens = codeLens;
  }
  
  /**
   * Capabilities specific to the `textDocument/documentLink`
   */
  @Pure
  public DocumentLinkCapabilities getDocumentLink() {
    return this.documentLink;
  }
  
  /**
   * Capabilities specific to the `textDocument/documentLink`
   */
  public void setDocumentLink(final DocumentLinkCapabilities documentLink) {
    this.documentLink = documentLink;
  }
  
  /**
   * Capabilities specific to the `textDocument/documentColor` and the
   * `textDocument/colorPresentation` request.
   * 
   * Since 3.6.0
   */
  @Pure
  public ColorProviderCapabilities getColorProvider() {
    return this.colorProvider;
  }
  
  /**
   * Capabilities specific to the `textDocument/documentColor` and the
   * `textDocument/colorPresentation` request.
   * 
   * Since 3.6.0
   */
  public void setColorProvider(final ColorProviderCapabilities colorProvider) {
    this.colorProvider = colorProvider;
  }
  
  /**
   * Capabilities specific to the `textDocument/rename`
   */
  @Pure
  public RenameCapabilities getRename() {
    return this.rename;
  }
  
  /**
   * Capabilities specific to the `textDocument/rename`
   */
  public void setRename(final RenameCapabilities rename) {
    this.rename = rename;
  }
  
  /**
   * Capabilities specific to `textDocument/publishDiagnostics`.
   */
  @Pure
  public PublishDiagnosticsCapabilities getPublishDiagnostics() {
    return this.publishDiagnostics;
  }
  
  /**
   * Capabilities specific to `textDocument/publishDiagnostics`.
   */
  public void setPublishDiagnostics(final PublishDiagnosticsCapabilities publishDiagnostics) {
    this.publishDiagnostics = publishDiagnostics;
  }
  
  @Override
  @Pure
  public String toString() {
    ToStringBuilder b = new ToStringBuilder(this);
    b.add("synchronization", this.synchronization);
    b.add("completion", this.completion);
    b.add("hover", this.hover);
    b.add("signatureHelp", this.signatureHelp);
    b.add("references", this.references);
    b.add("documentHighlight", this.documentHighlight);
    b.add("documentSymbol", this.documentSymbol);
    b.add("formatting", this.formatting);
    b.add("rangeFormatting", this.rangeFormatting);
    b.add("onTypeFormatting", this.onTypeFormatting);
    b.add("definition", this.definition);
    b.add("typeDefinition", this.typeDefinition);
    b.add("implementation", this.implementation);
    b.add("codeAction", this.codeAction);
    b.add("codeLens", this.codeLens);
    b.add("documentLink", this.documentLink);
    b.add("colorProvider", this.colorProvider);
    b.add("rename", this.rename);
    b.add("publishDiagnostics", this.publishDiagnostics);
    return b.toString();
  }
  
  @Override
  @Pure
  public boolean equals(final Object obj) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe type TextDocumentClientCapabilities is already defined in TextDocumentClientCapabilities.java.");
  }
  
  @Override
  @Pure
  public int hashCode() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe type TextDocumentClientCapabilities is already defined in TextDocumentClientCapabilities.java.");
  }
}
