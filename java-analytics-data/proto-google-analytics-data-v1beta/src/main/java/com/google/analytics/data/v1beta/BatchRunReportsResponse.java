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
// source: google/analytics/data/v1beta/analytics_data_api.proto

package com.google.analytics.data.v1beta;

/**
 *
 *
 * <pre>
 * The batch response containing multiple reports.
 * </pre>
 *
 * Protobuf type {@code google.analytics.data.v1beta.BatchRunReportsResponse}
 */
public final class BatchRunReportsResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.analytics.data.v1beta.BatchRunReportsResponse)
    BatchRunReportsResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use BatchRunReportsResponse.newBuilder() to construct.
  private BatchRunReportsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private BatchRunReportsResponse() {
    reports_ = java.util.Collections.emptyList();
    kind_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new BatchRunReportsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.analytics.data.v1beta.AnalyticsDataApiProto
        .internal_static_google_analytics_data_v1beta_BatchRunReportsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.analytics.data.v1beta.AnalyticsDataApiProto
        .internal_static_google_analytics_data_v1beta_BatchRunReportsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.analytics.data.v1beta.BatchRunReportsResponse.class,
            com.google.analytics.data.v1beta.BatchRunReportsResponse.Builder.class);
  }

  public static final int REPORTS_FIELD_NUMBER = 1;
  private java.util.List<com.google.analytics.data.v1beta.RunReportResponse> reports_;
  /**
   *
   *
   * <pre>
   * Individual responses. Each response has a separate report request.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1beta.RunReportResponse reports = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.analytics.data.v1beta.RunReportResponse> getReportsList() {
    return reports_;
  }
  /**
   *
   *
   * <pre>
   * Individual responses. Each response has a separate report request.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1beta.RunReportResponse reports = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.analytics.data.v1beta.RunReportResponseOrBuilder>
      getReportsOrBuilderList() {
    return reports_;
  }
  /**
   *
   *
   * <pre>
   * Individual responses. Each response has a separate report request.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1beta.RunReportResponse reports = 1;</code>
   */
  @java.lang.Override
  public int getReportsCount() {
    return reports_.size();
  }
  /**
   *
   *
   * <pre>
   * Individual responses. Each response has a separate report request.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1beta.RunReportResponse reports = 1;</code>
   */
  @java.lang.Override
  public com.google.analytics.data.v1beta.RunReportResponse getReports(int index) {
    return reports_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Individual responses. Each response has a separate report request.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1beta.RunReportResponse reports = 1;</code>
   */
  @java.lang.Override
  public com.google.analytics.data.v1beta.RunReportResponseOrBuilder getReportsOrBuilder(
      int index) {
    return reports_.get(index);
  }

  public static final int KIND_FIELD_NUMBER = 2;
  private volatile java.lang.Object kind_;
  /**
   *
   *
   * <pre>
   * Identifies what kind of resource this message is. This `kind` is always the
   * fixed string "analyticsData#batchRunReports". Useful to distinguish between
   * response types in JSON.
   * </pre>
   *
   * <code>string kind = 2;</code>
   *
   * @return The kind.
   */
  @java.lang.Override
  public java.lang.String getKind() {
    java.lang.Object ref = kind_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      kind_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Identifies what kind of resource this message is. This `kind` is always the
   * fixed string "analyticsData#batchRunReports". Useful to distinguish between
   * response types in JSON.
   * </pre>
   *
   * <code>string kind = 2;</code>
   *
   * @return The bytes for kind.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getKindBytes() {
    java.lang.Object ref = kind_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      kind_ = b;
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
    for (int i = 0; i < reports_.size(); i++) {
      output.writeMessage(1, reports_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(kind_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, kind_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < reports_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, reports_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(kind_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, kind_);
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
    if (!(obj instanceof com.google.analytics.data.v1beta.BatchRunReportsResponse)) {
      return super.equals(obj);
    }
    com.google.analytics.data.v1beta.BatchRunReportsResponse other =
        (com.google.analytics.data.v1beta.BatchRunReportsResponse) obj;

    if (!getReportsList().equals(other.getReportsList())) return false;
    if (!getKind().equals(other.getKind())) return false;
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
    if (getReportsCount() > 0) {
      hash = (37 * hash) + REPORTS_FIELD_NUMBER;
      hash = (53 * hash) + getReportsList().hashCode();
    }
    hash = (37 * hash) + KIND_FIELD_NUMBER;
    hash = (53 * hash) + getKind().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.analytics.data.v1beta.BatchRunReportsResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1beta.BatchRunReportsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1beta.BatchRunReportsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1beta.BatchRunReportsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1beta.BatchRunReportsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1beta.BatchRunReportsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1beta.BatchRunReportsResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1beta.BatchRunReportsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.data.v1beta.BatchRunReportsResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1beta.BatchRunReportsResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.data.v1beta.BatchRunReportsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1beta.BatchRunReportsResponse parseFrom(
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
      com.google.analytics.data.v1beta.BatchRunReportsResponse prototype) {
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
   * The batch response containing multiple reports.
   * </pre>
   *
   * Protobuf type {@code google.analytics.data.v1beta.BatchRunReportsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.analytics.data.v1beta.BatchRunReportsResponse)
      com.google.analytics.data.v1beta.BatchRunReportsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.analytics.data.v1beta.AnalyticsDataApiProto
          .internal_static_google_analytics_data_v1beta_BatchRunReportsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.analytics.data.v1beta.AnalyticsDataApiProto
          .internal_static_google_analytics_data_v1beta_BatchRunReportsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.analytics.data.v1beta.BatchRunReportsResponse.class,
              com.google.analytics.data.v1beta.BatchRunReportsResponse.Builder.class);
    }

    // Construct using com.google.analytics.data.v1beta.BatchRunReportsResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (reportsBuilder_ == null) {
        reports_ = java.util.Collections.emptyList();
      } else {
        reports_ = null;
        reportsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      kind_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.analytics.data.v1beta.AnalyticsDataApiProto
          .internal_static_google_analytics_data_v1beta_BatchRunReportsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.analytics.data.v1beta.BatchRunReportsResponse getDefaultInstanceForType() {
      return com.google.analytics.data.v1beta.BatchRunReportsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.analytics.data.v1beta.BatchRunReportsResponse build() {
      com.google.analytics.data.v1beta.BatchRunReportsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.analytics.data.v1beta.BatchRunReportsResponse buildPartial() {
      com.google.analytics.data.v1beta.BatchRunReportsResponse result =
          new com.google.analytics.data.v1beta.BatchRunReportsResponse(this);
      int from_bitField0_ = bitField0_;
      if (reportsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          reports_ = java.util.Collections.unmodifiableList(reports_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.reports_ = reports_;
      } else {
        result.reports_ = reportsBuilder_.build();
      }
      result.kind_ = kind_;
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
      if (other instanceof com.google.analytics.data.v1beta.BatchRunReportsResponse) {
        return mergeFrom((com.google.analytics.data.v1beta.BatchRunReportsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.analytics.data.v1beta.BatchRunReportsResponse other) {
      if (other == com.google.analytics.data.v1beta.BatchRunReportsResponse.getDefaultInstance())
        return this;
      if (reportsBuilder_ == null) {
        if (!other.reports_.isEmpty()) {
          if (reports_.isEmpty()) {
            reports_ = other.reports_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureReportsIsMutable();
            reports_.addAll(other.reports_);
          }
          onChanged();
        }
      } else {
        if (!other.reports_.isEmpty()) {
          if (reportsBuilder_.isEmpty()) {
            reportsBuilder_.dispose();
            reportsBuilder_ = null;
            reports_ = other.reports_;
            bitField0_ = (bitField0_ & ~0x00000001);
            reportsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getReportsFieldBuilder()
                    : null;
          } else {
            reportsBuilder_.addAllMessages(other.reports_);
          }
        }
      }
      if (!other.getKind().isEmpty()) {
        kind_ = other.kind_;
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
                com.google.analytics.data.v1beta.RunReportResponse m =
                    input.readMessage(
                        com.google.analytics.data.v1beta.RunReportResponse.parser(),
                        extensionRegistry);
                if (reportsBuilder_ == null) {
                  ensureReportsIsMutable();
                  reports_.add(m);
                } else {
                  reportsBuilder_.addMessage(m);
                }
                break;
              } // case 10
            case 18:
              {
                kind_ = input.readStringRequireUtf8();

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

    private java.util.List<com.google.analytics.data.v1beta.RunReportResponse> reports_ =
        java.util.Collections.emptyList();

    private void ensureReportsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        reports_ =
            new java.util.ArrayList<com.google.analytics.data.v1beta.RunReportResponse>(reports_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.analytics.data.v1beta.RunReportResponse,
            com.google.analytics.data.v1beta.RunReportResponse.Builder,
            com.google.analytics.data.v1beta.RunReportResponseOrBuilder>
        reportsBuilder_;

    /**
     *
     *
     * <pre>
     * Individual responses. Each response has a separate report request.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1beta.RunReportResponse reports = 1;</code>
     */
    public java.util.List<com.google.analytics.data.v1beta.RunReportResponse> getReportsList() {
      if (reportsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(reports_);
      } else {
        return reportsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * Individual responses. Each response has a separate report request.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1beta.RunReportResponse reports = 1;</code>
     */
    public int getReportsCount() {
      if (reportsBuilder_ == null) {
        return reports_.size();
      } else {
        return reportsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * Individual responses. Each response has a separate report request.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1beta.RunReportResponse reports = 1;</code>
     */
    public com.google.analytics.data.v1beta.RunReportResponse getReports(int index) {
      if (reportsBuilder_ == null) {
        return reports_.get(index);
      } else {
        return reportsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Individual responses. Each response has a separate report request.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1beta.RunReportResponse reports = 1;</code>
     */
    public Builder setReports(int index, com.google.analytics.data.v1beta.RunReportResponse value) {
      if (reportsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureReportsIsMutable();
        reports_.set(index, value);
        onChanged();
      } else {
        reportsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Individual responses. Each response has a separate report request.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1beta.RunReportResponse reports = 1;</code>
     */
    public Builder setReports(
        int index, com.google.analytics.data.v1beta.RunReportResponse.Builder builderForValue) {
      if (reportsBuilder_ == null) {
        ensureReportsIsMutable();
        reports_.set(index, builderForValue.build());
        onChanged();
      } else {
        reportsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Individual responses. Each response has a separate report request.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1beta.RunReportResponse reports = 1;</code>
     */
    public Builder addReports(com.google.analytics.data.v1beta.RunReportResponse value) {
      if (reportsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureReportsIsMutable();
        reports_.add(value);
        onChanged();
      } else {
        reportsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Individual responses. Each response has a separate report request.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1beta.RunReportResponse reports = 1;</code>
     */
    public Builder addReports(int index, com.google.analytics.data.v1beta.RunReportResponse value) {
      if (reportsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureReportsIsMutable();
        reports_.add(index, value);
        onChanged();
      } else {
        reportsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Individual responses. Each response has a separate report request.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1beta.RunReportResponse reports = 1;</code>
     */
    public Builder addReports(
        com.google.analytics.data.v1beta.RunReportResponse.Builder builderForValue) {
      if (reportsBuilder_ == null) {
        ensureReportsIsMutable();
        reports_.add(builderForValue.build());
        onChanged();
      } else {
        reportsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Individual responses. Each response has a separate report request.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1beta.RunReportResponse reports = 1;</code>
     */
    public Builder addReports(
        int index, com.google.analytics.data.v1beta.RunReportResponse.Builder builderForValue) {
      if (reportsBuilder_ == null) {
        ensureReportsIsMutable();
        reports_.add(index, builderForValue.build());
        onChanged();
      } else {
        reportsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Individual responses. Each response has a separate report request.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1beta.RunReportResponse reports = 1;</code>
     */
    public Builder addAllReports(
        java.lang.Iterable<? extends com.google.analytics.data.v1beta.RunReportResponse> values) {
      if (reportsBuilder_ == null) {
        ensureReportsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, reports_);
        onChanged();
      } else {
        reportsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Individual responses. Each response has a separate report request.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1beta.RunReportResponse reports = 1;</code>
     */
    public Builder clearReports() {
      if (reportsBuilder_ == null) {
        reports_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        reportsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Individual responses. Each response has a separate report request.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1beta.RunReportResponse reports = 1;</code>
     */
    public Builder removeReports(int index) {
      if (reportsBuilder_ == null) {
        ensureReportsIsMutable();
        reports_.remove(index);
        onChanged();
      } else {
        reportsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Individual responses. Each response has a separate report request.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1beta.RunReportResponse reports = 1;</code>
     */
    public com.google.analytics.data.v1beta.RunReportResponse.Builder getReportsBuilder(int index) {
      return getReportsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * Individual responses. Each response has a separate report request.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1beta.RunReportResponse reports = 1;</code>
     */
    public com.google.analytics.data.v1beta.RunReportResponseOrBuilder getReportsOrBuilder(
        int index) {
      if (reportsBuilder_ == null) {
        return reports_.get(index);
      } else {
        return reportsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Individual responses. Each response has a separate report request.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1beta.RunReportResponse reports = 1;</code>
     */
    public java.util.List<? extends com.google.analytics.data.v1beta.RunReportResponseOrBuilder>
        getReportsOrBuilderList() {
      if (reportsBuilder_ != null) {
        return reportsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(reports_);
      }
    }
    /**
     *
     *
     * <pre>
     * Individual responses. Each response has a separate report request.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1beta.RunReportResponse reports = 1;</code>
     */
    public com.google.analytics.data.v1beta.RunReportResponse.Builder addReportsBuilder() {
      return getReportsFieldBuilder()
          .addBuilder(com.google.analytics.data.v1beta.RunReportResponse.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Individual responses. Each response has a separate report request.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1beta.RunReportResponse reports = 1;</code>
     */
    public com.google.analytics.data.v1beta.RunReportResponse.Builder addReportsBuilder(int index) {
      return getReportsFieldBuilder()
          .addBuilder(
              index, com.google.analytics.data.v1beta.RunReportResponse.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Individual responses. Each response has a separate report request.
     * </pre>
     *
     * <code>repeated .google.analytics.data.v1beta.RunReportResponse reports = 1;</code>
     */
    public java.util.List<com.google.analytics.data.v1beta.RunReportResponse.Builder>
        getReportsBuilderList() {
      return getReportsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.analytics.data.v1beta.RunReportResponse,
            com.google.analytics.data.v1beta.RunReportResponse.Builder,
            com.google.analytics.data.v1beta.RunReportResponseOrBuilder>
        getReportsFieldBuilder() {
      if (reportsBuilder_ == null) {
        reportsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.analytics.data.v1beta.RunReportResponse,
                com.google.analytics.data.v1beta.RunReportResponse.Builder,
                com.google.analytics.data.v1beta.RunReportResponseOrBuilder>(
                reports_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        reports_ = null;
      }
      return reportsBuilder_;
    }

    private java.lang.Object kind_ = "";
    /**
     *
     *
     * <pre>
     * Identifies what kind of resource this message is. This `kind` is always the
     * fixed string "analyticsData#batchRunReports". Useful to distinguish between
     * response types in JSON.
     * </pre>
     *
     * <code>string kind = 2;</code>
     *
     * @return The kind.
     */
    public java.lang.String getKind() {
      java.lang.Object ref = kind_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        kind_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Identifies what kind of resource this message is. This `kind` is always the
     * fixed string "analyticsData#batchRunReports". Useful to distinguish between
     * response types in JSON.
     * </pre>
     *
     * <code>string kind = 2;</code>
     *
     * @return The bytes for kind.
     */
    public com.google.protobuf.ByteString getKindBytes() {
      java.lang.Object ref = kind_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        kind_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Identifies what kind of resource this message is. This `kind` is always the
     * fixed string "analyticsData#batchRunReports". Useful to distinguish between
     * response types in JSON.
     * </pre>
     *
     * <code>string kind = 2;</code>
     *
     * @param value The kind to set.
     * @return This builder for chaining.
     */
    public Builder setKind(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      kind_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Identifies what kind of resource this message is. This `kind` is always the
     * fixed string "analyticsData#batchRunReports". Useful to distinguish between
     * response types in JSON.
     * </pre>
     *
     * <code>string kind = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearKind() {

      kind_ = getDefaultInstance().getKind();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Identifies what kind of resource this message is. This `kind` is always the
     * fixed string "analyticsData#batchRunReports". Useful to distinguish between
     * response types in JSON.
     * </pre>
     *
     * <code>string kind = 2;</code>
     *
     * @param value The bytes for kind to set.
     * @return This builder for chaining.
     */
    public Builder setKindBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      kind_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.analytics.data.v1beta.BatchRunReportsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.analytics.data.v1beta.BatchRunReportsResponse)
  private static final com.google.analytics.data.v1beta.BatchRunReportsResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.analytics.data.v1beta.BatchRunReportsResponse();
  }

  public static com.google.analytics.data.v1beta.BatchRunReportsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BatchRunReportsResponse> PARSER =
      new com.google.protobuf.AbstractParser<BatchRunReportsResponse>() {
        @java.lang.Override
        public BatchRunReportsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<BatchRunReportsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BatchRunReportsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.analytics.data.v1beta.BatchRunReportsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
