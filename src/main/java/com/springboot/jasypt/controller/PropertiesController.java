package com.springboot.jasypt.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class PropertiesController {

    @Value("${someapp.username}")
    private String username;

    @Value("${someapp.password}")
    private String password;

    @GetMapping("/properties")
    public String getProperties(){
        return "User name is : " + username + ", password is : " + password;
    }

}
