package com.acleciocruz.api.repositories;

import com.acleciocruz.api.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
