package org.example.designpattern._03_behavioral.strategy._03_java;

import org.springframework.context.ApplicationContext;
import org.springframework.beans.factory.xml.BeanDefinitionParser;
import org.springframework.cache.CacheManager;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.transaction.PlatformTransactionManager;

public class StrategyInSpring {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext();
        ApplicationContext context2 = new FileSystemXmlApplicationContext();
        ApplicationContext context3 = new AnnotationConfigApplicationContext();

        BeanDefinitionParser parser;

        PlatformTransactionManager transactionManager;

        CacheManager cacheManager;
    }
}
