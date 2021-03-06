/*
 * Copyright 2019 ConsenSys AG.
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
package tech.pegasys.pantheon.tests.acceptance.dsl.transaction.eea;

public class EeaTransactions {

  public EeaGetTransactionReceiptTransaction getTransactionReceipt(final String transactionHash) {
    return new EeaGetTransactionReceiptTransaction(transactionHash);
  }

  public EeaGetTransactionCountTransaction getTransactionCount(
      final String address, final String privacyGroupId) {
    return new EeaGetTransactionCountTransaction(address, privacyGroupId);
  }

  public EeaGetTransactionReceiptTransaction getPrivateTransactionReceipt(
      final String transactionHash) {
    return new EeaGetTransactionReceiptTransaction(transactionHash);
  }
}
