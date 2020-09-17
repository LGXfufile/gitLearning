package main.main.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.awt.print.Book;

public class Main {

    public static void main(String[] args) {
//        创建一个spring的IOC容器对象；
        ApplicationContext applicationContext = new
                ClassPathXmlApplicationContext("spring-config.xml");
//        从IOC容器中获取bean实例
        Book book = applicationContext.getBean("book", Book.class);


        System.out.println("\n");

        Author author = applicationContext.getBean("author", Author.class);
        author.printAthorInfo();

    }
}
