package com.codecademy.dining.model.services;

import com.codecademy.dining.model.enums.ReviewStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AdminReview {
  private Boolean acceptReview;

  public Boolean acceptReview(ReviewStatus reviewStatus) {
    return null;
  }
}
