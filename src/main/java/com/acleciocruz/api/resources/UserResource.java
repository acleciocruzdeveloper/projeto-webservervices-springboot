package com.acleciocruz.api.resources;

import com.acleciocruz.api.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAllUsers(){
        User build = User.builder().id(1l)
                .name("Raul Seixas")
                .phone("61 9966-3365")
                .password("123456")
                .email("acleciocruz@emeal.com")
                .build();
        return ResponseEntity.ok(build);
    }

}
