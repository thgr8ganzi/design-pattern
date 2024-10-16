package org.example.designpattern._01_creational.singleton._03_java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public String hello() {
        return "Hello";
    }
}
