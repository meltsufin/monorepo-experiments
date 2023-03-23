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
// source: google/cloud/dataproc/v1/shared.proto

package com.google.cloud.dataproc.v1;

/**
 *
 *
 * <pre>
 * Auxiliary services configuration for a workload.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dataproc.v1.PeripheralsConfig}
 */
public final class PeripheralsConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dataproc.v1.PeripheralsConfig)
    PeripheralsConfigOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use PeripheralsConfig.newBuilder() to construct.
  private PeripheralsConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private PeripheralsConfig() {
    metastoreService_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new PeripheralsConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.dataproc.v1.SharedProto
        .internal_static_google_cloud_dataproc_v1_PeripheralsConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dataproc.v1.SharedProto
        .internal_static_google_cloud_dataproc_v1_PeripheralsConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dataproc.v1.PeripheralsConfig.class,
            com.google.cloud.dataproc.v1.PeripheralsConfig.Builder.class);
  }

  public static final int METASTORE_SERVICE_FIELD_NUMBER = 1;
  private volatile java.lang.Object metastoreService_;
  /**
   *
   *
   * <pre>
   * Optional. Resource name of an existing Dataproc Metastore service.
   * Example:
   * * `projects/[project_id]/locations/[region]/services/[service_id]`
   * </pre>
   *
   * <code>string metastore_service = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The metastoreService.
   */
  @java.lang.Override
  public java.lang.String getMetastoreService() {
    java.lang.Object ref = metastoreService_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      metastoreService_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Optional. Resource name of an existing Dataproc Metastore service.
   * Example:
   * * `projects/[project_id]/locations/[region]/services/[service_id]`
   * </pre>
   *
   * <code>string metastore_service = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for metastoreService.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getMetastoreServiceBytes() {
    java.lang.Object ref = metastoreService_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      metastoreService_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SPARK_HISTORY_SERVER_CONFIG_FIELD_NUMBER = 2;
  private com.google.cloud.dataproc.v1.SparkHistoryServerConfig sparkHistoryServerConfig_;
  /**
   *
   *
   * <pre>
   * Optional. The Spark History Server configuration for the workload.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.SparkHistoryServerConfig spark_history_server_config = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the sparkHistoryServerConfig field is set.
   */
  @java.lang.Override
  public boolean hasSparkHistoryServerConfig() {
    return sparkHistoryServerConfig_ != null;
  }
  /**
   *
   *
   * <pre>
   * Optional. The Spark History Server configuration for the workload.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.SparkHistoryServerConfig spark_history_server_config = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The sparkHistoryServerConfig.
   */
  @java.lang.Override
  public com.google.cloud.dataproc.v1.SparkHistoryServerConfig getSparkHistoryServerConfig() {
    return sparkHistoryServerConfig_ == null
        ? com.google.cloud.dataproc.v1.SparkHistoryServerConfig.getDefaultInstance()
        : sparkHistoryServerConfig_;
  }
  /**
   *
   *
   * <pre>
   * Optional. The Spark History Server configuration for the workload.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.SparkHistoryServerConfig spark_history_server_config = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.dataproc.v1.SparkHistoryServerConfigOrBuilder
      getSparkHistoryServerConfigOrBuilder() {
    return getSparkHistoryServerConfig();
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(metastoreService_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, metastoreService_);
    }
    if (sparkHistoryServerConfig_ != null) {
      output.writeMessage(2, getSparkHistoryServerConfig());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(metastoreService_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, metastoreService_);
    }
    if (sparkHistoryServerConfig_ != null) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              2, getSparkHistoryServerConfig());
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
    if (!(obj instanceof com.google.cloud.dataproc.v1.PeripheralsConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.dataproc.v1.PeripheralsConfig other =
        (com.google.cloud.dataproc.v1.PeripheralsConfig) obj;

    if (!getMetastoreService().equals(other.getMetastoreService())) return false;
    if (hasSparkHistoryServerConfig() != other.hasSparkHistoryServerConfig()) return false;
    if (hasSparkHistoryServerConfig()) {
      if (!getSparkHistoryServerConfig().equals(other.getSparkHistoryServerConfig())) return false;
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
    hash = (37 * hash) + METASTORE_SERVICE_FIELD_NUMBER;
    hash = (53 * hash) + getMetastoreService().hashCode();
    if (hasSparkHistoryServerConfig()) {
      hash = (37 * hash) + SPARK_HISTORY_SERVER_CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getSparkHistoryServerConfig().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dataproc.v1.PeripheralsConfig parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataproc.v1.PeripheralsConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1.PeripheralsConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataproc.v1.PeripheralsConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1.PeripheralsConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataproc.v1.PeripheralsConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1.PeripheralsConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataproc.v1.PeripheralsConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1.PeripheralsConfig parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataproc.v1.PeripheralsConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1.PeripheralsConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataproc.v1.PeripheralsConfig parseFrom(
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

  public static Builder newBuilder(com.google.cloud.dataproc.v1.PeripheralsConfig prototype) {
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
   * Auxiliary services configuration for a workload.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dataproc.v1.PeripheralsConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dataproc.v1.PeripheralsConfig)
      com.google.cloud.dataproc.v1.PeripheralsConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dataproc.v1.SharedProto
          .internal_static_google_cloud_dataproc_v1_PeripheralsConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dataproc.v1.SharedProto
          .internal_static_google_cloud_dataproc_v1_PeripheralsConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dataproc.v1.PeripheralsConfig.class,
              com.google.cloud.dataproc.v1.PeripheralsConfig.Builder.class);
    }

    // Construct using com.google.cloud.dataproc.v1.PeripheralsConfig.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      metastoreService_ = "";

      if (sparkHistoryServerConfigBuilder_ == null) {
        sparkHistoryServerConfig_ = null;
      } else {
        sparkHistoryServerConfig_ = null;
        sparkHistoryServerConfigBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dataproc.v1.SharedProto
          .internal_static_google_cloud_dataproc_v1_PeripheralsConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1.PeripheralsConfig getDefaultInstanceForType() {
      return com.google.cloud.dataproc.v1.PeripheralsConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1.PeripheralsConfig build() {
      com.google.cloud.dataproc.v1.PeripheralsConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1.PeripheralsConfig buildPartial() {
      com.google.cloud.dataproc.v1.PeripheralsConfig result =
          new com.google.cloud.dataproc.v1.PeripheralsConfig(this);
      result.metastoreService_ = metastoreService_;
      if (sparkHistoryServerConfigBuilder_ == null) {
        result.sparkHistoryServerConfig_ = sparkHistoryServerConfig_;
      } else {
        result.sparkHistoryServerConfig_ = sparkHistoryServerConfigBuilder_.build();
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
      if (other instanceof com.google.cloud.dataproc.v1.PeripheralsConfig) {
        return mergeFrom((com.google.cloud.dataproc.v1.PeripheralsConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dataproc.v1.PeripheralsConfig other) {
      if (other == com.google.cloud.dataproc.v1.PeripheralsConfig.getDefaultInstance()) return this;
      if (!other.getMetastoreService().isEmpty()) {
        metastoreService_ = other.metastoreService_;
        onChanged();
      }
      if (other.hasSparkHistoryServerConfig()) {
        mergeSparkHistoryServerConfig(other.getSparkHistoryServerConfig());
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
                metastoreService_ = input.readStringRequireUtf8();

                break;
              } // case 10
            case 18:
              {
                input.readMessage(
                    getSparkHistoryServerConfigFieldBuilder().getBuilder(), extensionRegistry);

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

    private java.lang.Object metastoreService_ = "";
    /**
     *
     *
     * <pre>
     * Optional. Resource name of an existing Dataproc Metastore service.
     * Example:
     * * `projects/[project_id]/locations/[region]/services/[service_id]`
     * </pre>
     *
     * <code>string metastore_service = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The metastoreService.
     */
    public java.lang.String getMetastoreService() {
      java.lang.Object ref = metastoreService_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        metastoreService_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. Resource name of an existing Dataproc Metastore service.
     * Example:
     * * `projects/[project_id]/locations/[region]/services/[service_id]`
     * </pre>
     *
     * <code>string metastore_service = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The bytes for metastoreService.
     */
    public com.google.protobuf.ByteString getMetastoreServiceBytes() {
      java.lang.Object ref = metastoreService_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        metastoreService_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. Resource name of an existing Dataproc Metastore service.
     * Example:
     * * `projects/[project_id]/locations/[region]/services/[service_id]`
     * </pre>
     *
     * <code>string metastore_service = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The metastoreService to set.
     * @return This builder for chaining.
     */
    public Builder setMetastoreService(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      metastoreService_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Resource name of an existing Dataproc Metastore service.
     * Example:
     * * `projects/[project_id]/locations/[region]/services/[service_id]`
     * </pre>
     *
     * <code>string metastore_service = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMetastoreService() {

      metastoreService_ = getDefaultInstance().getMetastoreService();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Resource name of an existing Dataproc Metastore service.
     * Example:
     * * `projects/[project_id]/locations/[region]/services/[service_id]`
     * </pre>
     *
     * <code>string metastore_service = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The bytes for metastoreService to set.
     * @return This builder for chaining.
     */
    public Builder setMetastoreServiceBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      metastoreService_ = value;
      onChanged();
      return this;
    }

    private com.google.cloud.dataproc.v1.SparkHistoryServerConfig sparkHistoryServerConfig_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dataproc.v1.SparkHistoryServerConfig,
            com.google.cloud.dataproc.v1.SparkHistoryServerConfig.Builder,
            com.google.cloud.dataproc.v1.SparkHistoryServerConfigOrBuilder>
        sparkHistoryServerConfigBuilder_;
    /**
     *
     *
     * <pre>
     * Optional. The Spark History Server configuration for the workload.
     * </pre>
     *
     * <code>
     * .google.cloud.dataproc.v1.SparkHistoryServerConfig spark_history_server_config = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return Whether the sparkHistoryServerConfig field is set.
     */
    public boolean hasSparkHistoryServerConfig() {
      return sparkHistoryServerConfigBuilder_ != null || sparkHistoryServerConfig_ != null;
    }
    /**
     *
     *
     * <pre>
     * Optional. The Spark History Server configuration for the workload.
     * </pre>
     *
     * <code>
     * .google.cloud.dataproc.v1.SparkHistoryServerConfig spark_history_server_config = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return The sparkHistoryServerConfig.
     */
    public com.google.cloud.dataproc.v1.SparkHistoryServerConfig getSparkHistoryServerConfig() {
      if (sparkHistoryServerConfigBuilder_ == null) {
        return sparkHistoryServerConfig_ == null
            ? com.google.cloud.dataproc.v1.SparkHistoryServerConfig.getDefaultInstance()
            : sparkHistoryServerConfig_;
      } else {
        return sparkHistoryServerConfigBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. The Spark History Server configuration for the workload.
     * </pre>
     *
     * <code>
     * .google.cloud.dataproc.v1.SparkHistoryServerConfig spark_history_server_config = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder setSparkHistoryServerConfig(
        com.google.cloud.dataproc.v1.SparkHistoryServerConfig value) {
      if (sparkHistoryServerConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        sparkHistoryServerConfig_ = value;
        onChanged();
      } else {
        sparkHistoryServerConfigBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The Spark History Server configuration for the workload.
     * </pre>
     *
     * <code>
     * .google.cloud.dataproc.v1.SparkHistoryServerConfig spark_history_server_config = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder setSparkHistoryServerConfig(
        com.google.cloud.dataproc.v1.SparkHistoryServerConfig.Builder builderForValue) {
      if (sparkHistoryServerConfigBuilder_ == null) {
        sparkHistoryServerConfig_ = builderForValue.build();
        onChanged();
      } else {
        sparkHistoryServerConfigBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The Spark History Server configuration for the workload.
     * </pre>
     *
     * <code>
     * .google.cloud.dataproc.v1.SparkHistoryServerConfig spark_history_server_config = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder mergeSparkHistoryServerConfig(
        com.google.cloud.dataproc.v1.SparkHistoryServerConfig value) {
      if (sparkHistoryServerConfigBuilder_ == null) {
        if (sparkHistoryServerConfig_ != null) {
          sparkHistoryServerConfig_ =
              com.google.cloud.dataproc.v1.SparkHistoryServerConfig.newBuilder(
                      sparkHistoryServerConfig_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          sparkHistoryServerConfig_ = value;
        }
        onChanged();
      } else {
        sparkHistoryServerConfigBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The Spark History Server configuration for the workload.
     * </pre>
     *
     * <code>
     * .google.cloud.dataproc.v1.SparkHistoryServerConfig spark_history_server_config = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder clearSparkHistoryServerConfig() {
      if (sparkHistoryServerConfigBuilder_ == null) {
        sparkHistoryServerConfig_ = null;
        onChanged();
      } else {
        sparkHistoryServerConfig_ = null;
        sparkHistoryServerConfigBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The Spark History Server configuration for the workload.
     * </pre>
     *
     * <code>
     * .google.cloud.dataproc.v1.SparkHistoryServerConfig spark_history_server_config = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public com.google.cloud.dataproc.v1.SparkHistoryServerConfig.Builder
        getSparkHistoryServerConfigBuilder() {

      onChanged();
      return getSparkHistoryServerConfigFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Optional. The Spark History Server configuration for the workload.
     * </pre>
     *
     * <code>
     * .google.cloud.dataproc.v1.SparkHistoryServerConfig spark_history_server_config = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public com.google.cloud.dataproc.v1.SparkHistoryServerConfigOrBuilder
        getSparkHistoryServerConfigOrBuilder() {
      if (sparkHistoryServerConfigBuilder_ != null) {
        return sparkHistoryServerConfigBuilder_.getMessageOrBuilder();
      } else {
        return sparkHistoryServerConfig_ == null
            ? com.google.cloud.dataproc.v1.SparkHistoryServerConfig.getDefaultInstance()
            : sparkHistoryServerConfig_;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. The Spark History Server configuration for the workload.
     * </pre>
     *
     * <code>
     * .google.cloud.dataproc.v1.SparkHistoryServerConfig spark_history_server_config = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dataproc.v1.SparkHistoryServerConfig,
            com.google.cloud.dataproc.v1.SparkHistoryServerConfig.Builder,
            com.google.cloud.dataproc.v1.SparkHistoryServerConfigOrBuilder>
        getSparkHistoryServerConfigFieldBuilder() {
      if (sparkHistoryServerConfigBuilder_ == null) {
        sparkHistoryServerConfigBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.dataproc.v1.SparkHistoryServerConfig,
                com.google.cloud.dataproc.v1.SparkHistoryServerConfig.Builder,
                com.google.cloud.dataproc.v1.SparkHistoryServerConfigOrBuilder>(
                getSparkHistoryServerConfig(), getParentForChildren(), isClean());
        sparkHistoryServerConfig_ = null;
      }
      return sparkHistoryServerConfigBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.dataproc.v1.PeripheralsConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dataproc.v1.PeripheralsConfig)
  private static final com.google.cloud.dataproc.v1.PeripheralsConfig DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dataproc.v1.PeripheralsConfig();
  }

  public static com.google.cloud.dataproc.v1.PeripheralsConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PeripheralsConfig> PARSER =
      new com.google.protobuf.AbstractParser<PeripheralsConfig>() {
        @java.lang.Override
        public PeripheralsConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<PeripheralsConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PeripheralsConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dataproc.v1.PeripheralsConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}