package org.example.designpattern._03_behavioral.strategy._02_after;

public class Faster implements Speed {
    @Override
    public void blueLight() {
        System.out.println("Faster Blue");
    }

    @Override
    public void redLight() {
        System.out.println("Faster Red");
    }
}
