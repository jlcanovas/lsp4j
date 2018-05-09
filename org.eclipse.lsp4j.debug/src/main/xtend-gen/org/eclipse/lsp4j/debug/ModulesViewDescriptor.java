/**
 * Copyright (c) 2017 Kichwa Coders Ltd. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.lsp4j.debug;

import org.eclipse.lsp4j.debug.ColumnDescriptor;
import org.eclipse.lsp4j.generator.JsonRpcData;
import org.eclipse.lsp4j.jsonrpc.validation.NonNull;

/**
 * The ModulesViewDescriptor is the container for all declarative configuration options of a ModuleView.
 * <p>
 * For now it only specifies the columns to be shown in the modules view.
 */
/* @JsonRpcData */@SuppressWarnings("all")
public class ModulesViewDescriptor {
  @NonNull
  private ColumnDescriptor[] columns;
}
