// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/tasks/v2beta2/cloudtasks.proto

package com.google.cloud.tasks.v2beta2;

public interface ListQueuesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.tasks.v2beta2.ListQueuesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required.
   * The location name.
   * For example: `projects/PROJECT_ID/locations/LOCATION_ID`
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required.
   * The location name.
   * For example: `projects/PROJECT_ID/locations/LOCATION_ID`
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * `filter` can be used to specify a subset of queues. Any [Queue][google.cloud.tasks.v2beta2.Queue]
   * field can be used as a filter and several operators as supported.
   * For example: `&lt;=, &lt;, &gt;=, &gt;, !=, =, :`. The filter syntax is the same as
   * described in
   * [Stackdriver's Advanced Logs Filters](https://cloud.google.com/logging/docs/view/advanced_filters).
   * Sample filter "app_engine_http_target: *".
   * Note that using filters might cause fewer queues than the
   * requested_page size to be returned.
   * </pre>
   *
   * <code>string filter = 2;</code>
   */
  java.lang.String getFilter();
  /**
   * <pre>
   * `filter` can be used to specify a subset of queues. Any [Queue][google.cloud.tasks.v2beta2.Queue]
   * field can be used as a filter and several operators as supported.
   * For example: `&lt;=, &lt;, &gt;=, &gt;, !=, =, :`. The filter syntax is the same as
   * described in
   * [Stackdriver's Advanced Logs Filters](https://cloud.google.com/logging/docs/view/advanced_filters).
   * Sample filter "app_engine_http_target: *".
   * Note that using filters might cause fewer queues than the
   * requested_page size to be returned.
   * </pre>
   *
   * <code>string filter = 2;</code>
   */
  com.google.protobuf.ByteString
      getFilterBytes();

  /**
   * <pre>
   * Requested page size.
   * The maximum page size is 9800. If unspecified, the page size will
   * be the maximum. Fewer queues than requested might be returned,
   * even if more queues exist; use the
   * [next_page_token][google.cloud.tasks.v2beta2.ListQueuesResponse.next_page_token] in the
   * response to determine if more queues exist.
   * </pre>
   *
   * <code>int32 page_size = 3;</code>
   */
  int getPageSize();

  /**
   * <pre>
   * A token identifying the page of results to return.
   * To request the first page results, page_token must be empty. To
   * request the next page of results, page_token must be the value of
   * [next_page_token][google.cloud.tasks.v2beta2.ListQueuesResponse.next_page_token] returned
   * from the previous call to [ListQueues][google.cloud.tasks.v2beta2.CloudTasks.ListQueues]
   * method. It is an error to switch the value of the
   * [filter][google.cloud.tasks.v2beta2.ListQueuesRequest.filter] while iterating through pages.
   * </pre>
   *
   * <code>string page_token = 4;</code>
   */
  java.lang.String getPageToken();
  /**
   * <pre>
   * A token identifying the page of results to return.
   * To request the first page results, page_token must be empty. To
   * request the next page of results, page_token must be the value of
   * [next_page_token][google.cloud.tasks.v2beta2.ListQueuesResponse.next_page_token] returned
   * from the previous call to [ListQueues][google.cloud.tasks.v2beta2.CloudTasks.ListQueues]
   * method. It is an error to switch the value of the
   * [filter][google.cloud.tasks.v2beta2.ListQueuesRequest.filter] while iterating through pages.
   * </pre>
   *
   * <code>string page_token = 4;</code>
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();
}
