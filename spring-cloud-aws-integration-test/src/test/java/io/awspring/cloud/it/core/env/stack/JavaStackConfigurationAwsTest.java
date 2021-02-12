/*
 * Copyright 2013-2021 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.awspring.cloud.it.core.env.stack;

import io.awspring.cloud.context.config.annotation.EnableStackConfiguration;
import io.awspring.cloud.it.IntegrationTestConfig;
import io.awspring.cloud.it.support.TestStackEnvironment;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ContextConfiguration;

/**
 * @author Agim Emruli
 */
@ContextConfiguration(classes = JavaStackConfigurationAwsTest.JavaStackConfigurationAwsTestConfig.class)
class JavaStackConfigurationAwsTest extends StackConfigurationAwsTest {

	@Configuration
	@EnableStackConfiguration(stackName = TestStackEnvironment.DEFAULT_STACK_NAME)
	@Import(IntegrationTestConfig.class)
	static class JavaStackConfigurationAwsTestConfig {

	}

}
