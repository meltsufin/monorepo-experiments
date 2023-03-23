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
// source: google/cloud/certificatemanager/v1/certificate_manager.proto

package com.google.cloud.certificatemanager.v1;

/**
 *
 *
 * <pre>
 * Request for the `UpdateCertificateMapEntry` method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.certificatemanager.v1.UpdateCertificateMapEntryRequest}
 */
public final class UpdateCertificateMapEntryRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.certificatemanager.v1.UpdateCertificateMapEntryRequest)
    UpdateCertificateMapEntryRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UpdateCertificateMapEntryRequest.newBuilder() to construct.
  private UpdateCertificateMapEntryRequest(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpdateCertificateMapEntryRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UpdateCertificateMapEntryRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.certificatemanager.v1.CertificateManagerProto
        .internal_static_google_cloud_certificatemanager_v1_UpdateCertificateMapEntryRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.certificatemanager.v1.CertificateManagerProto
        .internal_static_google_cloud_certificatemanager_v1_UpdateCertificateMapEntryRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.certificatemanager.v1.UpdateCertificateMapEntryRequest.class,
            com.google.cloud.certificatemanager.v1.UpdateCertificateMapEntryRequest.Builder.class);
  }

  public static final int CERTIFICATE_MAP_ENTRY_FIELD_NUMBER = 1;
  private com.google.cloud.certificatemanager.v1.CertificateMapEntry certificateMapEntry_;
  /**
   *
   *
   * <pre>
   * Required. A definition of the certificate map entry to create map entry.
   * </pre>
   *
   * <code>
   * .google.cloud.certificatemanager.v1.CertificateMapEntry certificate_map_entry = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the certificateMapEntry field is set.
   */
  @java.lang.Override
  public boolean hasCertificateMapEntry() {
    return certificateMapEntry_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. A definition of the certificate map entry to create map entry.
   * </pre>
   *
   * <code>
   * .google.cloud.certificatemanager.v1.CertificateMapEntry certificate_map_entry = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The certificateMapEntry.
   */
  @java.lang.Override
  public com.google.cloud.certificatemanager.v1.CertificateMapEntry getCertificateMapEntry() {
    return certificateMapEntry_ == null
        ? com.google.cloud.certificatemanager.v1.CertificateMapEntry.getDefaultInstance()
        : certificateMapEntry_;
  }
  /**
   *
   *
   * <pre>
   * Required. A definition of the certificate map entry to create map entry.
   * </pre>
   *
   * <code>
   * .google.cloud.certificatemanager.v1.CertificateMapEntry certificate_map_entry = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.certificatemanager.v1.CertificateMapEntryOrBuilder
      getCertificateMapEntryOrBuilder() {
    return getCertificateMapEntry();
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   *
   *
   * <pre>
   * Required. The update mask applies to the resource. For the `FieldMask`
   * definition, see
   * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask.
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
   * Required. The update mask applies to the resource. For the `FieldMask`
   * definition, see
   * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask.
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
   * Required. The update mask applies to the resource. For the `FieldMask`
   * definition, see
   * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask.
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
    if (certificateMapEntry_ != null) {
      output.writeMessage(1, getCertificateMapEntry());
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
    if (certificateMapEntry_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getCertificateMapEntry());
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
    if (!(obj instanceof com.google.cloud.certificatemanager.v1.UpdateCertificateMapEntryRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.certificatemanager.v1.UpdateCertificateMapEntryRequest other =
        (com.google.cloud.certificatemanager.v1.UpdateCertificateMapEntryRequest) obj;

    if (hasCertificateMapEntry() != other.hasCertificateMapEntry()) return false;
    if (hasCertificateMapEntry()) {
      if (!getCertificateMapEntry().equals(other.getCertificateMapEntry())) return false;
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
    if (hasCertificateMapEntry()) {
      hash = (37 * hash) + CERTIFICATE_MAP_ENTRY_FIELD_NUMBER;
      hash = (53 * hash) + getCertificateMapEntry().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.certificatemanager.v1.UpdateCertificateMapEntryRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.certificatemanager.v1.UpdateCertificateMapEntryRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.certificatemanager.v1.UpdateCertificateMapEntryRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.certificatemanager.v1.UpdateCertificateMapEntryRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.certificatemanager.v1.UpdateCertificateMapEntryRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.certificatemanager.v1.UpdateCertificateMapEntryRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.certificatemanager.v1.UpdateCertificateMapEntryRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.certificatemanager.v1.UpdateCertificateMapEntryRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.certificatemanager.v1.UpdateCertificateMapEntryRequest
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.certificatemanager.v1.UpdateCertificateMapEntryRequest
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.certificatemanager.v1.UpdateCertificateMapEntryRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.certificatemanager.v1.UpdateCertificateMapEntryRequest parseFrom(
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
      com.google.cloud.certificatemanager.v1.UpdateCertificateMapEntryRequest prototype) {
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
   * Request for the `UpdateCertificateMapEntry` method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.certificatemanager.v1.UpdateCertificateMapEntryRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.certificatemanager.v1.UpdateCertificateMapEntryRequest)
      com.google.cloud.certificatemanager.v1.UpdateCertificateMapEntryRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.certificatemanager.v1.CertificateManagerProto
          .internal_static_google_cloud_certificatemanager_v1_UpdateCertificateMapEntryRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.certificatemanager.v1.CertificateManagerProto
          .internal_static_google_cloud_certificatemanager_v1_UpdateCertificateMapEntryRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.certificatemanager.v1.UpdateCertificateMapEntryRequest.class,
              com.google.cloud.certificatemanager.v1.UpdateCertificateMapEntryRequest.Builder
                  .class);
    }

    // Construct using
    // com.google.cloud.certificatemanager.v1.UpdateCertificateMapEntryRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (certificateMapEntryBuilder_ == null) {
        certificateMapEntry_ = null;
      } else {
        certificateMapEntry_ = null;
        certificateMapEntryBuilder_ = null;
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
      return com.google.cloud.certificatemanager.v1.CertificateManagerProto
          .internal_static_google_cloud_certificatemanager_v1_UpdateCertificateMapEntryRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.certificatemanager.v1.UpdateCertificateMapEntryRequest
        getDefaultInstanceForType() {
      return com.google.cloud.certificatemanager.v1.UpdateCertificateMapEntryRequest
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.certificatemanager.v1.UpdateCertificateMapEntryRequest build() {
      com.google.cloud.certificatemanager.v1.UpdateCertificateMapEntryRequest result =
          buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.certificatemanager.v1.UpdateCertificateMapEntryRequest buildPartial() {
      com.google.cloud.certificatemanager.v1.UpdateCertificateMapEntryRequest result =
          new com.google.cloud.certificatemanager.v1.UpdateCertificateMapEntryRequest(this);
      if (certificateMapEntryBuilder_ == null) {
        result.certificateMapEntry_ = certificateMapEntry_;
      } else {
        result.certificateMapEntry_ = certificateMapEntryBuilder_.build();
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
      if (other
          instanceof com.google.cloud.certificatemanager.v1.UpdateCertificateMapEntryRequest) {
        return mergeFrom(
            (com.google.cloud.certificatemanager.v1.UpdateCertificateMapEntryRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.certificatemanager.v1.UpdateCertificateMapEntryRequest other) {
      if (other
          == com.google.cloud.certificatemanager.v1.UpdateCertificateMapEntryRequest
              .getDefaultInstance()) return this;
      if (other.hasCertificateMapEntry()) {
        mergeCertificateMapEntry(other.getCertificateMapEntry());
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
                    getCertificateMapEntryFieldBuilder().getBuilder(), extensionRegistry);

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

    private com.google.cloud.certificatemanager.v1.CertificateMapEntry certificateMapEntry_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.certificatemanager.v1.CertificateMapEntry,
            com.google.cloud.certificatemanager.v1.CertificateMapEntry.Builder,
            com.google.cloud.certificatemanager.v1.CertificateMapEntryOrBuilder>
        certificateMapEntryBuilder_;
    /**
     *
     *
     * <pre>
     * Required. A definition of the certificate map entry to create map entry.
     * </pre>
     *
     * <code>
     * .google.cloud.certificatemanager.v1.CertificateMapEntry certificate_map_entry = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the certificateMapEntry field is set.
     */
    public boolean hasCertificateMapEntry() {
      return certificateMapEntryBuilder_ != null || certificateMapEntry_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. A definition of the certificate map entry to create map entry.
     * </pre>
     *
     * <code>
     * .google.cloud.certificatemanager.v1.CertificateMapEntry certificate_map_entry = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The certificateMapEntry.
     */
    public com.google.cloud.certificatemanager.v1.CertificateMapEntry getCertificateMapEntry() {
      if (certificateMapEntryBuilder_ == null) {
        return certificateMapEntry_ == null
            ? com.google.cloud.certificatemanager.v1.CertificateMapEntry.getDefaultInstance()
            : certificateMapEntry_;
      } else {
        return certificateMapEntryBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. A definition of the certificate map entry to create map entry.
     * </pre>
     *
     * <code>
     * .google.cloud.certificatemanager.v1.CertificateMapEntry certificate_map_entry = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setCertificateMapEntry(
        com.google.cloud.certificatemanager.v1.CertificateMapEntry value) {
      if (certificateMapEntryBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        certificateMapEntry_ = value;
        onChanged();
      } else {
        certificateMapEntryBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. A definition of the certificate map entry to create map entry.
     * </pre>
     *
     * <code>
     * .google.cloud.certificatemanager.v1.CertificateMapEntry certificate_map_entry = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setCertificateMapEntry(
        com.google.cloud.certificatemanager.v1.CertificateMapEntry.Builder builderForValue) {
      if (certificateMapEntryBuilder_ == null) {
        certificateMapEntry_ = builderForValue.build();
        onChanged();
      } else {
        certificateMapEntryBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. A definition of the certificate map entry to create map entry.
     * </pre>
     *
     * <code>
     * .google.cloud.certificatemanager.v1.CertificateMapEntry certificate_map_entry = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeCertificateMapEntry(
        com.google.cloud.certificatemanager.v1.CertificateMapEntry value) {
      if (certificateMapEntryBuilder_ == null) {
        if (certificateMapEntry_ != null) {
          certificateMapEntry_ =
              com.google.cloud.certificatemanager.v1.CertificateMapEntry.newBuilder(
                      certificateMapEntry_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          certificateMapEntry_ = value;
        }
        onChanged();
      } else {
        certificateMapEntryBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. A definition of the certificate map entry to create map entry.
     * </pre>
     *
     * <code>
     * .google.cloud.certificatemanager.v1.CertificateMapEntry certificate_map_entry = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearCertificateMapEntry() {
      if (certificateMapEntryBuilder_ == null) {
        certificateMapEntry_ = null;
        onChanged();
      } else {
        certificateMapEntry_ = null;
        certificateMapEntryBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. A definition of the certificate map entry to create map entry.
     * </pre>
     *
     * <code>
     * .google.cloud.certificatemanager.v1.CertificateMapEntry certificate_map_entry = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.certificatemanager.v1.CertificateMapEntry.Builder
        getCertificateMapEntryBuilder() {

      onChanged();
      return getCertificateMapEntryFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. A definition of the certificate map entry to create map entry.
     * </pre>
     *
     * <code>
     * .google.cloud.certificatemanager.v1.CertificateMapEntry certificate_map_entry = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.certificatemanager.v1.CertificateMapEntryOrBuilder
        getCertificateMapEntryOrBuilder() {
      if (certificateMapEntryBuilder_ != null) {
        return certificateMapEntryBuilder_.getMessageOrBuilder();
      } else {
        return certificateMapEntry_ == null
            ? com.google.cloud.certificatemanager.v1.CertificateMapEntry.getDefaultInstance()
            : certificateMapEntry_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. A definition of the certificate map entry to create map entry.
     * </pre>
     *
     * <code>
     * .google.cloud.certificatemanager.v1.CertificateMapEntry certificate_map_entry = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.certificatemanager.v1.CertificateMapEntry,
            com.google.cloud.certificatemanager.v1.CertificateMapEntry.Builder,
            com.google.cloud.certificatemanager.v1.CertificateMapEntryOrBuilder>
        getCertificateMapEntryFieldBuilder() {
      if (certificateMapEntryBuilder_ == null) {
        certificateMapEntryBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.certificatemanager.v1.CertificateMapEntry,
                com.google.cloud.certificatemanager.v1.CertificateMapEntry.Builder,
                com.google.cloud.certificatemanager.v1.CertificateMapEntryOrBuilder>(
                getCertificateMapEntry(), getParentForChildren(), isClean());
        certificateMapEntry_ = null;
      }
      return certificateMapEntryBuilder_;
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
     * Required. The update mask applies to the resource. For the `FieldMask`
     * definition, see
     * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask.
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
     * Required. The update mask applies to the resource. For the `FieldMask`
     * definition, see
     * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask.
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
     * Required. The update mask applies to the resource. For the `FieldMask`
     * definition, see
     * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask.
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
     * Required. The update mask applies to the resource. For the `FieldMask`
     * definition, see
     * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask.
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
     * Required. The update mask applies to the resource. For the `FieldMask`
     * definition, see
     * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask.
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
     * Required. The update mask applies to the resource. For the `FieldMask`
     * definition, see
     * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask.
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
     * Required. The update mask applies to the resource. For the `FieldMask`
     * definition, see
     * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask.
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
     * Required. The update mask applies to the resource. For the `FieldMask`
     * definition, see
     * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask.
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
     * Required. The update mask applies to the resource. For the `FieldMask`
     * definition, see
     * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask.
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

    // @@protoc_insertion_point(builder_scope:google.cloud.certificatemanager.v1.UpdateCertificateMapEntryRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.certificatemanager.v1.UpdateCertificateMapEntryRequest)
  private static final com.google.cloud.certificatemanager.v1.UpdateCertificateMapEntryRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE =
        new com.google.cloud.certificatemanager.v1.UpdateCertificateMapEntryRequest();
  }

  public static com.google.cloud.certificatemanager.v1.UpdateCertificateMapEntryRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateCertificateMapEntryRequest> PARSER =
      new com.google.protobuf.AbstractParser<UpdateCertificateMapEntryRequest>() {
        @java.lang.Override
        public UpdateCertificateMapEntryRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateCertificateMapEntryRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateCertificateMapEntryRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.certificatemanager.v1.UpdateCertificateMapEntryRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
