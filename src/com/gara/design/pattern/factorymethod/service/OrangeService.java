package com.gara.design.pattern.factorymethod.service;

import com.gara.design.pattern.factorymethod.FruitService;
import com.gara.design.pattern.factorymethod.factory.FruitFactory;
import com.gara.design.pattern.factorymethod.factory.OrangeFactory;

public class OrangeService extends FruitService {
    @Override
    protected FruitFactory getFruitFactory() {
        return new OrangeFactory();
    }
}
