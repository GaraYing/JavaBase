package com.gara.thread.demo;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @description: {@link CyclicBarrier}
 * @author:  GaraYing
 * @createTime: 2020/7/9 14:12
 * @Version: 1.0
**/
public class CyclicBarrierDemo {

    static  CyclicBarrier c = new CyclicBarrier(2, new A());

    /**
     *
     * CyclicBarrier设置了拦截线程的数量是2，所以必须等代码中的第一个线程和线程A
     * 都执行完之后，才会继续执行主线程，然后输出2，
     * @result 3 1 2
     * @param args
     */
    public static void main(String[] args) {
        new Thread(()->{
            try {
                c.await();
            } catch (InterruptedException | BrokenBarrierException e) {
                e.printStackTrace();
            }
            System.out.println(1);
        },"thread-1").start();
        try {
            c.await();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(2);
    }

    static class A implements Runnable{
        @Override
        public void run() {
            System.out.println(3);
        }
    }
}
