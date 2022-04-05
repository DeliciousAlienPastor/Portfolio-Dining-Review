package com.codecademy.dining.repository;

import com.codecademy.dining.model.DiningReview;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiningReviewRepository extends CrudRepository<DiningReview, Long> {

}
