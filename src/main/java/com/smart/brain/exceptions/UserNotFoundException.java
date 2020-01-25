package com.smart.brain.exceptions;

public class UserNotFoundException  extends RuntimeException{
    public UserNotFoundException(Integer id) {
        super("Could not find user" + id);
    }

}
