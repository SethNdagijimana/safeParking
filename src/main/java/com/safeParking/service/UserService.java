package com.safeParking.service;

import com.safeParking.model.User;

import java.util.List;

public interface UserService {
    User createUser (User user);
    User getUser(User user);
    List<User> userList();
}
