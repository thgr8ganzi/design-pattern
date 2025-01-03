package org.example.designpattern._03_behavioral.memento._02_after;

import lombok.Getter;

@Getter
public final class GameSave {
    private final int blueTeamScore;
    private final int redTeamScore;

    public GameSave(int blueTeamScore, int redTeamScore) {
        this.blueTeamScore = blueTeamScore;
        this.redTeamScore = redTeamScore;
    }
}
