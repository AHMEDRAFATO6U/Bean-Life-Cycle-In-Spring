package com.boot_demo1.beanlifecycle.services;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

@Service
public class UserServices implements InitializingBean {

    public UserServices() {
        System.out.println("UserServices constructor");
    }

    @PostConstruct
    public void PostConstruct() {
        System.out.println("UserServices postConstruct");
    }

    @Override
    public void afterPropertiesSet() throws Exception {

    }
    public String getuser() {
        return "UserServices getuser is displayed";
    }
    @PreDestroy
    public void PreDestroy() {
        System.out.println("UserServices preDestroy");
    }


}
