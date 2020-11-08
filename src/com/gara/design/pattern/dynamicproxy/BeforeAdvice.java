package com.gara.design.pattern.dynamicproxy;

/**
 * @Author GARA
 * @Description
 * @Date 2020/11/8 17:40
 * @Version V1.0.0
 **/
public class BeforeAdvice implements IAdvice {
    @Override
    public void exec() {
        System.out.println("before advice executed");
    }
}
