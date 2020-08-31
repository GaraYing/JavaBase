package com.gara.design.pattern.abstactfactory.monkey;

import com.gara.design.pattern.abstactfactory.Food;

public class Banana implements Food {
    @Override
    public void taste() {
        System.out.println("Banana tastes so good....");
    }
}
