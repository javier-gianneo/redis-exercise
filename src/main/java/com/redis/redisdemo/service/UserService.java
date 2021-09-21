package com.redis.redisdemo.service;

import com.redis.redisdemo.model.User;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

public interface UserService {
    public User createUser(String id, String name);

    public User getUserById(String id);

    public List<User> getAllUsers();

    public void deleteUser(String id);
}
