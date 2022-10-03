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
// source: google/cloud/contactcenterinsights/v1/contact_center_insights.proto

package com.google.cloud.contactcenterinsights.v1;

/**
 *
 *
 * <pre>
 * The request to update a view.
 * </pre>
 *
 * Protobuf type {@code google.cloud.contactcenterinsights.v1.UpdateViewRequest}
 */
public final class UpdateViewRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.contactcenterinsights.v1.UpdateViewRequest)
    UpdateViewRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UpdateViewRequest.newBuilder() to construct.
  private UpdateViewRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpdateViewRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UpdateViewRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.contactcenterinsights.v1.ContactCenterInsightsProto
        .internal_static_google_cloud_contactcenterinsights_v1_UpdateViewRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.contactcenterinsights.v1.ContactCenterInsightsProto
        .internal_static_google_cloud_contactcenterinsights_v1_UpdateViewRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.contactcenterinsights.v1.UpdateViewRequest.class,
            com.google.cloud.contactcenterinsights.v1.UpdateViewRequest.Builder.class);
  }

  public static final int VIEW_FIELD_NUMBER = 1;
  private com.google.cloud.contactcenterinsights.v1.View view_;
  /**
   *
   *
   * <pre>
   * Required. The new view.
   * </pre>
   *
   * <code>
   * .google.cloud.contactcenterinsights.v1.View view = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the view field is set.
   */
  @java.lang.Override
  public boolean hasView() {
    return view_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The new view.
   * </pre>
   *
   * <code>
   * .google.cloud.contactcenterinsights.v1.View view = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The view.
   */
  @java.lang.Override
  public com.google.cloud.contactcenterinsights.v1.View getView() {
    return view_ == null
        ? com.google.cloud.contactcenterinsights.v1.View.getDefaultInstance()
        : view_;
  }
  /**
   *
   *
   * <pre>
   * Required. The new view.
   * </pre>
   *
   * <code>
   * .google.cloud.contactcenterinsights.v1.View view = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.contactcenterinsights.v1.ViewOrBuilder getViewOrBuilder() {
    return getView();
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   *
   *
   * <pre>
   * The list of fields to be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return updateMask_ != null;
  }
  /**
   *
   *
   * <pre>
   * The list of fields to be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   *
   *
   * <pre>
   * The list of fields to be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return getUpdateMask();
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
    if (view_ != null) {
      output.writeMessage(1, getView());
    }
    if (updateMask_ != null) {
      output.writeMessage(2, getUpdateMask());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (view_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getView());
    }
    if (updateMask_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getUpdateMask());
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
    if (!(obj instanceof com.google.cloud.contactcenterinsights.v1.UpdateViewRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.contactcenterinsights.v1.UpdateViewRequest other =
        (com.google.cloud.contactcenterinsights.v1.UpdateViewRequest) obj;

    if (hasView() != other.hasView()) return false;
    if (hasView()) {
      if (!getView().equals(other.getView())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask().equals(other.getUpdateMask())) return false;
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
    if (hasView()) {
      hash = (37 * hash) + VIEW_FIELD_NUMBER;
      hash = (53 * hash) + getView().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.contactcenterinsights.v1.UpdateViewRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.contactcenterinsights.v1.UpdateViewRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.contactcenterinsights.v1.UpdateViewRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.contactcenterinsights.v1.UpdateViewRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.contactcenterinsights.v1.UpdateViewRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.contactcenterinsights.v1.UpdateViewRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.contactcenterinsights.v1.UpdateViewRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.contactcenterinsights.v1.UpdateViewRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.contactcenterinsights.v1.UpdateViewRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.contactcenterinsights.v1.UpdateViewRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.contactcenterinsights.v1.UpdateViewRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.contactcenterinsights.v1.UpdateViewRequest parseFrom(
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
      com.google.cloud.contactcenterinsights.v1.UpdateViewRequest prototype) {
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
   * The request to update a view.
   * </pre>
   *
   * Protobuf type {@code google.cloud.contactcenterinsights.v1.UpdateViewRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.contactcenterinsights.v1.UpdateViewRequest)
      com.google.cloud.contactcenterinsights.v1.UpdateViewRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.contactcenterinsights.v1.ContactCenterInsightsProto
          .internal_static_google_cloud_contactcenterinsights_v1_UpdateViewRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.contactcenterinsights.v1.ContactCenterInsightsProto
          .internal_static_google_cloud_contactcenterinsights_v1_UpdateViewRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.contactcenterinsights.v1.UpdateViewRequest.class,
              com.google.cloud.contactcenterinsights.v1.UpdateViewRequest.Builder.class);
    }

    // Construct using com.google.cloud.contactcenterinsights.v1.UpdateViewRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (viewBuilder_ == null) {
        view_ = null;
      } else {
        view_ = null;
        viewBuilder_ = null;
      }
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.contactcenterinsights.v1.ContactCenterInsightsProto
          .internal_static_google_cloud_contactcenterinsights_v1_UpdateViewRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.contactcenterinsights.v1.UpdateViewRequest getDefaultInstanceForType() {
      return com.google.cloud.contactcenterinsights.v1.UpdateViewRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.contactcenterinsights.v1.UpdateViewRequest build() {
      com.google.cloud.contactcenterinsights.v1.UpdateViewRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.contactcenterinsights.v1.UpdateViewRequest buildPartial() {
      com.google.cloud.contactcenterinsights.v1.UpdateViewRequest result =
          new com.google.cloud.contactcenterinsights.v1.UpdateViewRequest(this);
      if (viewBuilder_ == null) {
        result.view_ = view_;
      } else {
        result.view_ = viewBuilder_.build();
      }
      if (updateMaskBuilder_ == null) {
        result.updateMask_ = updateMask_;
      } else {
        result.updateMask_ = updateMaskBuilder_.build();
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
      if (other instanceof com.google.cloud.contactcenterinsights.v1.UpdateViewRequest) {
        return mergeFrom((com.google.cloud.contactcenterinsights.v1.UpdateViewRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.contactcenterinsights.v1.UpdateViewRequest other) {
      if (other == com.google.cloud.contactcenterinsights.v1.UpdateViewRequest.getDefaultInstance())
        return this;
      if (other.hasView()) {
        mergeView(other.getView());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
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
                input.readMessage(getViewFieldBuilder().getBuilder(), extensionRegistry);

                break;
              } // case 10
            case 18:
              {
                input.readMessage(getUpdateMaskFieldBuilder().getBuilder(), extensionRegistry);

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

    private com.google.cloud.contactcenterinsights.v1.View view_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.contactcenterinsights.v1.View,
            com.google.cloud.contactcenterinsights.v1.View.Builder,
            com.google.cloud.contactcenterinsights.v1.ViewOrBuilder>
        viewBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The new view.
     * </pre>
     *
     * <code>
     * .google.cloud.contactcenterinsights.v1.View view = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the view field is set.
     */
    public boolean hasView() {
      return viewBuilder_ != null || view_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. The new view.
     * </pre>
     *
     * <code>
     * .google.cloud.contactcenterinsights.v1.View view = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The view.
     */
    public com.google.cloud.contactcenterinsights.v1.View getView() {
      if (viewBuilder_ == null) {
        return view_ == null
            ? com.google.cloud.contactcenterinsights.v1.View.getDefaultInstance()
            : view_;
      } else {
        return viewBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The new view.
     * </pre>
     *
     * <code>
     * .google.cloud.contactcenterinsights.v1.View view = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setView(com.google.cloud.contactcenterinsights.v1.View value) {
      if (viewBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        view_ = value;
        onChanged();
      } else {
        viewBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The new view.
     * </pre>
     *
     * <code>
     * .google.cloud.contactcenterinsights.v1.View view = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setView(com.google.cloud.contactcenterinsights.v1.View.Builder builderForValue) {
      if (viewBuilder_ == null) {
        view_ = builderForValue.build();
        onChanged();
      } else {
        viewBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The new view.
     * </pre>
     *
     * <code>
     * .google.cloud.contactcenterinsights.v1.View view = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeView(com.google.cloud.contactcenterinsights.v1.View value) {
      if (viewBuilder_ == null) {
        if (view_ != null) {
          view_ =
              com.google.cloud.contactcenterinsights.v1.View.newBuilder(view_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          view_ = value;
        }
        onChanged();
      } else {
        viewBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The new view.
     * </pre>
     *
     * <code>
     * .google.cloud.contactcenterinsights.v1.View view = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearView() {
      if (viewBuilder_ == null) {
        view_ = null;
        onChanged();
      } else {
        view_ = null;
        viewBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The new view.
     * </pre>
     *
     * <code>
     * .google.cloud.contactcenterinsights.v1.View view = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.contactcenterinsights.v1.View.Builder getViewBuilder() {

      onChanged();
      return getViewFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The new view.
     * </pre>
     *
     * <code>
     * .google.cloud.contactcenterinsights.v1.View view = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.contactcenterinsights.v1.ViewOrBuilder getViewOrBuilder() {
      if (viewBuilder_ != null) {
        return viewBuilder_.getMessageOrBuilder();
      } else {
        return view_ == null
            ? com.google.cloud.contactcenterinsights.v1.View.getDefaultInstance()
            : view_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The new view.
     * </pre>
     *
     * <code>
     * .google.cloud.contactcenterinsights.v1.View view = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.contactcenterinsights.v1.View,
            com.google.cloud.contactcenterinsights.v1.View.Builder,
            com.google.cloud.contactcenterinsights.v1.ViewOrBuilder>
        getViewFieldBuilder() {
      if (viewBuilder_ == null) {
        viewBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.contactcenterinsights.v1.View,
                com.google.cloud.contactcenterinsights.v1.View.Builder,
                com.google.cloud.contactcenterinsights.v1.ViewOrBuilder>(
                getView(), getParentForChildren(), isClean());
        view_ = null;
      }
      return viewBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        updateMaskBuilder_;
    /**
     *
     *
     * <pre>
     * The list of fields to be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     *
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return updateMaskBuilder_ != null || updateMask_ != null;
    }
    /**
     *
     *
     * <pre>
     * The list of fields to be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     *
     * @return The updateMask.
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The list of fields to be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of fields to be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of fields to be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (updateMask_ != null) {
          updateMask_ =
              com.google.protobuf.FieldMask.newBuilder(updateMask_).mergeFrom(value).buildPartial();
        } else {
          updateMask_ = value;
        }
        onChanged();
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of fields to be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder clearUpdateMask() {
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
        onChanged();
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of fields to be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {

      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The list of fields to be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      }
    }
    /**
     *
     *
     * <pre>
     * The list of fields to be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.FieldMask,
                com.google.protobuf.FieldMask.Builder,
                com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(), getParentForChildren(), isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.contactcenterinsights.v1.UpdateViewRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.contactcenterinsights.v1.UpdateViewRequest)
  private static final com.google.cloud.contactcenterinsights.v1.UpdateViewRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.contactcenterinsights.v1.UpdateViewRequest();
  }

  public static com.google.cloud.contactcenterinsights.v1.UpdateViewRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateViewRequest> PARSER =
      new com.google.protobuf.AbstractParser<UpdateViewRequest>() {
        @java.lang.Override
        public UpdateViewRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateViewRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateViewRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.contactcenterinsights.v1.UpdateViewRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
