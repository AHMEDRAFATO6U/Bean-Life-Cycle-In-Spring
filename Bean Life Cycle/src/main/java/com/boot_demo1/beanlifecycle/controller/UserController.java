package com.boot_demo1.beanlifecycle.controller;

import com.boot_demo1.beanlifecycle.services.UserServices;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final UserServices userServices;
    public UserController(UserServices userServices) {
        System.out.println("UserController constructor called");
        this.userServices = userServices;
    }

    public UserServices getUserServices() {
        return userServices;
    }

    @GetMapping("/users")
    public String getUser(){
        return userServices.getuser();
    }
}
