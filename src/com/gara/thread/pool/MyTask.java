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
        System.out.println("Thread starts >>>>>" + this.hashCode());
    }
}
