package com.codecademy.dining.model.repositories;

import com.codecademy.dining.model.entities.DiningReview;

import com.codecademy.dining.model.enums.ReviewStatus;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DiningReviewRepository extends CrudRepository<DiningReview, Long> {

    Optional<DiningReview> findByReviewStatus(ReviewStatus reviewStatus);
}
