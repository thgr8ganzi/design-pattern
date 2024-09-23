package org.example.designpattern.behavioral.mediator._02_after;

import java.time.LocalDateTime;

public class Restaurant {

    public void dinner(Integer id, LocalDateTime time) {
        System.out.println("Dinner for guest id: " + id + " at time: " + time);
    }
}
