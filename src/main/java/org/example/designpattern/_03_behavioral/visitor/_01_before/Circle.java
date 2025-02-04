package org.example.designpattern._03_behavioral.visitor._01_before;

public class Circle implements Shape{
    @Override
    public void printTo(Device device) {
        if (device instanceof Phone) {
            System.out.println("Circle printed to phone");
        } else if (device instanceof Watch) {
            System.out.println("Circle printed to Watch");
        }
    }
}
