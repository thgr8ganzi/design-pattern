package org.example.designpattern._02_structural.proxy._02_after;

public class DefaultGameService implements GameService {

    @Override
    public void startGame() {
        System.out.println("Game started");
    }
}
