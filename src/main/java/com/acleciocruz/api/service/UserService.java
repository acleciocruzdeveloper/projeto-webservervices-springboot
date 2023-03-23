package com.acleciocruz.api.service;

import com.acleciocruz.api.entities.User;
import com.acleciocruz.api.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public List<User> getAllUsers() {
        return repository.findAll();
    }

    public Optional<User> getUser(Long id){
        Optional<User> byId = repository.findById(id);
        return byId;
    }
}
