package com.gara.thread.sychronize;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @Author GARA
 * @Description 一个同步方法可以调用另一个同步方法，一个线程已经获取了某个对象的锁，再次申请时仍然会得到这个对象的锁，
 * 也就是说，synchronized 获取的锁是可重入的
 * @example: happens when method in super class is called on child class
 * @Date 2020/11/28 14:28
 * @Version V1.0.0
 **/
public class SynchronizedDemoTwo {

    public synchronized void methodOne() {
        System.out.println("method one starts ……");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        methodTwo();
        System.out.println("method one ends ……");
    }

    public synchronized void methodTwo() {
        System.out.println("method two starts ……");
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("method two ends ……");
    }

    public static void main(String[] args) {
        SynchronizedDemoTwo t = new SynchronizedDemoTwo();
//
//        new Thread(t::methodOne, "methodOne").start();

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.execute(t::methodOne);
        executorService.execute(t::methodTwo);

        executorService.shutdown();
    }
}
