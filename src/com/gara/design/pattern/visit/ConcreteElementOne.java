package com.gara.design.pattern.visit;

public class ConcreteElementOne implements Element{

    private int size;
    private String name;

    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    public ConcreteElementOne(int size, String name) {
        this.size = size;
        this.name = name;
    }

    @Override
    public void acceptVisitor(Visitor visitor) {
        visitor.visitConcreteElementOne(this);
    }

    public void operatorOne(){
        System.out.println("ConcreteElementOne#operatorOne");
    }
}
