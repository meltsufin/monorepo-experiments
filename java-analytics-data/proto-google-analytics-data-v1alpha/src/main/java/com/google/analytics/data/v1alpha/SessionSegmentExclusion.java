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
// source: google/analytics/data/v1alpha/data.proto

package com.google.analytics.data.v1alpha;

/**
 *
 *
 * <pre>
 * Specifies which sessions are excluded in this segment.
 * </pre>
 *
 * Protobuf type {@code google.analytics.data.v1alpha.SessionSegmentExclusion}
 */
public final class SessionSegmentExclusion extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.analytics.data.v1alpha.SessionSegmentExclusion)
    SessionSegmentExclusionOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use SessionSegmentExclusion.newBuilder() to construct.
  private SessionSegmentExclusion(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SessionSegmentExclusion() {
    sessionExclusionDuration_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new SessionSegmentExclusion();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.analytics.data.v1alpha.ReportingApiProto
        .internal_static_google_analytics_data_v1alpha_SessionSegmentExclusion_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.analytics.data.v1alpha.ReportingApiProto
        .internal_static_google_analytics_data_v1alpha_SessionSegmentExclusion_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.analytics.data.v1alpha.SessionSegmentExclusion.class,
            com.google.analytics.data.v1alpha.SessionSegmentExclusion.Builder.class);
  }

  public static final int SESSION_EXCLUSION_DURATION_FIELD_NUMBER = 1;
  private int sessionExclusionDuration_;
  /**
   *
   *
   * <pre>
   * Specifies how long an exclusion will last if a session matches the
   * `sessionExclusionCriteria`.
   * Optional. If unspecified, a `sessionExclusionDuration` of
   * `SESSION_EXCLUSION_TEMPORARY` is used.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.SessionExclusionDuration session_exclusion_duration = 1;
   * </code>
   *
   * @return The enum numeric value on the wire for sessionExclusionDuration.
   */
  @java.lang.Override
  public int getSessionExclusionDurationValue() {
    return sessionExclusionDuration_;
  }
  /**
   *
   *
   * <pre>
   * Specifies how long an exclusion will last if a session matches the
   * `sessionExclusionCriteria`.
   * Optional. If unspecified, a `sessionExclusionDuration` of
   * `SESSION_EXCLUSION_TEMPORARY` is used.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.SessionExclusionDuration session_exclusion_duration = 1;
   * </code>
   *
   * @return The sessionExclusionDuration.
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.SessionExclusionDuration getSessionExclusionDuration() {
    @SuppressWarnings("deprecation")
    com.google.analytics.data.v1alpha.SessionExclusionDuration result =
        com.google.analytics.data.v1alpha.SessionExclusionDuration.valueOf(
            sessionExclusionDuration_);
    return result == null
        ? com.google.analytics.data.v1alpha.SessionExclusionDuration.UNRECOGNIZED
        : result;
  }

  public static final int SESSION_EXCLUSION_CRITERIA_FIELD_NUMBER = 2;
  private com.google.analytics.data.v1alpha.SessionSegmentCriteria sessionExclusionCriteria_;
  /**
   *
   *
   * <pre>
   * If a session meets this condition, the session is excluded from
   * membership in the segment for the `sessionExclusionDuration`.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.SessionSegmentCriteria session_exclusion_criteria = 2;
   * </code>
   *
   * @return Whether the sessionExclusionCriteria field is set.
   */
  @java.lang.Override
  public boolean hasSessionExclusionCriteria() {
    return sessionExclusionCriteria_ != null;
  }
  /**
   *
   *
   * <pre>
   * If a session meets this condition, the session is excluded from
   * membership in the segment for the `sessionExclusionDuration`.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.SessionSegmentCriteria session_exclusion_criteria = 2;
   * </code>
   *
   * @return The sessionExclusionCriteria.
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.SessionSegmentCriteria getSessionExclusionCriteria() {
    return sessionExclusionCriteria_ == null
        ? com.google.analytics.data.v1alpha.SessionSegmentCriteria.getDefaultInstance()
        : sessionExclusionCriteria_;
  }
  /**
   *
   *
   * <pre>
   * If a session meets this condition, the session is excluded from
   * membership in the segment for the `sessionExclusionDuration`.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.SessionSegmentCriteria session_exclusion_criteria = 2;
   * </code>
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.SessionSegmentCriteriaOrBuilder
      getSessionExclusionCriteriaOrBuilder() {
    return getSessionExclusionCriteria();
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
    if (sessionExclusionDuration_
        != com.google.analytics.data.v1alpha.SessionExclusionDuration
            .SESSION_EXCLUSION_DURATION_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(1, sessionExclusionDuration_);
    }
    if (sessionExclusionCriteria_ != null) {
      output.writeMessage(2, getSessionExclusionCriteria());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (sessionExclusionDuration_
        != com.google.analytics.data.v1alpha.SessionExclusionDuration
            .SESSION_EXCLUSION_DURATION_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, sessionExclusionDuration_);
    }
    if (sessionExclusionCriteria_ != null) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              2, getSessionExclusionCriteria());
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
    if (!(obj instanceof com.google.analytics.data.v1alpha.SessionSegmentExclusion)) {
      return super.equals(obj);
    }
    com.google.analytics.data.v1alpha.SessionSegmentExclusion other =
        (com.google.analytics.data.v1alpha.SessionSegmentExclusion) obj;

    if (sessionExclusionDuration_ != other.sessionExclusionDuration_) return false;
    if (hasSessionExclusionCriteria() != other.hasSessionExclusionCriteria()) return false;
    if (hasSessionExclusionCriteria()) {
      if (!getSessionExclusionCriteria().equals(other.getSessionExclusionCriteria())) return false;
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
    hash = (37 * hash) + SESSION_EXCLUSION_DURATION_FIELD_NUMBER;
    hash = (53 * hash) + sessionExclusionDuration_;
    if (hasSessionExclusionCriteria()) {
      hash = (37 * hash) + SESSION_EXCLUSION_CRITERIA_FIELD_NUMBER;
      hash = (53 * hash) + getSessionExclusionCriteria().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.analytics.data.v1alpha.SessionSegmentExclusion parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1alpha.SessionSegmentExclusion parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.SessionSegmentExclusion parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1alpha.SessionSegmentExclusion parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.SessionSegmentExclusion parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1alpha.SessionSegmentExclusion parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.SessionSegmentExclusion parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1alpha.SessionSegmentExclusion parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.SessionSegmentExclusion parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1alpha.SessionSegmentExclusion parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.SessionSegmentExclusion parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1alpha.SessionSegmentExclusion parseFrom(
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
      com.google.analytics.data.v1alpha.SessionSegmentExclusion prototype) {
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
   * Specifies which sessions are excluded in this segment.
   * </pre>
   *
   * Protobuf type {@code google.analytics.data.v1alpha.SessionSegmentExclusion}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.analytics.data.v1alpha.SessionSegmentExclusion)
      com.google.analytics.data.v1alpha.SessionSegmentExclusionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.analytics.data.v1alpha.ReportingApiProto
          .internal_static_google_analytics_data_v1alpha_SessionSegmentExclusion_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.analytics.data.v1alpha.ReportingApiProto
          .internal_static_google_analytics_data_v1alpha_SessionSegmentExclusion_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.analytics.data.v1alpha.SessionSegmentExclusion.class,
              com.google.analytics.data.v1alpha.SessionSegmentExclusion.Builder.class);
    }

    // Construct using com.google.analytics.data.v1alpha.SessionSegmentExclusion.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      sessionExclusionDuration_ = 0;

      if (sessionExclusionCriteriaBuilder_ == null) {
        sessionExclusionCriteria_ = null;
      } else {
        sessionExclusionCriteria_ = null;
        sessionExclusionCriteriaBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.analytics.data.v1alpha.ReportingApiProto
          .internal_static_google_analytics_data_v1alpha_SessionSegmentExclusion_descriptor;
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.SessionSegmentExclusion getDefaultInstanceForType() {
      return com.google.analytics.data.v1alpha.SessionSegmentExclusion.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.SessionSegmentExclusion build() {
      com.google.analytics.data.v1alpha.SessionSegmentExclusion result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.SessionSegmentExclusion buildPartial() {
      com.google.analytics.data.v1alpha.SessionSegmentExclusion result =
          new com.google.analytics.data.v1alpha.SessionSegmentExclusion(this);
      result.sessionExclusionDuration_ = sessionExclusionDuration_;
      if (sessionExclusionCriteriaBuilder_ == null) {
        result.sessionExclusionCriteria_ = sessionExclusionCriteria_;
      } else {
        result.sessionExclusionCriteria_ = sessionExclusionCriteriaBuilder_.build();
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
      if (other instanceof com.google.analytics.data.v1alpha.SessionSegmentExclusion) {
        return mergeFrom((com.google.analytics.data.v1alpha.SessionSegmentExclusion) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.analytics.data.v1alpha.SessionSegmentExclusion other) {
      if (other == com.google.analytics.data.v1alpha.SessionSegmentExclusion.getDefaultInstance())
        return this;
      if (other.sessionExclusionDuration_ != 0) {
        setSessionExclusionDurationValue(other.getSessionExclusionDurationValue());
      }
      if (other.hasSessionExclusionCriteria()) {
        mergeSessionExclusionCriteria(other.getSessionExclusionCriteria());
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
                sessionExclusionDuration_ = input.readEnum();

                break;
              } // case 8
            case 18:
              {
                input.readMessage(
                    getSessionExclusionCriteriaFieldBuilder().getBuilder(), extensionRegistry);

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

    private int sessionExclusionDuration_ = 0;
    /**
     *
     *
     * <pre>
     * Specifies how long an exclusion will last if a session matches the
     * `sessionExclusionCriteria`.
     * Optional. If unspecified, a `sessionExclusionDuration` of
     * `SESSION_EXCLUSION_TEMPORARY` is used.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.SessionExclusionDuration session_exclusion_duration = 1;
     * </code>
     *
     * @return The enum numeric value on the wire for sessionExclusionDuration.
     */
    @java.lang.Override
    public int getSessionExclusionDurationValue() {
      return sessionExclusionDuration_;
    }
    /**
     *
     *
     * <pre>
     * Specifies how long an exclusion will last if a session matches the
     * `sessionExclusionCriteria`.
     * Optional. If unspecified, a `sessionExclusionDuration` of
     * `SESSION_EXCLUSION_TEMPORARY` is used.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.SessionExclusionDuration session_exclusion_duration = 1;
     * </code>
     *
     * @param value The enum numeric value on the wire for sessionExclusionDuration to set.
     * @return This builder for chaining.
     */
    public Builder setSessionExclusionDurationValue(int value) {

      sessionExclusionDuration_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Specifies how long an exclusion will last if a session matches the
     * `sessionExclusionCriteria`.
     * Optional. If unspecified, a `sessionExclusionDuration` of
     * `SESSION_EXCLUSION_TEMPORARY` is used.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.SessionExclusionDuration session_exclusion_duration = 1;
     * </code>
     *
     * @return The sessionExclusionDuration.
     */
    @java.lang.Override
    public com.google.analytics.data.v1alpha.SessionExclusionDuration
        getSessionExclusionDuration() {
      @SuppressWarnings("deprecation")
      com.google.analytics.data.v1alpha.SessionExclusionDuration result =
          com.google.analytics.data.v1alpha.SessionExclusionDuration.valueOf(
              sessionExclusionDuration_);
      return result == null
          ? com.google.analytics.data.v1alpha.SessionExclusionDuration.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * Specifies how long an exclusion will last if a session matches the
     * `sessionExclusionCriteria`.
     * Optional. If unspecified, a `sessionExclusionDuration` of
     * `SESSION_EXCLUSION_TEMPORARY` is used.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.SessionExclusionDuration session_exclusion_duration = 1;
     * </code>
     *
     * @param value The sessionExclusionDuration to set.
     * @return This builder for chaining.
     */
    public Builder setSessionExclusionDuration(
        com.google.analytics.data.v1alpha.SessionExclusionDuration value) {
      if (value == null) {
        throw new NullPointerException();
      }

      sessionExclusionDuration_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Specifies how long an exclusion will last if a session matches the
     * `sessionExclusionCriteria`.
     * Optional. If unspecified, a `sessionExclusionDuration` of
     * `SESSION_EXCLUSION_TEMPORARY` is used.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.SessionExclusionDuration session_exclusion_duration = 1;
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSessionExclusionDuration() {

      sessionExclusionDuration_ = 0;
      onChanged();
      return this;
    }

    private com.google.analytics.data.v1alpha.SessionSegmentCriteria sessionExclusionCriteria_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.data.v1alpha.SessionSegmentCriteria,
            com.google.analytics.data.v1alpha.SessionSegmentCriteria.Builder,
            com.google.analytics.data.v1alpha.SessionSegmentCriteriaOrBuilder>
        sessionExclusionCriteriaBuilder_;
    /**
     *
     *
     * <pre>
     * If a session meets this condition, the session is excluded from
     * membership in the segment for the `sessionExclusionDuration`.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.SessionSegmentCriteria session_exclusion_criteria = 2;
     * </code>
     *
     * @return Whether the sessionExclusionCriteria field is set.
     */
    public boolean hasSessionExclusionCriteria() {
      return sessionExclusionCriteriaBuilder_ != null || sessionExclusionCriteria_ != null;
    }
    /**
     *
     *
     * <pre>
     * If a session meets this condition, the session is excluded from
     * membership in the segment for the `sessionExclusionDuration`.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.SessionSegmentCriteria session_exclusion_criteria = 2;
     * </code>
     *
     * @return The sessionExclusionCriteria.
     */
    public com.google.analytics.data.v1alpha.SessionSegmentCriteria getSessionExclusionCriteria() {
      if (sessionExclusionCriteriaBuilder_ == null) {
        return sessionExclusionCriteria_ == null
            ? com.google.analytics.data.v1alpha.SessionSegmentCriteria.getDefaultInstance()
            : sessionExclusionCriteria_;
      } else {
        return sessionExclusionCriteriaBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * If a session meets this condition, the session is excluded from
     * membership in the segment for the `sessionExclusionDuration`.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.SessionSegmentCriteria session_exclusion_criteria = 2;
     * </code>
     */
    public Builder setSessionExclusionCriteria(
        com.google.analytics.data.v1alpha.SessionSegmentCriteria value) {
      if (sessionExclusionCriteriaBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        sessionExclusionCriteria_ = value;
        onChanged();
      } else {
        sessionExclusionCriteriaBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * If a session meets this condition, the session is excluded from
     * membership in the segment for the `sessionExclusionDuration`.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.SessionSegmentCriteria session_exclusion_criteria = 2;
     * </code>
     */
    public Builder setSessionExclusionCriteria(
        com.google.analytics.data.v1alpha.SessionSegmentCriteria.Builder builderForValue) {
      if (sessionExclusionCriteriaBuilder_ == null) {
        sessionExclusionCriteria_ = builderForValue.build();
        onChanged();
      } else {
        sessionExclusionCriteriaBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * If a session meets this condition, the session is excluded from
     * membership in the segment for the `sessionExclusionDuration`.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.SessionSegmentCriteria session_exclusion_criteria = 2;
     * </code>
     */
    public Builder mergeSessionExclusionCriteria(
        com.google.analytics.data.v1alpha.SessionSegmentCriteria value) {
      if (sessionExclusionCriteriaBuilder_ == null) {
        if (sessionExclusionCriteria_ != null) {
          sessionExclusionCriteria_ =
              com.google.analytics.data.v1alpha.SessionSegmentCriteria.newBuilder(
                      sessionExclusionCriteria_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          sessionExclusionCriteria_ = value;
        }
        onChanged();
      } else {
        sessionExclusionCriteriaBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * If a session meets this condition, the session is excluded from
     * membership in the segment for the `sessionExclusionDuration`.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.SessionSegmentCriteria session_exclusion_criteria = 2;
     * </code>
     */
    public Builder clearSessionExclusionCriteria() {
      if (sessionExclusionCriteriaBuilder_ == null) {
        sessionExclusionCriteria_ = null;
        onChanged();
      } else {
        sessionExclusionCriteria_ = null;
        sessionExclusionCriteriaBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * If a session meets this condition, the session is excluded from
     * membership in the segment for the `sessionExclusionDuration`.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.SessionSegmentCriteria session_exclusion_criteria = 2;
     * </code>
     */
    public com.google.analytics.data.v1alpha.SessionSegmentCriteria.Builder
        getSessionExclusionCriteriaBuilder() {

      onChanged();
      return getSessionExclusionCriteriaFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * If a session meets this condition, the session is excluded from
     * membership in the segment for the `sessionExclusionDuration`.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.SessionSegmentCriteria session_exclusion_criteria = 2;
     * </code>
     */
    public com.google.analytics.data.v1alpha.SessionSegmentCriteriaOrBuilder
        getSessionExclusionCriteriaOrBuilder() {
      if (sessionExclusionCriteriaBuilder_ != null) {
        return sessionExclusionCriteriaBuilder_.getMessageOrBuilder();
      } else {
        return sessionExclusionCriteria_ == null
            ? com.google.analytics.data.v1alpha.SessionSegmentCriteria.getDefaultInstance()
            : sessionExclusionCriteria_;
      }
    }
    /**
     *
     *
     * <pre>
     * If a session meets this condition, the session is excluded from
     * membership in the segment for the `sessionExclusionDuration`.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.SessionSegmentCriteria session_exclusion_criteria = 2;
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.data.v1alpha.SessionSegmentCriteria,
            com.google.analytics.data.v1alpha.SessionSegmentCriteria.Builder,
            com.google.analytics.data.v1alpha.SessionSegmentCriteriaOrBuilder>
        getSessionExclusionCriteriaFieldBuilder() {
      if (sessionExclusionCriteriaBuilder_ == null) {
        sessionExclusionCriteriaBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.analytics.data.v1alpha.SessionSegmentCriteria,
                com.google.analytics.data.v1alpha.SessionSegmentCriteria.Builder,
                com.google.analytics.data.v1alpha.SessionSegmentCriteriaOrBuilder>(
                getSessionExclusionCriteria(), getParentForChildren(), isClean());
        sessionExclusionCriteria_ = null;
      }
      return sessionExclusionCriteriaBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.analytics.data.v1alpha.SessionSegmentExclusion)
  }

  // @@protoc_insertion_point(class_scope:google.analytics.data.v1alpha.SessionSegmentExclusion)
  private static final com.google.analytics.data.v1alpha.SessionSegmentExclusion DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.analytics.data.v1alpha.SessionSegmentExclusion();
  }

  public static com.google.analytics.data.v1alpha.SessionSegmentExclusion getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SessionSegmentExclusion> PARSER =
      new com.google.protobuf.AbstractParser<SessionSegmentExclusion>() {
        @java.lang.Override
        public SessionSegmentExclusion parsePartialFrom(
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

  public static com.google.protobuf.Parser<SessionSegmentExclusion> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SessionSegmentExclusion> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.analytics.data.v1alpha.SessionSegmentExclusion getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}