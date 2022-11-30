package molicode.springframework.msscbrewery.service;

import java.util.UUID;

import molicode.springframework.msscbrewery.web.model.CustomerDto;

public interface CustomerService {

  CustomerDto getCustomerById(UUID customerId);

  CustomerDto savedNewCustomer(CustomerDto customerDto);

  void updateCustomer(UUID customerId, CustomerDto customerDto);

  void deleteById(UUID customerId);
}
