package org.example.designpattern._03_behavioral.memento._01_before;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class Game implements Serializable {
    private int redTeamScore;
    private int blueTeamScore;
}
