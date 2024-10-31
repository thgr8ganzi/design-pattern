package org.example.designpattern._02_structural.composite._02_after;

public class Client {
    public static void main(String[] args) {
        Item pen = new Item("Pen", 10);
        Item pencil = new Item("Pencil", 5);

        Bag bag = new Bag();
        bag.add(pen);
        bag.add(pencil);

        Client client = new Client();
        client.printPrice(bag);
        client.printPrice(pen);
    }
    private void printPrice (Component component) {
        System.out.println("Price: " + component.getPrice());
    }
}
