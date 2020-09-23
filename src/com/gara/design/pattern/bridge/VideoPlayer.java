package com.gara.design.pattern.bridge;

import com.gara.design.pattern.bridge.service.OperateSystem;
import com.gara.design.pattern.bridge.service.Video;

/**
 * 适配器
 */
public class VideoPlayer implements Video {

    public final OperateSystem operateSystem;

    public VideoPlayer(OperateSystem operateSystem) {
        this.operateSystem = operateSystem;
    }

    @Override
    public void playVideo() {
        operateSystem.playVideo();
    }
}
