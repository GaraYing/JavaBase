package com.gara.design.pattern.decorator;

public class ChristmasTree implements Tree {
    @Override
    public long height() {
        return 10L;
    }

    @Override
    public String desc() {
        return "This is a christmas tree";
    }
}
