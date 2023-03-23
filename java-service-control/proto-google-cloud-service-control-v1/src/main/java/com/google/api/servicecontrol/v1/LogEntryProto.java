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
// source: google/api/servicecontrol/v1/log_entry.proto

package com.google.api.servicecontrol.v1;

public final class LogEntryProto {
  private LogEntryProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_api_servicecontrol_v1_LogEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_servicecontrol_v1_LogEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_api_servicecontrol_v1_LogEntry_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_servicecontrol_v1_LogEntry_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_api_servicecontrol_v1_LogEntryOperation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_servicecontrol_v1_LogEntryOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_api_servicecontrol_v1_LogEntrySourceLocation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_servicecontrol_v1_LogEntrySourceLocation_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n,google/api/servicecontrol/v1/log_entry"
          + ".proto\022\034google.api.servicecontrol.v1\032/go"
          + "ogle/api/servicecontrol/v1/http_request."
          + "proto\032&google/logging/type/log_severity."
          + "proto\032\031google/protobuf/any.proto\032\034google"
          + "/protobuf/struct.proto\032\037google/protobuf/"
          + "timestamp.proto\"\351\004\n\010LogEntry\022\014\n\004name\030\n \001"
          + "(\t\022-\n\ttimestamp\030\013 \001(\0132\032.google.protobuf."
          + "Timestamp\0222\n\010severity\030\014 \001(\0162 .google.log"
          + "ging.type.LogSeverity\022?\n\014http_request\030\016 "
          + "\001(\0132).google.api.servicecontrol.v1.HttpR"
          + "equest\022\r\n\005trace\030\017 \001(\t\022\021\n\tinsert_id\030\004 \001(\t"
          + "\022B\n\006labels\030\r \003(\01322.google.api.servicecon"
          + "trol.v1.LogEntry.LabelsEntry\022-\n\rproto_pa"
          + "yload\030\002 \001(\0132\024.google.protobuf.AnyH\000\022\026\n\014t"
          + "ext_payload\030\003 \001(\tH\000\0221\n\016struct_payload\030\006 "
          + "\001(\0132\027.google.protobuf.StructH\000\022B\n\toperat"
          + "ion\030\020 \001(\0132/.google.api.servicecontrol.v1"
          + ".LogEntryOperation\022M\n\017source_location\030\021 "
          + "\001(\01324.google.api.servicecontrol.v1.LogEn"
          + "trySourceLocation\032-\n\013LabelsEntry\022\013\n\003key\030"
          + "\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001B\t\n\007payload\"N\n\021L"
          + "ogEntryOperation\022\n\n\002id\030\001 \001(\t\022\020\n\010producer"
          + "\030\002 \001(\t\022\r\n\005first\030\003 \001(\010\022\014\n\004last\030\004 \001(\010\"F\n\026L"
          + "ogEntrySourceLocation\022\014\n\004file\030\001 \001(\t\022\014\n\004l"
          + "ine\030\002 \001(\003\022\020\n\010function\030\003 \001(\tB\345\001\n com.goog"
          + "le.api.servicecontrol.v1B\rLogEntryProtoP"
          + "\001ZJgoogle.golang.org/genproto/googleapis"
          + "/api/servicecontrol/v1;servicecontrol\252\002\036"
          + "Google.Cloud.ServiceControl.V1\312\002\036Google\\"
          + "Cloud\\ServiceControl\\V1\352\002!Google::Cloud:"
          + ":ServiceControl::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.servicecontrol.v1.HttpRequestProto.getDescriptor(),
              com.google.logging.type.LogSeverityProto.getDescriptor(),
              com.google.protobuf.AnyProto.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_api_servicecontrol_v1_LogEntry_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_api_servicecontrol_v1_LogEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_api_servicecontrol_v1_LogEntry_descriptor,
            new java.lang.String[] {
              "Name",
              "Timestamp",
              "Severity",
              "HttpRequest",
              "Trace",
              "InsertId",
              "Labels",
              "ProtoPayload",
              "TextPayload",
              "StructPayload",
              "Operation",
              "SourceLocation",
              "Payload",
            });
    internal_static_google_api_servicecontrol_v1_LogEntry_LabelsEntry_descriptor =
        internal_static_google_api_servicecontrol_v1_LogEntry_descriptor.getNestedTypes().get(0);
    internal_static_google_api_servicecontrol_v1_LogEntry_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_api_servicecontrol_v1_LogEntry_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_api_servicecontrol_v1_LogEntryOperation_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_api_servicecontrol_v1_LogEntryOperation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_api_servicecontrol_v1_LogEntryOperation_descriptor,
            new java.lang.String[] {
              "Id", "Producer", "First", "Last",
            });
    internal_static_google_api_servicecontrol_v1_LogEntrySourceLocation_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_api_servicecontrol_v1_LogEntrySourceLocation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_api_servicecontrol_v1_LogEntrySourceLocation_descriptor,
            new java.lang.String[] {
              "File", "Line", "Function",
            });
    com.google.api.servicecontrol.v1.HttpRequestProto.getDescriptor();
    com.google.logging.type.LogSeverityProto.getDescriptor();
    com.google.protobuf.AnyProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
