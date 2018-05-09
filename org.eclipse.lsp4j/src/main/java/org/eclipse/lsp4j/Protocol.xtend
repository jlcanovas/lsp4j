/*******************************************************************************
 * Copyright (c) 2016 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.lsp4j

import com.google.common.annotations.Beta
import com.google.gson.annotations.JsonAdapter
import java.util.ArrayList
import java.util.LinkedHashMap
import java.util.List
import java.util.Map
import org.eclipse.lsp4j.adapters.HoverTypeAdapter
import org.eclipse.lsp4j.adapters.InitializeParamsTypeAdapter
import org.eclipse.lsp4j.adapters.VersionedTextDocumentIdentifierTypeAdapter
import org.eclipse.lsp4j.generator.JsonRpcData
import org.eclipse.lsp4j.jsonrpc.json.adapters.JsonElementTypeAdapter
import org.eclipse.lsp4j.jsonrpc.messages.Either
import org.eclipse.lsp4j.jsonrpc.messages.Either3
import org.eclipse.lsp4j.jsonrpc.validation.NonNull

@JsonRpcData
class DynamicRegistrationCapabilities {
	/**
     * Supports dynamic registration.
     */
    Boolean dynamicRegistration
    
    new() {
    }
    
    new(Boolean dynamicRegistration) {
    	this.dynamicRegistration = dynamicRegistration
    }
}

/**
 * Capabilities specific to `WorkspaceEdit`s
 */
@JsonRpcData
class WorkspaceEditCapabilities {
	/**
	 * The client supports versioned document changes in `WorkspaceEdit`s
	 */
	Boolean documentChanges
	
	/**
	 * The client supports resource changes
	 * in `WorkspaceEdit`s.
	 */
	@Beta Boolean resourceChanges

    new() {
    }
    
    new(Boolean documentChanges) {
    	this.documentChanges = documentChanges
    }
}

/**
 * Capabilities specific to the `workspace/didChangeConfiguration` notification.
 */
@JsonRpcData
class DidChangeConfigurationCapabilities extends DynamicRegistrationCapabilities {
    new() {
    }
    
    new(Boolean dynamicRegistration) {
    	super(dynamicRegistration)
    }
}

/**
 * Capabilities specific to the `workspace/didChangeWatchedFiles` notification.
 */
@JsonRpcData
class DidChangeWatchedFilesCapabilities extends DynamicRegistrationCapabilities {
    new() {
    }
    
    new(Boolean dynamicRegistration) {
    	super(dynamicRegistration)
    }
}

/**
 * Capabilities specific to the `workspace/symbol` request.
 */
@JsonRpcData
class SymbolCapabilities extends DynamicRegistrationCapabilities {
	
	/**
	 * Specific capabilities for the `SymbolKind` in the `workspace/symbol` request.
	 */
	SymbolKindCapabilities symbolKind
	
    new() {
    }
    
    new(Boolean dynamicRegistration) {
    	super(dynamicRegistration)
    }
    
    new(SymbolKindCapabilities symbolKind) {
    	this.symbolKind = symbolKind
    }
    
    new(SymbolKindCapabilities symbolKind, Boolean dynamicRegistration) {
      super(dynamicRegistration)
      this.symbolKind = symbolKind
    }
}

/**
 * Capabilities specific to the `workspace/executeCommand` request.
 */
@JsonRpcData
class ExecuteCommandCapabilities extends DynamicRegistrationCapabilities {
    new() {
    }
    
    new(Boolean dynamicRegistration) {
    	super(dynamicRegistration)
    }
}

/**
 * Workspace specific client capabilities.
 */
@JsonRpcData
class WorkspaceClientCapabilities {
	/**
     * The client supports applying batch edits to the workspace by supporting 
     * the request 'workspace/applyEdit'.
     */
    Boolean applyEdit
    
    /**
     * Capabilities specific to `WorkspaceEdit`s
     */
    WorkspaceEditCapabilities workspaceEdit
    
    /**
     * Capabilities specific to the `workspace/didChangeConfiguration` notification.
     */
    DidChangeConfigurationCapabilities didChangeConfiguration
    
    /**
     * Capabilities specific to the `workspace/didChangeConfiguration` notification.
     */
    DidChangeWatchedFilesCapabilities didChangeWatchedFiles
    
    /**
     * Capabilities specific to the `workspace/symbol` request.
     */
    SymbolCapabilities symbol
    
    /**
     * Capabilities specific to the `workspace/executeCommand` request.
     */
    ExecuteCommandCapabilities executeCommand
    
    /**
	 * The client has support for workspace folders.
	 * 
	 * Since 3.6.0
	 */
	Boolean workspaceFolders
	
	/**
	 * The client supports `workspace/configuration` requests.
	 *
	 * Since 3.6.0
	 */
	Boolean configuration
}

@JsonRpcData
class SynchronizationCapabilities extends DynamicRegistrationCapabilities {
    /**
     * The client supports sending will save notifications.
     */
    Boolean willSave
    
    /**
     * The client supports sending a will save request and
     * waits for a response providing text edits which will
     * be applied to the document before it is saved.
     */
    Boolean willSaveWaitUntil
    
    /**
     * The client supports did save notifications.
     */
    Boolean didSave
    
    new() {
    }
    
    new(Boolean willSave, Boolean willSaveWaitUntil, Boolean didSave) {
    	this.willSave = willSave
    	this.willSaveWaitUntil = willSaveWaitUntil
    	this.didSave = didSave
    }
    
    new(Boolean willSave, Boolean willSaveWaitUntil, Boolean didSave, Boolean dynamicRegistration) {
    	super(dynamicRegistration)
    	this.willSave = willSave
    	this.willSaveWaitUntil = willSaveWaitUntil
    	this.didSave = didSave
    }
}

/**
 * The client supports the following `CompletionItem` specific capabilities.
 */
@JsonRpcData
class CompletionItemCapabilities {
	/**
     * Client supports snippets as insert text.
     *
     * A snippet can define tab stops and placeholders with `$1`, `$2`
     * and `${3:foo}`. `$0` defines the final tab stop, it defaults to
     * the end of the snippet. Placeholders with equal identifiers are linked,
     * that is typing in one will update others too.
     */
    Boolean snippetSupport
    
    /**
     * Client supports commit characters on a completion item.
     */
    Boolean commitCharactersSupport
  
    /**
     * Client supports the following content formats for the documentation
     * property. The order describes the preferred format of the client.
     */
    List<String> documentationFormat
    
    new() {
    }
    
    new(Boolean snippetSupport) {
      this.snippetSupport = snippetSupport
    }
}

@JsonRpcData
class CompletionItemKindCapabilities {
    /**
     * The completion item kind values the client supports. When this
     * property exists the client also guarantees that it will
     * handle values outside its set gracefully and falls back
     * to a default value when unknown.
     *
     * If this property is not present the client only supports
     * the completion items kinds from `Text` to `Reference` as defined in
     * the initial version of the protocol.
     */
    List<CompletionItemKind> valueSet
    
    new() {
    }
    
    new(List<CompletionItemKind> valueSet) {
      this.valueSet = valueSet
    }
}

/**
 * Capabilities specific to the `textDocument/completion`
 */
@JsonRpcData
class CompletionCapabilities extends DynamicRegistrationCapabilities {     
    /**
     * The client supports the following `CompletionItem` specific
     * capabilities.
     */
    CompletionItemCapabilities completionItem
    
    /**
     * The client supports the following `CompletionItemKind` specific
     * capabilities.
     */
    CompletionItemKindCapabilities completionItemKind
    
    /**
     * The client supports sending additional context information for a
     * `textDocument/completion` request.
     */
    Boolean contextSupport
    
    new() {
    }
    
    new(CompletionItemCapabilities completionItem) {
      this.completionItem = completionItem
    }
    
    new(CompletionItemKindCapabilities completionItemKind) {
      this.completionItemKind = completionItemKind
    }
    
    new(Boolean contextSupport) {
      this.contextSupport = contextSupport
    }
}

/**
 * Capabilities specific to the `textDocument/hover`
 */
@JsonRpcData
class HoverCapabilities extends DynamicRegistrationCapabilities {
    /**
     * Client supports the following content formats for the content
     * property. The order describes the preferred format of the client.
     * 
     * See {@link MarkupKind} for allowed values.
     */
    List<String> contentFormat
    
    new() {
    }
    
    new(Boolean dynamicRegistration) {
    	super(dynamicRegistration)
    }
    
    new(List<String> contentFormat, Boolean dynamicRegistration) {
      super(dynamicRegistration)
      this.contentFormat = contentFormat
    }
}

/**
 * The client supports the following `SignatureInformation` specific properties.
 */
@JsonRpcData
class SignatureInformationCapabilities {
    /**
     * Client supports the following content formats for the documentation
     * property. The order describes the preferred format of the client.
     * 
     * See {@link MarkupKind} for allowed values.
     */
    List<String> documentationFormat
    
    new() {
    }
    
    new(List<String> documentationFormat) {
      this.documentationFormat = documentationFormat
    }
}

/**
 * Capabilities specific to the `textDocument/signatureHelp`
 */
@JsonRpcData
class SignatureHelpCapabilities extends DynamicRegistrationCapabilities {	
    /**
     * The client supports the following `SignatureInformation`
     * specific properties.
     */
    SignatureInformationCapabilities signatureInformation
    
    new() {
    }
    
    new(Boolean dynamicRegistration) {
    	super(dynamicRegistration)
    }
    
    new(SignatureInformationCapabilities signatureInformation, Boolean dynamicRegistration) {
      super(dynamicRegistration)
      this.signatureInformation = signatureInformation
    }
}

/**
 * Capabilities specific to the `textDocument/references`
 */
@JsonRpcData
class ReferencesCapabilities extends DynamicRegistrationCapabilities {	
    new() {
    }
    
    new(Boolean dynamicRegistration) {
    	super(dynamicRegistration)
    }
}

/**
 * Capabilities specific to the `textDocument/documentHighlight`
 */
@JsonRpcData
class DocumentHighlightCapabilities extends DynamicRegistrationCapabilities {	
    new() {
    }
    
    new(Boolean dynamicRegistration) {
    	super(dynamicRegistration)
    }
}

/**
 * Specific capabilities for the `SymbolKind`.
 */
