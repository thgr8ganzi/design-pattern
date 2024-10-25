package org.example.designpattern._01_creational.factory_method._02_after;

public class Client {
    public static void main(String[] args) {
//        Ship blackShip = new BlackShipFactory().orderShip("Black Ship", "mail@mail.com");
//        System.out.println(blackShip);
//
//        Ship whiteShip = new WhiteShipFactory().orderShip("White Ship", "mail2@mail");
//        System.out.println(whiteShip);

        Client client = new Client();
        client.print(new WhiteShipFactory(), "White Ship", "mail");

    }

    private void print(ShipFactory shipFactory, String name, String mail) {
        System.out.println(shipFactory.orderShip(name, mail));
    }
}
