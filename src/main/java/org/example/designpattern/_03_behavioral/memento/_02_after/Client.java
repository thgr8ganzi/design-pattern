package org.example.designpattern._03_behavioral.memento._02_after;

public class Client {
    public static void main(String[] args) {
        Game game = new Game();
        game.setRedTeamScore(10);
        game.setBlueTeamScore(20);

        GameSave save = game.save();
        game.setBlueTeamScore(30);
        game.setRedTeamScore(40);

        game.restore(save);
        System.out.println("Restored game: " + game.getRedTeamScore() + " - " + game.getBlueTeamScore());
    }
}
