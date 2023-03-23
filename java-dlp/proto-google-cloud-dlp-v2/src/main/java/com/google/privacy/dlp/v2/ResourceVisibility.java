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
// source: google/privacy/dlp/v2/dlp.proto

package com.google.privacy.dlp.v2;

/**
 *
 *
 * <pre>
 * How broadly a resource has been shared. New items may be added over time.
 * A higher number means more restricted.
 * </pre>
 *
 * Protobuf enum {@code google.privacy.dlp.v2.ResourceVisibility}
 */
public enum ResourceVisibility implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Unused.
   * </pre>
   *
   * <code>RESOURCE_VISIBILITY_UNSPECIFIED = 0;</code>
   */
  RESOURCE_VISIBILITY_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * Visible to any user.
   * </pre>
   *
   * <code>RESOURCE_VISIBILITY_PUBLIC = 10;</code>
   */
  RESOURCE_VISIBILITY_PUBLIC(10),
  /**
   *
   *
   * <pre>
   * Visible only to specific users.
   * </pre>
   *
   * <code>RESOURCE_VISIBILITY_RESTRICTED = 20;</code>
   */
  RESOURCE_VISIBILITY_RESTRICTED(20),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Unused.
   * </pre>
   *
   * <code>RESOURCE_VISIBILITY_UNSPECIFIED = 0;</code>
   */
  public static final int RESOURCE_VISIBILITY_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * Visible to any user.
   * </pre>
   *
   * <code>RESOURCE_VISIBILITY_PUBLIC = 10;</code>
   */
  public static final int RESOURCE_VISIBILITY_PUBLIC_VALUE = 10;
  /**
   *
   *
   * <pre>
   * Visible only to specific users.
   * </pre>
   *
   * <code>RESOURCE_VISIBILITY_RESTRICTED = 20;</code>
   */
  public static final int RESOURCE_VISIBILITY_RESTRICTED_VALUE = 20;

  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static ResourceVisibility valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ResourceVisibility forNumber(int value) {
    switch (value) {
      case 0:
        return RESOURCE_VISIBILITY_UNSPECIFIED;
      case 10:
        return RESOURCE_VISIBILITY_PUBLIC;
      case 20:
        return RESOURCE_VISIBILITY_RESTRICTED;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ResourceVisibility> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<ResourceVisibility>
      internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ResourceVisibility>() {
            public ResourceVisibility findValueByNumber(int number) {
              return ResourceVisibility.forNumber(number);
            }
          };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }

  public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
    return getDescriptor();
  }

  public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
    return com.google.privacy.dlp.v2.DlpProto.getDescriptor().getEnumTypes().get(10);
  }

  private static final ResourceVisibility[] VALUES = values();

  public static ResourceVisibility valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private ResourceVisibility(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.privacy.dlp.v2.ResourceVisibility)
}
