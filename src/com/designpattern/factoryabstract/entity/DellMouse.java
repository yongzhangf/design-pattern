package com.designpattern.factoryabstract.entity;

public class DellMouse implements Mouse {

    @Override
    public void move() {
        System.out.println("Mouse [DELL] is moved!");
    }

    @Override
    public void getEquipmentInfo() {
        System.out.println("Mouse [DELL]");
    }
}
