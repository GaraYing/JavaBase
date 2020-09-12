package com.gara.design.pattern.abstactfactory;

import com.gara.design.pattern.abstactfactory.monkey.MonkeyFactory;

import java.sql.Connection;
import java.text.NumberFormat;

/**
 * @description: 测试类
 * @see java.util.Calendar#getInstance()
 * @see java.util.Arrays#asList(Object[])
 * @see java.util.ResourceBundle#getBundle(String)
 * @see java.sql.DriverManager#getConnection(String)
 * @see Connection#createStatement()
 * @see java.sql.Statement#executeQuery(String)
 * @see NumberFormat#getInstance()
 * @see javax.xml.transform.TransformerFactory#newInstance()
 * @apiNote 当抽象工厂模式中每一个具体工厂类只创建一个产品对象，也就是只存在一个产品等级结构时，抽象工厂模式退化成工厂方法模式；
 *          当工厂方法模式中抽象工厂与具体工厂合并，提供一个统一的工厂来创建产品对象，并将创建对象的工厂方法设计为静态方法时，工厂方法模式退化成简单工厂模式
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
