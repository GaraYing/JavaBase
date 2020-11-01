package com.gara.design.pattern.singleton;

import java.lang.reflect.Constructor;

/**
 * @description: 单例模式--懒汉
 * 不加锁的情况下：not-thread-safe
 * 加锁的情况下：thread-safe 串行化，会出现性能问题
 * @author: GaraYing
 * @createTime: 2020/8/27 9:57
 * @Version: 1.0
 **/
public class LazyManSingleton {

    private static LazyManSingleton instance = null;

    private LazyManSingleton() {
    }

    /**
     * not thread safe
     * @return
     */
    public static LazyManSingleton getInstance() {
        if (instance == null) {
            instance = new LazyManSingleton();
        }
        return instance;
    }

    /**
     * thread safe with low performance
     * @return
     */
    public static synchronized LazyManSingleton getInstance2() {
        if (instance == null) {
            instance = new LazyManSingleton();
        }
        return instance;
    }

    public static void main(String[] args) throws Exception {

        System.out.println("hungryInstance:" + LazyManSingleton.getInstance());
        System.out.println("hungryInstance:" + LazyManSingleton.getInstance());
        System.out.println("hungryInstance:" + LazyManSingleton.getInstance2());
        // 拿到所有的构造函数，包括非public的
        Constructor<LazyManSingleton> hungrySingletonConstructor = LazyManSingleton.class.getDeclaredConstructor();
        hungrySingletonConstructor.setAccessible(true);
        // 使用空构造函数new一个实例。即使它是private的
        LazyManSingleton reflectInstance = hungrySingletonConstructor.newInstance();

        System.out.println("lazyInstance.reflectInstance:" + reflectInstance);
        System.out.println("lazyInstance == reflectInstance:" + (reflectInstance == LazyManSingleton.getInstance()));

    }
}
