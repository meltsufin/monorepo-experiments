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
// source: google/devtools/artifactregistry/v1beta2/file.proto

package com.google.devtools.artifactregistry.v1beta2;

public interface HashOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.devtools.artifactregistry.v1beta2.Hash)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The algorithm used to compute the hash value.
   * </pre>
   *
   * <code>.google.devtools.artifactregistry.v1beta2.Hash.HashType type = 1;</code>
   *
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   *
   *
   * <pre>
   * The algorithm used to compute the hash value.
   * </pre>
   *
   * <code>.google.devtools.artifactregistry.v1beta2.Hash.HashType type = 1;</code>
   *
   * @return The type.
   */
  com.google.devtools.artifactregistry.v1beta2.Hash.HashType getType();

  /**
   *
   *
   * <pre>
   * The hash value.
   * </pre>
   *
   * <code>bytes value = 2;</code>
   *
   * @return The value.
   */
  com.google.protobuf.ByteString getValue();
}
