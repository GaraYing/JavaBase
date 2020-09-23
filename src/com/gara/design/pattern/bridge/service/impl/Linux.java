package com.gara.design.pattern.bridge.service.impl;

import com.gara.design.pattern.bridge.service.OperateSystem;
import com.gara.design.pattern.bridge.service.Video;

public class Linux extends OperateSystem {

    public Linux(Video video) {
        super(video);
    }

    @Override
    public void playVideo() {
        System.out.println("linux start to play...");
        video.playVideo();
    }
}
