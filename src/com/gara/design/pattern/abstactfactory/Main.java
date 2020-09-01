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
 *
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
