package com.gara.design.pattern.command;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command command = new ConcreteCommand(receiver);
        Command command1 = new ConcreteCommand(receiver);
        Command command2 = new ConcreteCommand2(receiver);
//        List<Command> commands = Arrays.asList(command, command1, command2);
        List<Command> commands = new ArrayList<>(3);
        commands.add(command2);
        commands.add(command1);
        commands.add(command);
        Invoker invoker = new Invoker(commands);
        invoker.removeCommand(command1);
        invoker.executeCommand();
    }
}
