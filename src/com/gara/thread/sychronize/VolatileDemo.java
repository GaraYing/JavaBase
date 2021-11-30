package com.gara.thread.sychronize;

import java.util.concurrent.TimeUnit;

/**
 * @author GARA
 * @version V1.0.0
 * @description volatile 关键字 解决共享变量可见性问题
 *  由于cpu和内存的计算速度相差巨大，引入缓存，即三级缓存
*   CPU(Register寄存器) -> L1 -> L2 -> L3
 *  缓存一致性协议：硬件级别的协议
 *
 * @date 2020/11/28 15:05
 **/
public class VolatileDemo {

    volatile boolean running = true;

    void m(){
        System.out.println("m start");
        while (running){
//            System.out.println("keep running *************");
            /*try {
                TimeUnit.MILLISECONDS.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
        }
        System.out.println("m end");

    }

    public static void main(String[] args) {
        VolatileDemo demo = new VolatileDemo();
        new Thread(demo::m,"thread1").start();
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        demo.running = false;
    }
}
