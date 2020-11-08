package com.gara.design.pattern.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @Author GARA
 * @Description
 * @Date 2020/11/8 17:25
 * @Version V1.0.0
 **/
public class Main {
    public static void main(String[] args) {
        // define a subject
        Subject subject = new RealSubject();

        System.getProperties().put("jdk.proxy.ProxyGenerator.saveGeneratedFiles", true);
        // define an InvocationHandler
        InvocationHandler invocationHandler = new MyInvocationHandler(subject);
        ClassLoader classLoader = subject.getClass().getClassLoader();
        Subject proxyInstance = (Subject)Proxy.newProxyInstance(classLoader, new Class[]{Subject.class}, invocationHandler);
        proxyInstance.request();

        // construct a proxyInstance
//        Subject proxySubject = DynamicProxy.getProxyInstance(classLoader, Subject.class.getInterfaces(), invocationHandler);
//        proxySubject.request();

    }
}
