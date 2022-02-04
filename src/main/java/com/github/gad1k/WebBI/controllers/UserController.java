package com.github.gad1k.WebBI.controllers;

import com.github.gad1k.WebBI.dto.User;
import com.github.gad1k.WebBI.services.api.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {
    @Autowired
    IUserService userService;

    @GetMapping()
    public String getUsers(@RequestParam(name = "name", required = false, defaultValue = "World") String name,
                           Model model) {
        model.addAttribute("name", name);
        model.addAttribute("users", userService.getUsers());
        return "users";
    }

    @GetMapping("/{id}")
    public String getUserById(@PathVariable int id, Model model) {
        model.addAttribute("users", userService.getUserById(id));
        return "users";
    }

    @PostMapping()
    public String addUsers(@RequestBody List<User> users, Model model) {
        userService.addUsers(users);
        model.addAttribute("users", "OK");
        return "users";
    }

    @DeleteMapping()
    public String deleteUsers(@RequestBody int[] userIds, Model model) {
        userService.deleteUserById(userIds);
        model.addAttribute("users", "OK");
        return "users";
    }
}
