package com.codecademy.dining.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity

@NoArgsConstructor
@Getter
@Setter
@ToString
public class User {
  @Id
  private Long id;

  @Column(name = "NAME")
  private String name;

  @Column(name = "CITY")
  private String city;

  @Column(name = "STATE")
  private String state;

  @Column(name = "ZIPCODE")
  private Long zipCode;

  @Column(name = "INTERESTED_IN_PEANUT")
  private Boolean interestedInPeanut;

  @Column(name = "INTERESTED_IN_EGG")
  private Boolean interestedInEgg;

  @Column(name = "INTERESTED_IN_DAIRY")
  private Boolean interestedInDairy;
}
