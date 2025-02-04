package org.example.designpattern._03_behavioral.visitor._01_middle;

public class Circle implements Shape {

    @Override
    public void printTo(Phone phone) {
        System.out.println("Circle printed to phone");
    }

    @Override
    public void printTo(Watch watch) {
        System.out.println("Circle printed to Watch");
    }
}
