package org.example.designpattern._02_structural.proxy._03_java;

import org.springframework.stereotype.Service;

@Service
public class GameService {
    public void startGame() {
        System.out.println("Game started Service");
    }
}
