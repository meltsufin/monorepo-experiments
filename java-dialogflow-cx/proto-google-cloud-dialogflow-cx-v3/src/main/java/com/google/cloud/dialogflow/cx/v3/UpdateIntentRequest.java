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
// source: google/cloud/dialogflow/cx/v3/intent.proto

package com.google.cloud.dialogflow.cx.v3;

/**
 *
 *
 * <pre>
 * The request message for [Intents.UpdateIntent][google.cloud.dialogflow.cx.v3.Intents.UpdateIntent].
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.cx.v3.UpdateIntentRequest}
 */
public final class UpdateIntentRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.cx.v3.UpdateIntentRequest)
    UpdateIntentRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UpdateIntentRequest.newBuilder() to construct.
  private UpdateIntentRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpdateIntentRequest() {
    languageCode_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UpdateIntentRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.dialogflow.cx.v3.IntentProto
        .internal_static_google_cloud_dialogflow_cx_v3_UpdateIntentRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.cx.v3.IntentProto
        .internal_static_google_cloud_dialogflow_cx_v3_UpdateIntentRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.cx.v3.UpdateIntentRequest.class,
            com.google.cloud.dialogflow.cx.v3.UpdateIntentRequest.Builder.class);
  }

  public static final int INTENT_FIELD_NUMBER = 1;
  private com.google.cloud.dialogflow.cx.v3.Intent intent_;
  /**
   *
   *
   * <pre>
   * Required. The intent to update.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3.Intent intent = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the intent field is set.
   */
  @java.lang.Override
  public boolean hasIntent() {
    return intent_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The intent to update.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3.Intent intent = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The intent.
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.cx.v3.Intent getIntent() {
    return intent_ == null
        ? com.google.cloud.dialogflow.cx.v3.Intent.getDefaultInstance()
        : intent_;
  }
  /**
   *
   *
   * <pre>
   * Required. The intent to update.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3.Intent intent = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.cx.v3.IntentOrBuilder getIntentOrBuilder() {
    return getIntent();
  }

  public static final int LANGUAGE_CODE_FIELD_NUMBER = 2;
  private volatile java.lang.Object languageCode_;
  /**
   *
   *
   * <pre>
   * The language of the following fields in `intent`:
   * *   `Intent.training_phrases.parts.text`
   * If not specified, the agent's default language is used.
   * [Many
   * languages](https://cloud.google.com/dialogflow/cx/docs/reference/language)
   * are supported.
   * Note: languages must be enabled in the agent before they can be used.
   * </pre>
   *
   * <code>string language_code = 2;</code>
   *
   * @return The languageCode.
   */
  @java.lang.Override
  public java.lang.String getLanguageCode() {
    java.lang.Object ref = languageCode_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      languageCode_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The language of the following fields in `intent`:
   * *   `Intent.training_phrases.parts.text`
   * If not specified, the agent's default language is used.
   * [Many
   * languages](https://cloud.google.com/dialogflow/cx/docs/reference/language)
   * are supported.
   * Note: languages must be enabled in the agent before they can be used.
   * </pre>
   *
   * <code>string language_code = 2;</code>
   *
   * @return The bytes for languageCode.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getLanguageCodeBytes() {
    java.lang.Object ref = languageCode_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      languageCode_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 3;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   *
   *
   * <pre>
   * The mask to control which fields get updated. If the mask is not present,
   * all fields will be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
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
   * The mask to control which fields get updated. If the mask is not present,
   * all fields will be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
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
   * The mask to control which fields get updated. If the mask is not present,
   * all fields will be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
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
    if (intent_ != null) {
      output.writeMessage(1, getIntent());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(languageCode_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, languageCode_);
    }
    if (updateMask_ != null) {
      output.writeMessage(3, getUpdateMask());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (intent_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getIntent());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(languageCode_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, languageCode_);
    }
    if (updateMask_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getUpdateMask());
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
    if (!(obj instanceof com.google.cloud.dialogflow.cx.v3.UpdateIntentRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.cx.v3.UpdateIntentRequest other =
        (com.google.cloud.dialogflow.cx.v3.UpdateIntentRequest) obj;

    if (hasIntent() != other.hasIntent()) return false;
    if (hasIntent()) {
      if (!getIntent().equals(other.getIntent())) return false;
    }
    if (!getLanguageCode().equals(other.getLanguageCode())) return false;
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
    if (hasIntent()) {
      hash = (37 * hash) + INTENT_FIELD_NUMBER;
      hash = (53 * hash) + getIntent().hashCode();
    }
    hash = (37 * hash) + LANGUAGE_CODE_FIELD_NUMBER;
    hash = (53 * hash) + getLanguageCode().hashCode();
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.cx.v3.UpdateIntentRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.cx.v3.UpdateIntentRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3.UpdateIntentRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.cx.v3.UpdateIntentRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3.UpdateIntentRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.cx.v3.UpdateIntentRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3.UpdateIntentRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.cx.v3.UpdateIntentRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3.UpdateIntentRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.cx.v3.UpdateIntentRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3.UpdateIntentRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.cx.v3.UpdateIntentRequest parseFrom(
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
      com.google.cloud.dialogflow.cx.v3.UpdateIntentRequest prototype) {
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
   * The request message for [Intents.UpdateIntent][google.cloud.dialogflow.cx.v3.Intents.UpdateIntent].
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.cx.v3.UpdateIntentRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.cx.v3.UpdateIntentRequest)
      com.google.cloud.dialogflow.cx.v3.UpdateIntentRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dialogflow.cx.v3.IntentProto
          .internal_static_google_cloud_dialogflow_cx_v3_UpdateIntentRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.cx.v3.IntentProto
          .internal_static_google_cloud_dialogflow_cx_v3_UpdateIntentRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.cx.v3.UpdateIntentRequest.class,
              com.google.cloud.dialogflow.cx.v3.UpdateIntentRequest.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.cx.v3.UpdateIntentRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (intentBuilder_ == null) {
        intent_ = null;
      } else {
        intent_ = null;
        intentBuilder_ = null;
      }
      languageCode_ = "";

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
      return com.google.cloud.dialogflow.cx.v3.IntentProto
          .internal_static_google_cloud_dialogflow_cx_v3_UpdateIntentRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3.UpdateIntentRequest getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.cx.v3.UpdateIntentRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3.UpdateIntentRequest build() {
      com.google.cloud.dialogflow.cx.v3.UpdateIntentRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3.UpdateIntentRequest buildPartial() {
      com.google.cloud.dialogflow.cx.v3.UpdateIntentRequest result =
          new com.google.cloud.dialogflow.cx.v3.UpdateIntentRequest(this);
      if (intentBuilder_ == null) {
        result.intent_ = intent_;
      } else {
        result.intent_ = intentBuilder_.build();
      }
      result.languageCode_ = languageCode_;
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
      if (other instanceof com.google.cloud.dialogflow.cx.v3.UpdateIntentRequest) {
        return mergeFrom((com.google.cloud.dialogflow.cx.v3.UpdateIntentRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dialogflow.cx.v3.UpdateIntentRequest other) {
      if (other == com.google.cloud.dialogflow.cx.v3.UpdateIntentRequest.getDefaultInstance())
        return this;
      if (other.hasIntent()) {
        mergeIntent(other.getIntent());
      }
      if (!other.getLanguageCode().isEmpty()) {
        languageCode_ = other.languageCode_;
        onChanged();
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
                input.readMessage(getIntentFieldBuilder().getBuilder(), extensionRegistry);

                break;
              } // case 10
            case 18:
              {
                languageCode_ = input.readStringRequireUtf8();

                break;
              } // case 18
            case 26:
              {
                input.readMessage(getUpdateMaskFieldBuilder().getBuilder(), extensionRegistry);

                break;
              } // case 26
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

    private com.google.cloud.dialogflow.cx.v3.Intent intent_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dialogflow.cx.v3.Intent,
            com.google.cloud.dialogflow.cx.v3.Intent.Builder,
            com.google.cloud.dialogflow.cx.v3.IntentOrBuilder>
        intentBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The intent to update.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.cx.v3.Intent intent = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the intent field is set.
     */
    public boolean hasIntent() {
      return intentBuilder_ != null || intent_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. The intent to update.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.cx.v3.Intent intent = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The intent.
     */
    public com.google.cloud.dialogflow.cx.v3.Intent getIntent() {
      if (intentBuilder_ == null) {
        return intent_ == null
            ? com.google.cloud.dialogflow.cx.v3.Intent.getDefaultInstance()
            : intent_;
      } else {
        return intentBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The intent to update.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.cx.v3.Intent intent = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setIntent(com.google.cloud.dialogflow.cx.v3.Intent value) {
      if (intentBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        intent_ = value;
        onChanged();
      } else {
        intentBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The intent to update.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.cx.v3.Intent intent = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setIntent(com.google.cloud.dialogflow.cx.v3.Intent.Builder builderForValue) {
      if (intentBuilder_ == null) {
        intent_ = builderForValue.build();
        onChanged();
      } else {
        intentBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The intent to update.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.cx.v3.Intent intent = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeIntent(com.google.cloud.dialogflow.cx.v3.Intent value) {
      if (intentBuilder_ == null) {
        if (intent_ != null) {
          intent_ =
              com.google.cloud.dialogflow.cx.v3.Intent.newBuilder(intent_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          intent_ = value;
        }
        onChanged();
      } else {
        intentBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The intent to update.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.cx.v3.Intent intent = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearIntent() {
      if (intentBuilder_ == null) {
        intent_ = null;
        onChanged();
      } else {
        intent_ = null;
        intentBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The intent to update.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.cx.v3.Intent intent = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.dialogflow.cx.v3.Intent.Builder getIntentBuilder() {

      onChanged();
      return getIntentFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The intent to update.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.cx.v3.Intent intent = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.dialogflow.cx.v3.IntentOrBuilder getIntentOrBuilder() {
      if (intentBuilder_ != null) {
        return intentBuilder_.getMessageOrBuilder();
      } else {
        return intent_ == null
            ? com.google.cloud.dialogflow.cx.v3.Intent.getDefaultInstance()
            : intent_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The intent to update.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.cx.v3.Intent intent = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dialogflow.cx.v3.Intent,
            com.google.cloud.dialogflow.cx.v3.Intent.Builder,
            com.google.cloud.dialogflow.cx.v3.IntentOrBuilder>
        getIntentFieldBuilder() {
      if (intentBuilder_ == null) {
        intentBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.dialogflow.cx.v3.Intent,
                com.google.cloud.dialogflow.cx.v3.Intent.Builder,
                com.google.cloud.dialogflow.cx.v3.IntentOrBuilder>(
                getIntent(), getParentForChildren(), isClean());
        intent_ = null;
      }
      return intentBuilder_;
    }

    private java.lang.Object languageCode_ = "";
    /**
     *
     *
     * <pre>
     * The language of the following fields in `intent`:
     * *   `Intent.training_phrases.parts.text`
     * If not specified, the agent's default language is used.
     * [Many
     * languages](https://cloud.google.com/dialogflow/cx/docs/reference/language)
     * are supported.
     * Note: languages must be enabled in the agent before they can be used.
     * </pre>
     *
     * <code>string language_code = 2;</code>
     *
     * @return The languageCode.
     */
    public java.lang.String getLanguageCode() {
      java.lang.Object ref = languageCode_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        languageCode_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The language of the following fields in `intent`:
     * *   `Intent.training_phrases.parts.text`
     * If not specified, the agent's default language is used.
     * [Many
     * languages](https://cloud.google.com/dialogflow/cx/docs/reference/language)
     * are supported.
     * Note: languages must be enabled in the agent before they can be used.
     * </pre>
     *
     * <code>string language_code = 2;</code>
     *
     * @return The bytes for languageCode.
     */
    public com.google.protobuf.ByteString getLanguageCodeBytes() {
      java.lang.Object ref = languageCode_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        languageCode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The language of the following fields in `intent`:
     * *   `Intent.training_phrases.parts.text`
     * If not specified, the agent's default language is used.
     * [Many
     * languages](https://cloud.google.com/dialogflow/cx/docs/reference/language)
     * are supported.
     * Note: languages must be enabled in the agent before they can be used.
     * </pre>
     *
     * <code>string language_code = 2;</code>
     *
     * @param value The languageCode to set.
     * @return This builder for chaining.
     */
    public Builder setLanguageCode(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      languageCode_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The language of the following fields in `intent`:
     * *   `Intent.training_phrases.parts.text`
     * If not specified, the agent's default language is used.
     * [Many
     * languages](https://cloud.google.com/dialogflow/cx/docs/reference/language)
     * are supported.
     * Note: languages must be enabled in the agent before they can be used.
     * </pre>
     *
     * <code>string language_code = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearLanguageCode() {

      languageCode_ = getDefaultInstance().getLanguageCode();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The language of the following fields in `intent`:
     * *   `Intent.training_phrases.parts.text`
     * If not specified, the agent's default language is used.
     * [Many
     * languages](https://cloud.google.com/dialogflow/cx/docs/reference/language)
     * are supported.
     * Note: languages must be enabled in the agent before they can be used.
     * </pre>
     *
     * <code>string language_code = 2;</code>
     *
     * @param value The bytes for languageCode to set.
     * @return This builder for chaining.
     */
    public Builder setLanguageCodeBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      languageCode_ = value;
      onChanged();
      return this;
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
     * The mask to control which fields get updated. If the mask is not present,
     * all fields will be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
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
     * The mask to control which fields get updated. If the mask is not present,
     * all fields will be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
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
     * The mask to control which fields get updated. If the mask is not present,
     * all fields will be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
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
     * The mask to control which fields get updated. If the mask is not present,
     * all fields will be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
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
     * The mask to control which fields get updated. If the mask is not present,
     * all fields will be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
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
     * The mask to control which fields get updated. If the mask is not present,
     * all fields will be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
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
     * The mask to control which fields get updated. If the mask is not present,
     * all fields will be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {

      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The mask to control which fields get updated. If the mask is not present,
     * all fields will be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
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
     * The mask to control which fields get updated. If the mask is not present,
     * all fields will be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
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

    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.cx.v3.UpdateIntentRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.cx.v3.UpdateIntentRequest)
  private static final com.google.cloud.dialogflow.cx.v3.UpdateIntentRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.cx.v3.UpdateIntentRequest();
  }

  public static com.google.cloud.dialogflow.cx.v3.UpdateIntentRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateIntentRequest> PARSER =
      new com.google.protobuf.AbstractParser<UpdateIntentRequest>() {
        @java.lang.Override
        public UpdateIntentRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateIntentRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateIntentRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.cx.v3.UpdateIntentRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
