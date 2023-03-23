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
// source: google/cloud/vision/v1p4beta1/face.proto

package com.google.cloud.vision.v1p4beta1;

/**
 *
 *
 * <pre>
 * Information about a face's identity.
 * </pre>
 *
 * Protobuf type {@code google.cloud.vision.v1p4beta1.FaceRecognitionResult}
 */
public final class FaceRecognitionResult extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.vision.v1p4beta1.FaceRecognitionResult)
    FaceRecognitionResultOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use FaceRecognitionResult.newBuilder() to construct.
  private FaceRecognitionResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private FaceRecognitionResult() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new FaceRecognitionResult();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.vision.v1p4beta1.CelebrityProto
        .internal_static_google_cloud_vision_v1p4beta1_FaceRecognitionResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.vision.v1p4beta1.CelebrityProto
        .internal_static_google_cloud_vision_v1p4beta1_FaceRecognitionResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.vision.v1p4beta1.FaceRecognitionResult.class,
            com.google.cloud.vision.v1p4beta1.FaceRecognitionResult.Builder.class);
  }

  public static final int CELEBRITY_FIELD_NUMBER = 1;
  private com.google.cloud.vision.v1p4beta1.Celebrity celebrity_;
  /**
   *
   *
   * <pre>
   * The [Celebrity][google.cloud.vision.v1p4beta1.Celebrity] that this face was
   * matched to.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p4beta1.Celebrity celebrity = 1;</code>
   *
   * @return Whether the celebrity field is set.
   */
  @java.lang.Override
  public boolean hasCelebrity() {
    return celebrity_ != null;
  }
  /**
   *
   *
   * <pre>
   * The [Celebrity][google.cloud.vision.v1p4beta1.Celebrity] that this face was
   * matched to.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p4beta1.Celebrity celebrity = 1;</code>
   *
   * @return The celebrity.
   */
  @java.lang.Override
  public com.google.cloud.vision.v1p4beta1.Celebrity getCelebrity() {
    return celebrity_ == null
        ? com.google.cloud.vision.v1p4beta1.Celebrity.getDefaultInstance()
        : celebrity_;
  }
  /**
   *
   *
   * <pre>
   * The [Celebrity][google.cloud.vision.v1p4beta1.Celebrity] that this face was
   * matched to.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p4beta1.Celebrity celebrity = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.vision.v1p4beta1.CelebrityOrBuilder getCelebrityOrBuilder() {
    return getCelebrity();
  }

  public static final int CONFIDENCE_FIELD_NUMBER = 2;
  private float confidence_;
  /**
   *
   *
   * <pre>
   * Recognition confidence. Range [0, 1].
   * </pre>
   *
   * <code>float confidence = 2;</code>
   *
   * @return The confidence.
   */
  @java.lang.Override
  public float getConfidence() {
    return confidence_;
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
    if (celebrity_ != null) {
      output.writeMessage(1, getCelebrity());
    }
    if (java.lang.Float.floatToRawIntBits(confidence_) != 0) {
      output.writeFloat(2, confidence_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (celebrity_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getCelebrity());
    }
    if (java.lang.Float.floatToRawIntBits(confidence_) != 0) {
      size += com.google.protobuf.CodedOutputStream.computeFloatSize(2, confidence_);
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
    if (!(obj instanceof com.google.cloud.vision.v1p4beta1.FaceRecognitionResult)) {
      return super.equals(obj);
    }
    com.google.cloud.vision.v1p4beta1.FaceRecognitionResult other =
        (com.google.cloud.vision.v1p4beta1.FaceRecognitionResult) obj;

    if (hasCelebrity() != other.hasCelebrity()) return false;
    if (hasCelebrity()) {
      if (!getCelebrity().equals(other.getCelebrity())) return false;
    }
    if (java.lang.Float.floatToIntBits(getConfidence())
        != java.lang.Float.floatToIntBits(other.getConfidence())) return false;
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
    if (hasCelebrity()) {
      hash = (37 * hash) + CELEBRITY_FIELD_NUMBER;
      hash = (53 * hash) + getCelebrity().hashCode();
    }
    hash = (37 * hash) + CONFIDENCE_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(getConfidence());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.vision.v1p4beta1.FaceRecognitionResult parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vision.v1p4beta1.FaceRecognitionResult parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vision.v1p4beta1.FaceRecognitionResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vision.v1p4beta1.FaceRecognitionResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vision.v1p4beta1.FaceRecognitionResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vision.v1p4beta1.FaceRecognitionResult parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vision.v1p4beta1.FaceRecognitionResult parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.vision.v1p4beta1.FaceRecognitionResult parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.vision.v1p4beta1.FaceRecognitionResult parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.vision.v1p4beta1.FaceRecognitionResult parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.vision.v1p4beta1.FaceRecognitionResult parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.vision.v1p4beta1.FaceRecognitionResult parseFrom(
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
      com.google.cloud.vision.v1p4beta1.FaceRecognitionResult prototype) {
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
   * Information about a face's identity.
   * </pre>
   *
   * Protobuf type {@code google.cloud.vision.v1p4beta1.FaceRecognitionResult}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.vision.v1p4beta1.FaceRecognitionResult)
      com.google.cloud.vision.v1p4beta1.FaceRecognitionResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.vision.v1p4beta1.CelebrityProto
          .internal_static_google_cloud_vision_v1p4beta1_FaceRecognitionResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.vision.v1p4beta1.CelebrityProto
          .internal_static_google_cloud_vision_v1p4beta1_FaceRecognitionResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.vision.v1p4beta1.FaceRecognitionResult.class,
              com.google.cloud.vision.v1p4beta1.FaceRecognitionResult.Builder.class);
    }

    // Construct using com.google.cloud.vision.v1p4beta1.FaceRecognitionResult.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (celebrityBuilder_ == null) {
        celebrity_ = null;
      } else {
        celebrity_ = null;
        celebrityBuilder_ = null;
      }
      confidence_ = 0F;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.vision.v1p4beta1.CelebrityProto
          .internal_static_google_cloud_vision_v1p4beta1_FaceRecognitionResult_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.vision.v1p4beta1.FaceRecognitionResult getDefaultInstanceForType() {
      return com.google.cloud.vision.v1p4beta1.FaceRecognitionResult.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.vision.v1p4beta1.FaceRecognitionResult build() {
      com.google.cloud.vision.v1p4beta1.FaceRecognitionResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.vision.v1p4beta1.FaceRecognitionResult buildPartial() {
      com.google.cloud.vision.v1p4beta1.FaceRecognitionResult result =
          new com.google.cloud.vision.v1p4beta1.FaceRecognitionResult(this);
      if (celebrityBuilder_ == null) {
        result.celebrity_ = celebrity_;
      } else {
        result.celebrity_ = celebrityBuilder_.build();
      }
      result.confidence_ = confidence_;
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
      if (other instanceof com.google.cloud.vision.v1p4beta1.FaceRecognitionResult) {
        return mergeFrom((com.google.cloud.vision.v1p4beta1.FaceRecognitionResult) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.vision.v1p4beta1.FaceRecognitionResult other) {
      if (other == com.google.cloud.vision.v1p4beta1.FaceRecognitionResult.getDefaultInstance())
        return this;
      if (other.hasCelebrity()) {
        mergeCelebrity(other.getCelebrity());
      }
      if (other.getConfidence() != 0F) {
        setConfidence(other.getConfidence());
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
                input.readMessage(getCelebrityFieldBuilder().getBuilder(), extensionRegistry);

                break;
              } // case 10
            case 21:
              {
                confidence_ = input.readFloat();

                break;
              } // case 21
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

    private com.google.cloud.vision.v1p4beta1.Celebrity celebrity_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.vision.v1p4beta1.Celebrity,
            com.google.cloud.vision.v1p4beta1.Celebrity.Builder,
            com.google.cloud.vision.v1p4beta1.CelebrityOrBuilder>
        celebrityBuilder_;
    /**
     *
     *
     * <pre>
     * The [Celebrity][google.cloud.vision.v1p4beta1.Celebrity] that this face was
     * matched to.
     * </pre>
     *
     * <code>.google.cloud.vision.v1p4beta1.Celebrity celebrity = 1;</code>
     *
     * @return Whether the celebrity field is set.
     */
    public boolean hasCelebrity() {
      return celebrityBuilder_ != null || celebrity_ != null;
    }
    /**
     *
     *
     * <pre>
     * The [Celebrity][google.cloud.vision.v1p4beta1.Celebrity] that this face was
     * matched to.
     * </pre>
     *
     * <code>.google.cloud.vision.v1p4beta1.Celebrity celebrity = 1;</code>
     *
     * @return The celebrity.
     */
    public com.google.cloud.vision.v1p4beta1.Celebrity getCelebrity() {
      if (celebrityBuilder_ == null) {
        return celebrity_ == null
            ? com.google.cloud.vision.v1p4beta1.Celebrity.getDefaultInstance()
            : celebrity_;
      } else {
        return celebrityBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The [Celebrity][google.cloud.vision.v1p4beta1.Celebrity] that this face was
     * matched to.
     * </pre>
     *
     * <code>.google.cloud.vision.v1p4beta1.Celebrity celebrity = 1;</code>
     */
    public Builder setCelebrity(com.google.cloud.vision.v1p4beta1.Celebrity value) {
      if (celebrityBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        celebrity_ = value;
        onChanged();
      } else {
        celebrityBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The [Celebrity][google.cloud.vision.v1p4beta1.Celebrity] that this face was
     * matched to.
     * </pre>
     *
     * <code>.google.cloud.vision.v1p4beta1.Celebrity celebrity = 1;</code>
     */
    public Builder setCelebrity(
        com.google.cloud.vision.v1p4beta1.Celebrity.Builder builderForValue) {
      if (celebrityBuilder_ == null) {
        celebrity_ = builderForValue.build();
        onChanged();
      } else {
        celebrityBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The [Celebrity][google.cloud.vision.v1p4beta1.Celebrity] that this face was
     * matched to.
     * </pre>
     *
     * <code>.google.cloud.vision.v1p4beta1.Celebrity celebrity = 1;</code>
     */
    public Builder mergeCelebrity(com.google.cloud.vision.v1p4beta1.Celebrity value) {
      if (celebrityBuilder_ == null) {
        if (celebrity_ != null) {
          celebrity_ =
              com.google.cloud.vision.v1p4beta1.Celebrity.newBuilder(celebrity_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          celebrity_ = value;
        }
        onChanged();
      } else {
        celebrityBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The [Celebrity][google.cloud.vision.v1p4beta1.Celebrity] that this face was
     * matched to.
     * </pre>
     *
     * <code>.google.cloud.vision.v1p4beta1.Celebrity celebrity = 1;</code>
     */
    public Builder clearCelebrity() {
      if (celebrityBuilder_ == null) {
        celebrity_ = null;
        onChanged();
      } else {
        celebrity_ = null;
        celebrityBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The [Celebrity][google.cloud.vision.v1p4beta1.Celebrity] that this face was
     * matched to.
     * </pre>
     *
     * <code>.google.cloud.vision.v1p4beta1.Celebrity celebrity = 1;</code>
     */
    public com.google.cloud.vision.v1p4beta1.Celebrity.Builder getCelebrityBuilder() {

      onChanged();
      return getCelebrityFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The [Celebrity][google.cloud.vision.v1p4beta1.Celebrity] that this face was
     * matched to.
     * </pre>
     *
     * <code>.google.cloud.vision.v1p4beta1.Celebrity celebrity = 1;</code>
     */
    public com.google.cloud.vision.v1p4beta1.CelebrityOrBuilder getCelebrityOrBuilder() {
      if (celebrityBuilder_ != null) {
        return celebrityBuilder_.getMessageOrBuilder();
      } else {
        return celebrity_ == null
            ? com.google.cloud.vision.v1p4beta1.Celebrity.getDefaultInstance()
            : celebrity_;
      }
    }
    /**
     *
     *
     * <pre>
     * The [Celebrity][google.cloud.vision.v1p4beta1.Celebrity] that this face was
     * matched to.
     * </pre>
     *
     * <code>.google.cloud.vision.v1p4beta1.Celebrity celebrity = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.vision.v1p4beta1.Celebrity,
            com.google.cloud.vision.v1p4beta1.Celebrity.Builder,
            com.google.cloud.vision.v1p4beta1.CelebrityOrBuilder>
        getCelebrityFieldBuilder() {
      if (celebrityBuilder_ == null) {
        celebrityBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.vision.v1p4beta1.Celebrity,
                com.google.cloud.vision.v1p4beta1.Celebrity.Builder,
                com.google.cloud.vision.v1p4beta1.CelebrityOrBuilder>(
                getCelebrity(), getParentForChildren(), isClean());
        celebrity_ = null;
      }
      return celebrityBuilder_;
    }

    private float confidence_;
    /**
     *
     *
     * <pre>
     * Recognition confidence. Range [0, 1].
     * </pre>
     *
     * <code>float confidence = 2;</code>
     *
     * @return The confidence.
     */
    @java.lang.Override
    public float getConfidence() {
      return confidence_;
    }
    /**
     *
     *
     * <pre>
     * Recognition confidence. Range [0, 1].
     * </pre>
     *
     * <code>float confidence = 2;</code>
     *
     * @param value The confidence to set.
     * @return This builder for chaining.
     */
    public Builder setConfidence(float value) {

      confidence_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Recognition confidence. Range [0, 1].
     * </pre>
     *
     * <code>float confidence = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearConfidence() {

      confidence_ = 0F;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.vision.v1p4beta1.FaceRecognitionResult)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.vision.v1p4beta1.FaceRecognitionResult)
  private static final com.google.cloud.vision.v1p4beta1.FaceRecognitionResult DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.vision.v1p4beta1.FaceRecognitionResult();
  }

  public static com.google.cloud.vision.v1p4beta1.FaceRecognitionResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FaceRecognitionResult> PARSER =
      new com.google.protobuf.AbstractParser<FaceRecognitionResult>() {
        @java.lang.Override
        public FaceRecognitionResult parsePartialFrom(
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

  public static com.google.protobuf.Parser<FaceRecognitionResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FaceRecognitionResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.vision.v1p4beta1.FaceRecognitionResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}