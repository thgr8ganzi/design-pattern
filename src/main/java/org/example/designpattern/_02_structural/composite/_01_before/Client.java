package org.example.designpattern._02_structural.composite._01_before;

public class Client {
    public static void main(String[] args) {
        Item doranBlade = new Item("Doran's Blade", 450);
        Item healthPotion = new Item("Health Potion", 50);

        Bag bag = new Bag();
        bag.add(doranBlade);
        bag.add(healthPotion);

        Client client = new Client();
        client.printPrice(bag);
        client.printPrice(doranBlade);
    }
    private void printPrice(Item item) {
        System.out.println("Item: " + item.getName() + ", Price: " + item.getPrice());
    }
    private void printPrice(Bag bag) {
        int sum = bag.getItems().stream().mapToInt(Item::getPrice).sum();
        System.out.println("Bag Price: " + sum);
    }
}
