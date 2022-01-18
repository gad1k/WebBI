package com.github.gad1k.WebBI.controllers;

import com.github.gad1k.WebBI.services.api.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class UserController {
    @Autowired
    IUserService userService;

    @GetMapping("/users")
    public String getUsers(@RequestParam(name = "name", required = false, defaultValue = "World") String name,
                           Model model) {
        model.addAttribute("name", name);
        model.addAttribute("users", userService.getUsers());
        return "users";
    }
}
