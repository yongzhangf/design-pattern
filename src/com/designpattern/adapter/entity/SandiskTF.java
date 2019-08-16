package com.designpattern.adapter.entity;

public class SandiskTF implements TFCard {

    @Override
    public String readTF() {
        return "Read a message from SanDisk TF card.";
    }

    @Override
    public void writeTF(String message) {
        System.out.println(String.format("Write message[%s] to SanDisk SD card.", message));
    }
}
