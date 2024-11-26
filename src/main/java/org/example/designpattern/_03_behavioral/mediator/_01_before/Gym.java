package org.example.designpattern._03_behavioral.mediator._01_before;

public class Gym {
    private CleaningService cleaningService;
    public void clean() {
        cleaningService.clean(this);
    }
}
