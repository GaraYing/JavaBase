package com.gara.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

/**
 * @description: {@link java.util.stream.Stream} learn
 * @author:  Gara
 * @createTime: 2020/1/16 16:28
 * @Version: 1.0
**/
public class StreamDemo {

    private static List<Integer> list = Arrays.asList(7,1,2,3,4,5,6);

    private static List<Integer> list2 = Arrays.asList(1,2,5,6);

    public static void main(String[] args) {
        // print
        list.forEach(System.out::print);

        System.out.println();
        // sort
        list.stream().sorted().forEach(System.out::print);

        System.out.println();

        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::print);

//        list.stream().sorted(Comparator.naturalOrder()).forEach(System.out::print);

        System.out.println();
        //
        list.stream().filter((e) -> e > 5).forEach(System.out::print);

        System.out.println();

        String s = "hello,World";
        StringTokenizer stringTokenizer = new StringTokenizer(s);
        while (stringTokenizer.hasMoreTokens()){
            System.out.println(stringTokenizer.nextToken(","));
        }

    }
}
