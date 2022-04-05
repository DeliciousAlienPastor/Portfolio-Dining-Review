package com.codecademy.dining.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "RESTAURANT")

@NoArgsConstructor
@Getter
@Setter
@ToString
public class Restaurant {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "NAME")
  private String name;

  @Column(name = "CONTACT")
  private Long contact;

  @Column(name = "ADDRESS")
  private String address;

  // @OneToOne(mappedBy = "DINING_REVIEW")
  // private DiningReview diningReview;

}
