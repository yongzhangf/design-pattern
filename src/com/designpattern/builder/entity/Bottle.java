package com.designpattern.builder.entity;

public class Bottle implements Packing {

    @Override
    public String pack() {
        return "Bottle";
    }
}
