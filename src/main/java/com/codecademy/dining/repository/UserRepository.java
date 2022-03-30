package com.codecademy.dining.repository;

import com.codecademy.dining.model.User;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

}
