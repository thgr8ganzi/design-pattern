package org.example.designpattern.structural.proxy._02_after;

import org.example.designpattern.structural.proxy._02_after.GameService;

public class Client {
    public static void main(String[] args) {
        GameService gameService = new GameServiceProxy();
        gameService.startGame();
    }
}
