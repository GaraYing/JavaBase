package com.gara.thread.pool;

/**
 * @Author GARA
 * @Description 线程任务
 * @Date 2020/8/30 18:18
 * @Version V1.0.0
 **/
public class MyTask implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread runs >>>>>" + this.hashCode());
    }
}
