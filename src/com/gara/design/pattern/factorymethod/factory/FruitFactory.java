package com.gara.design.pattern.factorymethod.factory;

import com.gara.design.pattern.factorymethod.bean.Fruit;

/**
 * @Author GARA
 * @Description FruitFactory
 * @Date 2020/8/30 23:31
 * @Version V1.0.0
 **/
public interface FruitFactory {
    /**
     * 创建水果
     * @return
     */
    public Fruit create();
}
