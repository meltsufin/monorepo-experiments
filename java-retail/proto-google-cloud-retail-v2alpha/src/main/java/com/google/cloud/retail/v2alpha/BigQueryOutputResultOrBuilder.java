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
// source: google/cloud/retail/v2alpha/export_config.proto

package com.google.cloud.retail.v2alpha;

public interface BigQueryOutputResultOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.retail.v2alpha.BigQueryOutputResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The ID of a BigQuery Dataset.
   * </pre>
   *
   * <code>string dataset_id = 1;</code>
   *
   * @return The datasetId.
   */
  java.lang.String getDatasetId();
  /**
   *
   *
   * <pre>
   * The ID of a BigQuery Dataset.
   * </pre>
   *
   * <code>string dataset_id = 1;</code>
   *
   * @return The bytes for datasetId.
   */
  com.google.protobuf.ByteString getDatasetIdBytes();

  /**
   *
   *
   * <pre>
   * The ID of a BigQuery Table.
   * </pre>
   *
   * <code>string table_id = 2;</code>
   *
   * @return The tableId.
   */
  java.lang.String getTableId();
  /**
   *
   *
   * <pre>
   * The ID of a BigQuery Table.
   * </pre>
   *
   * <code>string table_id = 2;</code>
   *
   * @return The bytes for tableId.
   */
  com.google.protobuf.ByteString getTableIdBytes();
}