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
// source: google/cloud/binaryauthorization/v1beta1/service.proto

package com.google.cloud.binaryauthorization.v1beta1;

public interface UpdatePolicyRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.binaryauthorization.v1beta1.UpdatePolicyRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. A new or updated [policy][google.cloud.binaryauthorization.v1beta1.Policy] value. The service will
   * overwrite the [policy name][google.cloud.binaryauthorization.v1beta1.Policy.name] field with the resource name in
   * the request URL, in the format `projects/&#42;&#47;policy`.
   * </pre>
   *
   * <code>
   * .google.cloud.binaryauthorization.v1beta1.Policy policy = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the policy field is set.
   */
  boolean hasPolicy();
  /**
   *
   *
   * <pre>
   * Required. A new or updated [policy][google.cloud.binaryauthorization.v1beta1.Policy] value. The service will
   * overwrite the [policy name][google.cloud.binaryauthorization.v1beta1.Policy.name] field with the resource name in
   * the request URL, in the format `projects/&#42;&#47;policy`.
   * </pre>
   *
   * <code>
   * .google.cloud.binaryauthorization.v1beta1.Policy policy = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The policy.
   */
  com.google.cloud.binaryauthorization.v1beta1.Policy getPolicy();
  /**
   *
   *
   * <pre>
   * Required. A new or updated [policy][google.cloud.binaryauthorization.v1beta1.Policy] value. The service will
   * overwrite the [policy name][google.cloud.binaryauthorization.v1beta1.Policy.name] field with the resource name in
   * the request URL, in the format `projects/&#42;&#47;policy`.
   * </pre>
   *
   * <code>
   * .google.cloud.binaryauthorization.v1beta1.Policy policy = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.binaryauthorization.v1beta1.PolicyOrBuilder getPolicyOrBuilder();
}
