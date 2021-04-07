package com.gara.thread.demo;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, Object> map = new HashMap<>(4);
        map.put(1,1);
        map.put(2,1);
        map.put(1,1);
        map.put(4,1);
        map.put(5,1);
        map.put(3,1);


        map.forEach((key, value) -> System.out.println(value));
    }
}
