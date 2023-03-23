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
// source: google/cloud/channel/v1/service.proto

package com.google.cloud.channel.v1;

/**
 *
 *
 * <pre>
 * SKU that you can purchase. This is used in ListPurchasableSku API
 * response.
 * </pre>
 *
 * Protobuf type {@code google.cloud.channel.v1.PurchasableSku}
 */
public final class PurchasableSku extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.channel.v1.PurchasableSku)
    PurchasableSkuOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use PurchasableSku.newBuilder() to construct.
  private PurchasableSku(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private PurchasableSku() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new PurchasableSku();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.channel.v1.ServiceProto
        .internal_static_google_cloud_channel_v1_PurchasableSku_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.channel.v1.ServiceProto
        .internal_static_google_cloud_channel_v1_PurchasableSku_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.channel.v1.PurchasableSku.class,
            com.google.cloud.channel.v1.PurchasableSku.Builder.class);
  }

  public static final int SKU_FIELD_NUMBER = 1;
  private com.google.cloud.channel.v1.Sku sku_;
  /**
   *
   *
   * <pre>
   * SKU
   * </pre>
   *
   * <code>.google.cloud.channel.v1.Sku sku = 1;</code>
   *
   * @return Whether the sku field is set.
   */
  @java.lang.Override
  public boolean hasSku() {
    return sku_ != null;
  }
  /**
   *
   *
   * <pre>
   * SKU
   * </pre>
   *
   * <code>.google.cloud.channel.v1.Sku sku = 1;</code>
   *
   * @return The sku.
   */
  @java.lang.Override
  public com.google.cloud.channel.v1.Sku getSku() {
    return sku_ == null ? com.google.cloud.channel.v1.Sku.getDefaultInstance() : sku_;
  }
  /**
   *
   *
   * <pre>
   * SKU
   * </pre>
   *
   * <code>.google.cloud.channel.v1.Sku sku = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.channel.v1.SkuOrBuilder getSkuOrBuilder() {
    return getSku();
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
    if (sku_ != null) {
      output.writeMessage(1, getSku());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (sku_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getSku());
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
    if (!(obj instanceof com.google.cloud.channel.v1.PurchasableSku)) {
      return super.equals(obj);
    }
    com.google.cloud.channel.v1.PurchasableSku other =
        (com.google.cloud.channel.v1.PurchasableSku) obj;

    if (hasSku() != other.hasSku()) return false;
    if (hasSku()) {
      if (!getSku().equals(other.getSku())) return false;
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
    if (hasSku()) {
      hash = (37 * hash) + SKU_FIELD_NUMBER;
      hash = (53 * hash) + getSku().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.channel.v1.PurchasableSku parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.channel.v1.PurchasableSku parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.PurchasableSku parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.channel.v1.PurchasableSku parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.PurchasableSku parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.channel.v1.PurchasableSku parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.PurchasableSku parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.channel.v1.PurchasableSku parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.PurchasableSku parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.channel.v1.PurchasableSku parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.PurchasableSku parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.channel.v1.PurchasableSku parseFrom(
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

  public static Builder newBuilder(com.google.cloud.channel.v1.PurchasableSku prototype) {
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
   * SKU that you can purchase. This is used in ListPurchasableSku API
   * response.
   * </pre>
   *
   * Protobuf type {@code google.cloud.channel.v1.PurchasableSku}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.channel.v1.PurchasableSku)
      com.google.cloud.channel.v1.PurchasableSkuOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.channel.v1.ServiceProto
          .internal_static_google_cloud_channel_v1_PurchasableSku_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.channel.v1.ServiceProto
          .internal_static_google_cloud_channel_v1_PurchasableSku_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.channel.v1.PurchasableSku.class,
              com.google.cloud.channel.v1.PurchasableSku.Builder.class);
    }

    // Construct using com.google.cloud.channel.v1.PurchasableSku.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (skuBuilder_ == null) {
        sku_ = null;
      } else {
        sku_ = null;
        skuBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.channel.v1.ServiceProto
          .internal_static_google_cloud_channel_v1_PurchasableSku_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.channel.v1.PurchasableSku getDefaultInstanceForType() {
      return com.google.cloud.channel.v1.PurchasableSku.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.channel.v1.PurchasableSku build() {
      com.google.cloud.channel.v1.PurchasableSku result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.channel.v1.PurchasableSku buildPartial() {
      com.google.cloud.channel.v1.PurchasableSku result =
          new com.google.cloud.channel.v1.PurchasableSku(this);
      if (skuBuilder_ == null) {
        result.sku_ = sku_;
      } else {
        result.sku_ = skuBuilder_.build();
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
      if (other instanceof com.google.cloud.channel.v1.PurchasableSku) {
        return mergeFrom((com.google.cloud.channel.v1.PurchasableSku) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.channel.v1.PurchasableSku other) {
      if (other == com.google.cloud.channel.v1.PurchasableSku.getDefaultInstance()) return this;
      if (other.hasSku()) {
        mergeSku(other.getSku());
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
                input.readMessage(getSkuFieldBuilder().getBuilder(), extensionRegistry);

                break;
              } // case 10
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

    private com.google.cloud.channel.v1.Sku sku_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.channel.v1.Sku,
            com.google.cloud.channel.v1.Sku.Builder,
            com.google.cloud.channel.v1.SkuOrBuilder>
        skuBuilder_;
    /**
     *
     *
     * <pre>
     * SKU
     * </pre>
     *
     * <code>.google.cloud.channel.v1.Sku sku = 1;</code>
     *
     * @return Whether the sku field is set.
     */
    public boolean hasSku() {
      return skuBuilder_ != null || sku_ != null;
    }
    /**
     *
     *
     * <pre>
     * SKU
     * </pre>
     *
     * <code>.google.cloud.channel.v1.Sku sku = 1;</code>
     *
     * @return The sku.
     */
    public com.google.cloud.channel.v1.Sku getSku() {
      if (skuBuilder_ == null) {
        return sku_ == null ? com.google.cloud.channel.v1.Sku.getDefaultInstance() : sku_;
      } else {
        return skuBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * SKU
     * </pre>
     *
     * <code>.google.cloud.channel.v1.Sku sku = 1;</code>
     */
    public Builder setSku(com.google.cloud.channel.v1.Sku value) {
      if (skuBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        sku_ = value;
        onChanged();
      } else {
        skuBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * SKU
     * </pre>
     *
     * <code>.google.cloud.channel.v1.Sku sku = 1;</code>
     */
    public Builder setSku(com.google.cloud.channel.v1.Sku.Builder builderForValue) {
      if (skuBuilder_ == null) {
        sku_ = builderForValue.build();
        onChanged();
      } else {
        skuBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * SKU
     * </pre>
     *
     * <code>.google.cloud.channel.v1.Sku sku = 1;</code>
     */
    public Builder mergeSku(com.google.cloud.channel.v1.Sku value) {
      if (skuBuilder_ == null) {
        if (sku_ != null) {
          sku_ = com.google.cloud.channel.v1.Sku.newBuilder(sku_).mergeFrom(value).buildPartial();
        } else {
          sku_ = value;
        }
        onChanged();
      } else {
        skuBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * SKU
     * </pre>
     *
     * <code>.google.cloud.channel.v1.Sku sku = 1;</code>
     */
    public Builder clearSku() {
      if (skuBuilder_ == null) {
        sku_ = null;
        onChanged();
      } else {
        sku_ = null;
        skuBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * SKU
     * </pre>
     *
     * <code>.google.cloud.channel.v1.Sku sku = 1;</code>
     */
    public com.google.cloud.channel.v1.Sku.Builder getSkuBuilder() {

      onChanged();
      return getSkuFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * SKU
     * </pre>
     *
     * <code>.google.cloud.channel.v1.Sku sku = 1;</code>
     */
    public com.google.cloud.channel.v1.SkuOrBuilder getSkuOrBuilder() {
      if (skuBuilder_ != null) {
        return skuBuilder_.getMessageOrBuilder();
      } else {
        return sku_ == null ? com.google.cloud.channel.v1.Sku.getDefaultInstance() : sku_;
      }
    }
    /**
     *
     *
     * <pre>
     * SKU
     * </pre>
     *
     * <code>.google.cloud.channel.v1.Sku sku = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.channel.v1.Sku,
            com.google.cloud.channel.v1.Sku.Builder,
            com.google.cloud.channel.v1.SkuOrBuilder>
        getSkuFieldBuilder() {
      if (skuBuilder_ == null) {
        skuBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.channel.v1.Sku,
                com.google.cloud.channel.v1.Sku.Builder,
                com.google.cloud.channel.v1.SkuOrBuilder>(
                getSku(), getParentForChildren(), isClean());
        sku_ = null;
      }
      return skuBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.channel.v1.PurchasableSku)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.channel.v1.PurchasableSku)
  private static final com.google.cloud.channel.v1.PurchasableSku DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.channel.v1.PurchasableSku();
  }

  public static com.google.cloud.channel.v1.PurchasableSku getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PurchasableSku> PARSER =
      new com.google.protobuf.AbstractParser<PurchasableSku>() {
        @java.lang.Override
        public PurchasableSku parsePartialFrom(
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

  public static com.google.protobuf.Parser<PurchasableSku> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PurchasableSku> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.channel.v1.PurchasableSku getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
