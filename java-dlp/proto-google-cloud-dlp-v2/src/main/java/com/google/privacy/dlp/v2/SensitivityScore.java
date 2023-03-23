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
// source: google/privacy/dlp/v2/storage.proto

package com.google.privacy.dlp.v2;

/**
 *
 *
 * <pre>
 * Score is a summary of all elements in the data profile.
 * A higher number means more sensitive.
 * </pre>
 *
 * Protobuf type {@code google.privacy.dlp.v2.SensitivityScore}
 */
public final class SensitivityScore extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.privacy.dlp.v2.SensitivityScore)
    SensitivityScoreOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use SensitivityScore.newBuilder() to construct.
  private SensitivityScore(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SensitivityScore() {
    score_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new SensitivityScore();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.privacy.dlp.v2.DlpStorage
        .internal_static_google_privacy_dlp_v2_SensitivityScore_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.privacy.dlp.v2.DlpStorage
        .internal_static_google_privacy_dlp_v2_SensitivityScore_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.privacy.dlp.v2.SensitivityScore.class,
            com.google.privacy.dlp.v2.SensitivityScore.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * Various score levels for resources.
   * </pre>
   *
   * Protobuf enum {@code google.privacy.dlp.v2.SensitivityScore.SensitivityScoreLevel}
   */
  public enum SensitivityScoreLevel implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * Unused.
     * </pre>
     *
     * <code>SENSITIVITY_SCORE_UNSPECIFIED = 0;</code>
     */
    SENSITIVITY_SCORE_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * No sensitive information detected. Limited access.
     * </pre>
     *
     * <code>SENSITIVITY_LOW = 10;</code>
     */
    SENSITIVITY_LOW(10),
    /**
     *
     *
     * <pre>
     * Medium risk - PII, potentially sensitive data, or fields with free-text
     * data that are at higher risk of having intermittent sensitive data.
     * Consider limiting access.
     * </pre>
     *
     * <code>SENSITIVITY_MODERATE = 20;</code>
     */
    SENSITIVITY_MODERATE(20),
    /**
     *
     *
     * <pre>
     * High risk – SPII may be present. Exfiltration of data may lead to user
     * data loss. Re-identification of users may be possible. Consider limiting
     * usage and or removing SPII.
     * </pre>
     *
     * <code>SENSITIVITY_HIGH = 30;</code>
     */
    SENSITIVITY_HIGH(30),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * Unused.
     * </pre>
     *
     * <code>SENSITIVITY_SCORE_UNSPECIFIED = 0;</code>
     */
    public static final int SENSITIVITY_SCORE_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * No sensitive information detected. Limited access.
     * </pre>
     *
     * <code>SENSITIVITY_LOW = 10;</code>
     */
    public static final int SENSITIVITY_LOW_VALUE = 10;
    /**
     *
     *
     * <pre>
     * Medium risk - PII, potentially sensitive data, or fields with free-text
     * data that are at higher risk of having intermittent sensitive data.
     * Consider limiting access.
     * </pre>
     *
     * <code>SENSITIVITY_MODERATE = 20;</code>
     */
    public static final int SENSITIVITY_MODERATE_VALUE = 20;
    /**
     *
     *
     * <pre>
     * High risk – SPII may be present. Exfiltration of data may lead to user
     * data loss. Re-identification of users may be possible. Consider limiting
     * usage and or removing SPII.
     * </pre>
     *
     * <code>SENSITIVITY_HIGH = 30;</code>
     */
    public static final int SENSITIVITY_HIGH_VALUE = 30;

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
    public static SensitivityScoreLevel valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static SensitivityScoreLevel forNumber(int value) {
      switch (value) {
        case 0:
          return SENSITIVITY_SCORE_UNSPECIFIED;
        case 10:
          return SENSITIVITY_LOW;
        case 20:
          return SENSITIVITY_MODERATE;
        case 30:
          return SENSITIVITY_HIGH;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<SensitivityScoreLevel>
        internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<SensitivityScoreLevel>
        internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<SensitivityScoreLevel>() {
              public SensitivityScoreLevel findValueByNumber(int number) {
                return SensitivityScoreLevel.forNumber(number);
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
      return com.google.privacy.dlp.v2.SensitivityScore.getDescriptor().getEnumTypes().get(0);
    }

    private static final SensitivityScoreLevel[] VALUES = values();

    public static SensitivityScoreLevel valueOf(
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

    private SensitivityScoreLevel(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.privacy.dlp.v2.SensitivityScore.SensitivityScoreLevel)
  }

  public static final int SCORE_FIELD_NUMBER = 1;
  private int score_;
  /**
   *
   *
   * <pre>
   * The score applied to the resource.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.SensitivityScore.SensitivityScoreLevel score = 1;</code>
   *
   * @return The enum numeric value on the wire for score.
   */
  @java.lang.Override
  public int getScoreValue() {
    return score_;
  }
  /**
   *
   *
   * <pre>
   * The score applied to the resource.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.SensitivityScore.SensitivityScoreLevel score = 1;</code>
   *
   * @return The score.
   */
  @java.lang.Override
  public com.google.privacy.dlp.v2.SensitivityScore.SensitivityScoreLevel getScore() {
    @SuppressWarnings("deprecation")
    com.google.privacy.dlp.v2.SensitivityScore.SensitivityScoreLevel result =
        com.google.privacy.dlp.v2.SensitivityScore.SensitivityScoreLevel.valueOf(score_);
    return result == null
        ? com.google.privacy.dlp.v2.SensitivityScore.SensitivityScoreLevel.UNRECOGNIZED
        : result;
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
    if (score_
        != com.google.privacy.dlp.v2.SensitivityScore.SensitivityScoreLevel
            .SENSITIVITY_SCORE_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(1, score_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (score_
        != com.google.privacy.dlp.v2.SensitivityScore.SensitivityScoreLevel
            .SENSITIVITY_SCORE_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, score_);
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
    if (!(obj instanceof com.google.privacy.dlp.v2.SensitivityScore)) {
      return super.equals(obj);
    }
    com.google.privacy.dlp.v2.SensitivityScore other =
        (com.google.privacy.dlp.v2.SensitivityScore) obj;

    if (score_ != other.score_) return false;
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
    hash = (37 * hash) + SCORE_FIELD_NUMBER;
    hash = (53 * hash) + score_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.privacy.dlp.v2.SensitivityScore parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.privacy.dlp.v2.SensitivityScore parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.SensitivityScore parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.privacy.dlp.v2.SensitivityScore parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.SensitivityScore parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.privacy.dlp.v2.SensitivityScore parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.SensitivityScore parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.privacy.dlp.v2.SensitivityScore parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.SensitivityScore parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.privacy.dlp.v2.SensitivityScore parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.SensitivityScore parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.privacy.dlp.v2.SensitivityScore parseFrom(
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

  public static Builder newBuilder(com.google.privacy.dlp.v2.SensitivityScore prototype) {
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
   * Score is a summary of all elements in the data profile.
   * A higher number means more sensitive.
   * </pre>
   *
   * Protobuf type {@code google.privacy.dlp.v2.SensitivityScore}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.privacy.dlp.v2.SensitivityScore)
      com.google.privacy.dlp.v2.SensitivityScoreOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.privacy.dlp.v2.DlpStorage
          .internal_static_google_privacy_dlp_v2_SensitivityScore_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.privacy.dlp.v2.DlpStorage
          .internal_static_google_privacy_dlp_v2_SensitivityScore_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.privacy.dlp.v2.SensitivityScore.class,
              com.google.privacy.dlp.v2.SensitivityScore.Builder.class);
    }

    // Construct using com.google.privacy.dlp.v2.SensitivityScore.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      score_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.privacy.dlp.v2.DlpStorage
          .internal_static_google_privacy_dlp_v2_SensitivityScore_descriptor;
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.SensitivityScore getDefaultInstanceForType() {
      return com.google.privacy.dlp.v2.SensitivityScore.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.SensitivityScore build() {
      com.google.privacy.dlp.v2.SensitivityScore result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.SensitivityScore buildPartial() {
      com.google.privacy.dlp.v2.SensitivityScore result =
          new com.google.privacy.dlp.v2.SensitivityScore(this);
      result.score_ = score_;
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
      if (other instanceof com.google.privacy.dlp.v2.SensitivityScore) {
        return mergeFrom((com.google.privacy.dlp.v2.SensitivityScore) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.privacy.dlp.v2.SensitivityScore other) {
      if (other == com.google.privacy.dlp.v2.SensitivityScore.getDefaultInstance()) return this;
      if (other.score_ != 0) {
        setScoreValue(other.getScoreValue());
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
                score_ = input.readEnum();

                break;
              } // case 8
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

    private int score_ = 0;
    /**
     *
     *
     * <pre>
     * The score applied to the resource.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.SensitivityScore.SensitivityScoreLevel score = 1;</code>
     *
     * @return The enum numeric value on the wire for score.
     */
    @java.lang.Override
    public int getScoreValue() {
      return score_;
    }
    /**
     *
     *
     * <pre>
     * The score applied to the resource.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.SensitivityScore.SensitivityScoreLevel score = 1;</code>
     *
     * @param value The enum numeric value on the wire for score to set.
     * @return This builder for chaining.
     */
    public Builder setScoreValue(int value) {

      score_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The score applied to the resource.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.SensitivityScore.SensitivityScoreLevel score = 1;</code>
     *
     * @return The score.
     */
    @java.lang.Override
    public com.google.privacy.dlp.v2.SensitivityScore.SensitivityScoreLevel getScore() {
      @SuppressWarnings("deprecation")
      com.google.privacy.dlp.v2.SensitivityScore.SensitivityScoreLevel result =
          com.google.privacy.dlp.v2.SensitivityScore.SensitivityScoreLevel.valueOf(score_);
      return result == null
          ? com.google.privacy.dlp.v2.SensitivityScore.SensitivityScoreLevel.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * The score applied to the resource.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.SensitivityScore.SensitivityScoreLevel score = 1;</code>
     *
     * @param value The score to set.
     * @return This builder for chaining.
     */
    public Builder setScore(
        com.google.privacy.dlp.v2.SensitivityScore.SensitivityScoreLevel value) {
      if (value == null) {
        throw new NullPointerException();
      }

      score_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The score applied to the resource.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.SensitivityScore.SensitivityScoreLevel score = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearScore() {

      score_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.privacy.dlp.v2.SensitivityScore)
  }

  // @@protoc_insertion_point(class_scope:google.privacy.dlp.v2.SensitivityScore)
  private static final com.google.privacy.dlp.v2.SensitivityScore DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.privacy.dlp.v2.SensitivityScore();
  }

  public static com.google.privacy.dlp.v2.SensitivityScore getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SensitivityScore> PARSER =
      new com.google.protobuf.AbstractParser<SensitivityScore>() {
        @java.lang.Override
        public SensitivityScore parsePartialFrom(
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

  public static com.google.protobuf.Parser<SensitivityScore> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SensitivityScore> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.privacy.dlp.v2.SensitivityScore getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}