@JsonRpcData
class SymbolKindCapabilities {
    /**
     * The symbol kind values the client supports. When this
     * property exists the client also guarantees that it will
     * handle values outside its set gracefully and falls back
     * to a default value when unknown.
     *
     * If this property is not present the client only supports
     * the symbol kinds from `File` to `Array` as defined in
     * the initial version of the protocol.
     */
    List<SymbolKind> valueSet
    
    new() {
    }
    
    new(List<SymbolKind> valueSet) {
      this.valueSet = valueSet
    }
}

/**
 * Capabilities specific to the `textDocument/documentSymbol`
 */
@JsonRpcData
class DocumentSymbolCapabilities extends DynamicRegistrationCapabilities {
    /**
     * Specific capabilities for the `SymbolKind`.
     */
    SymbolKindCapabilities symbolKind
    
    new() {
    }
    
    new(Boolean dynamicRegistration) {
    	super(dynamicRegistration)
    }
    
    new(SymbolKindCapabilities symbolKind) {
      this.symbolKind = symbolKind
    }
    
    new(SymbolKindCapabilities symbolKind, Boolean dynamicRegistration) {
      super(dynamicRegistration)
      this.symbolKind = symbolKind
    }
}

/**
 * Capabilities specific to the `textDocument/formatting`
 */
@JsonRpcData
class FormattingCapabilities extends DynamicRegistrationCapabilities {
    new() {
    }
    
    new(Boolean dynamicRegistration) {
    	super(dynamicRegistration)
    }
}

/**
 * Capabilities specific to the `textDocument/rangeFormatting`
 */
@JsonRpcData
class RangeFormattingCapabilities extends DynamicRegistrationCapabilities {
    new() {
    }
    
    new(Boolean dynamicRegistration) {
    	super(dynamicRegistration)
    }
}

/**
 * Capabilities specific to the `textDocument/onTypeFormatting`
 */
@JsonRpcData
class OnTypeFormattingCapabilities extends DynamicRegistrationCapabilities {
    new() {
    }
    
    new(Boolean dynamicRegistration) {
    	super(dynamicRegistration)
    }
}

/**
 * Capabilities specific to the `textDocument/definition`
 */
@JsonRpcData
class DefinitionCapabilities extends DynamicRegistrationCapabilities {
    new() {
    }
    
    new(Boolean dynamicRegistration) {
    	super(dynamicRegistration)
    }
}

/**
 * Capabilities specific to the `textDocument/typeDefinition`
 *
 * Since 3.6.0
 */
@JsonRpcData
class TypeDefinitionCapabilities extends DynamicRegistrationCapabilities {
    new() {
    }
    
    new(Boolean dynamicRegistration) {
      super(dynamicRegistration)
    }
}

/**
 * Capabilities specific to the `textDocument/implementation`.
 *
 * Since 3.6.0
 */
@JsonRpcData
class ImplementationCapabilities extends DynamicRegistrationCapabilities {
    new() {
    }
    
    new(Boolean dynamicRegistration) {
      super(dynamicRegistration)
    }
}

/**
 * Capabilities specific to the `textDocument/codeAction`
 */
@JsonRpcData
class CodeActionCapabilities extends DynamicRegistrationCapabilities {
    new() {
    }
    
    new(Boolean dynamicRegistration) {
    	super(dynamicRegistration)
    }
}

/**
 * Capabilities specific to the `textDocument/codeLens`
 */
@JsonRpcData
class CodeLensCapabilities extends DynamicRegistrationCapabilities {
    new() {
    }
    
    new(Boolean dynamicRegistration) {
    	super(dynamicRegistration)
    }
}

/**
 * Capabilities specific to the `textDocument/documentLink`
 */
@JsonRpcData
class DocumentLinkCapabilities extends DynamicRegistrationCapabilities {
    new() {
    }
    
    new(Boolean dynamicRegistration) {
    	super(dynamicRegistration)
    }
}

/**
 * Capabilities specific to the `textDocument/documentColor` and the
 * `textDocument/colorPresentation` request.
 *
 * Since 3.6.0
 */
@JsonRpcData
class ColorProviderCapabilities extends DynamicRegistrationCapabilities {
    new() {
    }
    
    new(Boolean dynamicRegistration) {
      super(dynamicRegistration)
    }
}

/**
 * Capabilities specific to the `textDocument/rename`
 */
@JsonRpcData
class RenameCapabilities extends DynamicRegistrationCapabilities {
    new() {
    }
    
    new(Boolean dynamicRegistration) {
    	super(dynamicRegistration)
    }
}

/**
 * Capabilities specific to `textDocument/publishDiagnostics`.
 */
@JsonRpcData
class PublishDiagnosticsCapabilities {
	/**
	 * Whether the client accepts diagnostics with related information.
	 */
	Boolean relatedInformation
	
	new() {
	}
	
	new(Boolean relatedInformation) {
		this.relatedInformation = relatedInformation
	}
}

/**
 * Text document specific client capabilities.
 */
@JsonRpcData
class TextDocumentClientCapabilities {
	SynchronizationCapabilities synchronization
	
	/**
     * Capabilities specific to the `textDocument/completion`
     */
    CompletionCapabilities completion
    
    /**
     * Capabilities specific to the `textDocument/hover`
     */
    HoverCapabilities hover
    
    /**
     * Capabilities specific to the `textDocument/signatureHelp`
     */
    SignatureHelpCapabilities signatureHelp
    
    /**
     * Capabilities specific to the `textDocument/references`
     */
    ReferencesCapabilities references
    
    /**
     * Capabilities specific to the `textDocument/documentHighlight`
     */
    DocumentHighlightCapabilities documentHighlight
    
    /**
     * Capabilities specific to the `textDocument/documentSymbol`
     */
    DocumentSymbolCapabilities documentSymbol
    
    /**
     * Capabilities specific to the `textDocument/formatting`
     */
    FormattingCapabilities formatting
    
    /**
     * Capabilities specific to the `textDocument/rangeFormatting`
     */
    RangeFormattingCapabilities rangeFormatting
    
    /**
     * Capabilities specific to the `textDocument/onTypeFormatting`
     */
    OnTypeFormattingCapabilities onTypeFormatting
    
    /**
     * Capabilities specific to the `textDocument/definition`
     */
    DefinitionCapabilities definition
    
    /**
     * Capabilities specific to the `textDocument/typeDefinition`
     *
     * Since 3.6.0
     */
    TypeDefinitionCapabilities typeDefinition
    
    /**
     * Capabilities specific to the `textDocument/implementation`
     *
     * Since 3.6.0
     */
    ImplementationCapabilities implementation
    
    /**
     * Capabilities specific to the `textDocument/codeAction`
     */
    CodeActionCapabilities codeAction
    
    /**
     * Capabilities specific to the `textDocument/codeLens`
     */
    CodeLensCapabilities codeLens
    
    /**
     * Capabilities specific to the `textDocument/documentLink`
     */
    DocumentLinkCapabilities documentLink
    
    /**
     * Capabilities specific to the `textDocument/documentColor` and the
     * `textDocument/colorPresentation` request.
     *
     * Since 3.6.0
     */
    ColorProviderCapabilities colorProvider
    
    /**
     * Capabilities specific to the `textDocument/rename`
     */
    RenameCapabilities rename
    
    /**
	 * Capabilities specific to `textDocument/publishDiagnostics`.
	 */
	PublishDiagnosticsCapabilities publishDiagnostics
}

/**
 * `ClientCapabilities` now define capabilities for dynamic registration, workspace and text document features the client supports. 
 * The `experimental` can be used to pass experimental capabilities under development.
 * For future compatibility a `ClientCapabilities` object literal can have more properties set than currently defined.
 * Servers receiving a `ClientCapabilities` object literal with unknown properties should ignore these properties.
 * A missing property should be interpreted as an absence of the capability.
 * If a property is missing that defines sub properties all sub properties should be interpreted as an absence of the capability.
 * 
 * Client capabilities got introduced with the version 3.0 of the protocol. They therefore only describe capabilities that got introduced in 3.x or later.
 * Capabilities that existed in the 2.x version of the protocol are still mandatory for clients. Clients cannot opt out of providing them.
 * So even if a client omits the `ClientCapabilities.textDocument.synchronization` 
 * it is still required that the client provides text document synchronization (e.g. open, changed and close notifications).
 */
@JsonRpcData
class ClientCapabilities {
	/**
     * Workspace specific client capabilities.
     */
    WorkspaceClientCapabilities workspace
    
    /**
     * Text document specific client capabilities.
     */
    TextDocumentClientCapabilities textDocument
    
    /**
     * Experimental client capabilities.
     */
    @JsonAdapter(JsonElementTypeAdapter.Factory)
    Object experimental
    
    new() {
    }
    
    new(WorkspaceClientCapabilities workspace, TextDocumentClientCapabilities textDocument, Object experimental) {
    	this.workspace = workspace
    	this.textDocument = textDocument
    	this.experimental = experimental
    }
}

/**
 * Contains additional diagnostic information about the context in which a code action is run.
 */
@JsonRpcData
class CodeActionContext {
	/**
	 * An array of diagnostics.
	 */
	@NonNull
	List<Diagnostic> diagnostics
    
    new() {
    	this(new ArrayList)
    }
    
    new(@NonNull List<Diagnostic> diagnostics) {
    	this.diagnostics = diagnostics
    }
}

/**
 * The code action request is sent from the client to the server to compute commands for a given text document and range.
 * The request is triggered when the user moves the cursor into an problem marker in the editor or presses the lightbulb
 * associated with a marker.
 */
@JsonRpcData
class CodeActionParams {
	/**
	 * The document in which the command was invoked.
	 */
	@NonNull
	TextDocumentIdentifier textDocument

	/**
	 * The range for which the command was invoked.
	 */
	@NonNull
	Range range

	/**
	 * Context carrying additional information.
	 */
	@NonNull
	CodeActionContext context
    
    new() {
    }
    
    new(@NonNull TextDocumentIdentifier textDocument, @NonNull Range range, @NonNull CodeActionContext context) {
    	this.textDocument = textDocument
    	this.range = range
    	this.context = context
    }
}

/**
 * A code lens represents a command that should be shown along with source text, like the number of references,
 * a way to run tests, etc.
 * 
 * A code lens is <em>unresolved</em> when no command is associated to it. For performance reasons the creation of a
 * code lens and resolving should be done to two stages.
 */
