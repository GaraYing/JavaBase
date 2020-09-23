package com.gara.design.pattern.bridge.service.impl;

import com.gara.design.pattern.bridge.service.Video;

public class Avi implements Video {
    @Override
    public void playVideo() {
        System.out.println("avi playing *********");
    }
}
