package molicode.springframework.msscbrewery.service;

import java.util.UUID;

import molicode.springframework.msscbrewery.web.model.BeerDto;

public interface BeerService {

  BeerDto getBeerById(UUID beerId);

  BeerDto saveNewBeer(BeerDto beerDto);

  void updateBeer(UUID beerId, BeerDto beerDto);

  void deleteById(UUID beerId);
}
