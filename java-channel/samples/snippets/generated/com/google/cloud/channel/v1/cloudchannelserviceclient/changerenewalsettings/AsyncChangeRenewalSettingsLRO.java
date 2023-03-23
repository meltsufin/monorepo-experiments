/*
 * Copyright 2022 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.channel.v1.samples;

// [START channel_v1_generated_cloudchannelserviceclient_changerenewalsettings_lro_async]
import com.google.api.gax.longrunning.OperationFuture;
import com.google.cloud.channel.v1.ChangeRenewalSettingsRequest;
import com.google.cloud.channel.v1.CloudChannelServiceClient;
import com.google.cloud.channel.v1.Entitlement;
import com.google.cloud.channel.v1.OperationMetadata;
import com.google.cloud.channel.v1.RenewalSettings;

public class AsyncChangeRenewalSettingsLRO {

  public static void main(String[] args) throws Exception {
    asyncChangeRenewalSettingsLRO();
  }

  public static void asyncChangeRenewalSettingsLRO() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (CloudChannelServiceClient cloudChannelServiceClient = CloudChannelServiceClient.create()) {
      ChangeRenewalSettingsRequest request =
          ChangeRenewalSettingsRequest.newBuilder()
              .setName("name3373707")
              .setRenewalSettings(RenewalSettings.newBuilder().build())
              .setRequestId("requestId693933066")
              .build();
      OperationFuture<Entitlement, OperationMetadata> future =
          cloudChannelServiceClient.changeRenewalSettingsOperationCallable().futureCall(request);
      // Do something.
      Entitlement response = future.get();
    }
  }
}
// [END channel_v1_generated_cloudchannelserviceclient_changerenewalsettings_lro_async]
