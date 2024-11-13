package org.example.designpattern._03_behavioral.command._01_before;

public class Game {
    private boolean isStarted;

    public void start() {
        System.out.println("Game started.");
        this.isStarted = true;
    }

    public void stop() {
        System.out.println("Game stopped.");
        this.isStarted = false;
    }

    public boolean isStarted() {
        return isStarted;
    }
}
