package com.github.gad1k.WebBI.services.api;

import java.util.List;

public interface IUserService {

    List<String> getUsers();
    String getUserById(int id);
    void addUser(String user);
    void deleteUser(int id);

}
