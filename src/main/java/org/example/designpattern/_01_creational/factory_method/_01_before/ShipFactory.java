package org.example.designpattern._01_creational.factory_method._01_before;

public class ShipFactory {
    public static Ship orderShip(String name, String email) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("Email cannot be null or empty");
        }

        prepareFor(name);

        Ship ship = new Ship();
        ship.setName(name);

        if (name.equalsIgnoreCase("UFO")) {
            ship.setColor("Green");
        } else if (name.equalsIgnoreCase("Rocket")) {
            ship.setColor("Red");
        }

        if (name.equalsIgnoreCase("UFO")) {
            ship.setLogo("UFO");
        } else if (name.equalsIgnoreCase("Rocket")) {
            ship.setLogo("Rocket");
        }

        sendEmailTo(email, ship);

        return ship;
    }
    private static void prepareFor(String name) {
        System.out.println("Preparing for " + name);
    }
    private static void sendEmailTo(String email, Ship ship) {
        System.out.println("Sending email to " + email + " for " + ship);
    }
}
