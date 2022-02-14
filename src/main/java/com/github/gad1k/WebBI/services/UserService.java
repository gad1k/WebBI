package com.github.gad1k.WebBI.services;

import com.github.gad1k.WebBI.dto.User;
import com.github.gad1k.WebBI.dto.api.UserRepository;
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
    public Iterable<User> getUsers() {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public void addUsers(List<User> users) {
        userRepository.saveAll(users);
    }

    @Override
    public void deleteUserById(List<Long> userIds) {
        try {
            userRepository.deleteAllById(userIds);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
