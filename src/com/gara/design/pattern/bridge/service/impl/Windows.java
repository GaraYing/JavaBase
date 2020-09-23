package com.gara.design.pattern.bridge.service.impl;

import com.gara.design.pattern.bridge.service.OperateSystem;
import com.gara.design.pattern.bridge.service.Video;

public class Windows extends OperateSystem {

    public Windows(Video video) {
        super(video);
    }

    @Override
    public void playVideo() {
        System.out.println("windows start to play...");
        video.playVideo();
    }
}
