package org.example.designpattern._02_structural.proxy._02_after;

public class GameServiceProxy implements GameService {
    private GameService gameService;

    @Override
    public void startGame() {
        long before = System.currentTimeMillis();
        if (this.gameService == null) {
            this.gameService = new DefaultGameService();
        }
        gameService.startGame();
        System.out.println(System.currentTimeMillis() - before + "ms");
    }
}
