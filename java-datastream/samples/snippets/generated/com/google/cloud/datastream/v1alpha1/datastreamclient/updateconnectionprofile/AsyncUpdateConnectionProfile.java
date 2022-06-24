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

package com.google.cloud.datastream.v1alpha1.samples;

// [START datastream_v1alpha1_generated_datastreamclient_updateconnectionprofile_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.datastream.v1alpha1.ConnectionProfile;
import com.google.cloud.datastream.v1alpha1.DatastreamClient;
import com.google.cloud.datastream.v1alpha1.UpdateConnectionProfileRequest;
import com.google.longrunning.Operation;
import com.google.protobuf.FieldMask;

public class AsyncUpdateConnectionProfile {

  public static void main(String[] args) throws Exception {
    asyncUpdateConnectionProfile();
  }

  public static void asyncUpdateConnectionProfile() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (DatastreamClient datastreamClient = DatastreamClient.create()) {
      UpdateConnectionProfileRequest request =
          UpdateConnectionProfileRequest.newBuilder()
              .setUpdateMask(FieldMask.newBuilder().build())
              .setConnectionProfile(ConnectionProfile.newBuilder().build())
              .setRequestId("requestId693933066")
              .build();
      ApiFuture<Operation> future =
          datastreamClient.updateConnectionProfileCallable().futureCall(request);
      // Do something.
      Operation response = future.get();
    }
  }
}
// [END datastream_v1alpha1_generated_datastreamclient_updateconnectionprofile_async]
