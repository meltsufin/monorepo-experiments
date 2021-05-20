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
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

public interface HttpRouteActionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.HttpRouteAction)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The specification for allowing client side cross-origin requests. Please see W3C Recommendation for Cross Origin Resource Sharing
   * Not supported when the URL map is bound to target gRPC proxy.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.CorsPolicy cors_policy = 398943748;</code>
   *
   * @return Whether the corsPolicy field is set.
   */
  boolean hasCorsPolicy();
  /**
   *
   *
   * <pre>
   * The specification for allowing client side cross-origin requests. Please see W3C Recommendation for Cross Origin Resource Sharing
   * Not supported when the URL map is bound to target gRPC proxy.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.CorsPolicy cors_policy = 398943748;</code>
   *
   * @return The corsPolicy.
   */
  com.google.cloud.compute.v1.CorsPolicy getCorsPolicy();
  /**
   *
   *
   * <pre>
   * The specification for allowing client side cross-origin requests. Please see W3C Recommendation for Cross Origin Resource Sharing
   * Not supported when the URL map is bound to target gRPC proxy.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.CorsPolicy cors_policy = 398943748;</code>
   */
  com.google.cloud.compute.v1.CorsPolicyOrBuilder getCorsPolicyOrBuilder();

  /**
   *
   *
   * <pre>
   * The specification for fault injection introduced into traffic to test the resiliency of clients to backend service failure. As part of fault injection, when clients send requests to a backend service, delays can be introduced by Loadbalancer on a percentage of requests before sending those request to the backend service. Similarly requests from clients can be aborted by the Loadbalancer for a percentage of requests.
   * timeout and retry_policy will be ignored by clients that are configured with a fault_injection_policy.
   * Not supported when the URL map is bound to target gRPC proxy that has validateForProxyless field set to true.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.HttpFaultInjection fault_injection_policy = 412781079;</code>
   *
   * @return Whether the faultInjectionPolicy field is set.
   */
  boolean hasFaultInjectionPolicy();
  /**
   *
   *
   * <pre>
   * The specification for fault injection introduced into traffic to test the resiliency of clients to backend service failure. As part of fault injection, when clients send requests to a backend service, delays can be introduced by Loadbalancer on a percentage of requests before sending those request to the backend service. Similarly requests from clients can be aborted by the Loadbalancer for a percentage of requests.
   * timeout and retry_policy will be ignored by clients that are configured with a fault_injection_policy.
   * Not supported when the URL map is bound to target gRPC proxy that has validateForProxyless field set to true.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.HttpFaultInjection fault_injection_policy = 412781079;</code>
   *
   * @return The faultInjectionPolicy.
   */
  com.google.cloud.compute.v1.HttpFaultInjection getFaultInjectionPolicy();
  /**
   *
   *
   * <pre>
   * The specification for fault injection introduced into traffic to test the resiliency of clients to backend service failure. As part of fault injection, when clients send requests to a backend service, delays can be introduced by Loadbalancer on a percentage of requests before sending those request to the backend service. Similarly requests from clients can be aborted by the Loadbalancer for a percentage of requests.
   * timeout and retry_policy will be ignored by clients that are configured with a fault_injection_policy.
   * Not supported when the URL map is bound to target gRPC proxy that has validateForProxyless field set to true.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.HttpFaultInjection fault_injection_policy = 412781079;</code>
   */
  com.google.cloud.compute.v1.HttpFaultInjectionOrBuilder getFaultInjectionPolicyOrBuilder();

  /**
   *
   *
   * <pre>
   * Specifies the maximum duration (timeout) for streams on the selected route. Unlike the timeout field where the timeout duration starts from the time the request has been fully processed (i.e. end-of-stream), the duration in this field is computed from the beginning of the stream until the response has been completely processed, including all retries. A stream that does not complete in this duration is closed.
   * If not specified, will use the largest maxStreamDuration among all backend services associated with the route.
   * This field is only allowed if the Url map is used with backend services with loadBalancingScheme set to INTERNAL_SELF_MANAGED.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.Duration max_stream_duration = 61428376;</code>
   *
   * @return Whether the maxStreamDuration field is set.
   */
  boolean hasMaxStreamDuration();
  /**
   *
   *
   * <pre>
   * Specifies the maximum duration (timeout) for streams on the selected route. Unlike the timeout field where the timeout duration starts from the time the request has been fully processed (i.e. end-of-stream), the duration in this field is computed from the beginning of the stream until the response has been completely processed, including all retries. A stream that does not complete in this duration is closed.
   * If not specified, will use the largest maxStreamDuration among all backend services associated with the route.
   * This field is only allowed if the Url map is used with backend services with loadBalancingScheme set to INTERNAL_SELF_MANAGED.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.Duration max_stream_duration = 61428376;</code>
   *
   * @return The maxStreamDuration.
   */
  com.google.cloud.compute.v1.Duration getMaxStreamDuration();
  /**
   *
   *
   * <pre>
   * Specifies the maximum duration (timeout) for streams on the selected route. Unlike the timeout field where the timeout duration starts from the time the request has been fully processed (i.e. end-of-stream), the duration in this field is computed from the beginning of the stream until the response has been completely processed, including all retries. A stream that does not complete in this duration is closed.
   * If not specified, will use the largest maxStreamDuration among all backend services associated with the route.
   * This field is only allowed if the Url map is used with backend services with loadBalancingScheme set to INTERNAL_SELF_MANAGED.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.Duration max_stream_duration = 61428376;</code>
   */
  com.google.cloud.compute.v1.DurationOrBuilder getMaxStreamDurationOrBuilder();

  /**
   *
   *
   * <pre>
   * Specifies the policy on how requests intended for the route's backends are shadowed to a separate mirrored backend service. Loadbalancer does not wait for responses from the shadow service. Prior to sending traffic to the shadow service, the host / authority header is suffixed with -shadow.
   * Not supported when the URL map is bound to target gRPC proxy that has validateForProxyless field set to true.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.RequestMirrorPolicy request_mirror_policy = 220196866;</code>
   *
   * @return Whether the requestMirrorPolicy field is set.
   */
  boolean hasRequestMirrorPolicy();
  /**
   *
   *
   * <pre>
   * Specifies the policy on how requests intended for the route's backends are shadowed to a separate mirrored backend service. Loadbalancer does not wait for responses from the shadow service. Prior to sending traffic to the shadow service, the host / authority header is suffixed with -shadow.
   * Not supported when the URL map is bound to target gRPC proxy that has validateForProxyless field set to true.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.RequestMirrorPolicy request_mirror_policy = 220196866;</code>
   *
   * @return The requestMirrorPolicy.
   */
  com.google.cloud.compute.v1.RequestMirrorPolicy getRequestMirrorPolicy();
  /**
   *
   *
   * <pre>
   * Specifies the policy on how requests intended for the route's backends are shadowed to a separate mirrored backend service. Loadbalancer does not wait for responses from the shadow service. Prior to sending traffic to the shadow service, the host / authority header is suffixed with -shadow.
   * Not supported when the URL map is bound to target gRPC proxy that has validateForProxyless field set to true.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.RequestMirrorPolicy request_mirror_policy = 220196866;</code>
   */
  com.google.cloud.compute.v1.RequestMirrorPolicyOrBuilder getRequestMirrorPolicyOrBuilder();

  /**
   *
   *
   * <pre>
   * Specifies the retry policy associated with this route.
   * Not supported when the URL map is bound to target gRPC proxy that has validateForProxyless field set to true.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.HttpRetryPolicy retry_policy = 56799913;</code>
   *
   * @return Whether the retryPolicy field is set.
   */
  boolean hasRetryPolicy();
  /**
   *
   *
   * <pre>
   * Specifies the retry policy associated with this route.
   * Not supported when the URL map is bound to target gRPC proxy that has validateForProxyless field set to true.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.HttpRetryPolicy retry_policy = 56799913;</code>
   *
   * @return The retryPolicy.
   */
  com.google.cloud.compute.v1.HttpRetryPolicy getRetryPolicy();
  /**
   *
   *
   * <pre>
   * Specifies the retry policy associated with this route.
   * Not supported when the URL map is bound to target gRPC proxy that has validateForProxyless field set to true.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.HttpRetryPolicy retry_policy = 56799913;</code>
   */
  com.google.cloud.compute.v1.HttpRetryPolicyOrBuilder getRetryPolicyOrBuilder();

  /**
   *
   *
   * <pre>
   * Specifies the timeout for the selected route. Timeout is computed from the time the request has been fully processed (i.e. end-of-stream) up until the response has been completely processed. Timeout includes all retries.
   * If not specified, will use the largest timeout among all backend services associated with the route.
   * Not supported when the URL map is bound to target gRPC proxy that has validateForProxyless field set to true.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.Duration timeout = 296701281;</code>
   *
   * @return Whether the timeout field is set.
   */
  boolean hasTimeout();
  /**
   *
   *
   * <pre>
   * Specifies the timeout for the selected route. Timeout is computed from the time the request has been fully processed (i.e. end-of-stream) up until the response has been completely processed. Timeout includes all retries.
   * If not specified, will use the largest timeout among all backend services associated with the route.
   * Not supported when the URL map is bound to target gRPC proxy that has validateForProxyless field set to true.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.Duration timeout = 296701281;</code>
   *
   * @return The timeout.
   */
  com.google.cloud.compute.v1.Duration getTimeout();
  /**
   *
   *
   * <pre>
   * Specifies the timeout for the selected route. Timeout is computed from the time the request has been fully processed (i.e. end-of-stream) up until the response has been completely processed. Timeout includes all retries.
   * If not specified, will use the largest timeout among all backend services associated with the route.
   * Not supported when the URL map is bound to target gRPC proxy that has validateForProxyless field set to true.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.Duration timeout = 296701281;</code>
   */
  com.google.cloud.compute.v1.DurationOrBuilder getTimeoutOrBuilder();

  /**
   *
   *
   * <pre>
   * The spec to modify the URL of the request, prior to forwarding the request to the matched service.
   * urlRewrite is the only action supported in UrlMaps for external HTTP(S) load balancers.
   * Not supported when the URL map is bound to target gRPC proxy that has validateForProxyless field set to true.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.UrlRewrite url_rewrite = 273333948;</code>
   *
   * @return Whether the urlRewrite field is set.
   */
  boolean hasUrlRewrite();
  /**
   *
   *
   * <pre>
   * The spec to modify the URL of the request, prior to forwarding the request to the matched service.
   * urlRewrite is the only action supported in UrlMaps for external HTTP(S) load balancers.
   * Not supported when the URL map is bound to target gRPC proxy that has validateForProxyless field set to true.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.UrlRewrite url_rewrite = 273333948;</code>
   *
   * @return The urlRewrite.
   */
  com.google.cloud.compute.v1.UrlRewrite getUrlRewrite();
  /**
   *
   *
   * <pre>
   * The spec to modify the URL of the request, prior to forwarding the request to the matched service.
   * urlRewrite is the only action supported in UrlMaps for external HTTP(S) load balancers.
   * Not supported when the URL map is bound to target gRPC proxy that has validateForProxyless field set to true.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.UrlRewrite url_rewrite = 273333948;</code>
   */
  com.google.cloud.compute.v1.UrlRewriteOrBuilder getUrlRewriteOrBuilder();

  /**
   *
   *
   * <pre>
   * A list of weighted backend services to send traffic to when a route match occurs. The weights determine the fraction of traffic that flows to their corresponding backend service. If all traffic needs to go to a single backend service, there must be one  weightedBackendService with weight set to a non-zero number.
   * Once a backendService is identified and before forwarding the request to the backend service, advanced routing actions such as URL rewrites and header transformations are applied depending on additional settings specified in this HttpRouteAction.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.WeightedBackendService weighted_backend_services = 337028049;
   * </code>
   */
  java.util.List<com.google.cloud.compute.v1.WeightedBackendService>
      getWeightedBackendServicesList();
  /**
   *
   *
   * <pre>
   * A list of weighted backend services to send traffic to when a route match occurs. The weights determine the fraction of traffic that flows to their corresponding backend service. If all traffic needs to go to a single backend service, there must be one  weightedBackendService with weight set to a non-zero number.
   * Once a backendService is identified and before forwarding the request to the backend service, advanced routing actions such as URL rewrites and header transformations are applied depending on additional settings specified in this HttpRouteAction.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.WeightedBackendService weighted_backend_services = 337028049;
   * </code>
   */
  com.google.cloud.compute.v1.WeightedBackendService getWeightedBackendServices(int index);
  /**
   *
   *
   * <pre>
   * A list of weighted backend services to send traffic to when a route match occurs. The weights determine the fraction of traffic that flows to their corresponding backend service. If all traffic needs to go to a single backend service, there must be one  weightedBackendService with weight set to a non-zero number.
   * Once a backendService is identified and before forwarding the request to the backend service, advanced routing actions such as URL rewrites and header transformations are applied depending on additional settings specified in this HttpRouteAction.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.WeightedBackendService weighted_backend_services = 337028049;
   * </code>
   */
  int getWeightedBackendServicesCount();
  /**
   *
   *
   * <pre>
   * A list of weighted backend services to send traffic to when a route match occurs. The weights determine the fraction of traffic that flows to their corresponding backend service. If all traffic needs to go to a single backend service, there must be one  weightedBackendService with weight set to a non-zero number.
   * Once a backendService is identified and before forwarding the request to the backend service, advanced routing actions such as URL rewrites and header transformations are applied depending on additional settings specified in this HttpRouteAction.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.WeightedBackendService weighted_backend_services = 337028049;
   * </code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.WeightedBackendServiceOrBuilder>
      getWeightedBackendServicesOrBuilderList();
  /**
   *
   *
   * <pre>
   * A list of weighted backend services to send traffic to when a route match occurs. The weights determine the fraction of traffic that flows to their corresponding backend service. If all traffic needs to go to a single backend service, there must be one  weightedBackendService with weight set to a non-zero number.
   * Once a backendService is identified and before forwarding the request to the backend service, advanced routing actions such as URL rewrites and header transformations are applied depending on additional settings specified in this HttpRouteAction.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.WeightedBackendService weighted_backend_services = 337028049;
   * </code>
   */
  com.google.cloud.compute.v1.WeightedBackendServiceOrBuilder getWeightedBackendServicesOrBuilder(
      int index);
}
