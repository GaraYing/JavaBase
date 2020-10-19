package com.gara.design.pattern.decorator;

/**
 * 模式核心： Decorator implements tree
 */
public class Main {
    public static void main(String[] args) {
        Tree tree = new CommonTree();
        tree = new LeafDecorator(tree);
        tree = new LeafDecorator(tree);
        System.out.println("height: " + tree.height());
        System.out.println("desc: " + tree.desc());

        tree = new ChristmasTree();
        tree = new FlowerDecorator(tree);
        tree = new LeafDecorator(tree);
        System.out.println("height: " + tree.height());
        System.out.println("desc: " + tree.desc());
    }
}
