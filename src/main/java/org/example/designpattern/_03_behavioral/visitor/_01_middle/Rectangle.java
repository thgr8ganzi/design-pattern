package org.example.designpattern._03_behavioral.visitor._01_middle;

public class Rectangle implements Shape {

    @Override
    public void printTo(Phone phone) {
        System.out.println("Rectangle printed to phone");
    }

    @Override
    public void printTo(Watch watch) {
        System.out.println("Rectangle printed to Watch");
    }
}
