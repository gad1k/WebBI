package com.github.gad1k.WebBI.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloWorldController {
    @GetMapping("/hello")
    public String helloWorld() {
        return "hello";
    }

    @RequestMapping(value = "hello2", method = RequestMethod.GET)
    public String helloWorld2() {
        return "Hello, World2!!!";
    }
}
