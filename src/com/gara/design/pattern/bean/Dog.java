package com.gara.design.pattern.bean;

import com.gara.design.pattern.Comparable;

/**
 * @Author GARA
 * @Description Dog
 * @Date 2020/8/26 22:11
 * @Version V1.0.0
 **/
public class Dog implements Comparable<Dog> {

    private long foot;

    public Dog(long foot) {
        this.foot = foot;
    }

    @Override
    public int compareTo(Dog dog) {
        return Long.compare(this.foot, dog.foot);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "foot=" + foot +
                '}';
    }
}
