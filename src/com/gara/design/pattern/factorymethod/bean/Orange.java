package com.gara.design.pattern.factorymethod.bean;

import com.gara.design.pattern.factorymethod.bean.Fruit;

/**
 * @Author GARA
 * @Description Orange
 * @Date 2020/8/30 12:53
 * @Version V1.0.0
 **/
public class Orange implements Fruit {
    @Override
    public void taste() {
        // do sth
        System.out.println("Orange tastes so good");
    }
}
