package org.example.designpattern.structural.proxy._03_java;

import org.springframework.stereotype.Service;

@Service
public class GameService {
    public void startGame() {
        System.out.println("Game started Service");
    }
}
