package org.example.designpattern.structural.proxy._02_after;

public class DefaultGameService implements GameService {

    @Override
    public void startGame() {
        System.out.println("Game started");
    }
}
