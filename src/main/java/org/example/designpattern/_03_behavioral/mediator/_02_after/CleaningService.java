package org.example.designpattern._03_behavioral.mediator._02_after;

public class CleaningService {
    private FrontDesk frontDesk = new FrontDesk();

    public void getTower(Integer id, int tower) {
        String roomNumber = this.frontDesk.getRoomNumber(id, tower);
        System.out.println("Room number: " + roomNumber + " for guest id: " + id + " in tower: " + tower);
    }
}
