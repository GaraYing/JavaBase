package com.gara.design.pattern.abstactfactory;

import com.gara.design.pattern.abstactfactory.human.Aircraft;
import com.gara.design.pattern.abstactfactory.human.Rice;
import com.gara.design.pattern.abstactfactory.monkey.Banana;
import com.gara.design.pattern.abstactfactory.monkey.Bicycle;

/**
 * @Author GARA
 * @Description SimpleFactory
 * @Date 2020/9/5 16:30
 * @Version V1.0.0
 **/
public class SimpleFactory {

    public static final String type = "human";

    public static Food createFood() {
        Food food = null;
        switch (type) {
            case "human":
                food = new Rice();
                break;
            case "monkey":
                food = new Banana();
                break;
        }

        return food;
    }

    public static Vehicle createVehicle() {
        Vehicle vehicle = null;
        switch (type) {
            case "human":
                vehicle = new Aircraft();
                break;
            case "monkey":
                vehicle = new Bicycle();
                break;
        }

        return vehicle;
    }
}
