package com.gara.design.pattern.singleton;

import java.lang.reflect.Constructor;

/**
 * @description: 单例模式--饿汉 classloader thead-safe
 * 缺点：不能实现懒加载，内存浪费
 * @author:  GaraYing
 * @createTime: 2020/8/27 9:57
 * @Version: 1.0
**/
public class HungryManSingleton {

    public static final HungryManSingleton instance = new HungryManSingleton();

    private HungryManSingleton(){}

    public static HungryManSingleton getInstance(){
        return instance;
    }

    public static void main(String[] args) throws Exception {
        System.out.println("lazyInstance:" + HungryManSingleton.getInstance());
        System.out.println("lazyInstance:" + HungryManSingleton.getInstance());
        System.out.println("lazyInstance:" + HungryManSingleton.getInstance());
        // 拿到所有的构造函数，包括非public的
        Constructor<HungryManSingleton> lazySingletonConstructor = HungryManSingleton.class.getDeclaredConstructor();
        lazySingletonConstructor.setAccessible(true);
        // 使用空构造函数new一个实例。即使它是private的
        HungryManSingleton reflectInstance = lazySingletonConstructor.newInstance();

        System.out.println("lazyInstance.reflectInstance:" + reflectInstance);
        System.out.println("lazyInstance == reflectInstance:" + (reflectInstance == HungryManSingleton.getInstance()));

    }
}
