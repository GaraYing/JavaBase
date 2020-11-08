package com.gara.design.pattern.flyweight;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FlyWeightFactory {

    private FlyWeightFactory() {
    }

    private static Map<Integer, FlyWeight> mpFlyWeight = new ConcurrentHashMap<>();

    public static synchronized FlyWeight getFlyWeight(Integer key){
        FlyWeight flyWeight = mpFlyWeight.get(key);
        if (flyWeight == null){
            switch (key){
                case 1:
                    flyWeight = new ConcreteFlyWeight();
                    break;
                case 2:
                    flyWeight = new UnSharedConcreteFlyWeight();
                    break;
            }
            mpFlyWeight.put(key, flyWeight);
        }
        return flyWeight;
    }
}
