package com.gara.design.pattern.command;

public class Client {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command command = new ConcreteCommand(receiver);
        Command command2 = new ConcreteCommand2(receiver);
        Invoker invoker = new Invoker(command);
        invoker.executeCommand();
        invoker = new Invoker(command2);
        invoker.executeCommand();
    }
}
