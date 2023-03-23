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

/**
 * A client to Eventarc Publishing API
 *
 * <p>The interfaces provided are listed below, along with usage samples.
 *
 * <p>======================= PublisherClient =======================
 *
 * <p>Service Description: Eventarc processes events generated by an event provider and delivers
 * them to a subscriber.
 *
 * <p>An event provider is a software-as-a-service (SaaS) system or product that can generate and
 * deliver events through Eventarc.
 *
 * <p>A third-party event provider is an event provider from outside of Google.
 *
 * <p>A partner is a third-party event provider that is integrated with Eventarc.
 *
 * <p>A subscriber is a GCP customer interested in receiving events.
 *
 * <p>Channel is a first-class Eventarc resource that is created and managed by the subscriber in
 * their GCP project. A Channel represents a subscriber's intent to receive events from an event
 * provider. A Channel is associated with exactly one event provider.
 *
 * <p>ChannelConnection is a first-class Eventarc resource that is created and managed by the
 * partner in their GCP project. A ChannelConnection represents a connection between a partner and a
 * subscriber's Channel. A ChannelConnection has a one-to-one mapping with a Channel.
 *
 * <p>Publisher allows an event provider to publish events to Eventarc.
 *
 * <p>Sample for PublisherClient:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * try (PublisherClient publisherClient = PublisherClient.create()) {
 *   PublishChannelConnectionEventsRequest request =
 *       PublishChannelConnectionEventsRequest.newBuilder()
 *           .setChannelConnection("channelConnection-1932021695")
 *           .addAllEvents(new ArrayList<Any>())
 *           .addAllTextEvents(new ArrayList<String>())
 *           .build();
 *   PublishChannelConnectionEventsResponse response =
 *       publisherClient.publishChannelConnectionEvents(request);
 * }
 * }</pre>
 */
@Generated("by gapic-generator-java")
package com.google.cloud.eventarc.publishing.v1;

import javax.annotation.Generated;