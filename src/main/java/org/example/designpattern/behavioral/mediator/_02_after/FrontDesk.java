package org.example.designpattern.behavioral.mediator._02_after;

import java.time.LocalDateTime;

public class FrontDesk {
    private CleaningService cleaningService = new CleaningService();
    private Restaurant restaurant = new Restaurant();

    public void getTower(Guest guest, int tower) {
        cleaningService.getTower(guest.getId(), tower);
    }

    public String getRoomNumber(Integer id, int tower) {
        return "1001";
    }

    public void dinner(Guest guest, LocalDateTime time) {
        restaurant.dinner(guest.getId(), time);
    }
}
