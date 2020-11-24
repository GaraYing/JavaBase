package com.gara.thread.demo;

import java.util.concurrent.CountDownLatch;

/**``
 * @Author GARA
 * @Description
 * @see java.util.concurrent.CountDownLatch
 * @Date 2020/11/20 23:09
 * @Version V1.0.0
 **/
public class CountDownLatchDemo {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        CountDownLatch countDownLatch = new CountDownLatch(10);
        for (int i = 0; i < 10; i++) {
           new Thread(() -> {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
               countDownLatch.countDown();
            }).start();
        }

        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("cost time : " + (System.currentTimeMillis() - start)/1000 + "s");
    }
}
