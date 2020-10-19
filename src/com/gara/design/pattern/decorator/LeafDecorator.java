package com.gara.design.pattern.decorator;

public class LeafDecorator extends TreeDecorator {

    private final Tree tree;

    public LeafDecorator(Tree tree) {
        super();
        this.tree = tree;
    }

    @Override
    public String desc() {
        return tree.desc() + ", a tree with leaves *******";
    }

    @Override
    public long height() {
        return tree.height() + 25L;
    }
}
