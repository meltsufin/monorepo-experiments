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
// source: google/cloud/aiplatform/v1/model_service.proto

package com.google.cloud.aiplatform.v1;

public interface MergeVersionAliasesRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.MergeVersionAliasesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the model version to merge aliases, with a version ID
   * explicitly included.
   * Example: `projects/{project}/locations/{location}/models/{model}&#64;1234`
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. The name of the model version to merge aliases, with a version ID
   * explicitly included.
   * Example: `projects/{project}/locations/{location}/models/{model}&#64;1234`
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required. The set of version aliases to merge.
   * The alias should be at most 128 characters, and match
   * `[a-z][a-zA-Z0-9-]{0,126}[a-z-0-9]`.
   * Add the `-` prefix to an alias means removing that alias from the version.
   * `-` is NOT counted in the 128 characters. Example: `-golden` means removing
   * the `golden` alias from the version.
   * There is NO ordering in aliases, which means
   * 1) The aliases returned from GetModel API might not have the exactly same
   * order from this MergeVersionAliases API. 2) Adding and deleting the same
   * alias in the request is not recommended, and the 2 operations will be
   * cancelled out.
   * </pre>
   *
   * <code>repeated string version_aliases = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return A list containing the versionAliases.
   */
  java.util.List<java.lang.String> getVersionAliasesList();
  /**
   *
   *
   * <pre>
   * Required. The set of version aliases to merge.
   * The alias should be at most 128 characters, and match
   * `[a-z][a-zA-Z0-9-]{0,126}[a-z-0-9]`.
   * Add the `-` prefix to an alias means removing that alias from the version.
   * `-` is NOT counted in the 128 characters. Example: `-golden` means removing
   * the `golden` alias from the version.
   * There is NO ordering in aliases, which means
   * 1) The aliases returned from GetModel API might not have the exactly same
   * order from this MergeVersionAliases API. 2) Adding and deleting the same
   * alias in the request is not recommended, and the 2 operations will be
   * cancelled out.
   * </pre>
   *
   * <code>repeated string version_aliases = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The count of versionAliases.
   */
  int getVersionAliasesCount();
  /**
   *
   *
   * <pre>
   * Required. The set of version aliases to merge.
   * The alias should be at most 128 characters, and match
   * `[a-z][a-zA-Z0-9-]{0,126}[a-z-0-9]`.
   * Add the `-` prefix to an alias means removing that alias from the version.
   * `-` is NOT counted in the 128 characters. Example: `-golden` means removing
   * the `golden` alias from the version.
   * There is NO ordering in aliases, which means
   * 1) The aliases returned from GetModel API might not have the exactly same
   * order from this MergeVersionAliases API. 2) Adding and deleting the same
   * alias in the request is not recommended, and the 2 operations will be
   * cancelled out.
   * </pre>
   *
   * <code>repeated string version_aliases = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @param index The index of the element to return.
   * @return The versionAliases at the given index.
   */
  java.lang.String getVersionAliases(int index);
  /**
   *
   *
   * <pre>
   * Required. The set of version aliases to merge.
   * The alias should be at most 128 characters, and match
   * `[a-z][a-zA-Z0-9-]{0,126}[a-z-0-9]`.
   * Add the `-` prefix to an alias means removing that alias from the version.
   * `-` is NOT counted in the 128 characters. Example: `-golden` means removing
   * the `golden` alias from the version.
   * There is NO ordering in aliases, which means
   * 1) The aliases returned from GetModel API might not have the exactly same
   * order from this MergeVersionAliases API. 2) Adding and deleting the same
   * alias in the request is not recommended, and the 2 operations will be
   * cancelled out.
   * </pre>
   *
   * <code>repeated string version_aliases = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the versionAliases at the given index.
   */
  com.google.protobuf.ByteString getVersionAliasesBytes(int index);
}
