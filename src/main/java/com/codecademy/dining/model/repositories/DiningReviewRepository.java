package com.codecademy.dining.model.repositories;

import com.codecademy.dining.model.entities.DiningReview;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiningReviewRepository extends CrudRepository<DiningReview, Long> {

}
