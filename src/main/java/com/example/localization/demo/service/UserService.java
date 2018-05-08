package com.example.localization.demo.service;

import com.example.localization.demo.domain.User;

/**
 * @author Chamith
 */
public interface UserService {

    User create(User user);

    User findByName(String name);
}
