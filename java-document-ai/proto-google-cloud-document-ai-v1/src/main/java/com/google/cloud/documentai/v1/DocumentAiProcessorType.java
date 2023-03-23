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
// source: google/cloud/documentai/v1/processor_type.proto

package com.google.cloud.documentai.v1;

public final class DocumentAiProcessorType {
  private DocumentAiProcessorType() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1_ProcessorType_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1_ProcessorType_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1_ProcessorType_LocationInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1_ProcessorType_LocationInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n/google/cloud/documentai/v1/processor_t"
          + "ype.proto\022\032google.cloud.documentai.v1\032\035g"
          + "oogle/api/launch_stage.proto\032\031google/api"
          + "/resource.proto\"\365\002\n\rProcessorType\022\014\n\004nam"
          + "e\030\001 \001(\t\022\014\n\004type\030\002 \001(\t\022\020\n\010category\030\003 \001(\t\022"
          + "S\n\023available_locations\030\004 \003(\01326.google.cl"
          + "oud.documentai.v1.ProcessorType.Location"
          + "Info\022\026\n\016allow_creation\030\006 \001(\010\022-\n\014launch_s"
          + "tage\030\010 \001(\0162\027.google.api.LaunchStage\032#\n\014L"
          + "ocationInfo\022\023\n\013location_id\030\001 \001(\t:u\352Ar\n\'d"
          + "ocumentai.googleapis.com/ProcessorType\022G"
          + "projects/{project}/locations/{location}/"
          + "processorTypes/{processor_type}B\333\001\n\036com."
          + "google.cloud.documentai.v1B\027DocumentAiPr"
          + "ocessorTypeP\001ZDgoogle.golang.org/genprot"
          + "o/googleapis/cloud/documentai/v1;documen"
          + "tai\252\002\032Google.Cloud.DocumentAI.V1\312\002\032Googl"
          + "e\\Cloud\\DocumentAI\\V1\352\002\035Google::Cloud::D"
          + "ocumentAI::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.LaunchStageProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
            });
    internal_static_google_cloud_documentai_v1_ProcessorType_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_documentai_v1_ProcessorType_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1_ProcessorType_descriptor,
            new java.lang.String[] {
              "Name", "Type", "Category", "AvailableLocations", "AllowCreation", "LaunchStage",
            });
    internal_static_google_cloud_documentai_v1_ProcessorType_LocationInfo_descriptor =
        internal_static_google_cloud_documentai_v1_ProcessorType_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_documentai_v1_ProcessorType_LocationInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1_ProcessorType_LocationInfo_descriptor,
            new java.lang.String[] {
              "LocationId",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.LaunchStageProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
