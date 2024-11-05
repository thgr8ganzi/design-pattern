package org.example.designpattern._02_structural.flyweight._01_before;

public class Client {
    public static void main(String[] args) {
        Character c1 = new Character('a', "red", "Arial", 12);
        Character c2 = new Character('b', "blue", "Arial", 12);
        Character c3 = new Character('c', "green", "Arial", 12);
        Character c4 = new Character('d', "yellow", "Arial", 12);
    }
}
