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
// source: google/cloud/gkebackup/v1/gkebackup.proto

package com.google.cloud.gkebackup.v1;

public interface CreateBackupPlanRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkebackup.v1.CreateBackupPlanRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The location within which to create the BackupPlan.
   * Format: projects/&#42;&#47;locations/&#42;
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The location within which to create the BackupPlan.
   * Format: projects/&#42;&#47;locations/&#42;
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. The BackupPlan resource object to create.
   * </pre>
   *
   * <code>
   * .google.cloud.gkebackup.v1.BackupPlan backup_plan = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the backupPlan field is set.
   */
  boolean hasBackupPlan();
  /**
   *
   *
   * <pre>
   * Required. The BackupPlan resource object to create.
   * </pre>
   *
   * <code>
   * .google.cloud.gkebackup.v1.BackupPlan backup_plan = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The backupPlan.
   */
  com.google.cloud.gkebackup.v1.BackupPlan getBackupPlan();
  /**
   *
   *
   * <pre>
   * Required. The BackupPlan resource object to create.
   * </pre>
   *
   * <code>
   * .google.cloud.gkebackup.v1.BackupPlan backup_plan = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.gkebackup.v1.BackupPlanOrBuilder getBackupPlanOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The client-provided short name for the BackupPlan resource.
   * This name must:
   * - be between 1 and 63 characters long (inclusive)
   * - consist of only lower-case ASCII letters, numbers, and dashes
   * - start with a lower-case letter
   * - end with a lower-case letter or number
   * - be unique within the set of BackupPlans in this location
   * </pre>
   *
   * <code>string backup_plan_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The backupPlanId.
   */
  java.lang.String getBackupPlanId();
  /**
   *
   *
   * <pre>
   * Required. The client-provided short name for the BackupPlan resource.
   * This name must:
   * - be between 1 and 63 characters long (inclusive)
   * - consist of only lower-case ASCII letters, numbers, and dashes
   * - start with a lower-case letter
   * - end with a lower-case letter or number
   * - be unique within the set of BackupPlans in this location
   * </pre>
   *
   * <code>string backup_plan_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for backupPlanId.
   */
  com.google.protobuf.ByteString getBackupPlanIdBytes();
}
