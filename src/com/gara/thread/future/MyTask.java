package com.gara.thread.future;

public class MyTask implements Runnable {
    @Override
    public void run() {
        System.out.println(System.currentTimeMillis() + ":" + Thread.currentThread().getName());
    }
}
