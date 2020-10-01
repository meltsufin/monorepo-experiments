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
// source: google/cloud/talent/v4/common.proto

package com.google.cloud.talent.v4;

public final class CommonProto {
  private CommonProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4_TimestampRange_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4_TimestampRange_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4_Location_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4_Location_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4_RequestMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4_RequestMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4_ResponseMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4_ResponseMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4_DeviceInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4_DeviceInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4_CustomAttribute_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4_CustomAttribute_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4_SpellingCorrection_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4_SpellingCorrection_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4_CompensationInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4_CompensationInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4_CompensationInfo_CompensationEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4_CompensationInfo_CompensationEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4_CompensationInfo_CompensationRange_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4_CompensationInfo_CompensationRange_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4_BatchOperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4_BatchOperationMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n#google/cloud/talent/v4/common.proto\022\026g"
          + "oogle.cloud.talent.v4\032\037google/api/field_"
          + "behavior.proto\032\037google/protobuf/timestam"
          + "p.proto\032\036google/protobuf/wrappers.proto\032"
          + "\030google/type/latlng.proto\032\027google/type/m"
          + "oney.proto\032 google/type/postal_address.p"
          + "roto\032\034google/api/annotations.proto\"n\n\016Ti"
          + "mestampRange\022.\n\nstart_time\030\001 \001(\0132\032.googl"
          + "e.protobuf.Timestamp\022,\n\010end_time\030\002 \001(\0132\032"
          + ".google.protobuf.Timestamp\"\262\003\n\010Location\022"
          + "D\n\rlocation_type\030\001 \001(\0162-.google.cloud.ta"
          + "lent.v4.Location.LocationType\0222\n\016postal_"
          + "address\030\002 \001(\0132\032.google.type.PostalAddres"
          + "s\022$\n\007lat_lng\030\003 \001(\0132\023.google.type.LatLng\022"
          + "\024\n\014radius_miles\030\004 \001(\001\"\357\001\n\014LocationType\022\035"
          + "\n\031LOCATION_TYPE_UNSPECIFIED\020\000\022\013\n\007COUNTRY"
          + "\020\001\022\027\n\023ADMINISTRATIVE_AREA\020\002\022\033\n\027SUB_ADMIN"
          + "ISTRATIVE_AREA\020\003\022\014\n\010LOCALITY\020\004\022\017\n\013POSTAL"
          + "_CODE\020\005\022\020\n\014SUB_LOCALITY\020\006\022\022\n\016SUB_LOCALIT"
          + "Y_1\020\007\022\022\n\016SUB_LOCALITY_2\020\010\022\020\n\014NEIGHBORHOO"
          + "D\020\t\022\022\n\016STREET_ADDRESS\020\n\"\232\001\n\017RequestMetad"
          + "ata\022\016\n\006domain\030\001 \001(\t\022\022\n\nsession_id\030\002 \001(\t\022"
          + "\017\n\007user_id\030\003 \001(\t\022\031\n\021allow_missing_ids\030\004 "
          + "\001(\010\0227\n\013device_info\030\005 \001(\0132\".google.cloud."
          + "talent.v4.DeviceInfo\"&\n\020ResponseMetadata"
          + "\022\022\n\nrequest_id\030\001 \001(\t\"\312\001\n\nDeviceInfo\022B\n\013d"
          + "evice_type\030\001 \001(\0162-.google.cloud.talent.v"
          + "4.DeviceInfo.DeviceType\022\n\n\002id\030\002 \001(\t\"l\n\nD"
          + "eviceType\022\033\n\027DEVICE_TYPE_UNSPECIFIED\020\000\022\007"
          + "\n\003WEB\020\001\022\016\n\nMOBILE_WEB\020\002\022\013\n\007ANDROID\020\003\022\007\n\003"
          + "IOS\020\004\022\007\n\003BOT\020\005\022\t\n\005OTHER\020\006\"m\n\017CustomAttri"
          + "bute\022\025\n\rstring_values\030\001 \003(\t\022\023\n\013long_valu"
          + "es\030\002 \003(\003\022\022\n\nfilterable\030\003 \001(\010\022\032\n\022keyword_"
          + "searchable\030\004 \001(\010\"W\n\022SpellingCorrection\022\021"
          + "\n\tcorrected\030\001 \001(\010\022\026\n\016corrected_text\030\002 \001("
          + "\t\022\026\n\016corrected_html\030\003 \001(\t\"\210\t\n\020Compensati"
          + "onInfo\022K\n\007entries\030\001 \003(\0132:.google.cloud.t"
          + "alent.v4.CompensationInfo.CompensationEn"
          + "try\022k\n\"annualized_base_compensation_rang"
          + "e\030\002 \001(\0132:.google.cloud.talent.v4.Compens"
          + "ationInfo.CompensationRangeB\003\340A\003\022l\n#annu"
          + "alized_total_compensation_range\030\003 \001(\0132:."
          + "google.cloud.talent.v4.CompensationInfo."
          + "CompensationRangeB\003\340A\003\032\203\003\n\021CompensationE"
          + "ntry\022G\n\004type\030\001 \001(\01629.google.cloud.talent"
          + ".v4.CompensationInfo.CompensationType\022G\n"
          + "\004unit\030\002 \001(\01629.google.cloud.talent.v4.Com"
          + "pensationInfo.CompensationUnit\022$\n\006amount"
          + "\030\003 \001(\0132\022.google.type.MoneyH\000\022K\n\005range\030\004 "
          + "\001(\0132:.google.cloud.talent.v4.Compensatio"
          + "nInfo.CompensationRangeH\000\022\023\n\013description"
          + "\030\005 \001(\t\022=\n\027expected_units_per_year\030\006 \001(\0132"
          + "\034.google.protobuf.DoubleValueB\025\n\023compens"
          + "ation_amount\032o\n\021CompensationRange\022,\n\020max"
          + "_compensation\030\002 \001(\0132\022.google.type.Money\022"
          + ",\n\020min_compensation\030\001 \001(\0132\022.google.type."
          + "Money\"\265\001\n\020CompensationType\022!\n\035COMPENSATI"
          + "ON_TYPE_UNSPECIFIED\020\000\022\010\n\004BASE\020\001\022\t\n\005BONUS"
          + "\020\002\022\021\n\rSIGNING_BONUS\020\003\022\n\n\006EQUITY\020\004\022\022\n\016PRO"
          + "FIT_SHARING\020\005\022\017\n\013COMMISSIONS\020\006\022\010\n\004TIPS\020\007"
          + "\022\033\n\027OTHER_COMPENSATION_TYPE\020\010\"\234\001\n\020Compen"
          + "sationUnit\022!\n\035COMPENSATION_UNIT_UNSPECIF"
          + "IED\020\000\022\n\n\006HOURLY\020\001\022\t\n\005DAILY\020\002\022\n\n\006WEEKLY\020\003"
          + "\022\013\n\007MONTHLY\020\004\022\n\n\006YEARLY\020\005\022\014\n\010ONE_TIME\020\006\022"
          + "\033\n\027OTHER_COMPENSATION_UNIT\020\007\"\307\003\n\026BatchOp"
          + "erationMetadata\022C\n\005state\030\001 \001(\01624.google."
          + "cloud.talent.v4.BatchOperationMetadata.S"
          + "tate\022\031\n\021state_description\030\002 \001(\t\022\025\n\rsucce"
          + "ss_count\030\003 \001(\005\022\025\n\rfailure_count\030\004 \001(\005\022\023\n"
          + "\013total_count\030\005 \001(\005\022/\n\013create_time\030\006 \001(\0132"
          + "\032.google.protobuf.Timestamp\022/\n\013update_ti"
          + "me\030\007 \001(\0132\032.google.protobuf.Timestamp\022,\n\010"
          + "end_time\030\010 \001(\0132\032.google.protobuf.Timesta"
          + "mp\"z\n\005State\022\025\n\021STATE_UNSPECIFIED\020\000\022\020\n\014IN"
          + "ITIALIZING\020\001\022\016\n\nPROCESSING\020\002\022\r\n\tSUCCEEDE"
          + "D\020\003\022\n\n\006FAILED\020\004\022\016\n\nCANCELLING\020\005\022\r\n\tCANCE"
          + "LLED\020\006*y\n\013CompanySize\022\034\n\030COMPANY_SIZE_UN"
          + "SPECIFIED\020\000\022\010\n\004MINI\020\001\022\t\n\005SMALL\020\002\022\013\n\007SMED"
          + "IUM\020\003\022\n\n\006MEDIUM\020\004\022\007\n\003BIG\020\005\022\n\n\006BIGGER\020\006\022\t"
          + "\n\005GIANT\020\007*\342\001\n\nJobBenefit\022\033\n\027JOB_BENEFIT_"
          + "UNSPECIFIED\020\000\022\016\n\nCHILD_CARE\020\001\022\n\n\006DENTAL\020"
          + "\002\022\024\n\020DOMESTIC_PARTNER\020\003\022\022\n\016FLEXIBLE_HOUR"
          + "S\020\004\022\013\n\007MEDICAL\020\005\022\022\n\016LIFE_INSURANCE\020\006\022\022\n\016"
          + "PARENTAL_LEAVE\020\007\022\023\n\017RETIREMENT_PLAN\020\010\022\r\n"
          + "\tSICK_DAYS\020\t\022\014\n\010VACATION\020\n\022\n\n\006VISION\020\013*\216"
          + "\002\n\nDegreeType\022\033\n\027DEGREE_TYPE_UNSPECIFIED"
          + "\020\000\022\025\n\021PRIMARY_EDUCATION\020\001\022\035\n\031LOWER_SECON"
          + "DARY_EDUCATION\020\002\022\035\n\031UPPER_SECONDARY_EDUC"
          + "ATION\020\003\022\034\n\030ADULT_REMEDIAL_EDUCATION\020\004\022\034\n"
          + "\030ASSOCIATES_OR_EQUIVALENT\020\005\022\033\n\027BACHELORS"
          + "_OR_EQUIVALENT\020\006\022\031\n\025MASTERS_OR_EQUIVALEN"
          + "T\020\007\022\032\n\026DOCTORAL_OR_EQUIVALENT\020\010*\334\001\n\016Empl"
          + "oymentType\022\037\n\033EMPLOYMENT_TYPE_UNSPECIFIE"
          + "D\020\000\022\r\n\tFULL_TIME\020\001\022\r\n\tPART_TIME\020\002\022\016\n\nCON"
          + "TRACTOR\020\003\022\024\n\020CONTRACT_TO_HIRE\020\004\022\r\n\tTEMPO"
          + "RARY\020\005\022\n\n\006INTERN\020\006\022\r\n\tVOLUNTEER\020\007\022\014\n\010PER"
          + "_DIEM\020\010\022\022\n\016FLY_IN_FLY_OUT\020\t\022\031\n\025OTHER_EMP"
          + "LOYMENT_TYPE\020\n*q\n\010JobLevel\022\031\n\025JOB_LEVEL_"
          + "UNSPECIFIED\020\000\022\017\n\013ENTRY_LEVEL\020\001\022\017\n\013EXPERI"
          + "ENCED\020\002\022\013\n\007MANAGER\020\003\022\014\n\010DIRECTOR\020\004\022\r\n\tEX"
          + "ECUTIVE\020\005*\272\006\n\013JobCategory\022\034\n\030JOB_CATEGOR"
          + "Y_UNSPECIFIED\020\000\022\032\n\026ACCOUNTING_AND_FINANC"
          + "E\020\001\022\035\n\031ADMINISTRATIVE_AND_OFFICE\020\002\022\035\n\031AD"
          + "VERTISING_AND_MARKETING\020\003\022\017\n\013ANIMAL_CARE"
          + "\020\004\022\032\n\026ART_FASHION_AND_DESIGN\020\005\022\027\n\023BUSINE"
          + "SS_OPERATIONS\020\006\022\033\n\027CLEANING_AND_FACILITI"
          + "ES\020\007\022\023\n\017COMPUTER_AND_IT\020\010\022\020\n\014CONSTRUCTIO"
          + "N\020\t\022\024\n\020CUSTOMER_SERVICE\020\n\022\r\n\tEDUCATION\020\013"
          + "\022\034\n\030ENTERTAINMENT_AND_TRAVEL\020\014\022\030\n\024FARMIN"
          + "G_AND_OUTDOORS\020\r\022\016\n\nHEALTHCARE\020\016\022\023\n\017HUMA"
          + "N_RESOURCES\020\017\022\'\n#INSTALLATION_MAINTENANC"
          + "E_AND_REPAIR\020\020\022\t\n\005LEGAL\020\021\022\016\n\nMANAGEMENT\020"
          + "\022\022\037\n\033MANUFACTURING_AND_WAREHOUSE\020\023\022$\n ME"
          + "DIA_COMMUNICATIONS_AND_WRITING\020\024\022\026\n\022OIL_"
          + "GAS_AND_MINING\020\025\022\036\n\032PERSONAL_CARE_AND_SE"
          + "RVICES\020\026\022\027\n\023PROTECTIVE_SERVICES\020\027\022\017\n\013REA"
          + "L_ESTATE\020\030\022\036\n\032RESTAURANT_AND_HOSPITALITY"
          + "\020\031\022\024\n\020SALES_AND_RETAIL\020\032\022\033\n\027SCIENCE_AND_"
          + "ENGINEERING\020\033\022\"\n\036SOCIAL_SERVICES_AND_NON"
          + "_PROFIT\020\034\022!\n\035SPORTS_FITNESS_AND_RECREATI"
          + "ON\020\035\022 \n\034TRANSPORTATION_AND_LOGISTICS\020\036*e"
          + "\n\rPostingRegion\022\036\n\032POSTING_REGION_UNSPEC"
          + "IFIED\020\000\022\027\n\023ADMINISTRATIVE_AREA\020\001\022\n\n\006NATI"
          + "ON\020\002\022\017\n\013TELECOMMUTE\020\003*n\n\nVisibility\022\032\n\026V"
          + "ISIBILITY_UNSPECIFIED\020\000\022\020\n\014ACCOUNT_ONLY\020"
          + "\001\022\026\n\022SHARED_WITH_GOOGLE\020\002\022\026\n\022SHARED_WITH"
          + "_PUBLIC\020\003\032\002\030\001*q\n\020HtmlSanitization\022!\n\035HTM"
          + "L_SANITIZATION_UNSPECIFIED\020\000\022\036\n\032HTML_SAN"
          + "ITIZATION_DISABLED\020\001\022\032\n\026SIMPLE_FORMATTIN"
          + "G_ONLY\020\002*I\n\rCommuteMethod\022\036\n\032COMMUTE_MET"
          + "HOD_UNSPECIFIED\020\000\022\013\n\007DRIVING\020\001\022\013\n\007TRANSI"
          + "T\020\002Bo\n\032com.google.cloud.talent.v4B\013Commo"
          + "nProtoP\001Z<google.golang.org/genproto/goo"
          + "gleapis/cloud/talent/v4;talent\242\002\003CTSb\006pr"
          + "oto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.protobuf.WrappersProto.getDescriptor(),
              com.google.type.LatLngProto.getDescriptor(),
              com.google.type.MoneyProto.getDescriptor(),
              com.google.type.PostalAddressProto.getDescriptor(),
              com.google.api.AnnotationsProto.getDescriptor(),
            });
    internal_static_google_cloud_talent_v4_TimestampRange_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_talent_v4_TimestampRange_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4_TimestampRange_descriptor,
            new java.lang.String[] {
              "StartTime", "EndTime",
            });
    internal_static_google_cloud_talent_v4_Location_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_talent_v4_Location_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4_Location_descriptor,
            new java.lang.String[] {
              "LocationType", "PostalAddress", "LatLng", "RadiusMiles",
            });
    internal_static_google_cloud_talent_v4_RequestMetadata_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_talent_v4_RequestMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4_RequestMetadata_descriptor,
            new java.lang.String[] {
              "Domain", "SessionId", "UserId", "AllowMissingIds", "DeviceInfo",
            });
    internal_static_google_cloud_talent_v4_ResponseMetadata_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_talent_v4_ResponseMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4_ResponseMetadata_descriptor,
            new java.lang.String[] {
              "RequestId",
            });
    internal_static_google_cloud_talent_v4_DeviceInfo_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_talent_v4_DeviceInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4_DeviceInfo_descriptor,
            new java.lang.String[] {
              "DeviceType", "Id",
            });
    internal_static_google_cloud_talent_v4_CustomAttribute_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_talent_v4_CustomAttribute_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4_CustomAttribute_descriptor,
            new java.lang.String[] {
              "StringValues", "LongValues", "Filterable", "KeywordSearchable",
            });
    internal_static_google_cloud_talent_v4_SpellingCorrection_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_talent_v4_SpellingCorrection_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4_SpellingCorrection_descriptor,
            new java.lang.String[] {
              "Corrected", "CorrectedText", "CorrectedHtml",
            });
    internal_static_google_cloud_talent_v4_CompensationInfo_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_talent_v4_CompensationInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4_CompensationInfo_descriptor,
            new java.lang.String[] {
              "Entries", "AnnualizedBaseCompensationRange", "AnnualizedTotalCompensationRange",
            });
    internal_static_google_cloud_talent_v4_CompensationInfo_CompensationEntry_descriptor =
        internal_static_google_cloud_talent_v4_CompensationInfo_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_talent_v4_CompensationInfo_CompensationEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4_CompensationInfo_CompensationEntry_descriptor,
            new java.lang.String[] {
              "Type",
              "Unit",
              "Amount",
              "Range",
              "Description",
              "ExpectedUnitsPerYear",
              "CompensationAmount",
            });
    internal_static_google_cloud_talent_v4_CompensationInfo_CompensationRange_descriptor =
        internal_static_google_cloud_talent_v4_CompensationInfo_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_talent_v4_CompensationInfo_CompensationRange_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4_CompensationInfo_CompensationRange_descriptor,
            new java.lang.String[] {
              "MaxCompensation", "MinCompensation",
            });
    internal_static_google_cloud_talent_v4_BatchOperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_talent_v4_BatchOperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4_BatchOperationMetadata_descriptor,
            new java.lang.String[] {
              "State",
              "StateDescription",
              "SuccessCount",
              "FailureCount",
              "TotalCount",
              "CreateTime",
              "UpdateTime",
              "EndTime",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.type.LatLngProto.getDescriptor();
    com.google.type.MoneyProto.getDescriptor();
    com.google.type.PostalAddressProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
