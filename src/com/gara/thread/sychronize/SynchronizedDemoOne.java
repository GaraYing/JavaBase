package com.gara.thread.sychronize;

import java.util.concurrent.TimeUnit;

/**
 * @Author GARA
 * @Description 同步代码块的语句越少越好，synchronzed 锁定的是对象，即推内存的数据
 * @Date 2020/11/28 14:28
 * @Version V1.0.0
 **/
public class SynchronizedDemoOne {

    public synchronized void methodOne(){
        System.out.println("method one starts ……");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("method one ends ……");
    }

    public void methodTwo(){
        System.out.println("method two starts ……");
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("method two ends ……");
    }

    public static void main(String[] args) {
        SynchronizedDemoOne synchronizedDemoOne = new SynchronizedDemoOne();

        new Thread(synchronizedDemoOne::methodOne,"methodOne").start();
        new Thread(synchronizedDemoOne::methodTwo,"methodTwo").start();
    }
}
