package org.example.designpattern._02_structural.proxy._01_before;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        GameService gameService = new GameService();
        gameService.startGame();
    }
}
