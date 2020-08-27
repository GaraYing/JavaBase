package com.gara.design.pattern.singleton;

import java.lang.reflect.Constructor;

/**
 * @description: 双重检查锁机制 thread safe
 * @author: GaraYing
 * @createTime: 2020/8/27 11:19
 * @Version: 1.0
 **/
public class DoubleCheckSingleton {
    public static DoubleCheckSingleton INSTANCE;

    private DoubleCheckSingleton() {
    }

    public static DoubleCheckSingleton getInstance() {
        // 第一次判断，如果这里为空，不进入抢锁阶段，直接返回实例
        if (INSTANCE == null) {
            synchronized (DoubleCheckSingleton.class) {
                // 抢到锁之后再次判断是否为空
                if (INSTANCE == null) {
                    INSTANCE = new DoubleCheckSingleton();
                }
            }
        }
        return INSTANCE;
    }

    public static void main(String[] args) throws Exception {
        System.out.println("DoubleCheckSingleton: " + DoubleCheckSingleton.getInstance());
        System.out.println("DoubleCheckSingleton: " + DoubleCheckSingleton.getInstance());

        Constructor<DoubleCheckSingleton> constructor = DoubleCheckSingleton.class.getDeclaredConstructor();

        DoubleCheckSingleton newInstance = constructor.newInstance();
        System.out.println("newInstance: " + newInstance);
        System.out.println("DoubleCheckSingleton == newInstance: " + (newInstance == DoubleCheckSingleton.getInstance()));



    }
}
