package com.acleciocruz.api.resources;

import com.acleciocruz.api.entities.Order;
import com.acleciocruz.api.service.OrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "api/orders")
public class OrderController {
    private final OrderService service;

    public OrderController(OrderService service) {
        this.service = service;
    }
    @GetMapping
    public ResponseEntity<List<Order>> getAllOrders(){
        List<Order> allOrders = service.findAllOrders();
        return ResponseEntity.ok().body(allOrders);
    }
    @GetMapping(value = "/{id}")
    public ResponseEntity<Order> getOrderById(@PathVariable Long id) {
        Order order = service.findByIdOrder(id);
        return ResponseEntity.ok().body(order);
    }
}
