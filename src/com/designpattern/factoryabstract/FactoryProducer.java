package com.designpattern.factoryabstract;

import com.designpattern.factoryabstract.factory.DellFactory;
import com.designpattern.factoryabstract.factory.HPFactory;
import com.designpattern.factoryabstract.factory.PcFactory;

class FactoryProducer {

    static PcFactory getFactory(String manufacturer) {

        if ("DELL".equalsIgnoreCase(manufacturer)) {
            return new DellFactory();

        } else if ("HP".equalsIgnoreCase(manufacturer)) {
            return new HPFactory();
        }

        return new DellFactory();
    }
}
