package com.example.localization.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Chamith
 */
@RestController
public class IndexController {

    @GetMapping("/")
    public String index(){
        return "Hello Localization Demo";
    }
}
