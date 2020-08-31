package com.gara.design.pattern.abstactfactory.human;

import com.gara.design.pattern.abstactfactory.Food;

/**
 * @description:
 * @author:  GaraYing
 * @createTime: 2020/8/31 17:21
 * @Version: 1.0
**/
public class Rice implements Food {
    @Override
    public void taste() {
        System.out.println("Rice tastes full....");
    }
}
