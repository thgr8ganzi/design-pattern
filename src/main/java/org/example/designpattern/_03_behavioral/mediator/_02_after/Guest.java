package org.example.designpattern._03_behavioral.mediator._02_after;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Guest {
    private Integer id;

    private FrontDesk frontDesk;

    public void getTowers(int tower) {
        this.frontDesk.getTower(this, tower);
    }

    private void dinner(LocalDateTime time) {
        this.frontDesk.dinner(this, time);
    }
}
