package org.example.designpattern._03_behavioral.observer._02_after;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChatServer {
    private Map<String, List<Subscriber>> subscribers = new HashMap<>();

    public void register(String channel, Subscriber subscriber) {
        if (subscribers.containsKey(channel)) {
            this.subscribers.get(channel).add(subscriber);
        } else {
            List<Subscriber> list = new ArrayList<>();
            list.add(subscriber);
            this.subscribers.put(channel, list);
        }
    }

    public void unRegister(String channel, Subscriber subscriber) {
        if (subscribers.containsKey(channel)) {
            this.subscribers.get(channel).remove(subscriber);
        }
    }

    public void sendMessage(User user, String subject, String message) {
        if (this.subscribers.containsKey(subject)) {
            String userMessage = user.getName() + " sent a message : " + message;
            this.subscribers.get(subject).forEach(s -> s.handleMessage(userMessage));
        }
    }
}
