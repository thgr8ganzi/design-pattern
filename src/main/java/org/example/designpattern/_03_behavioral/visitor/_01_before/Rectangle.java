package org.example.designpattern._03_behavioral.visitor._01_before;

public class Rectangle implements Shape{
    @Override
    public void printTo(Device device) {
        if (device instanceof Phone) {
            System.out.println("Rectangle printed to phone");
        } else if (device instanceof Watch) {
            System.out.println("Rectangle printed to Watch");
        }
    }
}
