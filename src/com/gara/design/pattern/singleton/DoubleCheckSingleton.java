package com.gara.design.pattern.singleton;

import java.lang.reflect.Constructor;

/**
 * @description: Double Check Lock 双重检查锁机制 thread safe
 * @author: GaraYing
 * @createTime: 2020/8/27 11:19
 * @Version: 1.0
 **/
public class DoubleCheckSingleton {
    private static DoubleCheckSingleton INSTANCE;
    // 防止指令重排序/可见性，底层lock指令实现
    // volatile 修饰一块内存/一个变量
    // public static volatile DoubleCheckSingleton INSTANCE;
    private DoubleCheckSingleton() {
    }

    /**
     * 如果指令重排序，则返回了半初始化的对象
     * 指令乱序存在的条件
     *  1. as if serial
     *  2. 不影响单线程的最终一致性
     *
     * JVM针对重排序的规则：happens before原则
     *
     * @return
     */
    public static DoubleCheckSingleton getInstance() {
        // 第一次判断，如果这里不为空，不进入抢锁阶段，直接返回实例
        if (INSTANCE == null) {
            synchronized (DoubleCheckSingleton.class) {
                // 抢到锁之后再次判断是否为空
                if (INSTANCE == null) {
                    //  1. 申请空间，赋默认值
                    //  2. 调用构造方法赋初始值
                    //  3. 建立关联
                    //  CPU指令-内存屏障-保证先后执行顺序
                    INSTANCE = new DoubleCheckSingleton(); // 发生指令重排序
                }
            }
        }
        return INSTANCE;
    }

    /**
     * not threadSafe
     * @return
     */
    public static DoubleCheckSingleton getInstance2() {
        if (INSTANCE == null) {
            synchronized (DoubleCheckSingleton.class){
                INSTANCE = new DoubleCheckSingleton();
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
