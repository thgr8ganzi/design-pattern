package org.example.designpattern._03_behavioral.mediator._01_before;

public class Restaurant {
    private CleaningService cleaningService = new CleaningService();

    public void dinner(Guest guest) {
        System.out.println("Dinner for " + guest);
    }
    public void clean() {
        cleaningService.clean(this);
    }
}
