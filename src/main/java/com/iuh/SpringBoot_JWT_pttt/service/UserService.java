package com.iuh.SpringBoot_JWT_pttt.service;

import com.iuh.SpringBoot_JWT_pttt.authen.UserPrincipal;
import com.iuh.SpringBoot_JWT_pttt.entity.User;

public interface UserService {
    User createUser(User user);
    UserPrincipal findByUsername(String username);
}
