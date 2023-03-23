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
// source: google/cloud/retail/v2beta/catalog.proto

package com.google.cloud.retail.v2beta;

public interface MerchantCenterLinkOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.retail.v2beta.MerchantCenterLink)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The linked [Merchant center account
   * id](https://developers.google.com/shopping-content/guides/accountstatuses).
   * The account must be a standalone account or a sub-account of a MCA.
   * </pre>
   *
   * <code>int64 merchant_center_account_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The merchantCenterAccountId.
   */
  long getMerchantCenterAccountId();

  /**
   *
   *
   * <pre>
   * The branch id (e.g. 0/1/2) within this catalog that products from
   * merchant_center_account_id are streamed to. When updating this field, an
   * empty value will use the currently configured default branch. However,
   * changing the default branch later on won't change the linked branch here.
   * A single branch id can only have one linked merchant center account id.
   * </pre>
   *
   * <code>string branch_id = 2;</code>
   *
   * @return The branchId.
   */
  java.lang.String getBranchId();
  /**
   *
   *
   * <pre>
   * The branch id (e.g. 0/1/2) within this catalog that products from
   * merchant_center_account_id are streamed to. When updating this field, an
   * empty value will use the currently configured default branch. However,
   * changing the default branch later on won't change the linked branch here.
   * A single branch id can only have one linked merchant center account id.
   * </pre>
   *
   * <code>string branch_id = 2;</code>
   *
   * @return The bytes for branchId.
   */
  com.google.protobuf.ByteString getBranchIdBytes();

  /**
   *
   *
   * <pre>
   * String representing the destination to import for, all if left empty.
   * List of possible values is given in [Included
   * destination](https://support.google.com/merchants/answer/7501026).
   * List of allowed string values:
   * "Shopping_ads", "Buy_on_google_listings", "Display_ads", "Local_inventory
   * _ads", "Free_listings", "Free_local_listings"
   * NOTE: The string values are case sensitive.
   * </pre>
   *
   * <code>repeated string destinations = 3;</code>
   *
   * @return A list containing the destinations.
   */
  java.util.List<java.lang.String> getDestinationsList();
  /**
   *
   *
   * <pre>
   * String representing the destination to import for, all if left empty.
   * List of possible values is given in [Included
   * destination](https://support.google.com/merchants/answer/7501026).
   * List of allowed string values:
   * "Shopping_ads", "Buy_on_google_listings", "Display_ads", "Local_inventory
   * _ads", "Free_listings", "Free_local_listings"
   * NOTE: The string values are case sensitive.
   * </pre>
   *
   * <code>repeated string destinations = 3;</code>
   *
   * @return The count of destinations.
   */
  int getDestinationsCount();
  /**
   *
   *
   * <pre>
   * String representing the destination to import for, all if left empty.
   * List of possible values is given in [Included
   * destination](https://support.google.com/merchants/answer/7501026).
   * List of allowed string values:
   * "Shopping_ads", "Buy_on_google_listings", "Display_ads", "Local_inventory
   * _ads", "Free_listings", "Free_local_listings"
   * NOTE: The string values are case sensitive.
   * </pre>
   *
   * <code>repeated string destinations = 3;</code>
   *
   * @param index The index of the element to return.
   * @return The destinations at the given index.
   */
  java.lang.String getDestinations(int index);
  /**
   *
   *
   * <pre>
   * String representing the destination to import for, all if left empty.
   * List of possible values is given in [Included
   * destination](https://support.google.com/merchants/answer/7501026).
   * List of allowed string values:
   * "Shopping_ads", "Buy_on_google_listings", "Display_ads", "Local_inventory
   * _ads", "Free_listings", "Free_local_listings"
   * NOTE: The string values are case sensitive.
   * </pre>
   *
   * <code>repeated string destinations = 3;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the destinations at the given index.
   */
  com.google.protobuf.ByteString getDestinationsBytes(int index);

  /**
   *
   *
   * <pre>
   * Region code of offers to accept. 2-letter Uppercase ISO 3166-1 alpha-2
   * code. List of values can be found
   * [here](https://www.iana.org/assignments/language-subtag-registry/language-subtag-registry)
   * under the `region` tag. If left blank no region filtering will be
   * performed.
   * Example value: `US`.
   * </pre>
   *
   * <code>string region_code = 4;</code>
   *
   * @return The regionCode.
   */
  java.lang.String getRegionCode();
  /**
   *
   *
   * <pre>
   * Region code of offers to accept. 2-letter Uppercase ISO 3166-1 alpha-2
   * code. List of values can be found
   * [here](https://www.iana.org/assignments/language-subtag-registry/language-subtag-registry)
   * under the `region` tag. If left blank no region filtering will be
   * performed.
   * Example value: `US`.
   * </pre>
   *
   * <code>string region_code = 4;</code>
   *
   * @return The bytes for regionCode.
   */
  com.google.protobuf.ByteString getRegionCodeBytes();

  /**
   *
   *
   * <pre>
   * Language of the title/description and other string attributes. Use language
   * tags defined by [BCP 47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt).
   * ISO 639-1.
   * This specifies the language of offers in Merchant Center that will be
   * accepted. If  empty no language filtering will be performed.
   * Example value: `en`.
   * </pre>
   *
   * <code>string language_code = 5;</code>
   *
   * @return The languageCode.
   */
  java.lang.String getLanguageCode();
  /**
   *
   *
   * <pre>
   * Language of the title/description and other string attributes. Use language
   * tags defined by [BCP 47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt).
   * ISO 639-1.
   * This specifies the language of offers in Merchant Center that will be
   * accepted. If  empty no language filtering will be performed.
   * Example value: `en`.
   * </pre>
   *
   * <code>string language_code = 5;</code>
   *
   * @return The bytes for languageCode.
   */
  com.google.protobuf.ByteString getLanguageCodeBytes();
}
