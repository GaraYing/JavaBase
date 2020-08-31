package com.gara.design.pattern.abstactfactory;

import com.gara.design.pattern.abstactfactory.monkey.MonkeyFactory;

/**
 * @description: 测试类
 * @author:  GaraYing
 * @createTime: 2020/8/31 17:32
 * @Version: 1.0
**/
public class Main {
    public static void main(String[] args) {

        AbstractFactory factory = new MonkeyFactory();
        Food food = factory.createFood();
        food.taste();

        Vehicle vehicle = factory.createVehicle();
        vehicle.durationTime();
    }
}
