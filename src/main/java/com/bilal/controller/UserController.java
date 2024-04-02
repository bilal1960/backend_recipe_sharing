package com.bilal.controller;

import com.bilal.model.User;
import com.bilal.repository.UserRepository;
import com.bilal.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;
    @GetMapping("/api/users/profile")
    public User findUserByJwt(@RequestHeader("Authorization")String jwt) throws Exception {

        User user=userService.findUserByJwt(jwt);

        return user;


    }







}
