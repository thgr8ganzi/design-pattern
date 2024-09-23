package org.example.designpattern.behavioral.mediator._01_before;

public class Gym {
    private CleaningService cleaningService;
    public void clean() {
        cleaningService.clean(this);
    }
}
