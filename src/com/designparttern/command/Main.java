package com.designparttern.command;

/**
 * Behavior Pattern: Command
 * What: A Command Pattern says that "encapsulate a request under an object as a command
 *      and pass it to invoker object. Invoker object looks for the appropriate object
 *      which can handle this command and pass the command to the corresponding object
 *      and that object execute the command"
 *      Why: it makes essy to add new command, because existing classes remain unchanged
 *      When: When you need parameterize object according to an action perform
 *            When you need to create and execute at different time
 *            When you need to support rollback, logging or transaction functionality
 */


public class Main {
    public static void main(String[] args) {
        RemoteControl control = new RemoteControl();
        Light light= new Light();
        control.setCommand(new TurnOffCommand(light));
        control.pressButton();
    }
}
