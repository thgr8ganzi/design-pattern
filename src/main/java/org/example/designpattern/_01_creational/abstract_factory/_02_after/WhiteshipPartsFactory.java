package org.example.designpattern._01_creational.abstract_factory._02_after;


import org.example.designpattern._01_creational.abstract_factory._01_before.WhiteAnchor;
import org.example.designpattern._01_creational.abstract_factory._01_before.WhiteWheel;

public class WhiteshipPartsFactory implements ShipPartsFactory {

    @Override
    public Anchor createAnchor() {
        return new WhiteAnchor();
    }

    @Override
    public Wheel createWheel() {
        return new WhiteWheel();
    }
}
