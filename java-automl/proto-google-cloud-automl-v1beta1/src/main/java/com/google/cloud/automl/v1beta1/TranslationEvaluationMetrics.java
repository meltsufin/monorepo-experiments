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
// source: google/cloud/automl/v1beta1/translation.proto

package com.google.cloud.automl.v1beta1;

/**
 *
 *
 * <pre>
 * Evaluation metrics for the dataset.
 * </pre>
 *
 * Protobuf type {@code google.cloud.automl.v1beta1.TranslationEvaluationMetrics}
 */
public final class TranslationEvaluationMetrics extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.automl.v1beta1.TranslationEvaluationMetrics)
    TranslationEvaluationMetricsOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use TranslationEvaluationMetrics.newBuilder() to construct.
  private TranslationEvaluationMetrics(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private TranslationEvaluationMetrics() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new TranslationEvaluationMetrics();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.automl.v1beta1.TranslationProto
        .internal_static_google_cloud_automl_v1beta1_TranslationEvaluationMetrics_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.automl.v1beta1.TranslationProto
        .internal_static_google_cloud_automl_v1beta1_TranslationEvaluationMetrics_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.automl.v1beta1.TranslationEvaluationMetrics.class,
            com.google.cloud.automl.v1beta1.TranslationEvaluationMetrics.Builder.class);
  }

  public static final int BLEU_SCORE_FIELD_NUMBER = 1;
  private double bleuScore_;
  /**
   *
   *
   * <pre>
   * Output only. BLEU score.
   * </pre>
   *
   * <code>double bleu_score = 1;</code>
   *
   * @return The bleuScore.
   */
  @java.lang.Override
  public double getBleuScore() {
    return bleuScore_;
  }

  public static final int BASE_BLEU_SCORE_FIELD_NUMBER = 2;
  private double baseBleuScore_;
  /**
   *
   *
   * <pre>
   * Output only. BLEU score for base model.
   * </pre>
   *
   * <code>double base_bleu_score = 2;</code>
   *
   * @return The baseBleuScore.
   */
  @java.lang.Override
  public double getBaseBleuScore() {
    return baseBleuScore_;
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
    if (java.lang.Double.doubleToRawLongBits(bleuScore_) != 0) {
      output.writeDouble(1, bleuScore_);
    }
    if (java.lang.Double.doubleToRawLongBits(baseBleuScore_) != 0) {
      output.writeDouble(2, baseBleuScore_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (java.lang.Double.doubleToRawLongBits(bleuScore_) != 0) {
      size += com.google.protobuf.CodedOutputStream.computeDoubleSize(1, bleuScore_);
    }
    if (java.lang.Double.doubleToRawLongBits(baseBleuScore_) != 0) {
      size += com.google.protobuf.CodedOutputStream.computeDoubleSize(2, baseBleuScore_);
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
    if (!(obj instanceof com.google.cloud.automl.v1beta1.TranslationEvaluationMetrics)) {
      return super.equals(obj);
    }
    com.google.cloud.automl.v1beta1.TranslationEvaluationMetrics other =
        (com.google.cloud.automl.v1beta1.TranslationEvaluationMetrics) obj;

    if (java.lang.Double.doubleToLongBits(getBleuScore())
        != java.lang.Double.doubleToLongBits(other.getBleuScore())) return false;
    if (java.lang.Double.doubleToLongBits(getBaseBleuScore())
        != java.lang.Double.doubleToLongBits(other.getBaseBleuScore())) return false;
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
    hash = (37 * hash) + BLEU_SCORE_FIELD_NUMBER;
    hash =
        (53 * hash)
            + com.google.protobuf.Internal.hashLong(
                java.lang.Double.doubleToLongBits(getBleuScore()));
    hash = (37 * hash) + BASE_BLEU_SCORE_FIELD_NUMBER;
    hash =
        (53 * hash)
            + com.google.protobuf.Internal.hashLong(
                java.lang.Double.doubleToLongBits(getBaseBleuScore()));
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.automl.v1beta1.TranslationEvaluationMetrics parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.automl.v1beta1.TranslationEvaluationMetrics parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.automl.v1beta1.TranslationEvaluationMetrics parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.automl.v1beta1.TranslationEvaluationMetrics parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.automl.v1beta1.TranslationEvaluationMetrics parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.automl.v1beta1.TranslationEvaluationMetrics parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.automl.v1beta1.TranslationEvaluationMetrics parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.automl.v1beta1.TranslationEvaluationMetrics parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.automl.v1beta1.TranslationEvaluationMetrics parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.automl.v1beta1.TranslationEvaluationMetrics parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.automl.v1beta1.TranslationEvaluationMetrics parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.automl.v1beta1.TranslationEvaluationMetrics parseFrom(
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
      com.google.cloud.automl.v1beta1.TranslationEvaluationMetrics prototype) {
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
   * Evaluation metrics for the dataset.
   * </pre>
   *
   * Protobuf type {@code google.cloud.automl.v1beta1.TranslationEvaluationMetrics}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.automl.v1beta1.TranslationEvaluationMetrics)
      com.google.cloud.automl.v1beta1.TranslationEvaluationMetricsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.automl.v1beta1.TranslationProto
          .internal_static_google_cloud_automl_v1beta1_TranslationEvaluationMetrics_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.automl.v1beta1.TranslationProto
          .internal_static_google_cloud_automl_v1beta1_TranslationEvaluationMetrics_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.automl.v1beta1.TranslationEvaluationMetrics.class,
              com.google.cloud.automl.v1beta1.TranslationEvaluationMetrics.Builder.class);
    }

    // Construct using com.google.cloud.automl.v1beta1.TranslationEvaluationMetrics.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bleuScore_ = 0D;

      baseBleuScore_ = 0D;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.automl.v1beta1.TranslationProto
          .internal_static_google_cloud_automl_v1beta1_TranslationEvaluationMetrics_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.automl.v1beta1.TranslationEvaluationMetrics
        getDefaultInstanceForType() {
      return com.google.cloud.automl.v1beta1.TranslationEvaluationMetrics.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.automl.v1beta1.TranslationEvaluationMetrics build() {
      com.google.cloud.automl.v1beta1.TranslationEvaluationMetrics result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.automl.v1beta1.TranslationEvaluationMetrics buildPartial() {
      com.google.cloud.automl.v1beta1.TranslationEvaluationMetrics result =
          new com.google.cloud.automl.v1beta1.TranslationEvaluationMetrics(this);
      result.bleuScore_ = bleuScore_;
      result.baseBleuScore_ = baseBleuScore_;
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
      if (other instanceof com.google.cloud.automl.v1beta1.TranslationEvaluationMetrics) {
        return mergeFrom((com.google.cloud.automl.v1beta1.TranslationEvaluationMetrics) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.automl.v1beta1.TranslationEvaluationMetrics other) {
      if (other
          == com.google.cloud.automl.v1beta1.TranslationEvaluationMetrics.getDefaultInstance())
        return this;
      if (other.getBleuScore() != 0D) {
        setBleuScore(other.getBleuScore());
      }
      if (other.getBaseBleuScore() != 0D) {
        setBaseBleuScore(other.getBaseBleuScore());
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
                bleuScore_ = input.readDouble();

                break;
              } // case 9
            case 17:
              {
                baseBleuScore_ = input.readDouble();

                break;
              } // case 17
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

    private double bleuScore_;
    /**
     *
     *
     * <pre>
     * Output only. BLEU score.
     * </pre>
     *
     * <code>double bleu_score = 1;</code>
     *
     * @return The bleuScore.
     */
    @java.lang.Override
    public double getBleuScore() {
      return bleuScore_;
    }
    /**
     *
     *
     * <pre>
     * Output only. BLEU score.
     * </pre>
     *
     * <code>double bleu_score = 1;</code>
     *
     * @param value The bleuScore to set.
     * @return This builder for chaining.
     */
    public Builder setBleuScore(double value) {

      bleuScore_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. BLEU score.
     * </pre>
     *
     * <code>double bleu_score = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearBleuScore() {

      bleuScore_ = 0D;
      onChanged();
      return this;
    }

    private double baseBleuScore_;
    /**
     *
     *
     * <pre>
     * Output only. BLEU score for base model.
     * </pre>
     *
     * <code>double base_bleu_score = 2;</code>
     *
     * @return The baseBleuScore.
     */
    @java.lang.Override
    public double getBaseBleuScore() {
      return baseBleuScore_;
    }
    /**
     *
     *
     * <pre>
     * Output only. BLEU score for base model.
     * </pre>
     *
     * <code>double base_bleu_score = 2;</code>
     *
     * @param value The baseBleuScore to set.
     * @return This builder for chaining.
     */
    public Builder setBaseBleuScore(double value) {

      baseBleuScore_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. BLEU score for base model.
     * </pre>
     *
     * <code>double base_bleu_score = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearBaseBleuScore() {

      baseBleuScore_ = 0D;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.automl.v1beta1.TranslationEvaluationMetrics)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.automl.v1beta1.TranslationEvaluationMetrics)
  private static final com.google.cloud.automl.v1beta1.TranslationEvaluationMetrics
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.automl.v1beta1.TranslationEvaluationMetrics();
  }

  public static com.google.cloud.automl.v1beta1.TranslationEvaluationMetrics getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TranslationEvaluationMetrics> PARSER =
      new com.google.protobuf.AbstractParser<TranslationEvaluationMetrics>() {
        @java.lang.Override
        public TranslationEvaluationMetrics parsePartialFrom(
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

  public static com.google.protobuf.Parser<TranslationEvaluationMetrics> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TranslationEvaluationMetrics> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.automl.v1beta1.TranslationEvaluationMetrics getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}