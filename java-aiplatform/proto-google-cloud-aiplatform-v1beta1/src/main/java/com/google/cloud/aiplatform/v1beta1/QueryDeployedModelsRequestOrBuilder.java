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
// source: google/cloud/aiplatform/v1beta1/deployment_resource_pool_service.proto

package com.google.cloud.aiplatform.v1beta1;

public interface QueryDeployedModelsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.QueryDeployedModelsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the target DeploymentResourcePool to query.
   * Format:
   * `projects/{project}/locations/{location}/deploymentResourcePools/{deployment_resource_pool}`
   * </pre>
   *
   * <code>string deployment_resource_pool = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The deploymentResourcePool.
   */
  java.lang.String getDeploymentResourcePool();
  /**
   *
   *
   * <pre>
   * Required. The name of the target DeploymentResourcePool to query.
   * Format:
   * `projects/{project}/locations/{location}/deploymentResourcePools/{deployment_resource_pool}`
   * </pre>
   *
   * <code>string deployment_resource_pool = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for deploymentResourcePool.
   */
  com.google.protobuf.ByteString getDeploymentResourcePoolBytes();

  /**
   *
   *
   * <pre>
   * The maximum number of DeployedModels to return. The service may return
   * fewer than this value.
   * </pre>
   *
   * <code>int32 page_size = 2;</code>
   *
   * @return The pageSize.
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * A page token, received from a previous `QueryDeployedModels` call.
   * Provide this to retrieve the subsequent page.
   * When paginating, all other parameters provided to
   * `QueryDeployedModels` must match the call that provided the page
   * token.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   *
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * A page token, received from a previous `QueryDeployedModels` call.
   * Provide this to retrieve the subsequent page.
   * When paginating, all other parameters provided to
   * `QueryDeployedModels` must match the call that provided the page
   * token.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();
}