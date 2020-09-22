package com.gara.design.pattern.builder;


/**
 * @description: 测试主类
 * @author:  GaraYing
 * @createTime: 2020/9/12 18:01
 * @version: 1.0
**/
public class Main {

    public static void main(String[] args) {
        KFCWaiter kfcWaiter = new KFCWaiter();
        kfcWaiter.setBuilder(new SubMealBuilderMealA());
        kfcWaiter.constructKFC();
    }
}