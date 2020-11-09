package com.gara.design.pattern.proxy.dynamicproxy;

/**
 * @Author GARA
 * @Description
 * @Date 2020/11/8 17:21
 * @Version V1.0.0
 **/
public class RealSubject implements Subject{
    @Override
    public void request() {
        System.out.println("a real quest");
    }
}
