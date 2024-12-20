package org.example.designpattern._02_structural.proxy._01_before;

public class GameServiceProxy extends GameService {
    @Override
    public void startGame() {
        long before = System.currentTimeMillis();
        super.startGame();
        System.out.println(System.currentTimeMillis() - before + "ms");
    }
}
