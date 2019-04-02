// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datalabeling/v1beta1/data_labeling_service.proto

package com.google.cloud.datalabeling.v1beta1;

public interface CreateInstructionRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datalabeling.v1beta1.CreateInstructionRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Instruction resource parent, format:
   * projects/{project_id}
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. Instruction resource parent, format:
   * projects/{project_id}
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. Instruction of how to perform the labeling task.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.Instruction instruction = 2;</code>
   */
  boolean hasInstruction();
  /**
   *
   *
   * <pre>
   * Required. Instruction of how to perform the labeling task.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.Instruction instruction = 2;</code>
   */
  com.google.cloud.datalabeling.v1beta1.Instruction getInstruction();
  /**
   *
   *
   * <pre>
   * Required. Instruction of how to perform the labeling task.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.Instruction instruction = 2;</code>
   */
  com.google.cloud.datalabeling.v1beta1.InstructionOrBuilder getInstructionOrBuilder();
}
