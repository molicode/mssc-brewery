package molicode.springframework.msscbrewery.service;

import java.util.UUID;

import molicode.springframework.msscbrewery.web.model.CustomerDto;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

  @Override
  public CustomerDto getCustomerById(UUID customerId) {
    return CustomerDto.builder()
        .id(UUID.randomUUID())
        .name("Joe Buck")
        .build();
  }

}
