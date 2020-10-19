package com.gara.design.pattern.decorator;

public class FlowerDecorator extends TreeDecorator {

    private final Tree tree;

    public FlowerDecorator(Tree tree) {
        this.tree = tree;
    }

    @Override
    public String desc() {
        return tree.desc() + ", a tree with flowers *******";
    }

    @Override
    public long height() {
        return tree.height() + 30L;
    }
}
