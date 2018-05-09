/**
 * Copyright (c) 2017 Kichwa Coders Ltd. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.lsp4j.debug;

import java.util.Map;
import org.eclipse.lsp4j.jsonrpc.validation.NonNull;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

/**
 * A structured message object. Used to return errors from requests.
 */
@SuppressWarnings("all")
public class Message {
  /**
   * Unique identifier for the message.
   */
  @NonNull
  private Long id;
  
  /**
   * A format string for the message. Embedded variables have the form '{name}'.
   * <p>
   * If variable name starts with an underscore character, the variable does not contain user data (PII) and can be
   * safely used for telemetry purposes.
   */
  @NonNull
  private String format;
  
  /**
   * An object used as a dictionary for looking up the variables in the format string.
   * <p>
   * This is an optional property.
   */
  private Map<String, String> variables;
  
  /**
   * If true send to telemetry.
   * <p>
   * This is an optional property.
   */
  private Boolean sendTelemetry;
  
  /**
   * If true show user.
   * <p>
   * This is an optional property.
   */
  private Boolean showUser;
  
  /**
   * An optional url where additional information about this message can be found.
   * <p>
   * This is an optional property.
   */
  private String url;
  
  /**
   * An optional label that is presented to the user as the UI for opening the url.
   * <p>
   * This is an optional property.
   */
  private String urlLabel;
  
  /**
   * Unique identifier for the message.
   */
  @Pure
  @NonNull
  public Long getId() {
    return this.id;
  }
  
  /**
   * Unique identifier for the message.
   */
  public void setId(@NonNull final Long id) {
    this.id = id;
  }
  
  /**
   * A format string for the message. Embedded variables have the form '{name}'.
   * <p>
   * If variable name starts with an underscore character, the variable does not contain user data (PII) and can be
   * safely used for telemetry purposes.
   */
  @Pure
  @NonNull
  public String getFormat() {
    return this.format;
  }
  
  /**
   * A format string for the message. Embedded variables have the form '{name}'.
   * <p>
   * If variable name starts with an underscore character, the variable does not contain user data (PII) and can be
   * safely used for telemetry purposes.
   */
  public void setFormat(@NonNull final String format) {
    this.format = format;
  }
  
  /**
   * An object used as a dictionary for looking up the variables in the format string.
   * <p>
   * This is an optional property.
   */
  @Pure
  public Map<String, String> getVariables() {
    return this.variables;
  }
  
  /**
   * An object used as a dictionary for looking up the variables in the format string.
   * <p>
   * This is an optional property.
   */
  public void setVariables(final Map<String, String> variables) {
    this.variables = variables;
  }
  
  /**
   * If true send to telemetry.
   * <p>
   * This is an optional property.
   */
  @Pure
  public Boolean getSendTelemetry() {
    return this.sendTelemetry;
  }
  
  /**
   * If true send to telemetry.
   * <p>
   * This is an optional property.
   */
  public void setSendTelemetry(final Boolean sendTelemetry) {
    this.sendTelemetry = sendTelemetry;
  }
  
  /**
   * If true show user.
   * <p>
   * This is an optional property.
   */
  @Pure
  public Boolean getShowUser() {
    return this.showUser;
  }
  
  /**
   * If true show user.
   * <p>
   * This is an optional property.
   */
  public void setShowUser(final Boolean showUser) {
    this.showUser = showUser;
  }
  
  /**
   * An optional url where additional information about this message can be found.
   * <p>
   * This is an optional property.
   */
  @Pure
  public String getUrl() {
    return this.url;
  }
  
  /**
   * An optional url where additional information about this message can be found.
   * <p>
   * This is an optional property.
   */
  public void setUrl(final String url) {
    this.url = url;
  }
  
  /**
   * An optional label that is presented to the user as the UI for opening the url.
   * <p>
   * This is an optional property.
   */
  @Pure
  public String getUrlLabel() {
    return this.urlLabel;
  }
  
  /**
   * An optional label that is presented to the user as the UI for opening the url.
   * <p>
   * This is an optional property.
   */
  public void setUrlLabel(final String urlLabel) {
    this.urlLabel = urlLabel;
  }
  
  @Override
  @Pure
  public String toString() {
    ToStringBuilder b = new ToStringBuilder(this);
    b.add("id", this.id);
    b.add("format", this.format);
    b.add("variables", this.variables);
    b.add("sendTelemetry", this.sendTelemetry);
    b.add("showUser", this.showUser);
    b.add("url", this.url);
    b.add("urlLabel", this.urlLabel);
    return b.toString();
  }
  
  @Override
  @Pure
  public boolean equals(final Object obj) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe type Message is already defined in Message.java.");
  }
  
  @Override
  @Pure
  public int hashCode() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe type Message is already defined in Message.java.");
  }
}
