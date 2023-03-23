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
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

/**
 *
 *
 * <pre>
 * Subsetting configuration for this BackendService. Currently this is applicable only for Internal TCP/UDP load balancing, Internal HTTP(S) load balancing and Traffic Director.
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.Subsetting}
 */
public final class Subsetting extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.Subsetting)
    SubsettingOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use Subsetting.newBuilder() to construct.
  private Subsetting(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Subsetting() {
    policy_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Subsetting();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_Subsetting_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_Subsetting_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.Subsetting.class,
            com.google.cloud.compute.v1.Subsetting.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * </pre>
   *
   * Protobuf enum {@code google.cloud.compute.v1.Subsetting.Policy}
   */
  public enum Policy implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * A value indicating that the enum field is not set.
     * </pre>
     *
     * <code>UNDEFINED_POLICY = 0;</code>
     */
    UNDEFINED_POLICY(0),
    /**
     *
     *
     * <pre>
     * Subsetting based on consistent hashing. For Traffic Director, the number of backends per backend group (the subset size) is based on the `subset_size` parameter. For Internal HTTP(S) load balancing, the number of backends per backend group (the subset size) is dynamically adjusted in two cases: - As the number of proxy instances participating in Internal HTTP(S) load balancing increases, the subset size decreases. - When the total number of backends in a network exceeds the capacity of a single proxy instance, subset sizes are reduced automatically for each service that has backend subsetting enabled.
     * </pre>
     *
     * <code>CONSISTENT_HASH_SUBSETTING = 108989492;</code>
     */
    CONSISTENT_HASH_SUBSETTING(108989492),
    /**
     *
     *
     * <pre>
     * No Subsetting. Clients may open connections and send traffic to all backends of this backend service. This can lead to performance issues if there is substantial imbalance in the count of clients and backends.
     * </pre>
     *
     * <code>NONE = 2402104;</code>
     */
    NONE(2402104),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * A value indicating that the enum field is not set.
     * </pre>
     *
     * <code>UNDEFINED_POLICY = 0;</code>
     */
    public static final int UNDEFINED_POLICY_VALUE = 0;
    /**
     *
     *
     * <pre>
     * Subsetting based on consistent hashing. For Traffic Director, the number of backends per backend group (the subset size) is based on the `subset_size` parameter. For Internal HTTP(S) load balancing, the number of backends per backend group (the subset size) is dynamically adjusted in two cases: - As the number of proxy instances participating in Internal HTTP(S) load balancing increases, the subset size decreases. - When the total number of backends in a network exceeds the capacity of a single proxy instance, subset sizes are reduced automatically for each service that has backend subsetting enabled.
     * </pre>
     *
     * <code>CONSISTENT_HASH_SUBSETTING = 108989492;</code>
     */
    public static final int CONSISTENT_HASH_SUBSETTING_VALUE = 108989492;
    /**
     *
     *
     * <pre>
     * No Subsetting. Clients may open connections and send traffic to all backends of this backend service. This can lead to performance issues if there is substantial imbalance in the count of clients and backends.
     * </pre>
     *
     * <code>NONE = 2402104;</code>
     */
    public static final int NONE_VALUE = 2402104;

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
    public static Policy valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Policy forNumber(int value) {
      switch (value) {
        case 0:
          return UNDEFINED_POLICY;
        case 108989492:
          return CONSISTENT_HASH_SUBSETTING;
        case 2402104:
          return NONE;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Policy> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<Policy> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Policy>() {
          public Policy findValueByNumber(int number) {
            return Policy.forNumber(number);
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
      return com.google.cloud.compute.v1.Subsetting.getDescriptor().getEnumTypes().get(0);
    }

    private static final Policy[] VALUES = values();

    public static Policy valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Policy(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.compute.v1.Subsetting.Policy)
  }

  private int bitField0_;
  public static final int POLICY_FIELD_NUMBER = 91071794;
  private volatile java.lang.Object policy_;
  /**
   *
   *
   * <pre>
   *
   * Check the Policy enum for the list of possible values.
   * </pre>
   *
   * <code>optional string policy = 91071794;</code>
   *
   * @return Whether the policy field is set.
   */
  @java.lang.Override
  public boolean hasPolicy() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   *
   * Check the Policy enum for the list of possible values.
   * </pre>
   *
   * <code>optional string policy = 91071794;</code>
   *
   * @return The policy.
   */
  @java.lang.Override
  public java.lang.String getPolicy() {
    java.lang.Object ref = policy_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      policy_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   *
   * Check the Policy enum for the list of possible values.
   * </pre>
   *
   * <code>optional string policy = 91071794;</code>
   *
   * @return The bytes for policy.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getPolicyBytes() {
    java.lang.Object ref = policy_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      policy_ = b;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 91071794, policy_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(91071794, policy_);
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
    if (!(obj instanceof com.google.cloud.compute.v1.Subsetting)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.Subsetting other = (com.google.cloud.compute.v1.Subsetting) obj;

    if (hasPolicy() != other.hasPolicy()) return false;
    if (hasPolicy()) {
      if (!getPolicy().equals(other.getPolicy())) return false;
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
    if (hasPolicy()) {
      hash = (37 * hash) + POLICY_FIELD_NUMBER;
      hash = (53 * hash) + getPolicy().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.Subsetting parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.Subsetting parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.Subsetting parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.Subsetting parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.Subsetting parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.Subsetting parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.Subsetting parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.Subsetting parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.Subsetting parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.Subsetting parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.Subsetting parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.Subsetting parseFrom(
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

  public static Builder newBuilder(com.google.cloud.compute.v1.Subsetting prototype) {
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
   * Subsetting configuration for this BackendService. Currently this is applicable only for Internal TCP/UDP load balancing, Internal HTTP(S) load balancing and Traffic Director.
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.Subsetting}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.Subsetting)
      com.google.cloud.compute.v1.SubsettingOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_Subsetting_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_Subsetting_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.Subsetting.class,
              com.google.cloud.compute.v1.Subsetting.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.Subsetting.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      policy_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_Subsetting_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.Subsetting getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.Subsetting.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.Subsetting build() {
      com.google.cloud.compute.v1.Subsetting result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.Subsetting buildPartial() {
      com.google.cloud.compute.v1.Subsetting result =
          new com.google.cloud.compute.v1.Subsetting(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.policy_ = policy_;
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof com.google.cloud.compute.v1.Subsetting) {
        return mergeFrom((com.google.cloud.compute.v1.Subsetting) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.Subsetting other) {
      if (other == com.google.cloud.compute.v1.Subsetting.getDefaultInstance()) return this;
      if (other.hasPolicy()) {
        bitField0_ |= 0x00000001;
        policy_ = other.policy_;
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
            case 728574354:
              {
                policy_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 728574354
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

    private java.lang.Object policy_ = "";
    /**
     *
     *
     * <pre>
     *
     * Check the Policy enum for the list of possible values.
     * </pre>
     *
     * <code>optional string policy = 91071794;</code>
     *
     * @return Whether the policy field is set.
     */
    public boolean hasPolicy() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     *
     * Check the Policy enum for the list of possible values.
     * </pre>
     *
     * <code>optional string policy = 91071794;</code>
     *
     * @return The policy.
     */
    public java.lang.String getPolicy() {
      java.lang.Object ref = policy_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        policy_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     *
     * Check the Policy enum for the list of possible values.
     * </pre>
     *
     * <code>optional string policy = 91071794;</code>
     *
     * @return The bytes for policy.
     */
    public com.google.protobuf.ByteString getPolicyBytes() {
      java.lang.Object ref = policy_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        policy_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     *
     * Check the Policy enum for the list of possible values.
     * </pre>
     *
     * <code>optional string policy = 91071794;</code>
     *
     * @param value The policy to set.
     * @return This builder for chaining.
     */
    public Builder setPolicy(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      policy_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     *
     * Check the Policy enum for the list of possible values.
     * </pre>
     *
     * <code>optional string policy = 91071794;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPolicy() {
      bitField0_ = (bitField0_ & ~0x00000001);
      policy_ = getDefaultInstance().getPolicy();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     *
     * Check the Policy enum for the list of possible values.
     * </pre>
     *
     * <code>optional string policy = 91071794;</code>
     *
     * @param value The bytes for policy to set.
     * @return This builder for chaining.
     */
    public Builder setPolicyBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000001;
      policy_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.Subsetting)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.Subsetting)
  private static final com.google.cloud.compute.v1.Subsetting DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.Subsetting();
  }

  public static com.google.cloud.compute.v1.Subsetting getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Subsetting> PARSER =
      new com.google.protobuf.AbstractParser<Subsetting>() {
        @java.lang.Override
        public Subsetting parsePartialFrom(
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

  public static com.google.protobuf.Parser<Subsetting> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Subsetting> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.Subsetting getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
