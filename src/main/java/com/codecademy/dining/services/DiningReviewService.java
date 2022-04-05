package com.codecademy.dining.services;

import com.codecademy.dining.repository.DiningReviewRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DiningReviewService {
  private final DiningReviewRepository diningReviewRepository;

  @Autowired
  public DiningReviewService(DiningReviewRepository diningReviewRepository) {
    this.diningReviewRepository = diningReviewRepository;
  }

  // Methods for diningReview repo go here
}
