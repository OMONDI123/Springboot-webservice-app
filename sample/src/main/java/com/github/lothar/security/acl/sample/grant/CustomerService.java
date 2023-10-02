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
package com.github.lothar.security.acl.sample.grant;

import javax.annotation.Resource;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.lothar.security.acl.sample.domain.Customer;
import com.github.lothar.security.acl.sample.jpa.CustomerRepository;

@Service
public class CustomerService {

  @Resource
  private CustomerRepository repository;

  @Transactional
  @PreAuthorize("hasPermission(#customer, 'SAVE')")
  public Customer save(Customer customer) {
    return repository.save(customer);
  }
}
