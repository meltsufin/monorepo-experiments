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
// source: google/cloud/billing/budgets/v1beta1/budget_service.proto

package com.google.cloud.billing.budgets.v1beta1;

/**
 *
 *
 * <pre>
 * Request for CreateBudget
 * </pre>
 *
 * Protobuf type {@code google.cloud.billing.budgets.v1beta1.CreateBudgetRequest}
 */
public final class CreateBudgetRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.billing.budgets.v1beta1.CreateBudgetRequest)
    CreateBudgetRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateBudgetRequest.newBuilder() to construct.
  private CreateBudgetRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateBudgetRequest() {
    parent_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateBudgetRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.billing.budgets.v1beta1.BudgetServiceOuterClass
        .internal_static_google_cloud_billing_budgets_v1beta1_CreateBudgetRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.billing.budgets.v1beta1.BudgetServiceOuterClass
        .internal_static_google_cloud_billing_budgets_v1beta1_CreateBudgetRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.billing.budgets.v1beta1.CreateBudgetRequest.class,
            com.google.cloud.billing.budgets.v1beta1.CreateBudgetRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   *
   *
   * <pre>
   * Required. The name of the billing account to create the budget in. Values
   * are of the form `billingAccounts/{billingAccountId}`.
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
   * Required. The name of the billing account to create the budget in. Values
   * are of the form `billingAccounts/{billingAccountId}`.
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

  public static final int BUDGET_FIELD_NUMBER = 2;
  private com.google.cloud.billing.budgets.v1beta1.Budget budget_;
  /**
   *
   *
   * <pre>
   * Required. Budget to create.
   * </pre>
   *
   * <code>
   * .google.cloud.billing.budgets.v1beta1.Budget budget = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the budget field is set.
   */
  @java.lang.Override
  public boolean hasBudget() {
    return budget_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. Budget to create.
   * </pre>
   *
   * <code>
   * .google.cloud.billing.budgets.v1beta1.Budget budget = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The budget.
   */
  @java.lang.Override
  public com.google.cloud.billing.budgets.v1beta1.Budget getBudget() {
    return budget_ == null
        ? com.google.cloud.billing.budgets.v1beta1.Budget.getDefaultInstance()
        : budget_;
  }
  /**
   *
   *
   * <pre>
   * Required. Budget to create.
   * </pre>
   *
   * <code>
   * .google.cloud.billing.budgets.v1beta1.Budget budget = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.billing.budgets.v1beta1.BudgetOrBuilder getBudgetOrBuilder() {
    return getBudget();
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
    if (budget_ != null) {
      output.writeMessage(2, getBudget());
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
    if (budget_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getBudget());
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
    if (!(obj instanceof com.google.cloud.billing.budgets.v1beta1.CreateBudgetRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.billing.budgets.v1beta1.CreateBudgetRequest other =
        (com.google.cloud.billing.budgets.v1beta1.CreateBudgetRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (hasBudget() != other.hasBudget()) return false;
    if (hasBudget()) {
      if (!getBudget().equals(other.getBudget())) return false;
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
    if (hasBudget()) {
      hash = (37 * hash) + BUDGET_FIELD_NUMBER;
      hash = (53 * hash) + getBudget().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.billing.budgets.v1beta1.CreateBudgetRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.billing.budgets.v1beta1.CreateBudgetRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.billing.budgets.v1beta1.CreateBudgetRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.billing.budgets.v1beta1.CreateBudgetRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.billing.budgets.v1beta1.CreateBudgetRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.billing.budgets.v1beta1.CreateBudgetRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.billing.budgets.v1beta1.CreateBudgetRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.billing.budgets.v1beta1.CreateBudgetRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.billing.budgets.v1beta1.CreateBudgetRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.billing.budgets.v1beta1.CreateBudgetRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.billing.budgets.v1beta1.CreateBudgetRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.billing.budgets.v1beta1.CreateBudgetRequest parseFrom(
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
      com.google.cloud.billing.budgets.v1beta1.CreateBudgetRequest prototype) {
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
   * Request for CreateBudget
   * </pre>
   *
   * Protobuf type {@code google.cloud.billing.budgets.v1beta1.CreateBudgetRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.billing.budgets.v1beta1.CreateBudgetRequest)
      com.google.cloud.billing.budgets.v1beta1.CreateBudgetRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.billing.budgets.v1beta1.BudgetServiceOuterClass
          .internal_static_google_cloud_billing_budgets_v1beta1_CreateBudgetRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.billing.budgets.v1beta1.BudgetServiceOuterClass
          .internal_static_google_cloud_billing_budgets_v1beta1_CreateBudgetRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.billing.budgets.v1beta1.CreateBudgetRequest.class,
              com.google.cloud.billing.budgets.v1beta1.CreateBudgetRequest.Builder.class);
    }

    // Construct using com.google.cloud.billing.budgets.v1beta1.CreateBudgetRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      parent_ = "";

      if (budgetBuilder_ == null) {
        budget_ = null;
      } else {
        budget_ = null;
        budgetBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.billing.budgets.v1beta1.BudgetServiceOuterClass
          .internal_static_google_cloud_billing_budgets_v1beta1_CreateBudgetRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.billing.budgets.v1beta1.CreateBudgetRequest
        getDefaultInstanceForType() {
      return com.google.cloud.billing.budgets.v1beta1.CreateBudgetRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.billing.budgets.v1beta1.CreateBudgetRequest build() {
      com.google.cloud.billing.budgets.v1beta1.CreateBudgetRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.billing.budgets.v1beta1.CreateBudgetRequest buildPartial() {
      com.google.cloud.billing.budgets.v1beta1.CreateBudgetRequest result =
          new com.google.cloud.billing.budgets.v1beta1.CreateBudgetRequest(this);
      result.parent_ = parent_;
      if (budgetBuilder_ == null) {
        result.budget_ = budget_;
      } else {
        result.budget_ = budgetBuilder_.build();
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
      if (other instanceof com.google.cloud.billing.budgets.v1beta1.CreateBudgetRequest) {
        return mergeFrom((com.google.cloud.billing.budgets.v1beta1.CreateBudgetRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.billing.budgets.v1beta1.CreateBudgetRequest other) {
      if (other
          == com.google.cloud.billing.budgets.v1beta1.CreateBudgetRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (other.hasBudget()) {
        mergeBudget(other.getBudget());
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
                input.readMessage(getBudgetFieldBuilder().getBuilder(), extensionRegistry);

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
     * Required. The name of the billing account to create the budget in. Values
     * are of the form `billingAccounts/{billingAccountId}`.
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
     * Required. The name of the billing account to create the budget in. Values
     * are of the form `billingAccounts/{billingAccountId}`.
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
     * Required. The name of the billing account to create the budget in. Values
     * are of the form `billingAccounts/{billingAccountId}`.
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
     * Required. The name of the billing account to create the budget in. Values
     * are of the form `billingAccounts/{billingAccountId}`.
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
     * Required. The name of the billing account to create the budget in. Values
     * are of the form `billingAccounts/{billingAccountId}`.
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

    private com.google.cloud.billing.budgets.v1beta1.Budget budget_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.billing.budgets.v1beta1.Budget,
            com.google.cloud.billing.budgets.v1beta1.Budget.Builder,
            com.google.cloud.billing.budgets.v1beta1.BudgetOrBuilder>
        budgetBuilder_;
    /**
     *
     *
     * <pre>
     * Required. Budget to create.
     * </pre>
     *
     * <code>
     * .google.cloud.billing.budgets.v1beta1.Budget budget = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the budget field is set.
     */
    public boolean hasBudget() {
      return budgetBuilder_ != null || budget_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. Budget to create.
     * </pre>
     *
     * <code>
     * .google.cloud.billing.budgets.v1beta1.Budget budget = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The budget.
     */
    public com.google.cloud.billing.budgets.v1beta1.Budget getBudget() {
      if (budgetBuilder_ == null) {
        return budget_ == null
            ? com.google.cloud.billing.budgets.v1beta1.Budget.getDefaultInstance()
            : budget_;
      } else {
        return budgetBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Budget to create.
     * </pre>
     *
     * <code>
     * .google.cloud.billing.budgets.v1beta1.Budget budget = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setBudget(com.google.cloud.billing.budgets.v1beta1.Budget value) {
      if (budgetBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        budget_ = value;
        onChanged();
      } else {
        budgetBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Budget to create.
     * </pre>
     *
     * <code>
     * .google.cloud.billing.budgets.v1beta1.Budget budget = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setBudget(
        com.google.cloud.billing.budgets.v1beta1.Budget.Builder builderForValue) {
      if (budgetBuilder_ == null) {
        budget_ = builderForValue.build();
        onChanged();
      } else {
        budgetBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Budget to create.
     * </pre>
     *
     * <code>
     * .google.cloud.billing.budgets.v1beta1.Budget budget = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeBudget(com.google.cloud.billing.budgets.v1beta1.Budget value) {
      if (budgetBuilder_ == null) {
        if (budget_ != null) {
          budget_ =
              com.google.cloud.billing.budgets.v1beta1.Budget.newBuilder(budget_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          budget_ = value;
        }
        onChanged();
      } else {
        budgetBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Budget to create.
     * </pre>
     *
     * <code>
     * .google.cloud.billing.budgets.v1beta1.Budget budget = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearBudget() {
      if (budgetBuilder_ == null) {
        budget_ = null;
        onChanged();
      } else {
        budget_ = null;
        budgetBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Budget to create.
     * </pre>
     *
     * <code>
     * .google.cloud.billing.budgets.v1beta1.Budget budget = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.billing.budgets.v1beta1.Budget.Builder getBudgetBuilder() {

      onChanged();
      return getBudgetFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. Budget to create.
     * </pre>
     *
     * <code>
     * .google.cloud.billing.budgets.v1beta1.Budget budget = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.billing.budgets.v1beta1.BudgetOrBuilder getBudgetOrBuilder() {
      if (budgetBuilder_ != null) {
        return budgetBuilder_.getMessageOrBuilder();
      } else {
        return budget_ == null
            ? com.google.cloud.billing.budgets.v1beta1.Budget.getDefaultInstance()
            : budget_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Budget to create.
     * </pre>
     *
     * <code>
     * .google.cloud.billing.budgets.v1beta1.Budget budget = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.billing.budgets.v1beta1.Budget,
            com.google.cloud.billing.budgets.v1beta1.Budget.Builder,
            com.google.cloud.billing.budgets.v1beta1.BudgetOrBuilder>
        getBudgetFieldBuilder() {
      if (budgetBuilder_ == null) {
        budgetBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.billing.budgets.v1beta1.Budget,
                com.google.cloud.billing.budgets.v1beta1.Budget.Builder,
                com.google.cloud.billing.budgets.v1beta1.BudgetOrBuilder>(
                getBudget(), getParentForChildren(), isClean());
        budget_ = null;
      }
      return budgetBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.billing.budgets.v1beta1.CreateBudgetRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.billing.budgets.v1beta1.CreateBudgetRequest)
  private static final com.google.cloud.billing.budgets.v1beta1.CreateBudgetRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.billing.budgets.v1beta1.CreateBudgetRequest();
  }

  public static com.google.cloud.billing.budgets.v1beta1.CreateBudgetRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateBudgetRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateBudgetRequest>() {
        @java.lang.Override
        public CreateBudgetRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateBudgetRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateBudgetRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.billing.budgets.v1beta1.CreateBudgetRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}