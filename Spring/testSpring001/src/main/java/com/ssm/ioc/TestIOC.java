package com.ssm.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIOC {

    public static void main(String[] args) {
//        1、初始化spring容器，加载配置文件
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");
//        2、通过容器获得userDao实例
        userDao userdao = (userDao)applicationContext.getBean("userDao");
        userdao.say();

    }

}
