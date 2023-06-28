package com.safeParking.service;

import com.safeParking.model.User;
import com.safeParking.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserImplementation implements UserService{

    @Autowired
    UserRepository userRepo;
    @Override
    public User createUser(User user) {
        return userRepo.save(user);
    }

    @Override
    public User getUser(User user) {
        return userRepo.findByEmail(user.getEmail()).orElse(null);
    }

    @Override
    public List<User> userList() {
        return userRepo.findAll();
    }
}
