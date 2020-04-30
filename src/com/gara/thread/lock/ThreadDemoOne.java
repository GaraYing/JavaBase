package com.gara.thread.lock;

/**
 * @Author GARA
 * @Description 线程学习demo
 * @Date 2019/12/28 16:08
 * @Version V1.0.0
 **/
public class ThreadDemoOne {

    int a = 0;
    volatile int b = 0;

    public static void main(String[] args) throws InterruptedException {
        // result = 70000
        ThreadDemoOne demoOne = getThreadDemoOne();
        System.out.println("Lock执行结束" + demoOne.a);
        // result < 70000 volatile不保证原子性
        ThreadDemoOne demoOne2 = getThreadDemoOne2();
        System.out.println("非Lock执行结束" + demoOne2.b);
    }

    private static ThreadDemoOne getThreadDemoOne() throws InterruptedException {
        ThreadDemoOne demoOne = new ThreadDemoOne();
        MyLock lock = new MyLock();

        Thread[] threads = new Thread[7];
        for (int i = 0; i < threads.length; i++) {
            int finalI = i;
            Thread thread = new Thread(() -> {
                System.out.println("Lock线程" + finalI + "开始******");
                for (int j = 0; j < 10000; j++) {
                    lock.lock();
                    try {
                        demoOne.a++;
                    } finally {
                        lock.unlock();
                    }
                }
                System.out.println("Lock线程" + finalI + "结束********");
            });
            threads[i] = thread;
            thread.start();
        }
        for (Thread thread : threads) {
            thread.join();
        }
        return demoOne;
    }

    private static ThreadDemoOne getThreadDemoOne2() throws InterruptedException {
        ThreadDemoOne demoOne = new ThreadDemoOne();
        Thread[] threads = new Thread[7];
        for (int i = 0; i < threads.length; i++) {
            int finalI = i;
            Thread thread = new Thread(() -> {
                System.out.println("非Lock线程" + finalI + "开始******");
                for (int j = 0; j < 10000; j++) {
                    demoOne.b++;
                }
                System.out.println("非Lock线程" + finalI + "结束********");
            });
            threads[i] = thread;
            thread.start();
        }
        for (Thread thread : threads) {
            thread.join();
        }
        return demoOne;
    }
}