@JsonRpcData
class CodeLens {
	/**
	 * The range in which this code lens is valid. Should only span a single line.
	 */
	@NonNull
	Range range

	/**
	 * The command this code lens represents.
	 */
	Command command

	/**
	 * An data entry field that is preserved on a code lens item between a code lens and a code lens resolve request.
	 */
	@JsonAdapter(JsonElementTypeAdapter.Factory)
	Object data
    
    new() {
    }
    
    new(@NonNull Range range) {
    	this.range = range
    }
    
    new(@NonNull Range range, Command command, Object data) {
    	this(range)
    	this.command = command
    	this.data = data
    }
}

/**
 * Code Lens options.
 */
@JsonRpcData
class CodeLensOptions {
	/**
	 * Code lens has a resolve provider as well.
	 */
	boolean resolveProvider
    
    new() {
    }
    
    new(boolean resolveProvider) {
    	this.resolveProvider = resolveProvider
    }
}

/**
 * The code lens request is sent from the client to the server to compute code lenses for a given text document.
 */
@JsonRpcData
class CodeLensParams {
	/**
	 * The document to request code lens for.
	 */
	@NonNull
	TextDocumentIdentifier textDocument
    
    new() {
    }
    
    new(@NonNull TextDocumentIdentifier textDocument) {
    	this.textDocument = textDocument
    }
}

/**
 * Represents a reference to a command. Provides a title which will be used to represent a command in the UI and,
 * optionally, an array of arguments which will be passed to the command handler function when invoked.
 */
@JsonRpcData
class Command {
	/**
	 * Title of the command, like `save`.
	 */
	@NonNull
	String title

	/**
	 * The identifier of the actual command handler.
	 */
	@NonNull
	String command

	/**
	 * Arguments that the command handler should be invoked with.
	 */
	List<Object> arguments
    
    new() {
    }
    
    new(@NonNull String title, @NonNull String command) {
    	this.title = title
    	this.command = command
    }
    
    new(@NonNull String title, @NonNull String command, List<Object> arguments) {
    	this(title, command)
    	this.arguments = arguments
    }
}

/**
 * The Completion request is sent from the client to the server to compute completion items at a given cursor position.
 * Completion items are presented in the IntelliSense user class. If computing complete completion items is expensive
 * servers can additional provide a handler for the resolve completion item request. This request is send when a
 * completion item is selected in the user class.
 */
@JsonRpcData
class CompletionItem {
	/**
	 * The label of this completion item. By default also the text that is inserted when selecting this completion.
	 */
	@NonNull
	String label

	/**
	 * The kind of this completion item. Based of the kind an icon is chosen by the editor.
	 */
	CompletionItemKind kind

	/**
	 * A human-readable string with additional information about this item, like type or symbol information.
	 */
	String detail

	/**
	 * A human-readable string that represents a doc-comment.
	 */
	Either<String, MarkupContent> documentation

	/**
	 * A string that shoud be used when comparing this item with other items. When `falsy` the label is used.
	 */
	String sortText

	/**
	 * A string that should be used when filtering a set of completion items. When `falsy` the label is used.
	 */
	String filterText

	/**
	 * A string that should be inserted a document when selecting this completion. When `falsy` the label is used.
	 */
	String insertText
	
	/**
     * The format of the insert text. The format applies to both the `insertText` property
     * and the `newText` property of a provided `textEdit`.
     */
    InsertTextFormat insertTextFormat

    /**
     * An edit which is applied to a document when selecting this completion. When an edit is provided the value of
     * `insertText` is ignored.
     *
     * *Note:* The range of the edit must be a single line range and it must contain the position at which completion
     * has been requested.
     */
    TextEdit textEdit

	/**
	 * An optional array of additional text edits that are applied when
	 * selecting this completion. Edits must not overlap with the main edit
	 * nor with themselves.
	 */
	List<TextEdit> additionalTextEdits
	
	/**
	 * An optional set of characters that when pressed while this completion is active will accept it first and
	 * then type that character. *Note* that all commit characters should have `length=1` and that superfluous
	 * characters will be ignored.
	 */
	List<String> commitCharacters

	/**
	 * An optional command that is executed *after* inserting this completion. *Note* that
	 * additional modifications to the current document should be described with the
	 * additionalTextEdits-property.
	 */
	Command command

	/**
	 * An data entry field that is preserved on a completion item between a completion and a completion resolve request.
	 */
	@JsonAdapter(JsonElementTypeAdapter.Factory)
	Object data
	
	new() {
	}
	
	new(@NonNull String label) {
		this.label = label
	}
}

/**
 * Represents a collection of completion items to be presented in the editor.
 */
@JsonRpcData
class CompletionList {
	/**
	 * This list it not complete. Further typing should result in recomputing this list.
	 */
	boolean isIncomplete

	/**
	 * The completion items.
	 */
	@NonNull
	List<CompletionItem> items
    
    new() {
    	this(new ArrayList)
    }
    
    new(@NonNull List<CompletionItem> items) {
    	this.items = items
    }
    
    new(boolean isIncomplete, @NonNull List<CompletionItem> items) {
    	this(items)
    	this.isIncomplete = isIncomplete
    }
}

/**
 * Completion options.
 */
@JsonRpcData
class CompletionOptions {
	/**
	 * The server provides support to resolve additional information for a completion item.
	 */
	Boolean resolveProvider

	/**
	 * The characters that trigger completion automatically.
	 */
	List<String> triggerCharacters
    
    new() {
    }
    
    new(Boolean resolveProvider, List<String> triggerCharacters) {
    	this.resolveProvider = resolveProvider
    	this.triggerCharacters = triggerCharacters
    }
}

/**
 * Represents a diagnostic, such as a compiler error or warning. Diagnostic objects are only valid in the scope of a resource.
 */
@JsonRpcData
class Diagnostic {
	/**
	 * The range at which the message applies
	 */
	@NonNull
	Range range

	/**
	 * The diagnostic's severity. Can be omitted. If omitted it is up to the client to interpret diagnostics as error,
	 * warning, info or hint.
	 */
	DiagnosticSeverity severity

	/**
	 * The diagnostic's code. Can be omitted.
	 */
	String code

	/**
	 * A human-readable string describing the source of this diagnostic, e.g. 'typescript' or 'super lint'.
	 */
	String source

	/**
	 * The diagnostic's message.
	 */
	@NonNull
	String message
	
	/**
	 * An array of related diagnostic information, e.g. when symbol-names within a scope collide
	 * all definitions can be marked via this property.
	 * 
	 * Since 3.7.0
	 */
	List<DiagnosticRelatedInformation> relatedInformation
	
	new() {
	}
	
	new(@NonNull Range range, @NonNull String message) {
		this.range = range
		this.message = message
	}
	
	new(@NonNull Range range, @NonNull String message, DiagnosticSeverity severity, String source) {
		this(range, message)
		this.severity = severity
		this.source = source
	}
	
	new(@NonNull Range range, @NonNull String message, DiagnosticSeverity severity, String source, String code) {
		this(range, message, severity, source)
		this.code = code
	}
}

/**
 * Represents a related message and source code location for a diagnostic. This should be
 * used to point to code locations that cause or related to a diagnostics, e.g when duplicating
 * a symbol in a scope.
 * 
 * Since 3.7.0
 */
@JsonRpcData
class DiagnosticRelatedInformation {
	/**
	 * The location of this related diagnostic information.
	 */
	@NonNull
	Location location

	/**
	 * The message of this related diagnostic information.
	 */
	@NonNull
	String message
	
	new() {
	}
	
	new(@NonNull Location location, @NonNull String message) {
		this.location = location
		this.message = message
	}
}

/**
 * A notification sent from the client to the server to signal the change of configuration settings.
 */
@JsonRpcData
class DidChangeConfigurationParams {
	/**
	 * The actual changed settings.
	 */
	@NonNull
	@JsonAdapter(JsonElementTypeAdapter.Factory)
	Object settings
    
    new() {
    }
    
    new(@NonNull Object settings) {
    	this.settings = settings
    }
}

/**
 * The document change notification is sent from the client to the server to signal changes to a text document.
 */
@JsonRpcData
class DidChangeTextDocumentParams {
	/**
	 * The document that did change. The version number points to the version after all provided content changes have
	 * been applied.
	 */
	@NonNull
	VersionedTextDocumentIdentifier textDocument

	/**
	 * Legacy property to support protocol version 1.0 requests.
	 */
	@Deprecated
	String uri

	/**
	 * The actual content changes.
	 */
	@NonNull
	List<TextDocumentContentChangeEvent> contentChanges = new ArrayList
    
    new() {
    }
    
    new(@NonNull VersionedTextDocumentIdentifier textDocument, @NonNull List<TextDocumentContentChangeEvent> contentChanges) {
    	this.textDocument = textDocument
    	this.contentChanges = contentChanges
    }
    
    @Deprecated
    new(@NonNull VersionedTextDocumentIdentifier textDocument, String uri, @NonNull List<TextDocumentContentChangeEvent> contentChanges) {
    	this(textDocument, contentChanges)
    	this.uri = uri
    }
}

/**
 * The watched files notification is sent from the client to the server when the client detects changes
 * to file watched by the language client.
 */
@JsonRpcData
class DidChangeWatchedFilesParams {
	/**
	 * The actual file events.
	 */
	@NonNull
	List<FileEvent> changes
    
    new() {
    	this(new ArrayList)
    }
    
    new(@NonNull List<FileEvent> changes) {
    	this.changes = changes
    }
}

@JsonRpcData
class DidChangeWatchedFilesRegistrationOptions {
	/**
	 * The watchers to register.
	 */
	@NonNull
	List<FileSystemWatcher> watchers
	
	new() {
	}
	
	new(@NonNull List<FileSystemWatcher> watchers) {
		this.watchers = watchers
	}
}

@JsonRpcData
class FileSystemWatcher {
	/**
	 * The  glob pattern to watch
	 */
	@NonNull
	String globPattern
	
	/**
	 * The kind of events of interest. If omitted it defaults
	 * to WatchKind.Create | WatchKind.Change | WatchKind.Delete
	 * which is 7.
	 */
	Integer kind
	
	new() {
	}
	
	new(@NonNull String globPattern) {
		this.globPattern = globPattern
	}
	
