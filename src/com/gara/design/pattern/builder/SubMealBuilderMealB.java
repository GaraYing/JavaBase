package com.gara.design.pattern.builder;

public class SubMealBuilderMealB extends MealBuilder {
    @Override
    public void buildFood() {
        meal.setFood("鸡腿");
        System.out.println("这是要加鸡腿的汉堡……");
    }

    @Override
    public void buildDrink() {
        meal.setDrink("雪碧");
        System.out.println("这是要大杯雪碧……");
    }

    @Override
    public Meal getMeal() {
        return super.getMeal();
    }
}
