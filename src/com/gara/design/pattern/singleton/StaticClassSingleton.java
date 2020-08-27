package com.gara.design.pattern.singleton;

import java.lang.reflect.Constructor;

/**
 * @description: 单例模式-静态内部类 thread-safe
 * @author:  GaraYing
 * @createTime: 2020/8/27 11:02
 * @Version: 1.0
**/
public class StaticClassSingleton {

    private StaticClassSingleton(){}

    private static class SingletonHolder{
        public static final StaticClassSingleton INSTANCE = new StaticClassSingleton();
    }

    public static StaticClassSingleton getInstance(){
        return SingletonHolder.INSTANCE;
    }

    public static void main(String[] args) throws Exception {
        System.out.println("StaticClassSingleton:" + StaticClassSingleton.getInstance());
        System.out.println("StaticClassSingleton:" + StaticClassSingleton.getInstance());
        System.out.println("StaticClassSingleton:" + StaticClassSingleton.getInstance());
        // 拿到所有的构造函数，包括非public的
        Constructor<StaticClassSingleton> constructor = StaticClassSingleton.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        // 使用空构造函数new一个实例。即使它是private的
        StaticClassSingleton reflectInstance = constructor.newInstance();

        System.out.println("StaticClassSingleton.reflectInstance:" + reflectInstance);
        System.out.println("StaticClassSingleton == reflectInstance:" + (reflectInstance == StaticClassSingleton.getInstance()));
    }
}
