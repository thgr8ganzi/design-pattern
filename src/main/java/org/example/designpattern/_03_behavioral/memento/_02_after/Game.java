package org.example.designpattern._03_behavioral.memento._02_after;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Game {
    private int redTeamScore;
    private int blueTeamScore;

    public GameSave save() {
        return new GameSave(this.blueTeamScore, this.redTeamScore);
    }
    public void restore(GameSave gameSave)  {
        this.redTeamScore = gameSave.getRedTeamScore();
        this.blueTeamScore = gameSave.getBlueTeamScore();
    }
}
