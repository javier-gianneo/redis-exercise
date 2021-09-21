package com.redis.redisdemo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import java.io.Serializable;

@RedisHash("User")
public class User implements Serializable {
  @Id
  private String id;
  private String name;

  public User() {
  }

  public User(String id, String name) {
    this.id = id;
    this.name = name;
  }

  public User(String name) {
    this.name = name;
  }
}
