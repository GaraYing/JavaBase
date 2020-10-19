package com.gara.design.pattern.abstactfactory;

/**
 * @Author GARA
 * @Description AbstractFactory
 * @Date 2020/8/30 23:36
 * @Version V1.0.0
 **/
public abstract class AbstractFactory {

    /**
     * 喜欢的食物
     * @return 食物
     */
    protected abstract Food createFood();

    /**
     * 乘坐的交通工具
     * @return 交通工具
     */
    protected abstract Vehicle createVehicle();
}
