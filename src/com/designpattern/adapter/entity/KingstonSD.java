package com.designpattern.adapter.entity;

public class KingstonSD implements SDCard {

    @Override
    public String readSD() {
        return "Read a message from Kingston SD card.";
    }

    @Override
    public void writeSD(String message) {
        System.out.println(String.format("Write message[%s] to Kingston SD card.", message));
    }
}
