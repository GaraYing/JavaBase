package com.gara.design.pattern.builder;

public class SubMealBuilderMealA extends MealBuilder {
    @Override
    public void buildFood() {
        meal.setFood("汉堡");
        System.out.println("这是要加鸡翅的汉堡……");
    }

    @Override
    public void buildDrink() {
        meal.setDrink("可乐");
        System.out.println("这是要加大杯可乐……");
    }

    @Override
    public Meal getMeal() {
        return super.getMeal();
    }
}
