package com.designpattern.adapter;

import com.designpattern.adapter.entity.SDCard;
import com.designpattern.adapter.entity.TFCard;

public class TFAdapter implements SDCard {

    private TFCard tfCard;

    public TFAdapter(TFCard tfCard) {
        this.tfCard = tfCard;
    }

    @Override
    public String readSD() {
        return tfCard.readTF();
    }

    @Override
    public void writeSD(String message) {
        tfCard.writeTF(message);
    }
}
