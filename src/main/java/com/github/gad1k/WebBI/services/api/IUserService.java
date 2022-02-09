package com.github.gad1k.WebBI.services.api;

import com.github.gad1k.WebBI.entity.DatabaseUser;

import java.util.List;
import java.util.Optional;

public interface IUserService {

    Iterable<DatabaseUser> getUsers();
    Optional<DatabaseUser> getUserById(Long id);
    void addUsers(List<DatabaseUser> users);
    void deleteUserById(List<Long> userIds);

}
