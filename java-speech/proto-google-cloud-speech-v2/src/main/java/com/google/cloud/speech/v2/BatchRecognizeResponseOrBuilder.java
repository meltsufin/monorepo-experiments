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

public interface BatchRecognizeResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.speech.v2.BatchRecognizeResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Map from filename to the final result for that file.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.speech.v2.BatchRecognizeFileResult&gt; results = 1;</code>
   */
  int getResultsCount();
  /**
   *
   *
   * <pre>
   * Map from filename to the final result for that file.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.speech.v2.BatchRecognizeFileResult&gt; results = 1;</code>
   */
  boolean containsResults(java.lang.String key);
  /** Use {@link #getResultsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.cloud.speech.v2.BatchRecognizeFileResult> getResults();
  /**
   *
   *
   * <pre>
   * Map from filename to the final result for that file.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.speech.v2.BatchRecognizeFileResult&gt; results = 1;</code>
   */
  java.util.Map<java.lang.String, com.google.cloud.speech.v2.BatchRecognizeFileResult>
      getResultsMap();
  /**
   *
   *
   * <pre>
   * Map from filename to the final result for that file.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.speech.v2.BatchRecognizeFileResult&gt; results = 1;</code>
   */

  /* nullable */
  com.google.cloud.speech.v2.BatchRecognizeFileResult getResultsOrDefault(
      java.lang.String key,
      /* nullable */
      com.google.cloud.speech.v2.BatchRecognizeFileResult defaultValue);
  /**
   *
   *
   * <pre>
   * Map from filename to the final result for that file.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.speech.v2.BatchRecognizeFileResult&gt; results = 1;</code>
   */
  com.google.cloud.speech.v2.BatchRecognizeFileResult getResultsOrThrow(java.lang.String key);
}
