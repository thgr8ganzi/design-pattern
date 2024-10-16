package org.example.designpattern._01_creational.singleton._03_java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringExample {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        String hello = context.getBean("hello", String.class);
        String hello2 = context.getBean("hello", String.class);
        System.out.println(hello == hello2);
    }
}
