package com.gara.design.pattern.factorymethod;

import com.gara.design.pattern.factorymethod.bean.Fruit;
import com.gara.design.pattern.factorymethod.factory.FruitFactory;

/**
 * @description: 模板方法
 * @author:  GaraYing
 * @createTime: 2020/9/1 15:00
 * @Version: 1.0
**/
public abstract class FruitService {

    public void getFruit(){
        FruitFactory fruitFactory = getFruitFactory();
        Fruit fruit = fruitFactory.create();
        fruit.taste();
    }

    protected abstract FruitFactory getFruitFactory();
}
