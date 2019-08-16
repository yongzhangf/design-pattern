package com.designpattern.adapter.entity;

public interface Computer {

    String readSD();
    void writeSD(String message);
    void connectSD(SDCard sdCard);
}