	new(@NonNull String globPattern, Integer kind) {
		this.globPattern = globPattern
		this.kind = kind
	}
}

/**
 * The document close notification is sent from the client to the server when the document got closed in the client.
 * The document's truth now exists where the document's uri points to (e.g. if the document's uri is a file uri the
 * truth now exists on disk).
 */
@JsonRpcData
class DidCloseTextDocumentParams {
	/**
	 * The document that was closed.
	 */
	@NonNull
	TextDocumentIdentifier textDocument
    
    new() {
    }
    
    new(@NonNull TextDocumentIdentifier textDocument) {
    	this.textDocument = textDocument
    }
}

/**
 * The document open notification is sent from the client to the server to signal newly opened text documents.
 * The document's truth is now managed by the client and the server must not try to read the document's truth using
 * the document's uri.
 */
@JsonRpcData
class DidOpenTextDocumentParams {
	/**
	 * The document that was opened.
	 */
	@NonNull
	TextDocumentItem textDocument

	/**
	 * Legacy property to support protocol version 1.0 requests.
	 */
	@Deprecated
	String text
    
    new() {
    }
    
    new(@NonNull TextDocumentItem textDocument) {
    	this.textDocument = textDocument
    }
    
    @Deprecated
	new(@NonNull TextDocumentItem textDocument, String text) {
    	this(textDocument)
    	this.text = text
    }
}

/**
 * The document save notification is sent from the client to the server when the document for saved in the clinet.
 */
@JsonRpcData
class DidSaveTextDocumentParams {
	/**
	 * The document that was closed.
	 */
	@NonNull
	TextDocumentIdentifier textDocument
	
	/**
     * Optional the content when saved. Depends on the includeText value
     * when the save notification was requested.
     */
    String text
    
    new() {
    }
    
    new(@NonNull TextDocumentIdentifier textDocument) {
    	this.textDocument = textDocument
    }
    
    new(@NonNull TextDocumentIdentifier textDocument, String text) {
    	this(textDocument)
    	this.text = text
    }
}


@JsonRpcData
class WillSaveTextDocumentParams {
	/**
	 * The document that will be saved.
	 */
	@NonNull
	TextDocumentIdentifier textDocument
	
	/**
	 * A reason why a text document is saved.
	 */
	@NonNull
	TextDocumentSaveReason reason
    
    new() {
    }
    
    new(@NonNull TextDocumentIdentifier textDocument, @NonNull TextDocumentSaveReason reason) {
    	this.textDocument = textDocument
    	this.reason = reason
    }
}

/**
 * The document formatting request is sent from the server to the client to format a whole document.
 */
@JsonRpcData
class DocumentFormattingParams {
	/**
	 * The document to format.
	 */
	@NonNull
	TextDocumentIdentifier textDocument

	/**
	 * The format options
	 */
	@NonNull
	FormattingOptions options
    
    new() {
    }
    
    new(@NonNull TextDocumentIdentifier textDocument, @NonNull FormattingOptions options) {
    	this.textDocument = textDocument
    	this.options = options
    }
}

/**
 * A document highlight is a range inside a text document which deserves special attention. Usually a document highlight
 * is visualized by changing the background color of its range.
 */
@JsonRpcData
class DocumentHighlight {
	/**
	 * The range this highlight applies to.
	 */
	@NonNull
	Range range

	/**
	 * The highlight kind, default is {@link DocumentHighlightKind#Text}.
	 */
	DocumentHighlightKind kind
    
    new() {
    }
    
    new(@NonNull Range range) {
    	this.range = range
    }
    
    new(@NonNull Range range, DocumentHighlightKind kind) {
    	this(range)
    	this.kind = kind
    }
}

/**
 * A document link is a range in a text document that links to an internal or external resource, like another
 * text document or a web site.
 */
@JsonRpcData
class DocumentLink {
    /**
     * The range this link applies to.
     */
    @NonNull
    Range range
    
    /**
     * The uri this link points to. If missing a resolve request is sent later.
     */
    String target
    
    new() {
    }
    
    new(@NonNull Range range) {
    	this.range = range
    }
    
    new(@NonNull Range range, String target) {
    	this(range)
    	this.target = target
    }
}

/**
 * The document links request is sent from the client to the server to request the location of links in a document.
 */
@JsonRpcData
class DocumentLinkParams {
    /**
     * The document to provide document links for.
     */
    @NonNull
    TextDocumentIdentifier textDocument
    
    new() {
    }
    
    new(@NonNull TextDocumentIdentifier textDocument) {
    	this.textDocument = textDocument
    }
}

/**
 * Document link options
 */
@JsonRpcData
class DocumentLinkOptions {
	/**
     * Document links have a resolve provider as well.
     */
    Boolean resolveProvider
    
    new() {
    }
    
    new(Boolean resolveProvider) {
    	this.resolveProvider = resolveProvider
    }
}

/**
 * Execute command options.
 */
@JsonRpcData
class ExecuteCommandOptions {
	/**
     * The commands to be executed on the server
     */
    @NonNull
    List<String> commands
    
    new() {
    	this(new ArrayList)
    }
    
    new(@NonNull List<String> commands) {
    	this.commands = commands
    }
}

/**
 * Save options.
 */
@JsonRpcData
class SaveOptions {
	/**
     * The client is supposed to include the content on save.
     */
    Boolean includeText
    
    new() {
    }
    
    new(Boolean includeText) {
    	this.includeText = includeText
    }
}

/**
 * Color provider Options
 */
@JsonRpcData
class ColorProviderOptions extends StaticRegistrationOptions {
}

@JsonRpcData
class TextDocumentSyncOptions {
	/**
     * Open and close notifications are sent to the server.
     */
    Boolean openClose
    /**
     * Change notifications are sent to the server. See TextDocumentSyncKind.None, TextDocumentSyncKind.Full
     * and TextDocumentSyncKind.Incremental.
     */
    TextDocumentSyncKind change
    /**
     * Will save notifications are sent to the server.
     */
    Boolean willSave
    /**
     * Will save wait until requests are sent to the server.
     */
    Boolean willSaveWaitUntil
    /**
     * Save notifications are sent to the server.
     */
    SaveOptions save
}

/**
 * Static registration options to be returned in the initialize request.
 */
@JsonRpcData
class StaticRegistrationOptions extends TextDocumentRegistrationOptions {
	/**
	 * The id used to register the request. The id can be used to deregister
	 * the request again. See also Registration#id.
	 */
	String id
	
	new() {
	}
	
	new(String id) {
		this.id = id
	}
}

/**
 * Format document on type options
 */
@JsonRpcData
class DocumentOnTypeFormattingOptions {
	/**
	 * A character on which formatting should be triggered, like `}`.
	 */
	@NonNull
	String firstTriggerCharacter

	/**
	 * More trigger characters.
	 */
	List<String> moreTriggerCharacter
    
    new() {
    }
    
    new(@NonNull String firstTriggerCharacter) {
    	this.firstTriggerCharacter = firstTriggerCharacter
    }
    
    new(@NonNull String firstTriggerCharacter, List<String> moreTriggerCharacter) {
    	this.firstTriggerCharacter = firstTriggerCharacter
    	this.moreTriggerCharacter = moreTriggerCharacter
    }
}

/**
 * The document on type formatting request is sent from the client to the server to format parts of the document during typing.
 */
@JsonRpcData
class DocumentOnTypeFormattingParams extends DocumentFormattingParams {
	/**
	 * The position at which this request was send.
	 */
	@NonNull
	Position position

	/**
	 * The character that has been typed.
	 */
	@NonNull
	String ch
    
    new() {
    }
    
    new(@NonNull Position position, @NonNull String ch) {
    	this.position = position
    	this.ch = ch
    }
}

/**
 * The document range formatting request is sent from the client to the server to format a given range in a document.
 */
@JsonRpcData
class DocumentRangeFormattingParams extends DocumentFormattingParams {
	/**
	 * The range to format
	 */
	@NonNull
	Range range
    
    new() {
    }
    
    new(@NonNull Range range) {
    	this.range = range
    }
}

/**
 * The document symbol request is sent from the client to the server to list all symbols found in a given text document.
 */
@JsonRpcData
class DocumentSymbolParams {
	/**
	 * The text document.
	 */
	@NonNull
	TextDocumentIdentifier textDocument
    
    new() {
    }
    
    new(@NonNull TextDocumentIdentifier textDocument) {
    	this.textDocument = textDocument
    }
}

/**
 * An event describing a file change.
 */
@JsonRpcData
class FileEvent {
	/**
	 * The file's uri.
	 */
	@NonNull
	String uri

	/**
	 * The change type.
	 */
	@NonNull
	FileChangeType type
    
    new() {
    }
    
    new(@NonNull String uri, @NonNull FileChangeType type) {
    	this.uri = uri
    	this.type = type
    }
}

/**
 * Value-object describing what options formatting should use.
 */
class FormattingOptions extends LinkedHashMap<String, Either3<String, Number, Boolean>> {

	static val TAB_SIZE = 'tabSize'
	static val INSERT_SPACES = 'insertSpaces'

    new() {
    }
    
    new(int tabSize, boolean insertSpaces) {
    	this.tabSize = tabSize
    	this.insertSpaces = insertSpaces
    }
    
    /**
     * @deprecated See https://github.com/eclipse/lsp4j/issues/99
     */
    @Deprecated
    new(int tabSize, boolean insertSpaces, Map<String, String> properties) {
    	this(tabSize, insertSpaces)
    	setProperties(properties)
    }
    
    def String getString(String key) {
    	get(key)?.getFirst
    }
    
    def void putString(String key, String value) {
    	put(key, Either3.forFirst(value))
    }
    
    def Number getNumber(String key) {
    	get(key)?.getSecond
    }
    
    def void putNumber(String key, Number value) {
    	put(key, Either3.forSecond(value))
    }
    
    def Boolean getBoolean(String key) {
    	get(key)?.getThird
    }
    
    def void putBoolean(String key, Boolean value) {
    	put(key, Either3.forThird(value))
    }
    
	/**
	 * Size of a tab in spaces.
	 */
    def int getTabSize() {
    	val value = getNumber(TAB_SIZE)
    	if (value !== null)
    		return value.intValue
    	else
    		return 0
    }
    
