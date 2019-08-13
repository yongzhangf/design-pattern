package com.designpattern.factoryabstract.factory;

import com.designpattern.factoryabstract.entity.DellKeybo;
import com.designpattern.factoryabstract.entity.DellMouse;
import com.designpattern.factoryabstract.entity.Keybo;
import com.designpattern.factoryabstract.entity.Mouse;

public class DellFactory extends PcFactory {

    @Override
    public Mouse createMouse() {
        return new DellMouse();
    }

    @Override
    public Keybo createKeybo() {
        return new DellKeybo();
    }
}
