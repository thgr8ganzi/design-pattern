package org.example.designpattern._03_behavioral.visitor._02_after;

public class Watch implements Device {
    @Override
    public void print(Circle circle) {
        System.out.println("print circle on watch");
    }

    @Override
    public void print(Rectangle rectangle) {
        System.out.println("print rectangle on watch");
    }

    @Override
    public void print(Triangle triangle) {
        System.out.println("print triangle on watch");
    }
}
