package com.gara.design.pattern.bridge.service.impl;

import com.gara.design.pattern.bridge.service.Video;

public class Rmvb implements Video {
    @Override
    public void playVideo() {
        System.out.println("rmvb playing *********");
    }
}
