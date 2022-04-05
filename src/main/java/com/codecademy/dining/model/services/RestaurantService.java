package com.codecademy.dining.model.services;

import com.codecademy.dining.model.repositories.RestaurantRepository;

import org.springframework.stereotype.Service;

@Service
public class RestaurantService {
  private final RestaurantRepository restaurantRepository;

  public RestaurantService(RestaurantRepository restaurantRepository) {
    this.restaurantRepository = restaurantRepository;
  }
  // Methods for restaurant repo go here
}
