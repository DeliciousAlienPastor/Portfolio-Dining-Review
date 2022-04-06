package com.codecademy.dining.controller;

import java.util.Optional;

import com.codecademy.dining.model.entities.*;
import com.codecademy.dining.model.services.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

  // User REST endpoints
  @GetMapping(path = "users/")
  public Iterable<User> getUsers() {
    return userService.getUsers();
  }

  // fetch user belonging to the given display name
  @GetMapping(path = "users/{userName}")
  public Optional<User> getUserByName(
      @PathVariable("userName") String name) {
    return userService.getUserByName(name);
  }

  // update user but prevent name change
  @PutMapping(path = "users/{userName}")
  public User updateUser(
      @PathVariable("userName") String userName,
      @RequestBody User newUser) {
    return userService.updateUser(userName, newUser);
  }

  // Restaurant REST endpoints

  // Dining review REST endpoints

}