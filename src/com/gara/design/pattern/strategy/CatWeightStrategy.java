package com.gara.design.pattern.strategy;

import com.gara.design.pattern.strategy.bean.Cat;

/**
 * @Author GARA
 * @Description CatWeightStrategy
 * @Date 2020/8/26 23:09
 * @Version V1.0.0
 **/
public class CatWeightStrategy implements Comparator<Cat> {
    @Override
    public int compare(Cat o1, Cat o2) {
        return Long.compare(o1.weight, o2.weight);
    }
}
