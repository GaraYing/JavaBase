package com.gara.design.pattern.abstactfactory.monkey;

import com.gara.design.pattern.abstactfactory.Vehicle;

public class Bicycle implements Vehicle {
    @Override
    public void durationTime() {
        System.out.println("Bicycle can last 2 hours");
    }
}
