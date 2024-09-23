package org.example.designpattern.structural.proxy._01_before;

import org.example.designpattern.structural.proxy._02_after.GameServiceProxy;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        GameService gameService = new GameService();
        gameService.startGame();
    }
}
