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
// source: google/cloud/recaptchaenterprise/v1/recaptchaenterprise.proto

package com.google.recaptchaenterprise.v1;

public interface UpdateKeyRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.recaptchaenterprise.v1.UpdateKeyRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The key to update.
   * </pre>
   *
   * <code>
   * .google.cloud.recaptchaenterprise.v1.Key key = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the key field is set.
   */
  boolean hasKey();
  /**
   *
   *
   * <pre>
   * Required. The key to update.
   * </pre>
   *
   * <code>
   * .google.cloud.recaptchaenterprise.v1.Key key = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The key.
   */
  com.google.recaptchaenterprise.v1.Key getKey();
  /**
   *
   *
   * <pre>
   * Required. The key to update.
   * </pre>
   *
   * <code>
   * .google.cloud.recaptchaenterprise.v1.Key key = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.recaptchaenterprise.v1.KeyOrBuilder getKeyOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The mask to control which fields of the key get updated. If the mask is not
   * present, all fields will be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * Optional. The mask to control which fields of the key get updated. If the mask is not
   * present, all fields will be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * Optional. The mask to control which fields of the key get updated. If the mask is not
   * present, all fields will be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
