/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.hadoop.hbase.quotas;

import java.util.concurrent.atomic.AtomicLong;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseClassTestRule;
import org.apache.hadoop.hbase.HBaseTestingUtil;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.testclassification.SmallTests;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.rules.TestName;

@Category(SmallTests.class)
public class TestSpaceQuotaOnNonExistingTables {

  @ClassRule
  public static final HBaseClassTestRule CLASS_RULE =
    HBaseClassTestRule.forClass(TestSpaceQuotaOnNonExistingTables.class);

  private static final HBaseTestingUtil TEST_UTIL = new HBaseTestingUtil();

  private final TableName NON_EXISTENT_TABLE = TableName.valueOf("NON_EXISTENT_TABLE");

  @Rule
  public TestName testName = new TestName();
  private SpaceQuotaHelperForTests helper;

  @BeforeClass
  public static void setUp() throws Exception {
    Configuration conf = TEST_UTIL.getConfiguration();
    SpaceQuotaHelperForTests.updateConfigForQuotas(conf);
    TEST_UTIL.startMiniCluster(1);
  }

  @AfterClass
  public static void tearDown() throws Exception {
    TEST_UTIL.shutdownMiniCluster();
  }

  @Before
  public void removeAllQuotas() throws Exception {
    helper = new SpaceQuotaHelperForTests(TEST_UTIL, testName, new AtomicLong(0));
    helper.removeAllQuotas();
  }

  @Test
  public void testSetQuotaOnNonExistingTableWithNoInserts() throws Exception {
    helper.setQuotaLimit(NON_EXISTENT_TABLE, SpaceViolationPolicy.NO_INSERTS, 2L);
  }

  @Test
  public void testSetQuotaOnNonExistingTableWithNoWrites() throws Exception {
    helper.setQuotaLimit(NON_EXISTENT_TABLE, SpaceViolationPolicy.NO_WRITES, 2L);
  }

  @Test
  public void testSetQuotaOnNonExistingTableWithNoWritesCompaction() throws Exception {
    helper.setQuotaLimit(NON_EXISTENT_TABLE, SpaceViolationPolicy.NO_WRITES_COMPACTIONS, 2L);
  }

  @Test
  public void testSetQuotaOnNonExistingTableWithDisable() throws Exception {
    helper.setQuotaLimit(NON_EXISTENT_TABLE, SpaceViolationPolicy.DISABLE, 2L);
  }
}
