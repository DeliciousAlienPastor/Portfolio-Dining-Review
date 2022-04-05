package com.codecademy.dining.controller;

import com.codecademy.dining.services.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/")
public class DiningController {
  private final DiningReviewService diningReviewService;
  private final UserService userService;
  private final RestaurantService restaurantService;

  @Autowired
  public DiningController(DiningReviewService diningReviewService, UserService userService,
      RestaurantService restaurantService) {
    this.diningReviewService = diningReviewService;
    this.userService = userService;
    this.restaurantService = restaurantService;
  }

  // REST goes below
}
