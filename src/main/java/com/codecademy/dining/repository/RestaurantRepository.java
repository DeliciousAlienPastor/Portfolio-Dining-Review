package com.codecademy.dining.repository;

import com.codecademy.dining.model.Restaurant;

import org.springframework.data.repository.CrudRepository;

public interface RestaurantRepository extends CrudRepository<Restaurant, Long> {

}
