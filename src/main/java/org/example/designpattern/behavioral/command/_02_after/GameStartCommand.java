package org.example.designpattern.behavioral.command._02_after;

import org.example.designpattern.behavioral.command._01_before.Game;

public class GameStartCommand implements Command {
    private Game game;

    public GameStartCommand(Game game) {
        this.game = game;
    }

    @Override
    public void execute() {
        this.game.start();
    }

    @Override
    public void undo() {
        new GameEndCommand(this.game).execute();
    }
}
