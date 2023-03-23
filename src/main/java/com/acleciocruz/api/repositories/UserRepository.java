package com.acleciocruz.api.repositories;

import com.acleciocruz.api.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
