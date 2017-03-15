package com.job.controller;

import com.job.bean.User;
import com.job.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Copyright with Patsnap company.
 * Author: Tory
 * Date: 3/15/17
 * Time: 4:52 PM
 */
@RequestMapping(value = "/user")
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    public void saveUser(User user) {
        userService.saveUser(user);
    }

    @GetMapping
    public void saveUser1() {
        User user = new User();
        user.setName("周桐");
        user.setAge(21);
        userService.saveUser(user);
    }
}
