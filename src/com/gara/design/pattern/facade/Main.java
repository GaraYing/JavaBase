package com.gara.design.pattern.facade;

/**
 * 装饰模式：封装复杂的接口使其简单化
 * 适配器模式：把已有的接口转换成客户端需要的方式
 */
public class Main {

    public static void main(String[] args) {
        SubSystem subSystem = new SubSystem();
        Facade facade = new Facade(subSystem);
        facade.startSystem();
        facade.stopSystem();
    }
}
