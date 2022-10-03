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
// source: google/cloud/gkehub/v1alpha2/membership.proto

package com.google.cloud.gkehub.v1alpha2;

/**
 *
 *
 * <pre>
 * ConnectAgentResource represents a Kubernetes resource manifest for Connect
 * Agent deployment.
 * </pre>
 *
 * Protobuf type {@code google.cloud.gkehub.v1alpha2.ConnectAgentResource}
 */
public final class ConnectAgentResource extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.gkehub.v1alpha2.ConnectAgentResource)
    ConnectAgentResourceOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ConnectAgentResource.newBuilder() to construct.
  private ConnectAgentResource(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ConnectAgentResource() {
    manifest_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ConnectAgentResource();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.gkehub.v1alpha2.MembershipProto
        .internal_static_google_cloud_gkehub_v1alpha2_ConnectAgentResource_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.gkehub.v1alpha2.MembershipProto
        .internal_static_google_cloud_gkehub_v1alpha2_ConnectAgentResource_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.gkehub.v1alpha2.ConnectAgentResource.class,
            com.google.cloud.gkehub.v1alpha2.ConnectAgentResource.Builder.class);
  }

  public static final int TYPE_FIELD_NUMBER = 1;
  private com.google.cloud.gkehub.v1alpha2.TypeMeta type_;
  /**
   *
   *
   * <pre>
   * Kubernetes type of the resource.
   * </pre>
   *
   * <code>.google.cloud.gkehub.v1alpha2.TypeMeta type = 1;</code>
   *
   * @return Whether the type field is set.
   */
  @java.lang.Override
  public boolean hasType() {
    return type_ != null;
  }
  /**
   *
   *
   * <pre>
   * Kubernetes type of the resource.
   * </pre>
   *
   * <code>.google.cloud.gkehub.v1alpha2.TypeMeta type = 1;</code>
   *
   * @return The type.
   */
  @java.lang.Override
  public com.google.cloud.gkehub.v1alpha2.TypeMeta getType() {
    return type_ == null ? com.google.cloud.gkehub.v1alpha2.TypeMeta.getDefaultInstance() : type_;
  }
  /**
   *
   *
   * <pre>
   * Kubernetes type of the resource.
   * </pre>
   *
   * <code>.google.cloud.gkehub.v1alpha2.TypeMeta type = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.gkehub.v1alpha2.TypeMetaOrBuilder getTypeOrBuilder() {
    return getType();
  }

  public static final int MANIFEST_FIELD_NUMBER = 2;
  private volatile java.lang.Object manifest_;
  /**
   *
   *
   * <pre>
   * YAML manifest of the resource.
   * </pre>
   *
   * <code>string manifest = 2;</code>
   *
   * @return The manifest.
   */
  @java.lang.Override
  public java.lang.String getManifest() {
    java.lang.Object ref = manifest_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      manifest_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * YAML manifest of the resource.
   * </pre>
   *
   * <code>string manifest = 2;</code>
   *
   * @return The bytes for manifest.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getManifestBytes() {
    java.lang.Object ref = manifest_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      manifest_ = b;
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
    if (type_ != null) {
      output.writeMessage(1, getType());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(manifest_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, manifest_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (type_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getType());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(manifest_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, manifest_);
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
    if (!(obj instanceof com.google.cloud.gkehub.v1alpha2.ConnectAgentResource)) {
      return super.equals(obj);
    }
    com.google.cloud.gkehub.v1alpha2.ConnectAgentResource other =
        (com.google.cloud.gkehub.v1alpha2.ConnectAgentResource) obj;

    if (hasType() != other.hasType()) return false;
    if (hasType()) {
      if (!getType().equals(other.getType())) return false;
    }
    if (!getManifest().equals(other.getManifest())) return false;
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
    if (hasType()) {
      hash = (37 * hash) + TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getType().hashCode();
    }
    hash = (37 * hash) + MANIFEST_FIELD_NUMBER;
    hash = (53 * hash) + getManifest().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.gkehub.v1alpha2.ConnectAgentResource parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkehub.v1alpha2.ConnectAgentResource parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkehub.v1alpha2.ConnectAgentResource parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkehub.v1alpha2.ConnectAgentResource parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkehub.v1alpha2.ConnectAgentResource parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkehub.v1alpha2.ConnectAgentResource parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkehub.v1alpha2.ConnectAgentResource parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkehub.v1alpha2.ConnectAgentResource parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gkehub.v1alpha2.ConnectAgentResource parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkehub.v1alpha2.ConnectAgentResource parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gkehub.v1alpha2.ConnectAgentResource parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkehub.v1alpha2.ConnectAgentResource parseFrom(
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
      com.google.cloud.gkehub.v1alpha2.ConnectAgentResource prototype) {
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
   * ConnectAgentResource represents a Kubernetes resource manifest for Connect
   * Agent deployment.
   * </pre>
   *
   * Protobuf type {@code google.cloud.gkehub.v1alpha2.ConnectAgentResource}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.gkehub.v1alpha2.ConnectAgentResource)
      com.google.cloud.gkehub.v1alpha2.ConnectAgentResourceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.gkehub.v1alpha2.MembershipProto
          .internal_static_google_cloud_gkehub_v1alpha2_ConnectAgentResource_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.gkehub.v1alpha2.MembershipProto
          .internal_static_google_cloud_gkehub_v1alpha2_ConnectAgentResource_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.gkehub.v1alpha2.ConnectAgentResource.class,
              com.google.cloud.gkehub.v1alpha2.ConnectAgentResource.Builder.class);
    }

    // Construct using com.google.cloud.gkehub.v1alpha2.ConnectAgentResource.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (typeBuilder_ == null) {
        type_ = null;
      } else {
        type_ = null;
        typeBuilder_ = null;
      }
      manifest_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.gkehub.v1alpha2.MembershipProto
          .internal_static_google_cloud_gkehub_v1alpha2_ConnectAgentResource_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.gkehub.v1alpha2.ConnectAgentResource getDefaultInstanceForType() {
      return com.google.cloud.gkehub.v1alpha2.ConnectAgentResource.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.gkehub.v1alpha2.ConnectAgentResource build() {
      com.google.cloud.gkehub.v1alpha2.ConnectAgentResource result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.gkehub.v1alpha2.ConnectAgentResource buildPartial() {
      com.google.cloud.gkehub.v1alpha2.ConnectAgentResource result =
          new com.google.cloud.gkehub.v1alpha2.ConnectAgentResource(this);
      if (typeBuilder_ == null) {
        result.type_ = type_;
      } else {
        result.type_ = typeBuilder_.build();
      }
      result.manifest_ = manifest_;
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
      if (other instanceof com.google.cloud.gkehub.v1alpha2.ConnectAgentResource) {
        return mergeFrom((com.google.cloud.gkehub.v1alpha2.ConnectAgentResource) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.gkehub.v1alpha2.ConnectAgentResource other) {
      if (other == com.google.cloud.gkehub.v1alpha2.ConnectAgentResource.getDefaultInstance())
        return this;
      if (other.hasType()) {
        mergeType(other.getType());
      }
      if (!other.getManifest().isEmpty()) {
        manifest_ = other.manifest_;
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
                input.readMessage(getTypeFieldBuilder().getBuilder(), extensionRegistry);

                break;
              } // case 10
            case 18:
              {
                manifest_ = input.readStringRequireUtf8();

                break;
              } // case 18
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

    private com.google.cloud.gkehub.v1alpha2.TypeMeta type_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.gkehub.v1alpha2.TypeMeta,
            com.google.cloud.gkehub.v1alpha2.TypeMeta.Builder,
            com.google.cloud.gkehub.v1alpha2.TypeMetaOrBuilder>
        typeBuilder_;
    /**
     *
     *
     * <pre>
     * Kubernetes type of the resource.
     * </pre>
     *
     * <code>.google.cloud.gkehub.v1alpha2.TypeMeta type = 1;</code>
     *
     * @return Whether the type field is set.
     */
    public boolean hasType() {
      return typeBuilder_ != null || type_ != null;
    }
    /**
     *
     *
     * <pre>
     * Kubernetes type of the resource.
     * </pre>
     *
     * <code>.google.cloud.gkehub.v1alpha2.TypeMeta type = 1;</code>
     *
     * @return The type.
     */
    public com.google.cloud.gkehub.v1alpha2.TypeMeta getType() {
      if (typeBuilder_ == null) {
        return type_ == null
            ? com.google.cloud.gkehub.v1alpha2.TypeMeta.getDefaultInstance()
            : type_;
      } else {
        return typeBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Kubernetes type of the resource.
     * </pre>
     *
     * <code>.google.cloud.gkehub.v1alpha2.TypeMeta type = 1;</code>
     */
    public Builder setType(com.google.cloud.gkehub.v1alpha2.TypeMeta value) {
      if (typeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        type_ = value;
        onChanged();
      } else {
        typeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Kubernetes type of the resource.
     * </pre>
     *
     * <code>.google.cloud.gkehub.v1alpha2.TypeMeta type = 1;</code>
     */
    public Builder setType(com.google.cloud.gkehub.v1alpha2.TypeMeta.Builder builderForValue) {
      if (typeBuilder_ == null) {
        type_ = builderForValue.build();
        onChanged();
      } else {
        typeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Kubernetes type of the resource.
     * </pre>
     *
     * <code>.google.cloud.gkehub.v1alpha2.TypeMeta type = 1;</code>
     */
    public Builder mergeType(com.google.cloud.gkehub.v1alpha2.TypeMeta value) {
      if (typeBuilder_ == null) {
        if (type_ != null) {
          type_ =
              com.google.cloud.gkehub.v1alpha2.TypeMeta.newBuilder(type_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          type_ = value;
        }
        onChanged();
      } else {
        typeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Kubernetes type of the resource.
     * </pre>
     *
     * <code>.google.cloud.gkehub.v1alpha2.TypeMeta type = 1;</code>
     */
    public Builder clearType() {
      if (typeBuilder_ == null) {
        type_ = null;
        onChanged();
      } else {
        type_ = null;
        typeBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Kubernetes type of the resource.
     * </pre>
     *
     * <code>.google.cloud.gkehub.v1alpha2.TypeMeta type = 1;</code>
     */
    public com.google.cloud.gkehub.v1alpha2.TypeMeta.Builder getTypeBuilder() {

      onChanged();
      return getTypeFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Kubernetes type of the resource.
     * </pre>
     *
     * <code>.google.cloud.gkehub.v1alpha2.TypeMeta type = 1;</code>
     */
    public com.google.cloud.gkehub.v1alpha2.TypeMetaOrBuilder getTypeOrBuilder() {
      if (typeBuilder_ != null) {
        return typeBuilder_.getMessageOrBuilder();
      } else {
        return type_ == null
            ? com.google.cloud.gkehub.v1alpha2.TypeMeta.getDefaultInstance()
            : type_;
      }
    }
    /**
     *
     *
     * <pre>
     * Kubernetes type of the resource.
     * </pre>
     *
     * <code>.google.cloud.gkehub.v1alpha2.TypeMeta type = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.gkehub.v1alpha2.TypeMeta,
            com.google.cloud.gkehub.v1alpha2.TypeMeta.Builder,
            com.google.cloud.gkehub.v1alpha2.TypeMetaOrBuilder>
        getTypeFieldBuilder() {
      if (typeBuilder_ == null) {
        typeBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.gkehub.v1alpha2.TypeMeta,
                com.google.cloud.gkehub.v1alpha2.TypeMeta.Builder,
                com.google.cloud.gkehub.v1alpha2.TypeMetaOrBuilder>(
                getType(), getParentForChildren(), isClean());
        type_ = null;
      }
      return typeBuilder_;
    }

    private java.lang.Object manifest_ = "";
    /**
     *
     *
     * <pre>
     * YAML manifest of the resource.
     * </pre>
     *
     * <code>string manifest = 2;</code>
     *
     * @return The manifest.
     */
    public java.lang.String getManifest() {
      java.lang.Object ref = manifest_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        manifest_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * YAML manifest of the resource.
     * </pre>
     *
     * <code>string manifest = 2;</code>
     *
     * @return The bytes for manifest.
     */
    public com.google.protobuf.ByteString getManifestBytes() {
      java.lang.Object ref = manifest_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        manifest_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * YAML manifest of the resource.
     * </pre>
     *
     * <code>string manifest = 2;</code>
     *
     * @param value The manifest to set.
     * @return This builder for chaining.
     */
    public Builder setManifest(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      manifest_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * YAML manifest of the resource.
     * </pre>
     *
     * <code>string manifest = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearManifest() {

      manifest_ = getDefaultInstance().getManifest();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * YAML manifest of the resource.
     * </pre>
     *
     * <code>string manifest = 2;</code>
     *
     * @param value The bytes for manifest to set.
     * @return This builder for chaining.
     */
    public Builder setManifestBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      manifest_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.gkehub.v1alpha2.ConnectAgentResource)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.gkehub.v1alpha2.ConnectAgentResource)
  private static final com.google.cloud.gkehub.v1alpha2.ConnectAgentResource DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.gkehub.v1alpha2.ConnectAgentResource();
  }

  public static com.google.cloud.gkehub.v1alpha2.ConnectAgentResource getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ConnectAgentResource> PARSER =
      new com.google.protobuf.AbstractParser<ConnectAgentResource>() {
        @java.lang.Override
        public ConnectAgentResource parsePartialFrom(
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

  public static com.google.protobuf.Parser<ConnectAgentResource> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ConnectAgentResource> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.gkehub.v1alpha2.ConnectAgentResource getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
