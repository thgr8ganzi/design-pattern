package org.example.designpattern._03_behavioral.observer._02_after;

public class Client {
    public static void main(String[] args) {
        ChatServer chatServer = new ChatServer();
        User user1 = new User("User1");
        User user2 = new User("User2");

        chatServer.register("channel1", user1);
        chatServer.register("channel1", user2);

        chatServer.register("channel2", user2);

        chatServer.sendMessage(user1, "channel1", "Hello");
        chatServer.sendMessage(user2, "channel2", "Hi");

        chatServer.unRegister("channel2", user2);
        chatServer.sendMessage(user2, "channel2", "Hi");
    }
}
