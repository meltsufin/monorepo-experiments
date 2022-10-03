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
// source: google/apps/script/type/extension_point.proto

package com.google.apps.script.type;

/**
 *
 *
 * <pre>
 * Format for declaring a universal action menu item extension point.
 * </pre>
 *
 * Protobuf type {@code google.apps.script.type.UniversalActionExtensionPoint}
 */
public final class UniversalActionExtensionPoint extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.apps.script.type.UniversalActionExtensionPoint)
    UniversalActionExtensionPointOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UniversalActionExtensionPoint.newBuilder() to construct.
  private UniversalActionExtensionPoint(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UniversalActionExtensionPoint() {
    label_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UniversalActionExtensionPoint();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.apps.script.type.ExtensionPoint
        .internal_static_google_apps_script_type_UniversalActionExtensionPoint_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.apps.script.type.ExtensionPoint
        .internal_static_google_apps_script_type_UniversalActionExtensionPoint_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.apps.script.type.UniversalActionExtensionPoint.class,
            com.google.apps.script.type.UniversalActionExtensionPoint.Builder.class);
  }

  private int actionTypeCase_ = 0;
  private java.lang.Object actionType_;

  public enum ActionTypeCase
      implements
          com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    OPEN_LINK(2),
    RUN_FUNCTION(3),
    ACTIONTYPE_NOT_SET(0);
    private final int value;

    private ActionTypeCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ActionTypeCase valueOf(int value) {
      return forNumber(value);
    }

    public static ActionTypeCase forNumber(int value) {
      switch (value) {
        case 2:
          return OPEN_LINK;
        case 3:
          return RUN_FUNCTION;
        case 0:
          return ACTIONTYPE_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public ActionTypeCase getActionTypeCase() {
    return ActionTypeCase.forNumber(actionTypeCase_);
  }

  public static final int LABEL_FIELD_NUMBER = 1;
  private volatile java.lang.Object label_;
  /**
   *
   *
   * <pre>
   * Required. User-visible text describing the action taken by activating this
   * extension point, for example, "Add a new contact".
   * </pre>
   *
   * <code>string label = 1;</code>
   *
   * @return The label.
   */
  @java.lang.Override
  public java.lang.String getLabel() {
    java.lang.Object ref = label_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      label_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. User-visible text describing the action taken by activating this
   * extension point, for example, "Add a new contact".
   * </pre>
   *
   * <code>string label = 1;</code>
   *
   * @return The bytes for label.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getLabelBytes() {
    java.lang.Object ref = label_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      label_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int OPEN_LINK_FIELD_NUMBER = 2;
  /**
   *
   *
   * <pre>
   * URL to be opened by the UniversalAction.
   * </pre>
   *
   * <code>string open_link = 2;</code>
   *
   * @return Whether the openLink field is set.
   */
  public boolean hasOpenLink() {
    return actionTypeCase_ == 2;
  }
  /**
   *
   *
   * <pre>
   * URL to be opened by the UniversalAction.
   * </pre>
   *
   * <code>string open_link = 2;</code>
   *
   * @return The openLink.
   */
  public java.lang.String getOpenLink() {
    java.lang.Object ref = "";
    if (actionTypeCase_ == 2) {
      ref = actionType_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (actionTypeCase_ == 2) {
        actionType_ = s;
      }
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * URL to be opened by the UniversalAction.
   * </pre>
   *
   * <code>string open_link = 2;</code>
   *
   * @return The bytes for openLink.
   */
  public com.google.protobuf.ByteString getOpenLinkBytes() {
    java.lang.Object ref = "";
    if (actionTypeCase_ == 2) {
      ref = actionType_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      if (actionTypeCase_ == 2) {
        actionType_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RUN_FUNCTION_FIELD_NUMBER = 3;
  /**
   *
   *
   * <pre>
   * Endpoint to be run by the UniversalAction.
   * </pre>
   *
   * <code>string run_function = 3;</code>
   *
   * @return Whether the runFunction field is set.
   */
  public boolean hasRunFunction() {
    return actionTypeCase_ == 3;
  }
  /**
   *
   *
   * <pre>
   * Endpoint to be run by the UniversalAction.
   * </pre>
   *
   * <code>string run_function = 3;</code>
   *
   * @return The runFunction.
   */
  public java.lang.String getRunFunction() {
    java.lang.Object ref = "";
    if (actionTypeCase_ == 3) {
      ref = actionType_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (actionTypeCase_ == 3) {
        actionType_ = s;
      }
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Endpoint to be run by the UniversalAction.
   * </pre>
   *
   * <code>string run_function = 3;</code>
   *
   * @return The bytes for runFunction.
   */
  public com.google.protobuf.ByteString getRunFunctionBytes() {
    java.lang.Object ref = "";
    if (actionTypeCase_ == 3) {
      ref = actionType_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      if (actionTypeCase_ == 3) {
        actionType_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(label_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, label_);
    }
    if (actionTypeCase_ == 2) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, actionType_);
    }
    if (actionTypeCase_ == 3) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, actionType_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(label_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, label_);
    }
    if (actionTypeCase_ == 2) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, actionType_);
    }
    if (actionTypeCase_ == 3) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, actionType_);
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
    if (!(obj instanceof com.google.apps.script.type.UniversalActionExtensionPoint)) {
      return super.equals(obj);
    }
    com.google.apps.script.type.UniversalActionExtensionPoint other =
        (com.google.apps.script.type.UniversalActionExtensionPoint) obj;

    if (!getLabel().equals(other.getLabel())) return false;
    if (!getActionTypeCase().equals(other.getActionTypeCase())) return false;
    switch (actionTypeCase_) {
      case 2:
        if (!getOpenLink().equals(other.getOpenLink())) return false;
        break;
      case 3:
        if (!getRunFunction().equals(other.getRunFunction())) return false;
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
    hash = (37 * hash) + LABEL_FIELD_NUMBER;
    hash = (53 * hash) + getLabel().hashCode();
    switch (actionTypeCase_) {
      case 2:
        hash = (37 * hash) + OPEN_LINK_FIELD_NUMBER;
        hash = (53 * hash) + getOpenLink().hashCode();
        break;
      case 3:
        hash = (37 * hash) + RUN_FUNCTION_FIELD_NUMBER;
        hash = (53 * hash) + getRunFunction().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.apps.script.type.UniversalActionExtensionPoint parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.apps.script.type.UniversalActionExtensionPoint parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.apps.script.type.UniversalActionExtensionPoint parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.apps.script.type.UniversalActionExtensionPoint parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.apps.script.type.UniversalActionExtensionPoint parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.apps.script.type.UniversalActionExtensionPoint parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.apps.script.type.UniversalActionExtensionPoint parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.apps.script.type.UniversalActionExtensionPoint parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.apps.script.type.UniversalActionExtensionPoint parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.apps.script.type.UniversalActionExtensionPoint parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.apps.script.type.UniversalActionExtensionPoint parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.apps.script.type.UniversalActionExtensionPoint parseFrom(
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
      com.google.apps.script.type.UniversalActionExtensionPoint prototype) {
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
   * Format for declaring a universal action menu item extension point.
   * </pre>
   *
   * Protobuf type {@code google.apps.script.type.UniversalActionExtensionPoint}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.apps.script.type.UniversalActionExtensionPoint)
      com.google.apps.script.type.UniversalActionExtensionPointOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.apps.script.type.ExtensionPoint
          .internal_static_google_apps_script_type_UniversalActionExtensionPoint_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.apps.script.type.ExtensionPoint
          .internal_static_google_apps_script_type_UniversalActionExtensionPoint_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.apps.script.type.UniversalActionExtensionPoint.class,
              com.google.apps.script.type.UniversalActionExtensionPoint.Builder.class);
    }

    // Construct using com.google.apps.script.type.UniversalActionExtensionPoint.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      label_ = "";

      actionTypeCase_ = 0;
      actionType_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.apps.script.type.ExtensionPoint
          .internal_static_google_apps_script_type_UniversalActionExtensionPoint_descriptor;
    }

    @java.lang.Override
    public com.google.apps.script.type.UniversalActionExtensionPoint getDefaultInstanceForType() {
      return com.google.apps.script.type.UniversalActionExtensionPoint.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.apps.script.type.UniversalActionExtensionPoint build() {
      com.google.apps.script.type.UniversalActionExtensionPoint result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.apps.script.type.UniversalActionExtensionPoint buildPartial() {
      com.google.apps.script.type.UniversalActionExtensionPoint result =
          new com.google.apps.script.type.UniversalActionExtensionPoint(this);
      result.label_ = label_;
      if (actionTypeCase_ == 2) {
        result.actionType_ = actionType_;
      }
      if (actionTypeCase_ == 3) {
        result.actionType_ = actionType_;
      }
      result.actionTypeCase_ = actionTypeCase_;
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
      if (other instanceof com.google.apps.script.type.UniversalActionExtensionPoint) {
        return mergeFrom((com.google.apps.script.type.UniversalActionExtensionPoint) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.apps.script.type.UniversalActionExtensionPoint other) {
      if (other == com.google.apps.script.type.UniversalActionExtensionPoint.getDefaultInstance())
        return this;
      if (!other.getLabel().isEmpty()) {
        label_ = other.label_;
        onChanged();
      }
      switch (other.getActionTypeCase()) {
        case OPEN_LINK:
          {
            actionTypeCase_ = 2;
            actionType_ = other.actionType_;
            onChanged();
            break;
          }
        case RUN_FUNCTION:
          {
            actionTypeCase_ = 3;
            actionType_ = other.actionType_;
            onChanged();
            break;
          }
        case ACTIONTYPE_NOT_SET:
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
            case 10:
              {
                label_ = input.readStringRequireUtf8();

                break;
              } // case 10
            case 18:
              {
                java.lang.String s = input.readStringRequireUtf8();
                actionTypeCase_ = 2;
                actionType_ = s;
                break;
              } // case 18
            case 26:
              {
                java.lang.String s = input.readStringRequireUtf8();
                actionTypeCase_ = 3;
                actionType_ = s;
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

    private int actionTypeCase_ = 0;
    private java.lang.Object actionType_;

    public ActionTypeCase getActionTypeCase() {
      return ActionTypeCase.forNumber(actionTypeCase_);
    }

    public Builder clearActionType() {
      actionTypeCase_ = 0;
      actionType_ = null;
      onChanged();
      return this;
    }

    private java.lang.Object label_ = "";
    /**
     *
     *
     * <pre>
     * Required. User-visible text describing the action taken by activating this
     * extension point, for example, "Add a new contact".
     * </pre>
     *
     * <code>string label = 1;</code>
     *
     * @return The label.
     */
    public java.lang.String getLabel() {
      java.lang.Object ref = label_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        label_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. User-visible text describing the action taken by activating this
     * extension point, for example, "Add a new contact".
     * </pre>
     *
     * <code>string label = 1;</code>
     *
     * @return The bytes for label.
     */
    public com.google.protobuf.ByteString getLabelBytes() {
      java.lang.Object ref = label_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        label_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. User-visible text describing the action taken by activating this
     * extension point, for example, "Add a new contact".
     * </pre>
     *
     * <code>string label = 1;</code>
     *
     * @param value The label to set.
     * @return This builder for chaining.
     */
    public Builder setLabel(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      label_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. User-visible text describing the action taken by activating this
     * extension point, for example, "Add a new contact".
     * </pre>
     *
     * <code>string label = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearLabel() {

      label_ = getDefaultInstance().getLabel();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. User-visible text describing the action taken by activating this
     * extension point, for example, "Add a new contact".
     * </pre>
     *
     * <code>string label = 1;</code>
     *
     * @param value The bytes for label to set.
     * @return This builder for chaining.
     */
    public Builder setLabelBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      label_ = value;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * URL to be opened by the UniversalAction.
     * </pre>
     *
     * <code>string open_link = 2;</code>
     *
     * @return Whether the openLink field is set.
     */
    @java.lang.Override
    public boolean hasOpenLink() {
      return actionTypeCase_ == 2;
    }
    /**
     *
     *
     * <pre>
     * URL to be opened by the UniversalAction.
     * </pre>
     *
     * <code>string open_link = 2;</code>
     *
     * @return The openLink.
     */
    @java.lang.Override
    public java.lang.String getOpenLink() {
      java.lang.Object ref = "";
      if (actionTypeCase_ == 2) {
        ref = actionType_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (actionTypeCase_ == 2) {
          actionType_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * URL to be opened by the UniversalAction.
     * </pre>
     *
     * <code>string open_link = 2;</code>
     *
     * @return The bytes for openLink.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getOpenLinkBytes() {
      java.lang.Object ref = "";
      if (actionTypeCase_ == 2) {
        ref = actionType_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        if (actionTypeCase_ == 2) {
          actionType_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * URL to be opened by the UniversalAction.
     * </pre>
     *
     * <code>string open_link = 2;</code>
     *
     * @param value The openLink to set.
     * @return This builder for chaining.
     */
    public Builder setOpenLink(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      actionTypeCase_ = 2;
      actionType_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * URL to be opened by the UniversalAction.
     * </pre>
     *
     * <code>string open_link = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearOpenLink() {
      if (actionTypeCase_ == 2) {
        actionTypeCase_ = 0;
        actionType_ = null;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * URL to be opened by the UniversalAction.
     * </pre>
     *
     * <code>string open_link = 2;</code>
     *
     * @param value The bytes for openLink to set.
     * @return This builder for chaining.
     */
    public Builder setOpenLinkBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      actionTypeCase_ = 2;
      actionType_ = value;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Endpoint to be run by the UniversalAction.
     * </pre>
     *
     * <code>string run_function = 3;</code>
     *
     * @return Whether the runFunction field is set.
     */
    @java.lang.Override
    public boolean hasRunFunction() {
      return actionTypeCase_ == 3;
    }
    /**
     *
     *
     * <pre>
     * Endpoint to be run by the UniversalAction.
     * </pre>
     *
     * <code>string run_function = 3;</code>
     *
     * @return The runFunction.
     */
    @java.lang.Override
    public java.lang.String getRunFunction() {
      java.lang.Object ref = "";
      if (actionTypeCase_ == 3) {
        ref = actionType_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (actionTypeCase_ == 3) {
          actionType_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Endpoint to be run by the UniversalAction.
     * </pre>
     *
     * <code>string run_function = 3;</code>
     *
     * @return The bytes for runFunction.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getRunFunctionBytes() {
      java.lang.Object ref = "";
      if (actionTypeCase_ == 3) {
        ref = actionType_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        if (actionTypeCase_ == 3) {
          actionType_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Endpoint to be run by the UniversalAction.
     * </pre>
     *
     * <code>string run_function = 3;</code>
     *
     * @param value The runFunction to set.
     * @return This builder for chaining.
     */
    public Builder setRunFunction(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      actionTypeCase_ = 3;
      actionType_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Endpoint to be run by the UniversalAction.
     * </pre>
     *
     * <code>string run_function = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearRunFunction() {
      if (actionTypeCase_ == 3) {
        actionTypeCase_ = 0;
        actionType_ = null;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Endpoint to be run by the UniversalAction.
     * </pre>
     *
     * <code>string run_function = 3;</code>
     *
     * @param value The bytes for runFunction to set.
     * @return This builder for chaining.
     */
    public Builder setRunFunctionBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      actionTypeCase_ = 3;
      actionType_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.apps.script.type.UniversalActionExtensionPoint)
  }

  // @@protoc_insertion_point(class_scope:google.apps.script.type.UniversalActionExtensionPoint)
  private static final com.google.apps.script.type.UniversalActionExtensionPoint DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.apps.script.type.UniversalActionExtensionPoint();
  }

  public static com.google.apps.script.type.UniversalActionExtensionPoint getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UniversalActionExtensionPoint> PARSER =
      new com.google.protobuf.AbstractParser<UniversalActionExtensionPoint>() {
        @java.lang.Override
        public UniversalActionExtensionPoint parsePartialFrom(
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

  public static com.google.protobuf.Parser<UniversalActionExtensionPoint> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UniversalActionExtensionPoint> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.apps.script.type.UniversalActionExtensionPoint getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
