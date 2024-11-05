package org.example.designpattern._02_structural.flyweight._03_java;

public class FlyWeightInJava {
    public static void main(String[] args) {
        Integer i1 = Integer.valueOf(56);
        Integer i2 = Integer.valueOf(56);
        System.out.println(i1 == i2); // true
        System.out.println(i1.equals(i2)); // true
    }
}
