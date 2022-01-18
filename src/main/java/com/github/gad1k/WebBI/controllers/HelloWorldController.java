package com.github.gad1k.WebBI.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello, World!!!";
    }

    @RequestMapping(value = "hello2", method = RequestMethod.GET)
    public String helloWorld2() {
        return "Hello, World2!!!";
    }
}
