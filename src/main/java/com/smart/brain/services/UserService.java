package com.smart.brain.services;

import com.smart.brain.models.User;

public interface UserService {
    public abstract User createUser(User user);
    public abstract User findUser(int id);
}
