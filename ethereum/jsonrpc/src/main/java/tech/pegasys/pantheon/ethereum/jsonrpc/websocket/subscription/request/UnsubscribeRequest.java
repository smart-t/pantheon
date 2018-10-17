/*
 * Copyright 2018 ConsenSys AG.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package tech.pegasys.pantheon.ethereum.jsonrpc.websocket.subscription.request;

import com.google.common.base.Objects;

public class UnsubscribeRequest {

  private final Long subscriptionId;
  private final String connectionId;

  public UnsubscribeRequest(final Long subscriptionId, final String connectionId) {
    this.subscriptionId = subscriptionId;
    this.connectionId = connectionId;
  }

  public Long getSubscriptionId() {
    return subscriptionId;
  }

  public String getConnectionId() {
    return connectionId;
  }

  @Override
  public String toString() {
    return "UnsubscribeRequest{"
        + "subscriptionId='"
        + subscriptionId
        + ", connectionId="
        + connectionId
        + '}';
  }

  @Override
  public boolean equals(final Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    final UnsubscribeRequest that = (UnsubscribeRequest) o;
    return Objects.equal(subscriptionId, that.subscriptionId)
        && Objects.equal(connectionId, that.connectionId);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(subscriptionId, connectionId);
  }
}