package org.example.designpattern._03_behavioral.strategy._02_after;

public class Client {
    public static void main(String[] args) {
        BlueLightRedLight blueLightRedLight = new BlueLightRedLight(new Normal());
        blueLightRedLight.blueLight();
        blueLightRedLight.redLight();

        blueLightRedLight = new BlueLightRedLight(new Faster());
        blueLightRedLight.blueLight();
        blueLightRedLight.redLight();

        blueLightRedLight = new BlueLightRedLight(new Speed() {
            @Override
            public void blueLight() {
                System.out.println("custom Blue");
            }

            @Override
            public void redLight() {
                System.out.println("custom Red");
            }
        });
        blueLightRedLight.blueLight();
        blueLightRedLight.redLight();
    }
}
