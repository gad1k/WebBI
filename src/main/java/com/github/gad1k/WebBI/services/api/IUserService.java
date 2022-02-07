package com.github.gad1k.WebBI.services.api;

import com.github.gad1k.WebBI.dto.User;
import com.github.gad1k.WebBI.entity.DatabaseUser;

import java.util.List;

public interface IUserService {

    Iterable<DatabaseUser> getUsers();
    String getUserById(int id);
    void addUsers(List<User> users);
    void deleteUserById(int[] userIds);

}
