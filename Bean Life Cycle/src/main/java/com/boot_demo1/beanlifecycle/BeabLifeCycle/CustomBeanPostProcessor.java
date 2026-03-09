package com.boot_demo1.beanlifecycle.BeabLifeCycle;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class CustomBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization (Object bean, String beanName){
        if(Objects.equals(beanName, "CustomBeanPostProcessor")){
            System.out.println("CustomBeanPostProcessor postProcessBeforeInitialization");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization (Object bean, String beanName){
        if(Objects.equals(beanName, "CustomBeanPostProcessor")){
            System.out.println("CustomBeanPostProcessor postProcessAfterInitialization");
        }
        return bean;
    }

}
