package com.ssm.Ioc;

import org.springframework.stereotype.Component;

//@Component
public class userDaoImpl implements userDao {
    private String name="小白";
    private int age = 19;
    private String direction = "北方";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    @Override
    public void say() {
        System.out.println("userDao say hello");
    }

    @Override
    public String toString() {
        return "userDaoImpl{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", direction='" + direction + '\'' +
                '}';
    }
}
