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
// source: google/cloud/channel/v1/service.proto

package com.google.cloud.channel.v1;

/**
 *
 *
 * <pre>
 * Response message for ListSkus.
 * </pre>
 *
 * Protobuf type {@code google.cloud.channel.v1.ListSkusResponse}
 */
public final class ListSkusResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.channel.v1.ListSkusResponse)
    ListSkusResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListSkusResponse.newBuilder() to construct.
  private ListSkusResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListSkusResponse() {
    skus_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListSkusResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.channel.v1.ServiceProto
        .internal_static_google_cloud_channel_v1_ListSkusResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.channel.v1.ServiceProto
        .internal_static_google_cloud_channel_v1_ListSkusResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.channel.v1.ListSkusResponse.class,
            com.google.cloud.channel.v1.ListSkusResponse.Builder.class);
  }

  public static final int SKUS_FIELD_NUMBER = 1;
  private java.util.List<com.google.cloud.channel.v1.Sku> skus_;
  /**
   *
   *
   * <pre>
   * The list of SKUs requested.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.Sku skus = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.channel.v1.Sku> getSkusList() {
    return skus_;
  }
  /**
   *
   *
   * <pre>
   * The list of SKUs requested.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.Sku skus = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.channel.v1.SkuOrBuilder> getSkusOrBuilderList() {
    return skus_;
  }
  /**
   *
   *
   * <pre>
   * The list of SKUs requested.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.Sku skus = 1;</code>
   */
  @java.lang.Override
  public int getSkusCount() {
    return skus_.size();
  }
  /**
   *
   *
   * <pre>
   * The list of SKUs requested.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.Sku skus = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.channel.v1.Sku getSkus(int index) {
    return skus_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The list of SKUs requested.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.Sku skus = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.channel.v1.SkuOrBuilder getSkusOrBuilder(int index) {
    return skus_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   *
   *
   * <pre>
   * A token to retrieve the next page of results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * A token to retrieve the next page of results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      nextPageToken_ = b;
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
    for (int i = 0; i < skus_.size(); i++) {
      output.writeMessage(1, skus_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < skus_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, skus_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof com.google.cloud.channel.v1.ListSkusResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.channel.v1.ListSkusResponse other =
        (com.google.cloud.channel.v1.ListSkusResponse) obj;

    if (!getSkusList().equals(other.getSkusList())) return false;
    if (!getNextPageToken().equals(other.getNextPageToken())) return false;
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
    if (getSkusCount() > 0) {
      hash = (37 * hash) + SKUS_FIELD_NUMBER;
      hash = (53 * hash) + getSkusList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.channel.v1.ListSkusResponse parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.channel.v1.ListSkusResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.ListSkusResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.channel.v1.ListSkusResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.ListSkusResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.channel.v1.ListSkusResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.ListSkusResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.channel.v1.ListSkusResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.ListSkusResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.channel.v1.ListSkusResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.ListSkusResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.channel.v1.ListSkusResponse parseFrom(
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

  public static Builder newBuilder(com.google.cloud.channel.v1.ListSkusResponse prototype) {
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
   * Response message for ListSkus.
   * </pre>
   *
   * Protobuf type {@code google.cloud.channel.v1.ListSkusResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.channel.v1.ListSkusResponse)
      com.google.cloud.channel.v1.ListSkusResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.channel.v1.ServiceProto
          .internal_static_google_cloud_channel_v1_ListSkusResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.channel.v1.ServiceProto
          .internal_static_google_cloud_channel_v1_ListSkusResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.channel.v1.ListSkusResponse.class,
              com.google.cloud.channel.v1.ListSkusResponse.Builder.class);
    }

    // Construct using com.google.cloud.channel.v1.ListSkusResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (skusBuilder_ == null) {
        skus_ = java.util.Collections.emptyList();
      } else {
        skus_ = null;
        skusBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.channel.v1.ServiceProto
          .internal_static_google_cloud_channel_v1_ListSkusResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.channel.v1.ListSkusResponse getDefaultInstanceForType() {
      return com.google.cloud.channel.v1.ListSkusResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.channel.v1.ListSkusResponse build() {
      com.google.cloud.channel.v1.ListSkusResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.channel.v1.ListSkusResponse buildPartial() {
      com.google.cloud.channel.v1.ListSkusResponse result =
          new com.google.cloud.channel.v1.ListSkusResponse(this);
      int from_bitField0_ = bitField0_;
      if (skusBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          skus_ = java.util.Collections.unmodifiableList(skus_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.skus_ = skus_;
      } else {
        result.skus_ = skusBuilder_.build();
      }
      result.nextPageToken_ = nextPageToken_;
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
      if (other instanceof com.google.cloud.channel.v1.ListSkusResponse) {
        return mergeFrom((com.google.cloud.channel.v1.ListSkusResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.channel.v1.ListSkusResponse other) {
      if (other == com.google.cloud.channel.v1.ListSkusResponse.getDefaultInstance()) return this;
      if (skusBuilder_ == null) {
        if (!other.skus_.isEmpty()) {
          if (skus_.isEmpty()) {
            skus_ = other.skus_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureSkusIsMutable();
            skus_.addAll(other.skus_);
          }
          onChanged();
        }
      } else {
        if (!other.skus_.isEmpty()) {
          if (skusBuilder_.isEmpty()) {
            skusBuilder_.dispose();
            skusBuilder_ = null;
            skus_ = other.skus_;
            bitField0_ = (bitField0_ & ~0x00000001);
            skusBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getSkusFieldBuilder()
                    : null;
          } else {
            skusBuilder_.addAllMessages(other.skus_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
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
                com.google.cloud.channel.v1.Sku m =
                    input.readMessage(com.google.cloud.channel.v1.Sku.parser(), extensionRegistry);
                if (skusBuilder_ == null) {
                  ensureSkusIsMutable();
                  skus_.add(m);
                } else {
                  skusBuilder_.addMessage(m);
                }
                break;
              } // case 10
            case 18:
              {
                nextPageToken_ = input.readStringRequireUtf8();

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

    private int bitField0_;

    private java.util.List<com.google.cloud.channel.v1.Sku> skus_ =
        java.util.Collections.emptyList();

    private void ensureSkusIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        skus_ = new java.util.ArrayList<com.google.cloud.channel.v1.Sku>(skus_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.channel.v1.Sku,
            com.google.cloud.channel.v1.Sku.Builder,
            com.google.cloud.channel.v1.SkuOrBuilder>
        skusBuilder_;

    /**
     *
     *
     * <pre>
     * The list of SKUs requested.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.Sku skus = 1;</code>
     */
    public java.util.List<com.google.cloud.channel.v1.Sku> getSkusList() {
      if (skusBuilder_ == null) {
        return java.util.Collections.unmodifiableList(skus_);
      } else {
        return skusBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * The list of SKUs requested.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.Sku skus = 1;</code>
     */
    public int getSkusCount() {
      if (skusBuilder_ == null) {
        return skus_.size();
      } else {
        return skusBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * The list of SKUs requested.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.Sku skus = 1;</code>
     */
    public com.google.cloud.channel.v1.Sku getSkus(int index) {
      if (skusBuilder_ == null) {
        return skus_.get(index);
      } else {
        return skusBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of SKUs requested.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.Sku skus = 1;</code>
     */
    public Builder setSkus(int index, com.google.cloud.channel.v1.Sku value) {
      if (skusBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSkusIsMutable();
        skus_.set(index, value);
        onChanged();
      } else {
        skusBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of SKUs requested.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.Sku skus = 1;</code>
     */
    public Builder setSkus(int index, com.google.cloud.channel.v1.Sku.Builder builderForValue) {
      if (skusBuilder_ == null) {
        ensureSkusIsMutable();
        skus_.set(index, builderForValue.build());
        onChanged();
      } else {
        skusBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of SKUs requested.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.Sku skus = 1;</code>
     */
    public Builder addSkus(com.google.cloud.channel.v1.Sku value) {
      if (skusBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSkusIsMutable();
        skus_.add(value);
        onChanged();
      } else {
        skusBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of SKUs requested.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.Sku skus = 1;</code>
     */
    public Builder addSkus(int index, com.google.cloud.channel.v1.Sku value) {
      if (skusBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSkusIsMutable();
        skus_.add(index, value);
        onChanged();
      } else {
        skusBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of SKUs requested.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.Sku skus = 1;</code>
     */
    public Builder addSkus(com.google.cloud.channel.v1.Sku.Builder builderForValue) {
      if (skusBuilder_ == null) {
        ensureSkusIsMutable();
        skus_.add(builderForValue.build());
        onChanged();
      } else {
        skusBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of SKUs requested.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.Sku skus = 1;</code>
     */
    public Builder addSkus(int index, com.google.cloud.channel.v1.Sku.Builder builderForValue) {
      if (skusBuilder_ == null) {
        ensureSkusIsMutable();
        skus_.add(index, builderForValue.build());
        onChanged();
      } else {
        skusBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of SKUs requested.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.Sku skus = 1;</code>
     */
    public Builder addAllSkus(
        java.lang.Iterable<? extends com.google.cloud.channel.v1.Sku> values) {
      if (skusBuilder_ == null) {
        ensureSkusIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, skus_);
        onChanged();
      } else {
        skusBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of SKUs requested.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.Sku skus = 1;</code>
     */
    public Builder clearSkus() {
      if (skusBuilder_ == null) {
        skus_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        skusBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of SKUs requested.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.Sku skus = 1;</code>
     */
    public Builder removeSkus(int index) {
      if (skusBuilder_ == null) {
        ensureSkusIsMutable();
        skus_.remove(index);
        onChanged();
      } else {
        skusBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of SKUs requested.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.Sku skus = 1;</code>
     */
    public com.google.cloud.channel.v1.Sku.Builder getSkusBuilder(int index) {
      return getSkusFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * The list of SKUs requested.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.Sku skus = 1;</code>
     */
    public com.google.cloud.channel.v1.SkuOrBuilder getSkusOrBuilder(int index) {
      if (skusBuilder_ == null) {
        return skus_.get(index);
      } else {
        return skusBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of SKUs requested.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.Sku skus = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.channel.v1.SkuOrBuilder>
        getSkusOrBuilderList() {
      if (skusBuilder_ != null) {
        return skusBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(skus_);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of SKUs requested.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.Sku skus = 1;</code>
     */
    public com.google.cloud.channel.v1.Sku.Builder addSkusBuilder() {
      return getSkusFieldBuilder().addBuilder(com.google.cloud.channel.v1.Sku.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The list of SKUs requested.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.Sku skus = 1;</code>
     */
    public com.google.cloud.channel.v1.Sku.Builder addSkusBuilder(int index) {
      return getSkusFieldBuilder()
          .addBuilder(index, com.google.cloud.channel.v1.Sku.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The list of SKUs requested.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.Sku skus = 1;</code>
     */
    public java.util.List<com.google.cloud.channel.v1.Sku.Builder> getSkusBuilderList() {
      return getSkusFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.channel.v1.Sku,
            com.google.cloud.channel.v1.Sku.Builder,
            com.google.cloud.channel.v1.SkuOrBuilder>
        getSkusFieldBuilder() {
      if (skusBuilder_ == null) {
        skusBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.channel.v1.Sku,
                com.google.cloud.channel.v1.Sku.Builder,
                com.google.cloud.channel.v1.SkuOrBuilder>(
                skus_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        skus_ = null;
      }
      return skusBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * A token to retrieve the next page of results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A token to retrieve the next page of results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A token to retrieve the next page of results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      nextPageToken_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A token to retrieve the next page of results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {

      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A token to retrieve the next page of results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      nextPageToken_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.channel.v1.ListSkusResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.channel.v1.ListSkusResponse)
  private static final com.google.cloud.channel.v1.ListSkusResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.channel.v1.ListSkusResponse();
  }

  public static com.google.cloud.channel.v1.ListSkusResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListSkusResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListSkusResponse>() {
        @java.lang.Override
        public ListSkusResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListSkusResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListSkusResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.channel.v1.ListSkusResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
