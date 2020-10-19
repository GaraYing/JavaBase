package com.gara.design.pattern.decorator;

public abstract class TreeDecorator implements Tree {

    @Override
    public long height() {
        return 5L;
    }

    @Override
    public String desc() {
        return "A tree cannot live without a root ++++";
    }
}
