package org.example.designpattern._01_creational.factory_method._01_before;

public class Client {
    public static void main(String[] args) {

        Ship ship = ShipFactory.orderShip("UFO", "UFO-001");
        System.out.println(ship);

        Ship ship2 = ShipFactory.orderShip("Rocket", "Rocket-001");
        System.out.println(ship2);
    }
}
