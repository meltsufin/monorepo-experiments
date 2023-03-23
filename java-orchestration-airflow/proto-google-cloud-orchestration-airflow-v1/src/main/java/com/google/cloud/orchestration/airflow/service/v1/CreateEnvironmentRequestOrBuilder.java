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
// source: google/cloud/orchestration/airflow/service/v1/environments.proto

package com.google.cloud.orchestration.airflow.service.v1;

public interface CreateEnvironmentRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.orchestration.airflow.service.v1.CreateEnvironmentRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The parent must be of the form
   * "projects/{projectId}/locations/{locationId}".
   * </pre>
   *
   * <code>string parent = 1;</code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * The parent must be of the form
   * "projects/{projectId}/locations/{locationId}".
   * </pre>
   *
   * <code>string parent = 1;</code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * The environment to create.
   * </pre>
   *
   * <code>.google.cloud.orchestration.airflow.service.v1.Environment environment = 2;</code>
   *
   * @return Whether the environment field is set.
   */
  boolean hasEnvironment();
  /**
   *
   *
   * <pre>
   * The environment to create.
   * </pre>
   *
   * <code>.google.cloud.orchestration.airflow.service.v1.Environment environment = 2;</code>
   *
   * @return The environment.
   */
  com.google.cloud.orchestration.airflow.service.v1.Environment getEnvironment();
  /**
   *
   *
   * <pre>
   * The environment to create.
   * </pre>
   *
   * <code>.google.cloud.orchestration.airflow.service.v1.Environment environment = 2;</code>
   */
  com.google.cloud.orchestration.airflow.service.v1.EnvironmentOrBuilder getEnvironmentOrBuilder();
}
