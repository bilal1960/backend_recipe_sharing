package com.bilal.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping
    public String homecontroller(){

        return "well come back to code in java";
    }
}
