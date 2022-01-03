package com.gara.jvm;

/**
 * @author GARA
 * @description -Xms10m -Xmx10m -XX +printGCDetails
 * @date 2022/1/3 17:28
 */
public class HeapDemo {

    public static void main(String[] args) {
        System.out.println("start ...");
        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end ...");
    }
}
