package com.github.gad1k.WebBI.services;

import com.github.gad1k.WebBI.dto.User;
import com.github.gad1k.WebBI.services.api.IUserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService implements IUserService {
    List<String> users = new ArrayList<String>(Arrays.asList("Andrei", "Ruslan"));

    @Override
    public List<String> getUsers() {
        return users;
    }

    @Override
    public String getUserById(int id) {
        return users.get(id);
    }

    @Override
    public void addUsers(List<User> users) {
        this.users.addAll(users.stream().map(User::getName).collect(Collectors.toList()));
    }

    @Override
    public void deleteUserById(int[] userIds) {
        for (int userId : userIds) {
            users.remove(userId);
        }
    }
}
