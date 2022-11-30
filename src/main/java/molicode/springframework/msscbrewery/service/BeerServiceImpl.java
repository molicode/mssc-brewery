package molicode.springframework.msscbrewery.service;

import java.util.UUID;

import molicode.springframework.msscbrewery.web.model.BeerDto;
import org.springframework.stereotype.Service;

@Service
public class BeerServiceImpl implements BeerService {

  @Override
  public BeerDto getBeerById(UUID beerId) {
    return BeerDto.builder()
        .id(UUID.randomUUID())
        .beerName("Galaxy Cat")
        .beerStyle("Pale Ale")
        .build();
  }

  @Override
  public BeerDto saveNewBeer(BeerDto beerDto) {
    return BeerDto.builder()
        .id(beerDto.getId())
        .build();
  }

  @Override
  public void updateBeer(UUID beerId, BeerDto beerDto) {
    // todo impl - would add a real impl to update beer

  }
}
