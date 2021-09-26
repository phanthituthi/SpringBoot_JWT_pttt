package com.iuh.SpringBoot_JWT_pttt.service;

import com.iuh.SpringBoot_JWT_pttt.entity.Token;
public interface TokenService {
    Token createToken(Token token);

    Token findByToken(String token);
}
