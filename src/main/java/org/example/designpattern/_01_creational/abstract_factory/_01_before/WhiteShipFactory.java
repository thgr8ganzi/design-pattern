package org.example.designpattern._01_creational.abstract_factory._01_before;


import org.example.designpattern._01_creational.factory_method._02_after.DefaultShipFactory;
import org.example.designpattern._01_creational.factory_method._02_after.Ship;
import org.example.designpattern._01_creational.factory_method._02_after.WhiteShip;

public class WhiteShipFactory extends DefaultShipFactory {

    @Override
    public Ship createShip() {
        Ship ship = new WhiteShip();
        ship.setAnchor(new WhiteAnchor());
        ship.setWheel(new WhiteWheel());
        return ship;
    }
}
