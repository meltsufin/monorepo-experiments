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
// source: google/container/v1/cluster_service.proto

package com.google.container.v1;

/**
 *
 *
 * <pre>
 * Configuration for the use of Kubernetes Service Accounts in GCP IAM
 * policies.
 * </pre>
 *
 * Protobuf type {@code google.container.v1.WorkloadIdentityConfig}
 */
public final class WorkloadIdentityConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.container.v1.WorkloadIdentityConfig)
    WorkloadIdentityConfigOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use WorkloadIdentityConfig.newBuilder() to construct.
  private WorkloadIdentityConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private WorkloadIdentityConfig() {
    workloadPool_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new WorkloadIdentityConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.container.v1.ClusterServiceProto
        .internal_static_google_container_v1_WorkloadIdentityConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.container.v1.ClusterServiceProto
        .internal_static_google_container_v1_WorkloadIdentityConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.container.v1.WorkloadIdentityConfig.class,
            com.google.container.v1.WorkloadIdentityConfig.Builder.class);
  }

  public static final int WORKLOAD_POOL_FIELD_NUMBER = 2;
  private volatile java.lang.Object workloadPool_;
  /**
   *
   *
   * <pre>
   * The workload pool to attach all Kubernetes service accounts to.
   * </pre>
   *
   * <code>string workload_pool = 2;</code>
   *
   * @return The workloadPool.
   */
  @java.lang.Override
  public java.lang.String getWorkloadPool() {
    java.lang.Object ref = workloadPool_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      workloadPool_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The workload pool to attach all Kubernetes service accounts to.
   * </pre>
   *
   * <code>string workload_pool = 2;</code>
   *
   * @return The bytes for workloadPool.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getWorkloadPoolBytes() {
    java.lang.Object ref = workloadPool_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      workloadPool_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(workloadPool_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, workloadPool_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(workloadPool_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, workloadPool_);
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
    if (!(obj instanceof com.google.container.v1.WorkloadIdentityConfig)) {
      return super.equals(obj);
    }
    com.google.container.v1.WorkloadIdentityConfig other =
        (com.google.container.v1.WorkloadIdentityConfig) obj;

    if (!getWorkloadPool().equals(other.getWorkloadPool())) return false;
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
    hash = (37 * hash) + WORKLOAD_POOL_FIELD_NUMBER;
    hash = (53 * hash) + getWorkloadPool().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.container.v1.WorkloadIdentityConfig parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1.WorkloadIdentityConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1.WorkloadIdentityConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1.WorkloadIdentityConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1.WorkloadIdentityConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1.WorkloadIdentityConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1.WorkloadIdentityConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.container.v1.WorkloadIdentityConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.container.v1.WorkloadIdentityConfig parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.container.v1.WorkloadIdentityConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.container.v1.WorkloadIdentityConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.container.v1.WorkloadIdentityConfig parseFrom(
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

  public static Builder newBuilder(com.google.container.v1.WorkloadIdentityConfig prototype) {
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
   * Configuration for the use of Kubernetes Service Accounts in GCP IAM
   * policies.
   * </pre>
   *
   * Protobuf type {@code google.container.v1.WorkloadIdentityConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.container.v1.WorkloadIdentityConfig)
      com.google.container.v1.WorkloadIdentityConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.container.v1.ClusterServiceProto
          .internal_static_google_container_v1_WorkloadIdentityConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.container.v1.ClusterServiceProto
          .internal_static_google_container_v1_WorkloadIdentityConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.container.v1.WorkloadIdentityConfig.class,
              com.google.container.v1.WorkloadIdentityConfig.Builder.class);
    }

    // Construct using com.google.container.v1.WorkloadIdentityConfig.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      workloadPool_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.container.v1.ClusterServiceProto
          .internal_static_google_container_v1_WorkloadIdentityConfig_descriptor;
    }

    @java.lang.Override
    public com.google.container.v1.WorkloadIdentityConfig getDefaultInstanceForType() {
      return com.google.container.v1.WorkloadIdentityConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.container.v1.WorkloadIdentityConfig build() {
      com.google.container.v1.WorkloadIdentityConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.container.v1.WorkloadIdentityConfig buildPartial() {
      com.google.container.v1.WorkloadIdentityConfig result =
          new com.google.container.v1.WorkloadIdentityConfig(this);
      result.workloadPool_ = workloadPool_;
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
      if (other instanceof com.google.container.v1.WorkloadIdentityConfig) {
        return mergeFrom((com.google.container.v1.WorkloadIdentityConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.container.v1.WorkloadIdentityConfig other) {
      if (other == com.google.container.v1.WorkloadIdentityConfig.getDefaultInstance()) return this;
      if (!other.getWorkloadPool().isEmpty()) {
        workloadPool_ = other.workloadPool_;
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
            case 18:
              {
                workloadPool_ = input.readStringRequireUtf8();

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

    private java.lang.Object workloadPool_ = "";
    /**
     *
     *
     * <pre>
     * The workload pool to attach all Kubernetes service accounts to.
     * </pre>
     *
     * <code>string workload_pool = 2;</code>
     *
     * @return The workloadPool.
     */
    public java.lang.String getWorkloadPool() {
      java.lang.Object ref = workloadPool_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        workloadPool_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The workload pool to attach all Kubernetes service accounts to.
     * </pre>
     *
     * <code>string workload_pool = 2;</code>
     *
     * @return The bytes for workloadPool.
     */
    public com.google.protobuf.ByteString getWorkloadPoolBytes() {
      java.lang.Object ref = workloadPool_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        workloadPool_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The workload pool to attach all Kubernetes service accounts to.
     * </pre>
     *
     * <code>string workload_pool = 2;</code>
     *
     * @param value The workloadPool to set.
     * @return This builder for chaining.
     */
    public Builder setWorkloadPool(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      workloadPool_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The workload pool to attach all Kubernetes service accounts to.
     * </pre>
     *
     * <code>string workload_pool = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearWorkloadPool() {

      workloadPool_ = getDefaultInstance().getWorkloadPool();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The workload pool to attach all Kubernetes service accounts to.
     * </pre>
     *
     * <code>string workload_pool = 2;</code>
     *
     * @param value The bytes for workloadPool to set.
     * @return This builder for chaining.
     */
    public Builder setWorkloadPoolBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      workloadPool_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.container.v1.WorkloadIdentityConfig)
  }

  // @@protoc_insertion_point(class_scope:google.container.v1.WorkloadIdentityConfig)
  private static final com.google.container.v1.WorkloadIdentityConfig DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.container.v1.WorkloadIdentityConfig();
  }

  public static com.google.container.v1.WorkloadIdentityConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<WorkloadIdentityConfig> PARSER =
      new com.google.protobuf.AbstractParser<WorkloadIdentityConfig>() {
        @java.lang.Override
        public WorkloadIdentityConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<WorkloadIdentityConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<WorkloadIdentityConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.container.v1.WorkloadIdentityConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}