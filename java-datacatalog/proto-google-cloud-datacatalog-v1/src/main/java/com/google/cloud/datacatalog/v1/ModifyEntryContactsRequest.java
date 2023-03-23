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
// source: google/cloud/datacatalog/v1/datacatalog.proto

package com.google.cloud.datacatalog.v1;

/**
 *
 *
 * <pre>
 * Request message for
 * [ModifyEntryContacts][google.cloud.datacatalog.v1.DataCatalog.ModifyEntryContacts].
 * </pre>
 *
 * Protobuf type {@code google.cloud.datacatalog.v1.ModifyEntryContactsRequest}
 */
public final class ModifyEntryContactsRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.datacatalog.v1.ModifyEntryContactsRequest)
    ModifyEntryContactsRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ModifyEntryContactsRequest.newBuilder() to construct.
  private ModifyEntryContactsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ModifyEntryContactsRequest() {
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ModifyEntryContactsRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.datacatalog.v1.Datacatalog
        .internal_static_google_cloud_datacatalog_v1_ModifyEntryContactsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.datacatalog.v1.Datacatalog
        .internal_static_google_cloud_datacatalog_v1_ModifyEntryContactsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.datacatalog.v1.ModifyEntryContactsRequest.class,
            com.google.cloud.datacatalog.v1.ModifyEntryContactsRequest.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   *
   *
   * <pre>
   * Required. The full resource name of the entry.
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
   * Required. The full resource name of the entry.
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

  public static final int CONTACTS_FIELD_NUMBER = 2;
  private com.google.cloud.datacatalog.v1.Contacts contacts_;
  /**
   *
   *
   * <pre>
   * Required. The new value for the Contacts.
   * </pre>
   *
   * <code>
   * .google.cloud.datacatalog.v1.Contacts contacts = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the contacts field is set.
   */
  @java.lang.Override
  public boolean hasContacts() {
    return contacts_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The new value for the Contacts.
   * </pre>
   *
   * <code>
   * .google.cloud.datacatalog.v1.Contacts contacts = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The contacts.
   */
  @java.lang.Override
  public com.google.cloud.datacatalog.v1.Contacts getContacts() {
    return contacts_ == null
        ? com.google.cloud.datacatalog.v1.Contacts.getDefaultInstance()
        : contacts_;
  }
  /**
   *
   *
   * <pre>
   * Required. The new value for the Contacts.
   * </pre>
   *
   * <code>
   * .google.cloud.datacatalog.v1.Contacts contacts = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.datacatalog.v1.ContactsOrBuilder getContactsOrBuilder() {
    return getContacts();
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
    if (contacts_ != null) {
      output.writeMessage(2, getContacts());
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
    if (contacts_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getContacts());
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
    if (!(obj instanceof com.google.cloud.datacatalog.v1.ModifyEntryContactsRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.datacatalog.v1.ModifyEntryContactsRequest other =
        (com.google.cloud.datacatalog.v1.ModifyEntryContactsRequest) obj;

    if (!getName().equals(other.getName())) return false;
    if (hasContacts() != other.hasContacts()) return false;
    if (hasContacts()) {
      if (!getContacts().equals(other.getContacts())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (hasContacts()) {
      hash = (37 * hash) + CONTACTS_FIELD_NUMBER;
      hash = (53 * hash) + getContacts().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.datacatalog.v1.ModifyEntryContactsRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.v1.ModifyEntryContactsRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.ModifyEntryContactsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.v1.ModifyEntryContactsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.ModifyEntryContactsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.v1.ModifyEntryContactsRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.ModifyEntryContactsRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.v1.ModifyEntryContactsRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.ModifyEntryContactsRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.v1.ModifyEntryContactsRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.ModifyEntryContactsRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.v1.ModifyEntryContactsRequest parseFrom(
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
      com.google.cloud.datacatalog.v1.ModifyEntryContactsRequest prototype) {
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
   * Request message for
   * [ModifyEntryContacts][google.cloud.datacatalog.v1.DataCatalog.ModifyEntryContacts].
   * </pre>
   *
   * Protobuf type {@code google.cloud.datacatalog.v1.ModifyEntryContactsRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.datacatalog.v1.ModifyEntryContactsRequest)
      com.google.cloud.datacatalog.v1.ModifyEntryContactsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.datacatalog.v1.Datacatalog
          .internal_static_google_cloud_datacatalog_v1_ModifyEntryContactsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.datacatalog.v1.Datacatalog
          .internal_static_google_cloud_datacatalog_v1_ModifyEntryContactsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.datacatalog.v1.ModifyEntryContactsRequest.class,
              com.google.cloud.datacatalog.v1.ModifyEntryContactsRequest.Builder.class);
    }

    // Construct using com.google.cloud.datacatalog.v1.ModifyEntryContactsRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      name_ = "";

      if (contactsBuilder_ == null) {
        contacts_ = null;
      } else {
        contacts_ = null;
        contactsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.datacatalog.v1.Datacatalog
          .internal_static_google_cloud_datacatalog_v1_ModifyEntryContactsRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1.ModifyEntryContactsRequest getDefaultInstanceForType() {
      return com.google.cloud.datacatalog.v1.ModifyEntryContactsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1.ModifyEntryContactsRequest build() {
      com.google.cloud.datacatalog.v1.ModifyEntryContactsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1.ModifyEntryContactsRequest buildPartial() {
      com.google.cloud.datacatalog.v1.ModifyEntryContactsRequest result =
          new com.google.cloud.datacatalog.v1.ModifyEntryContactsRequest(this);
      result.name_ = name_;
      if (contactsBuilder_ == null) {
        result.contacts_ = contacts_;
      } else {
        result.contacts_ = contactsBuilder_.build();
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
      if (other instanceof com.google.cloud.datacatalog.v1.ModifyEntryContactsRequest) {
        return mergeFrom((com.google.cloud.datacatalog.v1.ModifyEntryContactsRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.datacatalog.v1.ModifyEntryContactsRequest other) {
      if (other == com.google.cloud.datacatalog.v1.ModifyEntryContactsRequest.getDefaultInstance())
        return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.hasContacts()) {
        mergeContacts(other.getContacts());
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
            case 18:
              {
                input.readMessage(getContactsFieldBuilder().getBuilder(), extensionRegistry);

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

    private java.lang.Object name_ = "";
    /**
     *
     *
     * <pre>
     * Required. The full resource name of the entry.
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
     * Required. The full resource name of the entry.
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
     * Required. The full resource name of the entry.
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
     * Required. The full resource name of the entry.
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
     * Required. The full resource name of the entry.
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

    private com.google.cloud.datacatalog.v1.Contacts contacts_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.datacatalog.v1.Contacts,
            com.google.cloud.datacatalog.v1.Contacts.Builder,
            com.google.cloud.datacatalog.v1.ContactsOrBuilder>
        contactsBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The new value for the Contacts.
     * </pre>
     *
     * <code>
     * .google.cloud.datacatalog.v1.Contacts contacts = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the contacts field is set.
     */
    public boolean hasContacts() {
      return contactsBuilder_ != null || contacts_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. The new value for the Contacts.
     * </pre>
     *
     * <code>
     * .google.cloud.datacatalog.v1.Contacts contacts = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The contacts.
     */
    public com.google.cloud.datacatalog.v1.Contacts getContacts() {
      if (contactsBuilder_ == null) {
        return contacts_ == null
            ? com.google.cloud.datacatalog.v1.Contacts.getDefaultInstance()
            : contacts_;
      } else {
        return contactsBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The new value for the Contacts.
     * </pre>
     *
     * <code>
     * .google.cloud.datacatalog.v1.Contacts contacts = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setContacts(com.google.cloud.datacatalog.v1.Contacts value) {
      if (contactsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        contacts_ = value;
        onChanged();
      } else {
        contactsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The new value for the Contacts.
     * </pre>
     *
     * <code>
     * .google.cloud.datacatalog.v1.Contacts contacts = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setContacts(com.google.cloud.datacatalog.v1.Contacts.Builder builderForValue) {
      if (contactsBuilder_ == null) {
        contacts_ = builderForValue.build();
        onChanged();
      } else {
        contactsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The new value for the Contacts.
     * </pre>
     *
     * <code>
     * .google.cloud.datacatalog.v1.Contacts contacts = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeContacts(com.google.cloud.datacatalog.v1.Contacts value) {
      if (contactsBuilder_ == null) {
        if (contacts_ != null) {
          contacts_ =
              com.google.cloud.datacatalog.v1.Contacts.newBuilder(contacts_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          contacts_ = value;
        }
        onChanged();
      } else {
        contactsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The new value for the Contacts.
     * </pre>
     *
     * <code>
     * .google.cloud.datacatalog.v1.Contacts contacts = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearContacts() {
      if (contactsBuilder_ == null) {
        contacts_ = null;
        onChanged();
      } else {
        contacts_ = null;
        contactsBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The new value for the Contacts.
     * </pre>
     *
     * <code>
     * .google.cloud.datacatalog.v1.Contacts contacts = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.datacatalog.v1.Contacts.Builder getContactsBuilder() {

      onChanged();
      return getContactsFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The new value for the Contacts.
     * </pre>
     *
     * <code>
     * .google.cloud.datacatalog.v1.Contacts contacts = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.datacatalog.v1.ContactsOrBuilder getContactsOrBuilder() {
      if (contactsBuilder_ != null) {
        return contactsBuilder_.getMessageOrBuilder();
      } else {
        return contacts_ == null
            ? com.google.cloud.datacatalog.v1.Contacts.getDefaultInstance()
            : contacts_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The new value for the Contacts.
     * </pre>
     *
     * <code>
     * .google.cloud.datacatalog.v1.Contacts contacts = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.datacatalog.v1.Contacts,
            com.google.cloud.datacatalog.v1.Contacts.Builder,
            com.google.cloud.datacatalog.v1.ContactsOrBuilder>
        getContactsFieldBuilder() {
      if (contactsBuilder_ == null) {
        contactsBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.datacatalog.v1.Contacts,
                com.google.cloud.datacatalog.v1.Contacts.Builder,
                com.google.cloud.datacatalog.v1.ContactsOrBuilder>(
                getContacts(), getParentForChildren(), isClean());
        contacts_ = null;
      }
      return contactsBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.datacatalog.v1.ModifyEntryContactsRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.datacatalog.v1.ModifyEntryContactsRequest)
  private static final com.google.cloud.datacatalog.v1.ModifyEntryContactsRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.datacatalog.v1.ModifyEntryContactsRequest();
  }

  public static com.google.cloud.datacatalog.v1.ModifyEntryContactsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ModifyEntryContactsRequest> PARSER =
      new com.google.protobuf.AbstractParser<ModifyEntryContactsRequest>() {
        @java.lang.Override
        public ModifyEntryContactsRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<ModifyEntryContactsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ModifyEntryContactsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.datacatalog.v1.ModifyEntryContactsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}