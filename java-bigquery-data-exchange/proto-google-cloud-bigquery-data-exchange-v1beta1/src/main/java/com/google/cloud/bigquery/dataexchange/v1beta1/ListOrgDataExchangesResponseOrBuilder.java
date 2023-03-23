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
// source: google/cloud/bigquery/dataexchange/v1beta1/dataexchange.proto

package com.google.cloud.bigquery.dataexchange.v1beta1;

public interface ListOrgDataExchangesResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.bigquery.dataexchange.v1beta1.ListOrgDataExchangesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The list of data exchanges.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.dataexchange.v1beta1.DataExchange data_exchanges = 1;
   * </code>
   */
  java.util.List<com.google.cloud.bigquery.dataexchange.v1beta1.DataExchange>
      getDataExchangesList();
  /**
   *
   *
   * <pre>
   * The list of data exchanges.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.dataexchange.v1beta1.DataExchange data_exchanges = 1;
   * </code>
   */
  com.google.cloud.bigquery.dataexchange.v1beta1.DataExchange getDataExchanges(int index);
  /**
   *
   *
   * <pre>
   * The list of data exchanges.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.dataexchange.v1beta1.DataExchange data_exchanges = 1;
   * </code>
   */
  int getDataExchangesCount();
  /**
   *
   *
   * <pre>
   * The list of data exchanges.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.dataexchange.v1beta1.DataExchange data_exchanges = 1;
   * </code>
   */
  java.util.List<? extends com.google.cloud.bigquery.dataexchange.v1beta1.DataExchangeOrBuilder>
      getDataExchangesOrBuilderList();
  /**
   *
   *
   * <pre>
   * The list of data exchanges.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.dataexchange.v1beta1.DataExchange data_exchanges = 1;
   * </code>
   */
  com.google.cloud.bigquery.dataexchange.v1beta1.DataExchangeOrBuilder getDataExchangesOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * A token to request the next page of results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   *
   *
   * <pre>
   * A token to request the next page of results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
