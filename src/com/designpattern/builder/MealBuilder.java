package com.designpattern.builder;

import com.designpattern.builder.entity.*;

public class MealBuilder {

    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());

        return meal;
    }

    public Meal prepareNoVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());

        return meal;
    }
}
