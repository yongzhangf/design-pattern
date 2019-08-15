package com.designpattern.builder.entity;

public abstract class ColdDirnk implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
