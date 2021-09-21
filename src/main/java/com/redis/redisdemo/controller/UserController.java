package com.redis.redisdemo.controller;

import com.redis.redisdemo.model.User;
import com.redis.redisdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {
  @Autowired
  private UserService service;

  @GetMapping("/{id}")
  public ResponseEntity<User> getById(@PathVariable String id) {
    return ResponseEntity.ok(service.getUserById(id));
  }

  @GetMapping
  public ResponseEntity<List<User>> getById() {
      return ResponseEntity.ok(service.getAllUsers());
  }

  @PutMapping
  public ResponseEntity<User> createUser(@RequestParam String id, @RequestParam String name) {
    User user = service.createUser(id, name);
    return ResponseEntity.ok(user);
  }

  @DeleteMapping("/{id}")
  public void deleteUser(@PathVariable String id) {
    service.deleteUser(id);
  }
}
