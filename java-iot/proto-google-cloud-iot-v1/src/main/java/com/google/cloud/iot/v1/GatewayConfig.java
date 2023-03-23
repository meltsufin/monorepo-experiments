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
// source: google/cloud/iot/v1/resources.proto

package com.google.cloud.iot.v1;

/**
 *
 *
 * <pre>
 * Gateway-related configuration and state.
 * </pre>
 *
 * Protobuf type {@code google.cloud.iot.v1.GatewayConfig}
 */
public final class GatewayConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.iot.v1.GatewayConfig)
    GatewayConfigOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use GatewayConfig.newBuilder() to construct.
  private GatewayConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private GatewayConfig() {
    gatewayType_ = 0;
    gatewayAuthMethod_ = 0;
    lastAccessedGatewayId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new GatewayConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.iot.v1.ResourcesProto
        .internal_static_google_cloud_iot_v1_GatewayConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.iot.v1.ResourcesProto
        .internal_static_google_cloud_iot_v1_GatewayConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.iot.v1.GatewayConfig.class,
            com.google.cloud.iot.v1.GatewayConfig.Builder.class);
  }

  public static final int GATEWAY_TYPE_FIELD_NUMBER = 1;
  private int gatewayType_;
  /**
   *
   *
   * <pre>
   * Indicates whether the device is a gateway.
   * </pre>
   *
   * <code>.google.cloud.iot.v1.GatewayType gateway_type = 1;</code>
   *
   * @return The enum numeric value on the wire for gatewayType.
   */
  @java.lang.Override
  public int getGatewayTypeValue() {
    return gatewayType_;
  }
  /**
   *
   *
   * <pre>
   * Indicates whether the device is a gateway.
   * </pre>
   *
   * <code>.google.cloud.iot.v1.GatewayType gateway_type = 1;</code>
   *
   * @return The gatewayType.
   */
  @java.lang.Override
  public com.google.cloud.iot.v1.GatewayType getGatewayType() {
    @SuppressWarnings("deprecation")
    com.google.cloud.iot.v1.GatewayType result =
        com.google.cloud.iot.v1.GatewayType.valueOf(gatewayType_);
    return result == null ? com.google.cloud.iot.v1.GatewayType.UNRECOGNIZED : result;
  }

  public static final int GATEWAY_AUTH_METHOD_FIELD_NUMBER = 2;
  private int gatewayAuthMethod_;
  /**
   *
   *
   * <pre>
   * Indicates how to authorize and/or authenticate devices to access the
   * gateway.
   * </pre>
   *
   * <code>.google.cloud.iot.v1.GatewayAuthMethod gateway_auth_method = 2;</code>
   *
   * @return The enum numeric value on the wire for gatewayAuthMethod.
   */
  @java.lang.Override
  public int getGatewayAuthMethodValue() {
    return gatewayAuthMethod_;
  }
  /**
   *
   *
   * <pre>
   * Indicates how to authorize and/or authenticate devices to access the
   * gateway.
   * </pre>
   *
   * <code>.google.cloud.iot.v1.GatewayAuthMethod gateway_auth_method = 2;</code>
   *
   * @return The gatewayAuthMethod.
   */
  @java.lang.Override
  public com.google.cloud.iot.v1.GatewayAuthMethod getGatewayAuthMethod() {
    @SuppressWarnings("deprecation")
    com.google.cloud.iot.v1.GatewayAuthMethod result =
        com.google.cloud.iot.v1.GatewayAuthMethod.valueOf(gatewayAuthMethod_);
    return result == null ? com.google.cloud.iot.v1.GatewayAuthMethod.UNRECOGNIZED : result;
  }

  public static final int LAST_ACCESSED_GATEWAY_ID_FIELD_NUMBER = 3;
  private volatile java.lang.Object lastAccessedGatewayId_;
  /**
   *
   *
   * <pre>
   * [Output only] The ID of the gateway the device accessed most recently.
   * </pre>
   *
   * <code>string last_accessed_gateway_id = 3;</code>
   *
   * @return The lastAccessedGatewayId.
   */
  @java.lang.Override
  public java.lang.String getLastAccessedGatewayId() {
    java.lang.Object ref = lastAccessedGatewayId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      lastAccessedGatewayId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * [Output only] The ID of the gateway the device accessed most recently.
   * </pre>
   *
   * <code>string last_accessed_gateway_id = 3;</code>
   *
   * @return The bytes for lastAccessedGatewayId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getLastAccessedGatewayIdBytes() {
    java.lang.Object ref = lastAccessedGatewayId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      lastAccessedGatewayId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LAST_ACCESSED_GATEWAY_TIME_FIELD_NUMBER = 4;
  private com.google.protobuf.Timestamp lastAccessedGatewayTime_;
  /**
   *
   *
   * <pre>
   * [Output only] The most recent time at which the device accessed the gateway
   * specified in `last_accessed_gateway`.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_accessed_gateway_time = 4;</code>
   *
   * @return Whether the lastAccessedGatewayTime field is set.
   */
  @java.lang.Override
  public boolean hasLastAccessedGatewayTime() {
    return lastAccessedGatewayTime_ != null;
  }
  /**
   *
   *
   * <pre>
   * [Output only] The most recent time at which the device accessed the gateway
   * specified in `last_accessed_gateway`.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_accessed_gateway_time = 4;</code>
   *
   * @return The lastAccessedGatewayTime.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getLastAccessedGatewayTime() {
    return lastAccessedGatewayTime_ == null
        ? com.google.protobuf.Timestamp.getDefaultInstance()
        : lastAccessedGatewayTime_;
  }
  /**
   *
   *
   * <pre>
   * [Output only] The most recent time at which the device accessed the gateway
   * specified in `last_accessed_gateway`.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_accessed_gateway_time = 4;</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getLastAccessedGatewayTimeOrBuilder() {
    return getLastAccessedGatewayTime();
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
    if (gatewayType_ != com.google.cloud.iot.v1.GatewayType.GATEWAY_TYPE_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, gatewayType_);
    }
    if (gatewayAuthMethod_
        != com.google.cloud.iot.v1.GatewayAuthMethod.GATEWAY_AUTH_METHOD_UNSPECIFIED.getNumber()) {
      output.writeEnum(2, gatewayAuthMethod_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(lastAccessedGatewayId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, lastAccessedGatewayId_);
    }
    if (lastAccessedGatewayTime_ != null) {
      output.writeMessage(4, getLastAccessedGatewayTime());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (gatewayType_ != com.google.cloud.iot.v1.GatewayType.GATEWAY_TYPE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, gatewayType_);
    }
    if (gatewayAuthMethod_
        != com.google.cloud.iot.v1.GatewayAuthMethod.GATEWAY_AUTH_METHOD_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(2, gatewayAuthMethod_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(lastAccessedGatewayId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, lastAccessedGatewayId_);
    }
    if (lastAccessedGatewayTime_ != null) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(4, getLastAccessedGatewayTime());
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
    if (!(obj instanceof com.google.cloud.iot.v1.GatewayConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.iot.v1.GatewayConfig other = (com.google.cloud.iot.v1.GatewayConfig) obj;

    if (gatewayType_ != other.gatewayType_) return false;
    if (gatewayAuthMethod_ != other.gatewayAuthMethod_) return false;
    if (!getLastAccessedGatewayId().equals(other.getLastAccessedGatewayId())) return false;
    if (hasLastAccessedGatewayTime() != other.hasLastAccessedGatewayTime()) return false;
    if (hasLastAccessedGatewayTime()) {
      if (!getLastAccessedGatewayTime().equals(other.getLastAccessedGatewayTime())) return false;
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
    hash = (37 * hash) + GATEWAY_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + gatewayType_;
    hash = (37 * hash) + GATEWAY_AUTH_METHOD_FIELD_NUMBER;
    hash = (53 * hash) + gatewayAuthMethod_;
    hash = (37 * hash) + LAST_ACCESSED_GATEWAY_ID_FIELD_NUMBER;
    hash = (53 * hash) + getLastAccessedGatewayId().hashCode();
    if (hasLastAccessedGatewayTime()) {
      hash = (37 * hash) + LAST_ACCESSED_GATEWAY_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getLastAccessedGatewayTime().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.iot.v1.GatewayConfig parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.iot.v1.GatewayConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.iot.v1.GatewayConfig parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.iot.v1.GatewayConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.iot.v1.GatewayConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.iot.v1.GatewayConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.iot.v1.GatewayConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.iot.v1.GatewayConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.iot.v1.GatewayConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.iot.v1.GatewayConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.iot.v1.GatewayConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.iot.v1.GatewayConfig parseFrom(
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

  public static Builder newBuilder(com.google.cloud.iot.v1.GatewayConfig prototype) {
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
   * Gateway-related configuration and state.
   * </pre>
   *
   * Protobuf type {@code google.cloud.iot.v1.GatewayConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.iot.v1.GatewayConfig)
      com.google.cloud.iot.v1.GatewayConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.iot.v1.ResourcesProto
          .internal_static_google_cloud_iot_v1_GatewayConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.iot.v1.ResourcesProto
          .internal_static_google_cloud_iot_v1_GatewayConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.iot.v1.GatewayConfig.class,
              com.google.cloud.iot.v1.GatewayConfig.Builder.class);
    }

    // Construct using com.google.cloud.iot.v1.GatewayConfig.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      gatewayType_ = 0;

      gatewayAuthMethod_ = 0;

      lastAccessedGatewayId_ = "";

      if (lastAccessedGatewayTimeBuilder_ == null) {
        lastAccessedGatewayTime_ = null;
      } else {
        lastAccessedGatewayTime_ = null;
        lastAccessedGatewayTimeBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.iot.v1.ResourcesProto
          .internal_static_google_cloud_iot_v1_GatewayConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.iot.v1.GatewayConfig getDefaultInstanceForType() {
      return com.google.cloud.iot.v1.GatewayConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.iot.v1.GatewayConfig build() {
      com.google.cloud.iot.v1.GatewayConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.iot.v1.GatewayConfig buildPartial() {
      com.google.cloud.iot.v1.GatewayConfig result =
          new com.google.cloud.iot.v1.GatewayConfig(this);
      result.gatewayType_ = gatewayType_;
      result.gatewayAuthMethod_ = gatewayAuthMethod_;
      result.lastAccessedGatewayId_ = lastAccessedGatewayId_;
      if (lastAccessedGatewayTimeBuilder_ == null) {
        result.lastAccessedGatewayTime_ = lastAccessedGatewayTime_;
      } else {
        result.lastAccessedGatewayTime_ = lastAccessedGatewayTimeBuilder_.build();
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
      if (other instanceof com.google.cloud.iot.v1.GatewayConfig) {
        return mergeFrom((com.google.cloud.iot.v1.GatewayConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.iot.v1.GatewayConfig other) {
      if (other == com.google.cloud.iot.v1.GatewayConfig.getDefaultInstance()) return this;
      if (other.gatewayType_ != 0) {
        setGatewayTypeValue(other.getGatewayTypeValue());
      }
      if (other.gatewayAuthMethod_ != 0) {
        setGatewayAuthMethodValue(other.getGatewayAuthMethodValue());
      }
      if (!other.getLastAccessedGatewayId().isEmpty()) {
        lastAccessedGatewayId_ = other.lastAccessedGatewayId_;
        onChanged();
      }
      if (other.hasLastAccessedGatewayTime()) {
        mergeLastAccessedGatewayTime(other.getLastAccessedGatewayTime());
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
                gatewayType_ = input.readEnum();

                break;
              } // case 8
            case 16:
              {
                gatewayAuthMethod_ = input.readEnum();

                break;
              } // case 16
            case 26:
              {
                lastAccessedGatewayId_ = input.readStringRequireUtf8();

                break;
              } // case 26
            case 34:
              {
                input.readMessage(
                    getLastAccessedGatewayTimeFieldBuilder().getBuilder(), extensionRegistry);

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

    private int gatewayType_ = 0;
    /**
     *
     *
     * <pre>
     * Indicates whether the device is a gateway.
     * </pre>
     *
     * <code>.google.cloud.iot.v1.GatewayType gateway_type = 1;</code>
     *
     * @return The enum numeric value on the wire for gatewayType.
     */
    @java.lang.Override
    public int getGatewayTypeValue() {
      return gatewayType_;
    }
    /**
     *
     *
     * <pre>
     * Indicates whether the device is a gateway.
     * </pre>
     *
     * <code>.google.cloud.iot.v1.GatewayType gateway_type = 1;</code>
     *
     * @param value The enum numeric value on the wire for gatewayType to set.
     * @return This builder for chaining.
     */
    public Builder setGatewayTypeValue(int value) {

      gatewayType_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Indicates whether the device is a gateway.
     * </pre>
     *
     * <code>.google.cloud.iot.v1.GatewayType gateway_type = 1;</code>
     *
     * @return The gatewayType.
     */
    @java.lang.Override
    public com.google.cloud.iot.v1.GatewayType getGatewayType() {
      @SuppressWarnings("deprecation")
      com.google.cloud.iot.v1.GatewayType result =
          com.google.cloud.iot.v1.GatewayType.valueOf(gatewayType_);
      return result == null ? com.google.cloud.iot.v1.GatewayType.UNRECOGNIZED : result;
    }
    /**
     *
     *
     * <pre>
     * Indicates whether the device is a gateway.
     * </pre>
     *
     * <code>.google.cloud.iot.v1.GatewayType gateway_type = 1;</code>
     *
     * @param value The gatewayType to set.
     * @return This builder for chaining.
     */
    public Builder setGatewayType(com.google.cloud.iot.v1.GatewayType value) {
      if (value == null) {
        throw new NullPointerException();
      }

      gatewayType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Indicates whether the device is a gateway.
     * </pre>
     *
     * <code>.google.cloud.iot.v1.GatewayType gateway_type = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearGatewayType() {

      gatewayType_ = 0;
      onChanged();
      return this;
    }

    private int gatewayAuthMethod_ = 0;
    /**
     *
     *
     * <pre>
     * Indicates how to authorize and/or authenticate devices to access the
     * gateway.
     * </pre>
     *
     * <code>.google.cloud.iot.v1.GatewayAuthMethod gateway_auth_method = 2;</code>
     *
     * @return The enum numeric value on the wire for gatewayAuthMethod.
     */
    @java.lang.Override
    public int getGatewayAuthMethodValue() {
      return gatewayAuthMethod_;
    }
    /**
     *
     *
     * <pre>
     * Indicates how to authorize and/or authenticate devices to access the
     * gateway.
     * </pre>
     *
     * <code>.google.cloud.iot.v1.GatewayAuthMethod gateway_auth_method = 2;</code>
     *
     * @param value The enum numeric value on the wire for gatewayAuthMethod to set.
     * @return This builder for chaining.
     */
    public Builder setGatewayAuthMethodValue(int value) {

      gatewayAuthMethod_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Indicates how to authorize and/or authenticate devices to access the
     * gateway.
     * </pre>
     *
     * <code>.google.cloud.iot.v1.GatewayAuthMethod gateway_auth_method = 2;</code>
     *
     * @return The gatewayAuthMethod.
     */
    @java.lang.Override
    public com.google.cloud.iot.v1.GatewayAuthMethod getGatewayAuthMethod() {
      @SuppressWarnings("deprecation")
      com.google.cloud.iot.v1.GatewayAuthMethod result =
          com.google.cloud.iot.v1.GatewayAuthMethod.valueOf(gatewayAuthMethod_);
      return result == null ? com.google.cloud.iot.v1.GatewayAuthMethod.UNRECOGNIZED : result;
    }
    /**
     *
     *
     * <pre>
     * Indicates how to authorize and/or authenticate devices to access the
     * gateway.
     * </pre>
     *
     * <code>.google.cloud.iot.v1.GatewayAuthMethod gateway_auth_method = 2;</code>
     *
     * @param value The gatewayAuthMethod to set.
     * @return This builder for chaining.
     */
    public Builder setGatewayAuthMethod(com.google.cloud.iot.v1.GatewayAuthMethod value) {
      if (value == null) {
        throw new NullPointerException();
      }

      gatewayAuthMethod_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Indicates how to authorize and/or authenticate devices to access the
     * gateway.
     * </pre>
     *
     * <code>.google.cloud.iot.v1.GatewayAuthMethod gateway_auth_method = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearGatewayAuthMethod() {

      gatewayAuthMethod_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object lastAccessedGatewayId_ = "";
    /**
     *
     *
     * <pre>
     * [Output only] The ID of the gateway the device accessed most recently.
     * </pre>
     *
     * <code>string last_accessed_gateway_id = 3;</code>
     *
     * @return The lastAccessedGatewayId.
     */
    public java.lang.String getLastAccessedGatewayId() {
      java.lang.Object ref = lastAccessedGatewayId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        lastAccessedGatewayId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * [Output only] The ID of the gateway the device accessed most recently.
     * </pre>
     *
     * <code>string last_accessed_gateway_id = 3;</code>
     *
     * @return The bytes for lastAccessedGatewayId.
     */
    public com.google.protobuf.ByteString getLastAccessedGatewayIdBytes() {
      java.lang.Object ref = lastAccessedGatewayId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        lastAccessedGatewayId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * [Output only] The ID of the gateway the device accessed most recently.
     * </pre>
     *
     * <code>string last_accessed_gateway_id = 3;</code>
     *
     * @param value The lastAccessedGatewayId to set.
     * @return This builder for chaining.
     */
    public Builder setLastAccessedGatewayId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      lastAccessedGatewayId_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * [Output only] The ID of the gateway the device accessed most recently.
     * </pre>
     *
     * <code>string last_accessed_gateway_id = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearLastAccessedGatewayId() {

      lastAccessedGatewayId_ = getDefaultInstance().getLastAccessedGatewayId();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * [Output only] The ID of the gateway the device accessed most recently.
     * </pre>
     *
     * <code>string last_accessed_gateway_id = 3;</code>
     *
     * @param value The bytes for lastAccessedGatewayId to set.
     * @return This builder for chaining.
     */
    public Builder setLastAccessedGatewayIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      lastAccessedGatewayId_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp lastAccessedGatewayTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        lastAccessedGatewayTimeBuilder_;
    /**
     *
     *
     * <pre>
     * [Output only] The most recent time at which the device accessed the gateway
     * specified in `last_accessed_gateway`.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp last_accessed_gateway_time = 4;</code>
     *
     * @return Whether the lastAccessedGatewayTime field is set.
     */
    public boolean hasLastAccessedGatewayTime() {
      return lastAccessedGatewayTimeBuilder_ != null || lastAccessedGatewayTime_ != null;
    }
    /**
     *
     *
     * <pre>
     * [Output only] The most recent time at which the device accessed the gateway
     * specified in `last_accessed_gateway`.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp last_accessed_gateway_time = 4;</code>
     *
     * @return The lastAccessedGatewayTime.
     */
    public com.google.protobuf.Timestamp getLastAccessedGatewayTime() {
      if (lastAccessedGatewayTimeBuilder_ == null) {
        return lastAccessedGatewayTime_ == null
            ? com.google.protobuf.Timestamp.getDefaultInstance()
            : lastAccessedGatewayTime_;
      } else {
        return lastAccessedGatewayTimeBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * [Output only] The most recent time at which the device accessed the gateway
     * specified in `last_accessed_gateway`.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp last_accessed_gateway_time = 4;</code>
     */
    public Builder setLastAccessedGatewayTime(com.google.protobuf.Timestamp value) {
      if (lastAccessedGatewayTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        lastAccessedGatewayTime_ = value;
        onChanged();
      } else {
        lastAccessedGatewayTimeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * [Output only] The most recent time at which the device accessed the gateway
     * specified in `last_accessed_gateway`.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp last_accessed_gateway_time = 4;</code>
     */
    public Builder setLastAccessedGatewayTime(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (lastAccessedGatewayTimeBuilder_ == null) {
        lastAccessedGatewayTime_ = builderForValue.build();
        onChanged();
      } else {
        lastAccessedGatewayTimeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * [Output only] The most recent time at which the device accessed the gateway
     * specified in `last_accessed_gateway`.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp last_accessed_gateway_time = 4;</code>
     */
    public Builder mergeLastAccessedGatewayTime(com.google.protobuf.Timestamp value) {
      if (lastAccessedGatewayTimeBuilder_ == null) {
        if (lastAccessedGatewayTime_ != null) {
          lastAccessedGatewayTime_ =
              com.google.protobuf.Timestamp.newBuilder(lastAccessedGatewayTime_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          lastAccessedGatewayTime_ = value;
        }
        onChanged();
      } else {
        lastAccessedGatewayTimeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * [Output only] The most recent time at which the device accessed the gateway
     * specified in `last_accessed_gateway`.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp last_accessed_gateway_time = 4;</code>
     */
    public Builder clearLastAccessedGatewayTime() {
      if (lastAccessedGatewayTimeBuilder_ == null) {
        lastAccessedGatewayTime_ = null;
        onChanged();
      } else {
        lastAccessedGatewayTime_ = null;
        lastAccessedGatewayTimeBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * [Output only] The most recent time at which the device accessed the gateway
     * specified in `last_accessed_gateway`.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp last_accessed_gateway_time = 4;</code>
     */
    public com.google.protobuf.Timestamp.Builder getLastAccessedGatewayTimeBuilder() {

      onChanged();
      return getLastAccessedGatewayTimeFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * [Output only] The most recent time at which the device accessed the gateway
     * specified in `last_accessed_gateway`.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp last_accessed_gateway_time = 4;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getLastAccessedGatewayTimeOrBuilder() {
      if (lastAccessedGatewayTimeBuilder_ != null) {
        return lastAccessedGatewayTimeBuilder_.getMessageOrBuilder();
      } else {
        return lastAccessedGatewayTime_ == null
            ? com.google.protobuf.Timestamp.getDefaultInstance()
            : lastAccessedGatewayTime_;
      }
    }
    /**
     *
     *
     * <pre>
     * [Output only] The most recent time at which the device accessed the gateway
     * specified in `last_accessed_gateway`.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp last_accessed_gateway_time = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        getLastAccessedGatewayTimeFieldBuilder() {
      if (lastAccessedGatewayTimeBuilder_ == null) {
        lastAccessedGatewayTimeBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.Timestamp,
                com.google.protobuf.Timestamp.Builder,
                com.google.protobuf.TimestampOrBuilder>(
                getLastAccessedGatewayTime(), getParentForChildren(), isClean());
        lastAccessedGatewayTime_ = null;
      }
      return lastAccessedGatewayTimeBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.iot.v1.GatewayConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.iot.v1.GatewayConfig)
  private static final com.google.cloud.iot.v1.GatewayConfig DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.iot.v1.GatewayConfig();
  }

  public static com.google.cloud.iot.v1.GatewayConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GatewayConfig> PARSER =
      new com.google.protobuf.AbstractParser<GatewayConfig>() {
        @java.lang.Override
        public GatewayConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<GatewayConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GatewayConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.iot.v1.GatewayConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
