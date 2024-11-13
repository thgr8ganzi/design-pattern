package org.example.designpattern._03_behavioral.command._02_after;

import org.example.designpattern._03_behavioral.command._01_before.Game;

public class MyApp {
    private Command command;

    public MyApp(Command command) {
        this.command = command;
    }
    public void press() {
        command.execute();
    }

    public static void main(String[] args) {
        MyApp myApp = new MyApp(new GameStartCommand(new Game()));
        myApp.press();
        myApp.press();
        myApp.press();
    }
}
