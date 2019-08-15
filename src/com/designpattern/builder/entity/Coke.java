package com.designpattern.builder.entity;

public class Coke extends ColdDirnk {

    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 30.3f;
    }
}
