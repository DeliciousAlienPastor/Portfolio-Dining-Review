package com.codecademy.dining.controller;

import java.util.Optional;
import java.util.List;

import com.codecademy.dining.model.entities.*;
import com.codecademy.dining.model.services.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    // fetch all
    @GetMapping(path = "users/")
    public Iterable<User> getUsers() {
        return userService.getUsers();
    }

    // fetch single
    @GetMapping(path = "users/{userName}")
    public Optional<User> getUserByName(
            @PathVariable("userName") String name) {
        return userService.getUserByName(name);
    }

    // create new user
    @PostMapping(path = "users")
    public User registerUser(@RequestBody User newUser) {
        return userService.registerUser(newUser);
    }

    // update user (prevent name update)
    @PutMapping(path = "users/{userName}")
    public User updateUser(
            @PathVariable("userName") String userName,
            @RequestBody() User newUser) {
        return userService.updateUser(userName, newUser);
    }

    // delete user
    @DeleteMapping(path = "users/{userName}")
    public User deleteUser(@PathVariable("userName") String userName) {
        return userService.deleteUser(userName);
    }

    // Restaurant REST endpoints

    // Dining review REST endpoints
    @GetMapping(path = "reviews")
    public Iterable<DiningReview> getReviews() {
        return diningReviewService.getReviews();
    }

    @GetMapping(path = "reviews/{reviewId}")
    public Optional<DiningReview> getReviewById(@PathVariable Long reviewId) {
        return diningReviewService.getReviewById(reviewId);
    }

    @PostMapping(path = "reviews")
    public DiningReview addNewReview(@RequestBody DiningReview diningReview) {
        return diningReviewService.addNewReview(diningReview);
    }

    @GetMapping(path = "admins/reviews/pending")
    public Optional<DiningReview> getAllByReviewStatus() {
        return diningReviewService.getAllPending();
    }

    // change review status
    @PutMapping(path = "admins/reviews/{reviewId}/{status}")
    public DiningReview changeReviewStatus(
            @PathVariable("reviewId") Long reviewId,
            @PathVariable("status") String status
    ) {
        return diningReviewService.changeReviewStatus(reviewId, status);
    }
}