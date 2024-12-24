package org.example.designpattern._03_behavioral.strategy._02_after;

public class Normal implements Speed {
    @Override
    public void blueLight() {
        System.out.println("Blue");
    }

    @Override
    public void redLight() {
        System.out.println("Red");
    }
}
