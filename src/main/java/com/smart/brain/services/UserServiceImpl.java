package com.smart.brain.services;

import com.smart.brain.exceptions.UserNotFoundException;
import com.smart.brain.models.User;
import com.smart.brain.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User findUser(int id) {
        return userRepository.findById(id).orElseThrow(() -> new UserNotFoundException(id));
    }
}
