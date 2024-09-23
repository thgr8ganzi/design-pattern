package org.example.designpattern.behavioral.command._02_after;

import org.example.designpattern.behavioral.command._01_before.Light;

public class LightOffCommand implements Command{
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.off();
    }

    @Override
    public void undo() {
        new LightOnCommand(this.light).execute();
    }
}
