package com.gara.design.pattern.factorymethod.bean;

/**
 * @Author GARA
 * @Description Apple
 * @Date 2020/8/30 19:45
 * @Version V1.0.0
 **/
public class Apple implements Fruit {
    @Override
    public void taste() {
        System.out.println("apple tastes not so good");
    }
}
