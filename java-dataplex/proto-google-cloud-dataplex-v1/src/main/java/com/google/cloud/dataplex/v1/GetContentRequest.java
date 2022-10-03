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
// source: google/cloud/dataplex/v1/content.proto

package com.google.cloud.dataplex.v1;

/**
 *
 *
 * <pre>
 * Get content request.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dataplex.v1.GetContentRequest}
 */
public final class GetContentRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dataplex.v1.GetContentRequest)
    GetContentRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use GetContentRequest.newBuilder() to construct.
  private GetContentRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private GetContentRequest() {
    name_ = "";
    view_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new GetContentRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.dataplex.v1.ContentProto
        .internal_static_google_cloud_dataplex_v1_GetContentRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dataplex.v1.ContentProto
        .internal_static_google_cloud_dataplex_v1_GetContentRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dataplex.v1.GetContentRequest.class,
            com.google.cloud.dataplex.v1.GetContentRequest.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * Specifies whether the request should return the full or the partial
   * representation.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.dataplex.v1.GetContentRequest.ContentView}
   */
  public enum ContentView implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * Content view not specified. Defaults to BASIC.
     * The API will default to the BASIC view.
     * </pre>
     *
     * <code>CONTENT_VIEW_UNSPECIFIED = 0;</code>
     */
    CONTENT_VIEW_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * Will not return the `data_text` field.
     * </pre>
     *
     * <code>BASIC = 1;</code>
     */
    BASIC(1),
    /**
     *
     *
     * <pre>
     * Returns the complete proto.
     * </pre>
     *
     * <code>FULL = 2;</code>
     */
    FULL(2),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * Content view not specified. Defaults to BASIC.
     * The API will default to the BASIC view.
     * </pre>
     *
     * <code>CONTENT_VIEW_UNSPECIFIED = 0;</code>
     */
    public static final int CONTENT_VIEW_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * Will not return the `data_text` field.
     * </pre>
     *
     * <code>BASIC = 1;</code>
     */
    public static final int BASIC_VALUE = 1;
    /**
     *
     *
     * <pre>
     * Returns the complete proto.
     * </pre>
     *
     * <code>FULL = 2;</code>
     */
    public static final int FULL_VALUE = 2;

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
    public static ContentView valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static ContentView forNumber(int value) {
      switch (value) {
        case 0:
          return CONTENT_VIEW_UNSPECIFIED;
        case 1:
          return BASIC;
        case 2:
          return FULL;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ContentView> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<ContentView> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ContentView>() {
          public ContentView findValueByNumber(int number) {
            return ContentView.forNumber(number);
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
      return com.google.cloud.dataplex.v1.GetContentRequest.getDescriptor().getEnumTypes().get(0);
    }

    private static final ContentView[] VALUES = values();

    public static ContentView valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private ContentView(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.dataplex.v1.GetContentRequest.ContentView)
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   *
   *
   * <pre>
   * Required. The resource name of the content:
   * projects/{project_id}/locations/{location_id}/lakes/{lake_id}/content/{content_id}
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The resource name of the content:
   * projects/{project_id}/locations/{location_id}/lakes/{lake_id}/content/{content_id}
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VIEW_FIELD_NUMBER = 2;
  private int view_;
  /**
   *
   *
   * <pre>
   * Optional. Specify content view to make a partial request.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.GetContentRequest.ContentView view = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for view.
   */
  @java.lang.Override
  public int getViewValue() {
    return view_;
  }
  /**
   *
   *
   * <pre>
   * Optional. Specify content view to make a partial request.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.GetContentRequest.ContentView view = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The view.
   */
  @java.lang.Override
  public com.google.cloud.dataplex.v1.GetContentRequest.ContentView getView() {
    @SuppressWarnings("deprecation")
    com.google.cloud.dataplex.v1.GetContentRequest.ContentView result =
        com.google.cloud.dataplex.v1.GetContentRequest.ContentView.valueOf(view_);
    return result == null
        ? com.google.cloud.dataplex.v1.GetContentRequest.ContentView.UNRECOGNIZED
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (view_
        != com.google.cloud.dataplex.v1.GetContentRequest.ContentView.CONTENT_VIEW_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(2, view_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (view_
        != com.google.cloud.dataplex.v1.GetContentRequest.ContentView.CONTENT_VIEW_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(2, view_);
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
    if (!(obj instanceof com.google.cloud.dataplex.v1.GetContentRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.dataplex.v1.GetContentRequest other =
        (com.google.cloud.dataplex.v1.GetContentRequest) obj;

    if (!getName().equals(other.getName())) return false;
    if (view_ != other.view_) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + VIEW_FIELD_NUMBER;
    hash = (53 * hash) + view_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dataplex.v1.GetContentRequest parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataplex.v1.GetContentRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataplex.v1.GetContentRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataplex.v1.GetContentRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataplex.v1.GetContentRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataplex.v1.GetContentRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataplex.v1.GetContentRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataplex.v1.GetContentRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dataplex.v1.GetContentRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataplex.v1.GetContentRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dataplex.v1.GetContentRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataplex.v1.GetContentRequest parseFrom(
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

  public static Builder newBuilder(com.google.cloud.dataplex.v1.GetContentRequest prototype) {
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
   * Get content request.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dataplex.v1.GetContentRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dataplex.v1.GetContentRequest)
      com.google.cloud.dataplex.v1.GetContentRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dataplex.v1.ContentProto
          .internal_static_google_cloud_dataplex_v1_GetContentRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dataplex.v1.ContentProto
          .internal_static_google_cloud_dataplex_v1_GetContentRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dataplex.v1.GetContentRequest.class,
              com.google.cloud.dataplex.v1.GetContentRequest.Builder.class);
    }

    // Construct using com.google.cloud.dataplex.v1.GetContentRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      name_ = "";

      view_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dataplex.v1.ContentProto
          .internal_static_google_cloud_dataplex_v1_GetContentRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dataplex.v1.GetContentRequest getDefaultInstanceForType() {
      return com.google.cloud.dataplex.v1.GetContentRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dataplex.v1.GetContentRequest build() {
      com.google.cloud.dataplex.v1.GetContentRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dataplex.v1.GetContentRequest buildPartial() {
      com.google.cloud.dataplex.v1.GetContentRequest result =
          new com.google.cloud.dataplex.v1.GetContentRequest(this);
      result.name_ = name_;
      result.view_ = view_;
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
      if (other instanceof com.google.cloud.dataplex.v1.GetContentRequest) {
        return mergeFrom((com.google.cloud.dataplex.v1.GetContentRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dataplex.v1.GetContentRequest other) {
      if (other == com.google.cloud.dataplex.v1.GetContentRequest.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.view_ != 0) {
        setViewValue(other.getViewValue());
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
                name_ = input.readStringRequireUtf8();

                break;
              } // case 10
            case 16:
              {
                view_ = input.readEnum();

                break;
              } // case 16
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

    private java.lang.Object name_ = "";
    /**
     *
     *
     * <pre>
     * Required. The resource name of the content:
     * projects/{project_id}/locations/{location_id}/lakes/{lake_id}/content/{content_id}
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the content:
     * projects/{project_id}/locations/{location_id}/lakes/{lake_id}/content/{content_id}
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the content:
     * projects/{project_id}/locations/{location_id}/lakes/{lake_id}/content/{content_id}
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      name_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the content:
     * projects/{project_id}/locations/{location_id}/lakes/{lake_id}/content/{content_id}
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearName() {

      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the content:
     * projects/{project_id}/locations/{location_id}/lakes/{lake_id}/content/{content_id}
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      name_ = value;
      onChanged();
      return this;
    }

    private int view_ = 0;
    /**
     *
     *
     * <pre>
     * Optional. Specify content view to make a partial request.
     * </pre>
     *
     * <code>
     * .google.cloud.dataplex.v1.GetContentRequest.ContentView view = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return The enum numeric value on the wire for view.
     */
    @java.lang.Override
    public int getViewValue() {
      return view_;
    }
    /**
     *
     *
     * <pre>
     * Optional. Specify content view to make a partial request.
     * </pre>
     *
     * <code>
     * .google.cloud.dataplex.v1.GetContentRequest.ContentView view = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @param value The enum numeric value on the wire for view to set.
     * @return This builder for chaining.
     */
    public Builder setViewValue(int value) {

      view_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Specify content view to make a partial request.
     * </pre>
     *
     * <code>
     * .google.cloud.dataplex.v1.GetContentRequest.ContentView view = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return The view.
     */
    @java.lang.Override
    public com.google.cloud.dataplex.v1.GetContentRequest.ContentView getView() {
      @SuppressWarnings("deprecation")
      com.google.cloud.dataplex.v1.GetContentRequest.ContentView result =
          com.google.cloud.dataplex.v1.GetContentRequest.ContentView.valueOf(view_);
      return result == null
          ? com.google.cloud.dataplex.v1.GetContentRequest.ContentView.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * Optional. Specify content view to make a partial request.
     * </pre>
     *
     * <code>
     * .google.cloud.dataplex.v1.GetContentRequest.ContentView view = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @param value The view to set.
     * @return This builder for chaining.
     */
    public Builder setView(com.google.cloud.dataplex.v1.GetContentRequest.ContentView value) {
      if (value == null) {
        throw new NullPointerException();
      }

      view_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Specify content view to make a partial request.
     * </pre>
     *
     * <code>
     * .google.cloud.dataplex.v1.GetContentRequest.ContentView view = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearView() {

      view_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.dataplex.v1.GetContentRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dataplex.v1.GetContentRequest)
  private static final com.google.cloud.dataplex.v1.GetContentRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dataplex.v1.GetContentRequest();
  }

  public static com.google.cloud.dataplex.v1.GetContentRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetContentRequest> PARSER =
      new com.google.protobuf.AbstractParser<GetContentRequest>() {
        @java.lang.Override
        public GetContentRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetContentRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetContentRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dataplex.v1.GetContentRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
