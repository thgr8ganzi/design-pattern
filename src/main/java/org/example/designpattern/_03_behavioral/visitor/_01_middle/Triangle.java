package org.example.designpattern._03_behavioral.visitor._01_middle;

public class Triangle implements Shape {

    @Override
    public void printTo(Phone phone) {
        System.out.println("Print Triangle on Phone");
    }

    @Override
    public void printTo(Watch watch) {
        System.out.println("Print Triangle on Watch");
    }
}
