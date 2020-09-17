package com.ssm.Ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component(value = "useraService")
public class userServiceImpl implements userService {

    @Autowired
    private userDao ud;
    @Autowired
    private Dog dog;

    public userDao getUd() {
        return ud;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public void setUd(userDao ud) {
        this.ud = ud;
    }

    @Override
    public void play() {
        this.ud.say();
        System.out.println("userService say hello");
    }

    @Override
    public String toString() {
        return "userServiceImpl{" +
                "ud=" + ud +
                ", dog=" + dog +
                '}';
    }
}
