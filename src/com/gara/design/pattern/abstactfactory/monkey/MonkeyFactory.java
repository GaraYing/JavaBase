package com.gara.design.pattern.abstactfactory.monkey;

import com.gara.design.pattern.abstactfactory.AbstractFactory;
import com.gara.design.pattern.abstactfactory.Food;
import com.gara.design.pattern.abstactfactory.Vehicle;

public class MonkeyFactory extends AbstractFactory {

    @Override
    public Food createFood() {
        return new Banana();
    }

    @Override
    public Vehicle createVehicle() {
        return new Bicycle();
    }
}
