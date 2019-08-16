package com.designpattern.adapter.entity;

public class ThinkPad implements Computer {

    private SDCard sdCard;

    @Override
    public String readSD() {
        if (sdCard == null) {
            return "Could not find memory card.";
        }
        return sdCard.readSD();
    }

    @Override
    public void writeSD(String message) {
        if (sdCard == null) {
            System.out.println("Could not find memory card.");
            return;
        }

        sdCard.writeSD(message);
    }

    @Override
    public void connectSD(SDCard sdCard) {
        this.sdCard = sdCard;
    }
}
