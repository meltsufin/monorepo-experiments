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
// source: google/analytics/data/v1alpha/analytics_data_api.proto

package com.google.analytics.data.v1alpha;

public interface RunFunnelReportRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.analytics.data.v1alpha.RunFunnelReportRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A Google Analytics GA4 property identifier whose events are tracked.
   * Specified in the URL path and not the body. To learn more, see [where to
   * find your Property
   * ID](https://developers.google.com/analytics/devguides/reporting/data/v1/property-id).
   * Within a batch request, this property should either be unspecified or
   * consistent with the batch-level property.
   * Example: properties/1234
   * </pre>
   *
   * <code>string property = 1;</code>
   *
   * @return The property.
   */
  java.lang.String getProperty();
  /**
   *
   *
   * <pre>
   * A Google Analytics GA4 property identifier whose events are tracked.
   * Specified in the URL path and not the body. To learn more, see [where to
   * find your Property
   * ID](https://developers.google.com/analytics/devguides/reporting/data/v1/property-id).
   * Within a batch request, this property should either be unspecified or
   * consistent with the batch-level property.
   * Example: properties/1234
   * </pre>
   *
   * <code>string property = 1;</code>
   *
   * @return The bytes for property.
   */
  com.google.protobuf.ByteString getPropertyBytes();

  /**
   *
   *
   * <pre>
   * Date ranges of data to read. If multiple date ranges are requested, each
   * response row will contain a zero based date range index. If two date
   * ranges overlap, the event data for the overlapping days is included in the
   * response rows for both date ranges.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.DateRange date_ranges = 2;</code>
   */
  java.util.List<com.google.analytics.data.v1alpha.DateRange> getDateRangesList();
  /**
   *
   *
   * <pre>
   * Date ranges of data to read. If multiple date ranges are requested, each
   * response row will contain a zero based date range index. If two date
   * ranges overlap, the event data for the overlapping days is included in the
   * response rows for both date ranges.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.DateRange date_ranges = 2;</code>
   */
  com.google.analytics.data.v1alpha.DateRange getDateRanges(int index);
  /**
   *
   *
   * <pre>
   * Date ranges of data to read. If multiple date ranges are requested, each
   * response row will contain a zero based date range index. If two date
   * ranges overlap, the event data for the overlapping days is included in the
   * response rows for both date ranges.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.DateRange date_ranges = 2;</code>
   */
  int getDateRangesCount();
  /**
   *
   *
   * <pre>
   * Date ranges of data to read. If multiple date ranges are requested, each
   * response row will contain a zero based date range index. If two date
   * ranges overlap, the event data for the overlapping days is included in the
   * response rows for both date ranges.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.DateRange date_ranges = 2;</code>
   */
  java.util.List<? extends com.google.analytics.data.v1alpha.DateRangeOrBuilder>
      getDateRangesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Date ranges of data to read. If multiple date ranges are requested, each
   * response row will contain a zero based date range index. If two date
   * ranges overlap, the event data for the overlapping days is included in the
   * response rows for both date ranges.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.DateRange date_ranges = 2;</code>
   */
  com.google.analytics.data.v1alpha.DateRangeOrBuilder getDateRangesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The configuration of this request's funnel. This funnel configuration is
   * required.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.Funnel funnel = 3;</code>
   *
   * @return Whether the funnel field is set.
   */
  boolean hasFunnel();
  /**
   *
   *
   * <pre>
   * The configuration of this request's funnel. This funnel configuration is
   * required.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.Funnel funnel = 3;</code>
   *
   * @return The funnel.
   */
  com.google.analytics.data.v1alpha.Funnel getFunnel();
  /**
   *
   *
   * <pre>
   * The configuration of this request's funnel. This funnel configuration is
   * required.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.Funnel funnel = 3;</code>
   */
  com.google.analytics.data.v1alpha.FunnelOrBuilder getFunnelOrBuilder();

  /**
   *
   *
   * <pre>
   * If specified, this breakdown adds a dimension to the funnel table sub
   * report response. This breakdown dimension expands each funnel step to the
   * unique values of the breakdown dimension. For example, a breakdown by the
   * `deviceCategory` dimension will create rows for `mobile`, `tablet`,
   * `desktop`, and the total.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.FunnelBreakdown funnel_breakdown = 4;</code>
   *
   * @return Whether the funnelBreakdown field is set.
   */
  boolean hasFunnelBreakdown();
  /**
   *
   *
   * <pre>
   * If specified, this breakdown adds a dimension to the funnel table sub
   * report response. This breakdown dimension expands each funnel step to the
   * unique values of the breakdown dimension. For example, a breakdown by the
   * `deviceCategory` dimension will create rows for `mobile`, `tablet`,
   * `desktop`, and the total.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.FunnelBreakdown funnel_breakdown = 4;</code>
   *
   * @return The funnelBreakdown.
   */
  com.google.analytics.data.v1alpha.FunnelBreakdown getFunnelBreakdown();
  /**
   *
   *
   * <pre>
   * If specified, this breakdown adds a dimension to the funnel table sub
   * report response. This breakdown dimension expands each funnel step to the
   * unique values of the breakdown dimension. For example, a breakdown by the
   * `deviceCategory` dimension will create rows for `mobile`, `tablet`,
   * `desktop`, and the total.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.FunnelBreakdown funnel_breakdown = 4;</code>
   */
  com.google.analytics.data.v1alpha.FunnelBreakdownOrBuilder getFunnelBreakdownOrBuilder();

  /**
   *
   *
   * <pre>
   * If specified, next action adds a dimension to the funnel visualization sub
   * report response. This next action dimension expands each funnel step to the
   * unique values of the next action. For example a next action of the
   * `eventName` dimension will create rows for several events (i.e.
   * `session_start` &amp; `click`) and the total.
   * Next action only supports `eventName` and most Page / Screen dimensions
   * like `pageTitle` and `pagePath`.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.FunnelNextAction funnel_next_action = 5;</code>
   *
   * @return Whether the funnelNextAction field is set.
   */
  boolean hasFunnelNextAction();
  /**
   *
   *
   * <pre>
   * If specified, next action adds a dimension to the funnel visualization sub
   * report response. This next action dimension expands each funnel step to the
   * unique values of the next action. For example a next action of the
   * `eventName` dimension will create rows for several events (i.e.
   * `session_start` &amp; `click`) and the total.
   * Next action only supports `eventName` and most Page / Screen dimensions
   * like `pageTitle` and `pagePath`.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.FunnelNextAction funnel_next_action = 5;</code>
   *
   * @return The funnelNextAction.
   */
  com.google.analytics.data.v1alpha.FunnelNextAction getFunnelNextAction();
  /**
   *
   *
   * <pre>
   * If specified, next action adds a dimension to the funnel visualization sub
   * report response. This next action dimension expands each funnel step to the
   * unique values of the next action. For example a next action of the
   * `eventName` dimension will create rows for several events (i.e.
   * `session_start` &amp; `click`) and the total.
   * Next action only supports `eventName` and most Page / Screen dimensions
   * like `pageTitle` and `pagePath`.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.FunnelNextAction funnel_next_action = 5;</code>
   */
  com.google.analytics.data.v1alpha.FunnelNextActionOrBuilder getFunnelNextActionOrBuilder();

  /**
   *
   *
   * <pre>
   * The funnel visualization type controls the dimensions present in the funnel
   * visualization sub report response. If not specified, `STANDARD_FUNNEL` is
   * used.
   * </pre>
   *
   * <code>
   * .google.analytics.data.v1alpha.RunFunnelReportRequest.FunnelVisualizationType funnel_visualization_type = 6;
   * </code>
   *
   * @return The enum numeric value on the wire for funnelVisualizationType.
   */
  int getFunnelVisualizationTypeValue();
  /**
   *
   *
   * <pre>
   * The funnel visualization type controls the dimensions present in the funnel
   * visualization sub report response. If not specified, `STANDARD_FUNNEL` is
   * used.
   * </pre>
   *
   * <code>
   * .google.analytics.data.v1alpha.RunFunnelReportRequest.FunnelVisualizationType funnel_visualization_type = 6;
   * </code>
   *
   * @return The funnelVisualizationType.
   */
  com.google.analytics.data.v1alpha.RunFunnelReportRequest.FunnelVisualizationType
      getFunnelVisualizationType();

  /**
   *
   *
   * <pre>
   * The configurations of segments. Segments are subsets of a property's data.
   * In a funnel report with segments, the funnel is evaluated in each segment.
   * Each segment specified in this request
   * produces a separate row in the response; in the response, each segment
   * identified by its name.
   * The segments parameter is optional. Requests are limited to 4 segments.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.Segment segments = 7;</code>
   */
  java.util.List<com.google.analytics.data.v1alpha.Segment> getSegmentsList();
  /**
   *
   *
   * <pre>
   * The configurations of segments. Segments are subsets of a property's data.
   * In a funnel report with segments, the funnel is evaluated in each segment.
   * Each segment specified in this request
   * produces a separate row in the response; in the response, each segment
   * identified by its name.
   * The segments parameter is optional. Requests are limited to 4 segments.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.Segment segments = 7;</code>
   */
  com.google.analytics.data.v1alpha.Segment getSegments(int index);
  /**
   *
   *
   * <pre>
   * The configurations of segments. Segments are subsets of a property's data.
   * In a funnel report with segments, the funnel is evaluated in each segment.
   * Each segment specified in this request
   * produces a separate row in the response; in the response, each segment
   * identified by its name.
   * The segments parameter is optional. Requests are limited to 4 segments.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.Segment segments = 7;</code>
   */
  int getSegmentsCount();
  /**
   *
   *
   * <pre>
   * The configurations of segments. Segments are subsets of a property's data.
   * In a funnel report with segments, the funnel is evaluated in each segment.
   * Each segment specified in this request
   * produces a separate row in the response; in the response, each segment
   * identified by its name.
   * The segments parameter is optional. Requests are limited to 4 segments.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.Segment segments = 7;</code>
   */
  java.util.List<? extends com.google.analytics.data.v1alpha.SegmentOrBuilder>
      getSegmentsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The configurations of segments. Segments are subsets of a property's data.
   * In a funnel report with segments, the funnel is evaluated in each segment.
   * Each segment specified in this request
   * produces a separate row in the response; in the response, each segment
   * identified by its name.
   * The segments parameter is optional. Requests are limited to 4 segments.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.Segment segments = 7;</code>
   */
  com.google.analytics.data.v1alpha.SegmentOrBuilder getSegmentsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The number of rows to return. If unspecified, 10,000 rows are returned. The
   * API returns a maximum of 100,000 rows per request, no matter how many you
   * ask for. `limit` must be positive.
   * The API can also return fewer rows than the requested `limit`, if there
   * aren't as many dimension values as the `limit`.
   * </pre>
   *
   * <code>int64 limit = 9;</code>
   *
   * @return The limit.
   */
  long getLimit();

  /**
   *
   *
   * <pre>
   * Dimension filters allow you to ask for only specific dimension values in
   * the report. To learn more, see [Creating a Report: Dimension
   * Filters](https://developers.google.com/analytics/devguides/reporting/data/v1/basics#dimension_filters)
   * for examples. Metrics cannot be used in this filter.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.FilterExpression dimension_filter = 10;</code>
   *
   * @return Whether the dimensionFilter field is set.
   */
  boolean hasDimensionFilter();
  /**
   *
   *
   * <pre>
   * Dimension filters allow you to ask for only specific dimension values in
   * the report. To learn more, see [Creating a Report: Dimension
   * Filters](https://developers.google.com/analytics/devguides/reporting/data/v1/basics#dimension_filters)
   * for examples. Metrics cannot be used in this filter.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.FilterExpression dimension_filter = 10;</code>
   *
   * @return The dimensionFilter.
   */
  com.google.analytics.data.v1alpha.FilterExpression getDimensionFilter();
  /**
   *
   *
   * <pre>
   * Dimension filters allow you to ask for only specific dimension values in
   * the report. To learn more, see [Creating a Report: Dimension
   * Filters](https://developers.google.com/analytics/devguides/reporting/data/v1/basics#dimension_filters)
   * for examples. Metrics cannot be used in this filter.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.FilterExpression dimension_filter = 10;</code>
   */
  com.google.analytics.data.v1alpha.FilterExpressionOrBuilder getDimensionFilterOrBuilder();

  /**
   *
   *
   * <pre>
   * Toggles whether to return the current state of this Analytics Property's
   * quota. Quota is returned in [PropertyQuota](#PropertyQuota).
   * </pre>
   *
   * <code>bool return_property_quota = 12;</code>
   *
   * @return The returnPropertyQuota.
   */
  boolean getReturnPropertyQuota();
}
