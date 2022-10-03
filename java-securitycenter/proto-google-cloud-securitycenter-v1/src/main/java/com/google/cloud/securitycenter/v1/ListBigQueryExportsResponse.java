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
// source: google/cloud/securitycenter/v1/securitycenter_service.proto

package com.google.cloud.securitycenter.v1;

/**
 *
 *
 * <pre>
 * Response message for listing BigQuery exports.
 * </pre>
 *
 * Protobuf type {@code google.cloud.securitycenter.v1.ListBigQueryExportsResponse}
 */
public final class ListBigQueryExportsResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.securitycenter.v1.ListBigQueryExportsResponse)
    ListBigQueryExportsResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListBigQueryExportsResponse.newBuilder() to construct.
  private ListBigQueryExportsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListBigQueryExportsResponse() {
    bigQueryExports_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListBigQueryExportsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.securitycenter.v1.SecuritycenterService
        .internal_static_google_cloud_securitycenter_v1_ListBigQueryExportsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.securitycenter.v1.SecuritycenterService
        .internal_static_google_cloud_securitycenter_v1_ListBigQueryExportsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.securitycenter.v1.ListBigQueryExportsResponse.class,
            com.google.cloud.securitycenter.v1.ListBigQueryExportsResponse.Builder.class);
  }

  public static final int BIG_QUERY_EXPORTS_FIELD_NUMBER = 1;
  private java.util.List<com.google.cloud.securitycenter.v1.BigQueryExport> bigQueryExports_;
  /**
   *
   *
   * <pre>
   * The BigQuery exports from the specified parent.
   * </pre>
   *
   * <code>repeated .google.cloud.securitycenter.v1.BigQueryExport big_query_exports = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.securitycenter.v1.BigQueryExport>
      getBigQueryExportsList() {
    return bigQueryExports_;
  }
  /**
   *
   *
   * <pre>
   * The BigQuery exports from the specified parent.
   * </pre>
   *
   * <code>repeated .google.cloud.securitycenter.v1.BigQueryExport big_query_exports = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.securitycenter.v1.BigQueryExportOrBuilder>
      getBigQueryExportsOrBuilderList() {
    return bigQueryExports_;
  }
  /**
   *
   *
   * <pre>
   * The BigQuery exports from the specified parent.
   * </pre>
   *
   * <code>repeated .google.cloud.securitycenter.v1.BigQueryExport big_query_exports = 1;</code>
   */
  @java.lang.Override
  public int getBigQueryExportsCount() {
    return bigQueryExports_.size();
  }
  /**
   *
   *
   * <pre>
   * The BigQuery exports from the specified parent.
   * </pre>
   *
   * <code>repeated .google.cloud.securitycenter.v1.BigQueryExport big_query_exports = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.securitycenter.v1.BigQueryExport getBigQueryExports(int index) {
    return bigQueryExports_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The BigQuery exports from the specified parent.
   * </pre>
   *
   * <code>repeated .google.cloud.securitycenter.v1.BigQueryExport big_query_exports = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.securitycenter.v1.BigQueryExportOrBuilder getBigQueryExportsOrBuilder(
      int index) {
    return bigQueryExports_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   *
   *
   * <pre>
   * A token, which can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
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
   * A token, which can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
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
    for (int i = 0; i < bigQueryExports_.size(); i++) {
      output.writeMessage(1, bigQueryExports_.get(i));
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
    for (int i = 0; i < bigQueryExports_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, bigQueryExports_.get(i));
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
    if (!(obj instanceof com.google.cloud.securitycenter.v1.ListBigQueryExportsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.securitycenter.v1.ListBigQueryExportsResponse other =
        (com.google.cloud.securitycenter.v1.ListBigQueryExportsResponse) obj;

    if (!getBigQueryExportsList().equals(other.getBigQueryExportsList())) return false;
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
    if (getBigQueryExportsCount() > 0) {
      hash = (37 * hash) + BIG_QUERY_EXPORTS_FIELD_NUMBER;
      hash = (53 * hash) + getBigQueryExportsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.securitycenter.v1.ListBigQueryExportsResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.securitycenter.v1.ListBigQueryExportsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v1.ListBigQueryExportsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.securitycenter.v1.ListBigQueryExportsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v1.ListBigQueryExportsResponse parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.securitycenter.v1.ListBigQueryExportsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v1.ListBigQueryExportsResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.securitycenter.v1.ListBigQueryExportsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v1.ListBigQueryExportsResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.securitycenter.v1.ListBigQueryExportsResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v1.ListBigQueryExportsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.securitycenter.v1.ListBigQueryExportsResponse parseFrom(
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
      com.google.cloud.securitycenter.v1.ListBigQueryExportsResponse prototype) {
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
   * Response message for listing BigQuery exports.
   * </pre>
   *
   * Protobuf type {@code google.cloud.securitycenter.v1.ListBigQueryExportsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.securitycenter.v1.ListBigQueryExportsResponse)
      com.google.cloud.securitycenter.v1.ListBigQueryExportsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.securitycenter.v1.SecuritycenterService
          .internal_static_google_cloud_securitycenter_v1_ListBigQueryExportsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.securitycenter.v1.SecuritycenterService
          .internal_static_google_cloud_securitycenter_v1_ListBigQueryExportsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.securitycenter.v1.ListBigQueryExportsResponse.class,
              com.google.cloud.securitycenter.v1.ListBigQueryExportsResponse.Builder.class);
    }

    // Construct using com.google.cloud.securitycenter.v1.ListBigQueryExportsResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (bigQueryExportsBuilder_ == null) {
        bigQueryExports_ = java.util.Collections.emptyList();
      } else {
        bigQueryExports_ = null;
        bigQueryExportsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.securitycenter.v1.SecuritycenterService
          .internal_static_google_cloud_securitycenter_v1_ListBigQueryExportsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.securitycenter.v1.ListBigQueryExportsResponse
        getDefaultInstanceForType() {
      return com.google.cloud.securitycenter.v1.ListBigQueryExportsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.securitycenter.v1.ListBigQueryExportsResponse build() {
      com.google.cloud.securitycenter.v1.ListBigQueryExportsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.securitycenter.v1.ListBigQueryExportsResponse buildPartial() {
      com.google.cloud.securitycenter.v1.ListBigQueryExportsResponse result =
          new com.google.cloud.securitycenter.v1.ListBigQueryExportsResponse(this);
      int from_bitField0_ = bitField0_;
      if (bigQueryExportsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          bigQueryExports_ = java.util.Collections.unmodifiableList(bigQueryExports_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.bigQueryExports_ = bigQueryExports_;
      } else {
        result.bigQueryExports_ = bigQueryExportsBuilder_.build();
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
      if (other instanceof com.google.cloud.securitycenter.v1.ListBigQueryExportsResponse) {
        return mergeFrom((com.google.cloud.securitycenter.v1.ListBigQueryExportsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.securitycenter.v1.ListBigQueryExportsResponse other) {
      if (other
          == com.google.cloud.securitycenter.v1.ListBigQueryExportsResponse.getDefaultInstance())
        return this;
      if (bigQueryExportsBuilder_ == null) {
        if (!other.bigQueryExports_.isEmpty()) {
          if (bigQueryExports_.isEmpty()) {
            bigQueryExports_ = other.bigQueryExports_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureBigQueryExportsIsMutable();
            bigQueryExports_.addAll(other.bigQueryExports_);
          }
          onChanged();
        }
      } else {
        if (!other.bigQueryExports_.isEmpty()) {
          if (bigQueryExportsBuilder_.isEmpty()) {
            bigQueryExportsBuilder_.dispose();
            bigQueryExportsBuilder_ = null;
            bigQueryExports_ = other.bigQueryExports_;
            bitField0_ = (bitField0_ & ~0x00000001);
            bigQueryExportsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getBigQueryExportsFieldBuilder()
                    : null;
          } else {
            bigQueryExportsBuilder_.addAllMessages(other.bigQueryExports_);
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
                com.google.cloud.securitycenter.v1.BigQueryExport m =
                    input.readMessage(
                        com.google.cloud.securitycenter.v1.BigQueryExport.parser(),
                        extensionRegistry);
                if (bigQueryExportsBuilder_ == null) {
                  ensureBigQueryExportsIsMutable();
                  bigQueryExports_.add(m);
                } else {
                  bigQueryExportsBuilder_.addMessage(m);
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

    private java.util.List<com.google.cloud.securitycenter.v1.BigQueryExport> bigQueryExports_ =
        java.util.Collections.emptyList();

    private void ensureBigQueryExportsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        bigQueryExports_ =
            new java.util.ArrayList<com.google.cloud.securitycenter.v1.BigQueryExport>(
                bigQueryExports_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.securitycenter.v1.BigQueryExport,
            com.google.cloud.securitycenter.v1.BigQueryExport.Builder,
            com.google.cloud.securitycenter.v1.BigQueryExportOrBuilder>
        bigQueryExportsBuilder_;

    /**
     *
     *
     * <pre>
     * The BigQuery exports from the specified parent.
     * </pre>
     *
     * <code>repeated .google.cloud.securitycenter.v1.BigQueryExport big_query_exports = 1;</code>
     */
    public java.util.List<com.google.cloud.securitycenter.v1.BigQueryExport>
        getBigQueryExportsList() {
      if (bigQueryExportsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(bigQueryExports_);
      } else {
        return bigQueryExportsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * The BigQuery exports from the specified parent.
     * </pre>
     *
     * <code>repeated .google.cloud.securitycenter.v1.BigQueryExport big_query_exports = 1;</code>
     */
    public int getBigQueryExportsCount() {
      if (bigQueryExportsBuilder_ == null) {
        return bigQueryExports_.size();
      } else {
        return bigQueryExportsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * The BigQuery exports from the specified parent.
     * </pre>
     *
     * <code>repeated .google.cloud.securitycenter.v1.BigQueryExport big_query_exports = 1;</code>
     */
    public com.google.cloud.securitycenter.v1.BigQueryExport getBigQueryExports(int index) {
      if (bigQueryExportsBuilder_ == null) {
        return bigQueryExports_.get(index);
      } else {
        return bigQueryExportsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The BigQuery exports from the specified parent.
     * </pre>
     *
     * <code>repeated .google.cloud.securitycenter.v1.BigQueryExport big_query_exports = 1;</code>
     */
    public Builder setBigQueryExports(
        int index, com.google.cloud.securitycenter.v1.BigQueryExport value) {
      if (bigQueryExportsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBigQueryExportsIsMutable();
        bigQueryExports_.set(index, value);
        onChanged();
      } else {
        bigQueryExportsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The BigQuery exports from the specified parent.
     * </pre>
     *
     * <code>repeated .google.cloud.securitycenter.v1.BigQueryExport big_query_exports = 1;</code>
     */
    public Builder setBigQueryExports(
        int index, com.google.cloud.securitycenter.v1.BigQueryExport.Builder builderForValue) {
      if (bigQueryExportsBuilder_ == null) {
        ensureBigQueryExportsIsMutable();
        bigQueryExports_.set(index, builderForValue.build());
        onChanged();
      } else {
        bigQueryExportsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The BigQuery exports from the specified parent.
     * </pre>
     *
     * <code>repeated .google.cloud.securitycenter.v1.BigQueryExport big_query_exports = 1;</code>
     */
    public Builder addBigQueryExports(com.google.cloud.securitycenter.v1.BigQueryExport value) {
      if (bigQueryExportsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBigQueryExportsIsMutable();
        bigQueryExports_.add(value);
        onChanged();
      } else {
        bigQueryExportsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The BigQuery exports from the specified parent.
     * </pre>
     *
     * <code>repeated .google.cloud.securitycenter.v1.BigQueryExport big_query_exports = 1;</code>
     */
    public Builder addBigQueryExports(
        int index, com.google.cloud.securitycenter.v1.BigQueryExport value) {
      if (bigQueryExportsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBigQueryExportsIsMutable();
        bigQueryExports_.add(index, value);
        onChanged();
      } else {
        bigQueryExportsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The BigQuery exports from the specified parent.
     * </pre>
     *
     * <code>repeated .google.cloud.securitycenter.v1.BigQueryExport big_query_exports = 1;</code>
     */
    public Builder addBigQueryExports(
        com.google.cloud.securitycenter.v1.BigQueryExport.Builder builderForValue) {
      if (bigQueryExportsBuilder_ == null) {
        ensureBigQueryExportsIsMutable();
        bigQueryExports_.add(builderForValue.build());
        onChanged();
      } else {
        bigQueryExportsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The BigQuery exports from the specified parent.
     * </pre>
     *
     * <code>repeated .google.cloud.securitycenter.v1.BigQueryExport big_query_exports = 1;</code>
     */
    public Builder addBigQueryExports(
        int index, com.google.cloud.securitycenter.v1.BigQueryExport.Builder builderForValue) {
      if (bigQueryExportsBuilder_ == null) {
        ensureBigQueryExportsIsMutable();
        bigQueryExports_.add(index, builderForValue.build());
        onChanged();
      } else {
        bigQueryExportsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The BigQuery exports from the specified parent.
     * </pre>
     *
     * <code>repeated .google.cloud.securitycenter.v1.BigQueryExport big_query_exports = 1;</code>
     */
    public Builder addAllBigQueryExports(
        java.lang.Iterable<? extends com.google.cloud.securitycenter.v1.BigQueryExport> values) {
      if (bigQueryExportsBuilder_ == null) {
        ensureBigQueryExportsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, bigQueryExports_);
        onChanged();
      } else {
        bigQueryExportsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The BigQuery exports from the specified parent.
     * </pre>
     *
     * <code>repeated .google.cloud.securitycenter.v1.BigQueryExport big_query_exports = 1;</code>
     */
    public Builder clearBigQueryExports() {
      if (bigQueryExportsBuilder_ == null) {
        bigQueryExports_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        bigQueryExportsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The BigQuery exports from the specified parent.
     * </pre>
     *
     * <code>repeated .google.cloud.securitycenter.v1.BigQueryExport big_query_exports = 1;</code>
     */
    public Builder removeBigQueryExports(int index) {
      if (bigQueryExportsBuilder_ == null) {
        ensureBigQueryExportsIsMutable();
        bigQueryExports_.remove(index);
        onChanged();
      } else {
        bigQueryExportsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The BigQuery exports from the specified parent.
     * </pre>
     *
     * <code>repeated .google.cloud.securitycenter.v1.BigQueryExport big_query_exports = 1;</code>
     */
    public com.google.cloud.securitycenter.v1.BigQueryExport.Builder getBigQueryExportsBuilder(
        int index) {
      return getBigQueryExportsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * The BigQuery exports from the specified parent.
     * </pre>
     *
     * <code>repeated .google.cloud.securitycenter.v1.BigQueryExport big_query_exports = 1;</code>
     */
    public com.google.cloud.securitycenter.v1.BigQueryExportOrBuilder getBigQueryExportsOrBuilder(
        int index) {
      if (bigQueryExportsBuilder_ == null) {
        return bigQueryExports_.get(index);
      } else {
        return bigQueryExportsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The BigQuery exports from the specified parent.
     * </pre>
     *
     * <code>repeated .google.cloud.securitycenter.v1.BigQueryExport big_query_exports = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.securitycenter.v1.BigQueryExportOrBuilder>
        getBigQueryExportsOrBuilderList() {
      if (bigQueryExportsBuilder_ != null) {
        return bigQueryExportsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(bigQueryExports_);
      }
    }
    /**
     *
     *
     * <pre>
     * The BigQuery exports from the specified parent.
     * </pre>
     *
     * <code>repeated .google.cloud.securitycenter.v1.BigQueryExport big_query_exports = 1;</code>
     */
    public com.google.cloud.securitycenter.v1.BigQueryExport.Builder addBigQueryExportsBuilder() {
      return getBigQueryExportsFieldBuilder()
          .addBuilder(com.google.cloud.securitycenter.v1.BigQueryExport.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The BigQuery exports from the specified parent.
     * </pre>
     *
     * <code>repeated .google.cloud.securitycenter.v1.BigQueryExport big_query_exports = 1;</code>
     */
    public com.google.cloud.securitycenter.v1.BigQueryExport.Builder addBigQueryExportsBuilder(
        int index) {
      return getBigQueryExportsFieldBuilder()
          .addBuilder(
              index, com.google.cloud.securitycenter.v1.BigQueryExport.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The BigQuery exports from the specified parent.
     * </pre>
     *
     * <code>repeated .google.cloud.securitycenter.v1.BigQueryExport big_query_exports = 1;</code>
     */
    public java.util.List<com.google.cloud.securitycenter.v1.BigQueryExport.Builder>
        getBigQueryExportsBuilderList() {
      return getBigQueryExportsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.securitycenter.v1.BigQueryExport,
            com.google.cloud.securitycenter.v1.BigQueryExport.Builder,
            com.google.cloud.securitycenter.v1.BigQueryExportOrBuilder>
        getBigQueryExportsFieldBuilder() {
      if (bigQueryExportsBuilder_ == null) {
        bigQueryExportsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.securitycenter.v1.BigQueryExport,
                com.google.cloud.securitycenter.v1.BigQueryExport.Builder,
                com.google.cloud.securitycenter.v1.BigQueryExportOrBuilder>(
                bigQueryExports_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        bigQueryExports_ = null;
      }
      return bigQueryExportsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * A token, which can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
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
     * A token, which can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
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
     * A token, which can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
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
     * A token, which can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
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
     * A token, which can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
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

    // @@protoc_insertion_point(builder_scope:google.cloud.securitycenter.v1.ListBigQueryExportsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.securitycenter.v1.ListBigQueryExportsResponse)
  private static final com.google.cloud.securitycenter.v1.ListBigQueryExportsResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.securitycenter.v1.ListBigQueryExportsResponse();
  }

  public static com.google.cloud.securitycenter.v1.ListBigQueryExportsResponse
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListBigQueryExportsResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListBigQueryExportsResponse>() {
        @java.lang.Override
        public ListBigQueryExportsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListBigQueryExportsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListBigQueryExportsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.securitycenter.v1.ListBigQueryExportsResponse
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
