package com.gara.design.pattern.factorymethod;

import com.gara.design.pattern.factorymethod.factory.FruitFactory;
import com.gara.design.pattern.factorymethod.service.AppleService;
import com.gara.design.pattern.factorymethod.service.OrangeService;

/**
 * @Author GARA
 * @Description 测试类
 * @Date 2020/8/30 19:57
 * @Version V1.0.0
 **/
public class Main {
    public static void main(String[] args) {
//        FruitFactory fruitFactory = new AppleFactory();

        FruitService fruitService = new AppleService();
        fruitService.getFruit();

//        FruitFactory fruitFactory = fruitService.getFruitFactory();
//        Fruit apple = fruitFactory.create();
//        apple.taste();

        fruitService = new OrangeService();
        fruitService.getFruit();
    }
}
