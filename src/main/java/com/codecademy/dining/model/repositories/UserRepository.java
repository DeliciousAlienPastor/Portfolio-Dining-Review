package com.codecademy.dining.model.repositories;

import java.util.Optional;

import com.codecademy.dining.model.entities.User;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

  Optional<User> findByName(String userName);

}
