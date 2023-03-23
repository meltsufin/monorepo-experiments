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
// source: google/cloud/datacatalog/v1/dataplex_spec.proto

package com.google.cloud.datacatalog.v1;

public interface DataplexTableSpecOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.v1.DataplexTableSpec)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * List of external tables registered by Dataplex in other systems based on
   * the same underlying data.
   * External tables allow to query this data in those systems.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.v1.DataplexExternalTable external_tables = 1;</code>
   */
  java.util.List<com.google.cloud.datacatalog.v1.DataplexExternalTable> getExternalTablesList();
  /**
   *
   *
   * <pre>
   * List of external tables registered by Dataplex in other systems based on
   * the same underlying data.
   * External tables allow to query this data in those systems.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.v1.DataplexExternalTable external_tables = 1;</code>
   */
  com.google.cloud.datacatalog.v1.DataplexExternalTable getExternalTables(int index);
  /**
   *
   *
   * <pre>
   * List of external tables registered by Dataplex in other systems based on
   * the same underlying data.
   * External tables allow to query this data in those systems.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.v1.DataplexExternalTable external_tables = 1;</code>
   */
  int getExternalTablesCount();
  /**
   *
   *
   * <pre>
   * List of external tables registered by Dataplex in other systems based on
   * the same underlying data.
   * External tables allow to query this data in those systems.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.v1.DataplexExternalTable external_tables = 1;</code>
   */
  java.util.List<? extends com.google.cloud.datacatalog.v1.DataplexExternalTableOrBuilder>
      getExternalTablesOrBuilderList();
  /**
   *
   *
   * <pre>
   * List of external tables registered by Dataplex in other systems based on
   * the same underlying data.
   * External tables allow to query this data in those systems.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.v1.DataplexExternalTable external_tables = 1;</code>
   */
  com.google.cloud.datacatalog.v1.DataplexExternalTableOrBuilder getExternalTablesOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Common Dataplex fields.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.DataplexSpec dataplex_spec = 2;</code>
   *
   * @return Whether the dataplexSpec field is set.
   */
  boolean hasDataplexSpec();
  /**
   *
   *
   * <pre>
   * Common Dataplex fields.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.DataplexSpec dataplex_spec = 2;</code>
   *
   * @return The dataplexSpec.
   */
  com.google.cloud.datacatalog.v1.DataplexSpec getDataplexSpec();
  /**
   *
   *
   * <pre>
   * Common Dataplex fields.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.DataplexSpec dataplex_spec = 2;</code>
   */
  com.google.cloud.datacatalog.v1.DataplexSpecOrBuilder getDataplexSpecOrBuilder();

  /**
   *
   *
   * <pre>
   * Indicates if the table schema is managed by the user or not.
   * </pre>
   *
   * <code>bool user_managed = 3;</code>
   *
   * @return The userManaged.
   */
  boolean getUserManaged();
}
