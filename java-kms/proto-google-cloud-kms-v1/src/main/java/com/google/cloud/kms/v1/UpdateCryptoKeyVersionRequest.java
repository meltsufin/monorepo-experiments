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
// source: google/cloud/kms/v1/service.proto

package com.google.cloud.kms.v1;

/**
 *
 *
 * <pre>
 * Request message for
 * [KeyManagementService.UpdateCryptoKeyVersion][google.cloud.kms.v1.KeyManagementService.UpdateCryptoKeyVersion].
 * </pre>
 *
 * Protobuf type {@code google.cloud.kms.v1.UpdateCryptoKeyVersionRequest}
 */
public final class UpdateCryptoKeyVersionRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.kms.v1.UpdateCryptoKeyVersionRequest)
    UpdateCryptoKeyVersionRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UpdateCryptoKeyVersionRequest.newBuilder() to construct.
  private UpdateCryptoKeyVersionRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpdateCryptoKeyVersionRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UpdateCryptoKeyVersionRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.kms.v1.KmsProto
        .internal_static_google_cloud_kms_v1_UpdateCryptoKeyVersionRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.kms.v1.KmsProto
        .internal_static_google_cloud_kms_v1_UpdateCryptoKeyVersionRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.kms.v1.UpdateCryptoKeyVersionRequest.class,
            com.google.cloud.kms.v1.UpdateCryptoKeyVersionRequest.Builder.class);
  }

  public static final int CRYPTO_KEY_VERSION_FIELD_NUMBER = 1;
  private com.google.cloud.kms.v1.CryptoKeyVersion cryptoKeyVersion_;
  /**
   *
   *
   * <pre>
   * Required. [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] with
   * updated values.
   * </pre>
   *
   * <code>
   * .google.cloud.kms.v1.CryptoKeyVersion crypto_key_version = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the cryptoKeyVersion field is set.
   */
  @java.lang.Override
  public boolean hasCryptoKeyVersion() {
    return cryptoKeyVersion_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] with
   * updated values.
   * </pre>
   *
   * <code>
   * .google.cloud.kms.v1.CryptoKeyVersion crypto_key_version = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The cryptoKeyVersion.
   */
  @java.lang.Override
  public com.google.cloud.kms.v1.CryptoKeyVersion getCryptoKeyVersion() {
    return cryptoKeyVersion_ == null
        ? com.google.cloud.kms.v1.CryptoKeyVersion.getDefaultInstance()
        : cryptoKeyVersion_;
  }
  /**
   *
   *
   * <pre>
   * Required. [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] with
   * updated values.
   * </pre>
   *
   * <code>
   * .google.cloud.kms.v1.CryptoKeyVersion crypto_key_version = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.kms.v1.CryptoKeyVersionOrBuilder getCryptoKeyVersionOrBuilder() {
    return getCryptoKeyVersion();
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   *
   *
   * <pre>
   * Required. List of fields to be updated in this request.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return updateMask_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. List of fields to be updated in this request.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   *
   *
   * <pre>
   * Required. List of fields to be updated in this request.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return getUpdateMask();
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
    if (cryptoKeyVersion_ != null) {
      output.writeMessage(1, getCryptoKeyVersion());
    }
    if (updateMask_ != null) {
      output.writeMessage(2, getUpdateMask());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (cryptoKeyVersion_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getCryptoKeyVersion());
    }
    if (updateMask_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getUpdateMask());
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
    if (!(obj instanceof com.google.cloud.kms.v1.UpdateCryptoKeyVersionRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.kms.v1.UpdateCryptoKeyVersionRequest other =
        (com.google.cloud.kms.v1.UpdateCryptoKeyVersionRequest) obj;

    if (hasCryptoKeyVersion() != other.hasCryptoKeyVersion()) return false;
    if (hasCryptoKeyVersion()) {
      if (!getCryptoKeyVersion().equals(other.getCryptoKeyVersion())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask().equals(other.getUpdateMask())) return false;
    }
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
    if (hasCryptoKeyVersion()) {
      hash = (37 * hash) + CRYPTO_KEY_VERSION_FIELD_NUMBER;
      hash = (53 * hash) + getCryptoKeyVersion().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.kms.v1.UpdateCryptoKeyVersionRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.kms.v1.UpdateCryptoKeyVersionRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.kms.v1.UpdateCryptoKeyVersionRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.kms.v1.UpdateCryptoKeyVersionRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.kms.v1.UpdateCryptoKeyVersionRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.kms.v1.UpdateCryptoKeyVersionRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.kms.v1.UpdateCryptoKeyVersionRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.kms.v1.UpdateCryptoKeyVersionRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.kms.v1.UpdateCryptoKeyVersionRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.kms.v1.UpdateCryptoKeyVersionRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.kms.v1.UpdateCryptoKeyVersionRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.kms.v1.UpdateCryptoKeyVersionRequest parseFrom(
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
      com.google.cloud.kms.v1.UpdateCryptoKeyVersionRequest prototype) {
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
   * Request message for
   * [KeyManagementService.UpdateCryptoKeyVersion][google.cloud.kms.v1.KeyManagementService.UpdateCryptoKeyVersion].
   * </pre>
   *
   * Protobuf type {@code google.cloud.kms.v1.UpdateCryptoKeyVersionRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.kms.v1.UpdateCryptoKeyVersionRequest)
      com.google.cloud.kms.v1.UpdateCryptoKeyVersionRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.kms.v1.KmsProto
          .internal_static_google_cloud_kms_v1_UpdateCryptoKeyVersionRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.kms.v1.KmsProto
          .internal_static_google_cloud_kms_v1_UpdateCryptoKeyVersionRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.kms.v1.UpdateCryptoKeyVersionRequest.class,
              com.google.cloud.kms.v1.UpdateCryptoKeyVersionRequest.Builder.class);
    }

    // Construct using com.google.cloud.kms.v1.UpdateCryptoKeyVersionRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (cryptoKeyVersionBuilder_ == null) {
        cryptoKeyVersion_ = null;
      } else {
        cryptoKeyVersion_ = null;
        cryptoKeyVersionBuilder_ = null;
      }
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.kms.v1.KmsProto
          .internal_static_google_cloud_kms_v1_UpdateCryptoKeyVersionRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.kms.v1.UpdateCryptoKeyVersionRequest getDefaultInstanceForType() {
      return com.google.cloud.kms.v1.UpdateCryptoKeyVersionRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.kms.v1.UpdateCryptoKeyVersionRequest build() {
      com.google.cloud.kms.v1.UpdateCryptoKeyVersionRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.kms.v1.UpdateCryptoKeyVersionRequest buildPartial() {
      com.google.cloud.kms.v1.UpdateCryptoKeyVersionRequest result =
          new com.google.cloud.kms.v1.UpdateCryptoKeyVersionRequest(this);
      if (cryptoKeyVersionBuilder_ == null) {
        result.cryptoKeyVersion_ = cryptoKeyVersion_;
      } else {
        result.cryptoKeyVersion_ = cryptoKeyVersionBuilder_.build();
      }
      if (updateMaskBuilder_ == null) {
        result.updateMask_ = updateMask_;
      } else {
        result.updateMask_ = updateMaskBuilder_.build();
      }
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
      if (other instanceof com.google.cloud.kms.v1.UpdateCryptoKeyVersionRequest) {
        return mergeFrom((com.google.cloud.kms.v1.UpdateCryptoKeyVersionRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.kms.v1.UpdateCryptoKeyVersionRequest other) {
      if (other == com.google.cloud.kms.v1.UpdateCryptoKeyVersionRequest.getDefaultInstance())
        return this;
      if (other.hasCryptoKeyVersion()) {
        mergeCryptoKeyVersion(other.getCryptoKeyVersion());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
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
                input.readMessage(
                    getCryptoKeyVersionFieldBuilder().getBuilder(), extensionRegistry);

                break;
              } // case 10
            case 18:
              {
                input.readMessage(getUpdateMaskFieldBuilder().getBuilder(), extensionRegistry);

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

    private com.google.cloud.kms.v1.CryptoKeyVersion cryptoKeyVersion_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.kms.v1.CryptoKeyVersion,
            com.google.cloud.kms.v1.CryptoKeyVersion.Builder,
            com.google.cloud.kms.v1.CryptoKeyVersionOrBuilder>
        cryptoKeyVersionBuilder_;
    /**
     *
     *
     * <pre>
     * Required. [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] with
     * updated values.
     * </pre>
     *
     * <code>
     * .google.cloud.kms.v1.CryptoKeyVersion crypto_key_version = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the cryptoKeyVersion field is set.
     */
    public boolean hasCryptoKeyVersion() {
      return cryptoKeyVersionBuilder_ != null || cryptoKeyVersion_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] with
     * updated values.
     * </pre>
     *
     * <code>
     * .google.cloud.kms.v1.CryptoKeyVersion crypto_key_version = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The cryptoKeyVersion.
     */
    public com.google.cloud.kms.v1.CryptoKeyVersion getCryptoKeyVersion() {
      if (cryptoKeyVersionBuilder_ == null) {
        return cryptoKeyVersion_ == null
            ? com.google.cloud.kms.v1.CryptoKeyVersion.getDefaultInstance()
            : cryptoKeyVersion_;
      } else {
        return cryptoKeyVersionBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] with
     * updated values.
     * </pre>
     *
     * <code>
     * .google.cloud.kms.v1.CryptoKeyVersion crypto_key_version = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setCryptoKeyVersion(com.google.cloud.kms.v1.CryptoKeyVersion value) {
      if (cryptoKeyVersionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        cryptoKeyVersion_ = value;
        onChanged();
      } else {
        cryptoKeyVersionBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] with
     * updated values.
     * </pre>
     *
     * <code>
     * .google.cloud.kms.v1.CryptoKeyVersion crypto_key_version = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setCryptoKeyVersion(
        com.google.cloud.kms.v1.CryptoKeyVersion.Builder builderForValue) {
      if (cryptoKeyVersionBuilder_ == null) {
        cryptoKeyVersion_ = builderForValue.build();
        onChanged();
      } else {
        cryptoKeyVersionBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] with
     * updated values.
     * </pre>
     *
     * <code>
     * .google.cloud.kms.v1.CryptoKeyVersion crypto_key_version = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeCryptoKeyVersion(com.google.cloud.kms.v1.CryptoKeyVersion value) {
      if (cryptoKeyVersionBuilder_ == null) {
        if (cryptoKeyVersion_ != null) {
          cryptoKeyVersion_ =
              com.google.cloud.kms.v1.CryptoKeyVersion.newBuilder(cryptoKeyVersion_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          cryptoKeyVersion_ = value;
        }
        onChanged();
      } else {
        cryptoKeyVersionBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] with
     * updated values.
     * </pre>
     *
     * <code>
     * .google.cloud.kms.v1.CryptoKeyVersion crypto_key_version = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearCryptoKeyVersion() {
      if (cryptoKeyVersionBuilder_ == null) {
        cryptoKeyVersion_ = null;
        onChanged();
      } else {
        cryptoKeyVersion_ = null;
        cryptoKeyVersionBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] with
     * updated values.
     * </pre>
     *
     * <code>
     * .google.cloud.kms.v1.CryptoKeyVersion crypto_key_version = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.kms.v1.CryptoKeyVersion.Builder getCryptoKeyVersionBuilder() {

      onChanged();
      return getCryptoKeyVersionFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] with
     * updated values.
     * </pre>
     *
     * <code>
     * .google.cloud.kms.v1.CryptoKeyVersion crypto_key_version = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.kms.v1.CryptoKeyVersionOrBuilder getCryptoKeyVersionOrBuilder() {
      if (cryptoKeyVersionBuilder_ != null) {
        return cryptoKeyVersionBuilder_.getMessageOrBuilder();
      } else {
        return cryptoKeyVersion_ == null
            ? com.google.cloud.kms.v1.CryptoKeyVersion.getDefaultInstance()
            : cryptoKeyVersion_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] with
     * updated values.
     * </pre>
     *
     * <code>
     * .google.cloud.kms.v1.CryptoKeyVersion crypto_key_version = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.kms.v1.CryptoKeyVersion,
            com.google.cloud.kms.v1.CryptoKeyVersion.Builder,
            com.google.cloud.kms.v1.CryptoKeyVersionOrBuilder>
        getCryptoKeyVersionFieldBuilder() {
      if (cryptoKeyVersionBuilder_ == null) {
        cryptoKeyVersionBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.kms.v1.CryptoKeyVersion,
                com.google.cloud.kms.v1.CryptoKeyVersion.Builder,
                com.google.cloud.kms.v1.CryptoKeyVersionOrBuilder>(
                getCryptoKeyVersion(), getParentForChildren(), isClean());
        cryptoKeyVersion_ = null;
      }
      return cryptoKeyVersionBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        updateMaskBuilder_;
    /**
     *
     *
     * <pre>
     * Required. List of fields to be updated in this request.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return updateMaskBuilder_ != null || updateMask_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. List of fields to be updated in this request.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The updateMask.
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. List of fields to be updated in this request.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. List of fields to be updated in this request.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. List of fields to be updated in this request.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (updateMask_ != null) {
          updateMask_ =
              com.google.protobuf.FieldMask.newBuilder(updateMask_).mergeFrom(value).buildPartial();
        } else {
          updateMask_ = value;
        }
        onChanged();
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. List of fields to be updated in this request.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearUpdateMask() {
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
        onChanged();
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. List of fields to be updated in this request.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {

      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. List of fields to be updated in this request.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. List of fields to be updated in this request.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.FieldMask,
                com.google.protobuf.FieldMask.Builder,
                com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(), getParentForChildren(), isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.kms.v1.UpdateCryptoKeyVersionRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.kms.v1.UpdateCryptoKeyVersionRequest)
  private static final com.google.cloud.kms.v1.UpdateCryptoKeyVersionRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.kms.v1.UpdateCryptoKeyVersionRequest();
  }

  public static com.google.cloud.kms.v1.UpdateCryptoKeyVersionRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateCryptoKeyVersionRequest> PARSER =
      new com.google.protobuf.AbstractParser<UpdateCryptoKeyVersionRequest>() {
        @java.lang.Override
        public UpdateCryptoKeyVersionRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateCryptoKeyVersionRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateCryptoKeyVersionRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.kms.v1.UpdateCryptoKeyVersionRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
