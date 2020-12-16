package com.gara.design.pattern.visit;

public class Main {
    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();
        Element element1 = new ConcreteElementOne(1,"one");
        Element element2 = new ConcreteElementTwo(2, "two");

        Visitor visitorA =  new ConcreteVisitorA();
        Visitor visitorB =  new ConcreteVisitorB();

        objectStructure.addElement(element1).addElement(element2);

        objectStructure.accept(visitorA);
        objectStructure.accept(visitorB);
    }
}
