/*
 * Copyright (C) 2017 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package android.platform.helpers;


/**
 * Helper class for functional tests of bluetooth setup.
 */
public interface IAutoBluetoothHelper {

  /**
   * Setup expectations: Bluetooth activity is open.
   *
   * This will click on skip button to exit wifi setup
   */
  void clickSkipButton();

  /**
   * Setup expectations: Bluetooth activity is open.
   *
   * this will check for all the required fields.
   */
  void verifyRequiredFields();
}
