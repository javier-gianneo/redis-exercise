package com.redis.redisdemo.service;

import com.redis.redisdemo.model.User;

import java.util.ArrayList;
import java.util.List;

public interface UserService {
    public User createUser(String name);

    public User getUserById(String id);

    public List<User> getAllUsers();

    public void deleteUser(String id);
}
