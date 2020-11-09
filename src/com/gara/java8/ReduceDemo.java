package com.gara.java8;

import java.util.Objects;
import java.util.stream.Stream;

/**
 * @description: reduce learn
 * @author:  GaraYing
 * @createTime: 2020/6/17 14:17
 * @Version: 1.0
**/
public class ReduceDemo {

    public static void main(String[] args) {
        int count = Stream.of(1, 2, 3)
                .reduce(0, (acc, element) -> acc + element);
        Integer reduce = Stream.of(1, 2, 3)
                .reduce(0, Integer::sum);
        System.out.println(count);
        System.out.println(Objects.equals(count, reduce));
    }
}
