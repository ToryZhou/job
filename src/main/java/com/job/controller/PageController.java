package com.job.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Copyright with Patsnap company.
 * Author: Tory
 * Date: 3/15/17
 * Time: 3:40 PM
 */

@Controller
public class PageController {

    @GetMapping(value = "/hello")
    public ModelAndView hello() {
        System.out.println("In the hello controller.");
        ModelAndView mav = new ModelAndView("hello");
        mav.addObject("name", "aa");
        return mav;
    }

//    @RequestMapping("/hello/{name}")
//    public String hello(@PathVariable("name") String name, Model model) {
//        model.addAttribute("name", name);
//        return "hello";
//    }
}
