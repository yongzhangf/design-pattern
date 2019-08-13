package com.designpattern.factoryabstract.factory;

import com.designpattern.factoryabstract.entity.Keybo;
import com.designpattern.factoryabstract.entity.Mouse;

public abstract class PcFactory {

    public abstract Mouse createMouse();
    public abstract Keybo createKeybo();
}
