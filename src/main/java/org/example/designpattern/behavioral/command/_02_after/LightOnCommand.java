package org.example.designpattern.behavioral.command._02_after;

import org.example.designpattern.behavioral.command._01_before.Light;

public class LightOnCommand implements Command{
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.on();
    }

    @Override
    public void undo() {
        new LightOffCommand(this.light).execute();
    }
}
