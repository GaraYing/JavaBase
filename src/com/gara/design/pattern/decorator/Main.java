package com.gara.design.pattern.decorator;

/**
 * 模式核心： Decorator implements tree
 * @see  java.io.BufferedInputStream(InputStream)
 * @see  java.io.DataInputStream(InputStream)
 * @see  java.io.BufferedOutputStream(OutputStream)
 * @see  java.util.zip.ZipOutputStream(OutputStream)
 * @see  java.util.Collections#checked[List|Map|Set|SortedSet|SortedMap]()
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
