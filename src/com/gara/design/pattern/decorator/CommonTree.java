package com.gara.design.pattern.decorator;

public class CommonTree implements Tree {
    @Override
    public long height() {
        return 20L;
    }

    @Override
    public String desc() {
        return "This is a common tree";
    }
}
