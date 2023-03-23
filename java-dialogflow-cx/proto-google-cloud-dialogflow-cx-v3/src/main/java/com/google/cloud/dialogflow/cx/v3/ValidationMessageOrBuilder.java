/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/cx/v3/validation_message.proto

package com.google.cloud.dialogflow.cx.v3;

public interface ValidationMessageOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3.ValidationMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The type of the resources where the message is found.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.ValidationMessage.ResourceType resource_type = 1;</code>
   *
   * @return The enum numeric value on the wire for resourceType.
   */
  int getResourceTypeValue();
  /**
   *
   *
   * <pre>
   * The type of the resources where the message is found.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.ValidationMessage.ResourceType resource_type = 1;</code>
   *
   * @return The resourceType.
   */
  com.google.cloud.dialogflow.cx.v3.ValidationMessage.ResourceType getResourceType();

  /**
   *
   *
   * <pre>
   * The names of the resources where the message is found.
   * </pre>
   *
   * <code>repeated string resources = 2 [deprecated = true];</code>
   *
   * @deprecated google.cloud.dialogflow.cx.v3.ValidationMessage.resources is deprecated. See
   *     google/cloud/dialogflow/cx/v3/validation_message.proto;l=93
   * @return A list containing the resources.
   */
  @java.lang.Deprecated
  java.util.List<java.lang.String> getResourcesList();
  /**
   *
   *
   * <pre>
   * The names of the resources where the message is found.
   * </pre>
   *
   * <code>repeated string resources = 2 [deprecated = true];</code>
   *
   * @deprecated google.cloud.dialogflow.cx.v3.ValidationMessage.resources is deprecated. See
   *     google/cloud/dialogflow/cx/v3/validation_message.proto;l=93
   * @return The count of resources.
   */
  @java.lang.Deprecated
  int getResourcesCount();
  /**
   *
   *
   * <pre>
   * The names of the resources where the message is found.
   * </pre>
   *
   * <code>repeated string resources = 2 [deprecated = true];</code>
   *
   * @deprecated google.cloud.dialogflow.cx.v3.ValidationMessage.resources is deprecated. See
   *     google/cloud/dialogflow/cx/v3/validation_message.proto;l=93
   * @param index The index of the element to return.
   * @return The resources at the given index.
   */
  @java.lang.Deprecated
  java.lang.String getResources(int index);
  /**
   *
   *
   * <pre>
   * The names of the resources where the message is found.
   * </pre>
   *
   * <code>repeated string resources = 2 [deprecated = true];</code>
   *
   * @deprecated google.cloud.dialogflow.cx.v3.ValidationMessage.resources is deprecated. See
   *     google/cloud/dialogflow/cx/v3/validation_message.proto;l=93
   * @param index The index of the value to return.
   * @return The bytes of the resources at the given index.
   */
  @java.lang.Deprecated
  com.google.protobuf.ByteString getResourcesBytes(int index);

  /**
   *
   *
   * <pre>
   * The resource names of the resources where the message is found.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3.ResourceName resource_names = 6;</code>
   */
  java.util.List<com.google.cloud.dialogflow.cx.v3.ResourceName> getResourceNamesList();
  /**
   *
   *
   * <pre>
   * The resource names of the resources where the message is found.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3.ResourceName resource_names = 6;</code>
   */
  com.google.cloud.dialogflow.cx.v3.ResourceName getResourceNames(int index);
  /**
   *
   *
   * <pre>
   * The resource names of the resources where the message is found.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3.ResourceName resource_names = 6;</code>
   */
  int getResourceNamesCount();
  /**
   *
   *
   * <pre>
   * The resource names of the resources where the message is found.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3.ResourceName resource_names = 6;</code>
   */
  java.util.List<? extends com.google.cloud.dialogflow.cx.v3.ResourceNameOrBuilder>
      getResourceNamesOrBuilderList();
  /**
   *
   *
   * <pre>
   * The resource names of the resources where the message is found.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3.ResourceName resource_names = 6;</code>
   */
  com.google.cloud.dialogflow.cx.v3.ResourceNameOrBuilder getResourceNamesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Indicates the severity of the message.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.ValidationMessage.Severity severity = 3;</code>
   *
   * @return The enum numeric value on the wire for severity.
   */
  int getSeverityValue();
  /**
   *
   *
   * <pre>
   * Indicates the severity of the message.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.ValidationMessage.Severity severity = 3;</code>
   *
   * @return The severity.
   */
  com.google.cloud.dialogflow.cx.v3.ValidationMessage.Severity getSeverity();

  /**
   *
   *
   * <pre>
   * The message detail.
   * </pre>
   *
   * <code>string detail = 4;</code>
   *
   * @return The detail.
   */
  java.lang.String getDetail();
  /**
   *
   *
   * <pre>
   * The message detail.
   * </pre>
   *
   * <code>string detail = 4;</code>
   *
   * @return The bytes for detail.
   */
  com.google.protobuf.ByteString getDetailBytes();
}
