package com.designpattern.singleton;

public class BaseSingleton {

    protected String mode;

    public void sayHi() {
        if (mode != null && !mode.isEmpty()) {
            System.out.println(String.format("[%s]Hello world!", mode));
        } else {
            System.out.println("Hello world!");
        }
    }
}
