package org.example.designpattern._03_behavioral.visitor._01_before;

public class Client {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle();
        Device phone = new Phone();
        rectangle.printTo(phone);
    }
}
