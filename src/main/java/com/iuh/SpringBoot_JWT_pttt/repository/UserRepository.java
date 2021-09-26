package com.iuh.SpringBoot_JWT_pttt.repository;

import com.iuh.SpringBoot_JWT_pttt.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository
        extends JpaRepository<User, Long> {

    User findByUsername(String username);
}
