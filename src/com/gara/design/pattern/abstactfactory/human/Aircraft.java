package com.gara.design.pattern.abstactfactory.human;

import com.gara.design.pattern.abstactfactory.Vehicle;

public class Aircraft implements Vehicle {
    @Override
    public void durationTime() {
        System.out.println("Aircraft can last 2 days");
    }
}
