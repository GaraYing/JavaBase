package com.gara.design.pattern.bean;

import com.gara.design.pattern.Comparable;

/**
 * @Author GARA
 * @Description Cat
 * @Date 2020/8/26 22:11
 * @Version V1.0.0
 **/
public class Cat implements Comparable<Cat> {

    private long weight;

    private int height;

    @Override
    public int compareTo(Cat cat) {
        return Integer.compare(this.height, cat.height);
    }
}
