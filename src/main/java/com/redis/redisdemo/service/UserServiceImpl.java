package com.redis.redisdemo.service;

import com.redis.redisdemo.model.User;
import com.redis.redisdemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
  @Autowired
  private UserRepository repository;

  public User createUser(String name) {
    User user = new User(name);
    final User respons = repository.save(user);
    return respons;
  }

  public User getUserById(String id) {
    return repository.findById(id).get();
  }

  public List<User> getAllUsers() {
    List<User> users = new ArrayList<>();
    repository.findAll().forEach(users::add);
    return users;
  }

  public void deleteUser(String id) {
    repository.deleteById(id);
  }
}
