package com.gara.design.pattern.factorymethod.factory;

import com.gara.design.pattern.factorymethod.bean.Fruit;
import com.gara.design.pattern.factorymethod.bean.Orange;

/**
 * @Author GARA
 * @Description OrangeFactory
 * @Date 2020/8/30 23:26
 * @Version V1.0.0
 **/
public class OrangeFactory implements FruitFactory{

    @Override
    public Fruit create() {
        // do sth
        System.out.println("Apple created");
        return new Orange();
    }
}
