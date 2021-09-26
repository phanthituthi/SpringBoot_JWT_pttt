package com.iuh.SpringBoot_JWT_pttt.repository;

import com.iuh.SpringBoot_JWT_pttt.entity.Token;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TokenRepository extends JpaRepository<Token, Long> {
    Token findByToken(String token);
}
