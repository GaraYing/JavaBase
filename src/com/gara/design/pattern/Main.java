package com.gara.design.pattern;

import com.gara.design.pattern.bean.Dog;

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

        Dog[] a = {new Dog(1L), new Dog(3L), new Dog(2L)};
        Sorter sorter = new Sorter();
        sorter.sort(a);

        System.out.println(Arrays.toString(a));
    }
}
