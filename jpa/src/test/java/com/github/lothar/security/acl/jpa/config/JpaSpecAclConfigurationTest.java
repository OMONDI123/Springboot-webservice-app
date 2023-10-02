/*******************************************************************************
 * Copyright 2002-2016 the original author or authors.
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
 *******************************************************************************/
package com.github.lothar.security.acl.jpa.config;

import static org.assertj.core.api.Assertions.assertThat;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.test.context.junit4.SpringRunner;

import com.github.lothar.security.acl.jpa.JpaSpecFeature;
import com.github.lothar.security.acl.jpa.JpaSpecTestConfiguration;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = JpaSpecTestConfiguration.class)
public class JpaSpecAclConfigurationTest {

  @Resource
  private Specification<?> allowAllSpecification;
  @Resource
  private Specification<?> denyAllSpecification;
  @Resource
  private JpaSpecFeature<?> jpaSpecFeature;

  @Test
  public void should_jpaSpecFeature_be_loaded() {
    assertThat(jpaSpecFeature).isNotNull();
  }

  @Test
  public void should_allowAllSpec_be_loaded() {
    assertThat(allowAllSpecification).isNotNull();
  }

  @Test
  public void should_denyAllSpec_be_loaded() {
    assertThat(denyAllSpecification).isNotNull();
  }

}
