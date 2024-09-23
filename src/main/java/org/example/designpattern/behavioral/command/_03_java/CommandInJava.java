package org.example.designpattern.behavioral.command._03_java;

import org.example.designpattern.behavioral.command._01_before.Game;
import org.example.designpattern.behavioral.command._01_before.Light;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CommandInJava {
    public static void main(String[] args) {
        Light light = new Light();
        Game game = new Game();
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        executorService.execute(light::on);
        executorService.execute(game::start);
        executorService.execute(game::stop);
        executorService.execute(light::off);
        executorService.shutdown();
    }
}
