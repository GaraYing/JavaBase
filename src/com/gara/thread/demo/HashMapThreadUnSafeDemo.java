package com.gara.thread.demo;

import java.util.HashMap;
import java.util.UUID;

public class HashMapThreadUnSafeDemo {
    public static void main(String[] args) throws InterruptedException {
        final HashMap<String, Object> hashMap = new HashMap<>(2);
        Thread t = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                new Thread(() -> hashMap.put(UUID.randomUUID().toString(), ""), "c" + i).start();
            }
        }, "fts");
        t.start();
        t.join();
        hashMap.forEach((s, o) -> System.out.println(s));
    }
}
