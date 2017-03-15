package com.job.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Copyright with Patsnap company.
 * Author: Tory
 * Date: 3/15/17
 * Time: 3:27 PM
 */
@RequestMapping(value = "/test")
@RestController
public class TestController {

    @GetMapping
    public String checkIfEmailUsed() {
        System.out.println("in the test get controller.");
        return "in the test get controller.";
    }
}
