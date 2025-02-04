package org.example.designpattern._03_behavioral.visitor._02_after;

public class Phone implements Device {
    @Override
    public void print(Circle circle) {
        System.out.println("print circle on phone");
    }

    @Override
    public void print(Rectangle rectangle) {
        System.out.println("print rectangle on phone");
    }

    @Override
    public void print(Triangle triangle) {
        System.out.println("print triangle on phone");
    }

}
