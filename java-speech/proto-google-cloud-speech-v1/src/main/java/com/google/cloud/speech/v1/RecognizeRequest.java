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
// source: google/cloud/speech/v1/cloud_speech.proto

package com.google.cloud.speech.v1;

/**
 *
 *
 * <pre>
 * The top-level message sent by the client for the `Recognize` method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.speech.v1.RecognizeRequest}
 */
public final class RecognizeRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.speech.v1.RecognizeRequest)
    RecognizeRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use RecognizeRequest.newBuilder() to construct.
  private RecognizeRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private RecognizeRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new RecognizeRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.speech.v1.SpeechProto
        .internal_static_google_cloud_speech_v1_RecognizeRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.speech.v1.SpeechProto
        .internal_static_google_cloud_speech_v1_RecognizeRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.speech.v1.RecognizeRequest.class,
            com.google.cloud.speech.v1.RecognizeRequest.Builder.class);
  }

  public static final int CONFIG_FIELD_NUMBER = 1;
  private com.google.cloud.speech.v1.RecognitionConfig config_;
  /**
   *
   *
   * <pre>
   * Required. Provides information to the recognizer that specifies how to
   * process the request.
   * </pre>
   *
   * <code>
   * .google.cloud.speech.v1.RecognitionConfig config = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the config field is set.
   */
  @java.lang.Override
  public boolean hasConfig() {
    return config_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. Provides information to the recognizer that specifies how to
   * process the request.
   * </pre>
   *
   * <code>
   * .google.cloud.speech.v1.RecognitionConfig config = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The config.
   */
  @java.lang.Override
  public com.google.cloud.speech.v1.RecognitionConfig getConfig() {
    return config_ == null
        ? com.google.cloud.speech.v1.RecognitionConfig.getDefaultInstance()
        : config_;
  }
  /**
   *
   *
   * <pre>
   * Required. Provides information to the recognizer that specifies how to
   * process the request.
   * </pre>
   *
   * <code>
   * .google.cloud.speech.v1.RecognitionConfig config = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.speech.v1.RecognitionConfigOrBuilder getConfigOrBuilder() {
    return getConfig();
  }

  public static final int AUDIO_FIELD_NUMBER = 2;
  private com.google.cloud.speech.v1.RecognitionAudio audio_;
  /**
   *
   *
   * <pre>
   * Required. The audio data to be recognized.
   * </pre>
   *
   * <code>
   * .google.cloud.speech.v1.RecognitionAudio audio = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the audio field is set.
   */
  @java.lang.Override
  public boolean hasAudio() {
    return audio_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The audio data to be recognized.
   * </pre>
   *
   * <code>
   * .google.cloud.speech.v1.RecognitionAudio audio = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The audio.
   */
  @java.lang.Override
  public com.google.cloud.speech.v1.RecognitionAudio getAudio() {
    return audio_ == null
        ? com.google.cloud.speech.v1.RecognitionAudio.getDefaultInstance()
        : audio_;
  }
  /**
   *
   *
   * <pre>
   * Required. The audio data to be recognized.
   * </pre>
   *
   * <code>
   * .google.cloud.speech.v1.RecognitionAudio audio = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.speech.v1.RecognitionAudioOrBuilder getAudioOrBuilder() {
    return getAudio();
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
    if (config_ != null) {
      output.writeMessage(1, getConfig());
    }
    if (audio_ != null) {
      output.writeMessage(2, getAudio());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (config_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getConfig());
    }
    if (audio_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getAudio());
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
    if (!(obj instanceof com.google.cloud.speech.v1.RecognizeRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.speech.v1.RecognizeRequest other =
        (com.google.cloud.speech.v1.RecognizeRequest) obj;

    if (hasConfig() != other.hasConfig()) return false;
    if (hasConfig()) {
      if (!getConfig().equals(other.getConfig())) return false;
    }
    if (hasAudio() != other.hasAudio()) return false;
    if (hasAudio()) {
      if (!getAudio().equals(other.getAudio())) return false;
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
    if (hasConfig()) {
      hash = (37 * hash) + CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getConfig().hashCode();
    }
    if (hasAudio()) {
      hash = (37 * hash) + AUDIO_FIELD_NUMBER;
      hash = (53 * hash) + getAudio().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.speech.v1.RecognizeRequest parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.speech.v1.RecognizeRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.speech.v1.RecognizeRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.speech.v1.RecognizeRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.speech.v1.RecognizeRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.speech.v1.RecognizeRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.speech.v1.RecognizeRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.speech.v1.RecognizeRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.speech.v1.RecognizeRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.speech.v1.RecognizeRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.speech.v1.RecognizeRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.speech.v1.RecognizeRequest parseFrom(
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

  public static Builder newBuilder(com.google.cloud.speech.v1.RecognizeRequest prototype) {
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
   * The top-level message sent by the client for the `Recognize` method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.speech.v1.RecognizeRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.speech.v1.RecognizeRequest)
      com.google.cloud.speech.v1.RecognizeRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.speech.v1.SpeechProto
          .internal_static_google_cloud_speech_v1_RecognizeRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.speech.v1.SpeechProto
          .internal_static_google_cloud_speech_v1_RecognizeRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.speech.v1.RecognizeRequest.class,
              com.google.cloud.speech.v1.RecognizeRequest.Builder.class);
    }

    // Construct using com.google.cloud.speech.v1.RecognizeRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (configBuilder_ == null) {
        config_ = null;
      } else {
        config_ = null;
        configBuilder_ = null;
      }
      if (audioBuilder_ == null) {
        audio_ = null;
      } else {
        audio_ = null;
        audioBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.speech.v1.SpeechProto
          .internal_static_google_cloud_speech_v1_RecognizeRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.speech.v1.RecognizeRequest getDefaultInstanceForType() {
      return com.google.cloud.speech.v1.RecognizeRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.speech.v1.RecognizeRequest build() {
      com.google.cloud.speech.v1.RecognizeRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.speech.v1.RecognizeRequest buildPartial() {
      com.google.cloud.speech.v1.RecognizeRequest result =
          new com.google.cloud.speech.v1.RecognizeRequest(this);
      if (configBuilder_ == null) {
        result.config_ = config_;
      } else {
        result.config_ = configBuilder_.build();
      }
      if (audioBuilder_ == null) {
        result.audio_ = audio_;
      } else {
        result.audio_ = audioBuilder_.build();
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
      if (other instanceof com.google.cloud.speech.v1.RecognizeRequest) {
        return mergeFrom((com.google.cloud.speech.v1.RecognizeRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.speech.v1.RecognizeRequest other) {
      if (other == com.google.cloud.speech.v1.RecognizeRequest.getDefaultInstance()) return this;
      if (other.hasConfig()) {
        mergeConfig(other.getConfig());
      }
      if (other.hasAudio()) {
        mergeAudio(other.getAudio());
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
                input.readMessage(getConfigFieldBuilder().getBuilder(), extensionRegistry);

                break;
              } // case 10
            case 18:
              {
                input.readMessage(getAudioFieldBuilder().getBuilder(), extensionRegistry);

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

    private com.google.cloud.speech.v1.RecognitionConfig config_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.speech.v1.RecognitionConfig,
            com.google.cloud.speech.v1.RecognitionConfig.Builder,
            com.google.cloud.speech.v1.RecognitionConfigOrBuilder>
        configBuilder_;
    /**
     *
     *
     * <pre>
     * Required. Provides information to the recognizer that specifies how to
     * process the request.
     * </pre>
     *
     * <code>
     * .google.cloud.speech.v1.RecognitionConfig config = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the config field is set.
     */
    public boolean hasConfig() {
      return configBuilder_ != null || config_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. Provides information to the recognizer that specifies how to
     * process the request.
     * </pre>
     *
     * <code>
     * .google.cloud.speech.v1.RecognitionConfig config = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The config.
     */
    public com.google.cloud.speech.v1.RecognitionConfig getConfig() {
      if (configBuilder_ == null) {
        return config_ == null
            ? com.google.cloud.speech.v1.RecognitionConfig.getDefaultInstance()
            : config_;
      } else {
        return configBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Provides information to the recognizer that specifies how to
     * process the request.
     * </pre>
     *
     * <code>
     * .google.cloud.speech.v1.RecognitionConfig config = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setConfig(com.google.cloud.speech.v1.RecognitionConfig value) {
      if (configBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        config_ = value;
        onChanged();
      } else {
        configBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Provides information to the recognizer that specifies how to
     * process the request.
     * </pre>
     *
     * <code>
     * .google.cloud.speech.v1.RecognitionConfig config = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setConfig(com.google.cloud.speech.v1.RecognitionConfig.Builder builderForValue) {
      if (configBuilder_ == null) {
        config_ = builderForValue.build();
        onChanged();
      } else {
        configBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Provides information to the recognizer that specifies how to
     * process the request.
     * </pre>
     *
     * <code>
     * .google.cloud.speech.v1.RecognitionConfig config = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeConfig(com.google.cloud.speech.v1.RecognitionConfig value) {
      if (configBuilder_ == null) {
        if (config_ != null) {
          config_ =
              com.google.cloud.speech.v1.RecognitionConfig.newBuilder(config_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          config_ = value;
        }
        onChanged();
      } else {
        configBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Provides information to the recognizer that specifies how to
     * process the request.
     * </pre>
     *
     * <code>
     * .google.cloud.speech.v1.RecognitionConfig config = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearConfig() {
      if (configBuilder_ == null) {
        config_ = null;
        onChanged();
      } else {
        config_ = null;
        configBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Provides information to the recognizer that specifies how to
     * process the request.
     * </pre>
     *
     * <code>
     * .google.cloud.speech.v1.RecognitionConfig config = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.speech.v1.RecognitionConfig.Builder getConfigBuilder() {

      onChanged();
      return getConfigFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. Provides information to the recognizer that specifies how to
     * process the request.
     * </pre>
     *
     * <code>
     * .google.cloud.speech.v1.RecognitionConfig config = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.speech.v1.RecognitionConfigOrBuilder getConfigOrBuilder() {
      if (configBuilder_ != null) {
        return configBuilder_.getMessageOrBuilder();
      } else {
        return config_ == null
            ? com.google.cloud.speech.v1.RecognitionConfig.getDefaultInstance()
            : config_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Provides information to the recognizer that specifies how to
     * process the request.
     * </pre>
     *
     * <code>
     * .google.cloud.speech.v1.RecognitionConfig config = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.speech.v1.RecognitionConfig,
            com.google.cloud.speech.v1.RecognitionConfig.Builder,
            com.google.cloud.speech.v1.RecognitionConfigOrBuilder>
        getConfigFieldBuilder() {
      if (configBuilder_ == null) {
        configBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.speech.v1.RecognitionConfig,
                com.google.cloud.speech.v1.RecognitionConfig.Builder,
                com.google.cloud.speech.v1.RecognitionConfigOrBuilder>(
                getConfig(), getParentForChildren(), isClean());
        config_ = null;
      }
      return configBuilder_;
    }

    private com.google.cloud.speech.v1.RecognitionAudio audio_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.speech.v1.RecognitionAudio,
            com.google.cloud.speech.v1.RecognitionAudio.Builder,
            com.google.cloud.speech.v1.RecognitionAudioOrBuilder>
        audioBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The audio data to be recognized.
     * </pre>
     *
     * <code>
     * .google.cloud.speech.v1.RecognitionAudio audio = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the audio field is set.
     */
    public boolean hasAudio() {
      return audioBuilder_ != null || audio_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. The audio data to be recognized.
     * </pre>
     *
     * <code>
     * .google.cloud.speech.v1.RecognitionAudio audio = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The audio.
     */
    public com.google.cloud.speech.v1.RecognitionAudio getAudio() {
      if (audioBuilder_ == null) {
        return audio_ == null
            ? com.google.cloud.speech.v1.RecognitionAudio.getDefaultInstance()
            : audio_;
      } else {
        return audioBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The audio data to be recognized.
     * </pre>
     *
     * <code>
     * .google.cloud.speech.v1.RecognitionAudio audio = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setAudio(com.google.cloud.speech.v1.RecognitionAudio value) {
      if (audioBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        audio_ = value;
        onChanged();
      } else {
        audioBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The audio data to be recognized.
     * </pre>
     *
     * <code>
     * .google.cloud.speech.v1.RecognitionAudio audio = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setAudio(com.google.cloud.speech.v1.RecognitionAudio.Builder builderForValue) {
      if (audioBuilder_ == null) {
        audio_ = builderForValue.build();
        onChanged();
      } else {
        audioBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The audio data to be recognized.
     * </pre>
     *
     * <code>
     * .google.cloud.speech.v1.RecognitionAudio audio = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeAudio(com.google.cloud.speech.v1.RecognitionAudio value) {
      if (audioBuilder_ == null) {
        if (audio_ != null) {
          audio_ =
              com.google.cloud.speech.v1.RecognitionAudio.newBuilder(audio_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          audio_ = value;
        }
        onChanged();
      } else {
        audioBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The audio data to be recognized.
     * </pre>
     *
     * <code>
     * .google.cloud.speech.v1.RecognitionAudio audio = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearAudio() {
      if (audioBuilder_ == null) {
        audio_ = null;
        onChanged();
      } else {
        audio_ = null;
        audioBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The audio data to be recognized.
     * </pre>
     *
     * <code>
     * .google.cloud.speech.v1.RecognitionAudio audio = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.speech.v1.RecognitionAudio.Builder getAudioBuilder() {

      onChanged();
      return getAudioFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The audio data to be recognized.
     * </pre>
     *
     * <code>
     * .google.cloud.speech.v1.RecognitionAudio audio = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.speech.v1.RecognitionAudioOrBuilder getAudioOrBuilder() {
      if (audioBuilder_ != null) {
        return audioBuilder_.getMessageOrBuilder();
      } else {
        return audio_ == null
            ? com.google.cloud.speech.v1.RecognitionAudio.getDefaultInstance()
            : audio_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The audio data to be recognized.
     * </pre>
     *
     * <code>
     * .google.cloud.speech.v1.RecognitionAudio audio = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.speech.v1.RecognitionAudio,
            com.google.cloud.speech.v1.RecognitionAudio.Builder,
            com.google.cloud.speech.v1.RecognitionAudioOrBuilder>
        getAudioFieldBuilder() {
      if (audioBuilder_ == null) {
        audioBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.speech.v1.RecognitionAudio,
                com.google.cloud.speech.v1.RecognitionAudio.Builder,
                com.google.cloud.speech.v1.RecognitionAudioOrBuilder>(
                getAudio(), getParentForChildren(), isClean());
        audio_ = null;
      }
      return audioBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.speech.v1.RecognizeRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.speech.v1.RecognizeRequest)
  private static final com.google.cloud.speech.v1.RecognizeRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.speech.v1.RecognizeRequest();
  }

  public static com.google.cloud.speech.v1.RecognizeRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RecognizeRequest> PARSER =
      new com.google.protobuf.AbstractParser<RecognizeRequest>() {
        @java.lang.Override
        public RecognizeRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<RecognizeRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RecognizeRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.speech.v1.RecognizeRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
