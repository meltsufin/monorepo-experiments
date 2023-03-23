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
// source: google/cloud/notebooks/v1beta1/service.proto

package com.google.cloud.notebooks.v1beta1;

/**
 *
 *
 * <pre>
 * Request for notebook instances to report information to Notebooks API.
 * </pre>
 *
 * Protobuf type {@code google.cloud.notebooks.v1beta1.ReportInstanceInfoRequest}
 */
public final class ReportInstanceInfoRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.notebooks.v1beta1.ReportInstanceInfoRequest)
    ReportInstanceInfoRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ReportInstanceInfoRequest.newBuilder() to construct.
  private ReportInstanceInfoRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ReportInstanceInfoRequest() {
    name_ = "";
    vmId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ReportInstanceInfoRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.notebooks.v1beta1.NotebooksProto
        .internal_static_google_cloud_notebooks_v1beta1_ReportInstanceInfoRequest_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(int number) {
    switch (number) {
      case 3:
        return internalGetMetadata();
      default:
        throw new RuntimeException("Invalid map field number: " + number);
    }
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.notebooks.v1beta1.NotebooksProto
        .internal_static_google_cloud_notebooks_v1beta1_ReportInstanceInfoRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.notebooks.v1beta1.ReportInstanceInfoRequest.class,
            com.google.cloud.notebooks.v1beta1.ReportInstanceInfoRequest.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   *
   *
   * <pre>
   * Required. Format:
   * `projects/{project_id}/locations/{location}/instances/{instance_id}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. Format:
   * `projects/{project_id}/locations/{location}/instances/{instance_id}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VM_ID_FIELD_NUMBER = 2;
  private volatile java.lang.Object vmId_;
  /**
   *
   *
   * <pre>
   * Required. The VM hardware token for authenticating the VM.
   * https://cloud.google.com/compute/docs/instances/verifying-instance-identity
   * </pre>
   *
   * <code>string vm_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The vmId.
   */
  @java.lang.Override
  public java.lang.String getVmId() {
    java.lang.Object ref = vmId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      vmId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The VM hardware token for authenticating the VM.
   * https://cloud.google.com/compute/docs/instances/verifying-instance-identity
   * </pre>
   *
   * <code>string vm_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for vmId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getVmIdBytes() {
    java.lang.Object ref = vmId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      vmId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int METADATA_FIELD_NUMBER = 3;

  private static final class MetadataDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<java.lang.String, java.lang.String> defaultEntry =
        com.google.protobuf.MapEntry.<java.lang.String, java.lang.String>newDefaultInstance(
            com.google.cloud.notebooks.v1beta1.NotebooksProto
                .internal_static_google_cloud_notebooks_v1beta1_ReportInstanceInfoRequest_MetadataEntry_descriptor,
            com.google.protobuf.WireFormat.FieldType.STRING,
            "",
            com.google.protobuf.WireFormat.FieldType.STRING,
            "");
  }

  private com.google.protobuf.MapField<java.lang.String, java.lang.String> metadata_;

  private com.google.protobuf.MapField<java.lang.String, java.lang.String> internalGetMetadata() {
    if (metadata_ == null) {
      return com.google.protobuf.MapField.emptyMapField(MetadataDefaultEntryHolder.defaultEntry);
    }
    return metadata_;
  }

  public int getMetadataCount() {
    return internalGetMetadata().getMap().size();
  }
  /**
   *
   *
   * <pre>
   * The metadata reported to Notebooks API. This will be merged to the instance
   * metadata store
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 3;</code>
   */
  @java.lang.Override
  public boolean containsMetadata(java.lang.String key) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    return internalGetMetadata().getMap().containsKey(key);
  }
  /** Use {@link #getMetadataMap()} instead. */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.String> getMetadata() {
    return getMetadataMap();
  }
  /**
   *
   *
   * <pre>
   * The metadata reported to Notebooks API. This will be merged to the instance
   * metadata store
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 3;</code>
   */
  @java.lang.Override
  public java.util.Map<java.lang.String, java.lang.String> getMetadataMap() {
    return internalGetMetadata().getMap();
  }
  /**
   *
   *
   * <pre>
   * The metadata reported to Notebooks API. This will be merged to the instance
   * metadata store
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 3;</code>
   */
  @java.lang.Override
  public java.lang.String getMetadataOrDefault(
      java.lang.String key, java.lang.String defaultValue) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    java.util.Map<java.lang.String, java.lang.String> map = internalGetMetadata().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   *
   *
   * <pre>
   * The metadata reported to Notebooks API. This will be merged to the instance
   * metadata store
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 3;</code>
   */
  @java.lang.Override
  public java.lang.String getMetadataOrThrow(java.lang.String key) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    java.util.Map<java.lang.String, java.lang.String> map = internalGetMetadata().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(vmId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, vmId_);
    }
    com.google.protobuf.GeneratedMessageV3.serializeStringMapTo(
        output, internalGetMetadata(), MetadataDefaultEntryHolder.defaultEntry, 3);
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(vmId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, vmId_);
    }
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry :
        internalGetMetadata().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.String> metadata__ =
          MetadataDefaultEntryHolder.defaultEntry
              .newBuilderForType()
              .setKey(entry.getKey())
              .setValue(entry.getValue())
              .build();
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, metadata__);
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
    if (!(obj instanceof com.google.cloud.notebooks.v1beta1.ReportInstanceInfoRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.notebooks.v1beta1.ReportInstanceInfoRequest other =
        (com.google.cloud.notebooks.v1beta1.ReportInstanceInfoRequest) obj;

    if (!getName().equals(other.getName())) return false;
    if (!getVmId().equals(other.getVmId())) return false;
    if (!internalGetMetadata().equals(other.internalGetMetadata())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + VM_ID_FIELD_NUMBER;
    hash = (53 * hash) + getVmId().hashCode();
    if (!internalGetMetadata().getMap().isEmpty()) {
      hash = (37 * hash) + METADATA_FIELD_NUMBER;
      hash = (53 * hash) + internalGetMetadata().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.notebooks.v1beta1.ReportInstanceInfoRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.notebooks.v1beta1.ReportInstanceInfoRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.notebooks.v1beta1.ReportInstanceInfoRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.notebooks.v1beta1.ReportInstanceInfoRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.notebooks.v1beta1.ReportInstanceInfoRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.notebooks.v1beta1.ReportInstanceInfoRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.notebooks.v1beta1.ReportInstanceInfoRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.notebooks.v1beta1.ReportInstanceInfoRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.notebooks.v1beta1.ReportInstanceInfoRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.notebooks.v1beta1.ReportInstanceInfoRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.notebooks.v1beta1.ReportInstanceInfoRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.notebooks.v1beta1.ReportInstanceInfoRequest parseFrom(
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
      com.google.cloud.notebooks.v1beta1.ReportInstanceInfoRequest prototype) {
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
   * Request for notebook instances to report information to Notebooks API.
   * </pre>
   *
   * Protobuf type {@code google.cloud.notebooks.v1beta1.ReportInstanceInfoRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.notebooks.v1beta1.ReportInstanceInfoRequest)
      com.google.cloud.notebooks.v1beta1.ReportInstanceInfoRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.notebooks.v1beta1.NotebooksProto
          .internal_static_google_cloud_notebooks_v1beta1_ReportInstanceInfoRequest_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(int number) {
      switch (number) {
        case 3:
          return internalGetMetadata();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(int number) {
      switch (number) {
        case 3:
          return internalGetMutableMetadata();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.notebooks.v1beta1.NotebooksProto
          .internal_static_google_cloud_notebooks_v1beta1_ReportInstanceInfoRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.notebooks.v1beta1.ReportInstanceInfoRequest.class,
              com.google.cloud.notebooks.v1beta1.ReportInstanceInfoRequest.Builder.class);
    }

    // Construct using com.google.cloud.notebooks.v1beta1.ReportInstanceInfoRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      name_ = "";

      vmId_ = "";

      internalGetMutableMetadata().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.notebooks.v1beta1.NotebooksProto
          .internal_static_google_cloud_notebooks_v1beta1_ReportInstanceInfoRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.notebooks.v1beta1.ReportInstanceInfoRequest
        getDefaultInstanceForType() {
      return com.google.cloud.notebooks.v1beta1.ReportInstanceInfoRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.notebooks.v1beta1.ReportInstanceInfoRequest build() {
      com.google.cloud.notebooks.v1beta1.ReportInstanceInfoRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.notebooks.v1beta1.ReportInstanceInfoRequest buildPartial() {
      com.google.cloud.notebooks.v1beta1.ReportInstanceInfoRequest result =
          new com.google.cloud.notebooks.v1beta1.ReportInstanceInfoRequest(this);
      int from_bitField0_ = bitField0_;
      result.name_ = name_;
      result.vmId_ = vmId_;
      result.metadata_ = internalGetMetadata();
      result.metadata_.makeImmutable();
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
      if (other instanceof com.google.cloud.notebooks.v1beta1.ReportInstanceInfoRequest) {
        return mergeFrom((com.google.cloud.notebooks.v1beta1.ReportInstanceInfoRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.notebooks.v1beta1.ReportInstanceInfoRequest other) {
      if (other
          == com.google.cloud.notebooks.v1beta1.ReportInstanceInfoRequest.getDefaultInstance())
        return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (!other.getVmId().isEmpty()) {
        vmId_ = other.vmId_;
        onChanged();
      }
      internalGetMutableMetadata().mergeFrom(other.internalGetMetadata());
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
                name_ = input.readStringRequireUtf8();

                break;
              } // case 10
            case 18:
              {
                vmId_ = input.readStringRequireUtf8();

                break;
              } // case 18
            case 26:
              {
                com.google.protobuf.MapEntry<java.lang.String, java.lang.String> metadata__ =
                    input.readMessage(
                        MetadataDefaultEntryHolder.defaultEntry.getParserForType(),
                        extensionRegistry);
                internalGetMutableMetadata()
                    .getMutableMap()
                    .put(metadata__.getKey(), metadata__.getValue());
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

    private int bitField0_;

    private java.lang.Object name_ = "";
    /**
     *
     *
     * <pre>
     * Required. Format:
     * `projects/{project_id}/locations/{location}/instances/{instance_id}`
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Format:
     * `projects/{project_id}/locations/{location}/instances/{instance_id}`
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Format:
     * `projects/{project_id}/locations/{location}/instances/{instance_id}`
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      name_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Format:
     * `projects/{project_id}/locations/{location}/instances/{instance_id}`
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearName() {

      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Format:
     * `projects/{project_id}/locations/{location}/instances/{instance_id}`
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      name_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object vmId_ = "";
    /**
     *
     *
     * <pre>
     * Required. The VM hardware token for authenticating the VM.
     * https://cloud.google.com/compute/docs/instances/verifying-instance-identity
     * </pre>
     *
     * <code>string vm_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The vmId.
     */
    public java.lang.String getVmId() {
      java.lang.Object ref = vmId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        vmId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The VM hardware token for authenticating the VM.
     * https://cloud.google.com/compute/docs/instances/verifying-instance-identity
     * </pre>
     *
     * <code>string vm_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for vmId.
     */
    public com.google.protobuf.ByteString getVmIdBytes() {
      java.lang.Object ref = vmId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        vmId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The VM hardware token for authenticating the VM.
     * https://cloud.google.com/compute/docs/instances/verifying-instance-identity
     * </pre>
     *
     * <code>string vm_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The vmId to set.
     * @return This builder for chaining.
     */
    public Builder setVmId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      vmId_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The VM hardware token for authenticating the VM.
     * https://cloud.google.com/compute/docs/instances/verifying-instance-identity
     * </pre>
     *
     * <code>string vm_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearVmId() {

      vmId_ = getDefaultInstance().getVmId();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The VM hardware token for authenticating the VM.
     * https://cloud.google.com/compute/docs/instances/verifying-instance-identity
     * </pre>
     *
     * <code>string vm_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for vmId to set.
     * @return This builder for chaining.
     */
    public Builder setVmIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      vmId_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.MapField<java.lang.String, java.lang.String> metadata_;

    private com.google.protobuf.MapField<java.lang.String, java.lang.String> internalGetMetadata() {
      if (metadata_ == null) {
        return com.google.protobuf.MapField.emptyMapField(MetadataDefaultEntryHolder.defaultEntry);
      }
      return metadata_;
    }

    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
        internalGetMutableMetadata() {
      onChanged();
      ;
      if (metadata_ == null) {
        metadata_ =
            com.google.protobuf.MapField.newMapField(MetadataDefaultEntryHolder.defaultEntry);
      }
      if (!metadata_.isMutable()) {
        metadata_ = metadata_.copy();
      }
      return metadata_;
    }

    public int getMetadataCount() {
      return internalGetMetadata().getMap().size();
    }
    /**
     *
     *
     * <pre>
     * The metadata reported to Notebooks API. This will be merged to the instance
     * metadata store
     * </pre>
     *
     * <code>map&lt;string, string&gt; metadata = 3;</code>
     */
    @java.lang.Override
    public boolean containsMetadata(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      return internalGetMetadata().getMap().containsKey(key);
    }
    /** Use {@link #getMetadataMap()} instead. */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getMetadata() {
      return getMetadataMap();
    }
    /**
     *
     *
     * <pre>
     * The metadata reported to Notebooks API. This will be merged to the instance
     * metadata store
     * </pre>
     *
     * <code>map&lt;string, string&gt; metadata = 3;</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.String, java.lang.String> getMetadataMap() {
      return internalGetMetadata().getMap();
    }
    /**
     *
     *
     * <pre>
     * The metadata reported to Notebooks API. This will be merged to the instance
     * metadata store
     * </pre>
     *
     * <code>map&lt;string, string&gt; metadata = 3;</code>
     */
    @java.lang.Override
    public java.lang.String getMetadataOrDefault(
        java.lang.String key, java.lang.String defaultValue) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      java.util.Map<java.lang.String, java.lang.String> map = internalGetMetadata().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     *
     *
     * <pre>
     * The metadata reported to Notebooks API. This will be merged to the instance
     * metadata store
     * </pre>
     *
     * <code>map&lt;string, string&gt; metadata = 3;</code>
     */
    @java.lang.Override
    public java.lang.String getMetadataOrThrow(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      java.util.Map<java.lang.String, java.lang.String> map = internalGetMetadata().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearMetadata() {
      internalGetMutableMetadata().getMutableMap().clear();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The metadata reported to Notebooks API. This will be merged to the instance
     * metadata store
     * </pre>
     *
     * <code>map&lt;string, string&gt; metadata = 3;</code>
     */
    public Builder removeMetadata(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      internalGetMutableMetadata().getMutableMap().remove(key);
      return this;
    }
    /** Use alternate mutation accessors instead. */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getMutableMetadata() {
      return internalGetMutableMetadata().getMutableMap();
    }
    /**
     *
     *
     * <pre>
     * The metadata reported to Notebooks API. This will be merged to the instance
     * metadata store
     * </pre>
     *
     * <code>map&lt;string, string&gt; metadata = 3;</code>
     */
    public Builder putMetadata(java.lang.String key, java.lang.String value) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      if (value == null) {
        throw new NullPointerException("map value");
      }

      internalGetMutableMetadata().getMutableMap().put(key, value);
      return this;
    }
    /**
     *
     *
     * <pre>
     * The metadata reported to Notebooks API. This will be merged to the instance
     * metadata store
     * </pre>
     *
     * <code>map&lt;string, string&gt; metadata = 3;</code>
     */
    public Builder putAllMetadata(java.util.Map<java.lang.String, java.lang.String> values) {
      internalGetMutableMetadata().getMutableMap().putAll(values);
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

    // @@protoc_insertion_point(builder_scope:google.cloud.notebooks.v1beta1.ReportInstanceInfoRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.notebooks.v1beta1.ReportInstanceInfoRequest)
  private static final com.google.cloud.notebooks.v1beta1.ReportInstanceInfoRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.notebooks.v1beta1.ReportInstanceInfoRequest();
  }

  public static com.google.cloud.notebooks.v1beta1.ReportInstanceInfoRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ReportInstanceInfoRequest> PARSER =
      new com.google.protobuf.AbstractParser<ReportInstanceInfoRequest>() {
        @java.lang.Override
        public ReportInstanceInfoRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<ReportInstanceInfoRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ReportInstanceInfoRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.notebooks.v1beta1.ReportInstanceInfoRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
