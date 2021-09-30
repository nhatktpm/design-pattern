package com.designparttern.command;

public class TurnOffCommand implements ICommand {
    Light light;

    public TurnOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.turnOff();
    }
}
