package com.ssm.Ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIoc {
    public static void main(String[] args) {
//        初始化spring容器，加载配置文件；
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");
//        通过容器获取实例；
        userDao udao = (userDao)applicationContext.getBean("userDao");
        udao.say();
    }
}
