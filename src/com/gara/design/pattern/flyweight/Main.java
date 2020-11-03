package com.gara.design.pattern.flyweight;

public class Main {

    public static void main(String[] args) {

        FlyWeight weight11 = FlyWeightFactory.getFlyWeight(1);
        FlyWeight weight12 = FlyWeightFactory.getFlyWeight(1);
        weight11.operation(100);
        System.out.println(weight11 == weight12);
        FlyWeight weight21 = FlyWeightFactory.getFlyWeight(2);
        weight21.operation(100);
        System.out.println(weight21 == weight12);
    }
}
