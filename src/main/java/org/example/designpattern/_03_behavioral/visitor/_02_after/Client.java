package org.example.designpattern._03_behavioral.visitor._02_after;

public class Client {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle();
        Device phone = new Phone();
        rectangle.accept(phone);
    }
}
