package com.codecademy.dining.model.services;

import com.codecademy.dining.model.entities.DiningReview;
import com.codecademy.dining.model.entities.User;
import com.codecademy.dining.model.enums.ReviewStatus;
import com.codecademy.dining.model.repositories.DiningReviewRepository;

import com.codecademy.dining.model.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@Service
public class DiningReviewService {
    private final DiningReviewRepository diningReviewRepository;
    private final UserRepository userRepository;

    @Autowired
    public DiningReviewService(DiningReviewRepository diningReviewRepository,
                               UserRepository userRepository) {
        this.diningReviewRepository = diningReviewRepository;
        this.userRepository = userRepository;
    }

    // Methods for diningReview repo go here

    // get all reviews
    public Iterable<DiningReview> getReviews() {
        return diningReviewRepository.findAll();
    }

    // get single reviews
    public Optional<DiningReview> getReviewById(Long reviewId) {
        Optional<DiningReview> reviewOptional = diningReviewRepository.findById(reviewId);
        if (!reviewOptional.isPresent()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,
                    "The review does not exist.");
        }
        return diningReviewRepository.findById(reviewId);
    }

    // add new review
    public DiningReview addNewReview(DiningReview diningReview) {
        //Optional<DiningReview> diningReviewOptional = diningReviewRepository.findById(diningReview.getId());
        //if (diningReviewOptional.isPresent()) {
        //    throw new ResponseStatusException(HttpStatus.NOT_FOUND,
        //            "The review already exists.");
        //}
        // check if the user exists in the user table
        if (!userRepository.existsByName(diningReview.getName())) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,
                    "The user is not register. Please create a new user.");
        }
        // review status PENDING on new review
        diningReview.setReviewStatus(ReviewStatus.PENDING);
        return diningReviewRepository.save(diningReview);
    }
}
