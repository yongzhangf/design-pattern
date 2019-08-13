package com.designpattern.factoryabstract.entity;

public class HpKeybo implements Keybo {

    @Override
    public void type() {
        System.out.println("Keyboard [HP] is typed!");
    }

    @Override
    public void getEquipmentInfo() {
        System.out.println("Keyboard [HP]");
    }
}
