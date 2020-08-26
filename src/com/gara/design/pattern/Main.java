package com.gara.design.pattern;

import com.gara.design.pattern.bean.Cat;
import com.gara.design.pattern.strategy.CatWeightStrategy;

import java.util.Arrays;

/**
 * @Author GARA
 * @Description 主测试类
 * @Date 2020/8/26 22:29
 * @Version V1.0.0
 **/
public class Main {

    public static void main(String[] args) {
//        int[] a = {1, 3, 43, 34};

//        Dog[] a = {new Dog(1L), new Dog(3L), new Dog(2L)};

        Cat[] a = {new Cat(1L, 3), new Cat(3L, 2), new Cat(2L, 3)};
        Sorter sorter = new Sorter();
//        sorter.sort(a, new CatWeightStrategy());
        // lambda expression
        sorter.sort(a, (Comparator<Cat>) (o1, o2) -> Long.compare(o1.weight, o2.weight));
        System.out.println(Arrays.toString(a));
    }
}
