package com.gara.design.pattern.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author GARA
 * @Description 动态代理类
 * @Date 2020/11/8 17:20
 * @Version V1.0.0
 **/
public class MyInvocationHandler implements InvocationHandler {

    // 被代理者
    Class aClass = null;
    // 被代理的实例
    Object object = null;

    public MyInvocationHandler(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("method into MyInvocationHandler ****");
        Object result = method.invoke(this.object, args);
        if (method.getName().equalsIgnoreCase("login")){
            System.out.println("an account login in");
        }
        return result;
    }
}
