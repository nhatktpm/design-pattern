package com.designparttern.command;

public class Light {
    private boolean status;

    public void turnOn() {
        this.status = true;
        System.out.println(status);
    }

    public void turnOff() {
        this.status = false;
        System.out.println(status);
    }
}
