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
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

public interface SubnetworkLogConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.SubnetworkLogConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Can only be specified if VPC flow logging for this subnetwork is enabled. Toggles the aggregation interval for collecting flow logs. Increasing the interval time will reduce the amount of generated flow logs for long lasting connections. Default is an interval of 5 seconds per connection.
   * </pre>
   *
   * <code>
   * .google.cloud.compute.v1.SubnetworkLogConfig.AggregationInterval aggregation_interval = 174919042;
   * </code>
   *
   * @return Whether the aggregationInterval field is set.
   */
  boolean hasAggregationInterval();
  /**
   *
   *
   * <pre>
   * Can only be specified if VPC flow logging for this subnetwork is enabled. Toggles the aggregation interval for collecting flow logs. Increasing the interval time will reduce the amount of generated flow logs for long lasting connections. Default is an interval of 5 seconds per connection.
   * </pre>
   *
   * <code>
   * .google.cloud.compute.v1.SubnetworkLogConfig.AggregationInterval aggregation_interval = 174919042;
   * </code>
   *
   * @return The enum numeric value on the wire for aggregationInterval.
   */
  int getAggregationIntervalValue();
  /**
   *
   *
   * <pre>
   * Can only be specified if VPC flow logging for this subnetwork is enabled. Toggles the aggregation interval for collecting flow logs. Increasing the interval time will reduce the amount of generated flow logs for long lasting connections. Default is an interval of 5 seconds per connection.
   * </pre>
   *
   * <code>
   * .google.cloud.compute.v1.SubnetworkLogConfig.AggregationInterval aggregation_interval = 174919042;
   * </code>
   *
   * @return The aggregationInterval.
   */
  com.google.cloud.compute.v1.SubnetworkLogConfig.AggregationInterval getAggregationInterval();

  /**
   *
   *
   * <pre>
   * Whether to enable flow logging for this subnetwork. If this field is not explicitly set, it will not appear in get listings. If not set the default behavior is to disable flow logging.
   * </pre>
   *
   * <code>bool enable = 311764355;</code>
   *
   * @return Whether the enable field is set.
   */
  boolean hasEnable();
  /**
   *
   *
   * <pre>
   * Whether to enable flow logging for this subnetwork. If this field is not explicitly set, it will not appear in get listings. If not set the default behavior is to disable flow logging.
   * </pre>
   *
   * <code>bool enable = 311764355;</code>
   *
   * @return The enable.
   */
  boolean getEnable();

  /**
   *
   *
   * <pre>
   * Can only be specified if VPC flow logs for this subnetwork is enabled. Export filter used to define which VPC flow logs should be logged.
   * </pre>
   *
   * <code>string filter_expr = 183374428;</code>
   *
   * @return Whether the filterExpr field is set.
   */
  boolean hasFilterExpr();
  /**
   *
   *
   * <pre>
   * Can only be specified if VPC flow logs for this subnetwork is enabled. Export filter used to define which VPC flow logs should be logged.
   * </pre>
   *
   * <code>string filter_expr = 183374428;</code>
   *
   * @return The filterExpr.
   */
  java.lang.String getFilterExpr();
  /**
   *
   *
   * <pre>
   * Can only be specified if VPC flow logs for this subnetwork is enabled. Export filter used to define which VPC flow logs should be logged.
   * </pre>
   *
   * <code>string filter_expr = 183374428;</code>
   *
   * @return The bytes for filterExpr.
   */
  com.google.protobuf.ByteString getFilterExprBytes();

  /**
   *
   *
   * <pre>
   * Can only be specified if VPC flow logging for this subnetwork is enabled. The value of the field must be in [0, 1]. Set the sampling rate of VPC flow logs within the subnetwork where 1.0 means all collected logs are reported and 0.0 means no logs are reported. Default is 0.5, which means half of all collected logs are reported.
   * </pre>
   *
   * <code>float flow_sampling = 530150360;</code>
   *
   * @return Whether the flowSampling field is set.
   */
  boolean hasFlowSampling();
  /**
   *
   *
   * <pre>
   * Can only be specified if VPC flow logging for this subnetwork is enabled. The value of the field must be in [0, 1]. Set the sampling rate of VPC flow logs within the subnetwork where 1.0 means all collected logs are reported and 0.0 means no logs are reported. Default is 0.5, which means half of all collected logs are reported.
   * </pre>
   *
   * <code>float flow_sampling = 530150360;</code>
   *
   * @return The flowSampling.
   */
  float getFlowSampling();

  /**
   *
   *
   * <pre>
   * Can only be specified if VPC flow logs for this subnetwork is enabled. Configures whether all, none or a subset of metadata fields should be added to the reported VPC flow logs. Default is EXCLUDE_ALL_METADATA.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.SubnetworkLogConfig.Metadata metadata = 86866735;</code>
   *
   * @return Whether the metadata field is set.
   */
  boolean hasMetadata();
  /**
   *
   *
   * <pre>
   * Can only be specified if VPC flow logs for this subnetwork is enabled. Configures whether all, none or a subset of metadata fields should be added to the reported VPC flow logs. Default is EXCLUDE_ALL_METADATA.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.SubnetworkLogConfig.Metadata metadata = 86866735;</code>
   *
   * @return The enum numeric value on the wire for metadata.
   */
  int getMetadataValue();
  /**
   *
   *
   * <pre>
   * Can only be specified if VPC flow logs for this subnetwork is enabled. Configures whether all, none or a subset of metadata fields should be added to the reported VPC flow logs. Default is EXCLUDE_ALL_METADATA.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.SubnetworkLogConfig.Metadata metadata = 86866735;</code>
   *
   * @return The metadata.
   */
  com.google.cloud.compute.v1.SubnetworkLogConfig.Metadata getMetadata();

  /**
   *
   *
   * <pre>
   * Can only be specified if VPC flow logs for this subnetwork is enabled and "metadata" was set to CUSTOM_METADATA.
   * </pre>
   *
   * <code>repeated string metadata_fields = 378461641;</code>
   *
   * @return A list containing the metadataFields.
   */
  java.util.List<java.lang.String> getMetadataFieldsList();
  /**
   *
   *
   * <pre>
   * Can only be specified if VPC flow logs for this subnetwork is enabled and "metadata" was set to CUSTOM_METADATA.
   * </pre>
   *
   * <code>repeated string metadata_fields = 378461641;</code>
   *
   * @return The count of metadataFields.
   */
  int getMetadataFieldsCount();
  /**
   *
   *
   * <pre>
   * Can only be specified if VPC flow logs for this subnetwork is enabled and "metadata" was set to CUSTOM_METADATA.
   * </pre>
   *
   * <code>repeated string metadata_fields = 378461641;</code>
   *
   * @param index The index of the element to return.
   * @return The metadataFields at the given index.
   */
  java.lang.String getMetadataFields(int index);
  /**
   *
   *
   * <pre>
   * Can only be specified if VPC flow logs for this subnetwork is enabled and "metadata" was set to CUSTOM_METADATA.
   * </pre>
   *
   * <code>repeated string metadata_fields = 378461641;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the metadataFields at the given index.
   */
  com.google.protobuf.ByteString getMetadataFieldsBytes(int index);
}
