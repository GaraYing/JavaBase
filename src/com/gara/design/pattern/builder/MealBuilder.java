package com.gara.design.pattern.builder;

public abstract class MealBuilder {

    protected Meal meal = new Meal();

    void buildFood(){}

    void buildDrink(){}

    Meal getMeal(){
        return meal;
    }
}
