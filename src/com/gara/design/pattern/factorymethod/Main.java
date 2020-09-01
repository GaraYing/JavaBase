package com.gara.design.pattern.factorymethod;

import com.gara.design.pattern.factorymethod.service.AppleService;
import com.gara.design.pattern.factorymethod.service.OrangeService;

/**
 * @Author GARA
 *
 * @see java.util.Calendar#getInstance()
 * @see java.util.ResourceBundle#getBundle(String)
 * @see java.text.NumberFormat#getInstance()
 * @see java.nio.charset.Charset#forName(String)
 * @see java.net.URLStreamHandlerFactory#createURLStreamHandler(String) (Returns singleton o bject per
 * protocol)
 *
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
