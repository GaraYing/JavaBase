package com.gara.thread.demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicTest {

    public static void main(String[] args)throws Exception {
        methodOne();
        methodTwo();
    }

    public static void  methodOne() throws Exception{
        long start = System.currentTimeMillis();
        AtomicInteger atomicInteger = new AtomicInteger();
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        executorService.execute(() -> {
            atomicInteger.incrementAndGet();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        System.out.println(atomicInteger.get());
        System.out.println("methodOne.cost: " + (System.currentTimeMillis() - start));
//        executorService.shutdown();
    }

    public static void  methodTwo() throws Exception{
        long start = System.currentTimeMillis();
        AtomicInteger atomicInteger = new AtomicInteger();
        for (int i = 0; i < 5; i++) {
            atomicInteger.incrementAndGet();
            Thread.sleep(1000);
        }
        System.out.println(atomicInteger.get());
        System.out.println("methodTwo.cost: " + (System.currentTimeMillis() - start));
    }
}
