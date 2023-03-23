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
// source: google/cloud/networksecurity/v1beta1/server_tls_policy.proto

package com.google.cloud.networksecurity.v1beta1;

public final class ServerTlsPolicyProto {
  private ServerTlsPolicyProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networksecurity_v1beta1_ServerTlsPolicy_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networksecurity_v1beta1_ServerTlsPolicy_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networksecurity_v1beta1_ServerTlsPolicy_MTLSPolicy_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networksecurity_v1beta1_ServerTlsPolicy_MTLSPolicy_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networksecurity_v1beta1_ServerTlsPolicy_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networksecurity_v1beta1_ServerTlsPolicy_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networksecurity_v1beta1_ListServerTlsPoliciesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networksecurity_v1beta1_ListServerTlsPoliciesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networksecurity_v1beta1_ListServerTlsPoliciesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networksecurity_v1beta1_ListServerTlsPoliciesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networksecurity_v1beta1_GetServerTlsPolicyRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networksecurity_v1beta1_GetServerTlsPolicyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networksecurity_v1beta1_CreateServerTlsPolicyRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networksecurity_v1beta1_CreateServerTlsPolicyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networksecurity_v1beta1_UpdateServerTlsPolicyRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networksecurity_v1beta1_UpdateServerTlsPolicyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networksecurity_v1beta1_DeleteServerTlsPolicyRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networksecurity_v1beta1_DeleteServerTlsPolicyRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n<google/cloud/networksecurity/v1beta1/s"
          + "erver_tls_policy.proto\022$google.cloud.net"
          + "worksecurity.v1beta1\032\037google/api/field_b"
          + "ehavior.proto\032\031google/api/resource.proto"
          + "\032.google/cloud/networksecurity/v1beta1/t"
          + "ls.proto\032 google/protobuf/field_mask.pro"
          + "to\032\037google/protobuf/timestamp.proto\"\316\005\n\017"
          + "ServerTlsPolicy\022\021\n\004name\030\001 \001(\tB\003\340A\002\022\023\n\013de"
          + "scription\030\002 \001(\t\0224\n\013create_time\030\003 \001(\0132\032.g"
          + "oogle.protobuf.TimestampB\003\340A\003\0224\n\013update_"
          + "time\030\004 \001(\0132\032.google.protobuf.TimestampB\003"
          + "\340A\003\022Q\n\006labels\030\005 \003(\0132A.google.cloud.netwo"
          + "rksecurity.v1beta1.ServerTlsPolicy.Label"
          + "sEntry\022\022\n\nallow_open\030\006 \001(\010\022U\n\022server_cer"
          + "tificate\030\007 \001(\01329.google.cloud.networksec"
          + "urity.v1beta1.CertificateProvider\022U\n\013mtl"
          + "s_policy\030\010 \001(\0132@.google.cloud.networksec"
          + "urity.v1beta1.ServerTlsPolicy.MTLSPolicy"
          + "\032^\n\nMTLSPolicy\022P\n\024client_validation_ca\030\001"
          + " \003(\01322.google.cloud.networksecurity.v1be"
          + "ta1.ValidationCA\032-\n\013LabelsEntry\022\013\n\003key\030\001"
          + " \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001:\202\001\352A\177\n.networkse"
          + "curity.googleapis.com/ServerTlsPolicy\022Mp"
          + "rojects/{project}/locations/{location}/s"
          + "erverTlsPolicies/{server_tls_policy}\"\200\001\n"
          + "\034ListServerTlsPoliciesRequest\0229\n\006parent\030"
          + "\001 \001(\tB)\340A\002\372A#\n!locations.googleapis.com/"
          + "Location\022\021\n\tpage_size\030\002 \001(\005\022\022\n\npage_toke"
          + "n\030\003 \001(\t\"\214\001\n\035ListServerTlsPoliciesRespons"
          + "e\022R\n\023server_tls_policies\030\001 \003(\01325.google."
          + "cloud.networksecurity.v1beta1.ServerTlsP"
          + "olicy\022\027\n\017next_page_token\030\002 \001(\t\"a\n\031GetSer"
          + "verTlsPolicyRequest\022D\n\004name\030\001 \001(\tB6\340A\002\372A"
          + "0\n.networksecurity.googleapis.com/Server"
          + "TlsPolicy\"\340\001\n\034CreateServerTlsPolicyReque"
          + "st\022F\n\006parent\030\001 \001(\tB6\340A\002\372A0\022.networksecur"
          + "ity.googleapis.com/ServerTlsPolicy\022!\n\024se"
          + "rver_tls_policy_id\030\002 \001(\tB\003\340A\002\022U\n\021server_"
          + "tls_policy\030\003 \001(\01325.google.cloud.networks"
          + "ecurity.v1beta1.ServerTlsPolicyB\003\340A\002\"\253\001\n"
          + "\034UpdateServerTlsPolicyRequest\0224\n\013update_"
          + "mask\030\001 \001(\0132\032.google.protobuf.FieldMaskB\003"
          + "\340A\001\022U\n\021server_tls_policy\030\002 \001(\01325.google."
          + "cloud.networksecurity.v1beta1.ServerTlsP"
          + "olicyB\003\340A\002\"d\n\034DeleteServerTlsPolicyReque"
          + "st\022D\n\004name\030\001 \001(\tB6\340A\002\372A0\n.networksecurit"
          + "y.googleapis.com/ServerTlsPolicyB\217\002\n(com"
          + ".google.cloud.networksecurity.v1beta1B\024S"
          + "erverTlsPolicyProtoP\001ZSgoogle.golang.org"
          + "/genproto/googleapis/cloud/networksecuri"
          + "ty/v1beta1;networksecurity\252\002$Google.Clou"
          + "d.NetworkSecurity.V1Beta1\312\002$Google\\Cloud"
          + "\\NetworkSecurity\\V1beta1\352\002\'Google::Cloud"
          + "::NetworkSecurity::V1beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.networksecurity.v1beta1.TlsProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_networksecurity_v1beta1_ServerTlsPolicy_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_networksecurity_v1beta1_ServerTlsPolicy_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networksecurity_v1beta1_ServerTlsPolicy_descriptor,
            new java.lang.String[] {
              "Name",
              "Description",
              "CreateTime",
              "UpdateTime",
              "Labels",
              "AllowOpen",
              "ServerCertificate",
              "MtlsPolicy",
            });
    internal_static_google_cloud_networksecurity_v1beta1_ServerTlsPolicy_MTLSPolicy_descriptor =
        internal_static_google_cloud_networksecurity_v1beta1_ServerTlsPolicy_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_networksecurity_v1beta1_ServerTlsPolicy_MTLSPolicy_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networksecurity_v1beta1_ServerTlsPolicy_MTLSPolicy_descriptor,
            new java.lang.String[] {
              "ClientValidationCa",
            });
    internal_static_google_cloud_networksecurity_v1beta1_ServerTlsPolicy_LabelsEntry_descriptor =
        internal_static_google_cloud_networksecurity_v1beta1_ServerTlsPolicy_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_networksecurity_v1beta1_ServerTlsPolicy_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networksecurity_v1beta1_ServerTlsPolicy_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_networksecurity_v1beta1_ListServerTlsPoliciesRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_networksecurity_v1beta1_ListServerTlsPoliciesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networksecurity_v1beta1_ListServerTlsPoliciesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken",
            });
    internal_static_google_cloud_networksecurity_v1beta1_ListServerTlsPoliciesResponse_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_networksecurity_v1beta1_ListServerTlsPoliciesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networksecurity_v1beta1_ListServerTlsPoliciesResponse_descriptor,
            new java.lang.String[] {
              "ServerTlsPolicies", "NextPageToken",
            });
    internal_static_google_cloud_networksecurity_v1beta1_GetServerTlsPolicyRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_networksecurity_v1beta1_GetServerTlsPolicyRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networksecurity_v1beta1_GetServerTlsPolicyRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_networksecurity_v1beta1_CreateServerTlsPolicyRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_networksecurity_v1beta1_CreateServerTlsPolicyRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networksecurity_v1beta1_CreateServerTlsPolicyRequest_descriptor,
            new java.lang.String[] {
              "Parent", "ServerTlsPolicyId", "ServerTlsPolicy",
            });
    internal_static_google_cloud_networksecurity_v1beta1_UpdateServerTlsPolicyRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_networksecurity_v1beta1_UpdateServerTlsPolicyRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networksecurity_v1beta1_UpdateServerTlsPolicyRequest_descriptor,
            new java.lang.String[] {
              "UpdateMask", "ServerTlsPolicy",
            });
    internal_static_google_cloud_networksecurity_v1beta1_DeleteServerTlsPolicyRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_networksecurity_v1beta1_DeleteServerTlsPolicyRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networksecurity_v1beta1_DeleteServerTlsPolicyRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.networksecurity.v1beta1.TlsProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
