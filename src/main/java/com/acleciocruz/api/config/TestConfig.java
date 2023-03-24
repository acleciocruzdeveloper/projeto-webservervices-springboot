package com.acleciocruz.api.config;

import com.acleciocruz.api.entities.Order;
import com.acleciocruz.api.entities.User;
import com.acleciocruz.api.repositories.OrderRepository;
import com.acleciocruz.api.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    private final UserRepository repository;

    private final OrderRepository orderRepository;

    public TestConfig(UserRepository repository, OrderRepository orderRepository) {
        this.repository = repository;
        this.orderRepository = orderRepository;
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

        Order order1 = Order.builder().id(null).moment(Instant.parse("2019-06-20T19:53:07Z"))
                .client(raulSeixas).build();
        Order order2 = Order.builder().id(null).moment(Instant.parse("2023-03-20T14:06:52Z"))
                .client(erasmoCarlos).build();
        Order order3 = Order.builder().id(null).moment(Instant.parse("2023-03-19T15:52:07Z"))
                .client(raulSeixas).build();

        repository.saveAll(Arrays.asList(raulSeixas, erasmoCarlos));
        orderRepository.saveAll(Arrays.asList(order1, order2, order3));
    }
}
