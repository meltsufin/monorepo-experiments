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
 * A request to create a workflow template.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dataproc.v1.CreateWorkflowTemplateRequest}
 */
public final class CreateWorkflowTemplateRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dataproc.v1.CreateWorkflowTemplateRequest)
    CreateWorkflowTemplateRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateWorkflowTemplateRequest.newBuilder() to construct.
  private CreateWorkflowTemplateRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateWorkflowTemplateRequest() {
    parent_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateWorkflowTemplateRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.dataproc.v1.WorkflowTemplatesProto
        .internal_static_google_cloud_dataproc_v1_CreateWorkflowTemplateRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dataproc.v1.WorkflowTemplatesProto
        .internal_static_google_cloud_dataproc_v1_CreateWorkflowTemplateRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dataproc.v1.CreateWorkflowTemplateRequest.class,
            com.google.cloud.dataproc.v1.CreateWorkflowTemplateRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   *
   *
   * <pre>
   * Required. The resource name of the region or location, as described
   * in https://cloud.google.com/apis/design/resource_names.
   * * For `projects.regions.workflowTemplates.create`, the resource name of the
   *   region has the following format:
   *   `projects/{project_id}/regions/{region}`
   * * For `projects.locations.workflowTemplates.create`, the resource name of
   *   the location has the following format:
   *   `projects/{project_id}/locations/{location}`
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The resource name of the region or location, as described
   * in https://cloud.google.com/apis/design/resource_names.
   * * For `projects.regions.workflowTemplates.create`, the resource name of the
   *   region has the following format:
   *   `projects/{project_id}/regions/{region}`
   * * For `projects.locations.workflowTemplates.create`, the resource name of
   *   the location has the following format:
   *   `projects/{project_id}/locations/{location}`
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TEMPLATE_FIELD_NUMBER = 2;
  private com.google.cloud.dataproc.v1.WorkflowTemplate template_;
  /**
   *
   *
   * <pre>
   * Required. The Dataproc workflow template to create.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.WorkflowTemplate template = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the template field is set.
   */
  @java.lang.Override
  public boolean hasTemplate() {
    return template_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The Dataproc workflow template to create.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.WorkflowTemplate template = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The template.
   */
  @java.lang.Override
  public com.google.cloud.dataproc.v1.WorkflowTemplate getTemplate() {
    return template_ == null
        ? com.google.cloud.dataproc.v1.WorkflowTemplate.getDefaultInstance()
        : template_;
  }
  /**
   *
   *
   * <pre>
   * Required. The Dataproc workflow template to create.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.WorkflowTemplate template = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.dataproc.v1.WorkflowTemplateOrBuilder getTemplateOrBuilder() {
    return getTemplate();
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (template_ != null) {
      output.writeMessage(2, getTemplate());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (template_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getTemplate());
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
    if (!(obj instanceof com.google.cloud.dataproc.v1.CreateWorkflowTemplateRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.dataproc.v1.CreateWorkflowTemplateRequest other =
        (com.google.cloud.dataproc.v1.CreateWorkflowTemplateRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (hasTemplate() != other.hasTemplate()) return false;
    if (hasTemplate()) {
      if (!getTemplate().equals(other.getTemplate())) return false;
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (hasTemplate()) {
      hash = (37 * hash) + TEMPLATE_FIELD_NUMBER;
      hash = (53 * hash) + getTemplate().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dataproc.v1.CreateWorkflowTemplateRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataproc.v1.CreateWorkflowTemplateRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1.CreateWorkflowTemplateRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataproc.v1.CreateWorkflowTemplateRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1.CreateWorkflowTemplateRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataproc.v1.CreateWorkflowTemplateRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1.CreateWorkflowTemplateRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataproc.v1.CreateWorkflowTemplateRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1.CreateWorkflowTemplateRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataproc.v1.CreateWorkflowTemplateRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1.CreateWorkflowTemplateRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataproc.v1.CreateWorkflowTemplateRequest parseFrom(
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
      com.google.cloud.dataproc.v1.CreateWorkflowTemplateRequest prototype) {
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
   * A request to create a workflow template.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dataproc.v1.CreateWorkflowTemplateRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dataproc.v1.CreateWorkflowTemplateRequest)
      com.google.cloud.dataproc.v1.CreateWorkflowTemplateRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dataproc.v1.WorkflowTemplatesProto
          .internal_static_google_cloud_dataproc_v1_CreateWorkflowTemplateRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dataproc.v1.WorkflowTemplatesProto
          .internal_static_google_cloud_dataproc_v1_CreateWorkflowTemplateRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dataproc.v1.CreateWorkflowTemplateRequest.class,
              com.google.cloud.dataproc.v1.CreateWorkflowTemplateRequest.Builder.class);
    }

    // Construct using com.google.cloud.dataproc.v1.CreateWorkflowTemplateRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      parent_ = "";

      if (templateBuilder_ == null) {
        template_ = null;
      } else {
        template_ = null;
        templateBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dataproc.v1.WorkflowTemplatesProto
          .internal_static_google_cloud_dataproc_v1_CreateWorkflowTemplateRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1.CreateWorkflowTemplateRequest getDefaultInstanceForType() {
      return com.google.cloud.dataproc.v1.CreateWorkflowTemplateRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1.CreateWorkflowTemplateRequest build() {
      com.google.cloud.dataproc.v1.CreateWorkflowTemplateRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1.CreateWorkflowTemplateRequest buildPartial() {
      com.google.cloud.dataproc.v1.CreateWorkflowTemplateRequest result =
          new com.google.cloud.dataproc.v1.CreateWorkflowTemplateRequest(this);
      result.parent_ = parent_;
      if (templateBuilder_ == null) {
        result.template_ = template_;
      } else {
        result.template_ = templateBuilder_.build();
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
      if (other instanceof com.google.cloud.dataproc.v1.CreateWorkflowTemplateRequest) {
        return mergeFrom((com.google.cloud.dataproc.v1.CreateWorkflowTemplateRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dataproc.v1.CreateWorkflowTemplateRequest other) {
      if (other == com.google.cloud.dataproc.v1.CreateWorkflowTemplateRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (other.hasTemplate()) {
        mergeTemplate(other.getTemplate());
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
                parent_ = input.readStringRequireUtf8();

                break;
              } // case 10
            case 18:
              {
                input.readMessage(getTemplateFieldBuilder().getBuilder(), extensionRegistry);

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

    private java.lang.Object parent_ = "";
    /**
     *
     *
     * <pre>
     * Required. The resource name of the region or location, as described
     * in https://cloud.google.com/apis/design/resource_names.
     * * For `projects.regions.workflowTemplates.create`, the resource name of the
     *   region has the following format:
     *   `projects/{project_id}/regions/{region}`
     * * For `projects.locations.workflowTemplates.create`, the resource name of
     *   the location has the following format:
     *   `projects/{project_id}/locations/{location}`
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the region or location, as described
     * in https://cloud.google.com/apis/design/resource_names.
     * * For `projects.regions.workflowTemplates.create`, the resource name of the
     *   region has the following format:
     *   `projects/{project_id}/regions/{region}`
     * * For `projects.locations.workflowTemplates.create`, the resource name of
     *   the location has the following format:
     *   `projects/{project_id}/locations/{location}`
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the region or location, as described
     * in https://cloud.google.com/apis/design/resource_names.
     * * For `projects.regions.workflowTemplates.create`, the resource name of the
     *   region has the following format:
     *   `projects/{project_id}/regions/{region}`
     * * For `projects.locations.workflowTemplates.create`, the resource name of
     *   the location has the following format:
     *   `projects/{project_id}/locations/{location}`
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      parent_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the region or location, as described
     * in https://cloud.google.com/apis/design/resource_names.
     * * For `projects.regions.workflowTemplates.create`, the resource name of the
     *   region has the following format:
     *   `projects/{project_id}/regions/{region}`
     * * For `projects.locations.workflowTemplates.create`, the resource name of
     *   the location has the following format:
     *   `projects/{project_id}/locations/{location}`
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearParent() {

      parent_ = getDefaultInstance().getParent();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the region or location, as described
     * in https://cloud.google.com/apis/design/resource_names.
     * * For `projects.regions.workflowTemplates.create`, the resource name of the
     *   region has the following format:
     *   `projects/{project_id}/regions/{region}`
     * * For `projects.locations.workflowTemplates.create`, the resource name of
     *   the location has the following format:
     *   `projects/{project_id}/locations/{location}`
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      parent_ = value;
      onChanged();
      return this;
    }

    private com.google.cloud.dataproc.v1.WorkflowTemplate template_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dataproc.v1.WorkflowTemplate,
            com.google.cloud.dataproc.v1.WorkflowTemplate.Builder,
            com.google.cloud.dataproc.v1.WorkflowTemplateOrBuilder>
        templateBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The Dataproc workflow template to create.
     * </pre>
     *
     * <code>
     * .google.cloud.dataproc.v1.WorkflowTemplate template = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the template field is set.
     */
    public boolean hasTemplate() {
      return templateBuilder_ != null || template_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. The Dataproc workflow template to create.
     * </pre>
     *
     * <code>
     * .google.cloud.dataproc.v1.WorkflowTemplate template = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The template.
     */
    public com.google.cloud.dataproc.v1.WorkflowTemplate getTemplate() {
      if (templateBuilder_ == null) {
        return template_ == null
            ? com.google.cloud.dataproc.v1.WorkflowTemplate.getDefaultInstance()
            : template_;
      } else {
        return templateBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The Dataproc workflow template to create.
     * </pre>
     *
     * <code>
     * .google.cloud.dataproc.v1.WorkflowTemplate template = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setTemplate(com.google.cloud.dataproc.v1.WorkflowTemplate value) {
      if (templateBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        template_ = value;
        onChanged();
      } else {
        templateBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The Dataproc workflow template to create.
     * </pre>
     *
     * <code>
     * .google.cloud.dataproc.v1.WorkflowTemplate template = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setTemplate(
        com.google.cloud.dataproc.v1.WorkflowTemplate.Builder builderForValue) {
      if (templateBuilder_ == null) {
        template_ = builderForValue.build();
        onChanged();
      } else {
        templateBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The Dataproc workflow template to create.
     * </pre>
     *
     * <code>
     * .google.cloud.dataproc.v1.WorkflowTemplate template = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeTemplate(com.google.cloud.dataproc.v1.WorkflowTemplate value) {
      if (templateBuilder_ == null) {
        if (template_ != null) {
          template_ =
              com.google.cloud.dataproc.v1.WorkflowTemplate.newBuilder(template_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          template_ = value;
        }
        onChanged();
      } else {
        templateBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The Dataproc workflow template to create.
     * </pre>
     *
     * <code>
     * .google.cloud.dataproc.v1.WorkflowTemplate template = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearTemplate() {
      if (templateBuilder_ == null) {
        template_ = null;
        onChanged();
      } else {
        template_ = null;
        templateBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The Dataproc workflow template to create.
     * </pre>
     *
     * <code>
     * .google.cloud.dataproc.v1.WorkflowTemplate template = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.dataproc.v1.WorkflowTemplate.Builder getTemplateBuilder() {

      onChanged();
      return getTemplateFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The Dataproc workflow template to create.
     * </pre>
     *
     * <code>
     * .google.cloud.dataproc.v1.WorkflowTemplate template = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.dataproc.v1.WorkflowTemplateOrBuilder getTemplateOrBuilder() {
      if (templateBuilder_ != null) {
        return templateBuilder_.getMessageOrBuilder();
      } else {
        return template_ == null
            ? com.google.cloud.dataproc.v1.WorkflowTemplate.getDefaultInstance()
            : template_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The Dataproc workflow template to create.
     * </pre>
     *
     * <code>
     * .google.cloud.dataproc.v1.WorkflowTemplate template = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dataproc.v1.WorkflowTemplate,
            com.google.cloud.dataproc.v1.WorkflowTemplate.Builder,
            com.google.cloud.dataproc.v1.WorkflowTemplateOrBuilder>
        getTemplateFieldBuilder() {
      if (templateBuilder_ == null) {
        templateBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.dataproc.v1.WorkflowTemplate,
                com.google.cloud.dataproc.v1.WorkflowTemplate.Builder,
                com.google.cloud.dataproc.v1.WorkflowTemplateOrBuilder>(
                getTemplate(), getParentForChildren(), isClean());
        template_ = null;
      }
      return templateBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.dataproc.v1.CreateWorkflowTemplateRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dataproc.v1.CreateWorkflowTemplateRequest)
  private static final com.google.cloud.dataproc.v1.CreateWorkflowTemplateRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dataproc.v1.CreateWorkflowTemplateRequest();
  }

  public static com.google.cloud.dataproc.v1.CreateWorkflowTemplateRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateWorkflowTemplateRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateWorkflowTemplateRequest>() {
        @java.lang.Override
        public CreateWorkflowTemplateRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateWorkflowTemplateRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateWorkflowTemplateRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dataproc.v1.CreateWorkflowTemplateRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
