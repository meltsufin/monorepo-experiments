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
// source: google/cloud/aiplatform/v1/model_monitoring.proto

package com.google.cloud.aiplatform.v1;

/**
 *
 *
 * <pre>
 * The config for feature monitoring threshold.
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1.ThresholdConfig}
 */
public final class ThresholdConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1.ThresholdConfig)
    ThresholdConfigOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ThresholdConfig.newBuilder() to construct.
  private ThresholdConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ThresholdConfig() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ThresholdConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1.ModelMonitoringProto
        .internal_static_google_cloud_aiplatform_v1_ThresholdConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1.ModelMonitoringProto
        .internal_static_google_cloud_aiplatform_v1_ThresholdConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1.ThresholdConfig.class,
            com.google.cloud.aiplatform.v1.ThresholdConfig.Builder.class);
  }

  private int thresholdCase_ = 0;
  private java.lang.Object threshold_;

  public enum ThresholdCase
      implements
          com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    VALUE(1),
    THRESHOLD_NOT_SET(0);
    private final int value;

    private ThresholdCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ThresholdCase valueOf(int value) {
      return forNumber(value);
    }

    public static ThresholdCase forNumber(int value) {
      switch (value) {
        case 1:
          return VALUE;
        case 0:
          return THRESHOLD_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public ThresholdCase getThresholdCase() {
    return ThresholdCase.forNumber(thresholdCase_);
  }

  public static final int VALUE_FIELD_NUMBER = 1;
  /**
   *
   *
   * <pre>
   * Specify a threshold value that can trigger the alert.
   * If this threshold config is for feature distribution distance:
   *   1. For categorical feature, the distribution distance is calculated by
   *      L-inifinity norm.
   *   2. For numerical feature, the distribution distance is calculated by
   *      Jensen–Shannon divergence.
   * Each feature must have a non-zero threshold if they need to be monitored.
   * Otherwise no alert will be triggered for that feature.
   * </pre>
   *
   * <code>double value = 1;</code>
   *
   * @return Whether the value field is set.
   */
  @java.lang.Override
  public boolean hasValue() {
    return thresholdCase_ == 1;
  }
  /**
   *
   *
   * <pre>
   * Specify a threshold value that can trigger the alert.
   * If this threshold config is for feature distribution distance:
   *   1. For categorical feature, the distribution distance is calculated by
   *      L-inifinity norm.
   *   2. For numerical feature, the distribution distance is calculated by
   *      Jensen–Shannon divergence.
   * Each feature must have a non-zero threshold if they need to be monitored.
   * Otherwise no alert will be triggered for that feature.
   * </pre>
   *
   * <code>double value = 1;</code>
   *
   * @return The value.
   */
  @java.lang.Override
  public double getValue() {
    if (thresholdCase_ == 1) {
      return (java.lang.Double) threshold_;
    }
    return 0D;
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
    if (thresholdCase_ == 1) {
      output.writeDouble(1, (double) ((java.lang.Double) threshold_));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (thresholdCase_ == 1) {
      size +=
          com.google.protobuf.CodedOutputStream.computeDoubleSize(
              1, (double) ((java.lang.Double) threshold_));
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1.ThresholdConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1.ThresholdConfig other =
        (com.google.cloud.aiplatform.v1.ThresholdConfig) obj;

    if (!getThresholdCase().equals(other.getThresholdCase())) return false;
    switch (thresholdCase_) {
      case 1:
        if (java.lang.Double.doubleToLongBits(getValue())
            != java.lang.Double.doubleToLongBits(other.getValue())) return false;
        break;
      case 0:
      default:
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
    switch (thresholdCase_) {
      case 1:
        hash = (37 * hash) + VALUE_FIELD_NUMBER;
        hash =
            (53 * hash)
                + com.google.protobuf.Internal.hashLong(
                    java.lang.Double.doubleToLongBits(getValue()));
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1.ThresholdConfig parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.ThresholdConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.ThresholdConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.ThresholdConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.ThresholdConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.ThresholdConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.ThresholdConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.ThresholdConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.ThresholdConfig parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.ThresholdConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.ThresholdConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.ThresholdConfig parseFrom(
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

  public static Builder newBuilder(com.google.cloud.aiplatform.v1.ThresholdConfig prototype) {
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
   * The config for feature monitoring threshold.
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1.ThresholdConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1.ThresholdConfig)
      com.google.cloud.aiplatform.v1.ThresholdConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1.ModelMonitoringProto
          .internal_static_google_cloud_aiplatform_v1_ThresholdConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1.ModelMonitoringProto
          .internal_static_google_cloud_aiplatform_v1_ThresholdConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1.ThresholdConfig.class,
              com.google.cloud.aiplatform.v1.ThresholdConfig.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1.ThresholdConfig.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      thresholdCase_ = 0;
      threshold_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1.ModelMonitoringProto
          .internal_static_google_cloud_aiplatform_v1_ThresholdConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.ThresholdConfig getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1.ThresholdConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.ThresholdConfig build() {
      com.google.cloud.aiplatform.v1.ThresholdConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.ThresholdConfig buildPartial() {
      com.google.cloud.aiplatform.v1.ThresholdConfig result =
          new com.google.cloud.aiplatform.v1.ThresholdConfig(this);
      if (thresholdCase_ == 1) {
        result.threshold_ = threshold_;
      }
      result.thresholdCase_ = thresholdCase_;
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
      if (other instanceof com.google.cloud.aiplatform.v1.ThresholdConfig) {
        return mergeFrom((com.google.cloud.aiplatform.v1.ThresholdConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1.ThresholdConfig other) {
      if (other == com.google.cloud.aiplatform.v1.ThresholdConfig.getDefaultInstance()) return this;
      switch (other.getThresholdCase()) {
        case VALUE:
          {
            setValue(other.getValue());
            break;
          }
        case THRESHOLD_NOT_SET:
          {
            break;
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
            case 9:
              {
                threshold_ = input.readDouble();
                thresholdCase_ = 1;
                break;
              } // case 9
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

    private int thresholdCase_ = 0;
    private java.lang.Object threshold_;

    public ThresholdCase getThresholdCase() {
      return ThresholdCase.forNumber(thresholdCase_);
    }

    public Builder clearThreshold() {
      thresholdCase_ = 0;
      threshold_ = null;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Specify a threshold value that can trigger the alert.
     * If this threshold config is for feature distribution distance:
     *   1. For categorical feature, the distribution distance is calculated by
     *      L-inifinity norm.
     *   2. For numerical feature, the distribution distance is calculated by
     *      Jensen–Shannon divergence.
     * Each feature must have a non-zero threshold if they need to be monitored.
     * Otherwise no alert will be triggered for that feature.
     * </pre>
     *
     * <code>double value = 1;</code>
     *
     * @return Whether the value field is set.
     */
    public boolean hasValue() {
      return thresholdCase_ == 1;
    }
    /**
     *
     *
     * <pre>
     * Specify a threshold value that can trigger the alert.
     * If this threshold config is for feature distribution distance:
     *   1. For categorical feature, the distribution distance is calculated by
     *      L-inifinity norm.
     *   2. For numerical feature, the distribution distance is calculated by
     *      Jensen–Shannon divergence.
     * Each feature must have a non-zero threshold if they need to be monitored.
     * Otherwise no alert will be triggered for that feature.
     * </pre>
     *
     * <code>double value = 1;</code>
     *
     * @return The value.
     */
    public double getValue() {
      if (thresholdCase_ == 1) {
        return (java.lang.Double) threshold_;
      }
      return 0D;
    }
    /**
     *
     *
     * <pre>
     * Specify a threshold value that can trigger the alert.
     * If this threshold config is for feature distribution distance:
     *   1. For categorical feature, the distribution distance is calculated by
     *      L-inifinity norm.
     *   2. For numerical feature, the distribution distance is calculated by
     *      Jensen–Shannon divergence.
     * Each feature must have a non-zero threshold if they need to be monitored.
     * Otherwise no alert will be triggered for that feature.
     * </pre>
     *
     * <code>double value = 1;</code>
     *
     * @param value The value to set.
     * @return This builder for chaining.
     */
    public Builder setValue(double value) {
      thresholdCase_ = 1;
      threshold_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Specify a threshold value that can trigger the alert.
     * If this threshold config is for feature distribution distance:
     *   1. For categorical feature, the distribution distance is calculated by
     *      L-inifinity norm.
     *   2. For numerical feature, the distribution distance is calculated by
     *      Jensen–Shannon divergence.
     * Each feature must have a non-zero threshold if they need to be monitored.
     * Otherwise no alert will be triggered for that feature.
     * </pre>
     *
     * <code>double value = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearValue() {
      if (thresholdCase_ == 1) {
        thresholdCase_ = 0;
        threshold_ = null;
        onChanged();
      }
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

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1.ThresholdConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1.ThresholdConfig)
  private static final com.google.cloud.aiplatform.v1.ThresholdConfig DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1.ThresholdConfig();
  }

  public static com.google.cloud.aiplatform.v1.ThresholdConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ThresholdConfig> PARSER =
      new com.google.protobuf.AbstractParser<ThresholdConfig>() {
        @java.lang.Override
        public ThresholdConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<ThresholdConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ThresholdConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1.ThresholdConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
