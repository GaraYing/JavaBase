package com.gara.design.pattern.strategy;

import com.gara.design.pattern.strategy.bean.Dog;

/**
 * @Author GARA
 * @Description Dog排序策略
 * @Date 2020/8/26 23:06
 * @Version V1.0.0
 **/
public class DogStrategy implements Comparator<Dog> {
    @Override
    public int compare(Dog o1, Dog o2) {
        return Long.compare(o1.foot, o2.foot);
    }
}
