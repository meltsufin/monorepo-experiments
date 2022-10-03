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
// source: google/cloud/dialogflow/v2/participant.proto

package com.google.cloud.dialogflow.v2;

/**
 *
 *
 * <pre>
 * Represents a response from an automated agent.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.v2.AutomatedAgentReply}
 */
public final class AutomatedAgentReply extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.v2.AutomatedAgentReply)
    AutomatedAgentReplyOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use AutomatedAgentReply.newBuilder() to construct.
  private AutomatedAgentReply(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private AutomatedAgentReply() {
    automatedAgentReplyType_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new AutomatedAgentReply();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.dialogflow.v2.ParticipantProto
        .internal_static_google_cloud_dialogflow_v2_AutomatedAgentReply_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.v2.ParticipantProto
        .internal_static_google_cloud_dialogflow_v2_AutomatedAgentReply_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.v2.AutomatedAgentReply.class,
            com.google.cloud.dialogflow.v2.AutomatedAgentReply.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * Represents different automated agent reply types.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.dialogflow.v2.AutomatedAgentReply.AutomatedAgentReplyType}
   */
  public enum AutomatedAgentReplyType implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * Not specified. This should never happen.
     * </pre>
     *
     * <code>AUTOMATED_AGENT_REPLY_TYPE_UNSPECIFIED = 0;</code>
     */
    AUTOMATED_AGENT_REPLY_TYPE_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * Partial reply. e.g. Aggregated responses in a `Fulfillment` that enables
     * `return_partial_response` can be returned as partial reply.
     * WARNING: partial reply is not eligible for barge-in.
     * </pre>
     *
     * <code>PARTIAL = 1;</code>
     */
    PARTIAL(1),
    /**
     *
     *
     * <pre>
     * Final reply.
     * </pre>
     *
     * <code>FINAL = 2;</code>
     */
    FINAL(2),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * Not specified. This should never happen.
     * </pre>
     *
     * <code>AUTOMATED_AGENT_REPLY_TYPE_UNSPECIFIED = 0;</code>
     */
    public static final int AUTOMATED_AGENT_REPLY_TYPE_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * Partial reply. e.g. Aggregated responses in a `Fulfillment` that enables
     * `return_partial_response` can be returned as partial reply.
     * WARNING: partial reply is not eligible for barge-in.
     * </pre>
     *
     * <code>PARTIAL = 1;</code>
     */
    public static final int PARTIAL_VALUE = 1;
    /**
     *
     *
     * <pre>
     * Final reply.
     * </pre>
     *
     * <code>FINAL = 2;</code>
     */
    public static final int FINAL_VALUE = 2;

    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static AutomatedAgentReplyType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static AutomatedAgentReplyType forNumber(int value) {
      switch (value) {
        case 0:
          return AUTOMATED_AGENT_REPLY_TYPE_UNSPECIFIED;
        case 1:
          return PARTIAL;
        case 2:
          return FINAL;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<AutomatedAgentReplyType>
        internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<AutomatedAgentReplyType>
        internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<AutomatedAgentReplyType>() {
              public AutomatedAgentReplyType findValueByNumber(int number) {
                return AutomatedAgentReplyType.forNumber(number);
              }
            };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }

    public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
      return getDescriptor();
    }

    public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
      return com.google.cloud.dialogflow.v2.AutomatedAgentReply.getDescriptor()
          .getEnumTypes()
          .get(0);
    }

    private static final AutomatedAgentReplyType[] VALUES = values();

    public static AutomatedAgentReplyType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private AutomatedAgentReplyType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.dialogflow.v2.AutomatedAgentReply.AutomatedAgentReplyType)
  }

  public static final int DETECT_INTENT_RESPONSE_FIELD_NUMBER = 1;
  private com.google.cloud.dialogflow.v2.DetectIntentResponse detectIntentResponse_;
  /**
   *
   *
   * <pre>
   * Response of the Dialogflow [Sessions.DetectIntent][google.cloud.dialogflow.v2.Sessions.DetectIntent] call.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.DetectIntentResponse detect_intent_response = 1;</code>
   *
   * @return Whether the detectIntentResponse field is set.
   */
  @java.lang.Override
  public boolean hasDetectIntentResponse() {
    return detectIntentResponse_ != null;
  }
  /**
   *
   *
   * <pre>
   * Response of the Dialogflow [Sessions.DetectIntent][google.cloud.dialogflow.v2.Sessions.DetectIntent] call.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.DetectIntentResponse detect_intent_response = 1;</code>
   *
   * @return The detectIntentResponse.
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.v2.DetectIntentResponse getDetectIntentResponse() {
    return detectIntentResponse_ == null
        ? com.google.cloud.dialogflow.v2.DetectIntentResponse.getDefaultInstance()
        : detectIntentResponse_;
  }
  /**
   *
   *
   * <pre>
   * Response of the Dialogflow [Sessions.DetectIntent][google.cloud.dialogflow.v2.Sessions.DetectIntent] call.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.DetectIntentResponse detect_intent_response = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.v2.DetectIntentResponseOrBuilder
      getDetectIntentResponseOrBuilder() {
    return getDetectIntentResponse();
  }

  public static final int AUTOMATED_AGENT_REPLY_TYPE_FIELD_NUMBER = 7;
  private int automatedAgentReplyType_;
  /**
   *
   *
   * <pre>
   * AutomatedAgentReply type.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.AutomatedAgentReply.AutomatedAgentReplyType automated_agent_reply_type = 7;
   * </code>
   *
   * @return The enum numeric value on the wire for automatedAgentReplyType.
   */
  @java.lang.Override
  public int getAutomatedAgentReplyTypeValue() {
    return automatedAgentReplyType_;
  }
  /**
   *
   *
   * <pre>
   * AutomatedAgentReply type.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.AutomatedAgentReply.AutomatedAgentReplyType automated_agent_reply_type = 7;
   * </code>
   *
   * @return The automatedAgentReplyType.
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.v2.AutomatedAgentReply.AutomatedAgentReplyType
      getAutomatedAgentReplyType() {
    @SuppressWarnings("deprecation")
    com.google.cloud.dialogflow.v2.AutomatedAgentReply.AutomatedAgentReplyType result =
        com.google.cloud.dialogflow.v2.AutomatedAgentReply.AutomatedAgentReplyType.valueOf(
            automatedAgentReplyType_);
    return result == null
        ? com.google.cloud.dialogflow.v2.AutomatedAgentReply.AutomatedAgentReplyType.UNRECOGNIZED
        : result;
  }

  public static final int ALLOW_CANCELLATION_FIELD_NUMBER = 8;
  private boolean allowCancellation_;
  /**
   *
   *
   * <pre>
   * Indicates whether the partial automated agent reply is interruptible when a
   * later reply message arrives. e.g. if the agent specified some music as
   * partial response, it can be cancelled.
   * </pre>
   *
   * <code>bool allow_cancellation = 8;</code>
   *
   * @return The allowCancellation.
   */
  @java.lang.Override
  public boolean getAllowCancellation() {
    return allowCancellation_;
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
    if (detectIntentResponse_ != null) {
      output.writeMessage(1, getDetectIntentResponse());
    }
    if (automatedAgentReplyType_
        != com.google.cloud.dialogflow.v2.AutomatedAgentReply.AutomatedAgentReplyType
            .AUTOMATED_AGENT_REPLY_TYPE_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(7, automatedAgentReplyType_);
    }
    if (allowCancellation_ != false) {
      output.writeBool(8, allowCancellation_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (detectIntentResponse_ != null) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(1, getDetectIntentResponse());
    }
    if (automatedAgentReplyType_
        != com.google.cloud.dialogflow.v2.AutomatedAgentReply.AutomatedAgentReplyType
            .AUTOMATED_AGENT_REPLY_TYPE_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(7, automatedAgentReplyType_);
    }
    if (allowCancellation_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(8, allowCancellation_);
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
    if (!(obj instanceof com.google.cloud.dialogflow.v2.AutomatedAgentReply)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.v2.AutomatedAgentReply other =
        (com.google.cloud.dialogflow.v2.AutomatedAgentReply) obj;

    if (hasDetectIntentResponse() != other.hasDetectIntentResponse()) return false;
    if (hasDetectIntentResponse()) {
      if (!getDetectIntentResponse().equals(other.getDetectIntentResponse())) return false;
    }
    if (automatedAgentReplyType_ != other.automatedAgentReplyType_) return false;
    if (getAllowCancellation() != other.getAllowCancellation()) return false;
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
    if (hasDetectIntentResponse()) {
      hash = (37 * hash) + DETECT_INTENT_RESPONSE_FIELD_NUMBER;
      hash = (53 * hash) + getDetectIntentResponse().hashCode();
    }
    hash = (37 * hash) + AUTOMATED_AGENT_REPLY_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + automatedAgentReplyType_;
    hash = (37 * hash) + ALLOW_CANCELLATION_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getAllowCancellation());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.v2.AutomatedAgentReply parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2.AutomatedAgentReply parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.AutomatedAgentReply parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2.AutomatedAgentReply parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.AutomatedAgentReply parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2.AutomatedAgentReply parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.AutomatedAgentReply parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2.AutomatedAgentReply parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.AutomatedAgentReply parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2.AutomatedAgentReply parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.AutomatedAgentReply parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2.AutomatedAgentReply parseFrom(
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

  public static Builder newBuilder(com.google.cloud.dialogflow.v2.AutomatedAgentReply prototype) {
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
   * Represents a response from an automated agent.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.v2.AutomatedAgentReply}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.v2.AutomatedAgentReply)
      com.google.cloud.dialogflow.v2.AutomatedAgentReplyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dialogflow.v2.ParticipantProto
          .internal_static_google_cloud_dialogflow_v2_AutomatedAgentReply_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.v2.ParticipantProto
          .internal_static_google_cloud_dialogflow_v2_AutomatedAgentReply_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.v2.AutomatedAgentReply.class,
              com.google.cloud.dialogflow.v2.AutomatedAgentReply.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.v2.AutomatedAgentReply.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (detectIntentResponseBuilder_ == null) {
        detectIntentResponse_ = null;
      } else {
        detectIntentResponse_ = null;
        detectIntentResponseBuilder_ = null;
      }
      automatedAgentReplyType_ = 0;

      allowCancellation_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dialogflow.v2.ParticipantProto
          .internal_static_google_cloud_dialogflow_v2_AutomatedAgentReply_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.AutomatedAgentReply getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.v2.AutomatedAgentReply.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.AutomatedAgentReply build() {
      com.google.cloud.dialogflow.v2.AutomatedAgentReply result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.AutomatedAgentReply buildPartial() {
      com.google.cloud.dialogflow.v2.AutomatedAgentReply result =
          new com.google.cloud.dialogflow.v2.AutomatedAgentReply(this);
      if (detectIntentResponseBuilder_ == null) {
        result.detectIntentResponse_ = detectIntentResponse_;
      } else {
        result.detectIntentResponse_ = detectIntentResponseBuilder_.build();
      }
      result.automatedAgentReplyType_ = automatedAgentReplyType_;
      result.allowCancellation_ = allowCancellation_;
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
      if (other instanceof com.google.cloud.dialogflow.v2.AutomatedAgentReply) {
        return mergeFrom((com.google.cloud.dialogflow.v2.AutomatedAgentReply) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dialogflow.v2.AutomatedAgentReply other) {
      if (other == com.google.cloud.dialogflow.v2.AutomatedAgentReply.getDefaultInstance())
        return this;
      if (other.hasDetectIntentResponse()) {
        mergeDetectIntentResponse(other.getDetectIntentResponse());
      }
      if (other.automatedAgentReplyType_ != 0) {
        setAutomatedAgentReplyTypeValue(other.getAutomatedAgentReplyTypeValue());
      }
      if (other.getAllowCancellation() != false) {
        setAllowCancellation(other.getAllowCancellation());
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
                input.readMessage(
                    getDetectIntentResponseFieldBuilder().getBuilder(), extensionRegistry);

                break;
              } // case 10
            case 56:
              {
                automatedAgentReplyType_ = input.readEnum();

                break;
              } // case 56
            case 64:
              {
                allowCancellation_ = input.readBool();

                break;
              } // case 64
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

    private com.google.cloud.dialogflow.v2.DetectIntentResponse detectIntentResponse_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dialogflow.v2.DetectIntentResponse,
            com.google.cloud.dialogflow.v2.DetectIntentResponse.Builder,
            com.google.cloud.dialogflow.v2.DetectIntentResponseOrBuilder>
        detectIntentResponseBuilder_;
    /**
     *
     *
     * <pre>
     * Response of the Dialogflow [Sessions.DetectIntent][google.cloud.dialogflow.v2.Sessions.DetectIntent] call.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.DetectIntentResponse detect_intent_response = 1;</code>
     *
     * @return Whether the detectIntentResponse field is set.
     */
    public boolean hasDetectIntentResponse() {
      return detectIntentResponseBuilder_ != null || detectIntentResponse_ != null;
    }
    /**
     *
     *
     * <pre>
     * Response of the Dialogflow [Sessions.DetectIntent][google.cloud.dialogflow.v2.Sessions.DetectIntent] call.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.DetectIntentResponse detect_intent_response = 1;</code>
     *
     * @return The detectIntentResponse.
     */
    public com.google.cloud.dialogflow.v2.DetectIntentResponse getDetectIntentResponse() {
      if (detectIntentResponseBuilder_ == null) {
        return detectIntentResponse_ == null
            ? com.google.cloud.dialogflow.v2.DetectIntentResponse.getDefaultInstance()
            : detectIntentResponse_;
      } else {
        return detectIntentResponseBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Response of the Dialogflow [Sessions.DetectIntent][google.cloud.dialogflow.v2.Sessions.DetectIntent] call.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.DetectIntentResponse detect_intent_response = 1;</code>
     */
    public Builder setDetectIntentResponse(
        com.google.cloud.dialogflow.v2.DetectIntentResponse value) {
      if (detectIntentResponseBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        detectIntentResponse_ = value;
        onChanged();
      } else {
        detectIntentResponseBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Response of the Dialogflow [Sessions.DetectIntent][google.cloud.dialogflow.v2.Sessions.DetectIntent] call.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.DetectIntentResponse detect_intent_response = 1;</code>
     */
    public Builder setDetectIntentResponse(
        com.google.cloud.dialogflow.v2.DetectIntentResponse.Builder builderForValue) {
      if (detectIntentResponseBuilder_ == null) {
        detectIntentResponse_ = builderForValue.build();
        onChanged();
      } else {
        detectIntentResponseBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Response of the Dialogflow [Sessions.DetectIntent][google.cloud.dialogflow.v2.Sessions.DetectIntent] call.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.DetectIntentResponse detect_intent_response = 1;</code>
     */
    public Builder mergeDetectIntentResponse(
        com.google.cloud.dialogflow.v2.DetectIntentResponse value) {
      if (detectIntentResponseBuilder_ == null) {
        if (detectIntentResponse_ != null) {
          detectIntentResponse_ =
              com.google.cloud.dialogflow.v2.DetectIntentResponse.newBuilder(detectIntentResponse_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          detectIntentResponse_ = value;
        }
        onChanged();
      } else {
        detectIntentResponseBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Response of the Dialogflow [Sessions.DetectIntent][google.cloud.dialogflow.v2.Sessions.DetectIntent] call.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.DetectIntentResponse detect_intent_response = 1;</code>
     */
    public Builder clearDetectIntentResponse() {
      if (detectIntentResponseBuilder_ == null) {
        detectIntentResponse_ = null;
        onChanged();
      } else {
        detectIntentResponse_ = null;
        detectIntentResponseBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Response of the Dialogflow [Sessions.DetectIntent][google.cloud.dialogflow.v2.Sessions.DetectIntent] call.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.DetectIntentResponse detect_intent_response = 1;</code>
     */
    public com.google.cloud.dialogflow.v2.DetectIntentResponse.Builder
        getDetectIntentResponseBuilder() {

      onChanged();
      return getDetectIntentResponseFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Response of the Dialogflow [Sessions.DetectIntent][google.cloud.dialogflow.v2.Sessions.DetectIntent] call.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.DetectIntentResponse detect_intent_response = 1;</code>
     */
    public com.google.cloud.dialogflow.v2.DetectIntentResponseOrBuilder
        getDetectIntentResponseOrBuilder() {
      if (detectIntentResponseBuilder_ != null) {
        return detectIntentResponseBuilder_.getMessageOrBuilder();
      } else {
        return detectIntentResponse_ == null
            ? com.google.cloud.dialogflow.v2.DetectIntentResponse.getDefaultInstance()
            : detectIntentResponse_;
      }
    }
    /**
     *
     *
     * <pre>
     * Response of the Dialogflow [Sessions.DetectIntent][google.cloud.dialogflow.v2.Sessions.DetectIntent] call.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.DetectIntentResponse detect_intent_response = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dialogflow.v2.DetectIntentResponse,
            com.google.cloud.dialogflow.v2.DetectIntentResponse.Builder,
            com.google.cloud.dialogflow.v2.DetectIntentResponseOrBuilder>
        getDetectIntentResponseFieldBuilder() {
      if (detectIntentResponseBuilder_ == null) {
        detectIntentResponseBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.dialogflow.v2.DetectIntentResponse,
                com.google.cloud.dialogflow.v2.DetectIntentResponse.Builder,
                com.google.cloud.dialogflow.v2.DetectIntentResponseOrBuilder>(
                getDetectIntentResponse(), getParentForChildren(), isClean());
        detectIntentResponse_ = null;
      }
      return detectIntentResponseBuilder_;
    }

    private int automatedAgentReplyType_ = 0;
    /**
     *
     *
     * <pre>
     * AutomatedAgentReply type.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.v2.AutomatedAgentReply.AutomatedAgentReplyType automated_agent_reply_type = 7;
     * </code>
     *
     * @return The enum numeric value on the wire for automatedAgentReplyType.
     */
    @java.lang.Override
    public int getAutomatedAgentReplyTypeValue() {
      return automatedAgentReplyType_;
    }
    /**
     *
     *
     * <pre>
     * AutomatedAgentReply type.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.v2.AutomatedAgentReply.AutomatedAgentReplyType automated_agent_reply_type = 7;
     * </code>
     *
     * @param value The enum numeric value on the wire for automatedAgentReplyType to set.
     * @return This builder for chaining.
     */
    public Builder setAutomatedAgentReplyTypeValue(int value) {

      automatedAgentReplyType_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * AutomatedAgentReply type.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.v2.AutomatedAgentReply.AutomatedAgentReplyType automated_agent_reply_type = 7;
     * </code>
     *
     * @return The automatedAgentReplyType.
     */
    @java.lang.Override
    public com.google.cloud.dialogflow.v2.AutomatedAgentReply.AutomatedAgentReplyType
        getAutomatedAgentReplyType() {
      @SuppressWarnings("deprecation")
      com.google.cloud.dialogflow.v2.AutomatedAgentReply.AutomatedAgentReplyType result =
          com.google.cloud.dialogflow.v2.AutomatedAgentReply.AutomatedAgentReplyType.valueOf(
              automatedAgentReplyType_);
      return result == null
          ? com.google.cloud.dialogflow.v2.AutomatedAgentReply.AutomatedAgentReplyType.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * AutomatedAgentReply type.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.v2.AutomatedAgentReply.AutomatedAgentReplyType automated_agent_reply_type = 7;
     * </code>
     *
     * @param value The automatedAgentReplyType to set.
     * @return This builder for chaining.
     */
    public Builder setAutomatedAgentReplyType(
        com.google.cloud.dialogflow.v2.AutomatedAgentReply.AutomatedAgentReplyType value) {
      if (value == null) {
        throw new NullPointerException();
      }

      automatedAgentReplyType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * AutomatedAgentReply type.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.v2.AutomatedAgentReply.AutomatedAgentReplyType automated_agent_reply_type = 7;
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearAutomatedAgentReplyType() {

      automatedAgentReplyType_ = 0;
      onChanged();
      return this;
    }

    private boolean allowCancellation_;
    /**
     *
     *
     * <pre>
     * Indicates whether the partial automated agent reply is interruptible when a
     * later reply message arrives. e.g. if the agent specified some music as
     * partial response, it can be cancelled.
     * </pre>
     *
     * <code>bool allow_cancellation = 8;</code>
     *
     * @return The allowCancellation.
     */
    @java.lang.Override
    public boolean getAllowCancellation() {
      return allowCancellation_;
    }
    /**
     *
     *
     * <pre>
     * Indicates whether the partial automated agent reply is interruptible when a
     * later reply message arrives. e.g. if the agent specified some music as
     * partial response, it can be cancelled.
     * </pre>
     *
     * <code>bool allow_cancellation = 8;</code>
     *
     * @param value The allowCancellation to set.
     * @return This builder for chaining.
     */
    public Builder setAllowCancellation(boolean value) {

      allowCancellation_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Indicates whether the partial automated agent reply is interruptible when a
     * later reply message arrives. e.g. if the agent specified some music as
     * partial response, it can be cancelled.
     * </pre>
     *
     * <code>bool allow_cancellation = 8;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearAllowCancellation() {

      allowCancellation_ = false;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.v2.AutomatedAgentReply)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.v2.AutomatedAgentReply)
  private static final com.google.cloud.dialogflow.v2.AutomatedAgentReply DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.v2.AutomatedAgentReply();
  }

  public static com.google.cloud.dialogflow.v2.AutomatedAgentReply getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AutomatedAgentReply> PARSER =
      new com.google.protobuf.AbstractParser<AutomatedAgentReply>() {
        @java.lang.Override
        public AutomatedAgentReply parsePartialFrom(
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

  public static com.google.protobuf.Parser<AutomatedAgentReply> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AutomatedAgentReply> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.v2.AutomatedAgentReply getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
