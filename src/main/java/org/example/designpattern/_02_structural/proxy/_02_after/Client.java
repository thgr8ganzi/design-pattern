package org.example.designpattern._02_structural.proxy._02_after;

public class Client {
    public static void main(String[] args) {
        GameService gameService = new GameServiceProxy();
        gameService.startGame();
    }
}
