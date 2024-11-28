package org.example.designpattern._03_behavioral.memento._01_before;

public class Client {
    public static void main(String[] args) {
        Game game = new Game();
        game.setRedTeamScore(10);
        game.setBlueTeamScore(20);

        int blueTeamScore = game.getBlueTeamScore();
        int redTeamScore = game.getRedTeamScore();

        Game restoredGame = new Game();
        restoredGame.setRedTeamScore(redTeamScore);
        restoredGame.setBlueTeamScore(blueTeamScore);
    }
}
