package org.example.designpattern._02_structural.proxy._03_java;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
    @Bean
    public ApplicationRunner applicationRunner (GameService gameService) {
        return args -> gameService.startGame();
    }
}
