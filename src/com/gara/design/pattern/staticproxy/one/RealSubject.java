package com.gara.design.pattern.staticproxy.one;

/**
 * @Author GARA
 * @Description
 * @Date 2020/11/8 16:16
 * @Version V1.0.0
 **/
public class RealSubject implements Subject {

    private String name;

    public RealSubject(String name) {
        this.name = name;
    }

    @Override
    public void request() {
        System.out.println(" a request named "+ this.name + " from realSubject executed");
    }
}
