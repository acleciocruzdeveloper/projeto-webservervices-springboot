package com.acleciocruz.api.resources;

import com.acleciocruz.api.entities.User;
import com.acleciocruz.api.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api/users")
public class UserResource {
    private final UserService service;

    public UserResource(UserService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<User>> findAllUsers(){
        List<User> allUsers = service.getAllUsers();
        return ResponseEntity.ok().body(allUsers);
    }
    @GetMapping(value = "/{id}")
    public ResponseEntity<Optional<User>> getUserById(@PathVariable Long id){
        Optional<User> user = service.getUser(id);
        return ResponseEntity.ok().body(user);
    }

}
