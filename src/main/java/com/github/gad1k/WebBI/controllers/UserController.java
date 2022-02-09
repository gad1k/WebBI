package com.github.gad1k.WebBI.controllers;

import com.github.gad1k.WebBI.dto.User;
import com.github.gad1k.WebBI.entity.DatabaseUser;
import com.github.gad1k.WebBI.services.api.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collections;
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
    public String getUserById(@PathVariable Long id, Model model) {
        model.addAttribute("users", userService.getUserById(id)
                                                             .map(Collections::singleton)
                                                             .orElseGet(Collections::emptySet));
        return "users";
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public void addUsers(@RequestBody List<DatabaseUser> users) {
        userService.addUsers(users);
    }

    @DeleteMapping()
    @ResponseStatus(HttpStatus.OK)
    public void deleteUsers(@RequestBody List<Long> userIds) {
        userService.deleteUserById(userIds);
    }
}