    def void setTabSize(int tabSize) {
    	putNumber(TAB_SIZE, tabSize)
    }
    
 	/**
	 * Prefer spaces over tabs.
	 */
    def boolean isInsertSpaces() {
       	val value = getBoolean(INSERT_SPACES)
    	if (value !== null)
    		return value
    	else
    		return false
    }
    
    def void setInsertSpaces(boolean insertSpaces) {
    	putBoolean(INSERT_SPACES, insertSpaces)
    }
    
    /**
     * @deprecated See https://github.com/eclipse/lsp4j/issues/99
     */
    @Deprecated
    def Map<String, String> getProperties() {
    	val properties = newLinkedHashMap
    	for (entry : entrySet) {
    		val value = switch it: entry.value {
    			case isFirst: getFirst
    			case isSecond: getSecond
    			case isThird: getThird
    		}
    		if (value !== null)
    			properties.put(entry.key, value.toString)
    	}
    	return properties.unmodifiableView
    }
    
    /**
     * @deprecated See https://github.com/eclipse/lsp4j/issues/99
     */
    @Deprecated
    def void setProperties(Map<String, String> properties) {
    	for (entry : properties.entrySet) {
    		putString(entry.key, entry.value)
    	}
    }
    
}

/**
 * A MarkupContent literal represents a string value which content is interpreted based on its
 * kind flag. Currently the protocol supports `plaintext` and `markdown` as markup kinds.
 *
 * If the kind is `markdown` then the value can contain fenced code blocks like in GitHub issues.
 * See https://help.github.com/articles/creating-and-highlighting-code-blocks/#syntax-highlighting
 *
 * Please Note that clients might sanitize the return markdown. A client could decide to
 * remove HTML from the markdown to avoid script execution.
 */
@JsonRpcData
class MarkupContent {
	/**
	 * The type of the Markup.
	 */
	@NonNull
	String kind;

	/**
	 * The content itself.
	 */
	@NonNull
	String value;
}

/**
 * The result of a hover request.
 */
@JsonRpcData
@JsonAdapter(HoverTypeAdapter.Factory)
class Hover {
	/**
	 * The hover's content as markdown
	 */
	@NonNull
	Either<List<Either<String, MarkedString>>, MarkupContent> contents

	/**
	 * An optional range
	 */
	Range range
    
    new() {
    }
    
    new(@NonNull List<Either<String, MarkedString>> contents) {
    	this.contents = contents
    }
    
    new(@NonNull List<Either<String, MarkedString>> contents, Range range) {
    	this.contents = contents
    	this.range = range
    }
    
    new(@NonNull MarkupContent contents) {
    	this.contents = contents
    }
    
    new(@NonNull MarkupContent contents, Range range) {
    	this.contents = contents
    	this.range = range
    }
}

/**
 * MarkedString can be used to render human readable text. It is either a markdown string
 * or a code-block that provides a language and a code snippet. The language identifier
 * is sematically equal to the optional language identifier in fenced code blocks in GitHub
 * issues. See https://help.github.com/articles/creating-and-highlighting-code-blocks/#syntax-highlighting
 *
 * The pair of a language and a value is an equivalent to markdown:
 * ```${language}
 * ${value}
 * ```
 *
 * Note that markdown strings will be sanitized - that means html will be escaped.
 */
@JsonRpcData
class MarkedString {
	@NonNull
	String language
	
	@NonNull
	String value
    
    new() {
    }
    
    new(@NonNull String language, @NonNull String value) {
    	this.language = language
    	this.value = value
    }
}

@JsonRpcData
class InitializeError {
	/**
	 * Indicates whether the client executes the following retry logic:
	 * (1) show the message provided by the ResponseError to the user
	 * (2) user selects retry or cancel
	 * (3) if user selected retry the initialize method is sent again.
	 */
	boolean retry
    
    new() {
    }
    
    new(boolean retry) {
    	this.retry = retry
    }
}

/**
 * Known error codes for an `InitializeError`
 */
interface InitializeErrorCode {
	/**
     * If the protocol version provided by the client can't be handled by the server.
     * 
     * @deprecated This initialize error got replaced by client capabilities.
     * There is no version handshake in version 3.0x
     */
    @Deprecated
    val unknownProtocolVersion = 1
}

/**
 * The initialize request is sent as the first request from the client to the server.
 */
@JsonRpcData
@JsonAdapter(InitializeParamsTypeAdapter.Factory)
class InitializeParams {
	/**
	 * The process Id of the parent process that started the server.
	 */
	Integer processId

	/**
	 * The rootPath of the workspace. Is null if no folder is open.
	 * 
	 * @deprecated in favour of rootUri.
	 */
	@Deprecated
	String rootPath
	
	/**
     * The rootUri of the workspace. Is null if no folder is open.
     * If both `rootPath` and `rootUri` are set, `rootUri` wins.
     */
	String rootUri

	/**
	 * User provided initialization options.
	 */
	@JsonAdapter(JsonElementTypeAdapter.Factory)
	Object initializationOptions

	/**
	 * The capabilities provided by the client (editor)
	 */
	ClientCapabilities capabilities

	/**
	 * An optional extension to the protocol.
	 * To tell the server what client (editor) is talking to it.
	 */
	@Deprecated
	String clientName
	
	/**
     * The initial trace setting. If omitted trace is disabled ('off').
     * 
     * Legal values: 'off' | 'messages' | 'verbose'
     */
    String trace
    
	/**
	 * The workspace folders configured in the client when the server starts.
	 * This property is only available if the client supports workspace folders.
	 * It can be `null` if the client supports workspace folders but none are
	 * configured.
	 *
	 * Since 3.6.0
	 */
	List<WorkspaceFolder> workspaceFolders
}

@JsonRpcData
class InitializeResult {
	/**
	 * The capabilities the language server provides.
	 */
	@NonNull
	ServerCapabilities capabilities
    
    new() {
    }
    
    new(@NonNull ServerCapabilities capabilities) {
    	this.capabilities = capabilities
    }
}

@JsonRpcData
class InitializedParams {
	
}

/**
 * Represents a location inside a resource, such as a line inside a text file.
 */
@JsonRpcData
class Location {
	@NonNull
	String uri

	@NonNull
	Range range
    
    new() {
    }
    
    new(@NonNull String uri, @NonNull Range range) {
    	this.uri = uri
    	this.range = range
    }
}

/**
 * The show message request is sent from a server to a client to ask the client to display a particular message in the
 * user class. In addition to the show message notification the request allows to pass actions and to wait for an
 * answer from the client.
 */
@JsonRpcData
class MessageActionItem {
	/**
	 * A short title like 'Retry', 'Open Log' etc.
	 */
	@NonNull
	String title
    
    new() {
    }
    
    new(@NonNull String title) {
    	this.title = title
    }
}

/**
 * The show message notification is sent from a server to a client to ask the client to display a particular message
 * in the user class.
 * 
 * The log message notification is send from the server to the client to ask the client to log a particular message.
 */
@JsonRpcData
class MessageParams {
	/**
	 * The message type.
	 */
	@NonNull
	MessageType type

	/**
	 * The actual message.
	 */
	@NonNull
	String message
    
    new() {
    }
    
    new(@NonNull MessageType type, @NonNull String message) {
    	this.type = type
    	this.message = message
    }
}

/**
 * Represents a parameter of a callable-signature. A parameter can have a label and a doc-comment.
 */
@JsonRpcData
class ParameterInformation {
	/**
	 * The label of this signature. Will be shown in the UI.
	 */
	@NonNull
	String label

	/**
	 * The human-readable doc-comment of this signature. Will be shown in the UI but can be omitted.
	 */
	Either<String, MarkupContent> documentation
    
    new() {
    }
    
    new(@NonNull String label) {
    	this.label = label
    }
    
    new(@NonNull String label, String documentation) {
    	this.label = label
    	this.documentation = documentation
    }
    
    new(@NonNull String label, MarkupContent documentation) {
    	this.label = label
    	this.documentation = documentation
    }
}

/**
 * Position in a text document expressed as zero-based line and character offset.
 */
@JsonRpcData
class Position {
	/**
	 * Line position in a document (zero-based).
	 */
	int line

	/**
	 * Character offset on a line in a document (zero-based).
	 */
	int character
    
    new() {
    }
    
    new(int line, int character) {
    	this.line = line
    	this.character = character
    }
}

/**
 * Diagnostics notification are sent from the server to the client to signal results of validation runs.
 */
@JsonRpcData
class PublishDiagnosticsParams {
	/**
	 * The URI for which diagnostic information is reported.
	 */
	@NonNull
	String uri

	/**
	 * An array of diagnostic information items.
	 */
	@NonNull
	List<Diagnostic> diagnostics
    
    new() {
    	this.diagnostics = new ArrayList
    }
    
    new(@NonNull String uri, @NonNull List<Diagnostic> diagnostics) {
    	this.uri = uri
    	this.diagnostics = diagnostics
    }
}

/**
 * A range in a text document expressed as (zero-based) start and end positions.
 */
@JsonRpcData
class Range {
	/**
	 * The range's start position
	 */
	@NonNull
	Position start

	/**
	 * The range's end position
	 */
	@NonNull
	Position end
    
    new() {
    }
    
    new(@NonNull Position start, @NonNull Position end) {
    	this.start = start
    	this.end = end
    }
}

/**
 * The references request is sent from the client to the server to resolve project-wide references for the symbol
 * denoted by the given text document position.
 */
@JsonRpcData
class ReferenceContext {
	/**
	 * Include the declaration of the current symbol.
	 */
	boolean includeDeclaration
    
    new() {
    }
    
    new(boolean includeDeclaration) {
    	this.includeDeclaration = includeDeclaration
    }
}

/**
 * The references request is sent from the client to the server to resolve project-wide references for the symbol
 * denoted by the given text document position.
 */
@JsonRpcData
class ReferenceParams extends TextDocumentPositionParams {
	@NonNull
	ReferenceContext context
    
    new() {
    }
    
    new(@NonNull ReferenceContext context) {
    	this.context = context
    }
}

/**
 * The rename request is sent from the client to the server to do a workspace wide rename of a symbol.
 */
@JsonRpcData
class RenameParams {
	/**
	 * The document in which to find the symbol.
	 */
	@NonNull
	TextDocumentIdentifier textDocument

