package com.gara.design.pattern.builder;

/**
 * @description: abstract builder
 * @author:  GaraYing
 * @createTime: 2020/9/21 19:47
 * @version: 1.0
**/
public abstract class MealBuilder {

    protected Meal meal = new Meal();

    void buildFood(){}

    void buildDrink(){}

    Meal getMeal(){
        return meal;
    }
}
