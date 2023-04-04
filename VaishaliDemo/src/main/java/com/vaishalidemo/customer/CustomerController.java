package com.vaishalidemo.customer;

import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.models.customer.CustomerPagedQueryResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
  @Autowired
    ProjectApiRoot apiRoot;
    @GetMapping("/customers")
    CustomerPagedQueryResponse getAllCustomer()
 {
      return apiRoot.customers().get().executeBlocking().getBody();
 }
}
