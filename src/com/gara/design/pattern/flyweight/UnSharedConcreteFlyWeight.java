package com.gara.design.pattern.flyweight;

public class UnSharedConcreteFlyWeight implements FlyWeight {

    @Override
    public void operation(int extrinsicState) {
        System.out.println("UnSharedConcreteFlyWeight#extrinsicState: " + extrinsicState);
    }
}
