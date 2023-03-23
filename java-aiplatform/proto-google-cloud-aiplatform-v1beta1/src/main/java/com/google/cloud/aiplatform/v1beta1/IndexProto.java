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
// source: google/cloud/aiplatform/v1beta1/index.proto

package com.google.cloud.aiplatform.v1beta1;

public final class IndexProto {
  private IndexProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_Index_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_Index_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_Index_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_Index_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_IndexDatapoint_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_IndexDatapoint_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_IndexDatapoint_Restriction_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_IndexDatapoint_Restriction_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_IndexDatapoint_CrowdingTag_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_IndexDatapoint_CrowdingTag_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_IndexStats_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_IndexStats_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n+google/cloud/aiplatform/v1beta1/index."
          + "proto\022\037google.cloud.aiplatform.v1beta1\032\037"
          + "google/api/field_behavior.proto\032\031google/"
          + "api/resource.proto\0328google/cloud/aiplatf"
          + "orm/v1beta1/deployed_index_ref.proto\032\034go"
          + "ogle/protobuf/struct.proto\032\037google/proto"
          + "buf/timestamp.proto\"\266\006\n\005Index\022\021\n\004name\030\001 "
          + "\001(\tB\003\340A\003\022\031\n\014display_name\030\002 \001(\tB\003\340A\002\022\023\n\013d"
          + "escription\030\003 \001(\t\022 \n\023metadata_schema_uri\030"
          + "\004 \001(\tB\003\340A\005\022(\n\010metadata\030\006 \001(\0132\026.google.pr"
          + "otobuf.Value\022P\n\020deployed_indexes\030\007 \003(\01321"
          + ".google.cloud.aiplatform.v1beta1.Deploye"
          + "dIndexRefB\003\340A\003\022\014\n\004etag\030\010 \001(\t\022B\n\006labels\030\t"
          + " \003(\01322.google.cloud.aiplatform.v1beta1.I"
          + "ndex.LabelsEntry\0224\n\013create_time\030\n \001(\0132\032."
          + "google.protobuf.TimestampB\003\340A\003\0224\n\013update"
          + "_time\030\013 \001(\0132\032.google.protobuf.TimestampB"
          + "\003\340A\003\022E\n\013index_stats\030\016 \001(\0132+.google.cloud"
          + ".aiplatform.v1beta1.IndexStatsB\003\340A\003\022Z\n\023i"
          + "ndex_update_method\030\020 \001(\01628.google.cloud."
          + "aiplatform.v1beta1.Index.IndexUpdateMeth"
          + "odB\003\340A\005\032-\n\013LabelsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005v"
          + "alue\030\002 \001(\t:\0028\001\"]\n\021IndexUpdateMethod\022#\n\037I"
          + "NDEX_UPDATE_METHOD_UNSPECIFIED\020\000\022\020\n\014BATC"
          + "H_UPDATE\020\001\022\021\n\rSTREAM_UPDATE\020\002:]\352AZ\n\037aipl"
          + "atform.googleapis.com/Index\0227projects/{p"
          + "roject}/locations/{location}/indexes/{in"
          + "dex}\"\351\002\n\016IndexDatapoint\022\031\n\014datapoint_id\030"
          + "\001 \001(\tB\003\340A\002\022\033\n\016feature_vector\030\002 \003(\002B\003\340A\002\022"
          + "S\n\trestricts\030\004 \003(\0132;.google.cloud.aiplat"
          + "form.v1beta1.IndexDatapoint.RestrictionB"
          + "\003\340A\001\022V\n\014crowding_tag\030\005 \001(\0132;.google.clou"
          + "d.aiplatform.v1beta1.IndexDatapoint.Crow"
          + "dingTagB\003\340A\001\032G\n\013Restriction\022\021\n\tnamespace"
          + "\030\001 \001(\t\022\022\n\nallow_list\030\002 \003(\t\022\021\n\tdeny_list\030"
          + "\003 \003(\t\032)\n\013CrowdingTag\022\032\n\022crowding_attribu"
          + "te\030\001 \001(\t\"C\n\nIndexStats\022\032\n\rvectors_count\030"
          + "\001 \001(\003B\003\340A\003\022\031\n\014shards_count\030\002 \001(\005B\003\340A\003B\347\001"
          + "\n#com.google.cloud.aiplatform.v1beta1B\nI"
          + "ndexProtoP\001ZIgoogle.golang.org/genproto/"
          + "googleapis/cloud/aiplatform/v1beta1;aipl"
          + "atform\252\002\037Google.Cloud.AIPlatform.V1Beta1"
          + "\312\002\037Google\\Cloud\\AIPlatform\\V1beta1\352\002\"Goo"
          + "gle::Cloud::AIPlatform::V1beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.DeployedIndexRefProto.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1beta1_Index_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_Index_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_Index_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "Description",
              "MetadataSchemaUri",
              "Metadata",
              "DeployedIndexes",
              "Etag",
              "Labels",
              "CreateTime",
              "UpdateTime",
              "IndexStats",
              "IndexUpdateMethod",
            });
    internal_static_google_cloud_aiplatform_v1beta1_Index_LabelsEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_Index_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_Index_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_Index_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_aiplatform_v1beta1_IndexDatapoint_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1beta1_IndexDatapoint_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_IndexDatapoint_descriptor,
            new java.lang.String[] {
              "DatapointId", "FeatureVector", "Restricts", "CrowdingTag",
            });
    internal_static_google_cloud_aiplatform_v1beta1_IndexDatapoint_Restriction_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_IndexDatapoint_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1beta1_IndexDatapoint_Restriction_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_IndexDatapoint_Restriction_descriptor,
            new java.lang.String[] {
              "Namespace", "AllowList", "DenyList",
            });
    internal_static_google_cloud_aiplatform_v1beta1_IndexDatapoint_CrowdingTag_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_IndexDatapoint_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_aiplatform_v1beta1_IndexDatapoint_CrowdingTag_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_IndexDatapoint_CrowdingTag_descriptor,
            new java.lang.String[] {
              "CrowdingAttribute",
            });
    internal_static_google_cloud_aiplatform_v1beta1_IndexStats_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1beta1_IndexStats_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_IndexStats_descriptor,
            new java.lang.String[] {
              "VectorsCount", "ShardsCount",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.DeployedIndexRefProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
