package com.codecademy.dining.model.services;

import java.util.List;
import java.util.Optional;

import com.codecademy.dining.model.entities.User;
import com.codecademy.dining.model.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.server.ResponseStatusException;

@Service
public class UserService {
  private final UserRepository userRepository;

  @Autowired
  public UserService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  // Retrieve all users
  public Iterable<User> getUsers() {
    return userRepository.findAll();
  }

  // Retrieve a user based on the given name
  public Optional<User> getUserByName(@PathVariable("userName") String userName) {
    Optional<User> userOptional = userRepository.findByName(userName);
    if (!userOptional.isPresent()) {
      throw new ResponseStatusException(HttpStatus.NOT_FOUND, "This user does not exist.");
    }
    return userRepository.findByName(userName);
  }

  // Add/register new user
  public User registerUser(User user) {
    Optional<User> userOptional = userRepository.findById(user.getId());
    if (userOptional.isPresent()) {
      throw new ResponseStatusException(HttpStatus.NOT_FOUND, "This user already exists.");
    }
    userRepository.save(user);
    return null;
  }
}
