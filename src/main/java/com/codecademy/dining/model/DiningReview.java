package com.codecademy.dining.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

import com.codecademy.dining.enums.ReviewStatus;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "DINING_REVIEW")

@NoArgsConstructor
@Getter
@Setter
@ToString
public class DiningReview {
  @Id
  private Long id;

  @Column(name = "NAME")
  private String name;

  @Column(name = "PEANUT_SCORE")
  private Float peanutScore;

  @Column(name = "EGG_SCORE")
  private Float eggScore;

  @Column(name = "DAIRY_SCORE")
  private Float dairyScore;

  @Column(name = "COMMENT")
  private String comment;

  // @OneToOne(cascade = CascadeType.ALL)
  // @JoinColumn(name = "restaurantId", referencedColumnName = "ID")
  // private Restaurant restaurant;

  @Enumerated(EnumType.STRING)
  private ReviewStatus reviewStatus;
}
