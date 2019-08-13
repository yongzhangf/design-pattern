package com.designpattern.factoryabstract.factory;

import com.designpattern.factoryabstract.entity.HpKeybo;
import com.designpattern.factoryabstract.entity.HpMouse;
import com.designpattern.factoryabstract.entity.Keybo;
import com.designpattern.factoryabstract.entity.Mouse;

public class HPFactory extends PcFactory {

    public Mouse createMouse() {
        return new HpMouse();
    }

    public Keybo createKeybo() {
        return new HpKeybo();
    }
}
