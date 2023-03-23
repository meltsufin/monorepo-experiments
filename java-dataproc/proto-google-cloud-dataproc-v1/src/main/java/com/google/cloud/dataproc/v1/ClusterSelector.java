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
// source: google/cloud/dataproc/v1/workflow_templates.proto

package com.google.cloud.dataproc.v1;

/**
 *
 *
 * <pre>
 * A selector that chooses target cluster for jobs based on metadata.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dataproc.v1.ClusterSelector}
 */
public final class ClusterSelector extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dataproc.v1.ClusterSelector)
    ClusterSelectorOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ClusterSelector.newBuilder() to construct.
  private ClusterSelector(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ClusterSelector() {
    zone_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ClusterSelector();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.dataproc.v1.WorkflowTemplatesProto
        .internal_static_google_cloud_dataproc_v1_ClusterSelector_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(int number) {
    switch (number) {
      case 2:
        return internalGetClusterLabels();
      default:
        throw new RuntimeException("Invalid map field number: " + number);
    }
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dataproc.v1.WorkflowTemplatesProto
        .internal_static_google_cloud_dataproc_v1_ClusterSelector_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dataproc.v1.ClusterSelector.class,
            com.google.cloud.dataproc.v1.ClusterSelector.Builder.class);
  }

  public static final int ZONE_FIELD_NUMBER = 1;
  private volatile java.lang.Object zone_;
  /**
   *
   *
   * <pre>
   * Optional. The zone where workflow process executes. This parameter does not
   * affect the selection of the cluster.
   * If unspecified, the zone of the first cluster matching the selector
   * is used.
   * </pre>
   *
   * <code>string zone = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The zone.
   */
  @java.lang.Override
  public java.lang.String getZone() {
    java.lang.Object ref = zone_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      zone_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Optional. The zone where workflow process executes. This parameter does not
   * affect the selection of the cluster.
   * If unspecified, the zone of the first cluster matching the selector
   * is used.
   * </pre>
   *
   * <code>string zone = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for zone.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getZoneBytes() {
    java.lang.Object ref = zone_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      zone_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CLUSTER_LABELS_FIELD_NUMBER = 2;

  private static final class ClusterLabelsDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<java.lang.String, java.lang.String> defaultEntry =
        com.google.protobuf.MapEntry.<java.lang.String, java.lang.String>newDefaultInstance(
            com.google.cloud.dataproc.v1.WorkflowTemplatesProto
                .internal_static_google_cloud_dataproc_v1_ClusterSelector_ClusterLabelsEntry_descriptor,
            com.google.protobuf.WireFormat.FieldType.STRING,
            "",
            com.google.protobuf.WireFormat.FieldType.STRING,
            "");
  }

  private com.google.protobuf.MapField<java.lang.String, java.lang.String> clusterLabels_;

  private com.google.protobuf.MapField<java.lang.String, java.lang.String>
      internalGetClusterLabels() {
    if (clusterLabels_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          ClusterLabelsDefaultEntryHolder.defaultEntry);
    }
    return clusterLabels_;
  }

  public int getClusterLabelsCount() {
    return internalGetClusterLabels().getMap().size();
  }
  /**
   *
   *
   * <pre>
   * Required. The cluster labels. Cluster must have all labels
   * to match.
   * </pre>
   *
   * <code>map&lt;string, string&gt; cluster_labels = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public boolean containsClusterLabels(java.lang.String key) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    return internalGetClusterLabels().getMap().containsKey(key);
  }
  /** Use {@link #getClusterLabelsMap()} instead. */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.String> getClusterLabels() {
    return getClusterLabelsMap();
  }
  /**
   *
   *
   * <pre>
   * Required. The cluster labels. Cluster must have all labels
   * to match.
   * </pre>
   *
   * <code>map&lt;string, string&gt; cluster_labels = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public java.util.Map<java.lang.String, java.lang.String> getClusterLabelsMap() {
    return internalGetClusterLabels().getMap();
  }
  /**
   *
   *
   * <pre>
   * Required. The cluster labels. Cluster must have all labels
   * to match.
   * </pre>
   *
   * <code>map&lt;string, string&gt; cluster_labels = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public java.lang.String getClusterLabelsOrDefault(
      java.lang.String key, java.lang.String defaultValue) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    java.util.Map<java.lang.String, java.lang.String> map = internalGetClusterLabels().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   *
   *
   * <pre>
   * Required. The cluster labels. Cluster must have all labels
   * to match.
   * </pre>
   *
   * <code>map&lt;string, string&gt; cluster_labels = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public java.lang.String getClusterLabelsOrThrow(java.lang.String key) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    java.util.Map<java.lang.String, java.lang.String> map = internalGetClusterLabels().getMap();
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(zone_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, zone_);
    }
    com.google.protobuf.GeneratedMessageV3.serializeStringMapTo(
        output, internalGetClusterLabels(), ClusterLabelsDefaultEntryHolder.defaultEntry, 2);
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(zone_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, zone_);
    }
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry :
        internalGetClusterLabels().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.String> clusterLabels__ =
          ClusterLabelsDefaultEntryHolder.defaultEntry
              .newBuilderForType()
              .setKey(entry.getKey())
              .setValue(entry.getValue())
              .build();
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, clusterLabels__);
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
    if (!(obj instanceof com.google.cloud.dataproc.v1.ClusterSelector)) {
      return super.equals(obj);
    }
    com.google.cloud.dataproc.v1.ClusterSelector other =
        (com.google.cloud.dataproc.v1.ClusterSelector) obj;

    if (!getZone().equals(other.getZone())) return false;
    if (!internalGetClusterLabels().equals(other.internalGetClusterLabels())) return false;
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
    hash = (37 * hash) + ZONE_FIELD_NUMBER;
    hash = (53 * hash) + getZone().hashCode();
    if (!internalGetClusterLabels().getMap().isEmpty()) {
      hash = (37 * hash) + CLUSTER_LABELS_FIELD_NUMBER;
      hash = (53 * hash) + internalGetClusterLabels().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dataproc.v1.ClusterSelector parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataproc.v1.ClusterSelector parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1.ClusterSelector parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataproc.v1.ClusterSelector parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1.ClusterSelector parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataproc.v1.ClusterSelector parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1.ClusterSelector parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataproc.v1.ClusterSelector parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1.ClusterSelector parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataproc.v1.ClusterSelector parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1.ClusterSelector parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataproc.v1.ClusterSelector parseFrom(
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

  public static Builder newBuilder(com.google.cloud.dataproc.v1.ClusterSelector prototype) {
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
   * A selector that chooses target cluster for jobs based on metadata.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dataproc.v1.ClusterSelector}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dataproc.v1.ClusterSelector)
      com.google.cloud.dataproc.v1.ClusterSelectorOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dataproc.v1.WorkflowTemplatesProto
          .internal_static_google_cloud_dataproc_v1_ClusterSelector_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(int number) {
      switch (number) {
        case 2:
          return internalGetClusterLabels();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(int number) {
      switch (number) {
        case 2:
          return internalGetMutableClusterLabels();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dataproc.v1.WorkflowTemplatesProto
          .internal_static_google_cloud_dataproc_v1_ClusterSelector_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dataproc.v1.ClusterSelector.class,
              com.google.cloud.dataproc.v1.ClusterSelector.Builder.class);
    }

    // Construct using com.google.cloud.dataproc.v1.ClusterSelector.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      zone_ = "";

      internalGetMutableClusterLabels().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dataproc.v1.WorkflowTemplatesProto
          .internal_static_google_cloud_dataproc_v1_ClusterSelector_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1.ClusterSelector getDefaultInstanceForType() {
      return com.google.cloud.dataproc.v1.ClusterSelector.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1.ClusterSelector build() {
      com.google.cloud.dataproc.v1.ClusterSelector result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1.ClusterSelector buildPartial() {
      com.google.cloud.dataproc.v1.ClusterSelector result =
          new com.google.cloud.dataproc.v1.ClusterSelector(this);
      int from_bitField0_ = bitField0_;
      result.zone_ = zone_;
      result.clusterLabels_ = internalGetClusterLabels();
      result.clusterLabels_.makeImmutable();
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
      if (other instanceof com.google.cloud.dataproc.v1.ClusterSelector) {
        return mergeFrom((com.google.cloud.dataproc.v1.ClusterSelector) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dataproc.v1.ClusterSelector other) {
      if (other == com.google.cloud.dataproc.v1.ClusterSelector.getDefaultInstance()) return this;
      if (!other.getZone().isEmpty()) {
        zone_ = other.zone_;
        onChanged();
      }
      internalGetMutableClusterLabels().mergeFrom(other.internalGetClusterLabels());
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
                zone_ = input.readStringRequireUtf8();

                break;
              } // case 10
            case 18:
              {
                com.google.protobuf.MapEntry<java.lang.String, java.lang.String> clusterLabels__ =
                    input.readMessage(
                        ClusterLabelsDefaultEntryHolder.defaultEntry.getParserForType(),
                        extensionRegistry);
                internalGetMutableClusterLabels()
                    .getMutableMap()
                    .put(clusterLabels__.getKey(), clusterLabels__.getValue());
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

    private int bitField0_;

    private java.lang.Object zone_ = "";
    /**
     *
     *
     * <pre>
     * Optional. The zone where workflow process executes. This parameter does not
     * affect the selection of the cluster.
     * If unspecified, the zone of the first cluster matching the selector
     * is used.
     * </pre>
     *
     * <code>string zone = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The zone.
     */
    public java.lang.String getZone() {
      java.lang.Object ref = zone_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        zone_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. The zone where workflow process executes. This parameter does not
     * affect the selection of the cluster.
     * If unspecified, the zone of the first cluster matching the selector
     * is used.
     * </pre>
     *
     * <code>string zone = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The bytes for zone.
     */
    public com.google.protobuf.ByteString getZoneBytes() {
      java.lang.Object ref = zone_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        zone_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. The zone where workflow process executes. This parameter does not
     * affect the selection of the cluster.
     * If unspecified, the zone of the first cluster matching the selector
     * is used.
     * </pre>
     *
     * <code>string zone = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The zone to set.
     * @return This builder for chaining.
     */
    public Builder setZone(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      zone_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The zone where workflow process executes. This parameter does not
     * affect the selection of the cluster.
     * If unspecified, the zone of the first cluster matching the selector
     * is used.
     * </pre>
     *
     * <code>string zone = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearZone() {

      zone_ = getDefaultInstance().getZone();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The zone where workflow process executes. This parameter does not
     * affect the selection of the cluster.
     * If unspecified, the zone of the first cluster matching the selector
     * is used.
     * </pre>
     *
     * <code>string zone = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The bytes for zone to set.
     * @return This builder for chaining.
     */
    public Builder setZoneBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      zone_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.MapField<java.lang.String, java.lang.String> clusterLabels_;

    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
        internalGetClusterLabels() {
      if (clusterLabels_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            ClusterLabelsDefaultEntryHolder.defaultEntry);
      }
      return clusterLabels_;
    }

    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
        internalGetMutableClusterLabels() {
      onChanged();
      ;
      if (clusterLabels_ == null) {
        clusterLabels_ =
            com.google.protobuf.MapField.newMapField(ClusterLabelsDefaultEntryHolder.defaultEntry);
      }
      if (!clusterLabels_.isMutable()) {
        clusterLabels_ = clusterLabels_.copy();
      }
      return clusterLabels_;
    }

    public int getClusterLabelsCount() {
      return internalGetClusterLabels().getMap().size();
    }
    /**
     *
     *
     * <pre>
     * Required. The cluster labels. Cluster must have all labels
     * to match.
     * </pre>
     *
     * <code>map&lt;string, string&gt; cluster_labels = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    @java.lang.Override
    public boolean containsClusterLabels(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      return internalGetClusterLabels().getMap().containsKey(key);
    }
    /** Use {@link #getClusterLabelsMap()} instead. */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getClusterLabels() {
      return getClusterLabelsMap();
    }
    /**
     *
     *
     * <pre>
     * Required. The cluster labels. Cluster must have all labels
     * to match.
     * </pre>
     *
     * <code>map&lt;string, string&gt; cluster_labels = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.String, java.lang.String> getClusterLabelsMap() {
      return internalGetClusterLabels().getMap();
    }
    /**
     *
     *
     * <pre>
     * Required. The cluster labels. Cluster must have all labels
     * to match.
     * </pre>
     *
     * <code>map&lt;string, string&gt; cluster_labels = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    @java.lang.Override
    public java.lang.String getClusterLabelsOrDefault(
        java.lang.String key, java.lang.String defaultValue) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      java.util.Map<java.lang.String, java.lang.String> map = internalGetClusterLabels().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     *
     *
     * <pre>
     * Required. The cluster labels. Cluster must have all labels
     * to match.
     * </pre>
     *
     * <code>map&lt;string, string&gt; cluster_labels = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    @java.lang.Override
    public java.lang.String getClusterLabelsOrThrow(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      java.util.Map<java.lang.String, java.lang.String> map = internalGetClusterLabels().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearClusterLabels() {
      internalGetMutableClusterLabels().getMutableMap().clear();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The cluster labels. Cluster must have all labels
     * to match.
     * </pre>
     *
     * <code>map&lt;string, string&gt; cluster_labels = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder removeClusterLabels(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      internalGetMutableClusterLabels().getMutableMap().remove(key);
      return this;
    }
    /** Use alternate mutation accessors instead. */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getMutableClusterLabels() {
      return internalGetMutableClusterLabels().getMutableMap();
    }
    /**
     *
     *
     * <pre>
     * Required. The cluster labels. Cluster must have all labels
     * to match.
     * </pre>
     *
     * <code>map&lt;string, string&gt; cluster_labels = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder putClusterLabels(java.lang.String key, java.lang.String value) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      if (value == null) {
        throw new NullPointerException("map value");
      }

      internalGetMutableClusterLabels().getMutableMap().put(key, value);
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The cluster labels. Cluster must have all labels
     * to match.
     * </pre>
     *
     * <code>map&lt;string, string&gt; cluster_labels = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder putAllClusterLabels(java.util.Map<java.lang.String, java.lang.String> values) {
      internalGetMutableClusterLabels().getMutableMap().putAll(values);
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

    // @@protoc_insertion_point(builder_scope:google.cloud.dataproc.v1.ClusterSelector)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dataproc.v1.ClusterSelector)
  private static final com.google.cloud.dataproc.v1.ClusterSelector DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dataproc.v1.ClusterSelector();
  }

  public static com.google.cloud.dataproc.v1.ClusterSelector getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ClusterSelector> PARSER =
      new com.google.protobuf.AbstractParser<ClusterSelector>() {
        @java.lang.Override
        public ClusterSelector parsePartialFrom(
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

  public static com.google.protobuf.Parser<ClusterSelector> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ClusterSelector> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dataproc.v1.ClusterSelector getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}