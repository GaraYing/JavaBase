package com.gara.design.pattern.flyweight;

public class ConcreteFlyWeight implements FlyWeight {

    @Override
    public void operation(int extrinsicState) {
        System.out.println("ConcreteFlyWeight#extrinsicState: " + extrinsicState);
    }
}
