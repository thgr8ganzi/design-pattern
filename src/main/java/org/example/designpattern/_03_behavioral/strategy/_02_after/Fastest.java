package org.example.designpattern._03_behavioral.strategy._02_after;

public class Fastest implements Speed {
    @Override
    public void blueLight() {
        System.out.println("Fastest Blue");
    }

    @Override
    public void redLight() {
        System.out.println("Fastest Red");
    }
}
