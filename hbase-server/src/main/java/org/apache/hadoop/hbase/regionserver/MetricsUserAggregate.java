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
package org.apache.hadoop.hbase.regionserver;

import org.apache.yetus.audience.InterfaceAudience;

@InterfaceAudience.Private
public interface MetricsUserAggregate {

  /** Returns return a singleton instance of MetricsUserAggregateSource or null in case of NoOp */
  MetricsUserAggregateSource getSource();

  void updatePut(long t);

  void updateDelete(long t);

  void updateGet(long time, long blockBytesScanned);

  void updateIncrement(long time, long blockBytesScanned);

  void updateAppend(long time, long blockBytesScanned);

  void updateReplay(long t);

  void updateScan(long time, long blockBytesScanned);

  void updateCheckAndMutate(long blockBytesScanned);

  void updateFilteredReadRequests();

  void updateReadRequestCount();

}
