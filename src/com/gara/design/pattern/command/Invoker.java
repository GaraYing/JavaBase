package com.gara.design.pattern.command;

import sun.util.calendar.CalendarUtils;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class Invoker {
    private List<Command> commands;

    public Invoker(List<Command> commands) {
        this.commands = commands;
    }

    public void executeCommand() {
        commands.forEach(Command::execute);
    }

    public void removeCommand(Command command) {
        commands.removeIf(e->e.equals(command));
//        Iterator<Command> iterator = commands.iterator();
//        while (iterator.hasNext()) {
//            Command c = iterator.next();
//            if (c.equals(command)) {
//                iterator.remove();
//            }
//        }
        System.out.println(command + "is removed at " + Calendar.getInstance().getTime());
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 34);
//        list.removeIf(e->e.equals(34));
        List<Integer> collect = list.stream().filter(e -> !e.equals(34)).collect(Collectors.toList());
        System.out.println(collect);
    }
}
