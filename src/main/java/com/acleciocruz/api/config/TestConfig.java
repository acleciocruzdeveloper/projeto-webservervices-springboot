package com.acleciocruz.api.config;

import com.acleciocruz.api.entities.User;
import com.acleciocruz.api.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    private final UserRepository repository;

    public TestConfig(UserRepository repository) {
        this.repository = repository;
    }


    @Override
    public void run(String... args) throws Exception {
        User raulSeixas = User.builder()
                .name("Raul Seixas")
                .email("rauzito@email.com")
                .phone("4100 3655")
                .password("123")
                .id(null)
                .build();

        User erasmoCarlos = User.builder()
                .id(null)
                .name("Erasmo Carlos")
                .password("456")
                .phone("4500 0054")
                .email("erasmo@gmail.com")
                .build();

        repository.saveAll(Arrays.asList(raulSeixas, erasmoCarlos));
    }
}