	/**
	 * The position at which this request was send.
	 */
	@NonNull
	Position position

	/**
	 * The new name of the symbol. If the given name is not valid the request must return a
	 * ResponseError with an appropriate message set.
	 */
	@NonNull
	String newName
    
    new() {
    }
    
    new(@NonNull TextDocumentIdentifier textDocument, @NonNull Position position, @NonNull String newName) {
    	this.textDocument = textDocument
    	this.position = position
    	this.newName = newName
    }
}

@JsonRpcData
class ServerCapabilities {
	/**
	 * Defines how text documents are synced. Is either a detailed structure defining each notification or
     * for backwards compatibility the TextDocumentSyncKind number.
	 */
	Either<TextDocumentSyncKind, TextDocumentSyncOptions> textDocumentSync

	/**
	 * The server provides hover support.
	 */
	Boolean hoverProvider

	/**
	 * The server provides completion support.
	 */
	CompletionOptions completionProvider

	/**
	 * The server provides signature help support.
	 */
	SignatureHelpOptions signatureHelpProvider

	/**
	 * The server provides goto definition support.
	 */
	Boolean definitionProvider
	
	/**
	 * The server provides Goto Type Definition support.
	 *
	 * Since 3.6.0
	 */
	Either<Boolean, StaticRegistrationOptions> typeDefinitionProvider
	
	/**
	 * The server provides Goto Implementation support.
	 *
	 * Since 3.6.0
	 */
	Either<Boolean, StaticRegistrationOptions> implementationProvider

	/**
	 * The server provides find references support.
	 */
	Boolean referencesProvider

	/**
	 * The server provides document highlight support.
	 */
	Boolean documentHighlightProvider

	/**
	 * The server provides document symbol support.
	 */
	Boolean documentSymbolProvider

	/**
	 * The server provides workspace symbol support.
	 */
	Boolean workspaceSymbolProvider

	/**
	 * The server provides code actions.
	 */
	Boolean codeActionProvider

	/**
	 * The server provides code lens.
	 */
	CodeLensOptions codeLensProvider

	/**
	 * The server provides document formatting.
	 */
	Boolean documentFormattingProvider

	/**
	 * The server provides document range formatting.
	 */
	Boolean documentRangeFormattingProvider

	/**
	 * The server provides document formatting on typing.
	 */
	DocumentOnTypeFormattingOptions documentOnTypeFormattingProvider

	/**
	 * The server provides rename support.
	 */
	Boolean renameProvider
	
	/**
     * The server provides document link support.
     */
    DocumentLinkOptions documentLinkProvider
    
	/**
	 * The server provides color provider support.
	 *
	 * Since 3.6.0
	 */
	ColorProviderOptions colorProvider
    
    /**
     * The server provides execute command support.
     */
    ExecuteCommandOptions executeCommandProvider

    /**
     * Workspace specific server capabilities
     */
    WorkspaceServerCapabilities workspace
    
    /**
     * Experimental server capabilities.
     */
    @JsonAdapter(JsonElementTypeAdapter.Factory)
    Object experimental

}

/**
 * Workspace specific server capabilities
 */
@JsonRpcData
class WorkspaceServerCapabilities {
	/**
	 * The server supports workspace folder.
	 *
	 * Since 3.6.0
	 */
	WorkspaceFoldersOptions workspaceFolders
	
	new() {
	}
	
	new(WorkspaceFoldersOptions workspaceFolders) {
		this.workspaceFolders = workspaceFolders
	}
}

/**
 * The show message request is sent from a server to a client to ask the client to display a particular message in the
 * user class. In addition to the show message notification the request allows to pass actions and to wait for an
 * answer from the client.
 */
@JsonRpcData
class ShowMessageRequestParams extends MessageParams {
	/**
	 * The message action items to present.
	 */
	List<MessageActionItem> actions
    
    new() {
    }
    
    new(List<MessageActionItem> actions) {
    	this.actions = actions
    }
}

/**
 * Signature help represents the signature of something callable. There can be multiple signature but only one
 * active and only one active parameter.
 */
@JsonRpcData
class SignatureHelp {
	/**
	 * One or more signatures.
	 */
	@NonNull
	List<SignatureInformation> signatures

	/**
	 * The active signature. If omitted or the value lies outside the
	 * range of `signatures` the value defaults to zero or is ignored if
	 * `signatures.length === 0`. Whenever possible implementors should 
	 * make an active decision about the active signature and shouldn't 
	 * rely on a default value.
	 * In future version of the protocol this property might become
	 * mandantory to better express this.
	 */
	Integer activeSignature

	/**
	 * The active parameter of the active signature. If omitted or the value
	 * lies outside the range of `signatures[activeSignature].parameters` 
	 * defaults to 0 if the active signature has parameters. If 
	 * the active signature has no parameters it is ignored. 
	 * In future version of the protocol this property might become
	 * mandantory to better express the active parameter if the
	 * active signature does have any.
	 */
	Integer activeParameter
    
    new() {
    	this.signatures = new ArrayList
    }
    
    new(@NonNull List<SignatureInformation> signatures, Integer activeSignature, Integer activeParameter) {
    	this.signatures = signatures
    	this.activeSignature = activeSignature
    	this.activeParameter = activeParameter
    }
}

/**
 * Signature help options.
 */
@JsonRpcData
class SignatureHelpOptions {
	/**
	 * The characters that trigger signature help automatically.
	 */
	List<String> triggerCharacters
    
    new() {
    }
    
    new(List<String> triggerCharacters) {
    	this.triggerCharacters = triggerCharacters
    }
}

/**
 * Represents the signature of something callable. A signature can have a label, like a function-name, a doc-comment, and
 * a set of parameters.
 */
@JsonRpcData
class SignatureInformation {
	/**
	 * The label of this signature. Will be shown in the UI.
	 */
	@NonNull
	String label

	/**
	 * The human-readable doc-comment of this signature. Will be shown in the UI but can be omitted.
	 */
	Either<String, MarkupContent> documentation

	/**
	 * The parameters of this signature.
	 */
	List<ParameterInformation> parameters
    
    new() {
    }
    
    new(@NonNull String label) {
    	this.label = label
    }
    
    new(@NonNull String label, String documentation, List<ParameterInformation> parameters) {
    	this.label = label
    	this.documentation = documentation
    	this.parameters = parameters
    }
    
    new(@NonNull String label, MarkupContent documentation, List<ParameterInformation> parameters) {
    	this.label = label
    	this.documentation = documentation
    	this.parameters = parameters
    }
}

/**
 * Represents information about programming constructs like variables, classes, interfaces etc.
 */
@JsonRpcData
class SymbolInformation {
	/**
	 * The name of this symbol.
	 */
	@NonNull
	String name

	/**
	 * The kind of this symbol.
	 */
	@NonNull
	SymbolKind kind

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
	Location location

	/**
	 * The name of the symbol containing this symbol. This information is for
	 * user interface purposes (e.g. to render a qualifier in the user interface
	 * if necessary). It can't be used to re-infer a hierarchy for the document
	 * symbols.
	 */
	String containerName
	
    new() {
    }
    
    new(@NonNull String name, @NonNull SymbolKind kind, @NonNull Location location) {
    	this.name = name
    	this.kind = kind
    	this.location = location
    }
    
    new(@NonNull String name, @NonNull SymbolKind kind, @NonNull Location location, String containerName) {
    	this.name = name
    	this.kind = kind
    	this.location = location
    	this.containerName = containerName
    }
}

/**
 * An event describing a change to a text document. If range and rangeLength are omitted the new text is considered
 * to be the full content of the document.
 */
@JsonRpcData
class TextDocumentContentChangeEvent {
	/**
	 * The range of the document that changed.
	 */
	Range range

	/**
	 * The length of the range that got replaced.
	 */
	Integer rangeLength

	/**
	 * The new text of the range/document.
	 */
	@NonNull
	String text
    
    new() {
    }
    
    new(@NonNull String text) {
    	this.text = text
    }
    
    new(Range range, Integer rangeLength, @NonNull String text) {
    	this.range = range
    	this.rangeLength = rangeLength
    	this.text = text
    }
}

/**
 * Text documents are identified using an URI. On the protocol level URI's are passed as strings.
 */
@JsonRpcData
class TextDocumentIdentifier {
	/**
	 * The text document's uri.
	 */
	@NonNull
	String uri
    
    new() {
    }
    
    new(@NonNull String uri) {
    	this.uri = uri
    }
}

/**
 * An item to transfer a text document from the client to the server.
 */
@JsonRpcData
class TextDocumentItem {
	/**
	 * The text document's uri.
	 */
	@NonNull
	String uri

	/**
	 * The text document's language identifier
	 */
	@NonNull
	String languageId

	/**
	 * The version number of this document (it will strictly increase after each change, including undo/redo).
	 */
	int version

	/**
	 * The content of the opened  text document.
	 */
	@NonNull
	String text
    
    new() {
    }
    
    new(@NonNull String uri, @NonNull String languageId, int version, @NonNull String text) {
    	this.uri = uri
    	this.languageId = languageId
    	this.version = version
    	this.text = text
    }
}

/**
 * A parameter literal used in requests to pass a text document and a position inside that document.
 */
@JsonRpcData
class TextDocumentPositionParams {
	/**
	 * The text document.
	 */
	@NonNull
	TextDocumentIdentifier textDocument

	/**
	 * Legacy property to support protocol version 1.0 requests.
	 */
	@Deprecated
	String uri

	/**
	 * The position inside the text document.
	 */
	@NonNull
	Position position
    
    new() {
    }
    
    new(@NonNull TextDocumentIdentifier textDocument, @NonNull Position position) {
    	this.textDocument = textDocument
    	this.position = position
    }
    
    @Deprecated
	new(@NonNull TextDocumentIdentifier textDocument, String uri, @NonNull Position position) {
    	this.textDocument = textDocument
    	this.uri = uri
    	this.position = position
    }
}

@JsonRpcData
class CompletionParams extends TextDocumentPositionParams {
	/**
	 * The completion context. This is only available it the client specifies
	 * to send this using `ClientCapabilities.textDocument.completion.contextSupport === true`
	 */
	CompletionContext context

	new() {
	}

	new(@NonNull TextDocumentIdentifier textDocument, @NonNull Position position) {
		super(textDocument, position)
	}

