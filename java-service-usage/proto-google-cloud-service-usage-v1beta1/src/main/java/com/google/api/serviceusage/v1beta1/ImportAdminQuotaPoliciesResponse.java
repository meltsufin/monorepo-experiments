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
// source: google/api/serviceusage/v1beta1/serviceusage.proto

package com.google.api.serviceusage.v1beta1;

/**
 *
 *
 * <pre>
 * Response message for ImportAdminQuotaPolicies
 * </pre>
 *
 * Protobuf type {@code google.api.serviceusage.v1beta1.ImportAdminQuotaPoliciesResponse}
 */
public final class ImportAdminQuotaPoliciesResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.api.serviceusage.v1beta1.ImportAdminQuotaPoliciesResponse)
    ImportAdminQuotaPoliciesResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ImportAdminQuotaPoliciesResponse.newBuilder() to construct.
  private ImportAdminQuotaPoliciesResponse(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ImportAdminQuotaPoliciesResponse() {
    policies_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ImportAdminQuotaPoliciesResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.api.serviceusage.v1beta1.ServiceUsageProto
        .internal_static_google_api_serviceusage_v1beta1_ImportAdminQuotaPoliciesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.api.serviceusage.v1beta1.ServiceUsageProto
        .internal_static_google_api_serviceusage_v1beta1_ImportAdminQuotaPoliciesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.api.serviceusage.v1beta1.ImportAdminQuotaPoliciesResponse.class,
            com.google.api.serviceusage.v1beta1.ImportAdminQuotaPoliciesResponse.Builder.class);
  }

  public static final int POLICIES_FIELD_NUMBER = 1;
  private java.util.List<com.google.api.serviceusage.v1beta1.AdminQuotaPolicy> policies_;
  /**
   *
   *
   * <pre>
   * The policies that were created from the imported data.
   * </pre>
   *
   * <code>repeated .google.api.serviceusage.v1beta1.AdminQuotaPolicy policies = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.api.serviceusage.v1beta1.AdminQuotaPolicy> getPoliciesList() {
    return policies_;
  }
  /**
   *
   *
   * <pre>
   * The policies that were created from the imported data.
   * </pre>
   *
   * <code>repeated .google.api.serviceusage.v1beta1.AdminQuotaPolicy policies = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.api.serviceusage.v1beta1.AdminQuotaPolicyOrBuilder>
      getPoliciesOrBuilderList() {
    return policies_;
  }
  /**
   *
   *
   * <pre>
   * The policies that were created from the imported data.
   * </pre>
   *
   * <code>repeated .google.api.serviceusage.v1beta1.AdminQuotaPolicy policies = 1;</code>
   */
  @java.lang.Override
  public int getPoliciesCount() {
    return policies_.size();
  }
  /**
   *
   *
   * <pre>
   * The policies that were created from the imported data.
   * </pre>
   *
   * <code>repeated .google.api.serviceusage.v1beta1.AdminQuotaPolicy policies = 1;</code>
   */
  @java.lang.Override
  public com.google.api.serviceusage.v1beta1.AdminQuotaPolicy getPolicies(int index) {
    return policies_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The policies that were created from the imported data.
   * </pre>
   *
   * <code>repeated .google.api.serviceusage.v1beta1.AdminQuotaPolicy policies = 1;</code>
   */
  @java.lang.Override
  public com.google.api.serviceusage.v1beta1.AdminQuotaPolicyOrBuilder getPoliciesOrBuilder(
      int index) {
    return policies_.get(index);
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
    for (int i = 0; i < policies_.size(); i++) {
      output.writeMessage(1, policies_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < policies_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, policies_.get(i));
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
    if (!(obj instanceof com.google.api.serviceusage.v1beta1.ImportAdminQuotaPoliciesResponse)) {
      return super.equals(obj);
    }
    com.google.api.serviceusage.v1beta1.ImportAdminQuotaPoliciesResponse other =
        (com.google.api.serviceusage.v1beta1.ImportAdminQuotaPoliciesResponse) obj;

    if (!getPoliciesList().equals(other.getPoliciesList())) return false;
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
    if (getPoliciesCount() > 0) {
      hash = (37 * hash) + POLICIES_FIELD_NUMBER;
      hash = (53 * hash) + getPoliciesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.api.serviceusage.v1beta1.ImportAdminQuotaPoliciesResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.api.serviceusage.v1beta1.ImportAdminQuotaPoliciesResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.api.serviceusage.v1beta1.ImportAdminQuotaPoliciesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.api.serviceusage.v1beta1.ImportAdminQuotaPoliciesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.api.serviceusage.v1beta1.ImportAdminQuotaPoliciesResponse parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.api.serviceusage.v1beta1.ImportAdminQuotaPoliciesResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.api.serviceusage.v1beta1.ImportAdminQuotaPoliciesResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.api.serviceusage.v1beta1.ImportAdminQuotaPoliciesResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.api.serviceusage.v1beta1.ImportAdminQuotaPoliciesResponse
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.api.serviceusage.v1beta1.ImportAdminQuotaPoliciesResponse
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.api.serviceusage.v1beta1.ImportAdminQuotaPoliciesResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.api.serviceusage.v1beta1.ImportAdminQuotaPoliciesResponse parseFrom(
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
      com.google.api.serviceusage.v1beta1.ImportAdminQuotaPoliciesResponse prototype) {
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
   * Response message for ImportAdminQuotaPolicies
   * </pre>
   *
   * Protobuf type {@code google.api.serviceusage.v1beta1.ImportAdminQuotaPoliciesResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.api.serviceusage.v1beta1.ImportAdminQuotaPoliciesResponse)
      com.google.api.serviceusage.v1beta1.ImportAdminQuotaPoliciesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.api.serviceusage.v1beta1.ServiceUsageProto
          .internal_static_google_api_serviceusage_v1beta1_ImportAdminQuotaPoliciesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.api.serviceusage.v1beta1.ServiceUsageProto
          .internal_static_google_api_serviceusage_v1beta1_ImportAdminQuotaPoliciesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.api.serviceusage.v1beta1.ImportAdminQuotaPoliciesResponse.class,
              com.google.api.serviceusage.v1beta1.ImportAdminQuotaPoliciesResponse.Builder.class);
    }

    // Construct using
    // com.google.api.serviceusage.v1beta1.ImportAdminQuotaPoliciesResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (policiesBuilder_ == null) {
        policies_ = java.util.Collections.emptyList();
      } else {
        policies_ = null;
        policiesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.api.serviceusage.v1beta1.ServiceUsageProto
          .internal_static_google_api_serviceusage_v1beta1_ImportAdminQuotaPoliciesResponse_descriptor;
    }

    @java.lang.Override
    public com.google.api.serviceusage.v1beta1.ImportAdminQuotaPoliciesResponse
        getDefaultInstanceForType() {
      return com.google.api.serviceusage.v1beta1.ImportAdminQuotaPoliciesResponse
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.api.serviceusage.v1beta1.ImportAdminQuotaPoliciesResponse build() {
      com.google.api.serviceusage.v1beta1.ImportAdminQuotaPoliciesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.api.serviceusage.v1beta1.ImportAdminQuotaPoliciesResponse buildPartial() {
      com.google.api.serviceusage.v1beta1.ImportAdminQuotaPoliciesResponse result =
          new com.google.api.serviceusage.v1beta1.ImportAdminQuotaPoliciesResponse(this);
      int from_bitField0_ = bitField0_;
      if (policiesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          policies_ = java.util.Collections.unmodifiableList(policies_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.policies_ = policies_;
      } else {
        result.policies_ = policiesBuilder_.build();
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
      if (other instanceof com.google.api.serviceusage.v1beta1.ImportAdminQuotaPoliciesResponse) {
        return mergeFrom(
            (com.google.api.serviceusage.v1beta1.ImportAdminQuotaPoliciesResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.api.serviceusage.v1beta1.ImportAdminQuotaPoliciesResponse other) {
      if (other
          == com.google.api.serviceusage.v1beta1.ImportAdminQuotaPoliciesResponse
              .getDefaultInstance()) return this;
      if (policiesBuilder_ == null) {
        if (!other.policies_.isEmpty()) {
          if (policies_.isEmpty()) {
            policies_ = other.policies_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensurePoliciesIsMutable();
            policies_.addAll(other.policies_);
          }
          onChanged();
        }
      } else {
        if (!other.policies_.isEmpty()) {
          if (policiesBuilder_.isEmpty()) {
            policiesBuilder_.dispose();
            policiesBuilder_ = null;
            policies_ = other.policies_;
            bitField0_ = (bitField0_ & ~0x00000001);
            policiesBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getPoliciesFieldBuilder()
                    : null;
          } else {
            policiesBuilder_.addAllMessages(other.policies_);
          }
        }
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
                com.google.api.serviceusage.v1beta1.AdminQuotaPolicy m =
                    input.readMessage(
                        com.google.api.serviceusage.v1beta1.AdminQuotaPolicy.parser(),
                        extensionRegistry);
                if (policiesBuilder_ == null) {
                  ensurePoliciesIsMutable();
                  policies_.add(m);
                } else {
                  policiesBuilder_.addMessage(m);
                }
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

    private int bitField0_;

    private java.util.List<com.google.api.serviceusage.v1beta1.AdminQuotaPolicy> policies_ =
        java.util.Collections.emptyList();

    private void ensurePoliciesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        policies_ =
            new java.util.ArrayList<com.google.api.serviceusage.v1beta1.AdminQuotaPolicy>(
                policies_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.api.serviceusage.v1beta1.AdminQuotaPolicy,
            com.google.api.serviceusage.v1beta1.AdminQuotaPolicy.Builder,
            com.google.api.serviceusage.v1beta1.AdminQuotaPolicyOrBuilder>
        policiesBuilder_;

    /**
     *
     *
     * <pre>
     * The policies that were created from the imported data.
     * </pre>
     *
     * <code>repeated .google.api.serviceusage.v1beta1.AdminQuotaPolicy policies = 1;</code>
     */
    public java.util.List<com.google.api.serviceusage.v1beta1.AdminQuotaPolicy> getPoliciesList() {
      if (policiesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(policies_);
      } else {
        return policiesBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * The policies that were created from the imported data.
     * </pre>
     *
     * <code>repeated .google.api.serviceusage.v1beta1.AdminQuotaPolicy policies = 1;</code>
     */
    public int getPoliciesCount() {
      if (policiesBuilder_ == null) {
        return policies_.size();
      } else {
        return policiesBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * The policies that were created from the imported data.
     * </pre>
     *
     * <code>repeated .google.api.serviceusage.v1beta1.AdminQuotaPolicy policies = 1;</code>
     */
    public com.google.api.serviceusage.v1beta1.AdminQuotaPolicy getPolicies(int index) {
      if (policiesBuilder_ == null) {
        return policies_.get(index);
      } else {
        return policiesBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The policies that were created from the imported data.
     * </pre>
     *
     * <code>repeated .google.api.serviceusage.v1beta1.AdminQuotaPolicy policies = 1;</code>
     */
    public Builder setPolicies(
        int index, com.google.api.serviceusage.v1beta1.AdminQuotaPolicy value) {
      if (policiesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePoliciesIsMutable();
        policies_.set(index, value);
        onChanged();
      } else {
        policiesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The policies that were created from the imported data.
     * </pre>
     *
     * <code>repeated .google.api.serviceusage.v1beta1.AdminQuotaPolicy policies = 1;</code>
     */
    public Builder setPolicies(
        int index, com.google.api.serviceusage.v1beta1.AdminQuotaPolicy.Builder builderForValue) {
      if (policiesBuilder_ == null) {
        ensurePoliciesIsMutable();
        policies_.set(index, builderForValue.build());
        onChanged();
      } else {
        policiesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The policies that were created from the imported data.
     * </pre>
     *
     * <code>repeated .google.api.serviceusage.v1beta1.AdminQuotaPolicy policies = 1;</code>
     */
    public Builder addPolicies(com.google.api.serviceusage.v1beta1.AdminQuotaPolicy value) {
      if (policiesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePoliciesIsMutable();
        policies_.add(value);
        onChanged();
      } else {
        policiesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The policies that were created from the imported data.
     * </pre>
     *
     * <code>repeated .google.api.serviceusage.v1beta1.AdminQuotaPolicy policies = 1;</code>
     */
    public Builder addPolicies(
        int index, com.google.api.serviceusage.v1beta1.AdminQuotaPolicy value) {
      if (policiesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePoliciesIsMutable();
        policies_.add(index, value);
        onChanged();
      } else {
        policiesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The policies that were created from the imported data.
     * </pre>
     *
     * <code>repeated .google.api.serviceusage.v1beta1.AdminQuotaPolicy policies = 1;</code>
     */
    public Builder addPolicies(
        com.google.api.serviceusage.v1beta1.AdminQuotaPolicy.Builder builderForValue) {
      if (policiesBuilder_ == null) {
        ensurePoliciesIsMutable();
        policies_.add(builderForValue.build());
        onChanged();
      } else {
        policiesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The policies that were created from the imported data.
     * </pre>
     *
     * <code>repeated .google.api.serviceusage.v1beta1.AdminQuotaPolicy policies = 1;</code>
     */
    public Builder addPolicies(
        int index, com.google.api.serviceusage.v1beta1.AdminQuotaPolicy.Builder builderForValue) {
      if (policiesBuilder_ == null) {
        ensurePoliciesIsMutable();
        policies_.add(index, builderForValue.build());
        onChanged();
      } else {
        policiesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The policies that were created from the imported data.
     * </pre>
     *
     * <code>repeated .google.api.serviceusage.v1beta1.AdminQuotaPolicy policies = 1;</code>
     */
    public Builder addAllPolicies(
        java.lang.Iterable<? extends com.google.api.serviceusage.v1beta1.AdminQuotaPolicy> values) {
      if (policiesBuilder_ == null) {
        ensurePoliciesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, policies_);
        onChanged();
      } else {
        policiesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The policies that were created from the imported data.
     * </pre>
     *
     * <code>repeated .google.api.serviceusage.v1beta1.AdminQuotaPolicy policies = 1;</code>
     */
    public Builder clearPolicies() {
      if (policiesBuilder_ == null) {
        policies_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        policiesBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The policies that were created from the imported data.
     * </pre>
     *
     * <code>repeated .google.api.serviceusage.v1beta1.AdminQuotaPolicy policies = 1;</code>
     */
    public Builder removePolicies(int index) {
      if (policiesBuilder_ == null) {
        ensurePoliciesIsMutable();
        policies_.remove(index);
        onChanged();
      } else {
        policiesBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The policies that were created from the imported data.
     * </pre>
     *
     * <code>repeated .google.api.serviceusage.v1beta1.AdminQuotaPolicy policies = 1;</code>
     */
    public com.google.api.serviceusage.v1beta1.AdminQuotaPolicy.Builder getPoliciesBuilder(
        int index) {
      return getPoliciesFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * The policies that were created from the imported data.
     * </pre>
     *
     * <code>repeated .google.api.serviceusage.v1beta1.AdminQuotaPolicy policies = 1;</code>
     */
    public com.google.api.serviceusage.v1beta1.AdminQuotaPolicyOrBuilder getPoliciesOrBuilder(
        int index) {
      if (policiesBuilder_ == null) {
        return policies_.get(index);
      } else {
        return policiesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The policies that were created from the imported data.
     * </pre>
     *
     * <code>repeated .google.api.serviceusage.v1beta1.AdminQuotaPolicy policies = 1;</code>
     */
    public java.util.List<? extends com.google.api.serviceusage.v1beta1.AdminQuotaPolicyOrBuilder>
        getPoliciesOrBuilderList() {
      if (policiesBuilder_ != null) {
        return policiesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(policies_);
      }
    }
    /**
     *
     *
     * <pre>
     * The policies that were created from the imported data.
     * </pre>
     *
     * <code>repeated .google.api.serviceusage.v1beta1.AdminQuotaPolicy policies = 1;</code>
     */
    public com.google.api.serviceusage.v1beta1.AdminQuotaPolicy.Builder addPoliciesBuilder() {
      return getPoliciesFieldBuilder()
          .addBuilder(com.google.api.serviceusage.v1beta1.AdminQuotaPolicy.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The policies that were created from the imported data.
     * </pre>
     *
     * <code>repeated .google.api.serviceusage.v1beta1.AdminQuotaPolicy policies = 1;</code>
     */
    public com.google.api.serviceusage.v1beta1.AdminQuotaPolicy.Builder addPoliciesBuilder(
        int index) {
      return getPoliciesFieldBuilder()
          .addBuilder(
              index, com.google.api.serviceusage.v1beta1.AdminQuotaPolicy.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The policies that were created from the imported data.
     * </pre>
     *
     * <code>repeated .google.api.serviceusage.v1beta1.AdminQuotaPolicy policies = 1;</code>
     */
    public java.util.List<com.google.api.serviceusage.v1beta1.AdminQuotaPolicy.Builder>
        getPoliciesBuilderList() {
      return getPoliciesFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.api.serviceusage.v1beta1.AdminQuotaPolicy,
            com.google.api.serviceusage.v1beta1.AdminQuotaPolicy.Builder,
            com.google.api.serviceusage.v1beta1.AdminQuotaPolicyOrBuilder>
        getPoliciesFieldBuilder() {
      if (policiesBuilder_ == null) {
        policiesBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.api.serviceusage.v1beta1.AdminQuotaPolicy,
                com.google.api.serviceusage.v1beta1.AdminQuotaPolicy.Builder,
                com.google.api.serviceusage.v1beta1.AdminQuotaPolicyOrBuilder>(
                policies_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        policies_ = null;
      }
      return policiesBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.api.serviceusage.v1beta1.ImportAdminQuotaPoliciesResponse)
  }

  // @@protoc_insertion_point(class_scope:google.api.serviceusage.v1beta1.ImportAdminQuotaPoliciesResponse)
  private static final com.google.api.serviceusage.v1beta1.ImportAdminQuotaPoliciesResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.api.serviceusage.v1beta1.ImportAdminQuotaPoliciesResponse();
  }

  public static com.google.api.serviceusage.v1beta1.ImportAdminQuotaPoliciesResponse
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ImportAdminQuotaPoliciesResponse> PARSER =
      new com.google.protobuf.AbstractParser<ImportAdminQuotaPoliciesResponse>() {
        @java.lang.Override
        public ImportAdminQuotaPoliciesResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ImportAdminQuotaPoliciesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ImportAdminQuotaPoliciesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.api.serviceusage.v1beta1.ImportAdminQuotaPoliciesResponse
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}