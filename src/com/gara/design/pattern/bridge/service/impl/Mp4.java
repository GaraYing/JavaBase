package com.gara.design.pattern.bridge.service.impl;

import com.gara.design.pattern.bridge.service.Video;

public class Mp4 implements Video {
    @Override
    public void playVideo() {
        System.out.println("mp4 playing *********");
    }
}
