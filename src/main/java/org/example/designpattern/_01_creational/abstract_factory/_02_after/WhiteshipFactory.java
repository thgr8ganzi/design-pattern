package org.example.designpattern._01_creational.abstract_factory._02_after;


import org.example.designpattern._01_creational.factory_method._02_after.DefaultShipFactory;
import org.example.designpattern._01_creational.factory_method._02_after.Ship;
import org.example.designpattern._01_creational.factory_method._02_after.WhiteShip;

public class WhiteshipFactory extends DefaultShipFactory {

    private ShipPartsFactory shipPartsFactory;

    public WhiteshipFactory(ShipPartsFactory shipPartsFactory) {
        this.shipPartsFactory = shipPartsFactory;
    }

    @Override
    public Ship createShip() {
        Ship ship = new WhiteShip();
        ship.setAnchor(shipPartsFactory.createAnchor());
        ship.setWheel(shipPartsFactory.createWheel());
        return ship;
    }
}
