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
// source: google/cloud/gkemulticloud/v1/aws_service.proto

package com.google.cloud.gkemulticloud.v1;

public interface ListAwsClustersResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkemulticloud.v1.ListAwsClustersResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A list of [AwsCluster][google.cloud.gkemulticloud.v1.AwsCluster] resources in the specified GCP
   * project and region region.
   * </pre>
   *
   * <code>repeated .google.cloud.gkemulticloud.v1.AwsCluster aws_clusters = 1;</code>
   */
  java.util.List<com.google.cloud.gkemulticloud.v1.AwsCluster> getAwsClustersList();
  /**
   *
   *
   * <pre>
   * A list of [AwsCluster][google.cloud.gkemulticloud.v1.AwsCluster] resources in the specified GCP
   * project and region region.
   * </pre>
   *
   * <code>repeated .google.cloud.gkemulticloud.v1.AwsCluster aws_clusters = 1;</code>
   */
  com.google.cloud.gkemulticloud.v1.AwsCluster getAwsClusters(int index);
  /**
   *
   *
   * <pre>
   * A list of [AwsCluster][google.cloud.gkemulticloud.v1.AwsCluster] resources in the specified GCP
   * project and region region.
   * </pre>
   *
   * <code>repeated .google.cloud.gkemulticloud.v1.AwsCluster aws_clusters = 1;</code>
   */
  int getAwsClustersCount();
  /**
   *
   *
   * <pre>
   * A list of [AwsCluster][google.cloud.gkemulticloud.v1.AwsCluster] resources in the specified GCP
   * project and region region.
   * </pre>
   *
   * <code>repeated .google.cloud.gkemulticloud.v1.AwsCluster aws_clusters = 1;</code>
   */
  java.util.List<? extends com.google.cloud.gkemulticloud.v1.AwsClusterOrBuilder>
      getAwsClustersOrBuilderList();
  /**
   *
   *
   * <pre>
   * A list of [AwsCluster][google.cloud.gkemulticloud.v1.AwsCluster] resources in the specified GCP
   * project and region region.
   * </pre>
   *
   * <code>repeated .google.cloud.gkemulticloud.v1.AwsCluster aws_clusters = 1;</code>
   */
  com.google.cloud.gkemulticloud.v1.AwsClusterOrBuilder getAwsClustersOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Token to retrieve the next page of results, or empty if there are no more
   * results in the list.
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
   * Token to retrieve the next page of results, or empty if there are no more
   * results in the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
