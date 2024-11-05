package org.example.designpattern._02_structural.flyweight._02_after;

public class Client {
    public static void main(String[] args) {
        FontFactory fontFactory = new FontFactory();
        Character c1 = new Character('h', "red", fontFactory.getFont("Arial:12"));
        Character c2 = new Character('e', "blue", fontFactory.getFont("Arial:12"));
        Character c3 = new Character('l', "green", fontFactory.getFont("Arial:12"));
        Character c4 = new Character('o', "yellow", fontFactory.getFont("Arial:12"));
        Character c5 = new Character('w', "red", fontFactory.getFont("Arial:12"));
    }
}
