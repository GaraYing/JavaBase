package com.gara.design.pattern.factorymethod.factory;

import com.gara.design.pattern.factorymethod.bean.Apple;
import com.gara.design.pattern.factorymethod.bean.Fruit;

/**
 * @Author GARA
 * @Description AppleFactory
 * @Date 2020/8/30 23:10
 * @Version V1.0.0
 **/
public class AppleFactory implements FruitFactory {

    @Override
    public Fruit create() {
        // do sth
        System.out.println("Apple created");
        return new Apple();
    }
}
