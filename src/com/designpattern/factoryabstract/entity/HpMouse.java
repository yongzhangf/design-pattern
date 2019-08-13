package com.designpattern.factoryabstract.entity;

public class HpMouse implements Mouse {

    @Override
    public void move() {
        System.out.println("Mouse [HP] is moved!");
    }

    @Override
    public void getEquipmentInfo() {
        System.out.println("Mouse [HP]");
    }
}
