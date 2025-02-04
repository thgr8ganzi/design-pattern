package org.example.designpattern._03_behavioral.visitor._02_after;

public class Triangle implements Shape {

    @Override
    public void accept(Device device) {
        device.print(this);
    }
}
