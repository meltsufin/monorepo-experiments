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
// source: google/cloud/asset/v1p1beta1/asset_service.proto

package com.google.cloud.asset.v1p1beta1;

/**
 *
 *
 * <pre>
 * Search all resources response.
 * </pre>
 *
 * Protobuf type {@code google.cloud.asset.v1p1beta1.SearchAllResourcesResponse}
 */
public final class SearchAllResourcesResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.asset.v1p1beta1.SearchAllResourcesResponse)
    SearchAllResourcesResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use SearchAllResourcesResponse.newBuilder() to construct.
  private SearchAllResourcesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SearchAllResourcesResponse() {
    results_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new SearchAllResourcesResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.asset.v1p1beta1.AssetServiceProto
        .internal_static_google_cloud_asset_v1p1beta1_SearchAllResourcesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.asset.v1p1beta1.AssetServiceProto
        .internal_static_google_cloud_asset_v1p1beta1_SearchAllResourcesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.asset.v1p1beta1.SearchAllResourcesResponse.class,
            com.google.cloud.asset.v1p1beta1.SearchAllResourcesResponse.Builder.class);
  }

  public static final int RESULTS_FIELD_NUMBER = 1;
  private java.util.List<com.google.cloud.asset.v1p1beta1.StandardResourceMetadata> results_;
  /**
   *
   *
   * <pre>
   * A list of resource that match the search query.
   * </pre>
   *
   * <code>repeated .google.cloud.asset.v1p1beta1.StandardResourceMetadata results = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.asset.v1p1beta1.StandardResourceMetadata>
      getResultsList() {
    return results_;
  }
  /**
   *
   *
   * <pre>
   * A list of resource that match the search query.
   * </pre>
   *
   * <code>repeated .google.cloud.asset.v1p1beta1.StandardResourceMetadata results = 1;</code>
   */
  @java.lang.Override
  public java.util.List<
          ? extends com.google.cloud.asset.v1p1beta1.StandardResourceMetadataOrBuilder>
      getResultsOrBuilderList() {
    return results_;
  }
  /**
   *
   *
   * <pre>
   * A list of resource that match the search query.
   * </pre>
   *
   * <code>repeated .google.cloud.asset.v1p1beta1.StandardResourceMetadata results = 1;</code>
   */
  @java.lang.Override
  public int getResultsCount() {
    return results_.size();
  }
  /**
   *
   *
   * <pre>
   * A list of resource that match the search query.
   * </pre>
   *
   * <code>repeated .google.cloud.asset.v1p1beta1.StandardResourceMetadata results = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.asset.v1p1beta1.StandardResourceMetadata getResults(int index) {
    return results_.get(index);
  }
  /**
   *
   *
   * <pre>
   * A list of resource that match the search query.
   * </pre>
   *
   * <code>repeated .google.cloud.asset.v1p1beta1.StandardResourceMetadata results = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.asset.v1p1beta1.StandardResourceMetadataOrBuilder getResultsOrBuilder(
      int index) {
    return results_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   *
   *
   * <pre>
   * If there are more results than those appearing in this response, then
   * `next_page_token` is included.  To get the next set of results, call this
   * method again using the value of `next_page_token` as `page_token`.
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
   * If there are more results than those appearing in this response, then
   * `next_page_token` is included.  To get the next set of results, call this
   * method again using the value of `next_page_token` as `page_token`.
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
    for (int i = 0; i < results_.size(); i++) {
      output.writeMessage(1, results_.get(i));
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
    for (int i = 0; i < results_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, results_.get(i));
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
    if (!(obj instanceof com.google.cloud.asset.v1p1beta1.SearchAllResourcesResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.asset.v1p1beta1.SearchAllResourcesResponse other =
        (com.google.cloud.asset.v1p1beta1.SearchAllResourcesResponse) obj;

    if (!getResultsList().equals(other.getResultsList())) return false;
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
    if (getResultsCount() > 0) {
      hash = (37 * hash) + RESULTS_FIELD_NUMBER;
      hash = (53 * hash) + getResultsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.asset.v1p1beta1.SearchAllResourcesResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.asset.v1p1beta1.SearchAllResourcesResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.asset.v1p1beta1.SearchAllResourcesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.asset.v1p1beta1.SearchAllResourcesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.asset.v1p1beta1.SearchAllResourcesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.asset.v1p1beta1.SearchAllResourcesResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.asset.v1p1beta1.SearchAllResourcesResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.asset.v1p1beta1.SearchAllResourcesResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.asset.v1p1beta1.SearchAllResourcesResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.asset.v1p1beta1.SearchAllResourcesResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.asset.v1p1beta1.SearchAllResourcesResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.asset.v1p1beta1.SearchAllResourcesResponse parseFrom(
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
      com.google.cloud.asset.v1p1beta1.SearchAllResourcesResponse prototype) {
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
   * Search all resources response.
   * </pre>
   *
   * Protobuf type {@code google.cloud.asset.v1p1beta1.SearchAllResourcesResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.asset.v1p1beta1.SearchAllResourcesResponse)
      com.google.cloud.asset.v1p1beta1.SearchAllResourcesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.asset.v1p1beta1.AssetServiceProto
          .internal_static_google_cloud_asset_v1p1beta1_SearchAllResourcesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.asset.v1p1beta1.AssetServiceProto
          .internal_static_google_cloud_asset_v1p1beta1_SearchAllResourcesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.asset.v1p1beta1.SearchAllResourcesResponse.class,
              com.google.cloud.asset.v1p1beta1.SearchAllResourcesResponse.Builder.class);
    }

    // Construct using com.google.cloud.asset.v1p1beta1.SearchAllResourcesResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (resultsBuilder_ == null) {
        results_ = java.util.Collections.emptyList();
      } else {
        results_ = null;
        resultsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.asset.v1p1beta1.AssetServiceProto
          .internal_static_google_cloud_asset_v1p1beta1_SearchAllResourcesResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.asset.v1p1beta1.SearchAllResourcesResponse getDefaultInstanceForType() {
      return com.google.cloud.asset.v1p1beta1.SearchAllResourcesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.asset.v1p1beta1.SearchAllResourcesResponse build() {
      com.google.cloud.asset.v1p1beta1.SearchAllResourcesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.asset.v1p1beta1.SearchAllResourcesResponse buildPartial() {
      com.google.cloud.asset.v1p1beta1.SearchAllResourcesResponse result =
          new com.google.cloud.asset.v1p1beta1.SearchAllResourcesResponse(this);
      int from_bitField0_ = bitField0_;
      if (resultsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          results_ = java.util.Collections.unmodifiableList(results_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.results_ = results_;
      } else {
        result.results_ = resultsBuilder_.build();
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
      if (other instanceof com.google.cloud.asset.v1p1beta1.SearchAllResourcesResponse) {
        return mergeFrom((com.google.cloud.asset.v1p1beta1.SearchAllResourcesResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.asset.v1p1beta1.SearchAllResourcesResponse other) {
      if (other == com.google.cloud.asset.v1p1beta1.SearchAllResourcesResponse.getDefaultInstance())
        return this;
      if (resultsBuilder_ == null) {
        if (!other.results_.isEmpty()) {
          if (results_.isEmpty()) {
            results_ = other.results_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureResultsIsMutable();
            results_.addAll(other.results_);
          }
          onChanged();
        }
      } else {
        if (!other.results_.isEmpty()) {
          if (resultsBuilder_.isEmpty()) {
            resultsBuilder_.dispose();
            resultsBuilder_ = null;
            results_ = other.results_;
            bitField0_ = (bitField0_ & ~0x00000001);
            resultsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getResultsFieldBuilder()
                    : null;
          } else {
            resultsBuilder_.addAllMessages(other.results_);
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
                com.google.cloud.asset.v1p1beta1.StandardResourceMetadata m =
                    input.readMessage(
                        com.google.cloud.asset.v1p1beta1.StandardResourceMetadata.parser(),
                        extensionRegistry);
                if (resultsBuilder_ == null) {
                  ensureResultsIsMutable();
                  results_.add(m);
                } else {
                  resultsBuilder_.addMessage(m);
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

    private java.util.List<com.google.cloud.asset.v1p1beta1.StandardResourceMetadata> results_ =
        java.util.Collections.emptyList();

    private void ensureResultsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        results_ =
            new java.util.ArrayList<com.google.cloud.asset.v1p1beta1.StandardResourceMetadata>(
                results_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.asset.v1p1beta1.StandardResourceMetadata,
            com.google.cloud.asset.v1p1beta1.StandardResourceMetadata.Builder,
            com.google.cloud.asset.v1p1beta1.StandardResourceMetadataOrBuilder>
        resultsBuilder_;

    /**
     *
     *
     * <pre>
     * A list of resource that match the search query.
     * </pre>
     *
     * <code>repeated .google.cloud.asset.v1p1beta1.StandardResourceMetadata results = 1;</code>
     */
    public java.util.List<com.google.cloud.asset.v1p1beta1.StandardResourceMetadata>
        getResultsList() {
      if (resultsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(results_);
      } else {
        return resultsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * A list of resource that match the search query.
     * </pre>
     *
     * <code>repeated .google.cloud.asset.v1p1beta1.StandardResourceMetadata results = 1;</code>
     */
    public int getResultsCount() {
      if (resultsBuilder_ == null) {
        return results_.size();
      } else {
        return resultsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * A list of resource that match the search query.
     * </pre>
     *
     * <code>repeated .google.cloud.asset.v1p1beta1.StandardResourceMetadata results = 1;</code>
     */
    public com.google.cloud.asset.v1p1beta1.StandardResourceMetadata getResults(int index) {
      if (resultsBuilder_ == null) {
        return results_.get(index);
      } else {
        return resultsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * A list of resource that match the search query.
     * </pre>
     *
     * <code>repeated .google.cloud.asset.v1p1beta1.StandardResourceMetadata results = 1;</code>
     */
    public Builder setResults(
        int index, com.google.cloud.asset.v1p1beta1.StandardResourceMetadata value) {
      if (resultsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResultsIsMutable();
        results_.set(index, value);
        onChanged();
      } else {
        resultsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of resource that match the search query.
     * </pre>
     *
     * <code>repeated .google.cloud.asset.v1p1beta1.StandardResourceMetadata results = 1;</code>
     */
    public Builder setResults(
        int index,
        com.google.cloud.asset.v1p1beta1.StandardResourceMetadata.Builder builderForValue) {
      if (resultsBuilder_ == null) {
        ensureResultsIsMutable();
        results_.set(index, builderForValue.build());
        onChanged();
      } else {
        resultsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of resource that match the search query.
     * </pre>
     *
     * <code>repeated .google.cloud.asset.v1p1beta1.StandardResourceMetadata results = 1;</code>
     */
    public Builder addResults(com.google.cloud.asset.v1p1beta1.StandardResourceMetadata value) {
      if (resultsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResultsIsMutable();
        results_.add(value);
        onChanged();
      } else {
        resultsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of resource that match the search query.
     * </pre>
     *
     * <code>repeated .google.cloud.asset.v1p1beta1.StandardResourceMetadata results = 1;</code>
     */
    public Builder addResults(
        int index, com.google.cloud.asset.v1p1beta1.StandardResourceMetadata value) {
      if (resultsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResultsIsMutable();
        results_.add(index, value);
        onChanged();
      } else {
        resultsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of resource that match the search query.
     * </pre>
     *
     * <code>repeated .google.cloud.asset.v1p1beta1.StandardResourceMetadata results = 1;</code>
     */
    public Builder addResults(
        com.google.cloud.asset.v1p1beta1.StandardResourceMetadata.Builder builderForValue) {
      if (resultsBuilder_ == null) {
        ensureResultsIsMutable();
        results_.add(builderForValue.build());
        onChanged();
      } else {
        resultsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of resource that match the search query.
     * </pre>
     *
     * <code>repeated .google.cloud.asset.v1p1beta1.StandardResourceMetadata results = 1;</code>
     */
    public Builder addResults(
        int index,
        com.google.cloud.asset.v1p1beta1.StandardResourceMetadata.Builder builderForValue) {
      if (resultsBuilder_ == null) {
        ensureResultsIsMutable();
        results_.add(index, builderForValue.build());
        onChanged();
      } else {
        resultsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of resource that match the search query.
     * </pre>
     *
     * <code>repeated .google.cloud.asset.v1p1beta1.StandardResourceMetadata results = 1;</code>
     */
    public Builder addAllResults(
        java.lang.Iterable<? extends com.google.cloud.asset.v1p1beta1.StandardResourceMetadata>
            values) {
      if (resultsBuilder_ == null) {
        ensureResultsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, results_);
        onChanged();
      } else {
        resultsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of resource that match the search query.
     * </pre>
     *
     * <code>repeated .google.cloud.asset.v1p1beta1.StandardResourceMetadata results = 1;</code>
     */
    public Builder clearResults() {
      if (resultsBuilder_ == null) {
        results_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        resultsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of resource that match the search query.
     * </pre>
     *
     * <code>repeated .google.cloud.asset.v1p1beta1.StandardResourceMetadata results = 1;</code>
     */
    public Builder removeResults(int index) {
      if (resultsBuilder_ == null) {
        ensureResultsIsMutable();
        results_.remove(index);
        onChanged();
      } else {
        resultsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of resource that match the search query.
     * </pre>
     *
     * <code>repeated .google.cloud.asset.v1p1beta1.StandardResourceMetadata results = 1;</code>
     */
    public com.google.cloud.asset.v1p1beta1.StandardResourceMetadata.Builder getResultsBuilder(
        int index) {
      return getResultsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * A list of resource that match the search query.
     * </pre>
     *
     * <code>repeated .google.cloud.asset.v1p1beta1.StandardResourceMetadata results = 1;</code>
     */
    public com.google.cloud.asset.v1p1beta1.StandardResourceMetadataOrBuilder getResultsOrBuilder(
        int index) {
      if (resultsBuilder_ == null) {
        return results_.get(index);
      } else {
        return resultsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * A list of resource that match the search query.
     * </pre>
     *
     * <code>repeated .google.cloud.asset.v1p1beta1.StandardResourceMetadata results = 1;</code>
     */
    public java.util.List<
            ? extends com.google.cloud.asset.v1p1beta1.StandardResourceMetadataOrBuilder>
        getResultsOrBuilderList() {
      if (resultsBuilder_ != null) {
        return resultsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(results_);
      }
    }
    /**
     *
     *
     * <pre>
     * A list of resource that match the search query.
     * </pre>
     *
     * <code>repeated .google.cloud.asset.v1p1beta1.StandardResourceMetadata results = 1;</code>
     */
    public com.google.cloud.asset.v1p1beta1.StandardResourceMetadata.Builder addResultsBuilder() {
      return getResultsFieldBuilder()
          .addBuilder(
              com.google.cloud.asset.v1p1beta1.StandardResourceMetadata.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * A list of resource that match the search query.
     * </pre>
     *
     * <code>repeated .google.cloud.asset.v1p1beta1.StandardResourceMetadata results = 1;</code>
     */
    public com.google.cloud.asset.v1p1beta1.StandardResourceMetadata.Builder addResultsBuilder(
        int index) {
      return getResultsFieldBuilder()
          .addBuilder(
              index,
              com.google.cloud.asset.v1p1beta1.StandardResourceMetadata.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * A list of resource that match the search query.
     * </pre>
     *
     * <code>repeated .google.cloud.asset.v1p1beta1.StandardResourceMetadata results = 1;</code>
     */
    public java.util.List<com.google.cloud.asset.v1p1beta1.StandardResourceMetadata.Builder>
        getResultsBuilderList() {
      return getResultsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.asset.v1p1beta1.StandardResourceMetadata,
            com.google.cloud.asset.v1p1beta1.StandardResourceMetadata.Builder,
            com.google.cloud.asset.v1p1beta1.StandardResourceMetadataOrBuilder>
        getResultsFieldBuilder() {
      if (resultsBuilder_ == null) {
        resultsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.asset.v1p1beta1.StandardResourceMetadata,
                com.google.cloud.asset.v1p1beta1.StandardResourceMetadata.Builder,
                com.google.cloud.asset.v1p1beta1.StandardResourceMetadataOrBuilder>(
                results_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        results_ = null;
      }
      return resultsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * If there are more results than those appearing in this response, then
     * `next_page_token` is included.  To get the next set of results, call this
     * method again using the value of `next_page_token` as `page_token`.
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
     * If there are more results than those appearing in this response, then
     * `next_page_token` is included.  To get the next set of results, call this
     * method again using the value of `next_page_token` as `page_token`.
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
     * If there are more results than those appearing in this response, then
     * `next_page_token` is included.  To get the next set of results, call this
     * method again using the value of `next_page_token` as `page_token`.
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
     * If there are more results than those appearing in this response, then
     * `next_page_token` is included.  To get the next set of results, call this
     * method again using the value of `next_page_token` as `page_token`.
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
     * If there are more results than those appearing in this response, then
     * `next_page_token` is included.  To get the next set of results, call this
     * method again using the value of `next_page_token` as `page_token`.
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

    // @@protoc_insertion_point(builder_scope:google.cloud.asset.v1p1beta1.SearchAllResourcesResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.asset.v1p1beta1.SearchAllResourcesResponse)
  private static final com.google.cloud.asset.v1p1beta1.SearchAllResourcesResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.asset.v1p1beta1.SearchAllResourcesResponse();
  }

  public static com.google.cloud.asset.v1p1beta1.SearchAllResourcesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SearchAllResourcesResponse> PARSER =
      new com.google.protobuf.AbstractParser<SearchAllResourcesResponse>() {
        @java.lang.Override
        public SearchAllResourcesResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<SearchAllResourcesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SearchAllResourcesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.asset.v1p1beta1.SearchAllResourcesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}