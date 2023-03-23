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
// source: google/cloud/deploy/v1/cloud_deploy.proto

package com.google.cloud.deploy.v1;

/**
 *
 *
 * <pre>
 * PipelineCondition contains all conditions relevant to a Delivery Pipeline.
 * </pre>
 *
 * Protobuf type {@code google.cloud.deploy.v1.PipelineCondition}
 */
public final class PipelineCondition extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.deploy.v1.PipelineCondition)
    PipelineConditionOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use PipelineCondition.newBuilder() to construct.
  private PipelineCondition(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private PipelineCondition() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new PipelineCondition();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.deploy.v1.CloudDeployProto
        .internal_static_google_cloud_deploy_v1_PipelineCondition_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.deploy.v1.CloudDeployProto
        .internal_static_google_cloud_deploy_v1_PipelineCondition_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.deploy.v1.PipelineCondition.class,
            com.google.cloud.deploy.v1.PipelineCondition.Builder.class);
  }

  public static final int PIPELINE_READY_CONDITION_FIELD_NUMBER = 1;
  private com.google.cloud.deploy.v1.PipelineReadyCondition pipelineReadyCondition_;
  /**
   *
   *
   * <pre>
   * Details around the Pipeline's overall status.
   * </pre>
   *
   * <code>.google.cloud.deploy.v1.PipelineReadyCondition pipeline_ready_condition = 1;</code>
   *
   * @return Whether the pipelineReadyCondition field is set.
   */
  @java.lang.Override
  public boolean hasPipelineReadyCondition() {
    return pipelineReadyCondition_ != null;
  }
  /**
   *
   *
   * <pre>
   * Details around the Pipeline's overall status.
   * </pre>
   *
   * <code>.google.cloud.deploy.v1.PipelineReadyCondition pipeline_ready_condition = 1;</code>
   *
   * @return The pipelineReadyCondition.
   */
  @java.lang.Override
  public com.google.cloud.deploy.v1.PipelineReadyCondition getPipelineReadyCondition() {
    return pipelineReadyCondition_ == null
        ? com.google.cloud.deploy.v1.PipelineReadyCondition.getDefaultInstance()
        : pipelineReadyCondition_;
  }
  /**
   *
   *
   * <pre>
   * Details around the Pipeline's overall status.
   * </pre>
   *
   * <code>.google.cloud.deploy.v1.PipelineReadyCondition pipeline_ready_condition = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.deploy.v1.PipelineReadyConditionOrBuilder
      getPipelineReadyConditionOrBuilder() {
    return getPipelineReadyCondition();
  }

  public static final int TARGETS_PRESENT_CONDITION_FIELD_NUMBER = 3;
  private com.google.cloud.deploy.v1.TargetsPresentCondition targetsPresentCondition_;
  /**
   *
   *
   * <pre>
   * Detalis around targets enumerated in the pipeline.
   * </pre>
   *
   * <code>.google.cloud.deploy.v1.TargetsPresentCondition targets_present_condition = 3;</code>
   *
   * @return Whether the targetsPresentCondition field is set.
   */
  @java.lang.Override
  public boolean hasTargetsPresentCondition() {
    return targetsPresentCondition_ != null;
  }
  /**
   *
   *
   * <pre>
   * Detalis around targets enumerated in the pipeline.
   * </pre>
   *
   * <code>.google.cloud.deploy.v1.TargetsPresentCondition targets_present_condition = 3;</code>
   *
   * @return The targetsPresentCondition.
   */
  @java.lang.Override
  public com.google.cloud.deploy.v1.TargetsPresentCondition getTargetsPresentCondition() {
    return targetsPresentCondition_ == null
        ? com.google.cloud.deploy.v1.TargetsPresentCondition.getDefaultInstance()
        : targetsPresentCondition_;
  }
  /**
   *
   *
   * <pre>
   * Detalis around targets enumerated in the pipeline.
   * </pre>
   *
   * <code>.google.cloud.deploy.v1.TargetsPresentCondition targets_present_condition = 3;</code>
   */
  @java.lang.Override
  public com.google.cloud.deploy.v1.TargetsPresentConditionOrBuilder
      getTargetsPresentConditionOrBuilder() {
    return getTargetsPresentCondition();
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
    if (pipelineReadyCondition_ != null) {
      output.writeMessage(1, getPipelineReadyCondition());
    }
    if (targetsPresentCondition_ != null) {
      output.writeMessage(3, getTargetsPresentCondition());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (pipelineReadyCondition_ != null) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(1, getPipelineReadyCondition());
    }
    if (targetsPresentCondition_ != null) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(3, getTargetsPresentCondition());
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
    if (!(obj instanceof com.google.cloud.deploy.v1.PipelineCondition)) {
      return super.equals(obj);
    }
    com.google.cloud.deploy.v1.PipelineCondition other =
        (com.google.cloud.deploy.v1.PipelineCondition) obj;

    if (hasPipelineReadyCondition() != other.hasPipelineReadyCondition()) return false;
    if (hasPipelineReadyCondition()) {
      if (!getPipelineReadyCondition().equals(other.getPipelineReadyCondition())) return false;
    }
    if (hasTargetsPresentCondition() != other.hasTargetsPresentCondition()) return false;
    if (hasTargetsPresentCondition()) {
      if (!getTargetsPresentCondition().equals(other.getTargetsPresentCondition())) return false;
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
    if (hasPipelineReadyCondition()) {
      hash = (37 * hash) + PIPELINE_READY_CONDITION_FIELD_NUMBER;
      hash = (53 * hash) + getPipelineReadyCondition().hashCode();
    }
    if (hasTargetsPresentCondition()) {
      hash = (37 * hash) + TARGETS_PRESENT_CONDITION_FIELD_NUMBER;
      hash = (53 * hash) + getTargetsPresentCondition().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.deploy.v1.PipelineCondition parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.deploy.v1.PipelineCondition parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.deploy.v1.PipelineCondition parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.deploy.v1.PipelineCondition parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.deploy.v1.PipelineCondition parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.deploy.v1.PipelineCondition parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.deploy.v1.PipelineCondition parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.deploy.v1.PipelineCondition parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.deploy.v1.PipelineCondition parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.deploy.v1.PipelineCondition parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.deploy.v1.PipelineCondition parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.deploy.v1.PipelineCondition parseFrom(
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

  public static Builder newBuilder(com.google.cloud.deploy.v1.PipelineCondition prototype) {
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
   * PipelineCondition contains all conditions relevant to a Delivery Pipeline.
   * </pre>
   *
   * Protobuf type {@code google.cloud.deploy.v1.PipelineCondition}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.deploy.v1.PipelineCondition)
      com.google.cloud.deploy.v1.PipelineConditionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.deploy.v1.CloudDeployProto
          .internal_static_google_cloud_deploy_v1_PipelineCondition_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.deploy.v1.CloudDeployProto
          .internal_static_google_cloud_deploy_v1_PipelineCondition_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.deploy.v1.PipelineCondition.class,
              com.google.cloud.deploy.v1.PipelineCondition.Builder.class);
    }

    // Construct using com.google.cloud.deploy.v1.PipelineCondition.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (pipelineReadyConditionBuilder_ == null) {
        pipelineReadyCondition_ = null;
      } else {
        pipelineReadyCondition_ = null;
        pipelineReadyConditionBuilder_ = null;
      }
      if (targetsPresentConditionBuilder_ == null) {
        targetsPresentCondition_ = null;
      } else {
        targetsPresentCondition_ = null;
        targetsPresentConditionBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.deploy.v1.CloudDeployProto
          .internal_static_google_cloud_deploy_v1_PipelineCondition_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.deploy.v1.PipelineCondition getDefaultInstanceForType() {
      return com.google.cloud.deploy.v1.PipelineCondition.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.deploy.v1.PipelineCondition build() {
      com.google.cloud.deploy.v1.PipelineCondition result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.deploy.v1.PipelineCondition buildPartial() {
      com.google.cloud.deploy.v1.PipelineCondition result =
          new com.google.cloud.deploy.v1.PipelineCondition(this);
      if (pipelineReadyConditionBuilder_ == null) {
        result.pipelineReadyCondition_ = pipelineReadyCondition_;
      } else {
        result.pipelineReadyCondition_ = pipelineReadyConditionBuilder_.build();
      }
      if (targetsPresentConditionBuilder_ == null) {
        result.targetsPresentCondition_ = targetsPresentCondition_;
      } else {
        result.targetsPresentCondition_ = targetsPresentConditionBuilder_.build();
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
      if (other instanceof com.google.cloud.deploy.v1.PipelineCondition) {
        return mergeFrom((com.google.cloud.deploy.v1.PipelineCondition) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.deploy.v1.PipelineCondition other) {
      if (other == com.google.cloud.deploy.v1.PipelineCondition.getDefaultInstance()) return this;
      if (other.hasPipelineReadyCondition()) {
        mergePipelineReadyCondition(other.getPipelineReadyCondition());
      }
      if (other.hasTargetsPresentCondition()) {
        mergeTargetsPresentCondition(other.getTargetsPresentCondition());
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
                    getPipelineReadyConditionFieldBuilder().getBuilder(), extensionRegistry);

                break;
              } // case 10
            case 26:
              {
                input.readMessage(
                    getTargetsPresentConditionFieldBuilder().getBuilder(), extensionRegistry);

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

    private com.google.cloud.deploy.v1.PipelineReadyCondition pipelineReadyCondition_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.deploy.v1.PipelineReadyCondition,
            com.google.cloud.deploy.v1.PipelineReadyCondition.Builder,
            com.google.cloud.deploy.v1.PipelineReadyConditionOrBuilder>
        pipelineReadyConditionBuilder_;
    /**
     *
     *
     * <pre>
     * Details around the Pipeline's overall status.
     * </pre>
     *
     * <code>.google.cloud.deploy.v1.PipelineReadyCondition pipeline_ready_condition = 1;</code>
     *
     * @return Whether the pipelineReadyCondition field is set.
     */
    public boolean hasPipelineReadyCondition() {
      return pipelineReadyConditionBuilder_ != null || pipelineReadyCondition_ != null;
    }
    /**
     *
     *
     * <pre>
     * Details around the Pipeline's overall status.
     * </pre>
     *
     * <code>.google.cloud.deploy.v1.PipelineReadyCondition pipeline_ready_condition = 1;</code>
     *
     * @return The pipelineReadyCondition.
     */
    public com.google.cloud.deploy.v1.PipelineReadyCondition getPipelineReadyCondition() {
      if (pipelineReadyConditionBuilder_ == null) {
        return pipelineReadyCondition_ == null
            ? com.google.cloud.deploy.v1.PipelineReadyCondition.getDefaultInstance()
            : pipelineReadyCondition_;
      } else {
        return pipelineReadyConditionBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Details around the Pipeline's overall status.
     * </pre>
     *
     * <code>.google.cloud.deploy.v1.PipelineReadyCondition pipeline_ready_condition = 1;</code>
     */
    public Builder setPipelineReadyCondition(
        com.google.cloud.deploy.v1.PipelineReadyCondition value) {
      if (pipelineReadyConditionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        pipelineReadyCondition_ = value;
        onChanged();
      } else {
        pipelineReadyConditionBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Details around the Pipeline's overall status.
     * </pre>
     *
     * <code>.google.cloud.deploy.v1.PipelineReadyCondition pipeline_ready_condition = 1;</code>
     */
    public Builder setPipelineReadyCondition(
        com.google.cloud.deploy.v1.PipelineReadyCondition.Builder builderForValue) {
      if (pipelineReadyConditionBuilder_ == null) {
        pipelineReadyCondition_ = builderForValue.build();
        onChanged();
      } else {
        pipelineReadyConditionBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Details around the Pipeline's overall status.
     * </pre>
     *
     * <code>.google.cloud.deploy.v1.PipelineReadyCondition pipeline_ready_condition = 1;</code>
     */
    public Builder mergePipelineReadyCondition(
        com.google.cloud.deploy.v1.PipelineReadyCondition value) {
      if (pipelineReadyConditionBuilder_ == null) {
        if (pipelineReadyCondition_ != null) {
          pipelineReadyCondition_ =
              com.google.cloud.deploy.v1.PipelineReadyCondition.newBuilder(pipelineReadyCondition_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          pipelineReadyCondition_ = value;
        }
        onChanged();
      } else {
        pipelineReadyConditionBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Details around the Pipeline's overall status.
     * </pre>
     *
     * <code>.google.cloud.deploy.v1.PipelineReadyCondition pipeline_ready_condition = 1;</code>
     */
    public Builder clearPipelineReadyCondition() {
      if (pipelineReadyConditionBuilder_ == null) {
        pipelineReadyCondition_ = null;
        onChanged();
      } else {
        pipelineReadyCondition_ = null;
        pipelineReadyConditionBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Details around the Pipeline's overall status.
     * </pre>
     *
     * <code>.google.cloud.deploy.v1.PipelineReadyCondition pipeline_ready_condition = 1;</code>
     */
    public com.google.cloud.deploy.v1.PipelineReadyCondition.Builder
        getPipelineReadyConditionBuilder() {

      onChanged();
      return getPipelineReadyConditionFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Details around the Pipeline's overall status.
     * </pre>
     *
     * <code>.google.cloud.deploy.v1.PipelineReadyCondition pipeline_ready_condition = 1;</code>
     */
    public com.google.cloud.deploy.v1.PipelineReadyConditionOrBuilder
        getPipelineReadyConditionOrBuilder() {
      if (pipelineReadyConditionBuilder_ != null) {
        return pipelineReadyConditionBuilder_.getMessageOrBuilder();
      } else {
        return pipelineReadyCondition_ == null
            ? com.google.cloud.deploy.v1.PipelineReadyCondition.getDefaultInstance()
            : pipelineReadyCondition_;
      }
    }
    /**
     *
     *
     * <pre>
     * Details around the Pipeline's overall status.
     * </pre>
     *
     * <code>.google.cloud.deploy.v1.PipelineReadyCondition pipeline_ready_condition = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.deploy.v1.PipelineReadyCondition,
            com.google.cloud.deploy.v1.PipelineReadyCondition.Builder,
            com.google.cloud.deploy.v1.PipelineReadyConditionOrBuilder>
        getPipelineReadyConditionFieldBuilder() {
      if (pipelineReadyConditionBuilder_ == null) {
        pipelineReadyConditionBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.deploy.v1.PipelineReadyCondition,
                com.google.cloud.deploy.v1.PipelineReadyCondition.Builder,
                com.google.cloud.deploy.v1.PipelineReadyConditionOrBuilder>(
                getPipelineReadyCondition(), getParentForChildren(), isClean());
        pipelineReadyCondition_ = null;
      }
      return pipelineReadyConditionBuilder_;
    }

    private com.google.cloud.deploy.v1.TargetsPresentCondition targetsPresentCondition_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.deploy.v1.TargetsPresentCondition,
            com.google.cloud.deploy.v1.TargetsPresentCondition.Builder,
            com.google.cloud.deploy.v1.TargetsPresentConditionOrBuilder>
        targetsPresentConditionBuilder_;
    /**
     *
     *
     * <pre>
     * Detalis around targets enumerated in the pipeline.
     * </pre>
     *
     * <code>.google.cloud.deploy.v1.TargetsPresentCondition targets_present_condition = 3;</code>
     *
     * @return Whether the targetsPresentCondition field is set.
     */
    public boolean hasTargetsPresentCondition() {
      return targetsPresentConditionBuilder_ != null || targetsPresentCondition_ != null;
    }
    /**
     *
     *
     * <pre>
     * Detalis around targets enumerated in the pipeline.
     * </pre>
     *
     * <code>.google.cloud.deploy.v1.TargetsPresentCondition targets_present_condition = 3;</code>
     *
     * @return The targetsPresentCondition.
     */
    public com.google.cloud.deploy.v1.TargetsPresentCondition getTargetsPresentCondition() {
      if (targetsPresentConditionBuilder_ == null) {
        return targetsPresentCondition_ == null
            ? com.google.cloud.deploy.v1.TargetsPresentCondition.getDefaultInstance()
            : targetsPresentCondition_;
      } else {
        return targetsPresentConditionBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Detalis around targets enumerated in the pipeline.
     * </pre>
     *
     * <code>.google.cloud.deploy.v1.TargetsPresentCondition targets_present_condition = 3;</code>
     */
    public Builder setTargetsPresentCondition(
        com.google.cloud.deploy.v1.TargetsPresentCondition value) {
      if (targetsPresentConditionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        targetsPresentCondition_ = value;
        onChanged();
      } else {
        targetsPresentConditionBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Detalis around targets enumerated in the pipeline.
     * </pre>
     *
     * <code>.google.cloud.deploy.v1.TargetsPresentCondition targets_present_condition = 3;</code>
     */
    public Builder setTargetsPresentCondition(
        com.google.cloud.deploy.v1.TargetsPresentCondition.Builder builderForValue) {
      if (targetsPresentConditionBuilder_ == null) {
        targetsPresentCondition_ = builderForValue.build();
        onChanged();
      } else {
        targetsPresentConditionBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Detalis around targets enumerated in the pipeline.
     * </pre>
     *
     * <code>.google.cloud.deploy.v1.TargetsPresentCondition targets_present_condition = 3;</code>
     */
    public Builder mergeTargetsPresentCondition(
        com.google.cloud.deploy.v1.TargetsPresentCondition value) {
      if (targetsPresentConditionBuilder_ == null) {
        if (targetsPresentCondition_ != null) {
          targetsPresentCondition_ =
              com.google.cloud.deploy.v1.TargetsPresentCondition.newBuilder(
                      targetsPresentCondition_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          targetsPresentCondition_ = value;
        }
        onChanged();
      } else {
        targetsPresentConditionBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Detalis around targets enumerated in the pipeline.
     * </pre>
     *
     * <code>.google.cloud.deploy.v1.TargetsPresentCondition targets_present_condition = 3;</code>
     */
    public Builder clearTargetsPresentCondition() {
      if (targetsPresentConditionBuilder_ == null) {
        targetsPresentCondition_ = null;
        onChanged();
      } else {
        targetsPresentCondition_ = null;
        targetsPresentConditionBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Detalis around targets enumerated in the pipeline.
     * </pre>
     *
     * <code>.google.cloud.deploy.v1.TargetsPresentCondition targets_present_condition = 3;</code>
     */
    public com.google.cloud.deploy.v1.TargetsPresentCondition.Builder
        getTargetsPresentConditionBuilder() {

      onChanged();
      return getTargetsPresentConditionFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Detalis around targets enumerated in the pipeline.
     * </pre>
     *
     * <code>.google.cloud.deploy.v1.TargetsPresentCondition targets_present_condition = 3;</code>
     */
    public com.google.cloud.deploy.v1.TargetsPresentConditionOrBuilder
        getTargetsPresentConditionOrBuilder() {
      if (targetsPresentConditionBuilder_ != null) {
        return targetsPresentConditionBuilder_.getMessageOrBuilder();
      } else {
        return targetsPresentCondition_ == null
            ? com.google.cloud.deploy.v1.TargetsPresentCondition.getDefaultInstance()
            : targetsPresentCondition_;
      }
    }
    /**
     *
     *
     * <pre>
     * Detalis around targets enumerated in the pipeline.
     * </pre>
     *
     * <code>.google.cloud.deploy.v1.TargetsPresentCondition targets_present_condition = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.deploy.v1.TargetsPresentCondition,
            com.google.cloud.deploy.v1.TargetsPresentCondition.Builder,
            com.google.cloud.deploy.v1.TargetsPresentConditionOrBuilder>
        getTargetsPresentConditionFieldBuilder() {
      if (targetsPresentConditionBuilder_ == null) {
        targetsPresentConditionBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.deploy.v1.TargetsPresentCondition,
                com.google.cloud.deploy.v1.TargetsPresentCondition.Builder,
                com.google.cloud.deploy.v1.TargetsPresentConditionOrBuilder>(
                getTargetsPresentCondition(), getParentForChildren(), isClean());
        targetsPresentCondition_ = null;
      }
      return targetsPresentConditionBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.deploy.v1.PipelineCondition)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.deploy.v1.PipelineCondition)
  private static final com.google.cloud.deploy.v1.PipelineCondition DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.deploy.v1.PipelineCondition();
  }

  public static com.google.cloud.deploy.v1.PipelineCondition getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PipelineCondition> PARSER =
      new com.google.protobuf.AbstractParser<PipelineCondition>() {
        @java.lang.Override
        public PipelineCondition parsePartialFrom(
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

  public static com.google.protobuf.Parser<PipelineCondition> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PipelineCondition> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.deploy.v1.PipelineCondition getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
