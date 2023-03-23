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
// source: google/cloud/contactcenterinsights/v1/resources.proto

package com.google.cloud.contactcenterinsights.v1;

/**
 *
 *
 * <pre>
 * Issue Modeling result on a conversation.
 * </pre>
 *
 * Protobuf type {@code google.cloud.contactcenterinsights.v1.IssueModelResult}
 */
public final class IssueModelResult extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.contactcenterinsights.v1.IssueModelResult)
    IssueModelResultOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use IssueModelResult.newBuilder() to construct.
  private IssueModelResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private IssueModelResult() {
    issueModel_ = "";
    issues_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new IssueModelResult();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.contactcenterinsights.v1.ResourcesProto
        .internal_static_google_cloud_contactcenterinsights_v1_IssueModelResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.contactcenterinsights.v1.ResourcesProto
        .internal_static_google_cloud_contactcenterinsights_v1_IssueModelResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.contactcenterinsights.v1.IssueModelResult.class,
            com.google.cloud.contactcenterinsights.v1.IssueModelResult.Builder.class);
  }

  public static final int ISSUE_MODEL_FIELD_NUMBER = 1;
  private volatile java.lang.Object issueModel_;
  /**
   *
   *
   * <pre>
   * Issue model that generates the result.
   * Format: projects/{project}/locations/{location}/issueModels/{issue_model}
   * </pre>
   *
   * <code>string issue_model = 1 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The issueModel.
   */
  @java.lang.Override
  public java.lang.String getIssueModel() {
    java.lang.Object ref = issueModel_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      issueModel_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Issue model that generates the result.
   * Format: projects/{project}/locations/{location}/issueModels/{issue_model}
   * </pre>
   *
   * <code>string issue_model = 1 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for issueModel.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getIssueModelBytes() {
    java.lang.Object ref = issueModel_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      issueModel_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ISSUES_FIELD_NUMBER = 2;
  private java.util.List<com.google.cloud.contactcenterinsights.v1.IssueAssignment> issues_;
  /**
   *
   *
   * <pre>
   * All the matched issues.
   * </pre>
   *
   * <code>repeated .google.cloud.contactcenterinsights.v1.IssueAssignment issues = 2;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.contactcenterinsights.v1.IssueAssignment> getIssuesList() {
    return issues_;
  }
  /**
   *
   *
   * <pre>
   * All the matched issues.
   * </pre>
   *
   * <code>repeated .google.cloud.contactcenterinsights.v1.IssueAssignment issues = 2;</code>
   */
  @java.lang.Override
  public java.util.List<
          ? extends com.google.cloud.contactcenterinsights.v1.IssueAssignmentOrBuilder>
      getIssuesOrBuilderList() {
    return issues_;
  }
  /**
   *
   *
   * <pre>
   * All the matched issues.
   * </pre>
   *
   * <code>repeated .google.cloud.contactcenterinsights.v1.IssueAssignment issues = 2;</code>
   */
  @java.lang.Override
  public int getIssuesCount() {
    return issues_.size();
  }
  /**
   *
   *
   * <pre>
   * All the matched issues.
   * </pre>
   *
   * <code>repeated .google.cloud.contactcenterinsights.v1.IssueAssignment issues = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.contactcenterinsights.v1.IssueAssignment getIssues(int index) {
    return issues_.get(index);
  }
  /**
   *
   *
   * <pre>
   * All the matched issues.
   * </pre>
   *
   * <code>repeated .google.cloud.contactcenterinsights.v1.IssueAssignment issues = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.contactcenterinsights.v1.IssueAssignmentOrBuilder getIssuesOrBuilder(
      int index) {
    return issues_.get(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(issueModel_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, issueModel_);
    }
    for (int i = 0; i < issues_.size(); i++) {
      output.writeMessage(2, issues_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(issueModel_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, issueModel_);
    }
    for (int i = 0; i < issues_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, issues_.get(i));
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
    if (!(obj instanceof com.google.cloud.contactcenterinsights.v1.IssueModelResult)) {
      return super.equals(obj);
    }
    com.google.cloud.contactcenterinsights.v1.IssueModelResult other =
        (com.google.cloud.contactcenterinsights.v1.IssueModelResult) obj;

    if (!getIssueModel().equals(other.getIssueModel())) return false;
    if (!getIssuesList().equals(other.getIssuesList())) return false;
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
    hash = (37 * hash) + ISSUE_MODEL_FIELD_NUMBER;
    hash = (53 * hash) + getIssueModel().hashCode();
    if (getIssuesCount() > 0) {
      hash = (37 * hash) + ISSUES_FIELD_NUMBER;
      hash = (53 * hash) + getIssuesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.contactcenterinsights.v1.IssueModelResult parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.contactcenterinsights.v1.IssueModelResult parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.contactcenterinsights.v1.IssueModelResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.contactcenterinsights.v1.IssueModelResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.contactcenterinsights.v1.IssueModelResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.contactcenterinsights.v1.IssueModelResult parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.contactcenterinsights.v1.IssueModelResult parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.contactcenterinsights.v1.IssueModelResult parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.contactcenterinsights.v1.IssueModelResult parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.contactcenterinsights.v1.IssueModelResult parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.contactcenterinsights.v1.IssueModelResult parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.contactcenterinsights.v1.IssueModelResult parseFrom(
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
      com.google.cloud.contactcenterinsights.v1.IssueModelResult prototype) {
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
   * Issue Modeling result on a conversation.
   * </pre>
   *
   * Protobuf type {@code google.cloud.contactcenterinsights.v1.IssueModelResult}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.contactcenterinsights.v1.IssueModelResult)
      com.google.cloud.contactcenterinsights.v1.IssueModelResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.contactcenterinsights.v1.ResourcesProto
          .internal_static_google_cloud_contactcenterinsights_v1_IssueModelResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.contactcenterinsights.v1.ResourcesProto
          .internal_static_google_cloud_contactcenterinsights_v1_IssueModelResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.contactcenterinsights.v1.IssueModelResult.class,
              com.google.cloud.contactcenterinsights.v1.IssueModelResult.Builder.class);
    }

    // Construct using com.google.cloud.contactcenterinsights.v1.IssueModelResult.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      issueModel_ = "";

      if (issuesBuilder_ == null) {
        issues_ = java.util.Collections.emptyList();
      } else {
        issues_ = null;
        issuesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.contactcenterinsights.v1.ResourcesProto
          .internal_static_google_cloud_contactcenterinsights_v1_IssueModelResult_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.contactcenterinsights.v1.IssueModelResult getDefaultInstanceForType() {
      return com.google.cloud.contactcenterinsights.v1.IssueModelResult.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.contactcenterinsights.v1.IssueModelResult build() {
      com.google.cloud.contactcenterinsights.v1.IssueModelResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.contactcenterinsights.v1.IssueModelResult buildPartial() {
      com.google.cloud.contactcenterinsights.v1.IssueModelResult result =
          new com.google.cloud.contactcenterinsights.v1.IssueModelResult(this);
      int from_bitField0_ = bitField0_;
      result.issueModel_ = issueModel_;
      if (issuesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          issues_ = java.util.Collections.unmodifiableList(issues_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.issues_ = issues_;
      } else {
        result.issues_ = issuesBuilder_.build();
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
      if (other instanceof com.google.cloud.contactcenterinsights.v1.IssueModelResult) {
        return mergeFrom((com.google.cloud.contactcenterinsights.v1.IssueModelResult) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.contactcenterinsights.v1.IssueModelResult other) {
      if (other == com.google.cloud.contactcenterinsights.v1.IssueModelResult.getDefaultInstance())
        return this;
      if (!other.getIssueModel().isEmpty()) {
        issueModel_ = other.issueModel_;
        onChanged();
      }
      if (issuesBuilder_ == null) {
        if (!other.issues_.isEmpty()) {
          if (issues_.isEmpty()) {
            issues_ = other.issues_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureIssuesIsMutable();
            issues_.addAll(other.issues_);
          }
          onChanged();
        }
      } else {
        if (!other.issues_.isEmpty()) {
          if (issuesBuilder_.isEmpty()) {
            issuesBuilder_.dispose();
            issuesBuilder_ = null;
            issues_ = other.issues_;
            bitField0_ = (bitField0_ & ~0x00000001);
            issuesBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getIssuesFieldBuilder()
                    : null;
          } else {
            issuesBuilder_.addAllMessages(other.issues_);
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
                issueModel_ = input.readStringRequireUtf8();

                break;
              } // case 10
            case 18:
              {
                com.google.cloud.contactcenterinsights.v1.IssueAssignment m =
                    input.readMessage(
                        com.google.cloud.contactcenterinsights.v1.IssueAssignment.parser(),
                        extensionRegistry);
                if (issuesBuilder_ == null) {
                  ensureIssuesIsMutable();
                  issues_.add(m);
                } else {
                  issuesBuilder_.addMessage(m);
                }
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

    private java.lang.Object issueModel_ = "";
    /**
     *
     *
     * <pre>
     * Issue model that generates the result.
     * Format: projects/{project}/locations/{location}/issueModels/{issue_model}
     * </pre>
     *
     * <code>string issue_model = 1 [(.google.api.resource_reference) = { ... }</code>
     *
     * @return The issueModel.
     */
    public java.lang.String getIssueModel() {
      java.lang.Object ref = issueModel_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        issueModel_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Issue model that generates the result.
     * Format: projects/{project}/locations/{location}/issueModels/{issue_model}
     * </pre>
     *
     * <code>string issue_model = 1 [(.google.api.resource_reference) = { ... }</code>
     *
     * @return The bytes for issueModel.
     */
    public com.google.protobuf.ByteString getIssueModelBytes() {
      java.lang.Object ref = issueModel_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        issueModel_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Issue model that generates the result.
     * Format: projects/{project}/locations/{location}/issueModels/{issue_model}
     * </pre>
     *
     * <code>string issue_model = 1 [(.google.api.resource_reference) = { ... }</code>
     *
     * @param value The issueModel to set.
     * @return This builder for chaining.
     */
    public Builder setIssueModel(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      issueModel_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Issue model that generates the result.
     * Format: projects/{project}/locations/{location}/issueModels/{issue_model}
     * </pre>
     *
     * <code>string issue_model = 1 [(.google.api.resource_reference) = { ... }</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearIssueModel() {

      issueModel_ = getDefaultInstance().getIssueModel();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Issue model that generates the result.
     * Format: projects/{project}/locations/{location}/issueModels/{issue_model}
     * </pre>
     *
     * <code>string issue_model = 1 [(.google.api.resource_reference) = { ... }</code>
     *
     * @param value The bytes for issueModel to set.
     * @return This builder for chaining.
     */
    public Builder setIssueModelBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      issueModel_ = value;
      onChanged();
      return this;
    }

    private java.util.List<com.google.cloud.contactcenterinsights.v1.IssueAssignment> issues_ =
        java.util.Collections.emptyList();

    private void ensureIssuesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        issues_ =
            new java.util.ArrayList<com.google.cloud.contactcenterinsights.v1.IssueAssignment>(
                issues_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.contactcenterinsights.v1.IssueAssignment,
            com.google.cloud.contactcenterinsights.v1.IssueAssignment.Builder,
            com.google.cloud.contactcenterinsights.v1.IssueAssignmentOrBuilder>
        issuesBuilder_;

    /**
     *
     *
     * <pre>
     * All the matched issues.
     * </pre>
     *
     * <code>repeated .google.cloud.contactcenterinsights.v1.IssueAssignment issues = 2;</code>
     */
    public java.util.List<com.google.cloud.contactcenterinsights.v1.IssueAssignment>
        getIssuesList() {
      if (issuesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(issues_);
      } else {
        return issuesBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * All the matched issues.
     * </pre>
     *
     * <code>repeated .google.cloud.contactcenterinsights.v1.IssueAssignment issues = 2;</code>
     */
    public int getIssuesCount() {
      if (issuesBuilder_ == null) {
        return issues_.size();
      } else {
        return issuesBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * All the matched issues.
     * </pre>
     *
     * <code>repeated .google.cloud.contactcenterinsights.v1.IssueAssignment issues = 2;</code>
     */
    public com.google.cloud.contactcenterinsights.v1.IssueAssignment getIssues(int index) {
      if (issuesBuilder_ == null) {
        return issues_.get(index);
      } else {
        return issuesBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * All the matched issues.
     * </pre>
     *
     * <code>repeated .google.cloud.contactcenterinsights.v1.IssueAssignment issues = 2;</code>
     */
    public Builder setIssues(
        int index, com.google.cloud.contactcenterinsights.v1.IssueAssignment value) {
      if (issuesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureIssuesIsMutable();
        issues_.set(index, value);
        onChanged();
      } else {
        issuesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * All the matched issues.
     * </pre>
     *
     * <code>repeated .google.cloud.contactcenterinsights.v1.IssueAssignment issues = 2;</code>
     */
    public Builder setIssues(
        int index,
        com.google.cloud.contactcenterinsights.v1.IssueAssignment.Builder builderForValue) {
      if (issuesBuilder_ == null) {
        ensureIssuesIsMutable();
        issues_.set(index, builderForValue.build());
        onChanged();
      } else {
        issuesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * All the matched issues.
     * </pre>
     *
     * <code>repeated .google.cloud.contactcenterinsights.v1.IssueAssignment issues = 2;</code>
     */
    public Builder addIssues(com.google.cloud.contactcenterinsights.v1.IssueAssignment value) {
      if (issuesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureIssuesIsMutable();
        issues_.add(value);
        onChanged();
      } else {
        issuesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * All the matched issues.
     * </pre>
     *
     * <code>repeated .google.cloud.contactcenterinsights.v1.IssueAssignment issues = 2;</code>
     */
    public Builder addIssues(
        int index, com.google.cloud.contactcenterinsights.v1.IssueAssignment value) {
      if (issuesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureIssuesIsMutable();
        issues_.add(index, value);
        onChanged();
      } else {
        issuesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * All the matched issues.
     * </pre>
     *
     * <code>repeated .google.cloud.contactcenterinsights.v1.IssueAssignment issues = 2;</code>
     */
    public Builder addIssues(
        com.google.cloud.contactcenterinsights.v1.IssueAssignment.Builder builderForValue) {
      if (issuesBuilder_ == null) {
        ensureIssuesIsMutable();
        issues_.add(builderForValue.build());
        onChanged();
      } else {
        issuesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * All the matched issues.
     * </pre>
     *
     * <code>repeated .google.cloud.contactcenterinsights.v1.IssueAssignment issues = 2;</code>
     */
    public Builder addIssues(
        int index,
        com.google.cloud.contactcenterinsights.v1.IssueAssignment.Builder builderForValue) {
      if (issuesBuilder_ == null) {
        ensureIssuesIsMutable();
        issues_.add(index, builderForValue.build());
        onChanged();
      } else {
        issuesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * All the matched issues.
     * </pre>
     *
     * <code>repeated .google.cloud.contactcenterinsights.v1.IssueAssignment issues = 2;</code>
     */
    public Builder addAllIssues(
        java.lang.Iterable<? extends com.google.cloud.contactcenterinsights.v1.IssueAssignment>
            values) {
      if (issuesBuilder_ == null) {
        ensureIssuesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, issues_);
        onChanged();
      } else {
        issuesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * All the matched issues.
     * </pre>
     *
     * <code>repeated .google.cloud.contactcenterinsights.v1.IssueAssignment issues = 2;</code>
     */
    public Builder clearIssues() {
      if (issuesBuilder_ == null) {
        issues_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        issuesBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * All the matched issues.
     * </pre>
     *
     * <code>repeated .google.cloud.contactcenterinsights.v1.IssueAssignment issues = 2;</code>
     */
    public Builder removeIssues(int index) {
      if (issuesBuilder_ == null) {
        ensureIssuesIsMutable();
        issues_.remove(index);
        onChanged();
      } else {
        issuesBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * All the matched issues.
     * </pre>
     *
     * <code>repeated .google.cloud.contactcenterinsights.v1.IssueAssignment issues = 2;</code>
     */
    public com.google.cloud.contactcenterinsights.v1.IssueAssignment.Builder getIssuesBuilder(
        int index) {
      return getIssuesFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * All the matched issues.
     * </pre>
     *
     * <code>repeated .google.cloud.contactcenterinsights.v1.IssueAssignment issues = 2;</code>
     */
    public com.google.cloud.contactcenterinsights.v1.IssueAssignmentOrBuilder getIssuesOrBuilder(
        int index) {
      if (issuesBuilder_ == null) {
        return issues_.get(index);
      } else {
        return issuesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * All the matched issues.
     * </pre>
     *
     * <code>repeated .google.cloud.contactcenterinsights.v1.IssueAssignment issues = 2;</code>
     */
    public java.util.List<
            ? extends com.google.cloud.contactcenterinsights.v1.IssueAssignmentOrBuilder>
        getIssuesOrBuilderList() {
      if (issuesBuilder_ != null) {
        return issuesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(issues_);
      }
    }
    /**
     *
     *
     * <pre>
     * All the matched issues.
     * </pre>
     *
     * <code>repeated .google.cloud.contactcenterinsights.v1.IssueAssignment issues = 2;</code>
     */
    public com.google.cloud.contactcenterinsights.v1.IssueAssignment.Builder addIssuesBuilder() {
      return getIssuesFieldBuilder()
          .addBuilder(
              com.google.cloud.contactcenterinsights.v1.IssueAssignment.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * All the matched issues.
     * </pre>
     *
     * <code>repeated .google.cloud.contactcenterinsights.v1.IssueAssignment issues = 2;</code>
     */
    public com.google.cloud.contactcenterinsights.v1.IssueAssignment.Builder addIssuesBuilder(
        int index) {
      return getIssuesFieldBuilder()
          .addBuilder(
              index,
              com.google.cloud.contactcenterinsights.v1.IssueAssignment.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * All the matched issues.
     * </pre>
     *
     * <code>repeated .google.cloud.contactcenterinsights.v1.IssueAssignment issues = 2;</code>
     */
    public java.util.List<com.google.cloud.contactcenterinsights.v1.IssueAssignment.Builder>
        getIssuesBuilderList() {
      return getIssuesFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.contactcenterinsights.v1.IssueAssignment,
            com.google.cloud.contactcenterinsights.v1.IssueAssignment.Builder,
            com.google.cloud.contactcenterinsights.v1.IssueAssignmentOrBuilder>
        getIssuesFieldBuilder() {
      if (issuesBuilder_ == null) {
        issuesBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.contactcenterinsights.v1.IssueAssignment,
                com.google.cloud.contactcenterinsights.v1.IssueAssignment.Builder,
                com.google.cloud.contactcenterinsights.v1.IssueAssignmentOrBuilder>(
                issues_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        issues_ = null;
      }
      return issuesBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.contactcenterinsights.v1.IssueModelResult)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.contactcenterinsights.v1.IssueModelResult)
  private static final com.google.cloud.contactcenterinsights.v1.IssueModelResult DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.contactcenterinsights.v1.IssueModelResult();
  }

  public static com.google.cloud.contactcenterinsights.v1.IssueModelResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<IssueModelResult> PARSER =
      new com.google.protobuf.AbstractParser<IssueModelResult>() {
        @java.lang.Override
        public IssueModelResult parsePartialFrom(
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

  public static com.google.protobuf.Parser<IssueModelResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<IssueModelResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.contactcenterinsights.v1.IssueModelResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
