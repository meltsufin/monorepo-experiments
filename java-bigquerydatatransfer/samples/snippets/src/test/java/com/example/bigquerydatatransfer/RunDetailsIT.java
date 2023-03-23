/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.bigquerydatatransfer;

import static com.google.common.truth.Truth.assertThat;
import static junit.framework.TestCase.assertNotNull;

import com.google.cloud.bigquery.datatransfer.v1.DataTransferServiceClient;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class RunDetailsIT {

  private static final Logger LOG = Logger.getLogger(GetTransferConfigInfoIT.class.getName());
  private ByteArrayOutputStream bout;
  private String runName;
  private PrintStream out;
  private PrintStream originalPrintStream;

  private static final String CONFIG_NAME = requireEnvVar("DTS_TRANSFER_CONFIG_NAME");

  private static String requireEnvVar(String varName) {
    String value = System.getenv(varName);
    assertNotNull(
        "Environment variable " + varName + " is required to perform these tests.",
        System.getenv(varName));
    return value;
  }

  @BeforeClass
  public static void checkRequirements() {
    requireEnvVar("DTS_TRANSFER_CONFIG_NAME");
  }

  @Before
  public void setUp() throws IOException {
    bout = new ByteArrayOutputStream();
    out = new PrintStream(bout);
    originalPrintStream = System.out;
    System.setOut(out);
    try (DataTransferServiceClient client = DataTransferServiceClient.create()) {
      client.listTransferRuns(CONFIG_NAME).iterateAll().forEach(run -> runName = run.getName());
    }
  }

  @After
  public void tearDown() throws IOException {
    // restores print statements in the original method
    System.out.flush();
    System.setOut(originalPrintStream);
    LOG.log(Level.INFO, bout.toString());
  }

  @Test
  public void testRunDetails() throws IOException {
    RunDetails.runDetails(runName);
    assertThat(bout.toString()).contains("Run details retrieved successfully :");
  }
}