	new(@NonNull TextDocumentIdentifier textDocument, @NonNull Position position, CompletionContext context) {
		super(textDocument, position)
		this.context = context
	}
}

@JsonRpcData
class CompletionContext {
	/**
	 * How the completion was triggered.
	 */
	@NonNull
	CompletionTriggerKind triggerKind
	
	/**
	 * The trigger character (a single character) that has trigger code complete.
	 * Is undefined if `triggerKind !== CompletionTriggerKind.TriggerCharacter`
	 */
	String triggerCharacter
	
	new() {
	}
	
	new(@NonNull CompletionTriggerKind triggerKind) {
		this.triggerKind = triggerKind
	}
	
	new(@NonNull CompletionTriggerKind triggerKind, String triggerCharacter) {
		this.triggerKind = triggerKind
		this.triggerCharacter = triggerCharacter
	}
}

/**
 * A textual edit applicable to a text document.
 */
@JsonRpcData
class TextEdit {
	/**
	 * The range of the text document to be manipulated. To insert text into a document create a range where start === end.
	 */
	@NonNull
	Range range

	/**
	 * The string to be inserted. For delete operations use an empty string.
	 */
	@NonNull
	String newText
    
    new() {
    }
    
    new(@NonNull Range range, @NonNull String newText) {
    	this.range = range
    	this.newText = newText
    }
}

/**
 * An identifier to denote a specific version of a text document.
 */
@JsonRpcData
@JsonAdapter(VersionedTextDocumentIdentifierTypeAdapter.Factory)
class VersionedTextDocumentIdentifier extends TextDocumentIdentifier {
	/**
	 * The version number of this document. If a versioned text document identifier
	 * is sent from the server to the client and the file is not open in the editor
	 * (the server has not received an open notification before) the server can send
	 * `null` to indicate that the version is known and the content on disk is the
	 * truth (as specified with document content ownership).
	 */
	Integer version
    
    new() {
    }
    
    new(Integer version) {
    	this.version = version
    }
}

/**
 * Describes textual changes on a single text document.
 * The text document is referred to as a `VersionedTextDocumentIdentifier`
 * to allow clients to check the text document version before an edit is applied.
 */
@JsonRpcData
class TextDocumentEdit {
	/**
	 * The text document to change.
	 */
	@NonNull
	VersionedTextDocumentIdentifier textDocument
	
	/**
	 * The edits to be applied
	 */
	@NonNull
	List<TextEdit> edits
    
    new() {
    }
    
    new(@NonNull VersionedTextDocumentIdentifier textDocument, @NonNull List<TextEdit> edits) {
    	this.textDocument = textDocument
    	this.edits = edits
    }
}

/**
 * A resource change.
 *
 * If both current and newUri has valid values this is considered to be a move operation.
 * If current has a valid value while newUri is null it is treated as a delete operation.
 * If current is null and newUri has a valid value a create operation is executed.
 */
@JsonRpcData
@Beta
class ResourceChange {

  /**
  * The Uri for current resource. Required for delete and move operations
  * otherwise it is null.
  *
  */
  String current

  /**
  * The new uri for the resource. Required for create and move operations.
  * otherwise null.
  *
  * Must be compatible with the current uri ie. must be a file
  * uri if current is not null and is a file uri.
  */
  String newUri

}

/**
 * A workspace edit represents changes to many resources managed in the workspace. 
 * The edit should either provide `changes` or `documentChanges`.
 * If documentChanges are present they are preferred over `changes`
 * if the client can handle versioned document edits.
 */
@JsonRpcData
class WorkspaceEdit {
	/**
	 * Holds changes to existing resources.
	 */
	Map<String, List<TextEdit>> changes

	/**
	 * An array of `TextDocumentEdit`s to express changes to specific a specific
	 * version of a text document. Whether a client supports versioned document
	 * edits is expressed via `WorkspaceClientCapabilities.versionedWorkspaceEdit`.
	 */
	List<TextDocumentEdit> documentChanges
	
	/**
	 * if resource changes are supported the `WorkspaceEdit`
	 * uses the property `resourceChanges` which are either a
	 * rename, move, delete or content change.
	 * These changes are applied in the order that they are supplied,
	 * however clients may group the changes for optimization
	 */
	@Beta List<Either<ResourceChange, TextDocumentEdit>> resourceChanges

    new() {
    	this.changes = new LinkedHashMap
    }
    
    new(Map<String, List<TextEdit>> changes) {
    	this.changes = changes
    }
    
    new(List<TextDocumentEdit> documentChanges) {
    	this.documentChanges = documentChanges
    }
    
    /**
     * @deprecated According to the protocol documentation, it doesn't make sense to send both
     * 		changes and documentChanges
     */
    @Deprecated
    new(Map<String, List<TextEdit>> changes, List<TextDocumentEdit> documentChanges) {
    	this.changes = changes
    	this.documentChanges = documentChanges
    }
}

/**
 * The parameters of a Workspace Symbol Request.
 */
@JsonRpcData
class WorkspaceSymbolParams {
	/**
	 * A non-empty query string
	 */
	@NonNull
	String query
    
    new() {
    }
    
    new(@NonNull String query) {
    	this.query = query
    }
}

/**
 * General parameters to register for a capability.
 */
@JsonRpcData
class Registration {
	/**
     * The id used to register the request. The id can be used to deregister
     * the request again.
     */
    @NonNull
	String id
	
	/**
     * The method / capability to register for.
     */
    @NonNull
	String method
	
	/**
     * Options necessary for the registration.
     */
    @JsonAdapter(JsonElementTypeAdapter.Factory)
    Object registerOptions
    
    new() {
    }
    
    new(@NonNull String id, @NonNull String method) {
    	this.id = id
    	this.method = method
    }
    
    new(@NonNull String id, @NonNull String method, Object registerOptions) {
    	this.id = id
    	this.method = method
    	this.registerOptions = registerOptions
    }
}

/**
 * The client/registerCapability request is sent from the server to the client to register
 * for a new capability on the client side. Not all clients need to support dynamic
 * capability registration. A client opts in via the dynamicRegistration property on the
 * specific client capabilities. A client can even provide dynamic registration for
 * capability A but not for capability B (see TextDocumentClientCapabilities as an example).
 */
@JsonRpcData
class RegistrationParams {
	@NonNull
	List<Registration> registrations
    
    new() {
    	this(new ArrayList)
    }
    
    new(@NonNull List<Registration> registrations) {
    	this.registrations = registrations
    }
}

/**
 * A document filter denotes a document through properties like language, schema or pattern.
 */
@JsonRpcData
class DocumentFilter {
	/**
     * A language id, like `typescript`.
     */
    String language
	
	/**
     * A uri scheme, like `file` or `untitled`.
     */
    String scheme
	
	/**
     * A glob pattern, like `*.{ts,js}`.
     */
    String pattern
    
    new() {
    }
    
    new(String language, String scheme, String pattern) {
    	this.language = language
    	this.scheme = scheme
    	this.pattern = pattern
    }
}

/**
 * Since most of the registration options require to specify a document selector there is
 * a base interface that can be used.
 */
@JsonRpcData
class TextDocumentRegistrationOptions {
	/**
     * A document selector to identify the scope of the registration. If set to null
     * the document selector provided on the client side will be used.
     */
    List<DocumentFilter> documentSelector
    
    new() {
    }
    
    new(List<DocumentFilter> documentSelector) {
    	this.documentSelector = documentSelector
    }
}

/**
 * General parameters to unregister a capability.
 */
@JsonRpcData
class Unregistration {
	/**
     * The id used to unregister the request or notification. Usually an id
     * provided during the register request.
     */
    @NonNull
	String id
	
	/**
     * The method / capability to unregister for.
     */
    @NonNull
	String method
    
    new() {
    }
    
    new(@NonNull String id, @NonNull String method) {
    	this.id = id
    	this.method = method
    }
}

/**
 * The client/unregisterCapability request is sent from the server to the client to unregister
 * a previously registered capability.
 */
@JsonRpcData
class UnregistrationParams {
	@NonNull
	List<Unregistration> unregisterations
    
    new() {
    	this(new ArrayList)
    }
    
    new(@NonNull List<Unregistration> unregisterations) {
    	this.unregisterations = unregisterations
    }
}

/**
 * Describe options to be used when registered for text document change events.
 */
@JsonRpcData
class TextDocumentChangeRegistrationOptions extends TextDocumentRegistrationOptions {
	/**
     * How documents are synced to the server. See TextDocumentSyncKind.Full 
     * and TextDocumentSyncKind.Incremental.
     */
    @NonNull
	TextDocumentSyncKind syncKind
    
    new() {
    }
    
    new(@NonNull TextDocumentSyncKind syncKind) {
    	this.syncKind = syncKind
    }
}

@JsonRpcData
class TextDocumentSaveRegistrationOptions extends TextDocumentRegistrationOptions {
	/**
	 * The client is supposed to include the content on save.
	 */
	Boolean includeText
    
    new() {
    }
    
    new(Boolean includeText) {
    	this.includeText = includeText
    }
}

@JsonRpcData
class CompletionRegistrationOptions extends TextDocumentRegistrationOptions {
	/**
	 * Most tools trigger completion request automatically without explicitly requesting
	 * it using a keyboard shortcut (e.g. Ctrl+Space). Typically they do so when the user
	 * starts to type an identifier. For example if the user types `c` in a JavaScript file
	 * code complete will automatically pop up present `console` besides others as a
	 * completion item. Characters that make up identifiers don't need to be listed here.
	 *
	 * If code complete should automatically be trigger on characters not being valid inside
	 * an identifier (for example `.` in JavaScript) list them in `triggerCharacters`.
	 */
	List<String> triggerCharacters

    /**
     * The server provides support to resolve additional information for a completion item.
     */
    Boolean resolveProvider
    
    new() {
    }
    
    new(List<String> triggerCharacters, Boolean resolveProvider) {
    	this.triggerCharacters = triggerCharacters
    	this.resolveProvider = resolveProvider
    }
}

@JsonRpcData
class SignatureHelpRegistrationOptions extends TextDocumentRegistrationOptions {
	/**
     * The characters that trigger signature help automatically.
     */
    List<String> triggerCharacters
    
    new() {
    }
    
    new(List<String> triggerCharacters) {
    	this.triggerCharacters = triggerCharacters
    }
}

