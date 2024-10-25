package org.example.designpattern._01_creational.factory_method._03_java;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringBeanFactoryExample {
    public static void main(String[] args) {
        BeanFactory xmlFactory = new ClassPathXmlApplicationContext("beans.xml");
        String hello = xmlFactory.getBean("hello", String.class);
        System.out.println(hello);

        BeanFactory annotationFactory = new ClassPathXmlApplicationContext("annotation-beans.xml");
        String helloAnnotation = annotationFactory.getBean("helloAnnotation", String.class);
        System.out.println(helloAnnotation);
    }
}
