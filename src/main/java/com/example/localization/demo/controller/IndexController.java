package com.example.localization.demo.controller;

import com.example.localization.demo.domain.User;
import com.example.localization.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Chamith
 */
@RestController
public class IndexController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String index() {
        return "Hello Localization Demo";
    }

    @PostMapping("/user")
    public String create() {
//        User user = new User();
//        user.setName("Chamith Kodikara");
//        user.setAddress("Colombo");
//        user.setContactNo("0714948048");
//        user.setDateOfBirth(LocalDate.of(1993, 4, 20));
//        user = userService.create(user);
        return "User Added --- ";
    }

    @GetMapping("/user")
    public User find() {
        return userService.findByName("Chamith Kodikara");
    }
}
