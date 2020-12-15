package com.gara.design.pattern.command;

import java.util.Calendar;

public class ConcreteCommand extends Command{
    public ConcreteCommand(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        System.out.println("ConcreteCommand#executeCommand Time is " + Calendar.getInstance().getTime());
        receiver.action();
    }
}
