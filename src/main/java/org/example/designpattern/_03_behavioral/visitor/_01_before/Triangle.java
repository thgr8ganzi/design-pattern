package org.example.designpattern._03_behavioral.visitor._01_before;

public class Triangle implements Shape {
    @Override
    public void printTo(Device device) {
        if (device instanceof Phone) {
            System.out.println("Print Triangle on Phone");
        } else if (device instanceof Watch) {
            System.out.println("Print Triangle on Watch");
        }
    }
}
