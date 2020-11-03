package com.gara.design.pattern.flyweight;

/**
 * usage in JDK
 *
 * @see Integer#valueOf(int)
 * @see Boolean#valueOf(String)
 * @see Byte#valueOf(byte)
 * @see Character#valueOf(char)
 * @see Short#valueOf(String)
 * @see Long#valueOf(String)
 *
 */
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
