package com.gara.design.pattern.strategy.bean;

import com.gara.design.pattern.strategy.Comparable;

/**
 * @Author GARA
 * @Description Cat
 * @Date 2020/8/26 22:11
 * @Version V1.0.0
 **/
public class Cat implements Comparable<Cat> {

    public long weight;

    public int height;

    public Cat(long weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    @Override
    public int compareTo(Cat cat) {
        return Integer.compare(this.height, cat.height);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }
}
