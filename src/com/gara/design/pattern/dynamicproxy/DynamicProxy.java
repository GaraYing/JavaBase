package com.gara.design.pattern.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @Author GARA
 * @Description
 * @Date 2020/11/8 17:36
 * @Version V1.0.0
 **/
public class DynamicProxy<T> {

    public static <T> T getProxyInstance(ClassLoader classLoader, Class<?>[] interfaces, InvocationHandler h) {
        // 寻找Joi n Po 辽比连接点， AOP框架使用元数择定义
        if (true) {
            // 执行一个前置通知
            new BeforeAdvice().exec();
        }
        // 执行目标， 并返回结果
        return (T) Proxy.newProxyInstance(classLoader, interfaces, h);
    }
}
