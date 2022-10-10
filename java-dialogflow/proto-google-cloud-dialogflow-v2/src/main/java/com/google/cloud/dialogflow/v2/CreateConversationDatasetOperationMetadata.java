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
// source: google/cloud/dialogflow/v2/conversation_dataset.proto

package com.google.cloud.dialogflow.v2;

/**
 *
 *
 * <pre>
 * Metadata for [ConversationDatasets][CreateConversationDataset].
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.v2.CreateConversationDatasetOperationMetadata}
 */
public final class CreateConversationDatasetOperationMetadata
    extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.v2.CreateConversationDatasetOperationMetadata)
    CreateConversationDatasetOperationMetadataOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateConversationDatasetOperationMetadata.newBuilder() to construct.
  private CreateConversationDatasetOperationMetadata(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateConversationDatasetOperationMetadata() {
    conversationDataset_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateConversationDatasetOperationMetadata();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.dialogflow.v2.ConversationDatasetProto
        .internal_static_google_cloud_dialogflow_v2_CreateConversationDatasetOperationMetadata_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.v2.ConversationDatasetProto
        .internal_static_google_cloud_dialogflow_v2_CreateConversationDatasetOperationMetadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.v2.CreateConversationDatasetOperationMetadata.class,
            com.google.cloud.dialogflow.v2.CreateConversationDatasetOperationMetadata.Builder
                .class);
  }

  public static final int CONVERSATION_DATASET_FIELD_NUMBER = 1;
  private volatile java.lang.Object conversationDataset_;
  /**
   *
   *
   * <pre>
   * The resource name of the conversation dataset that will be created. Format:
   * `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/conversationDatasets/&lt;Conversation Dataset Id&gt;`
   * </pre>
   *
   * <code>string conversation_dataset = 1 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The conversationDataset.
   */
  @java.lang.Override
  public java.lang.String getConversationDataset() {
    java.lang.Object ref = conversationDataset_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      conversationDataset_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The resource name of the conversation dataset that will be created. Format:
   * `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/conversationDatasets/&lt;Conversation Dataset Id&gt;`
   * </pre>
   *
   * <code>string conversation_dataset = 1 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for conversationDataset.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getConversationDatasetBytes() {
    java.lang.Object ref = conversationDataset_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      conversationDataset_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(conversationDataset_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, conversationDataset_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(conversationDataset_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, conversationDataset_);
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
    if (!(obj
        instanceof com.google.cloud.dialogflow.v2.CreateConversationDatasetOperationMetadata)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.v2.CreateConversationDatasetOperationMetadata other =
        (com.google.cloud.dialogflow.v2.CreateConversationDatasetOperationMetadata) obj;

    if (!getConversationDataset().equals(other.getConversationDataset())) return false;
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
    hash = (37 * hash) + CONVERSATION_DATASET_FIELD_NUMBER;
    hash = (53 * hash) + getConversationDataset().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.v2.CreateConversationDatasetOperationMetadata parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2.CreateConversationDatasetOperationMetadata parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.CreateConversationDatasetOperationMetadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2.CreateConversationDatasetOperationMetadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.CreateConversationDatasetOperationMetadata parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2.CreateConversationDatasetOperationMetadata parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.CreateConversationDatasetOperationMetadata parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2.CreateConversationDatasetOperationMetadata parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.CreateConversationDatasetOperationMetadata
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2.CreateConversationDatasetOperationMetadata
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.CreateConversationDatasetOperationMetadata parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2.CreateConversationDatasetOperationMetadata parseFrom(
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
      com.google.cloud.dialogflow.v2.CreateConversationDatasetOperationMetadata prototype) {
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
   * Metadata for [ConversationDatasets][CreateConversationDataset].
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.v2.CreateConversationDatasetOperationMetadata}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.v2.CreateConversationDatasetOperationMetadata)
      com.google.cloud.dialogflow.v2.CreateConversationDatasetOperationMetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dialogflow.v2.ConversationDatasetProto
          .internal_static_google_cloud_dialogflow_v2_CreateConversationDatasetOperationMetadata_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.v2.ConversationDatasetProto
          .internal_static_google_cloud_dialogflow_v2_CreateConversationDatasetOperationMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.v2.CreateConversationDatasetOperationMetadata.class,
              com.google.cloud.dialogflow.v2.CreateConversationDatasetOperationMetadata.Builder
                  .class);
    }

    // Construct using
    // com.google.cloud.dialogflow.v2.CreateConversationDatasetOperationMetadata.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      conversationDataset_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dialogflow.v2.ConversationDatasetProto
          .internal_static_google_cloud_dialogflow_v2_CreateConversationDatasetOperationMetadata_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.CreateConversationDatasetOperationMetadata
        getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.v2.CreateConversationDatasetOperationMetadata
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.CreateConversationDatasetOperationMetadata build() {
      com.google.cloud.dialogflow.v2.CreateConversationDatasetOperationMetadata result =
          buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.CreateConversationDatasetOperationMetadata
        buildPartial() {
      com.google.cloud.dialogflow.v2.CreateConversationDatasetOperationMetadata result =
          new com.google.cloud.dialogflow.v2.CreateConversationDatasetOperationMetadata(this);
      result.conversationDataset_ = conversationDataset_;
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
      if (other
          instanceof com.google.cloud.dialogflow.v2.CreateConversationDatasetOperationMetadata) {
        return mergeFrom(
            (com.google.cloud.dialogflow.v2.CreateConversationDatasetOperationMetadata) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.dialogflow.v2.CreateConversationDatasetOperationMetadata other) {
      if (other
          == com.google.cloud.dialogflow.v2.CreateConversationDatasetOperationMetadata
              .getDefaultInstance()) return this;
      if (!other.getConversationDataset().isEmpty()) {
        conversationDataset_ = other.conversationDataset_;
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
                conversationDataset_ = input.readStringRequireUtf8();

                break;
              } // case 10
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

    private java.lang.Object conversationDataset_ = "";
    /**
     *
     *
     * <pre>
     * The resource name of the conversation dataset that will be created. Format:
     * `projects/&lt;Project ID&gt;/locations/&lt;Location
     * ID&gt;/conversationDatasets/&lt;Conversation Dataset Id&gt;`
     * </pre>
     *
     * <code>string conversation_dataset = 1 [(.google.api.resource_reference) = { ... }</code>
     *
     * @return The conversationDataset.
     */
    public java.lang.String getConversationDataset() {
      java.lang.Object ref = conversationDataset_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        conversationDataset_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The resource name of the conversation dataset that will be created. Format:
     * `projects/&lt;Project ID&gt;/locations/&lt;Location
     * ID&gt;/conversationDatasets/&lt;Conversation Dataset Id&gt;`
     * </pre>
     *
     * <code>string conversation_dataset = 1 [(.google.api.resource_reference) = { ... }</code>
     *
     * @return The bytes for conversationDataset.
     */
    public com.google.protobuf.ByteString getConversationDatasetBytes() {
      java.lang.Object ref = conversationDataset_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        conversationDataset_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The resource name of the conversation dataset that will be created. Format:
     * `projects/&lt;Project ID&gt;/locations/&lt;Location
     * ID&gt;/conversationDatasets/&lt;Conversation Dataset Id&gt;`
     * </pre>
     *
     * <code>string conversation_dataset = 1 [(.google.api.resource_reference) = { ... }</code>
     *
     * @param value The conversationDataset to set.
     * @return This builder for chaining.
     */
    public Builder setConversationDataset(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      conversationDataset_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The resource name of the conversation dataset that will be created. Format:
     * `projects/&lt;Project ID&gt;/locations/&lt;Location
     * ID&gt;/conversationDatasets/&lt;Conversation Dataset Id&gt;`
     * </pre>
     *
     * <code>string conversation_dataset = 1 [(.google.api.resource_reference) = { ... }</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearConversationDataset() {

      conversationDataset_ = getDefaultInstance().getConversationDataset();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The resource name of the conversation dataset that will be created. Format:
     * `projects/&lt;Project ID&gt;/locations/&lt;Location
     * ID&gt;/conversationDatasets/&lt;Conversation Dataset Id&gt;`
     * </pre>
     *
     * <code>string conversation_dataset = 1 [(.google.api.resource_reference) = { ... }</code>
     *
     * @param value The bytes for conversationDataset to set.
     * @return This builder for chaining.
     */
    public Builder setConversationDatasetBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      conversationDataset_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.v2.CreateConversationDatasetOperationMetadata)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.v2.CreateConversationDatasetOperationMetadata)
  private static final com.google.cloud.dialogflow.v2.CreateConversationDatasetOperationMetadata
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE =
        new com.google.cloud.dialogflow.v2.CreateConversationDatasetOperationMetadata();
  }

  public static com.google.cloud.dialogflow.v2.CreateConversationDatasetOperationMetadata
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateConversationDatasetOperationMetadata>
      PARSER =
          new com.google.protobuf.AbstractParser<CreateConversationDatasetOperationMetadata>() {
            @java.lang.Override
            public CreateConversationDatasetOperationMetadata parsePartialFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
              Builder builder = newBuilder();
              try {
                builder.mergeFrom(input, extensionRegistry);
              } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(builder.buildPartial());
              } catch (com.google.protobuf.UninitializedMessageException e) {
                throw e.asInvalidProtocolBufferException()
                    .setUnfinishedMessage(builder.buildPartial());
              } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(e)
                    .setUnfinishedMessage(builder.buildPartial());
              }
              return builder.buildPartial();
            }
          };

  public static com.google.protobuf.Parser<CreateConversationDatasetOperationMetadata> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateConversationDatasetOperationMetadata> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.v2.CreateConversationDatasetOperationMetadata
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
