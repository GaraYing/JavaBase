package com.gara.design.pattern.singleton;
/**
 * @description: 单例模式-枚举 thread-safe
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

    public static EnumSingleton getInstance(){
        return SINGLETON;
    }
}
