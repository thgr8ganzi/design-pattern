package org.example.designpattern._03_behavioral.command._01_before;

public class Light {
    private boolean isOn;

    public void on() {
        System.out.println("Light switched on.");
        this.isOn = true;
    }

    public void off() {
        System.out.println("Light switched off.");
        this.isOn = false;
    }
    public boolean isOn() {
        return isOn;
    }
}
