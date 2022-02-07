package com.github.gad1k.WebBI.services;

import com.github.gad1k.WebBI.dto.User;
import com.github.gad1k.WebBI.entity.DatabaseUser;
import com.github.gad1k.WebBI.entity.UserRepository;
import com.github.gad1k.WebBI.services.api.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService implements IUserService {
    List<String> users = new ArrayList<String>(Arrays.asList("Andrei", "Ruslan"));
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Iterable<DatabaseUser> getUsers() {
        return userRepository.findAll();
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
