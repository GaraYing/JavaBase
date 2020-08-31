package com.gara.design.pattern.abstactfactory.human;

import com.gara.design.pattern.abstactfactory.AbstractFactory;
import com.gara.design.pattern.abstactfactory.Food;
import com.gara.design.pattern.abstactfactory.Vehicle;

public class HumanFactory extends AbstractFactory {

    @Override
    public Food createFood() {
        return new Rice();
    }

    @Override
    public Vehicle createVehicle() {
        return new Aircraft();
    }
}
