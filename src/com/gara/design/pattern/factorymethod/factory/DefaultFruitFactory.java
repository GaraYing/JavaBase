package com.gara.design.pattern.factorymethod.factory;

import com.gara.design.pattern.factorymethod.bean.Apple;
import com.gara.design.pattern.factorymethod.bean.Fruit;

public class DefaultFruitFactory implements FruitFactory {
    @Override
    public Fruit create() {
        return new Apple();
    }
}
