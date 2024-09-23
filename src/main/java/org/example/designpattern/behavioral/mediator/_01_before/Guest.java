package org.example.designpattern.behavioral.mediator._01_before;

public class Guest {
    private Restaurant restaurant = new Restaurant();
    private CleaningService cleaningService = new CleaningService();

    public void dinner() {
        restaurant.dinner(this);
    }
    public void getTower(int tower) {
        cleaningService.getTower(this, tower);
    }
}
