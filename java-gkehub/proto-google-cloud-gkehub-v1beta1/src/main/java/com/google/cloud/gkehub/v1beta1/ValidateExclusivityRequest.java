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
// source: google/cloud/gkehub/v1beta1/membership.proto

package com.google.cloud.gkehub.v1beta1;

/**
 *
 *
 * <pre>
 * The request to validate the existing state of the membership CR in the
 * cluster.
 * </pre>
 *
 * Protobuf type {@code google.cloud.gkehub.v1beta1.ValidateExclusivityRequest}
 */
public final class ValidateExclusivityRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.gkehub.v1beta1.ValidateExclusivityRequest)
    ValidateExclusivityRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ValidateExclusivityRequest.newBuilder() to construct.
  private ValidateExclusivityRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ValidateExclusivityRequest() {
    parent_ = "";
    crManifest_ = "";
    intendedMembership_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ValidateExclusivityRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.gkehub.v1beta1.MembershipOuterClass
        .internal_static_google_cloud_gkehub_v1beta1_ValidateExclusivityRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.gkehub.v1beta1.MembershipOuterClass
        .internal_static_google_cloud_gkehub_v1beta1_ValidateExclusivityRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.gkehub.v1beta1.ValidateExclusivityRequest.class,
            com.google.cloud.gkehub.v1beta1.ValidateExclusivityRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   *
   *
   * <pre>
   * Required. The parent (project and location) where the Memberships will be created.
   * Specified in the format `projects/&#42;&#47;locations/&#42;`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The parent (project and location) where the Memberships will be created.
   * Specified in the format `projects/&#42;&#47;locations/&#42;`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CR_MANIFEST_FIELD_NUMBER = 2;
  private volatile java.lang.Object crManifest_;
  /**
   *
   *
   * <pre>
   * Optional. The YAML of the membership CR in the cluster. Empty if the membership
   * CR does not exist.
   * </pre>
   *
   * <code>string cr_manifest = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The crManifest.
   */
  @java.lang.Override
  public java.lang.String getCrManifest() {
    java.lang.Object ref = crManifest_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      crManifest_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Optional. The YAML of the membership CR in the cluster. Empty if the membership
   * CR does not exist.
   * </pre>
   *
   * <code>string cr_manifest = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for crManifest.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getCrManifestBytes() {
    java.lang.Object ref = crManifest_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      crManifest_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int INTENDED_MEMBERSHIP_FIELD_NUMBER = 3;
  private volatile java.lang.Object intendedMembership_;
  /**
   *
   *
   * <pre>
   * Required. The intended membership name under the `parent`. This method only does
   * validation in anticipation of a CreateMembership call with the same name.
   * </pre>
   *
   * <code>string intended_membership = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The intendedMembership.
   */
  @java.lang.Override
  public java.lang.String getIntendedMembership() {
    java.lang.Object ref = intendedMembership_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      intendedMembership_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The intended membership name under the `parent`. This method only does
   * validation in anticipation of a CreateMembership call with the same name.
   * </pre>
   *
   * <code>string intended_membership = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for intendedMembership.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getIntendedMembershipBytes() {
    java.lang.Object ref = intendedMembership_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      intendedMembership_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(crManifest_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, crManifest_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(intendedMembership_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, intendedMembership_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(crManifest_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, crManifest_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(intendedMembership_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, intendedMembership_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.gkehub.v1beta1.ValidateExclusivityRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.gkehub.v1beta1.ValidateExclusivityRequest other =
        (com.google.cloud.gkehub.v1beta1.ValidateExclusivityRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (!getCrManifest().equals(other.getCrManifest())) return false;
    if (!getIntendedMembership().equals(other.getIntendedMembership())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    hash = (37 * hash) + CR_MANIFEST_FIELD_NUMBER;
    hash = (53 * hash) + getCrManifest().hashCode();
    hash = (37 * hash) + INTENDED_MEMBERSHIP_FIELD_NUMBER;
    hash = (53 * hash) + getIntendedMembership().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.gkehub.v1beta1.ValidateExclusivityRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkehub.v1beta1.ValidateExclusivityRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkehub.v1beta1.ValidateExclusivityRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkehub.v1beta1.ValidateExclusivityRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkehub.v1beta1.ValidateExclusivityRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkehub.v1beta1.ValidateExclusivityRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkehub.v1beta1.ValidateExclusivityRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkehub.v1beta1.ValidateExclusivityRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gkehub.v1beta1.ValidateExclusivityRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkehub.v1beta1.ValidateExclusivityRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gkehub.v1beta1.ValidateExclusivityRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkehub.v1beta1.ValidateExclusivityRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.cloud.gkehub.v1beta1.ValidateExclusivityRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * The request to validate the existing state of the membership CR in the
   * cluster.
   * </pre>
   *
   * Protobuf type {@code google.cloud.gkehub.v1beta1.ValidateExclusivityRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.gkehub.v1beta1.ValidateExclusivityRequest)
      com.google.cloud.gkehub.v1beta1.ValidateExclusivityRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.gkehub.v1beta1.MembershipOuterClass
          .internal_static_google_cloud_gkehub_v1beta1_ValidateExclusivityRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.gkehub.v1beta1.MembershipOuterClass
          .internal_static_google_cloud_gkehub_v1beta1_ValidateExclusivityRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.gkehub.v1beta1.ValidateExclusivityRequest.class,
              com.google.cloud.gkehub.v1beta1.ValidateExclusivityRequest.Builder.class);
    }

    // Construct using com.google.cloud.gkehub.v1beta1.ValidateExclusivityRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      parent_ = "";

      crManifest_ = "";

      intendedMembership_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.gkehub.v1beta1.MembershipOuterClass
          .internal_static_google_cloud_gkehub_v1beta1_ValidateExclusivityRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.gkehub.v1beta1.ValidateExclusivityRequest getDefaultInstanceForType() {
      return com.google.cloud.gkehub.v1beta1.ValidateExclusivityRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.gkehub.v1beta1.ValidateExclusivityRequest build() {
      com.google.cloud.gkehub.v1beta1.ValidateExclusivityRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.gkehub.v1beta1.ValidateExclusivityRequest buildPartial() {
      com.google.cloud.gkehub.v1beta1.ValidateExclusivityRequest result =
          new com.google.cloud.gkehub.v1beta1.ValidateExclusivityRequest(this);
      result.parent_ = parent_;
      result.crManifest_ = crManifest_;
      result.intendedMembership_ = intendedMembership_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.gkehub.v1beta1.ValidateExclusivityRequest) {
        return mergeFrom((com.google.cloud.gkehub.v1beta1.ValidateExclusivityRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.gkehub.v1beta1.ValidateExclusivityRequest other) {
      if (other == com.google.cloud.gkehub.v1beta1.ValidateExclusivityRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (!other.getCrManifest().isEmpty()) {
        crManifest_ = other.crManifest_;
        onChanged();
      }
      if (!other.getIntendedMembership().isEmpty()) {
        intendedMembership_ = other.intendedMembership_;
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                parent_ = input.readStringRequireUtf8();

                break;
              } // case 10
            case 18:
              {
                crManifest_ = input.readStringRequireUtf8();

                break;
              } // case 18
            case 26:
              {
                intendedMembership_ = input.readStringRequireUtf8();

                break;
              } // case 26
            default:
              {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private java.lang.Object parent_ = "";
    /**
     *
     *
     * <pre>
     * Required. The parent (project and location) where the Memberships will be created.
     * Specified in the format `projects/&#42;&#47;locations/&#42;`.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The parent (project and location) where the Memberships will be created.
     * Specified in the format `projects/&#42;&#47;locations/&#42;`.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The parent (project and location) where the Memberships will be created.
     * Specified in the format `projects/&#42;&#47;locations/&#42;`.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      parent_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The parent (project and location) where the Memberships will be created.
     * Specified in the format `projects/&#42;&#47;locations/&#42;`.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearParent() {

      parent_ = getDefaultInstance().getParent();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The parent (project and location) where the Memberships will be created.
     * Specified in the format `projects/&#42;&#47;locations/&#42;`.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      parent_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object crManifest_ = "";
    /**
     *
     *
     * <pre>
     * Optional. The YAML of the membership CR in the cluster. Empty if the membership
     * CR does not exist.
     * </pre>
     *
     * <code>string cr_manifest = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The crManifest.
     */
    public java.lang.String getCrManifest() {
      java.lang.Object ref = crManifest_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        crManifest_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. The YAML of the membership CR in the cluster. Empty if the membership
     * CR does not exist.
     * </pre>
     *
     * <code>string cr_manifest = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The bytes for crManifest.
     */
    public com.google.protobuf.ByteString getCrManifestBytes() {
      java.lang.Object ref = crManifest_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        crManifest_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. The YAML of the membership CR in the cluster. Empty if the membership
     * CR does not exist.
     * </pre>
     *
     * <code>string cr_manifest = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The crManifest to set.
     * @return This builder for chaining.
     */
    public Builder setCrManifest(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      crManifest_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The YAML of the membership CR in the cluster. Empty if the membership
     * CR does not exist.
     * </pre>
     *
     * <code>string cr_manifest = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearCrManifest() {

      crManifest_ = getDefaultInstance().getCrManifest();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The YAML of the membership CR in the cluster. Empty if the membership
     * CR does not exist.
     * </pre>
     *
     * <code>string cr_manifest = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The bytes for crManifest to set.
     * @return This builder for chaining.
     */
    public Builder setCrManifestBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      crManifest_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object intendedMembership_ = "";
    /**
     *
     *
     * <pre>
     * Required. The intended membership name under the `parent`. This method only does
     * validation in anticipation of a CreateMembership call with the same name.
     * </pre>
     *
     * <code>string intended_membership = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The intendedMembership.
     */
    public java.lang.String getIntendedMembership() {
      java.lang.Object ref = intendedMembership_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        intendedMembership_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The intended membership name under the `parent`. This method only does
     * validation in anticipation of a CreateMembership call with the same name.
     * </pre>
     *
     * <code>string intended_membership = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for intendedMembership.
     */
    public com.google.protobuf.ByteString getIntendedMembershipBytes() {
      java.lang.Object ref = intendedMembership_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        intendedMembership_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The intended membership name under the `parent`. This method only does
     * validation in anticipation of a CreateMembership call with the same name.
     * </pre>
     *
     * <code>string intended_membership = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The intendedMembership to set.
     * @return This builder for chaining.
     */
    public Builder setIntendedMembership(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      intendedMembership_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The intended membership name under the `parent`. This method only does
     * validation in anticipation of a CreateMembership call with the same name.
     * </pre>
     *
     * <code>string intended_membership = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearIntendedMembership() {

      intendedMembership_ = getDefaultInstance().getIntendedMembership();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The intended membership name under the `parent`. This method only does
     * validation in anticipation of a CreateMembership call with the same name.
     * </pre>
     *
     * <code>string intended_membership = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for intendedMembership to set.
     * @return This builder for chaining.
     */
    public Builder setIntendedMembershipBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      intendedMembership_ = value;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.gkehub.v1beta1.ValidateExclusivityRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.gkehub.v1beta1.ValidateExclusivityRequest)
  private static final com.google.cloud.gkehub.v1beta1.ValidateExclusivityRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.gkehub.v1beta1.ValidateExclusivityRequest();
  }

  public static com.google.cloud.gkehub.v1beta1.ValidateExclusivityRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ValidateExclusivityRequest> PARSER =
      new com.google.protobuf.AbstractParser<ValidateExclusivityRequest>() {
        @java.lang.Override
        public ValidateExclusivityRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          Builder builder = newBuilder();
          try {
            builder.mergeFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(builder.buildPartial());
          } catch (com.google.protobuf.UninitializedMessageException e) {
            throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
          } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e)
                .setUnfinishedMessage(builder.buildPartial());
          }
          return builder.buildPartial();
        }
      };

  public static com.google.protobuf.Parser<ValidateExclusivityRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ValidateExclusivityRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.gkehub.v1beta1.ValidateExclusivityRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
