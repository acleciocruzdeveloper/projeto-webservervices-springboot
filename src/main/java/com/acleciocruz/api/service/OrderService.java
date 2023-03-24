package com.acleciocruz.api.service;

import com.acleciocruz.api.entities.Order;
import com.acleciocruz.api.repositories.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    private final OrderRepository repository;

    public OrderService(OrderRepository repository) {
        this.repository = repository;
    }

    public List<Order> findAllOrders(){
        return repository.findAll();
    }

    public Order findByIdOrder(Long id){
        Optional<Order> optionalOrder = repository.findById(id);
        return optionalOrder.get();
    }
}
