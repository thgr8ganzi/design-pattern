package org.example.designpattern.behavioral.mediator._01_before;

public class CleaningService {
    public void clean(Gym gym) {
        System.out.println("Cleaning " + gym);
    }
    public void getTower(Guest guest, int tower) {
        System.out.println("Getting tower " + tower + " for " + guest);
    }
    public void clean(Restaurant restaurant) {
        System.out.println("Cleaning " + restaurant);
    }
}
