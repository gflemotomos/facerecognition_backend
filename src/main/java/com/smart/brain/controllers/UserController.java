package com.smart.brain.controllers;

import com.smart.brain.exceptions.UserNotFoundException;
import com.smart.brain.models.User;
import com.smart.brain.repositories.UserRepository;
import com.smart.brain.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

//    private final UserRepository userRepository;

//    public UserController(UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }

//    @PostMapping("/users")
//    public User newUser(@RequestBody User newUser) {
//        return userRepository.save(newUser);
//    }
//
//    @GetMapping("/user/{id}")
//    public User one(@PathVariable Integer id) {
//        return userRepository.findById(id).orElseThrow(() -> new UserNotFoundException(id));
//    }


    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/newUser")
    public User newUser(@RequestBody User newUser) {
        return userService.createUser(newUser);
    }

    @GetMapping("user/{id}")
    public User findUserById(@PathVariable Integer id) {
        return userService.findUser(id);
    }
}
