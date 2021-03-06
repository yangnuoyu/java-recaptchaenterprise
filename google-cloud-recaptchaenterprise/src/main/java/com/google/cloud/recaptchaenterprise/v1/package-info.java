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

/**
 * A client to reCAPTCHA Enterprise API.
 *
 * <p>The interfaces provided are listed below, along with usage samples.
 *
 * <p>================================ RecaptchaEnterpriseServiceClient
 * ================================
 *
 * <p>Service Description: Service to determine the likelihood an event is legitimate.
 *
 * <p>Sample for RecaptchaEnterpriseServiceClient:
 *
 * <pre>
 * <code>
 * try (RecaptchaEnterpriseServiceClient recaptchaEnterpriseServiceClient = RecaptchaEnterpriseServiceClient.create()) {
 *   ProjectName parent = ProjectName.of("[PROJECT]");
 *   Assessment assessment = Assessment.newBuilder().build();
 *   Assessment response = recaptchaEnterpriseServiceClient.createAssessment(parent, assessment);
 * }
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
package com.google.cloud.recaptchaenterprise.v1;

import javax.annotation.Generated;
