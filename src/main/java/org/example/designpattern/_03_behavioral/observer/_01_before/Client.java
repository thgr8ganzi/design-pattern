package org.example.designpattern._03_behavioral.observer._01_before;

public class Client {
    public static void main(String[] args) {
        ChatServer chatServer = new ChatServer();
        User user1 = new User(chatServer);
        user1.sendMessage("Hello", "Hello, how are you?");
        user1.sendMessage("Hello2", "I am fine, thank you.2");

        User user2 = new User(chatServer);
        System.out.println(user2.getMessage("Hello"));

        User user3 = new User(chatServer);
        System.out.println(user3.getMessage("Hello"));
    }
}
