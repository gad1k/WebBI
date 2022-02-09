package com.github.gad1k.WebBI.services;

import com.github.gad1k.WebBI.entity.DatabaseUser;
import com.github.gad1k.WebBI.entity.UserRepository;
import com.github.gad1k.WebBI.services.api.IUserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService implements IUserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Iterable<DatabaseUser> getUsers() {
        return userRepository.findAll();
    }

    @Override
    public Optional<DatabaseUser> getUserById(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public void addUsers(List<DatabaseUser> users) {
        userRepository.saveAll(users);
    }

    @Override
    public void deleteUserById(List<Long> userIds) {
        userRepository.deleteAllById(userIds);
    }
}
