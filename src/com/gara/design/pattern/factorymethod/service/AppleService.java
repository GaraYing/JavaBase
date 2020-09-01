package com.gara.design.pattern.factorymethod.service;

import com.gara.design.pattern.factorymethod.FruitService;
import com.gara.design.pattern.factorymethod.factory.AppleFactory;
import com.gara.design.pattern.factorymethod.factory.FruitFactory;

public class AppleService extends FruitService {
    @Override
    protected FruitFactory getFruitFactory() {
        return new AppleFactory();
    }
}
