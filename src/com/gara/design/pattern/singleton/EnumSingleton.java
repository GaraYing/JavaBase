package com.gara.design.pattern.singleton;

/**
 * @description: 单例模式-枚举 thread-safe
 *
 * 优点：1. 代码简单； 2. 反射安全；3. 序列化越反序列化安全.
 *
 * @author:  GaraYing
 * @createTime: 2020/8/27 10:19
 * @Version: 1.0
**/
public enum EnumSingleton implements MySingleton{
    SINGLETON{
        @Override
        public void doSomething() {
            System.out.println("complete singleton");
        }
    };
    private Resource instance;
    EnumSingleton(){
        instance = new Resource();
    }

    public static EnumSingleton getInstance(){
        return SINGLETON;
    }

    public Resource getResource(){
        return instance;
    }

    static class Resource{

    }
}
