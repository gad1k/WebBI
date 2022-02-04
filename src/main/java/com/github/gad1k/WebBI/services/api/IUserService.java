package com.github.gad1k.WebBI.services.api;

import com.github.gad1k.WebBI.dto.User;

import java.util.List;

public interface IUserService {

    List<String> getUsers();
    String getUserById(int id);
    void addUsers(List<User> users);
    void deleteUserById(int[] userIds);

}
