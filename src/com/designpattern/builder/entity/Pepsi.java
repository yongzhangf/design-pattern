package com.designpattern.builder.entity;

public class Pepsi extends ColdDirnk {

    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 30.0f;
    }
}
