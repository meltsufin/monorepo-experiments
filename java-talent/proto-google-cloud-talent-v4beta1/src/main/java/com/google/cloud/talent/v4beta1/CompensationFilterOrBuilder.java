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
// source: google/cloud/talent/v4beta1/filters.proto

package com.google.cloud.talent.v4beta1;

public interface CompensationFilterOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.talent.v4beta1.CompensationFilter)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Type of filter.
   * </pre>
   *
   * <code>
   * .google.cloud.talent.v4beta1.CompensationFilter.FilterType type = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   *
   *
   * <pre>
   * Required. Type of filter.
   * </pre>
   *
   * <code>
   * .google.cloud.talent.v4beta1.CompensationFilter.FilterType type = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The type.
   */
  com.google.cloud.talent.v4beta1.CompensationFilter.FilterType getType();

  /**
   *
   *
   * <pre>
   * Required. Specify desired `base compensation entry's`
   * [CompensationInfo.CompensationUnit][google.cloud.talent.v4beta1.CompensationInfo.CompensationUnit].
   * </pre>
   *
   * <code>
   * repeated .google.cloud.talent.v4beta1.CompensationInfo.CompensationUnit units = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return A list containing the units.
   */
  java.util.List<com.google.cloud.talent.v4beta1.CompensationInfo.CompensationUnit> getUnitsList();
  /**
   *
   *
   * <pre>
   * Required. Specify desired `base compensation entry's`
   * [CompensationInfo.CompensationUnit][google.cloud.talent.v4beta1.CompensationInfo.CompensationUnit].
   * </pre>
   *
   * <code>
   * repeated .google.cloud.talent.v4beta1.CompensationInfo.CompensationUnit units = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The count of units.
   */
  int getUnitsCount();
  /**
   *
   *
   * <pre>
   * Required. Specify desired `base compensation entry's`
   * [CompensationInfo.CompensationUnit][google.cloud.talent.v4beta1.CompensationInfo.CompensationUnit].
   * </pre>
   *
   * <code>
   * repeated .google.cloud.talent.v4beta1.CompensationInfo.CompensationUnit units = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @param index The index of the element to return.
   * @return The units at the given index.
   */
  com.google.cloud.talent.v4beta1.CompensationInfo.CompensationUnit getUnits(int index);
  /**
   *
   *
   * <pre>
   * Required. Specify desired `base compensation entry's`
   * [CompensationInfo.CompensationUnit][google.cloud.talent.v4beta1.CompensationInfo.CompensationUnit].
   * </pre>
   *
   * <code>
   * repeated .google.cloud.talent.v4beta1.CompensationInfo.CompensationUnit units = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return A list containing the enum numeric values on the wire for units.
   */
  java.util.List<java.lang.Integer> getUnitsValueList();
  /**
   *
   *
   * <pre>
   * Required. Specify desired `base compensation entry's`
   * [CompensationInfo.CompensationUnit][google.cloud.talent.v4beta1.CompensationInfo.CompensationUnit].
   * </pre>
   *
   * <code>
   * repeated .google.cloud.talent.v4beta1.CompensationInfo.CompensationUnit units = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of units at the given index.
   */
  int getUnitsValue(int index);

  /**
   *
   *
   * <pre>
   * Compensation range.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.CompensationInfo.CompensationRange range = 3;</code>
   *
   * @return Whether the range field is set.
   */
  boolean hasRange();
  /**
   *
   *
   * <pre>
   * Compensation range.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.CompensationInfo.CompensationRange range = 3;</code>
   *
   * @return The range.
   */
  com.google.cloud.talent.v4beta1.CompensationInfo.CompensationRange getRange();
  /**
   *
   *
   * <pre>
   * Compensation range.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.CompensationInfo.CompensationRange range = 3;</code>
   */
  com.google.cloud.talent.v4beta1.CompensationInfo.CompensationRangeOrBuilder getRangeOrBuilder();

  /**
   *
   *
   * <pre>
   * If set to true, jobs with unspecified compensation range fields are
   * included.
   * </pre>
   *
   * <code>bool include_jobs_with_unspecified_compensation_range = 4;</code>
   *
   * @return The includeJobsWithUnspecifiedCompensationRange.
   */
  boolean getIncludeJobsWithUnspecifiedCompensationRange();
}
