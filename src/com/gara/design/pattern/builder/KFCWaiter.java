package com.gara.design.pattern.builder;

public class KFCWaiter {

    private MealBuilder builder;

    public void setBuilder(MealBuilder builder) {
        this.builder = builder;
    }

    void constructKFC() {
        this.builder.buildFood();
        this.builder.buildDrink();
        Meal meal = this.builder.getMeal();

        System.out.println("food: " + meal.getFood());
        System.out.println("drink: " + meal.getDrink());
    }
}