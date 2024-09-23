package org.example.designpattern.behavioral.command._02_after;

import org.example.designpattern.behavioral.command._01_before.Game;

public class GameEndCommand implements Command {
    private Game game;

    public GameEndCommand(Game game) {
        this.game = game;
    }

    @Override
    public void execute() {
        this.game.stop();
    }

    @Override
    public void undo() {
        new GameStartCommand(this.game).execute();
    }
}
