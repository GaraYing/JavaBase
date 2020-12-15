package com.gara.design.pattern.command;

import java.util.Calendar;

public class ConcreteCommand2 extends Command{
    public ConcreteCommand2(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        System.out.println("ConcreteCommand2#executeCommand Time is " + Calendar.getInstance().getTime());
        receiver.action();
    }
}
