package org.example.designpattern._03_behavioral.mediator._01_before;

public class Hotel {
    public static void main(String[] args) {
        Guest guest = new Guest();
        guest.getTower(3);
        guest.dinner();

        Restaurant restaurant = new Restaurant();
        restaurant.clean();
    }
}
