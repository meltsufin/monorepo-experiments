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
// source: google/cloud/kms/v1/ekm_service.proto

package com.google.cloud.kms.v1;

public interface UpdateEkmConnectionRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.kms.v1.UpdateEkmConnectionRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. [EkmConnection][google.cloud.kms.v1.EkmConnection] with updated
   * values.
   * </pre>
   *
   * <code>
   * .google.cloud.kms.v1.EkmConnection ekm_connection = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the ekmConnection field is set.
   */
  boolean hasEkmConnection();
  /**
   *
   *
   * <pre>
   * Required. [EkmConnection][google.cloud.kms.v1.EkmConnection] with updated
   * values.
   * </pre>
   *
   * <code>
   * .google.cloud.kms.v1.EkmConnection ekm_connection = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The ekmConnection.
   */
  com.google.cloud.kms.v1.EkmConnection getEkmConnection();
  /**
   *
   *
   * <pre>
   * Required. [EkmConnection][google.cloud.kms.v1.EkmConnection] with updated
   * values.
   * </pre>
   *
   * <code>
   * .google.cloud.kms.v1.EkmConnection ekm_connection = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.kms.v1.EkmConnectionOrBuilder getEkmConnectionOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. List of fields to be updated in this request.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * Required. List of fields to be updated in this request.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * Required. List of fields to be updated in this request.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}