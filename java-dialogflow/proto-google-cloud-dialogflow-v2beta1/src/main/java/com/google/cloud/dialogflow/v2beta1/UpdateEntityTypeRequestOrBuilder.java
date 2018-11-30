// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2beta1/entity_type.proto

package com.google.cloud.dialogflow.v2beta1;

public interface UpdateEntityTypeRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2beta1.UpdateEntityTypeRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The entity type to update.
   * Format: `projects/&lt;Project ID&gt;/agent/entityTypes/&lt;EntityType ID&gt;`.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.EntityType entity_type = 1;</code>
   */
  boolean hasEntityType();
  /**
   *
   *
   * <pre>
   * Required. The entity type to update.
   * Format: `projects/&lt;Project ID&gt;/agent/entityTypes/&lt;EntityType ID&gt;`.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.EntityType entity_type = 1;</code>
   */
  com.google.cloud.dialogflow.v2beta1.EntityType getEntityType();
  /**
   *
   *
   * <pre>
   * Required. The entity type to update.
   * Format: `projects/&lt;Project ID&gt;/agent/entityTypes/&lt;EntityType ID&gt;`.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.EntityType entity_type = 1;</code>
   */
  com.google.cloud.dialogflow.v2beta1.EntityTypeOrBuilder getEntityTypeOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The language of entity synonyms defined in `entity_type`. If not
   * specified, the agent's default language is used.
   * [More than a dozen
   * languages](https://dialogflow.com/docs/reference/language) are supported.
   * Note: languages must be enabled in the agent, before they can be used.
   * </pre>
   *
   * <code>string language_code = 2;</code>
   */
  java.lang.String getLanguageCode();
  /**
   *
   *
   * <pre>
   * Optional. The language of entity synonyms defined in `entity_type`. If not
   * specified, the agent's default language is used.
   * [More than a dozen
   * languages](https://dialogflow.com/docs/reference/language) are supported.
   * Note: languages must be enabled in the agent, before they can be used.
   * </pre>
   *
   * <code>string language_code = 2;</code>
   */
  com.google.protobuf.ByteString getLanguageCodeBytes();

  /**
   *
   *
   * <pre>
   * Optional. The mask to control which fields get updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * Optional. The mask to control which fields get updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * Optional. The mask to control which fields get updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