@JsonRpcData
class CodeLensRegistrationOptions extends TextDocumentRegistrationOptions {
	/**
     * Code lens has a resolve provider as well.
     */
    Boolean resolveProvider
    
    new() {
    }
    
    new(Boolean resolveProvider) {
    	this.resolveProvider = resolveProvider
    }
}

@JsonRpcData
class DocumentLinkRegistrationOptions extends TextDocumentRegistrationOptions {
	/**
     * Document links have a resolve provider as well.
     */
    Boolean resolveProvider
    
    new() {
    }
    
    new(Boolean resolveProvider) {
    	this.resolveProvider = resolveProvider
    }
}

@JsonRpcData
class DocumentOnTypeFormattingRegistrationOptions extends TextDocumentRegistrationOptions {
	/**
     * A character on which formatting should be triggered, like `}`.
     */
    @NonNull
    String firstTriggerCharacter
    
	/**
     * More trigger characters.
     */
    List<String> moreTriggerCharacter
    
    new() {
    }
    
    new(@NonNull String firstTriggerCharacter) {
    	this.firstTriggerCharacter = firstTriggerCharacter
    }
    
    new(@NonNull String firstTriggerCharacter, List<String> moreTriggerCharacter) {
    	this.firstTriggerCharacter = firstTriggerCharacter
    	this.moreTriggerCharacter = moreTriggerCharacter
    }
}

/**
 * The workspace/executeCommand request is sent from the client to the server to trigger command
 * execution on the server. In most cases the server creates a WorkspaceEdit structure and applies
 * the changes to the workspace using the request workspace/applyEdit which is sent from the server
 * to the client.
 */
@JsonRpcData
class ExecuteCommandParams {
	/**
     * The identifier of the actual command handler.
     */
    @NonNull
	String command
	
	/**
     * Arguments that the command should be invoked with.
     * The arguments are typically specified when a command is returned from the server to the client.
     * Example requests that return a command are textDocument/codeAction or textDocument/codeLens.
     */
    List<Object> arguments
    
    new() {
    }
    
    new(@NonNull String command, List<Object> arguments) {
    	this.command = command
    	this.arguments = arguments
    }
}

/**
 * Execute command registration options.
 */
@JsonRpcData
class ExecuteCommandRegistrationOptions {
	/**
     * The commands to be executed on the server
     */
    @NonNull
    List<String> commands
    
    new() {
    }
    
    new(@NonNull List<String> commands) {
    	this.commands = commands
    }
}

/**
 * The workspace/applyEdit request is sent from the server to the client to modify resource on the client side.
 */
@JsonRpcData
class ApplyWorkspaceEditParams {
	/**
     * The edits to apply.
     */
    @NonNull
    WorkspaceEdit edit

	/**
     * An optional label of the workspace edit. This label is
     * presented in the user interface for example on an undo
     * stack to undo the workspace edit.
     */
    String label
    
    new() {
    }
    
    new(@NonNull WorkspaceEdit edit) {
    	this.edit = edit
    }

    new(@NonNull WorkspaceEdit edit, String label) {
    	this.edit = edit;
    	this.label = label
    }
}

@JsonRpcData
class ApplyWorkspaceEditResponse {
	/**
     * Indicates whether the edit was applied or not.
     */
    boolean applied
    
    new() {
    }
    
    new(boolean applied) {
    	this.applied = applied
    }
}

/**
 * The server supports workspace folder.
 *
 * Since 3.6.0
 */
@JsonRpcData
class WorkspaceFoldersOptions {
	/**
	 * The server has support for workspace folders
	 */
	Boolean supported
	
	/**
	 * Whether the server wants to receive workspace folder
	 * change notifications.
	 *
	 * If a string is provided, the string is treated as an ID
	 * under which the notification is registed on the client
	 * side. The ID can be used to unregister for these events
	 * using the `client/unregisterCapability` request.
	 */
	Either<String, Boolean> changeNotifications
}

/**
 * The workspace/workspaceFolders request is sent from the server to the client to fetch
 * the current open list of workspace folders. Returns null in the response if only a single
 * file is open in the tool. Returns an empty array if a workspace is open but no folders
 * are configured.
 */
@JsonRpcData
class WorkspaceFolder {
	/**
	 * The associated URI for this workspace folder.
	 */
	@NonNull String uri

	/**
	 * The name of the workspace folder. Defaults to the uri's basename.
	 */
	String name
	
	new() {
	}
	
	new(@NonNull String uri) {
		this.uri = uri
	}
	
	new(@NonNull String uri, String name) {
		this.uri = uri
		this.name = name
	}
}

/**
 * The workspace folder change event.
 */
@JsonRpcData
class WorkspaceFoldersChangeEvent {
	/**
	 * The array of added workspace folders
	 */
	@NonNull
	List<WorkspaceFolder> added = new ArrayList

	/**
	 * The array of the removed workspace folders
	 */
	@NonNull
	List<WorkspaceFolder> removed = new ArrayList
	
	new() {
	}
	
	new(@NonNull List<WorkspaceFolder> added, @NonNull List<WorkspaceFolder> removed) {
		this.added = added
		this.removed = removed
	}
}

/**
 * The workspace/didChangeWorkspaceFolders notification is sent from the client to the server to
 * inform the server about workspace folder configuration changes. The notification is sent by
 * default if both ServerCapabilities/workspace/workspaceFolders and
 * ClientCapabilities/workspace/workspaceFolders are true; or if the server has registered to
 * receive this notification it first.
 */
@JsonRpcData
class DidChangeWorkspaceFoldersParams {
	/**
	 * The actual workspace folder change event.
	 */
	@NonNull
	WorkspaceFoldersChangeEvent event
	
	new() {
	}
	
	new(@NonNull WorkspaceFoldersChangeEvent event) {
		this.event = event
	}
}

/**
 * The workspace/configuration request is sent from the server to the client to fetch configuration
 * settings from the client. The request can fetch n configuration settings in one roundtrip.
 * The order of the returned configuration settings correspond to the order of the passed
 * ConfigurationItems (e.g. the first item in the response is the result for the first
 * configuration item in the params).
 * 
 * Since 3.6.0
 */
@JsonRpcData
class ConfigurationParams {
	@NonNull
	List<ConfigurationItem> items
	
	new() {
	}
	
	new(@NonNull List<ConfigurationItem> items) {
		this.items = items
	}
}

/**
 * A ConfigurationItem consist of the configuration section to ask for and an additional scope URI.
 * The configuration section ask for is defined by the server and doesn’t necessarily need to
 * correspond to the configuration store used be the client. So a server might ask for a configuration
 * cpp.formatterOptions but the client stores the configuration in a XML store layout differently.
 * It is up to the client to do the necessary conversion. If a scope URI is provided the client
 * should return the setting scoped to the provided resource. If the client for example uses
 * EditorConfig to manage its settings the configuration should be returned for the passed resource
 * URI. If the client can’t provide a configuration setting for a given scope then null need to be
 * present in the returned array.
 * 
 * Since 3.6.0
 */
@JsonRpcData
class ConfigurationItem {
	/**
	 * The scope to get the configuration section for.
	 */
	String scopeUri
	
	/**
	 * The configuration section asked for.
	 */
	String section
}

/**
 * The document color request is sent from the client to the server to list all color refereces
 * found in a given text document. Along with the range, a color value in RGB is returned.
 * 
 * Since 3.6.0
 */
@JsonRpcData
class DocumentColorParams {
	/**
	 * The text document.
	 */
	@NonNull
	TextDocumentIdentifier textDocument
	
	new() {
	}
	
	new(@NonNull TextDocumentIdentifier textDocument) {
		this.textDocument = textDocument
	}
}

@JsonRpcData
class ColorInformation {
	/**
	 * The range in the document where this color appers.
	 */
	@NonNull
	Range range

	/**
	 * The actual color value for this color range.
	 */
	@NonNull
	Color color
	
	new() {
	}
	
	new(@NonNull Range range, @NonNull Color color) {
		this.range = range
		this.color = color
	}
}

/**
 * Represents a color in RGBA space.
 */
@JsonRpcData
class Color {
	/**
	 * The red component of this color in the range [0-1].
	 */
	double red

	/**
	 * The green component of this color in the range [0-1].
	 */
	double green

	/**
	 * The blue component of this color in the range [0-1].
	 */
	double blue

	/**
	 * The alpha component of this color in the range [0-1].
	 */
	double alpha
	
	new() {
	}
	
	new(double red, double green, double blue, double alpha) {
		this.red = red
		this.green = green
		this.blue = blue
		this.alpha = alpha
	}
}

/**
 * The color presentation request is sent from the client to the server to obtain a list of presentations
 * for a color value at a given location.
 * 
 * Since 3.6.0
 */
@JsonRpcData
class ColorPresentationParams {
	/**
	 * The text document.
	 */
	@NonNull
	TextDocumentIdentifier textDocument

	/**
	 * The color information to request presentations for.
	 */
	@NonNull
	Color colorInfo

	/**
	 * The range where the color would be inserted. Serves as a context.
	 */
	@NonNull
	Range range
	
	new() {
	}
	
	new(@NonNull TextDocumentIdentifier textDocument, @NonNull Color colorInfo, @NonNull Range range) {
		this.textDocument = textDocument
		this.colorInfo = colorInfo
		this.range = range
	}
}

@JsonRpcData
class ColorPresentation {
	/**
	 * The label of this color presentation. It will be shown on the color
	 * picker header. By default this is also the text that is inserted when selecting
	 * this color presentation.
	 */
	@NonNull
	String label
	
	/**
	 * An edit which is applied to a document when selecting
	 * this presentation for the color.  When `null` the label is used.
	 */
	TextEdit textEdit
	
	/**
	 * An optional array of additional text edits that are applied when
	 * selecting this color presentation. Edits must not overlap with the main edit nor with themselves.
	 */
	List<TextEdit> additionalTextEdits
	
	new() {
	}
	
	new(@NonNull String label) {
		this.label = label
	}
	
	new(@NonNull String label, TextEdit textEdit) {
		this.label = label
		this.textEdit = textEdit
	}
	
	new(@NonNull String label, TextEdit textEdit, List<TextEdit> additionalTextEdits) {
		this.label = label
		this.textEdit = textEdit
		this.additionalTextEdits = additionalTextEdits
	}
}
