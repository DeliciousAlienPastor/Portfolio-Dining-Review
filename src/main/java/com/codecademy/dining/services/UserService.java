package com.codecademy.dining.services;

import java.util.List;
import java.util.Optional;

import com.codecademy.dining.model.User;
import com.codecademy.dining.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

  // Add/register new user
  public void registerUser(User user) {
    Optional<User> userOptional = userRepository.findById(getId());
    if (userOptional.isPresent()) {
      throw new IllegalStateException("User already exists!");
    }
    userRepository.save(user);
  }
}
