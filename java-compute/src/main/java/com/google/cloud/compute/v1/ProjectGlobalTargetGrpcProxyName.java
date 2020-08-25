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
package com.google.cloud.compute.v1;

import com.google.api.core.BetaApi;
import com.google.api.pathtemplate.PathTemplate;
import com.google.api.resourcenames.ResourceName;
import com.google.api.resourcenames.ResourceNameFactory;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Generated;

@Generated("by GAPIC")
@BetaApi
public final class ProjectGlobalTargetGrpcProxyName implements ResourceName {
  private final String project;
  private final String targetGrpcProxy;
  private static final PathTemplate PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("{project}/global/targetGrpcProxies/{targetGrpcProxy}");

  public static final String SERVICE_ADDRESS =
      "https://compute.googleapis.com/compute/v1/projects/";

  private volatile Map<String, String> fieldValuesMap;

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private ProjectGlobalTargetGrpcProxyName(Builder builder) {
    project = Preconditions.checkNotNull(builder.getProject());
    targetGrpcProxy = Preconditions.checkNotNull(builder.getTargetGrpcProxy());
  }

  public static ProjectGlobalTargetGrpcProxyName of(String project, String targetGrpcProxy) {
    return newBuilder().setProject(project).setTargetGrpcProxy(targetGrpcProxy).build();
  }

  public static String format(String project, String targetGrpcProxy) {
    return of(project, targetGrpcProxy).toString();
  }

  public String getProject() {
    return project;
  }

  public String getTargetGrpcProxy() {
    return targetGrpcProxy;
  }

  @Override
  public Map<String, String> getFieldValuesMap() {
    if (fieldValuesMap == null) {
      synchronized (this) {
        if (fieldValuesMap == null) {
          ImmutableMap.Builder<String, String> fieldMapBuilder = ImmutableMap.builder();
          fieldMapBuilder.put("project", project);
          fieldMapBuilder.put("targetGrpcProxy", targetGrpcProxy);
          fieldValuesMap = fieldMapBuilder.build();
        }
      }
    }
    return fieldValuesMap;
  }

  public String getFieldValue(String fieldName) {
    return getFieldValuesMap().get(fieldName);
  }

  public static ResourceNameFactory<ProjectGlobalTargetGrpcProxyName> newFactory() {
    return new ResourceNameFactory<ProjectGlobalTargetGrpcProxyName>() {
      public ProjectGlobalTargetGrpcProxyName parse(String formattedString) {
        return ProjectGlobalTargetGrpcProxyName.parse(formattedString);
      }
    };
  }

  public static ProjectGlobalTargetGrpcProxyName parse(String formattedString) {
    String resourcePath = formattedString;
    if (formattedString.startsWith(SERVICE_ADDRESS)) {
      resourcePath = formattedString.substring(SERVICE_ADDRESS.length());
    }
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(
            resourcePath,
            "ProjectGlobalTargetGrpcProxyName.parse: formattedString not in valid format");
    return of(matchMap.get("project"), matchMap.get("targetGrpcProxy"));
  }

  public static boolean isParsableFrom(String formattedString) {
    String resourcePath = formattedString;
    if (formattedString.startsWith(SERVICE_ADDRESS)) {
      resourcePath = formattedString.substring(SERVICE_ADDRESS.length());
    }
    return PATH_TEMPLATE.matches(resourcePath);
  }

  public static class Builder {
    private String project;
    private String targetGrpcProxy;

    public String getProject() {
      return project;
    }

    public String getTargetGrpcProxy() {
      return targetGrpcProxy;
    }

    public Builder setProject(String project) {
      this.project = project;
      return this;
    }

    public Builder setTargetGrpcProxy(String targetGrpcProxy) {
      this.targetGrpcProxy = targetGrpcProxy;
      return this;
    }

    private Builder() {}

    public Builder(ProjectGlobalTargetGrpcProxyName projectGlobalTargetGrpcProxyName) {
      project = projectGlobalTargetGrpcProxyName.project;
      targetGrpcProxy = projectGlobalTargetGrpcProxyName.targetGrpcProxy;
    }

    public ProjectGlobalTargetGrpcProxyName build() {
      return new ProjectGlobalTargetGrpcProxyName(this);
    }
  }

  @Override
  public String toString() {
    return SERVICE_ADDRESS
        + PATH_TEMPLATE.instantiate(
            "project", project,
            "targetGrpcProxy", targetGrpcProxy);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ProjectGlobalTargetGrpcProxyName) {
      ProjectGlobalTargetGrpcProxyName that = (ProjectGlobalTargetGrpcProxyName) o;
      return Objects.equals(this.project, that.getProject())
          && Objects.equals(this.targetGrpcProxy, that.getTargetGrpcProxy());
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(project, targetGrpcProxy);
  }
}
