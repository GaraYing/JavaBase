package com.gara.jvm;

/**
 * @author GARA
 * @description -Xms10m -Xmx10m -XX:+PrintGCDetails
 * 不指定默认为-Xms 1/64物理电脑内存大小 -Xmx: 1/4物理电脑内存
 * @date 2022/1/3 17:28
 */
public class InitSpecialHeapDemo {

    public static void main(String[] args) {

        long totalMemory = Runtime.getRuntime().totalMemory() / 1024 / 1024;
        long maxMemory = Runtime.getRuntime().maxMemory() / 1024 / 1024;

        System.out.println("totalMemory = " + totalMemory + "M");
        System.out.println("maxMemory = " + maxMemory + "M");


        System.out.println("machine totalMemory = " + totalMemory * 64 / 1024 + "G");
        System.out.println("machine maxMemory = " + maxMemory * 4 / 1024 + "G");

    }
}
