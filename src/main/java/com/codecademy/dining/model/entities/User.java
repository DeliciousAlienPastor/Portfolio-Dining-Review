package com.codecademy.dining.model.entities;

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
@Table(name = "USER")
@NoArgsConstructor
@Getter
@Setter
@ToString
public class User {
  @Id
  @Column(name = "ID")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "NAME")
  private String name;

  @Column(name = "CITY")
  private String city;

  @Column(name = "STATE")
  private String state;

  @Column(name = "ZIPCODE")
  private Long zipCode;

  @Column(name = "BOOL_PEANUT")
  private boolean interestedInPeanut;

  @Column(name = "BOOL_EGG")
  private boolean interestedInEgg;

  @Column(name = "BOOL_DAIRY")
  private boolean interestedInDairy;

  public Long getId() {
    return id;
  }

}
