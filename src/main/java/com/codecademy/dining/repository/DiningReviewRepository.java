package com.codecademy.dining.repository;

import com.codecademy.dining.model.DiningReview;

import org.springframework.data.repository.CrudRepository;

public interface DiningReviewRepository extends CrudRepository<DiningReview, Long> {

}
