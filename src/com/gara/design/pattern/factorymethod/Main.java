package com.gara.design.pattern.factorymethod;

import com.gara.design.pattern.factorymethod.bean.Fruit;
import com.gara.design.pattern.factorymethod.factory.AppleFactory;
import com.gara.design.pattern.factorymethod.factory.FruitFactory;

/**
 * @Author GARA
 * @Description 测试类
 * @Date 2020/8/30 19:57
 * @Version V1.0.0
 **/
public class Main {
    public static void main(String[] args) {
        FruitFactory fruitFactory = new AppleFactory();
        Fruit apple = fruitFactory.create();
        apple.taste();
    }
}
