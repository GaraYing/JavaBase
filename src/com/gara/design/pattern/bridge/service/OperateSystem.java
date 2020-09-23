package com.gara.design.pattern.bridge.service;

/**
 * @description: 抽象类依赖实现类
 * @author:  GaraYing
 * @createTime: 2020/9/23 11:26 
 * @version: 1.0
**/
public abstract class OperateSystem {

    protected Video video;

    public OperateSystem(Video video) {
        this.video = video;
    }

    public abstract void playVideo();
}
