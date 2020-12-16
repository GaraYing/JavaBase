package com.gara.design.pattern.visit;

public class ConcreteElementTwo implements Element{

    private int size;
    private String name;

    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    public ConcreteElementTwo(int size, String name) {
        this.size = size;
        this.name = name;
    }

    @Override
    public void acceptVisitor(Visitor visitor) {
        visitor.visitConcreteElementTwo(this);
    }
    public void operatorTwo(){
        System.out.println("ConcreteElementTwo#operatorTwo");
    }
}
