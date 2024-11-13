package org.example.designpattern._03_behavioral.command._02_after;

import org.example.designpattern._03_behavioral.command._01_before.Game;
import org.example.designpattern._03_behavioral.command._01_before.Light;

import java.util.Stack;

public class Button {
    private Stack<Command> commands = new Stack<>();

    public void press(Command command) {
        command.execute();
        commands.push(command);
    }
    public void undo() {
        if (!commands.isEmpty()) {
            Command command = commands.pop();
            command.undo();
        }
    }

    public static void main(String[] args) {
        Button button = new Button();
        button.press(new LightOnCommand(new Light()));
        button.press(new GameStartCommand(new Game()));
        button.undo();
        button.undo();
    }
}
