package com.designparttern.command;

public class TurnOnCommand implements  ICommand{
    Light light;
    public TurnOnCommand(Light light){
        this.light=light;
    }
    @Override
    public void execute() {
        this.light.turnOn();
    }
}
