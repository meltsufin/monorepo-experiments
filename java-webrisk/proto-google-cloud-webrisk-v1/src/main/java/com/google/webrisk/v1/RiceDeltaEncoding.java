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
// source: google/cloud/webrisk/v1/webrisk.proto

package com.google.webrisk.v1;

/**
 *
 *
 * <pre>
 * The Rice-Golomb encoded data. Used for sending compressed 4-byte hashes or
 * compressed removal indices.
 * </pre>
 *
 * Protobuf type {@code google.cloud.webrisk.v1.RiceDeltaEncoding}
 */
public final class RiceDeltaEncoding extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.webrisk.v1.RiceDeltaEncoding)
    RiceDeltaEncodingOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use RiceDeltaEncoding.newBuilder() to construct.
  private RiceDeltaEncoding(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private RiceDeltaEncoding() {
    encodedData_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new RiceDeltaEncoding();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.webrisk.v1.WebRiskProto
        .internal_static_google_cloud_webrisk_v1_RiceDeltaEncoding_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.webrisk.v1.WebRiskProto
        .internal_static_google_cloud_webrisk_v1_RiceDeltaEncoding_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.webrisk.v1.RiceDeltaEncoding.class,
            com.google.webrisk.v1.RiceDeltaEncoding.Builder.class);
  }

  public static final int FIRST_VALUE_FIELD_NUMBER = 1;
  private long firstValue_;
  /**
   *
   *
   * <pre>
   * The offset of the first entry in the encoded data, or, if only a single
   * integer was encoded, that single integer's value. If the field is empty or
   * missing, assume zero.
   * </pre>
   *
   * <code>int64 first_value = 1;</code>
   *
   * @return The firstValue.
   */
  @java.lang.Override
  public long getFirstValue() {
    return firstValue_;
  }

  public static final int RICE_PARAMETER_FIELD_NUMBER = 2;
  private int riceParameter_;
  /**
   *
   *
   * <pre>
   * The Golomb-Rice parameter, which is a number between 2 and 28. This field
   * is missing (that is, zero) if `num_entries` is zero.
   * </pre>
   *
   * <code>int32 rice_parameter = 2;</code>
   *
   * @return The riceParameter.
   */
  @java.lang.Override
  public int getRiceParameter() {
    return riceParameter_;
  }

  public static final int ENTRY_COUNT_FIELD_NUMBER = 3;
  private int entryCount_;
  /**
   *
   *
   * <pre>
   * The number of entries that are delta encoded in the encoded data. If only a
   * single integer was encoded, this will be zero and the single value will be
   * stored in `first_value`.
   * </pre>
   *
   * <code>int32 entry_count = 3;</code>
   *
   * @return The entryCount.
   */
  @java.lang.Override
  public int getEntryCount() {
    return entryCount_;
  }

  public static final int ENCODED_DATA_FIELD_NUMBER = 4;
  private com.google.protobuf.ByteString encodedData_;
  /**
   *
   *
   * <pre>
   * The encoded deltas that are encoded using the Golomb-Rice coder.
   * </pre>
   *
   * <code>bytes encoded_data = 4;</code>
   *
   * @return The encodedData.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getEncodedData() {
    return encodedData_;
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
    if (firstValue_ != 0L) {
      output.writeInt64(1, firstValue_);
    }
    if (riceParameter_ != 0) {
      output.writeInt32(2, riceParameter_);
    }
    if (entryCount_ != 0) {
      output.writeInt32(3, entryCount_);
    }
    if (!encodedData_.isEmpty()) {
      output.writeBytes(4, encodedData_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (firstValue_ != 0L) {
      size += com.google.protobuf.CodedOutputStream.computeInt64Size(1, firstValue_);
    }
    if (riceParameter_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(2, riceParameter_);
    }
    if (entryCount_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(3, entryCount_);
    }
    if (!encodedData_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream.computeBytesSize(4, encodedData_);
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
    if (!(obj instanceof com.google.webrisk.v1.RiceDeltaEncoding)) {
      return super.equals(obj);
    }
    com.google.webrisk.v1.RiceDeltaEncoding other = (com.google.webrisk.v1.RiceDeltaEncoding) obj;

    if (getFirstValue() != other.getFirstValue()) return false;
    if (getRiceParameter() != other.getRiceParameter()) return false;
    if (getEntryCount() != other.getEntryCount()) return false;
    if (!getEncodedData().equals(other.getEncodedData())) return false;
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
    hash = (37 * hash) + FIRST_VALUE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getFirstValue());
    hash = (37 * hash) + RICE_PARAMETER_FIELD_NUMBER;
    hash = (53 * hash) + getRiceParameter();
    hash = (37 * hash) + ENTRY_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getEntryCount();
    hash = (37 * hash) + ENCODED_DATA_FIELD_NUMBER;
    hash = (53 * hash) + getEncodedData().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.webrisk.v1.RiceDeltaEncoding parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.webrisk.v1.RiceDeltaEncoding parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.webrisk.v1.RiceDeltaEncoding parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.webrisk.v1.RiceDeltaEncoding parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.webrisk.v1.RiceDeltaEncoding parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.webrisk.v1.RiceDeltaEncoding parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.webrisk.v1.RiceDeltaEncoding parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.webrisk.v1.RiceDeltaEncoding parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.webrisk.v1.RiceDeltaEncoding parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.webrisk.v1.RiceDeltaEncoding parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.webrisk.v1.RiceDeltaEncoding parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.webrisk.v1.RiceDeltaEncoding parseFrom(
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

  public static Builder newBuilder(com.google.webrisk.v1.RiceDeltaEncoding prototype) {
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
   * The Rice-Golomb encoded data. Used for sending compressed 4-byte hashes or
   * compressed removal indices.
   * </pre>
   *
   * Protobuf type {@code google.cloud.webrisk.v1.RiceDeltaEncoding}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.webrisk.v1.RiceDeltaEncoding)
      com.google.webrisk.v1.RiceDeltaEncodingOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.webrisk.v1.WebRiskProto
          .internal_static_google_cloud_webrisk_v1_RiceDeltaEncoding_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.webrisk.v1.WebRiskProto
          .internal_static_google_cloud_webrisk_v1_RiceDeltaEncoding_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.webrisk.v1.RiceDeltaEncoding.class,
              com.google.webrisk.v1.RiceDeltaEncoding.Builder.class);
    }

    // Construct using com.google.webrisk.v1.RiceDeltaEncoding.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      firstValue_ = 0L;

      riceParameter_ = 0;

      entryCount_ = 0;

      encodedData_ = com.google.protobuf.ByteString.EMPTY;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.webrisk.v1.WebRiskProto
          .internal_static_google_cloud_webrisk_v1_RiceDeltaEncoding_descriptor;
    }

    @java.lang.Override
    public com.google.webrisk.v1.RiceDeltaEncoding getDefaultInstanceForType() {
      return com.google.webrisk.v1.RiceDeltaEncoding.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.webrisk.v1.RiceDeltaEncoding build() {
      com.google.webrisk.v1.RiceDeltaEncoding result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.webrisk.v1.RiceDeltaEncoding buildPartial() {
      com.google.webrisk.v1.RiceDeltaEncoding result =
          new com.google.webrisk.v1.RiceDeltaEncoding(this);
      result.firstValue_ = firstValue_;
      result.riceParameter_ = riceParameter_;
      result.entryCount_ = entryCount_;
      result.encodedData_ = encodedData_;
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
      if (other instanceof com.google.webrisk.v1.RiceDeltaEncoding) {
        return mergeFrom((com.google.webrisk.v1.RiceDeltaEncoding) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.webrisk.v1.RiceDeltaEncoding other) {
      if (other == com.google.webrisk.v1.RiceDeltaEncoding.getDefaultInstance()) return this;
      if (other.getFirstValue() != 0L) {
        setFirstValue(other.getFirstValue());
      }
      if (other.getRiceParameter() != 0) {
        setRiceParameter(other.getRiceParameter());
      }
      if (other.getEntryCount() != 0) {
        setEntryCount(other.getEntryCount());
      }
      if (other.getEncodedData() != com.google.protobuf.ByteString.EMPTY) {
        setEncodedData(other.getEncodedData());
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
            case 8:
              {
                firstValue_ = input.readInt64();

                break;
              } // case 8
            case 16:
              {
                riceParameter_ = input.readInt32();

                break;
              } // case 16
            case 24:
              {
                entryCount_ = input.readInt32();

                break;
              } // case 24
            case 34:
              {
                encodedData_ = input.readBytes();

                break;
              } // case 34
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

    private long firstValue_;
    /**
     *
     *
     * <pre>
     * The offset of the first entry in the encoded data, or, if only a single
     * integer was encoded, that single integer's value. If the field is empty or
     * missing, assume zero.
     * </pre>
     *
     * <code>int64 first_value = 1;</code>
     *
     * @return The firstValue.
     */
    @java.lang.Override
    public long getFirstValue() {
      return firstValue_;
    }
    /**
     *
     *
     * <pre>
     * The offset of the first entry in the encoded data, or, if only a single
     * integer was encoded, that single integer's value. If the field is empty or
     * missing, assume zero.
     * </pre>
     *
     * <code>int64 first_value = 1;</code>
     *
     * @param value The firstValue to set.
     * @return This builder for chaining.
     */
    public Builder setFirstValue(long value) {

      firstValue_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The offset of the first entry in the encoded data, or, if only a single
     * integer was encoded, that single integer's value. If the field is empty or
     * missing, assume zero.
     * </pre>
     *
     * <code>int64 first_value = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearFirstValue() {

      firstValue_ = 0L;
      onChanged();
      return this;
    }

    private int riceParameter_;
    /**
     *
     *
     * <pre>
     * The Golomb-Rice parameter, which is a number between 2 and 28. This field
     * is missing (that is, zero) if `num_entries` is zero.
     * </pre>
     *
     * <code>int32 rice_parameter = 2;</code>
     *
     * @return The riceParameter.
     */
    @java.lang.Override
    public int getRiceParameter() {
      return riceParameter_;
    }
    /**
     *
     *
     * <pre>
     * The Golomb-Rice parameter, which is a number between 2 and 28. This field
     * is missing (that is, zero) if `num_entries` is zero.
     * </pre>
     *
     * <code>int32 rice_parameter = 2;</code>
     *
     * @param value The riceParameter to set.
     * @return This builder for chaining.
     */
    public Builder setRiceParameter(int value) {

      riceParameter_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The Golomb-Rice parameter, which is a number between 2 and 28. This field
     * is missing (that is, zero) if `num_entries` is zero.
     * </pre>
     *
     * <code>int32 rice_parameter = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearRiceParameter() {

      riceParameter_ = 0;
      onChanged();
      return this;
    }

    private int entryCount_;
    /**
     *
     *
     * <pre>
     * The number of entries that are delta encoded in the encoded data. If only a
     * single integer was encoded, this will be zero and the single value will be
     * stored in `first_value`.
     * </pre>
     *
     * <code>int32 entry_count = 3;</code>
     *
     * @return The entryCount.
     */
    @java.lang.Override
    public int getEntryCount() {
      return entryCount_;
    }
    /**
     *
     *
     * <pre>
     * The number of entries that are delta encoded in the encoded data. If only a
     * single integer was encoded, this will be zero and the single value will be
     * stored in `first_value`.
     * </pre>
     *
     * <code>int32 entry_count = 3;</code>
     *
     * @param value The entryCount to set.
     * @return This builder for chaining.
     */
    public Builder setEntryCount(int value) {

      entryCount_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The number of entries that are delta encoded in the encoded data. If only a
     * single integer was encoded, this will be zero and the single value will be
     * stored in `first_value`.
     * </pre>
     *
     * <code>int32 entry_count = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearEntryCount() {

      entryCount_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString encodedData_ = com.google.protobuf.ByteString.EMPTY;
    /**
     *
     *
     * <pre>
     * The encoded deltas that are encoded using the Golomb-Rice coder.
     * </pre>
     *
     * <code>bytes encoded_data = 4;</code>
     *
     * @return The encodedData.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getEncodedData() {
      return encodedData_;
    }
    /**
     *
     *
     * <pre>
     * The encoded deltas that are encoded using the Golomb-Rice coder.
     * </pre>
     *
     * <code>bytes encoded_data = 4;</code>
     *
     * @param value The encodedData to set.
     * @return This builder for chaining.
     */
    public Builder setEncodedData(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }

      encodedData_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The encoded deltas that are encoded using the Golomb-Rice coder.
     * </pre>
     *
     * <code>bytes encoded_data = 4;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearEncodedData() {

      encodedData_ = getDefaultInstance().getEncodedData();
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

    // @@protoc_insertion_point(builder_scope:google.cloud.webrisk.v1.RiceDeltaEncoding)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.webrisk.v1.RiceDeltaEncoding)
  private static final com.google.webrisk.v1.RiceDeltaEncoding DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.webrisk.v1.RiceDeltaEncoding();
  }

  public static com.google.webrisk.v1.RiceDeltaEncoding getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RiceDeltaEncoding> PARSER =
      new com.google.protobuf.AbstractParser<RiceDeltaEncoding>() {
        @java.lang.Override
        public RiceDeltaEncoding parsePartialFrom(
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

  public static com.google.protobuf.Parser<RiceDeltaEncoding> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RiceDeltaEncoding> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.webrisk.v1.RiceDeltaEncoding getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
