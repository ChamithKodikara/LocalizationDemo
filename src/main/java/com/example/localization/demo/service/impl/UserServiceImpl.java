package com.example.localization.demo.service.impl;

import com.example.localization.demo.domain.User;
import com.example.localization.demo.repository.UserRepository;
import com.example.localization.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Chamith
 */
@Transactional
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User create(User user){
        userRepository.save(user);
        return user;
    }

    @Override
    public User findByName(String name){
        return userRepository.findByName(name);
    }
}
