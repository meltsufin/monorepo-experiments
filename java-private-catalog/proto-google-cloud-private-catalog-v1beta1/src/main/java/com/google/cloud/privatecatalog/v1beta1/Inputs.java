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
// source: google/cloud/privatecatalog/v1beta1/private_catalog.proto

package com.google.cloud.privatecatalog.v1beta1;

/**
 *
 *
 * <pre>
 * Defines definition of input parameters of asset templates.
 * </pre>
 *
 * Protobuf type {@code google.cloud.privatecatalog.v1beta1.Inputs}
 */
public final class Inputs extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.privatecatalog.v1beta1.Inputs)
    InputsOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use Inputs.newBuilder() to construct.
  private Inputs(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Inputs() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Inputs();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.privatecatalog.v1beta1.PrivateCatalogProto
        .internal_static_google_cloud_privatecatalog_v1beta1_Inputs_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.privatecatalog.v1beta1.PrivateCatalogProto
        .internal_static_google_cloud_privatecatalog_v1beta1_Inputs_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.privatecatalog.v1beta1.Inputs.class,
            com.google.cloud.privatecatalog.v1beta1.Inputs.Builder.class);
  }

  public static final int PARAMETERS_FIELD_NUMBER = 1;
  private com.google.protobuf.Struct parameters_;
  /**
   *
   *
   * <pre>
   * Output only. The JSON schema defining the inputs and their formats.
   * </pre>
   *
   * <code>.google.protobuf.Struct parameters = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the parameters field is set.
   */
  @java.lang.Override
  public boolean hasParameters() {
    return parameters_ != null;
  }
  /**
   *
   *
   * <pre>
   * Output only. The JSON schema defining the inputs and their formats.
   * </pre>
   *
   * <code>.google.protobuf.Struct parameters = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The parameters.
   */
  @java.lang.Override
  public com.google.protobuf.Struct getParameters() {
    return parameters_ == null ? com.google.protobuf.Struct.getDefaultInstance() : parameters_;
  }
  /**
   *
   *
   * <pre>
   * Output only. The JSON schema defining the inputs and their formats.
   * </pre>
   *
   * <code>.google.protobuf.Struct parameters = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  @java.lang.Override
  public com.google.protobuf.StructOrBuilder getParametersOrBuilder() {
    return getParameters();
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
    if (parameters_ != null) {
      output.writeMessage(1, getParameters());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (parameters_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getParameters());
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
    if (!(obj instanceof com.google.cloud.privatecatalog.v1beta1.Inputs)) {
      return super.equals(obj);
    }
    com.google.cloud.privatecatalog.v1beta1.Inputs other =
        (com.google.cloud.privatecatalog.v1beta1.Inputs) obj;

    if (hasParameters() != other.hasParameters()) return false;
    if (hasParameters()) {
      if (!getParameters().equals(other.getParameters())) return false;
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
    if (hasParameters()) {
      hash = (37 * hash) + PARAMETERS_FIELD_NUMBER;
      hash = (53 * hash) + getParameters().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.privatecatalog.v1beta1.Inputs parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.privatecatalog.v1beta1.Inputs parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.privatecatalog.v1beta1.Inputs parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.privatecatalog.v1beta1.Inputs parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.privatecatalog.v1beta1.Inputs parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.privatecatalog.v1beta1.Inputs parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.privatecatalog.v1beta1.Inputs parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.privatecatalog.v1beta1.Inputs parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.privatecatalog.v1beta1.Inputs parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.privatecatalog.v1beta1.Inputs parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.privatecatalog.v1beta1.Inputs parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.privatecatalog.v1beta1.Inputs parseFrom(
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

  public static Builder newBuilder(com.google.cloud.privatecatalog.v1beta1.Inputs prototype) {
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
   * Defines definition of input parameters of asset templates.
   * </pre>
   *
   * Protobuf type {@code google.cloud.privatecatalog.v1beta1.Inputs}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.privatecatalog.v1beta1.Inputs)
      com.google.cloud.privatecatalog.v1beta1.InputsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.privatecatalog.v1beta1.PrivateCatalogProto
          .internal_static_google_cloud_privatecatalog_v1beta1_Inputs_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.privatecatalog.v1beta1.PrivateCatalogProto
          .internal_static_google_cloud_privatecatalog_v1beta1_Inputs_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.privatecatalog.v1beta1.Inputs.class,
              com.google.cloud.privatecatalog.v1beta1.Inputs.Builder.class);
    }

    // Construct using com.google.cloud.privatecatalog.v1beta1.Inputs.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (parametersBuilder_ == null) {
        parameters_ = null;
      } else {
        parameters_ = null;
        parametersBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.privatecatalog.v1beta1.PrivateCatalogProto
          .internal_static_google_cloud_privatecatalog_v1beta1_Inputs_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.privatecatalog.v1beta1.Inputs getDefaultInstanceForType() {
      return com.google.cloud.privatecatalog.v1beta1.Inputs.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.privatecatalog.v1beta1.Inputs build() {
      com.google.cloud.privatecatalog.v1beta1.Inputs result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.privatecatalog.v1beta1.Inputs buildPartial() {
      com.google.cloud.privatecatalog.v1beta1.Inputs result =
          new com.google.cloud.privatecatalog.v1beta1.Inputs(this);
      if (parametersBuilder_ == null) {
        result.parameters_ = parameters_;
      } else {
        result.parameters_ = parametersBuilder_.build();
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
      if (other instanceof com.google.cloud.privatecatalog.v1beta1.Inputs) {
        return mergeFrom((com.google.cloud.privatecatalog.v1beta1.Inputs) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.privatecatalog.v1beta1.Inputs other) {
      if (other == com.google.cloud.privatecatalog.v1beta1.Inputs.getDefaultInstance()) return this;
      if (other.hasParameters()) {
        mergeParameters(other.getParameters());
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
                input.readMessage(getParametersFieldBuilder().getBuilder(), extensionRegistry);

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

    private com.google.protobuf.Struct parameters_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Struct,
            com.google.protobuf.Struct.Builder,
            com.google.protobuf.StructOrBuilder>
        parametersBuilder_;
    /**
     *
     *
     * <pre>
     * Output only. The JSON schema defining the inputs and their formats.
     * </pre>
     *
     * <code>.google.protobuf.Struct parameters = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return Whether the parameters field is set.
     */
    public boolean hasParameters() {
      return parametersBuilder_ != null || parameters_ != null;
    }
    /**
     *
     *
     * <pre>
     * Output only. The JSON schema defining the inputs and their formats.
     * </pre>
     *
     * <code>.google.protobuf.Struct parameters = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return The parameters.
     */
    public com.google.protobuf.Struct getParameters() {
      if (parametersBuilder_ == null) {
        return parameters_ == null ? com.google.protobuf.Struct.getDefaultInstance() : parameters_;
      } else {
        return parametersBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The JSON schema defining the inputs and their formats.
     * </pre>
     *
     * <code>.google.protobuf.Struct parameters = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder setParameters(com.google.protobuf.Struct value) {
      if (parametersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        parameters_ = value;
        onChanged();
      } else {
        parametersBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The JSON schema defining the inputs and their formats.
     * </pre>
     *
     * <code>.google.protobuf.Struct parameters = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder setParameters(com.google.protobuf.Struct.Builder builderForValue) {
      if (parametersBuilder_ == null) {
        parameters_ = builderForValue.build();
        onChanged();
      } else {
        parametersBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The JSON schema defining the inputs and their formats.
     * </pre>
     *
     * <code>.google.protobuf.Struct parameters = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder mergeParameters(com.google.protobuf.Struct value) {
      if (parametersBuilder_ == null) {
        if (parameters_ != null) {
          parameters_ =
              com.google.protobuf.Struct.newBuilder(parameters_).mergeFrom(value).buildPartial();
        } else {
          parameters_ = value;
        }
        onChanged();
      } else {
        parametersBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The JSON schema defining the inputs and their formats.
     * </pre>
     *
     * <code>.google.protobuf.Struct parameters = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder clearParameters() {
      if (parametersBuilder_ == null) {
        parameters_ = null;
        onChanged();
      } else {
        parameters_ = null;
        parametersBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The JSON schema defining the inputs and their formats.
     * </pre>
     *
     * <code>.google.protobuf.Struct parameters = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public com.google.protobuf.Struct.Builder getParametersBuilder() {

      onChanged();
      return getParametersFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Output only. The JSON schema defining the inputs and their formats.
     * </pre>
     *
     * <code>.google.protobuf.Struct parameters = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public com.google.protobuf.StructOrBuilder getParametersOrBuilder() {
      if (parametersBuilder_ != null) {
        return parametersBuilder_.getMessageOrBuilder();
      } else {
        return parameters_ == null ? com.google.protobuf.Struct.getDefaultInstance() : parameters_;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The JSON schema defining the inputs and their formats.
     * </pre>
     *
     * <code>.google.protobuf.Struct parameters = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Struct,
            com.google.protobuf.Struct.Builder,
            com.google.protobuf.StructOrBuilder>
        getParametersFieldBuilder() {
      if (parametersBuilder_ == null) {
        parametersBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.Struct,
                com.google.protobuf.Struct.Builder,
                com.google.protobuf.StructOrBuilder>(
                getParameters(), getParentForChildren(), isClean());
        parameters_ = null;
      }
      return parametersBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.privatecatalog.v1beta1.Inputs)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.privatecatalog.v1beta1.Inputs)
  private static final com.google.cloud.privatecatalog.v1beta1.Inputs DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.privatecatalog.v1beta1.Inputs();
  }

  public static com.google.cloud.privatecatalog.v1beta1.Inputs getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Inputs> PARSER =
      new com.google.protobuf.AbstractParser<Inputs>() {
        @java.lang.Override
        public Inputs parsePartialFrom(
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

  public static com.google.protobuf.Parser<Inputs> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Inputs> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.privatecatalog.v1beta1.Inputs getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
