package com.designpattern.factoryabstract.entity;

public class DellKeybo implements Keybo {
    @Override
    public void type() {
        System.out.println("Keyboard [DELL] is typed!");
    }

    @Override
    public void getEquipmentInfo() {
        System.out.println("Keyboard [DELL]");
    }
}
