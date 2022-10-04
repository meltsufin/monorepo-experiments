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
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

/**
 *
 *
 * <pre>
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.SslPoliciesListAvailableFeaturesResponse}
 */
public final class SslPoliciesListAvailableFeaturesResponse
    extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.SslPoliciesListAvailableFeaturesResponse)
    SslPoliciesListAvailableFeaturesResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use SslPoliciesListAvailableFeaturesResponse.newBuilder() to construct.
  private SslPoliciesListAvailableFeaturesResponse(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SslPoliciesListAvailableFeaturesResponse() {
    features_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new SslPoliciesListAvailableFeaturesResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_SslPoliciesListAvailableFeaturesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_SslPoliciesListAvailableFeaturesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.SslPoliciesListAvailableFeaturesResponse.class,
            com.google.cloud.compute.v1.SslPoliciesListAvailableFeaturesResponse.Builder.class);
  }

  public static final int FEATURES_FIELD_NUMBER = 246211645;
  private com.google.protobuf.LazyStringList features_;
  /**
   * <code>repeated string features = 246211645;</code>
   *
   * @return A list containing the features.
   */
  public com.google.protobuf.ProtocolStringList getFeaturesList() {
    return features_;
  }
  /**
   * <code>repeated string features = 246211645;</code>
   *
   * @return The count of features.
   */
  public int getFeaturesCount() {
    return features_.size();
  }
  /**
   * <code>repeated string features = 246211645;</code>
   *
   * @param index The index of the element to return.
   * @return The features at the given index.
   */
  public java.lang.String getFeatures(int index) {
    return features_.get(index);
  }
  /**
   * <code>repeated string features = 246211645;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the features at the given index.
   */
  public com.google.protobuf.ByteString getFeaturesBytes(int index) {
    return features_.getByteString(index);
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
    for (int i = 0; i < features_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 246211645, features_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < features_.size(); i++) {
        dataSize += computeStringSizeNoTag(features_.getRaw(i));
      }
      size += dataSize;
      size += 5 * getFeaturesList().size();
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
    if (!(obj instanceof com.google.cloud.compute.v1.SslPoliciesListAvailableFeaturesResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.SslPoliciesListAvailableFeaturesResponse other =
        (com.google.cloud.compute.v1.SslPoliciesListAvailableFeaturesResponse) obj;

    if (!getFeaturesList().equals(other.getFeaturesList())) return false;
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
    if (getFeaturesCount() > 0) {
      hash = (37 * hash) + FEATURES_FIELD_NUMBER;
      hash = (53 * hash) + getFeaturesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.SslPoliciesListAvailableFeaturesResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.SslPoliciesListAvailableFeaturesResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.SslPoliciesListAvailableFeaturesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.SslPoliciesListAvailableFeaturesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.SslPoliciesListAvailableFeaturesResponse parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.SslPoliciesListAvailableFeaturesResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.SslPoliciesListAvailableFeaturesResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.SslPoliciesListAvailableFeaturesResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.SslPoliciesListAvailableFeaturesResponse
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.SslPoliciesListAvailableFeaturesResponse
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.SslPoliciesListAvailableFeaturesResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.SslPoliciesListAvailableFeaturesResponse parseFrom(
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
      com.google.cloud.compute.v1.SslPoliciesListAvailableFeaturesResponse prototype) {
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
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.SslPoliciesListAvailableFeaturesResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.SslPoliciesListAvailableFeaturesResponse)
      com.google.cloud.compute.v1.SslPoliciesListAvailableFeaturesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_SslPoliciesListAvailableFeaturesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_SslPoliciesListAvailableFeaturesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.SslPoliciesListAvailableFeaturesResponse.class,
              com.google.cloud.compute.v1.SslPoliciesListAvailableFeaturesResponse.Builder.class);
    }

    // Construct using
    // com.google.cloud.compute.v1.SslPoliciesListAvailableFeaturesResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      features_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_SslPoliciesListAvailableFeaturesResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.SslPoliciesListAvailableFeaturesResponse
        getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.SslPoliciesListAvailableFeaturesResponse
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.SslPoliciesListAvailableFeaturesResponse build() {
      com.google.cloud.compute.v1.SslPoliciesListAvailableFeaturesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.SslPoliciesListAvailableFeaturesResponse buildPartial() {
      com.google.cloud.compute.v1.SslPoliciesListAvailableFeaturesResponse result =
          new com.google.cloud.compute.v1.SslPoliciesListAvailableFeaturesResponse(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        features_ = features_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.features_ = features_;
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
      if (other instanceof com.google.cloud.compute.v1.SslPoliciesListAvailableFeaturesResponse) {
        return mergeFrom(
            (com.google.cloud.compute.v1.SslPoliciesListAvailableFeaturesResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.compute.v1.SslPoliciesListAvailableFeaturesResponse other) {
      if (other
          == com.google.cloud.compute.v1.SslPoliciesListAvailableFeaturesResponse
              .getDefaultInstance()) return this;
      if (!other.features_.isEmpty()) {
        if (features_.isEmpty()) {
          features_ = other.features_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureFeaturesIsMutable();
          features_.addAll(other.features_);
        }
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
            case 1969693162:
              {
                java.lang.String s = input.readStringRequireUtf8();
                ensureFeaturesIsMutable();
                features_.add(s);
                break;
              } // case 1969693162
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

    private int bitField0_;

    private com.google.protobuf.LazyStringList features_ =
        com.google.protobuf.LazyStringArrayList.EMPTY;

    private void ensureFeaturesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        features_ = new com.google.protobuf.LazyStringArrayList(features_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     * <code>repeated string features = 246211645;</code>
     *
     * @return A list containing the features.
     */
    public com.google.protobuf.ProtocolStringList getFeaturesList() {
      return features_.getUnmodifiableView();
    }
    /**
     * <code>repeated string features = 246211645;</code>
     *
     * @return The count of features.
     */
    public int getFeaturesCount() {
      return features_.size();
    }
    /**
     * <code>repeated string features = 246211645;</code>
     *
     * @param index The index of the element to return.
     * @return The features at the given index.
     */
    public java.lang.String getFeatures(int index) {
      return features_.get(index);
    }
    /**
     * <code>repeated string features = 246211645;</code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the features at the given index.
     */
    public com.google.protobuf.ByteString getFeaturesBytes(int index) {
      return features_.getByteString(index);
    }
    /**
     * <code>repeated string features = 246211645;</code>
     *
     * @param index The index to set the value at.
     * @param value The features to set.
     * @return This builder for chaining.
     */
    public Builder setFeatures(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureFeaturesIsMutable();
      features_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string features = 246211645;</code>
     *
     * @param value The features to add.
     * @return This builder for chaining.
     */
    public Builder addFeatures(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureFeaturesIsMutable();
      features_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string features = 246211645;</code>
     *
     * @param values The features to add.
     * @return This builder for chaining.
     */
    public Builder addAllFeatures(java.lang.Iterable<java.lang.String> values) {
      ensureFeaturesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, features_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string features = 246211645;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearFeatures() {
      features_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string features = 246211645;</code>
     *
     * @param value The bytes of the features to add.
     * @return This builder for chaining.
     */
    public Builder addFeaturesBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensureFeaturesIsMutable();
      features_.add(value);
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

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.SslPoliciesListAvailableFeaturesResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.SslPoliciesListAvailableFeaturesResponse)
  private static final com.google.cloud.compute.v1.SslPoliciesListAvailableFeaturesResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.SslPoliciesListAvailableFeaturesResponse();
  }

  public static com.google.cloud.compute.v1.SslPoliciesListAvailableFeaturesResponse
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SslPoliciesListAvailableFeaturesResponse> PARSER =
      new com.google.protobuf.AbstractParser<SslPoliciesListAvailableFeaturesResponse>() {
        @java.lang.Override
        public SslPoliciesListAvailableFeaturesResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<SslPoliciesListAvailableFeaturesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SslPoliciesListAvailableFeaturesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.SslPoliciesListAvailableFeaturesResponse
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
