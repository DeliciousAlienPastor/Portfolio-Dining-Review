package com.codecademy.dining.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.codecademy.dining.model.enums.ReviewStatus;

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
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "RESTAURANT_ID")
    private Long restaurantId;

    @Column(name = "PEANUT_SCORE")
    private Float peanutScore;

    @Column(name = "EGG_SCORE")
    private Float eggScore;

    @Column(name = "DAIRY_SCORE")
    private Float dairyScore;

    @Column(name = "COMMENT")
    private String comment;

    @Column(name = "REVIEW_STATUS")
    @Enumerated(EnumType.STRING)
    private ReviewStatus reviewStatus;
}
// @OneToOne(cascade = CascadeType.ALL)
// @JoinColumn(name = "restaurantId", referencedColumnName = "ID")
// private Restaurant restaurant;
