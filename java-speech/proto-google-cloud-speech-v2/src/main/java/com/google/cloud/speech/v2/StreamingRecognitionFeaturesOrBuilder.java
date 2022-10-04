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
// source: google/cloud/speech/v2/cloud_speech.proto

package com.google.cloud.speech.v2;

public interface StreamingRecognitionFeaturesOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.speech.v2.StreamingRecognitionFeatures)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * If `true`, responses with voice activity speech events will be returned as
   * they are detected.
   * </pre>
   *
   * <code>bool enable_voice_activity_events = 1;</code>
   *
   * @return The enableVoiceActivityEvents.
   */
  boolean getEnableVoiceActivityEvents();

  /**
   *
   *
   * <pre>
   * Whether or not to stream interim results to the client. If set to true,
   * interim results will be streamed to the client. Otherwise, only the final
   * response will be streamed back.
   * </pre>
   *
   * <code>bool interim_results = 2;</code>
   *
   * @return The interimResults.
   */
  boolean getInterimResults();

  /**
   *
   *
   * <pre>
   * If set, the server will automatically close the stream after the specified
   * duration has elapsed after the last VOICE_ACTIVITY speech event has been
   * sent. The field `voice_activity_events` must also be set to true.
   * </pre>
   *
   * <code>
   * .google.cloud.speech.v2.StreamingRecognitionFeatures.VoiceActivityTimeout voice_activity_timeout = 3;
   * </code>
   *
   * @return Whether the voiceActivityTimeout field is set.
   */
  boolean hasVoiceActivityTimeout();
  /**
   *
   *
   * <pre>
   * If set, the server will automatically close the stream after the specified
   * duration has elapsed after the last VOICE_ACTIVITY speech event has been
   * sent. The field `voice_activity_events` must also be set to true.
   * </pre>
   *
   * <code>
   * .google.cloud.speech.v2.StreamingRecognitionFeatures.VoiceActivityTimeout voice_activity_timeout = 3;
   * </code>
   *
   * @return The voiceActivityTimeout.
   */
  com.google.cloud.speech.v2.StreamingRecognitionFeatures.VoiceActivityTimeout
      getVoiceActivityTimeout();
  /**
   *
   *
   * <pre>
   * If set, the server will automatically close the stream after the specified
   * duration has elapsed after the last VOICE_ACTIVITY speech event has been
   * sent. The field `voice_activity_events` must also be set to true.
   * </pre>
   *
   * <code>
   * .google.cloud.speech.v2.StreamingRecognitionFeatures.VoiceActivityTimeout voice_activity_timeout = 3;
   * </code>
   */
  com.google.cloud.speech.v2.StreamingRecognitionFeatures.VoiceActivityTimeoutOrBuilder
      getVoiceActivityTimeoutOrBuilder();
}
