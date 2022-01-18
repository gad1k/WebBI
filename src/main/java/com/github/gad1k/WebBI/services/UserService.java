package com.github.gad1k.WebBI.services;

import com.github.gad1k.WebBI.services.api.IUserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class UserService implements IUserService {
    List<String> users = new ArrayList<String>(Arrays.asList("Andrei", "Ruslan"));

    @Override
    public List<String> getUsers() {
        return users;
    }

    @Override
    public String getUserById(int id) {
        return null;
    }

    @Override
    public void addUser(String user) {

    }

    @Override
    public void deleteUser(int id) {

    }
}
