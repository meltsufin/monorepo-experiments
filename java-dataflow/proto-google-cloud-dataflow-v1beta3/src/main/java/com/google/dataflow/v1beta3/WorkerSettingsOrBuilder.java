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
// source: google/dataflow/v1beta3/environment.proto

package com.google.dataflow.v1beta3;

public interface WorkerSettingsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.dataflow.v1beta3.WorkerSettings)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The base URL for accessing Google Cloud APIs.
   * When workers access Google Cloud APIs, they logically do so via
   * relative URLs.  If this field is specified, it supplies the base
   * URL to use for resolving these relative URLs.  The normative
   * algorithm used is defined by RFC 1808, "Relative Uniform Resource
   * Locators".
   * If not specified, the default value is "http://www.googleapis.com/"
   * </pre>
   *
   * <code>string base_url = 1;</code>
   *
   * @return The baseUrl.
   */
  java.lang.String getBaseUrl();
  /**
   *
   *
   * <pre>
   * The base URL for accessing Google Cloud APIs.
   * When workers access Google Cloud APIs, they logically do so via
   * relative URLs.  If this field is specified, it supplies the base
   * URL to use for resolving these relative URLs.  The normative
   * algorithm used is defined by RFC 1808, "Relative Uniform Resource
   * Locators".
   * If not specified, the default value is "http://www.googleapis.com/"
   * </pre>
   *
   * <code>string base_url = 1;</code>
   *
   * @return The bytes for baseUrl.
   */
  com.google.protobuf.ByteString getBaseUrlBytes();

  /**
   *
   *
   * <pre>
   * Whether to send work progress updates to the service.
   * </pre>
   *
   * <code>bool reporting_enabled = 2;</code>
   *
   * @return The reportingEnabled.
   */
  boolean getReportingEnabled();

  /**
   *
   *
   * <pre>
   * The Cloud Dataflow service path relative to the root URL, for example,
   * "dataflow/v1b3/projects".
   * </pre>
   *
   * <code>string service_path = 3;</code>
   *
   * @return The servicePath.
   */
  java.lang.String getServicePath();
  /**
   *
   *
   * <pre>
   * The Cloud Dataflow service path relative to the root URL, for example,
   * "dataflow/v1b3/projects".
   * </pre>
   *
   * <code>string service_path = 3;</code>
   *
   * @return The bytes for servicePath.
   */
  com.google.protobuf.ByteString getServicePathBytes();

  /**
   *
   *
   * <pre>
   * The Shuffle service path relative to the root URL, for example,
   * "shuffle/v1beta1".
   * </pre>
   *
   * <code>string shuffle_service_path = 4;</code>
   *
   * @return The shuffleServicePath.
   */
  java.lang.String getShuffleServicePath();
  /**
   *
   *
   * <pre>
   * The Shuffle service path relative to the root URL, for example,
   * "shuffle/v1beta1".
   * </pre>
   *
   * <code>string shuffle_service_path = 4;</code>
   *
   * @return The bytes for shuffleServicePath.
   */
  com.google.protobuf.ByteString getShuffleServicePathBytes();

  /**
   *
   *
   * <pre>
   * The ID of the worker running this pipeline.
   * </pre>
   *
   * <code>string worker_id = 5;</code>
   *
   * @return The workerId.
   */
  java.lang.String getWorkerId();
  /**
   *
   *
   * <pre>
   * The ID of the worker running this pipeline.
   * </pre>
   *
   * <code>string worker_id = 5;</code>
   *
   * @return The bytes for workerId.
   */
  com.google.protobuf.ByteString getWorkerIdBytes();

  /**
   *
   *
   * <pre>
   * The prefix of the resources the system should use for temporary
   * storage.
   * The supported resource type is:
   * Google Cloud Storage:
   *   storage.googleapis.com/{bucket}/{object}
   *   bucket.storage.googleapis.com/{object}
   * </pre>
   *
   * <code>string temp_storage_prefix = 6;</code>
   *
   * @return The tempStoragePrefix.
   */
  java.lang.String getTempStoragePrefix();
  /**
   *
   *
   * <pre>
   * The prefix of the resources the system should use for temporary
   * storage.
   * The supported resource type is:
   * Google Cloud Storage:
   *   storage.googleapis.com/{bucket}/{object}
   *   bucket.storage.googleapis.com/{object}
   * </pre>
   *
   * <code>string temp_storage_prefix = 6;</code>
   *
   * @return The bytes for tempStoragePrefix.
   */
  com.google.protobuf.ByteString getTempStoragePrefixBytes();
}
