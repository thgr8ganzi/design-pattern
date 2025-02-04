package org.example.designpattern._03_behavioral.visitor._01_middle;

public class Client {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle();
        Phone phone = new Phone();
        rectangle.printTo(phone);
    }
}
