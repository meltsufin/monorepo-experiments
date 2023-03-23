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
// source: google/cloud/notebooks/v1/service.proto

package com.google.cloud.notebooks.v1;

public interface CreateExecutionRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.notebooks.v1.CreateExecutionRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Format:
   * `parent=projects/{project_id}/locations/{location}`
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. Format:
   * `parent=projects/{project_id}/locations/{location}`
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. User-defined unique ID of this execution.
   * </pre>
   *
   * <code>string execution_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The executionId.
   */
  java.lang.String getExecutionId();
  /**
   *
   *
   * <pre>
   * Required. User-defined unique ID of this execution.
   * </pre>
   *
   * <code>string execution_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for executionId.
   */
  com.google.protobuf.ByteString getExecutionIdBytes();

  /**
   *
   *
   * <pre>
   * Required. The execution to be created.
   * </pre>
   *
   * <code>
   * .google.cloud.notebooks.v1.Execution execution = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the execution field is set.
   */
  boolean hasExecution();
  /**
   *
   *
   * <pre>
   * Required. The execution to be created.
   * </pre>
   *
   * <code>
   * .google.cloud.notebooks.v1.Execution execution = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The execution.
   */
  com.google.cloud.notebooks.v1.Execution getExecution();
  /**
   *
   *
   * <pre>
   * Required. The execution to be created.
   * </pre>
   *
   * <code>
   * .google.cloud.notebooks.v1.Execution execution = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.notebooks.v1.ExecutionOrBuilder getExecutionOrBuilder();
}
