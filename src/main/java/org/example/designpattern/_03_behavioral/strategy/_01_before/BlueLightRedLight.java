package org.example.designpattern._03_behavioral.strategy._01_before;

public class BlueLightRedLight {
    private int speed;

    public BlueLightRedLight(int speed) {
        this.speed = speed;
    }

    public void blueLight() {
        if (speed == 1) {
            System.out.println("B                  l                 u              e");
        } else if (speed == 2) {
            System.out.println("B      l     u    e");
        } else if (speed == 3) {
            System.out.println("Blue");
        }
    }
    public void redLight() {
        if (speed == 1) {
            System.out.println("R                    e                   d");
        } else if (speed == 2) {
            System.out.println("R    e    d");
        } else if (speed == 3) {
            System.out.println("Red");
        }
    }
}
