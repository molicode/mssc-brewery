package molicode.springframework.msscbrewery.web.controller;

import java.util.UUID;

import molicode.springframework.msscbrewery.service.BeerService;
import molicode.springframework.msscbrewery.web.model.BeerDto;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {

  private final BeerService beerService;

  public BeerController(BeerService beerService) {
    this.beerService = beerService;
  }

  @GetMapping("/{beerId}")
  public ResponseEntity<BeerDto> getBeer(@PathVariable("beerId") UUID beerId) {
    return new ResponseEntity<>(beerService.getBeerById(beerId), HttpStatus.OK);
  }

  @PostMapping// POST - create a new beer
  public ResponseEntity handlePost(BeerDto beerDto) {
    BeerDto savedDto = beerService.saveNewBeer(beerDto);

    HttpHeaders httpHeaders = new HttpHeaders();
    //todo add hostname to url
    httpHeaders.add("Location", "/api/v1/beer/" + savedDto.getId().toString());

    return new ResponseEntity(httpHeaders, HttpStatus.CREATED);
  }


}
