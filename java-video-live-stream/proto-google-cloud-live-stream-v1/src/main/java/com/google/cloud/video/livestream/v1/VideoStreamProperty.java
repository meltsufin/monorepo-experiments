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
// source: google/cloud/video/livestream/v1/resources.proto

package com.google.cloud.video.livestream.v1;

/**
 *
 *
 * <pre>
 * Properties of the video stream.
 * </pre>
 *
 * Protobuf type {@code google.cloud.video.livestream.v1.VideoStreamProperty}
 */
public final class VideoStreamProperty extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.video.livestream.v1.VideoStreamProperty)
    VideoStreamPropertyOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use VideoStreamProperty.newBuilder() to construct.
  private VideoStreamProperty(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private VideoStreamProperty() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new VideoStreamProperty();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.video.livestream.v1.ResourcesProto
        .internal_static_google_cloud_video_livestream_v1_VideoStreamProperty_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.video.livestream.v1.ResourcesProto
        .internal_static_google_cloud_video_livestream_v1_VideoStreamProperty_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.video.livestream.v1.VideoStreamProperty.class,
            com.google.cloud.video.livestream.v1.VideoStreamProperty.Builder.class);
  }

  public static final int INDEX_FIELD_NUMBER = 1;
  private int index_;
  /**
   *
   *
   * <pre>
   * Index of this video stream.
   * </pre>
   *
   * <code>int32 index = 1;</code>
   *
   * @return The index.
   */
  @java.lang.Override
  public int getIndex() {
    return index_;
  }

  public static final int VIDEO_FORMAT_FIELD_NUMBER = 2;
  private com.google.cloud.video.livestream.v1.VideoFormat videoFormat_;
  /**
   *
   *
   * <pre>
   * Properties of the video format.
   * </pre>
   *
   * <code>.google.cloud.video.livestream.v1.VideoFormat video_format = 2;</code>
   *
   * @return Whether the videoFormat field is set.
   */
  @java.lang.Override
  public boolean hasVideoFormat() {
    return videoFormat_ != null;
  }
  /**
   *
   *
   * <pre>
   * Properties of the video format.
   * </pre>
   *
   * <code>.google.cloud.video.livestream.v1.VideoFormat video_format = 2;</code>
   *
   * @return The videoFormat.
   */
  @java.lang.Override
  public com.google.cloud.video.livestream.v1.VideoFormat getVideoFormat() {
    return videoFormat_ == null
        ? com.google.cloud.video.livestream.v1.VideoFormat.getDefaultInstance()
        : videoFormat_;
  }
  /**
   *
   *
   * <pre>
   * Properties of the video format.
   * </pre>
   *
   * <code>.google.cloud.video.livestream.v1.VideoFormat video_format = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.video.livestream.v1.VideoFormatOrBuilder getVideoFormatOrBuilder() {
    return getVideoFormat();
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
    if (index_ != 0) {
      output.writeInt32(1, index_);
    }
    if (videoFormat_ != null) {
      output.writeMessage(2, getVideoFormat());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (index_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(1, index_);
    }
    if (videoFormat_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getVideoFormat());
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
    if (!(obj instanceof com.google.cloud.video.livestream.v1.VideoStreamProperty)) {
      return super.equals(obj);
    }
    com.google.cloud.video.livestream.v1.VideoStreamProperty other =
        (com.google.cloud.video.livestream.v1.VideoStreamProperty) obj;

    if (getIndex() != other.getIndex()) return false;
    if (hasVideoFormat() != other.hasVideoFormat()) return false;
    if (hasVideoFormat()) {
      if (!getVideoFormat().equals(other.getVideoFormat())) return false;
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
    hash = (37 * hash) + INDEX_FIELD_NUMBER;
    hash = (53 * hash) + getIndex();
    if (hasVideoFormat()) {
      hash = (37 * hash) + VIDEO_FORMAT_FIELD_NUMBER;
      hash = (53 * hash) + getVideoFormat().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.video.livestream.v1.VideoStreamProperty parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.video.livestream.v1.VideoStreamProperty parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.video.livestream.v1.VideoStreamProperty parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.video.livestream.v1.VideoStreamProperty parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.video.livestream.v1.VideoStreamProperty parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.video.livestream.v1.VideoStreamProperty parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.video.livestream.v1.VideoStreamProperty parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.video.livestream.v1.VideoStreamProperty parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.video.livestream.v1.VideoStreamProperty parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.video.livestream.v1.VideoStreamProperty parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.video.livestream.v1.VideoStreamProperty parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.video.livestream.v1.VideoStreamProperty parseFrom(
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
      com.google.cloud.video.livestream.v1.VideoStreamProperty prototype) {
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
   * Properties of the video stream.
   * </pre>
   *
   * Protobuf type {@code google.cloud.video.livestream.v1.VideoStreamProperty}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.video.livestream.v1.VideoStreamProperty)
      com.google.cloud.video.livestream.v1.VideoStreamPropertyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.video.livestream.v1.ResourcesProto
          .internal_static_google_cloud_video_livestream_v1_VideoStreamProperty_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.video.livestream.v1.ResourcesProto
          .internal_static_google_cloud_video_livestream_v1_VideoStreamProperty_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.video.livestream.v1.VideoStreamProperty.class,
              com.google.cloud.video.livestream.v1.VideoStreamProperty.Builder.class);
    }

    // Construct using com.google.cloud.video.livestream.v1.VideoStreamProperty.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      index_ = 0;

      if (videoFormatBuilder_ == null) {
        videoFormat_ = null;
      } else {
        videoFormat_ = null;
        videoFormatBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.video.livestream.v1.ResourcesProto
          .internal_static_google_cloud_video_livestream_v1_VideoStreamProperty_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.video.livestream.v1.VideoStreamProperty getDefaultInstanceForType() {
      return com.google.cloud.video.livestream.v1.VideoStreamProperty.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.video.livestream.v1.VideoStreamProperty build() {
      com.google.cloud.video.livestream.v1.VideoStreamProperty result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.video.livestream.v1.VideoStreamProperty buildPartial() {
      com.google.cloud.video.livestream.v1.VideoStreamProperty result =
          new com.google.cloud.video.livestream.v1.VideoStreamProperty(this);
      result.index_ = index_;
      if (videoFormatBuilder_ == null) {
        result.videoFormat_ = videoFormat_;
      } else {
        result.videoFormat_ = videoFormatBuilder_.build();
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
      if (other instanceof com.google.cloud.video.livestream.v1.VideoStreamProperty) {
        return mergeFrom((com.google.cloud.video.livestream.v1.VideoStreamProperty) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.video.livestream.v1.VideoStreamProperty other) {
      if (other == com.google.cloud.video.livestream.v1.VideoStreamProperty.getDefaultInstance())
        return this;
      if (other.getIndex() != 0) {
        setIndex(other.getIndex());
      }
      if (other.hasVideoFormat()) {
        mergeVideoFormat(other.getVideoFormat());
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
                index_ = input.readInt32();

                break;
              } // case 8
            case 18:
              {
                input.readMessage(getVideoFormatFieldBuilder().getBuilder(), extensionRegistry);

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

    private int index_;
    /**
     *
     *
     * <pre>
     * Index of this video stream.
     * </pre>
     *
     * <code>int32 index = 1;</code>
     *
     * @return The index.
     */
    @java.lang.Override
    public int getIndex() {
      return index_;
    }
    /**
     *
     *
     * <pre>
     * Index of this video stream.
     * </pre>
     *
     * <code>int32 index = 1;</code>
     *
     * @param value The index to set.
     * @return This builder for chaining.
     */
    public Builder setIndex(int value) {

      index_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Index of this video stream.
     * </pre>
     *
     * <code>int32 index = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearIndex() {

      index_ = 0;
      onChanged();
      return this;
    }

    private com.google.cloud.video.livestream.v1.VideoFormat videoFormat_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.video.livestream.v1.VideoFormat,
            com.google.cloud.video.livestream.v1.VideoFormat.Builder,
            com.google.cloud.video.livestream.v1.VideoFormatOrBuilder>
        videoFormatBuilder_;
    /**
     *
     *
     * <pre>
     * Properties of the video format.
     * </pre>
     *
     * <code>.google.cloud.video.livestream.v1.VideoFormat video_format = 2;</code>
     *
     * @return Whether the videoFormat field is set.
     */
    public boolean hasVideoFormat() {
      return videoFormatBuilder_ != null || videoFormat_ != null;
    }
    /**
     *
     *
     * <pre>
     * Properties of the video format.
     * </pre>
     *
     * <code>.google.cloud.video.livestream.v1.VideoFormat video_format = 2;</code>
     *
     * @return The videoFormat.
     */
    public com.google.cloud.video.livestream.v1.VideoFormat getVideoFormat() {
      if (videoFormatBuilder_ == null) {
        return videoFormat_ == null
            ? com.google.cloud.video.livestream.v1.VideoFormat.getDefaultInstance()
            : videoFormat_;
      } else {
        return videoFormatBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Properties of the video format.
     * </pre>
     *
     * <code>.google.cloud.video.livestream.v1.VideoFormat video_format = 2;</code>
     */
    public Builder setVideoFormat(com.google.cloud.video.livestream.v1.VideoFormat value) {
      if (videoFormatBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        videoFormat_ = value;
        onChanged();
      } else {
        videoFormatBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Properties of the video format.
     * </pre>
     *
     * <code>.google.cloud.video.livestream.v1.VideoFormat video_format = 2;</code>
     */
    public Builder setVideoFormat(
        com.google.cloud.video.livestream.v1.VideoFormat.Builder builderForValue) {
      if (videoFormatBuilder_ == null) {
        videoFormat_ = builderForValue.build();
        onChanged();
      } else {
        videoFormatBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Properties of the video format.
     * </pre>
     *
     * <code>.google.cloud.video.livestream.v1.VideoFormat video_format = 2;</code>
     */
    public Builder mergeVideoFormat(com.google.cloud.video.livestream.v1.VideoFormat value) {
      if (videoFormatBuilder_ == null) {
        if (videoFormat_ != null) {
          videoFormat_ =
              com.google.cloud.video.livestream.v1.VideoFormat.newBuilder(videoFormat_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          videoFormat_ = value;
        }
        onChanged();
      } else {
        videoFormatBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Properties of the video format.
     * </pre>
     *
     * <code>.google.cloud.video.livestream.v1.VideoFormat video_format = 2;</code>
     */
    public Builder clearVideoFormat() {
      if (videoFormatBuilder_ == null) {
        videoFormat_ = null;
        onChanged();
      } else {
        videoFormat_ = null;
        videoFormatBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Properties of the video format.
     * </pre>
     *
     * <code>.google.cloud.video.livestream.v1.VideoFormat video_format = 2;</code>
     */
    public com.google.cloud.video.livestream.v1.VideoFormat.Builder getVideoFormatBuilder() {

      onChanged();
      return getVideoFormatFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Properties of the video format.
     * </pre>
     *
     * <code>.google.cloud.video.livestream.v1.VideoFormat video_format = 2;</code>
     */
    public com.google.cloud.video.livestream.v1.VideoFormatOrBuilder getVideoFormatOrBuilder() {
      if (videoFormatBuilder_ != null) {
        return videoFormatBuilder_.getMessageOrBuilder();
      } else {
        return videoFormat_ == null
            ? com.google.cloud.video.livestream.v1.VideoFormat.getDefaultInstance()
            : videoFormat_;
      }
    }
    /**
     *
     *
     * <pre>
     * Properties of the video format.
     * </pre>
     *
     * <code>.google.cloud.video.livestream.v1.VideoFormat video_format = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.video.livestream.v1.VideoFormat,
            com.google.cloud.video.livestream.v1.VideoFormat.Builder,
            com.google.cloud.video.livestream.v1.VideoFormatOrBuilder>
        getVideoFormatFieldBuilder() {
      if (videoFormatBuilder_ == null) {
        videoFormatBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.video.livestream.v1.VideoFormat,
                com.google.cloud.video.livestream.v1.VideoFormat.Builder,
                com.google.cloud.video.livestream.v1.VideoFormatOrBuilder>(
                getVideoFormat(), getParentForChildren(), isClean());
        videoFormat_ = null;
      }
      return videoFormatBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.video.livestream.v1.VideoStreamProperty)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.video.livestream.v1.VideoStreamProperty)
  private static final com.google.cloud.video.livestream.v1.VideoStreamProperty DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.video.livestream.v1.VideoStreamProperty();
  }

  public static com.google.cloud.video.livestream.v1.VideoStreamProperty getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VideoStreamProperty> PARSER =
      new com.google.protobuf.AbstractParser<VideoStreamProperty>() {
        @java.lang.Override
        public VideoStreamProperty parsePartialFrom(
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

  public static com.google.protobuf.Parser<VideoStreamProperty> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VideoStreamProperty> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.video.livestream.v1.VideoStreamProperty getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
