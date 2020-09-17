package com.ssm.Ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDi {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        userService uService = (userService)applicationContext.getBean("userService");
        System.out.println(uService);

    }
}
