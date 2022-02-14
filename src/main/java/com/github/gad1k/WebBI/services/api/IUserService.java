package com.github.gad1k.WebBI.services.api;

import com.github.gad1k.WebBI.dto.User;

import java.util.List;
import java.util.Optional;

public interface IUserService {

    Iterable<User> getUsers();
    Optional<User> getUserById(Long id);
    void addUsers(List<User> users);
    void deleteUserById(List<Long> userIds);

}
