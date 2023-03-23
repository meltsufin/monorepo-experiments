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
// source: google/cloud/baremetalsolution/v2/instance.proto

package com.google.cloud.baremetalsolution.v2;

public interface UpdateInstanceRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.baremetalsolution.v2.UpdateInstanceRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The server to update.
   * The `name` field is used to identify the instance to update.
   * Format: projects/{project}/locations/{location}/instances/{instance}
   * </pre>
   *
   * <code>
   * .google.cloud.baremetalsolution.v2.Instance instance = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the instance field is set.
   */
  boolean hasInstance();
  /**
   *
   *
   * <pre>
   * Required. The server to update.
   * The `name` field is used to identify the instance to update.
   * Format: projects/{project}/locations/{location}/instances/{instance}
   * </pre>
   *
   * <code>
   * .google.cloud.baremetalsolution.v2.Instance instance = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The instance.
   */
  com.google.cloud.baremetalsolution.v2.Instance getInstance();
  /**
   *
   *
   * <pre>
   * Required. The server to update.
   * The `name` field is used to identify the instance to update.
   * Format: projects/{project}/locations/{location}/instances/{instance}
   * </pre>
   *
   * <code>
   * .google.cloud.baremetalsolution.v2.Instance instance = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.baremetalsolution.v2.InstanceOrBuilder getInstanceOrBuilder();

  /**
   *
   *
   * <pre>
   * The list of fields to update.
   * The currently supported fields are:
   *   `labels`
   *   `hyperthreading_enabled`
   *   `os_image`
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * The list of fields to update.
   * The currently supported fields are:
   *   `labels`
   *   `hyperthreading_enabled`
   *   `os_image`
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * The list of fields to update.
   * The currently supported fields are:
   *   `labels`
   *   `hyperthreading_enabled`
   *   `os_image`
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
