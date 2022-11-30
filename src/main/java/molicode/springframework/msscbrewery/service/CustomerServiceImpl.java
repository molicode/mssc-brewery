package molicode.springframework.msscbrewery.service;

import java.util.UUID;

import lombok.extern.slf4j.Slf4j;
import molicode.springframework.msscbrewery.web.model.CustomerDto;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {

  @Override
  public CustomerDto getCustomerById(UUID customerId) {
    return CustomerDto.builder()
        .id(UUID.randomUUID())
        .name("Joe Buck")
        .build();
  }

  @Override
  public CustomerDto savedNewCustomer(CustomerDto customerDto) {
    return CustomerDto.builder()
        .id(UUID.randomUUID())
        .build();
  }

  @Override
  public void updateCustomer(UUID customerId, CustomerDto customerDto) {
    //todo impl

  }

  @Override
  public void deleteById(UUID customerId) {
    log.debug("Deleting a customer...");
  }

}
