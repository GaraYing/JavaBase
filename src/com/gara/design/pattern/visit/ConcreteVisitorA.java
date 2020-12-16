package com.gara.design.pattern.visit;

public class ConcreteVisitorA implements Visitor {
    @Override
    public void visitConcreteElementOne(ConcreteElementOne one) {
        one.operatorOne();
        System.out.println("ConcreteVisitorA: name: "+ one.getName() + " size" + one.getSize());
    }

    @Override
    public void visitConcreteElementTwo(ConcreteElementTwo two) {
        two.operatorTwo();
        System.out.println("ConcreteVisitorA: name: "+ two.getName() + " size" + two.getSize());

    }
}
