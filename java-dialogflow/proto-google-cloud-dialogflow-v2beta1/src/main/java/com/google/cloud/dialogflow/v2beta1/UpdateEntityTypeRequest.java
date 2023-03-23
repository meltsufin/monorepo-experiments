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
// source: google/cloud/dialogflow/v2beta1/entity_type.proto

package com.google.cloud.dialogflow.v2beta1;

/**
 *
 *
 * <pre>
 * The request message for [EntityTypes.UpdateEntityType][google.cloud.dialogflow.v2beta1.EntityTypes.UpdateEntityType].
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.v2beta1.UpdateEntityTypeRequest}
 */
public final class UpdateEntityTypeRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.v2beta1.UpdateEntityTypeRequest)
    UpdateEntityTypeRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UpdateEntityTypeRequest.newBuilder() to construct.
  private UpdateEntityTypeRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpdateEntityTypeRequest() {
    languageCode_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UpdateEntityTypeRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.dialogflow.v2beta1.EntityTypeProto
        .internal_static_google_cloud_dialogflow_v2beta1_UpdateEntityTypeRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.v2beta1.EntityTypeProto
        .internal_static_google_cloud_dialogflow_v2beta1_UpdateEntityTypeRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.v2beta1.UpdateEntityTypeRequest.class,
            com.google.cloud.dialogflow.v2beta1.UpdateEntityTypeRequest.Builder.class);
  }

  public static final int ENTITY_TYPE_FIELD_NUMBER = 1;
  private com.google.cloud.dialogflow.v2beta1.EntityType entityType_;
  /**
   *
   *
   * <pre>
   * Required. The entity type to update.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2beta1.EntityType entity_type = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the entityType field is set.
   */
  @java.lang.Override
  public boolean hasEntityType() {
    return entityType_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The entity type to update.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2beta1.EntityType entity_type = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The entityType.
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.v2beta1.EntityType getEntityType() {
    return entityType_ == null
        ? com.google.cloud.dialogflow.v2beta1.EntityType.getDefaultInstance()
        : entityType_;
  }
  /**
   *
   *
   * <pre>
   * Required. The entity type to update.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2beta1.EntityType entity_type = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.v2beta1.EntityTypeOrBuilder getEntityTypeOrBuilder() {
    return getEntityType();
  }

  public static final int LANGUAGE_CODE_FIELD_NUMBER = 2;
  private volatile java.lang.Object languageCode_;
  /**
   *
   *
   * <pre>
   * Optional. The language used to access language-specific data.
   * If not specified, the agent's default language is used.
   * For more information, see
   * [Multilingual intent and entity
   * data](https://cloud.google.com/dialogflow/docs/agents-multilingual#intent-entity).
   * </pre>
   *
   * <code>string language_code = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
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
   * Optional. The language used to access language-specific data.
   * If not specified, the agent's default language is used.
   * For more information, see
   * [Multilingual intent and entity
   * data](https://cloud.google.com/dialogflow/docs/agents-multilingual#intent-entity).
   * </pre>
   *
   * <code>string language_code = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
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
   * Optional. The mask to control which fields get updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
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
   * Optional. The mask to control which fields get updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
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
   * Optional. The mask to control which fields get updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
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
    if (entityType_ != null) {
      output.writeMessage(1, getEntityType());
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
    if (entityType_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getEntityType());
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
    if (!(obj instanceof com.google.cloud.dialogflow.v2beta1.UpdateEntityTypeRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.v2beta1.UpdateEntityTypeRequest other =
        (com.google.cloud.dialogflow.v2beta1.UpdateEntityTypeRequest) obj;

    if (hasEntityType() != other.hasEntityType()) return false;
    if (hasEntityType()) {
      if (!getEntityType().equals(other.getEntityType())) return false;
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
    if (hasEntityType()) {
      hash = (37 * hash) + ENTITY_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getEntityType().hashCode();
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

  public static com.google.cloud.dialogflow.v2beta1.UpdateEntityTypeRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2beta1.UpdateEntityTypeRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2beta1.UpdateEntityTypeRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2beta1.UpdateEntityTypeRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2beta1.UpdateEntityTypeRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2beta1.UpdateEntityTypeRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2beta1.UpdateEntityTypeRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2beta1.UpdateEntityTypeRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2beta1.UpdateEntityTypeRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2beta1.UpdateEntityTypeRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2beta1.UpdateEntityTypeRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2beta1.UpdateEntityTypeRequest parseFrom(
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
      com.google.cloud.dialogflow.v2beta1.UpdateEntityTypeRequest prototype) {
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
   * The request message for [EntityTypes.UpdateEntityType][google.cloud.dialogflow.v2beta1.EntityTypes.UpdateEntityType].
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.v2beta1.UpdateEntityTypeRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.v2beta1.UpdateEntityTypeRequest)
      com.google.cloud.dialogflow.v2beta1.UpdateEntityTypeRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dialogflow.v2beta1.EntityTypeProto
          .internal_static_google_cloud_dialogflow_v2beta1_UpdateEntityTypeRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.v2beta1.EntityTypeProto
          .internal_static_google_cloud_dialogflow_v2beta1_UpdateEntityTypeRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.v2beta1.UpdateEntityTypeRequest.class,
              com.google.cloud.dialogflow.v2beta1.UpdateEntityTypeRequest.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.v2beta1.UpdateEntityTypeRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (entityTypeBuilder_ == null) {
        entityType_ = null;
      } else {
        entityType_ = null;
        entityTypeBuilder_ = null;
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
      return com.google.cloud.dialogflow.v2beta1.EntityTypeProto
          .internal_static_google_cloud_dialogflow_v2beta1_UpdateEntityTypeRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2beta1.UpdateEntityTypeRequest getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.v2beta1.UpdateEntityTypeRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2beta1.UpdateEntityTypeRequest build() {
      com.google.cloud.dialogflow.v2beta1.UpdateEntityTypeRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2beta1.UpdateEntityTypeRequest buildPartial() {
      com.google.cloud.dialogflow.v2beta1.UpdateEntityTypeRequest result =
          new com.google.cloud.dialogflow.v2beta1.UpdateEntityTypeRequest(this);
      if (entityTypeBuilder_ == null) {
        result.entityType_ = entityType_;
      } else {
        result.entityType_ = entityTypeBuilder_.build();
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
      if (other instanceof com.google.cloud.dialogflow.v2beta1.UpdateEntityTypeRequest) {
        return mergeFrom((com.google.cloud.dialogflow.v2beta1.UpdateEntityTypeRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dialogflow.v2beta1.UpdateEntityTypeRequest other) {
      if (other == com.google.cloud.dialogflow.v2beta1.UpdateEntityTypeRequest.getDefaultInstance())
        return this;
      if (other.hasEntityType()) {
        mergeEntityType(other.getEntityType());
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
                input.readMessage(getEntityTypeFieldBuilder().getBuilder(), extensionRegistry);

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

    private com.google.cloud.dialogflow.v2beta1.EntityType entityType_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dialogflow.v2beta1.EntityType,
            com.google.cloud.dialogflow.v2beta1.EntityType.Builder,
            com.google.cloud.dialogflow.v2beta1.EntityTypeOrBuilder>
        entityTypeBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The entity type to update.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.v2beta1.EntityType entity_type = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the entityType field is set.
     */
    public boolean hasEntityType() {
      return entityTypeBuilder_ != null || entityType_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. The entity type to update.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.v2beta1.EntityType entity_type = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The entityType.
     */
    public com.google.cloud.dialogflow.v2beta1.EntityType getEntityType() {
      if (entityTypeBuilder_ == null) {
        return entityType_ == null
            ? com.google.cloud.dialogflow.v2beta1.EntityType.getDefaultInstance()
            : entityType_;
      } else {
        return entityTypeBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The entity type to update.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.v2beta1.EntityType entity_type = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setEntityType(com.google.cloud.dialogflow.v2beta1.EntityType value) {
      if (entityTypeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        entityType_ = value;
        onChanged();
      } else {
        entityTypeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The entity type to update.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.v2beta1.EntityType entity_type = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setEntityType(
        com.google.cloud.dialogflow.v2beta1.EntityType.Builder builderForValue) {
      if (entityTypeBuilder_ == null) {
        entityType_ = builderForValue.build();
        onChanged();
      } else {
        entityTypeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The entity type to update.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.v2beta1.EntityType entity_type = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeEntityType(com.google.cloud.dialogflow.v2beta1.EntityType value) {
      if (entityTypeBuilder_ == null) {
        if (entityType_ != null) {
          entityType_ =
              com.google.cloud.dialogflow.v2beta1.EntityType.newBuilder(entityType_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          entityType_ = value;
        }
        onChanged();
      } else {
        entityTypeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The entity type to update.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.v2beta1.EntityType entity_type = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearEntityType() {
      if (entityTypeBuilder_ == null) {
        entityType_ = null;
        onChanged();
      } else {
        entityType_ = null;
        entityTypeBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The entity type to update.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.v2beta1.EntityType entity_type = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.dialogflow.v2beta1.EntityType.Builder getEntityTypeBuilder() {

      onChanged();
      return getEntityTypeFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The entity type to update.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.v2beta1.EntityType entity_type = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.dialogflow.v2beta1.EntityTypeOrBuilder getEntityTypeOrBuilder() {
      if (entityTypeBuilder_ != null) {
        return entityTypeBuilder_.getMessageOrBuilder();
      } else {
        return entityType_ == null
            ? com.google.cloud.dialogflow.v2beta1.EntityType.getDefaultInstance()
            : entityType_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The entity type to update.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.v2beta1.EntityType entity_type = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dialogflow.v2beta1.EntityType,
            com.google.cloud.dialogflow.v2beta1.EntityType.Builder,
            com.google.cloud.dialogflow.v2beta1.EntityTypeOrBuilder>
        getEntityTypeFieldBuilder() {
      if (entityTypeBuilder_ == null) {
        entityTypeBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.dialogflow.v2beta1.EntityType,
                com.google.cloud.dialogflow.v2beta1.EntityType.Builder,
                com.google.cloud.dialogflow.v2beta1.EntityTypeOrBuilder>(
                getEntityType(), getParentForChildren(), isClean());
        entityType_ = null;
      }
      return entityTypeBuilder_;
    }

    private java.lang.Object languageCode_ = "";
    /**
     *
     *
     * <pre>
     * Optional. The language used to access language-specific data.
     * If not specified, the agent's default language is used.
     * For more information, see
     * [Multilingual intent and entity
     * data](https://cloud.google.com/dialogflow/docs/agents-multilingual#intent-entity).
     * </pre>
     *
     * <code>string language_code = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
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
     * Optional. The language used to access language-specific data.
     * If not specified, the agent's default language is used.
     * For more information, see
     * [Multilingual intent and entity
     * data](https://cloud.google.com/dialogflow/docs/agents-multilingual#intent-entity).
     * </pre>
     *
     * <code>string language_code = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
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
     * Optional. The language used to access language-specific data.
     * If not specified, the agent's default language is used.
     * For more information, see
     * [Multilingual intent and entity
     * data](https://cloud.google.com/dialogflow/docs/agents-multilingual#intent-entity).
     * </pre>
     *
     * <code>string language_code = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
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
     * Optional. The language used to access language-specific data.
     * If not specified, the agent's default language is used.
     * For more information, see
     * [Multilingual intent and entity
     * data](https://cloud.google.com/dialogflow/docs/agents-multilingual#intent-entity).
     * </pre>
     *
     * <code>string language_code = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
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
     * Optional. The language used to access language-specific data.
     * If not specified, the agent's default language is used.
     * For more information, see
     * [Multilingual intent and entity
     * data](https://cloud.google.com/dialogflow/docs/agents-multilingual#intent-entity).
     * </pre>
     *
     * <code>string language_code = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
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
     * Optional. The mask to control which fields get updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
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
     * Optional. The mask to control which fields get updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
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
     * Optional. The mask to control which fields get updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
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
     * Optional. The mask to control which fields get updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
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
     * Optional. The mask to control which fields get updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
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
     * Optional. The mask to control which fields get updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
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
     * Optional. The mask to control which fields get updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {

      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Optional. The mask to control which fields get updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
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
     * Optional. The mask to control which fields get updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
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

    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.v2beta1.UpdateEntityTypeRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.v2beta1.UpdateEntityTypeRequest)
  private static final com.google.cloud.dialogflow.v2beta1.UpdateEntityTypeRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.v2beta1.UpdateEntityTypeRequest();
  }

  public static com.google.cloud.dialogflow.v2beta1.UpdateEntityTypeRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateEntityTypeRequest> PARSER =
      new com.google.protobuf.AbstractParser<UpdateEntityTypeRequest>() {
        @java.lang.Override
        public UpdateEntityTypeRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateEntityTypeRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateEntityTypeRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.v2beta1.UpdateEntityTypeRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
